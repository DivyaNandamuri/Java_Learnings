package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputScanner  {
    public static void main(String args[]) throws IOException{

        System.out.println("Enter a number");

        //bufferedReader to get input from user
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//        int num = Integer.parseInt(bf.readLine());
//        System.out.println(num);
//        bf.close();

        //scanner class to get input from user
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);

    }
}

