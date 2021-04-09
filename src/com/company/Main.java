package com.company;
import java.util.Objects;
import java.util.ArrayList;

class Point {
    double x;
    double y;
    double r;
    double theta;
    Point(double x, double y){
        this.x = x;
        this.y = y;
        this.r = Math.sqrt(x*x+y*y);
        if(x>=0&&y>=0)
            this.theta = Math.asin(y/r);
        if(x<0&&y>0)
            this.theta = Math.PI - Math.asin(y/r);
        if(x<=0&&y<=0)
            this.theta = Math.PI - Math.asin(-y/r);
        if(x>0&&y<0)
            this.theta = Math.asin(y/r);
    }
}

class Polynomial {
    int N;
    ArrayList<Double> coefficients= new ArrayList<>();
    double[] Points;
    Polynomial(int N,ArrayList<Double> coefficients){
        this.N = N;
        for (Double coefficient:coefficients) this.coefficients.add(coefficient);
    }
    void FFT(){

    }

}
public class Main {

    public static void main(String[] args) {
    }
}
