package com.org.tav.day8;

//Somewhere in client code ....
public class Demo {


 public static void main(String[] args) {
     // TODO Auto-generated method stub
     RoundHole hole = new RoundHole(5);
     RoundPeg  rpeg = new RoundPeg(5);

     if(hole.fits(rpeg)) {
         System.out.println("Round peg r5 fits round hole r5");
     }
     SquarePeg smallp = new SquarePeg(2);
     SquarePeg largeP = new SquarePeg(20);
     //hole.fits(smallp) wont compile 


     //Adapter solves the problem
     SquarePegAdapter smallpAdp = new SquarePegAdapter(smallp);
     SquarePegAdapter largepAdp = new SquarePegAdapter(largeP);
     if(hole.fits(smallpAdp)) {
         System.out.println("Square peg w2 fits round hole r5");
     }
     if(!hole.fits(largepAdp)) {
         System.out.println("Square peg w20 dose not fits into round hole r5");
     }


 }

}