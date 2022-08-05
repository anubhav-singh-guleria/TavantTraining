package com.org.tav.day2;

import java.util.Scanner;

public class SkillEmp {
	 int id;
     String name;
     String skill;
     int yoe;

     public SkillEmp(int id,String name,String skill,int yoe) {
         this.id=id;
         this.name=name;
         this.skill=skill;
         this.yoe=yoe;
         // TODO Auto-generated constructor stub
     }
     public void display() {
         System.out.println("Employee id: "+id+" Name: "+name+" Skill: "+skill+" Yoe "+yoe);
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int empid,yoe;
//		String name,skills;
		SkillEmp[] j = new SkillEmp[5];

    //    Scanner sc = new Scanner(System.in);
        j[0]= new SkillEmp(1,"rahul","java",2);
        j[1]= new SkillEmp(2,"Suresh","cpp",1);
        j[2]= new SkillEmp(3,"ram","java",1);
        j[3]= new SkillEmp(4,"Shyam","cpp",2);
        j[4]= new SkillEmp(5,"Danshay","react",1);
        
        
        for(int i=0;i<5;i++) {
            j[i].display();
        }
        int count=0;
        
        for(int i=0;i<5;i++) {
            if(j[i].skill=="java") {
                count+=1;
            
        }
            
           
        }
        System.out.println("The count of java skilled employee "+count);
            
            for(int i=0;i<5;i++) {
                if(j[i].skill=="java") {
                    j[i].display();
                }
                }
		

	}
}


