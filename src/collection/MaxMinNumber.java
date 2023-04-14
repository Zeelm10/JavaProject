package collection;

import javafx.beans.binding.Bindings;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinNumber {
    public static void main(String args[])
    {
        // initializing the ArrayList elements
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(40);
        arr.add(30);

        System.out.println("Elements of Arraylist:"+arr);

        int min = arr.get(0);
        int max = arr.get(0);

        // store the length of the ArrayList in variable n
        int n = arr.size();
        System.out.println("Size of an array:"+n);

        // loop to find minimum from ArrayList
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }

        // loop to find maximum from ArrayList
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        // The result will be printed
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);

        MaxMinNumber mn = new MaxMinNumber();
        mn.minmax();
    }

    public void minmax(){
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(7);
        ar.add(6);
        ar.add(3);

        System.out.println("Elements of Arraylist:"+ar);

        int n = ar.size();
        System.out.println("Size of Array:"+n);

        for (int i=0; i<n; i++){
            System.out.println(ar.get(i)+ "");
        }
        //find min & max number

        int max = Collections.max(ar);
        System.out.println("Maximum is : " + max);

        int min = Collections.min(ar);
        System.out.println("Minimum is : " + min);
    }
}
