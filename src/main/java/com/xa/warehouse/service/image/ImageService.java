package com.xa.warehouse.service.image;


import com.xa.warehouse.dto.image.ImageGetDto;
import com.xa.warehouse.entity.image.Image;
import com.xa.warehouse.mapper.image.ImageMapper;
import com.xa.warehouse.repository.ImageRepository;
import com.xa.warehouse.service.AbstractService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImageService extends AbstractService<ImageMapper, ImageRepository> {
    private final String pathUpload = "C:\\Users\\abulfayz\\Desktop\\uploads\\";

    public ImageService(ImageMapper mapper, ImageRepository repository) {
        super(mapper, repository);
    }

    public ImageGetDto create(MultipartFile file) {

        try {

            String originalName = file.getOriginalFilename();
            String extension = FilenameUtils.getExtension(originalName);
            String generatedName = System.currentTimeMillis() + "." + extension;
            Path path = Paths.get(pathUpload + generatedName);

            Files.copy((file.getInputStream()), path);

            String url = "http://localhost:8080/api/v1/images/download/" + generatedName;

            Image image = new Image(
                    originalName,
                    generatedName,
                    extension,
                    file.getSize(),
                    path + "",
                    url

            );


            return mapper.toGetDTO(repository.save(image));

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
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
            throw new RuntimeException(e.getMessage());
        }
        return resource;
    }








    public void deleteImage(String imageName) {
        try {
            Path path = Path.of(URI.create(pathUpload+imageName));
            Files.deleteIfExists(path);

        } catch (Exception e) {
            throw new RuntimeException("Failed to delete image: " + imageName);
        }
    }














}
