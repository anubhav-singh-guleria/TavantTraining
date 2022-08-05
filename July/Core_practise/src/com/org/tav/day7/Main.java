package com.org.tav.day7;

@FunctionalInterface
interface Myinterface{
    double getPiValue();
}
interface Myinterface2
{
    String reverse(String n);
}

interface GenericInter<T>
{
	T fun(T t);
}
public class Main {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      //declare ref of myinterface 
        Myinterface  ref= ()-> 3.14;
        System.out.println("Value of pi = "+ref.getPiValue());
        
        GenericInter<Integer> g=(cu)->
        {
        	return cu*cu*cu;
        };
        
        System.out.println("The cube "+g.fun(2));



        Myinterface2 ref2 = (str)->{String result="" ; 
            for(int i =str.length()-1;i>=0;i--)
                                        result +=str.charAt(i); return result;};
        System.out.println("String reversed =  "+ref2.reverse("Functional"));
    }
 
}