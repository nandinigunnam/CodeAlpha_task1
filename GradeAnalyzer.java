package codeAlpha;

import java.util.ArrayList;
import java.util.Scanner;
public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();

        System.out.println("Enter the grades of each student: ");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Grade for student " + (i + 1) + ": ");
            double grade = sc.nextDouble();
            grades.add(grade);
        }
        double highestScore = computeHighestScore(grades);
        double lowestScore = computeLowestScore(grades);
        double averageScore = computeAverageScore(grades);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Average Score: " + averageScore);
    }
    public static double computeHighestScore(ArrayList<Double> grades) {
        double highestScore = grades.get(0);
        for (double grade : grades) {
            if (grade > highestScore) {
                highestScore = grade;
            }
        }
        return highestScore;
    }
    public static double computeLowestScore(ArrayList<Double> grades) {
        double lowestScore = grades.get(0);
        for (double grade : grades) {
            if (grade < lowestScore) {
                lowestScore = grade;
            }
        }
        return lowestScore;
    }
    public static double computeAverageScore(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}