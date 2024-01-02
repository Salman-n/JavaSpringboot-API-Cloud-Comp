package com.salman.layang.controller;

import com.salman.layang.datas.dataInput;
import com.salman.layang.datas.dataOutput;
import com.salman.layang.servis.LuasLayang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    @Autowired
    private LuasLayang luasLayang;

    @PostMapping("/hitung")
    public ResponseEntity<dataOutput> luasLayangCalculator(@RequestBody dataInput input){
        double result = luasLayang.luasHit(input.getA(), input.getB());
        dataOutput outs = new dataOutput();
        outs.setA(input.getA());
        outs.setB(input.getB());
        outs.setRes(result);
        return ResponseEntity.ok(outs);
    }
}
