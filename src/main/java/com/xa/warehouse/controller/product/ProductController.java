package com.xa.warehouse.controller.product;

import com.xa.warehouse.dto.product.ProductCreateDto;
import com.xa.warehouse.dto.product.ProductGetDto;
import com.xa.warehouse.dto.product.ProductUpdateDto;
import com.xa.warehouse.response.Data;
import com.xa.warehouse.service.product.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/products/")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("create/")
    public ResponseEntity<Data<ProductGetDto>> create(@RequestBody ProductCreateDto createDto) {
        return new ResponseEntity<>(new Data<>(service.create(createDto)), HttpStatus.OK);
    }


    @PutMapping("update/")
    public ResponseEntity<Data<ProductGetDto>> update(@RequestBody ProductUpdateDto updateDto) {
        return new ResponseEntity<>(new Data<>(service.update(updateDto)),HttpStatus.OK);
    }

    @GetMapping("get/")
    public ResponseEntity<Data<List<ProductGetDto>>> getAll() {
        return new ResponseEntity<>(new Data<>(service.list()),HttpStatus.OK);
    }



    @GetMapping("get/{id}")
    public ResponseEntity<Data<ProductGetDto>> get(@PathVariable Long id) {
        return new ResponseEntity<>(new Data<>(service.get(id)),HttpStatus.OK);
    }



}











