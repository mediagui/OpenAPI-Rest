package com.zara.rest.controller;

import com.zara.rest.api.PricesApiController;
import com.zara.rest.model.Price;
import com.zara.rest.service.PriceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Set;

@Slf4j
@Controller
public class PricesController extends PricesApiController {

    private PriceService priceService;

    @Override
    public ResponseEntity<Set<Price>> getAllPrices(
            Integer brandId,
            Integer productId,
            @DateTimeFormat(pattern = "yyyy-MM-dd-hh.mm.ss") String startDate) {

        log.debug("--llegamos--");

        return ResponseEntity.of(priceService.getAll(brandId, productId, startDate));
    }

    @Autowired
    public PricesController(NativeWebRequest request, PriceService priceService) {
        super(request);
        this.priceService = priceService;
    }
}
