/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
import java.util.ArrayList;
public class GradeStats {
     private ArrayList<Integer> grades;

    public GradeStats(){
        this.grades = new ArrayList<>();
    }

    public void add(int grade){
        if(grade >= 0 && grade <= 100){
            grades.add(grade);
        }

    }

    public double average(){
        int sum = 0;
        double average = 0.0;
        for(int grade : grades){
            sum += grade;
            average = sum / grades.size();
        }
        return average;
    }

    public double averageForPassing(){
        int count = 0;
        int sum = 0;
        double average = 0.0;
        for(int grade : grades){
            if(grade >= 50){
                count++;
                sum += grade;
                average = sum / count;
            }
        }
        return average;

    }

    public double passPercentage(){
        int count = 0;
        for(int grade : grades){
            if(grade >= 50){
                count++;
            }
        }
        return ((double) count / grades.size()) * 100;
    }

    public void gradeDistribution(){
        ArrayList<Integer> points = new ArrayList<>();
        for(int grade: grades){
            if(grade < 50){
                points.add(0);
            } else if(grade < 60){
                points.add(1);
            } else if(grade < 70){
                points.add(2);
            } else if( grade < 80){
                points.add(3);
            } else if(grade < 90){
                points.add(4);
            } else if(grade <= 100){
                points.add(5);
            }
        }

        for(int i = 5; i >= 0; i--){
            System.out.println(i + ": " + stars(points,i));
        }

    }

    private String stars(ArrayList<Integer>points, int number){
        String star = "";
        for(Integer point : points){
            if(point == number){
                star += "*";
            }
        }
        return star;
    }
}
