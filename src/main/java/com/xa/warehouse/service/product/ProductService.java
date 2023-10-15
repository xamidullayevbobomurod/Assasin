package com.xa.warehouse.service.product;

import com.xa.warehouse.dto.product.ProductCreateDto;
import com.xa.warehouse.dto.product.ProductGetDto;
import com.xa.warehouse.dto.product.ProductUpdateDto;
import com.xa.warehouse.entity.product.Product;
import com.xa.warehouse.exeption.NotFoundException;
import com.xa.warehouse.mapper.product.ProductMapper;
import com.xa.warehouse.repository.ProductRepository;
import com.xa.warehouse.service.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class ProductService extends AbstractService<ProductMapper, ProductRepository> {

    private final ProductMapper mapper;
    private final ProductRepository repository;


    public ProductService(ProductMapper mapper, ProductRepository repository, ProductRepository repository1, ProductMapper mapper1) {
        super(mapper, repository);
        this.repository = repository1;
        this.mapper = mapper1;
    }


    public ProductGetDto get(Long id) {
        Optional<Product> result = repository.findById(id);
        if (result.isPresent()) {
            return mapper.toGetDTO(result.get());
        }
        throw new NotFoundException(("Uses not found : " + id));
    }



    public ProductGetDto create(ProductCreateDto dto) {
        Product product = mapper.fromCreateDTO(dto);
        product.setExpiredDate(dto.getExpiredDate());
        Product result = repository.save(product);
        if (Objects.isNull(result)) {
            throw new RuntimeException(("Couldn't create product'"));
        }
        return mapper.toGetDTO(result);
    }


    public ProductGetDto update(ProductUpdateDto dto) {
        Optional<Product> byId = repository.findById(dto.getId());
        return mapper.toGetDTO
                (repository.save
                        (mapper.fromUpdateDTO(dto, byId.get())));
    }


    public List<ProductGetDto> list() {
        return mapper.toListDTO(repository.findAll());
    }
}











