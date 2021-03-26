//Project: Project 7
//Author: Roger H Hayden III
//Desc: Using Documents on desktop
//Version: 1.0
//Last Update: 11/3
import java.io.*;
import java.util.Scanner;


public class GradesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//try - catch for exception
		try {
		//Check if files exists and create it
				//if it exists, open it to APPEND/ADD
				//Save to Desktop
				//False to override
				FileWriter fw = new FileWriter("/Users/rogerhaydeniii/Desktop/gradesOutput.txt", false);
				PrintWriter outputFile = new PrintWriter(fw); 
			
				//Open a file to read from
				File fileReader = new File("/Users/rogerhaydeniii/Desktop/grades.txt");  
				Scanner inputFile = new Scanner(fileReader);  
				
				int grade = 0;
				int totalGrade = 0;
				int gradeCounter = 0;
				
				while(inputFile.hasNext()) {
					//read line from the input file
					grade = inputFile.nextInt();
				
					totalGrade += grade;
					gradeCounter++; 
				}
		
				outputFile.println("Grade Statistics");
				outputFile.println("Total points " + totalGrade);
				outputFile.println("Total Grades " + gradeCounter);
				outputFile.println("Average: " + totalGrade/gradeCounter); 
				
				outputFile.close();
				inputFile.close();
		}catch (FileNotFoundException error) {
			System.out.println("Sorry, I can not find that file."); 
			System.out.println("Error Message: " + error.getLocalizedMessage());	
				
	}
}
}