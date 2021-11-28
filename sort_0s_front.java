//move 0s to the front, preserving the order of the non-zeros

import java.util.*;
import java.io.*;

public class Main{
    public static void sort0f(int[]arr){
        int i = arr.length; 
        int j = arr.length;

        while(i == 0){
            if(arr[i] == 0){
                i--;
            }else{
                swap(arr, i , j);
                i--;
                j--;
            }
        }

    }

    public static void print(int[]arr){
        for(int i = 0; ui < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public static void swap(int[]arr, int i, int j){
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        sort0f(arr);
        print(arr);
    }
}

//input - 0 2 0 4 8 3 7 0 8