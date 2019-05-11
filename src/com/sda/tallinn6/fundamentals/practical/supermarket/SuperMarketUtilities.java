package com.sda.tallinn6.fundamentals.practical.supermarket;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SuperMarketUtilities {

    public Double round(Double val) {
        return new BigDecimal(val.toString()).
                setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}