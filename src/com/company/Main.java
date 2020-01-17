package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class Main {
Date d1 = new Date();
    public static void main(String[] args) throws  Exception{
        Google google = new Google();
        google.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu ceva");
        String searchTer = scanner.nextLine();
        for (String x: google.siteContent){
            if(x.contains((searchTer))){
                System.out.println("gasit");
            }
        }
    }
}
