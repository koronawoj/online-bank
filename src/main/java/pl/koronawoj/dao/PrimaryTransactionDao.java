package pl.koronawoj.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pl.koronawoj.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
