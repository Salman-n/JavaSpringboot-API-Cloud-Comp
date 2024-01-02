package com.salman.layang.servis;

import org.springframework.stereotype.Service;

@Service
public class LuasLayang {
    public double luasHit(double a, double b){
        double hasil = (a*b)*0.5;
        return hasil;
}
}
