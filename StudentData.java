package newproject;

import java.util.Scanner;

class StudentData
 { 
	 static String college="BIT";
	 int roll;
	 String name;
	 double percentage;
	 static int no=1;
	 public void display()
	 {
		 
		 System.out.println("name of student "+no+" "+name);
		 System.out.println("roll of student "+no+" "+roll);
		 System.out.println("percentage of student "+no+" "+percentage); 
		 no++;
	 }
	 
	 public void setData(String nm,int roll,double per)
	 {
		 name=nm;
		this.roll=roll;
		percentage=per; 
	 }
	 public static void main(String[] args)
	 {
		 //String ob="s"+i;
		 
		 StudentData[] ob=new StudentData[3];
		 Scanner sc=new Scanner(System.in);
		 for (int i=0;i<3;i++)
		 {
			 ob[i]=new StudentData();
		 System.out.println("Enter name "+i);
		
		 String nam =sc.next();
		 System.out.println("Enter roll "+i);
		 int rollNo=sc.nextInt();
		 System.out.println("Enter percentage "+i);
		 double perc=sc.nextDouble();
		 ob[i].setData(nam,rollNo,perc);
		 }
		 for (int j=0;j<3;j++)
		 ob[j].display();
		 sc.close();
		  
		 
	 }
	 
 }