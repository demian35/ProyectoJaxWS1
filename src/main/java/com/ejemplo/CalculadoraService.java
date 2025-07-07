package com.ejemplo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalculadoraService {
    
    @WebMethod
    public int sumar(int a , int b){
        return a+b;
    }

    @WebMethod
    public int sustracc(int a , int b){
        return a-b;
    }

    @WebMethod 
    public int prod(int a , int b){
        return a*b;
    }

    @WebMethod
    public double div(int a , int b){
        if(b==0){
            throw new IllegalArgumentException("Division entre 0 invalida");
        }
        return a/b;
    }

}
