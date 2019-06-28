/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tasks {
    
    public void TheDay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that would correspond to the week day:");
        int number;
       
        try{
            number = sc.nextInt();
            switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;    
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The number is incorrect");
                break;
            }
        }
        catch(Exception ex){
            System.out.println("Entered value is not a number");
        }
    }
    
    public void Factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number; 
        
        try{
            number= sc.nextInt();
            
            int result = 1;
        
        for(int i = 1; i <= number; i++){
           
            result = result*i;
      
        }
        System.out.println(result);
            
        }
        catch(Exception ex){
            System.out.println("The value entered is incorrect");
        }
        
        
    }
    
    public void GuessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= sc.nextInt();
        int guess;
   
        do{
            System.out.println("Please guess the number:");
            guess=sc.nextInt();
            if(guess!=number){
                
                System.out.println("The guess is wrong!");
            }
        }while(guess!=number);
        
        System.out.println("You've intered correct value!");
        
    }
}
