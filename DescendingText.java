/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zer0leet;

import java.util.*;

/**
 *
 * @author Deepika
 */
public class DescendingText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for (String str : arraylist) {
            System.out.println(str);
        }

        /* Sorting in decreasing order*/
        Collections.sort(arraylist, Collections.reverseOrder());

        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for (String str : arraylist) {
            System.out.println(str);
        }
    }
}
}
 
