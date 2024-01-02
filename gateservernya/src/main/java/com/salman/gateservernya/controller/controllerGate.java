package com.salman.gateservernya.controller;

import com.salman.gateservernya.datas.resDatas;
import com.salman.gateservernya.datas.tfDatas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controllerGate {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/{a}/{b}/{jenisop}") // Corrected mapping pattern
    public ResponseEntity<resDatas> endPointCalculator(
            @PathVariable("a") double a,
            @PathVariable("b") double b,
            @PathVariable("jenisop") String operation
    ) {
        ServiceInstance si;
        tfDatas tf = new tfDatas();
        tf.setA(a);
        tf.setB(b);
        switch (operation) {
            case "luaslayang":
                si = loadBalancerClient.choose("luas-layang-service-server");
                break;
            case "luaspersegipanjang":
                si = loadBalancerClient.choose("luas-persegi-panjang-service-server");
                break;
            case "luassegitiga":
                si = loadBalancerClient.choose("luas-segitiga-service-server");
                break;
            default:
                si = loadBalancerClient.choose("luas-layang-service-server");
                break;
        }
        String urlnyaterpilih = si.getUri().toString();
        String urlBase = urlnyaterpilih + "/hitung";
        RestTemplate rt = new RestTemplate();
        ResponseEntity<resDatas> ress = rt.postForEntity(urlBase, tf, resDatas.class);
        resDatas rd = ress.getBody();

        return ResponseEntity.ok(rd);
    }
}












