/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Student Name: Azinakho Tyatya
 * Student Number: ST10460235
 * Assignment Name: Homework 2 
 * Submission Due Date: 05 August 2024
 *   
 */

public class HomeWork2 {
     public static void main(String[] args, String ageGroup) {
        // TODO code application logic here
        String name;
        int age;
        
        //Name
        try (Scanner input = new Scanner(System.in)){
            //name
            System.out.println("Please enter persons name");
            name = input.nextLine();
            
            //Age
            System.out.println("Please enter " + name + "'s age:");
            age = input.nextLine();
            
            //display age group
            if (age < 1) {
                ageGroup = "Infant";
            }else if (age >= 1 && age <= 3){
                ageGroup = "Toddler";
            }else if (age >= 4 && age <= 5){
                ageGroup = "Preschooler";
            }else if (age >= 6 && age <= 12){
                ageGroup = "Grade Schooler";
            }else if (age >= 13 && age <= 18){
                ageGroup = "Teenager";
            }else if (age >= 19 && age <= 21){
                ageGroup = "Young Adult";
            }else{
                ageGroup = "Adult";
            }
            
            //out
            System.out.println(name+ "is classified as:" + ageGroup);
            
        }
        
       //Part 2
       Scanner scanner = new Scanner (System.in);
       
       //call user input
       System.out.println("Enter your street name");
       String street = scanner.nextLine();
       
       System.out.println("Enter the House or Apartment number: ");
       String houseNum = scanner.nextLine();
       
       System.out.println("Enter the city");
       String city = scanner.nextLine();
       
       System.out.println("Enter the zip code: ");
       String zipCode = scanner.nextLine();
       
       System.out.println("Enter province");
       String province = scanner.nextLine();
       
       //out
       System.out.println(houseNum + " " + street + "," + city + "," + province + "," + zipCode);
       
       //close
       scanner.close();
    
       
       //Part 3
          double tax = 0.0;
          double income;
        //call user for taxable income
        String input = JOptionPane.showInputDialog("Enter your taxable income(in R):");
        
        //input to a double
        {
            income = Double.parseDouble(input);
            
            //Calculate tax based on given tax table
         if (income <= 9875) {
            tax = income * 0.10; //10% tax rate'
         }else if (income <= 40125) {
             tax = 987.5 + (income - 9875) * 0.12;
         }else if (income <= 85525){
             tax = 4617.5 + (income - 40125) * 0.22;
         }else if (income <= 163300){
             tax = 14605.5 + (income - 85525) * 0.24;
         }else if (income <= 207350){
             tax = 33271.5 + (income - 163300) * 0.32;
         }else if (income <= 518400){
             tax = 47367.5 + (income - 207350) * 0.35;
         }else {
             tax = 156235 + (income - 518400) * 0.37;
        }
    } 
}



     


    
    

