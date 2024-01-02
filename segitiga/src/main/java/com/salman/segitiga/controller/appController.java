package com.salman.segitiga.controller;

import com.salman.segitiga.datas.dataInput;
import com.salman.segitiga.datas.dataOutput;
import com.salman.segitiga.servis.LuasSegitiga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    @Autowired
    private LuasSegitiga luasSegitiga;
    @PostMapping("/hitung")
    public ResponseEntity<dataOutput> luasSegitigaCalculator(@RequestBody dataInput input){
        double result = luasSegitiga.luasHit(input.getA(), input.getB());
        dataOutput outs = new dataOutput();
        outs.setA(input.getA());
        outs.setB(input.getB());
        outs.setRes(result);
        return ResponseEntity.ok(outs);
    }
}
