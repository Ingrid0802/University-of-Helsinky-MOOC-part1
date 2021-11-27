/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
import java.util.Scanner;
public class UserInterface {
    
    Scanner scanner;
    GradeStats gradeStats;

    public UserInterface(Scanner scanner, GradeStats gradeStats){
        this.scanner = scanner;
        this.gradeStats = gradeStats;
    }

    public void start(){
        double averagePassing = 0;
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            gradeStats.add(number);
        }
        System.out.println("Point average (all): " + gradeStats.average());

        averagePassing = gradeStats.averageForPassing();
        if(averagePassing == 0.0){
            System.out.println("Point average(passing): - ");
        } else {
            System.out.println("Point average(passing): " + averagePassing);
        }

        System.out.println("Pass percentage: " + gradeStats.passPercentage());
        System.out.println("Grade distribution: ");
        gradeStats.gradeDistribution();

    }

    public void marks(int grade){
        this.gradeStats.add(grade);
    }

    public void average(){
        this.gradeStats.average();
    }

    public void passingAverage(){
        this.gradeStats.averageForPassing();
    }

    public void passingPercentage(){
        this.gradeStats.passPercentage();
    }

    public void gradesToPoints(){
        this.gradeStats.gradeDistribution();
    }
    
}
