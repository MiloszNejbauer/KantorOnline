package com.kantorbackend.Kantor.service;

import com.kantorbackend.Kantor.model.CurrencyRate;
import com.kantorbackend.Kantor.repository.CurrencyRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyRateService {

    @Autowired
    private CurrencyRateRepository repository;

    public List<CurrencyRate> getAllRates() {
        return repository.findAll();
    }

    public CurrencyRate getRateByCurrency(String currency) {
        return repository.findByCurrency(currency);
    }

    public CurrencyRate saveRate(CurrencyRate rate) {
        return repository.save(rate);
    }

    public void deleteRate(String id) {
        repository.deleteById(id);
    }
}
