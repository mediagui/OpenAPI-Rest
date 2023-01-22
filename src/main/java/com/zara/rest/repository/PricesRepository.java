package com.zara.rest.repository;

import com.zara.rest.model.Price;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PricesRepository extends CrudRepository<Price,Integer> {


    Set<Price> getPricesByBrandIdAndProductIdAndStartDate(Integer brandId, Integer productId, String startDate);


}
