package com.company;

/**
 * Created by ksusha on 19.10.17.
 */
public class NumberRemover implements Runnable {

    SafeList list;

    public NumberRemover(SafeList list){
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(list.removeMin());
        }
    }
}
