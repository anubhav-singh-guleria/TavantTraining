package com.org.tav.day2;



	class Protein {
		  public void disp() {
		    System.out.println("Protein is one of the basic building block of human bodies ");
		  }
		}
		
		class Source extends Protein {
		  public void disp() {
		    System.out.println("Sources of protein are ,ilk,eggs,pulses,soybeans ");
		  }
		}
	class HandOnProtein {
		  public void main(String[] args) {
			  Protein myProtein = new Protein();  // Create a Shapes object
			 
			  Protein mySource = new Source();  // Create a Circle object
		    myProtein.disp();
		    
		    mySource.disp();
		    
		  }
		}


