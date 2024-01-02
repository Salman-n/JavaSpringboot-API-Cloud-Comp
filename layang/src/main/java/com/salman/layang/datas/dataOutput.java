package com.salman.layang.datas;

public class dataOutput extends dataInput{

    private double a,b,res;

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    public Double getRes() {
        return res;
    }

    public void setRes(Double res) {
        this.res = res;
    }
}
