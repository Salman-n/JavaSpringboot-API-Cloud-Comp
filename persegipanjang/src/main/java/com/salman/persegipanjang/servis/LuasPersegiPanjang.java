package com.salman.persegipanjang.servis;

import org.springframework.stereotype.Service;

@Service
public class LuasPersegiPanjang {
    public double luasHit(double a, double b){
        double hasil = a*b;
        return hasil;
    }
}
