package com.xa.warehouse.service;

import com.xa.warehouse.entity.product.Image;
import com.xa.warehouse.repository.ImageRepository;
import org.apache.commons.io.FilenameUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImageService implements BaseService {


    private final String pathUpload = "C:\\Users\\HP\\Desktop\\upload\\";

    private final ImageRepository repository;


    public ImageService(ImageRepository repository) {
        this.repository = repository;
    }

    public Image create(MultipartFile file) {

        try {

            String originalName = file.getOriginalFilename();
            String extension = FilenameUtils.getExtension(originalName);
            String generatedName = System.currentTimeMillis() + "." + extension;
            Path path = Paths.get(pathUpload +  generatedName);

            Files.copy((file.getInputStream()), path);

            String url = "http://localhost:8080/api/v1/image/download/" + generatedName;

            Image image = new Image(
                    null,
                    originalName,
                    generatedName,
                    extension,
                    file.getSize(),
                    path + "",
                    url
            );


            return repository.save(image);

        } catch (Exception e) {
            return null;
        }




    }

    public Resource download(String generatedName){
        Resource resource = null;

        try {
            Path location = Paths.get(pathUpload + generatedName);
            resource = new UrlResource(location.toUri());
            if (resource.exists() || resource.isReadable()) {

                return resource;

            }
        }catch (Exception e) {
            return null;
        }
        return resource;
    }


}
