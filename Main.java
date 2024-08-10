package application;
import java.util.Scanner;
import entities.Grade;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("Insert student data: ");
        grade.name = sc.nextLine();
        grade.firstGrade = sc.nextDouble();
        grade.secondGrade = sc.nextDouble();
        grade.thirdGrade = sc.nextDouble();
        
        System.out.printf("FINAL GRADE: %.2f%n", grade.getFinalGrade());
        if (grade.getFinalGrade() > 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f", grade.needToApprove());
            System.out.print(" POINTS");
        }
        sc.close();
    }
}