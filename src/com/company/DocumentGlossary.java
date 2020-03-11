package com.company;

import java.util.ArrayList;

public class DocumentGlossary extends ArrayList<GlossaryEntry> {
    public DocumentGlossary(){
        super();
    }
    public DocumentGlossary(int l){
        super(l);
    }
    public void foundOrInserted(String word){
        for(int i = 0; i<size(); i++){
            int a = get(i).getWord().compareTo(word);
            if(a==0){
                
            }
        }
    }
    public void addWord(String word, int num){
        if(contains(word)) {
            add(num);
        }
        else{
            "/n" + word + add(num);
        }
    }
}
