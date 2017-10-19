package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumberAdder extends Thread {

    BufferedReader reader;

    SafeList list;

    public NumberAdder(SafeList list){
        this.list = list;
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        while (true){
            try {
                String number = reader.readLine();
                if ("exit".equalsIgnoreCase(number)){
                    return;
                }
                System.out.println(Parcer.parse(number));
                list.add(Parcer.parse(number));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
