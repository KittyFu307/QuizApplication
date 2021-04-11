package com.example.quize;

import java.util.ArrayList;
import java.util.List;

public class QuestionList {
    public static List<Question> getQuestion(){
        List<Question> list = new ArrayList<>();
        list.add(new Question("Android question","What is Math.round(11.5)","10","11","12","12",1,-1));
        list.add(new Question("Coding question","Java is not an identifier for the following languages","a1","$1","11","11",2,-1));
        list.add(new Question("Java question","Among the integer data types, the one that needs the least memory space is","short","long","byte","byte",3,-1));
        list.add(new Question("Android question","There is a java program whose main class name is a1, so the source file name to save it is ?","a1.java","a1.class","a1","a1.java",4,-1));
        list.add(new Question("Android question","What reflects the parallel mechanism of Java program","Security ","Multithreading","Cross platform","Multithreading",5,-1));
        return list;
    }
}
