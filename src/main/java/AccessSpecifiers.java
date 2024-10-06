package main.java;

 public class AccessSpecifiers {

        private String name = "Div";
        private int age = 11;
        String gender = "Female";
        static String firstName = "Sree";

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public static void firstName1() {
            System.out.println("fname :"+firstName);
        }

 }

 class GetDetails {

     public static void main(String args[]){
         AccessSpecifiers obj = new AccessSpecifiers();
         System.out.println("name: "+ obj.getName());
         System.out.println("age :" +  obj.getAge());
         System.out.println("gender :" + obj.gender);
         System.out.println("fname :"+ obj.firstName);
        AccessSpecifiers.firstName1();
     }
 }
