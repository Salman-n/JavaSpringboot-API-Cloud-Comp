package com.salman.persegipanjang.controller;

import com.salman.persegipanjang.datas.dataInput;
import com.salman.persegipanjang.datas.dataOutput;
import com.salman.persegipanjang.servis.LuasPersegiPanjang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    @Autowired
    private LuasPersegiPanjang luasPersegiPanjang;

    @PostMapping("/hitung")
    public ResponseEntity<dataOutput> luasPersegiCalculator(@RequestBody dataInput input){
     double result = luasPersegiPanjang.luasHit(input.getA(), input.getB());
     dataOutput outs = new dataOutput();
     outs.setA(input.getA());
     outs.setB(input.getB());
     outs.setRes(result);
     return ResponseEntity.ok(outs);
    }
}

