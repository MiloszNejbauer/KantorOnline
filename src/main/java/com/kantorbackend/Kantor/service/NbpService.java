package com.kantorbackend.Kantor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService {

    private final RestTemplate restTemplate;

    public NbpService() {
        this.restTemplate = new RestTemplate();
    }

    public String getCurrencyRate(String table, String code) {
        String url = String.format("http://api.nbp.pl/api/exchangerates/rates/%s/%s?format=json", table, code);
        return restTemplate.getForObject(url, String.class);
    }
}
