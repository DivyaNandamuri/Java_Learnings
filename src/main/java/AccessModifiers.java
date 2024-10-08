package main.java;

 public class AccessModifiers {

    private String name;
    private int age;
    String gender;
    static String firstName;

    //constructor
    public AccessModifiers(){
        gender = "Female";
        firstName = "Sree";
    }
    //'this' represents current obj that is calling the setName
     public void setName(String name){
         this.name=name;
     }

     public void setAge(int n){
         age=n;
     }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


    public static void firstName1() {
        System.out.println("first name :"+firstName);
    }

 }

 class GetDetails {

     public static void main(String args[]){
         //instance class call using object
         AccessModifiers obj = new AccessModifiers();
         obj.setName("Satya");
         obj.setAge(20);

         //access modifers
         System.out.println("name: "+ obj.getName());
         System.out.println("age :" +  obj.getAge());

         //general varibale gender
         System.out.println("gender :" + obj.gender);

         //static variable call using class name
         System.out.println("fname :"+ AccessModifiers.firstName);

         //static method call using class name
         AccessModifiers.firstName1();
     }
 }
