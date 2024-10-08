package main.java;
//Implementing Lambda functions for functional interface
//functionalInterface
@java.lang.FunctionalInterface
interface Visible {
    int add(int i, int j);
}


public class FunctionalInterface  {
    public static void main(String args[]) {
        //obj creation for interface implementation (as we can't instantiate the static interface)
        Visible obj = (i,j) -> i+j;
        int sum = obj.add(3,4);
        System.out.println(sum);
    }
}
//Instead of giving new Visible() for functional,it has one method to implement and it can be done
// using Lambda function
