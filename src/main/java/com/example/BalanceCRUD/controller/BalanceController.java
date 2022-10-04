package com.example.BalanceCRUD.controller;

import com.example.BalanceCRUD.model.Balance;
import com.example.BalanceCRUD.repo.BalanceRepo;
import com.example.BalanceCRUD.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/balance")
@CrossOrigin(origins = "*")
public class BalanceController {

    @Autowired
    private BalanceRepo br;

    @Autowired
    private BalanceService bs;

    @Autowired
    private BalanceController(BalanceRepo br, BalanceService bs){
        this.br = br;
        this.bs = bs;
    }

    @GetMapping("/productId")
    public ResponseEntity<Balance> getByProductId(@RequestParam int productId){
        return new ResponseEntity<>(bs.getByProductId(productId), HttpStatus.ACCEPTED);
    }

    @GetMapping("/locationId")
    public ResponseEntity<List<Balance>> getByLocationId(@RequestParam int locationId){
        return new ResponseEntity<>(bs.getByLocationId(locationId), HttpStatus.ACCEPTED);
    }

    @GetMapping("/amount")
    public ResponseEntity<List<Balance>> getByBalance(@RequestParam int balance){
        return new ResponseEntity<>(bs.getByBalance(balance), HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Balance>> getAll(){
        return new ResponseEntity<>(bs.getAll(),HttpStatus.ACCEPTED);
    }

}
