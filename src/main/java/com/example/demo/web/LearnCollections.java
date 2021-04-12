package com.example.demo.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnCollections {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>(19);
        LinkedList ll = new LinkedList();
        HashMap<String, Integer> hm = new HashMap<String,  Integer>();
        Iterator<String> it = ll.iterator();
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        if(o1.equals(o2)){
            System.out.println("o1 equals o2");
        }
        if(o1.equals(o3)){
            System.out.println("o1 equals o3");
        }
        Integer a  = 1000;
        String b = a.toString();
        System.out.println(b.getClass());
    }
}
