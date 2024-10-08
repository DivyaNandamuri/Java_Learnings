package main.java;
//INTERFACES AND IMPLEMENTATIONS

interface A {
    //public abstract methods
    void show();
    void config();
}

interface B extends A{
    //final and static variables
    int age = 20;
    String area="Chicago";

    //public abstract methods
    void age();
    void area();
}

class Demo implements B{
    public void show(){
        System.out.println("show");
    }
    public void config(){
        System.out.println("config");
    }
    public void age() {
        System.out.println("age");
    }

    public void area(){
        System.out.println("Area");
    }
}

public class interfaces {

        public static void main(String args[]){

            //Obj can access only show , config methods as they are only present in A interface
            A obj; //reference of interface
            obj = new Demo(); //obj of class demo
            System.out.println("Inside A instance");
            obj.show();
            obj.config();
            //obj.age(); //Throws error as age in not a method of A

            //obj1 can access all methods of A , B because of inheritance (B extends A)
            B obj1; //Reference of interface
            obj1 = new Demo(); //obj of class demo
            System.out.println("Inside B instance");
            obj1.age();
            obj1.area();
            obj1.show();
            obj1.config();
        }

}
