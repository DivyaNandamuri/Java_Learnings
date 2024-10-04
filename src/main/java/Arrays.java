package main.java;

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
    }


}
