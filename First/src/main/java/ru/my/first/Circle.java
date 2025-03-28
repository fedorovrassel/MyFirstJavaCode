package ru.my.first;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {

    public int r;

    public Circle (int r){
        this.r = r;
    }

    public double area(){
        BigDecimal b = new BigDecimal(Math.PI * this.r * this.r);
        return b.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
