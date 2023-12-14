package basicsDemo;

import java.util.Scanner;

public class BheemJava {
	
		public static void main(String[] args) 

		{

			Scanner reader = new Scanner(System.in);



			int total;

			float avg;



			System.out.print("Enter the First Student Name: ");

			String s1Name = reader.nextLine();

			System.out.print("Enter the First Student Roll Number: ");

			int s1RNo = reader.nextInt();

			System.out.print("Enter the First Student Marks1: ");

			int s1Marks1 = reader.nextInt();

			System.out.print("Enter the First Student Marks2: ");

			int s1Marks2 = reader.nextInt();

			System.out.print("Enter the First Student Marks3: ");

			int s1Marks3 = reader.nextInt();


			reader.nextLine();  
			
			System.out.print("Enter the Second Student Name: ");
		
			String s2Name = reader.nextLine();

			System.out.print("Enter the Second Student Roll Number: ");

			int s2RNo = reader.nextInt();

			System.out.print("Enter the Second Student Marks1: ");

			int s2Marks1 = reader.nextInt();

			System.out.print("Enter the Second Student Marks2: ");

			int s2Marks2 = reader.nextInt();

			System.out.print("Enter the Second Student Marks3: ");

			int s2Marks3 = reader.nextInt();



			System.out.print("Enter the Third Student Name: ");

			String s3Name = reader.nextLine();

			System.out.print("Enter the Third Student Roll Number: ");

			int s3RNo = reader.nextInt();

			System.out.print("Enter the Third Student Marks1: ");

			int s3Marks1 = reader.nextInt();

			System.out.print("Enter the Third Student Marks2: ");

			int s3Marks2 = reader.nextInt();

			System.out.print("Enter the Third Student Marks3: ");

			int s3Marks3 = reader.nextInt();



			System.out.println("Student Name" + s1Name);

			System.out.println("Studetn Rool Number" + s1RNo);

			System.out.println("Student Marks1" + s1Marks1);

			System.out.println("Student Marks2" + s1Marks2);

			System.out.println("Student Marks3" + s1Marks3);

			total=s1Marks1+s1Marks2+s1Marks3;

			avg=total/3;

			if(avg>=35)

				System.out.println("Student " + s1Name + " Passed");

			else

				System.out.println("Student " + s1Name + " Filed");



			System.out.println("Student Name" + s2Name);

			System.out.println("Studetn Rool Number" + s2RNo);

			System.out.println("Student Marks1" + s2Marks1);

			System.out.println("Student Marks2" + s2Marks2);

			System.out.println("Student Marks3" + s2Marks3);

			total=s2Marks1+s2Marks2+s2Marks3;

			avg=total/3;

			if(avg>=35)

				System.out.println("Student " + s2Name + " Passed");

			else

				System.out.println("Student " + s2Name + " Filed");



			System.out.println("Student Name" + s3Name);

			System.out.println("Studetn Rool Number" + s3RNo);

			System.out.println("Student Marks1" + s3Marks1);

			System.out.println("Student Marks2" + s3Marks2);

			System.out.println("Student Marks3" + s3Marks3);

			total=s3Marks1+s3Marks2+s3Marks3;

			avg=total/3;

			if(avg>=35)

				System.out.println("Student " + s3Name + " Passed");

			else

				System.out.println("Student " + s3Name + " Filed");

		}



	

}
