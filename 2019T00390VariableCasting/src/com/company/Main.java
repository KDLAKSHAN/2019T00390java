package com.company;

public class Main {

    public static void main(String[] args) {
	int valueA=20,valueB=30,valueC=40;
    int SumInt=valueA+valueB+valueC;
    double sumDouble=(double) valueA+(double) valueB+ (double) valueC;
    System.out.println(SumInt);
    System.out.println(sumDouble);

    double div=3.5;
    int avgInt= SumInt/ (int)div;
    double avgIntDouble= SumInt/div;
    double avgDouble= sumDouble / div;
    float a= (float)2.5;
        System.out.println(avgInt);
        System.out.println(avgDouble);
        System.out.println(avgIntDouble);
        System.out.println(a);
    }



    }

