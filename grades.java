package Review.java;

import java.util.*;

public class grades {
	public static final int MAXEXAMGRADES = 100;
    public static int[] examGrades = new int[MAXEXAMGRADES];
    public static int numberOfGrades;
    public static Scanner scnr = new Scanner(System.in);
    public static int readExamGrades(){
   
    System.out.println("Enter a grade : ");
    
    numberOfGrades = 0;
    
    int grade = scnr.nextInt();
    
    while (grade >= 0){
    	examGrades[numberOfGrades] = grade;

    	numberOfGrades++;
    	System.out.println("Enter a grade : ");
    	grade = scnr.nextInt();

    }
    return numberOfGrades;
    
    }
    
    public static int sumOfExamGrades(){
    	int sum = 0;
    	
    	for (int i = 0; i < examGrades.length; i++){
    		sum = sum+examGrades[i];
    		
    	}
    		return sum;
    }
    	
    public static double averageExamGrade(){
    	int sum = sumOfExamGrades();
    	double average = sum/numberOfGrades;
    	
    	return average;
    }
    
    public static int maxExamGrade(){
    	int max = examGrades[0];
    	
    	for (int j  = 0; j < numberOfGrades; j++){
    		if (examGrades[j] > max){
    			max = examGrades[j];
    		}
    	}
    	return max;
    }
    
    public static int indexOfFirstMaxExamGrade(){
    	int max = maxExamGrade();
    	int index = -1;
    	
    	for (int i = 0; i < numberOfGrades; i++){
    		if (examGrades[i] == max){
    			index = i;
    			break;
    		}
    	}
    	return index;
    }
    
    public static int minExamGrade(){
    	int min = examGrades[0];
    	
    	for (int j = 0; j < numberOfGrades; j++){
    		if (examGrades[j] < min){
    			min = examGrades[j];
    		}
    	}
    	return min;
    }
    
    public static int indexOfFirstMinExamGrade(){
    	int min = minExamGrade();
    	int index = -1;
    	
    	for (int i = 0; i < numberOfGrades; i++){
    		if (examGrades[i] == min){
    			index = i;
    			break;
    		}
    	}
    	return index;
    }
    
    public static int numberOfBelowAverageGrades(){
    	double belowAverage = averageExamGrade();
    	int count = 0;
    	
    	for (int i = 0; i < numberOfGrades; i++){
    		if (examGrades[i] < belowAverage){
    			count++;
    		}
    	}
    	
    	return count;
    }
    
    public static int numberOfAboveAverageGrades(){
    	double aboveAverage = averageExamGrade();
    	int count = 0;
    	
    	for (int i = 0; i < numberOfGrades; i++){
    		if (examGrades[i] > aboveAverage){
    			count++;
    		}
    	}
    	return count;
    }
    
    public static void main(String[] args){
    
    	while (readExamGrades() > 0) {
        	System.out.println("Number Of Grades = " + numberOfGrades);
        	System.out.println("Maximum Exam Grade = " + maxExamGrade() + " At Index = " + indexOfFirstMaxExamGrade());
        	System.out.println("Minimum Exam Grade = " + minExamGrade() + " At Index = " + indexOfFirstMinExamGrade());
        	System.out.println("Number Of Below Average Exam Grades = " + numberOfBelowAverageGrades());
        	System.out.println("Number Of Above Average Exam Grades = " + numberOfAboveAverageGrades());
        	System.out.println("");
        	
    	}
    	return;
    }
}