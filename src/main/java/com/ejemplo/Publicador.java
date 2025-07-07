package com.ejemplo;

import javax.xml.ws.Endpoint;

//clase que expondra nuestro servicio de calculadora
public class Publicador {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/calculadora";
        Endpoint.publish(url, new CalculadoraService());
        System.out.println("Servicio publicado en: " + url + "?wsdl");
    }
}
