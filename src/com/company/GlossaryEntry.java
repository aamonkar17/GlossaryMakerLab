package com.company;

import java.util.ArrayList;

public class GlossaryEntry {
    private String word;
    private ArrayList<Integer> numsList;
    public GlossaryEntry(String w){
        w.toUpperCase();
        word = w;
        numsList = new ArrayList<>();
    }
    public void add(int num){
        if(numsList.contains(num) == false)
                numsList.add(num);
        }
    public String getWord(){
        return word;
    }
    public String toString(){
        String a = " ";
        for(int i=0; i<numsList.size(); i++){
            a += numsList.get(i) + " ";
        }
        return word + a;
    }
}
/*
Results:
        Hello 5 7 12

 */