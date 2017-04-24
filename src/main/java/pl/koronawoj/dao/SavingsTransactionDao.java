package pl.koronawoj.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pl.koronawoj.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

