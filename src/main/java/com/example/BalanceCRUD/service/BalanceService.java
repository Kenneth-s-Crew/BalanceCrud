package com.example.BalanceCRUD.service;

import com.example.BalanceCRUD.model.Balance;
import com.example.BalanceCRUD.repo.BalanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceService {

    private final BalanceRepo br;

    @Autowired
    public BalanceService(BalanceRepo br){
        this.br = br;
    }

    public Balance getByProductId(int productId) {
        return br.findByProductId(productId);
    }

    public List<Balance> getByLocationId(int locationId) {
        return br.findByLocationId(locationId);
    }

    public List<Balance> getByBalance(int balance) {
        return br.findByBalance(balance);
    }

    public List<Balance> getAll() {
        return br.findAll();
    }

}
