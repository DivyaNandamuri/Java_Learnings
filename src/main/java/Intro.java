package main.java;
//adding two numbers

class Calculate{
    public int add1(int a , int b){
        return a+b;
    }
}

public class Intro {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        //Calling add from other class Calculate
        Calculate cal = new Calculate();
        int sum1 = cal.add1(num1,num2);
        //Calling add method from same class using static keyword
        int sum2 = add(num1,num2);
        System.out.println("sum1 :" + sum1);
        System.out.println("sum2 :" + sum2);
    }

    public static int add(int a , int b){
        return a+b;
    }

}