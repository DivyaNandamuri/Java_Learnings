package main.java;

import java.util.Random;

//initialising array and printing it
public class Arrays {

    public static void main(String args[]) {
        int num[] = new int[2];
        int count=1;
        for (int i =0;i<num.length; i++) {
            num[i]=count;
            count++;
            System.out.println(num[i]);
        }

        //multi-dimensional array
        int num1[][] = new int[2][3];
        for (int i=0;i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){
                num1[i][j] = (int)(Math.random()*1000);
                System.out.print(num1[i][j]+ " ");
            }
            System.out.println();
        }

        //multi dimenisonl other form of looping
        for(int n[] : num1){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }


}
