package com.xa.warehouse.controller.image;

import com.xa.warehouse.dto.image.ImageGetDto;
import com.xa.warehouse.entity.image.Image;
import com.xa.warehouse.response.Data;
import com.xa.warehouse.service.image.ImageService;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v1/images/")
public class ImageController {
    private final ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }

    @PostMapping("upload/")
    public ResponseEntity<Data<ImageGetDto>> uploadPhoto(MultipartFile file) {

        return new ResponseEntity<>(new Data<>(service.create(file)), HttpStatus.OK);
    }



    @GetMapping("download/{generatedName}")
    public ResponseEntity<Resource> downloadImage(@PathVariable String generatedName) {

        Resource file = service.download(generatedName);

        return ResponseEntity.ok().header(
                HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\""
        ).body(file);

    }




    @DeleteMapping("/delete/{imageName}")
    public ResponseEntity<String> deleteImage(@PathVariable String imageName) {
        try {
            service.deleteImage(imageName);
            return ResponseEntity.ok("Image deleted successfully!");

        } catch (Exception e) {
            return ResponseEntity.status(500).body("Image deletion failed: " + e.getMessage());
        }
    }

}
