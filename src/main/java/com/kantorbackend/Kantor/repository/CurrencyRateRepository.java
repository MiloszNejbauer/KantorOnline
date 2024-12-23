package com.kantorbackend.Kantor.repository;

import com.kantorbackend.Kantor.model.CurrencyRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRateRepository extends MongoRepository<CurrencyRate, String> {
    // Możesz dodać własne metody wyszukiwania, np.:
    CurrencyRate findByCurrency(String currency);
}
