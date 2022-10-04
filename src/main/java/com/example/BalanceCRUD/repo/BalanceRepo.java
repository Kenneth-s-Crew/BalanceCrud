package com.example.BalanceCRUD.repo;

import com.example.BalanceCRUD.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BalanceRepo extends JpaRepository<Balance, Integer> {

    Balance findByProductId(int productId);

    List<Balance> findByLocationId(int locationId);

    List<Balance> findByBalance(int balance);

    List<Balance> findAll();

}
