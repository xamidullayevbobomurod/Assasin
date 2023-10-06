package com.xa.warehouse.conroller;

import com.xa.warehouse.entity.product.Image;
import com.xa.warehouse.service.ImageService;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v1/image/")
public class ImageController {


    private final ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }

    @PostMapping("upload/")
    public Image uploadPhoto(MultipartFile file) {

        return service.create(file);

    }

    @GetMapping("download/{generatedName}")
    public ResponseEntity<Resource> downloadPhoto(@PathVariable String generatedName) {

        Resource file = service.download(generatedName);

        return ResponseEntity.ok().header(
                HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\""
        ).body(file);


    }


}
