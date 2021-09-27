package main;

public class main {

    public static void main(String[] args){
        int num1 = 20;
        int num2 = 50;

        System.out.println("Before: "+num1+" and "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After: "+num1+" and "+num2);
    }
}
