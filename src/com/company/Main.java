/**
 * this is a story of my...
 */

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //one hundred sixty two  1 6 2
    // one thousand three hundred fifty one 1351
    public static void main(String[] args) throws IOException {

        SafeList list = new SafeList();
        NumberAdder numberAdder = new NumberAdder(list);

        NumberRemover numberRemover = new NumberRemover(list);
        Thread thread = new Thread(numberRemover);

//        numberAdder.setDaemon(true);
        thread.setDaemon(true);

        numberAdder.start();
        thread.start();


    }


}
