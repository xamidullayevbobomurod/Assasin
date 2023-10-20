package com.xa.warehouse.service.transaction;

import com.xa.warehouse.dto.transaction.TransactionCreateDto;
import com.xa.warehouse.dto.transaction.TransactionGetDto;
import com.xa.warehouse.dto.transaction.TransactionUpdateDto;
import com.xa.warehouse.entity.product.Product;
import com.xa.warehouse.entity.transaction.SoldProduct;
import com.xa.warehouse.entity.transaction.Transaction;
import com.xa.warehouse.exeption.NotFoundException;
import com.xa.warehouse.mapper.transaction.SoldProductMapper;
import com.xa.warehouse.mapper.transaction.TransactionMapper;
import com.xa.warehouse.repository.ProductRepository;
import com.xa.warehouse.repository.SoldProductRepository;
import com.xa.warehouse.repository.TransactionRepository;
import com.xa.warehouse.service.AbstractService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TransactionService extends AbstractService<TransactionMapper, TransactionRepository> {

    private final SoldProductRepository SoldProductRepository;
    private final SoldProductMapper SalesProductMapper;
    private final ProductRepository productRepository;

    public TransactionService(TransactionMapper mapper, TransactionRepository repository, TransactionRepository transactionRepository, com.xa.warehouse.repository.SoldProductRepository soldProductRepository, TransactionMapper transactionMapper, SoldProductMapper salesProductMapper, ProductRepository productRepository) {
        super(mapper, repository);
        SoldProductRepository = soldProductRepository;
        SalesProductMapper = salesProductMapper;
        this.productRepository = productRepository;
    }





    public TransactionGetDto create(TransactionCreateDto dto) {
        List<Product> products = new ArrayList<Product>();
        List<SoldProduct> soldProducts = new ArrayList<>();

        Transaction transaction = mapper.fromCreateDTO(dto);
        for (SoldProduct s : transaction.getSoldProducts()) {
            Optional<Product> p = productRepository.findById(s.getId());
            if (p.isPresent() && p.get().getStatus().equals("active") && p.get().getAmount() >= s.getAmount() && (p.get().getExpiredDate().isAfter(LocalDate.now()))) {
                Product product = p.get();
                product.setAmount(product.getAmount() - s.getAmount());
                products.add(product);
                s.setId(null);
                soldProducts.add(s);
            } else {
                throw new NotFoundException("Check product please:" + s.getId());
            }
        }
        productRepository.saveAll(products);
        transaction.setSoldProducts(soldProducts);
        Transaction result = repository.save(transaction);
        return mapper.toGetDTO(result);
    }




    public TransactionGetDto update(TransactionUpdateDto dto) {
        // Vazrat Api qo'shish kerak
        return null;
    }

    public TransactionGetDto getById(Long id) {

        Optional<Transaction> o = repository.findById(id);
        if (o.isPresent()) {
            return mapper.toGetDTO(o.get());
        } else {
            throw new NotFoundException("Transaction not found");
        }

    }






    public List<TransactionGetDto> getWithDate(LocalDate s, LocalDate e) {

        LocalDateTime sd = LocalDateTime.of(s, LocalTime.MIDNIGHT);
        LocalDateTime ed = LocalDateTime.of(e, LocalTime.MIDNIGHT);//00:00
        ZonedDateTime sZ = ZonedDateTime.of(sd, ZoneId.of("Asia/Tashkent"));
        ZonedDateTime eZ = ZonedDateTime.of(ed, ZoneId.of("Asia/Tashkent"));

        List<Transaction> result = repository.findByCreatedDate(sZ, eZ);
        return mapper.toListDTO(result);
    }

    
}





