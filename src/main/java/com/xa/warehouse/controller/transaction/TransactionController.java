package com.xa.warehouse.controller.transaction;

import com.xa.warehouse.dto.transaction.TransactionCreateDto;
import com.xa.warehouse.dto.transaction.TransactionGetDto;
import com.xa.warehouse.dto.transaction.TransactionUpdateDto;
import com.xa.warehouse.response.Data;
import com.xa.warehouse.service.transaction.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/transaction")
public class TransactionController {

    private TransactionService transactionService;

    @PostMapping("create/")
    public ResponseEntity<Data<TransactionGetDto>> create(@RequestBody TransactionCreateDto createDto) {
        return new ResponseEntity<>(new Data<>(transactionService.create(createDto)), HttpStatus.OK);

    }

    @PutMapping("update/")
    public ResponseEntity<Data<TransactionGetDto>> update(@RequestBody TransactionUpdateDto updateDto) {
        return new ResponseEntity<>(new Data<>(transactionService.update(updateDto)), HttpStatus.OK);
    }

    @GetMapping("get/")
    public ResponseEntity<Data<TransactionGetDto>> get(@PathVariable Long id) {
        return new ResponseEntity<>(new Data<>(transactionService.getById(id)), HttpStatus.OK);
    }

}


