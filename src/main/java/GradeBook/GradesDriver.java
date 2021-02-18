/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GradeBook;

import java.util.Scanner;

/**
 *
 * @author drewm
 */
public class GradesDriver {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        getStudData(students);
    }
    
    public static double getStudData (Student[] array) {
        Scanner keyboard = new Scanner(System.in);
        String [] student = new String[5];
        double [] test = new double [4];
        
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter the name of the student : ");
            student[i] = keyboard.nextLine();
            for (int j = 0; j < test.length; j++) {
                System.out.println("Enter score " + (j + 1) + " for the student");
                test[j] = keyboard.nextDouble();
                keyboard.nextLine();
            }

            
            array[i] = new Student(student[i], test);
  

        }
            for (Student students: array) {
                System.out.println(students);
            }         



        
        return 0;
    }
}
