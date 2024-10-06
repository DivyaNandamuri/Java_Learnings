package main.java;

 public class AccessSpecifiers {

    private String name = "Div";
    private int age = 11;
    String gender = "Female";
    static String firstName = "Sree";

     public void setName(String n){
         name=n;
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
         AccessSpecifiers obj = new AccessSpecifiers();
         obj.setName("Satya");
         obj.setAge(20);

         //access modifers
         System.out.println("name: "+ obj.getName());
         System.out.println("age :" +  obj.getAge());

         //general varibale gender
         System.out.println("gender :" + obj.gender);

         //static variable call using class name
         System.out.println("fname :"+ AccessSpecifiers.firstName);

         //static method call using class name
        AccessSpecifiers.firstName1();
     }
 }
