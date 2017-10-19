package com.company;


import java.util.LinkedList;
import java.util.List;


public class SafeList {

    List<Integer> list = new LinkedList<>();
    Integer min = Integer.MAX_VALUE;


    public void add(Integer num) {
        synchronized (list){
            list.add(num);
        }
        min = Math.min(num, min);
    }

    public Integer removeMin() {
        Integer oldMin = min;
        synchronized (list){
            list.remove(min);
            min = getMin();
        }
        return oldMin;
    }

    private Integer getMin() {
        Integer newMin = Integer.MAX_VALUE;
        for (Integer min: list){
            newMin = Math.min(newMin, min);
        }
        return newMin;
    }
}
