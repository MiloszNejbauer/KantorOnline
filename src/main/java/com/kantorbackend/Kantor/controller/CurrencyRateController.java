package com.kantorbackend.Kantor.controller;

import com.kantorbackend.Kantor.model.CurrencyRate;
import com.kantorbackend.Kantor.service.CurrencyRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/currency")
public class CurrencyRateController {

    @Autowired
    private CurrencyRateService service;

    @GetMapping("/rates")
    public List<CurrencyRate> getAllRates() {
        return service.getAllRates();
    }

    @GetMapping("/{currency}")
    public CurrencyRate getRateByCurrency(@PathVariable String currency) {
        return service.getRateByCurrency(currency);
    }

    @PostMapping
    public CurrencyRate saveRate(@RequestBody CurrencyRate rate) {
        return service.saveRate(rate);
    }

    @DeleteMapping("/{id}")
    public void deleteRate(@PathVariable String id) {
        service.deleteRate(id);
    }
}
