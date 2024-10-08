package main.java;
//throws vs throw exceptions
class Demo1 {
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc"); // class not found then show method throws exception
    }
}


public class ExceptionHandling {
    public static void main(String args[]) {
        Demo1 obj = new Demo1();
        //obj.show();//exception should be handled here in main using try -catch block

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
    }
}


