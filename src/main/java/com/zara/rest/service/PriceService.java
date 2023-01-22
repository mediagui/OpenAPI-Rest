package com.zara.rest.service;

import com.zara.rest.model.Price;
import com.zara.rest.repository.PricesRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class PriceService {

    private PricesRepository pricesRepository;

    public PriceService (PricesRepository pricesRepository) {
        this.pricesRepository = pricesRepository;
    }

    public Optional<Set<Price>> getAll (Integer brandId, Integer productId, String startDate) {
        return  Optional.ofNullable(pricesRepository.getPricesByBrandIdAndProductIdAndStartDate(brandId, productId, startDate));
    }
}
