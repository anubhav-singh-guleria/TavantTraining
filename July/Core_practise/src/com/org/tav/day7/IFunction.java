package com.org.tav.day7;

interface IFuntion{
    void function();
}
 
class LambdaFunction{
    int a ; //class data field
    static int b ; //static field
    //class method 
    void PrintA() {
        System.out.println(" a = "+a);

    }
    //static class method 
    static void PrintB() {
        System.out.println(" b = "+b);
    }
    //method with lambda expression 
    void MethodLambda() {
        //1.lambda expression 
        IFuntion ref = ()->{
            //there is access to all these element 
            a= 8 ; 
            LambdaFunction.b=15;
            PrintA();
            LambdaFunction.PrintB();
        };

        //2.invoke th fuction() method of IFunction interface
        ref.function();
    }
}
 

public class Lambda1 {
 //Client code - calling MethodLambda 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
   LambdaFunction ff = new LambdaFunction();
   ff.MethodLambda();
    }
 
}