/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner sc = new Scanner(System.in);
//      System.out.println("Please enter a number:");
//      int number = sc.nextInt();
//      System.out.println(TheNumber(number));
      
      System.out.println("Please enter a word:");
      String userInput = sc.nextLine();
      System.out.println(TheWord(userInput));
      
    }
    
    private static String TheWord(String word){
        String c ="*";
        if(word.length() > 5){
            return c;
        }else {
            return c+"*";
        }

    }
    
    private static String TheNumber(int value){
        String c ="*";
        if(value > 5){
            return c;
        }else {
            return c+"*";
        }
       }
   
    private static void loopExamples(){
        //while, for, for..each, do..while
        
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }
        System.out.println();
        
        for(int i=11; i>5; i--){
            System.out.println(i);
        }
        
        System.out.println();
        
        int number = 0;
        while(number<5){
            System.out.println(number);
            number++;
        }
        System.out.println();
        
        number =0;
        do{
            System.out.println(number);
            number++;
        }while(number<5);
        System.out.println();
    }
    
    private static void stars(){
        String st = "";
        for(int i = 0; i<4; i++){
            st=st+"*"; 
            System.out.println(st);
            
        }
    }
    
    private static void power(int base, int pow){
        int result = 1;
        // base = 2;
        // pow = 3;
        //finalResult = 8;
        // 1. 1*2
        // 2. 2*2
        // 3. 4*2
        for(int i = 0; i<pow; i++){
            result = result*base;
        }
        System.out.println(result);
    }
    
    private static void fun1(){
        System.out.println("Funkcija kko dara");
    }
    
    private static void funWithParams( int a, double b, String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
    private static int funWithReturn(){
        int c = 5+7;
        return c;
    }
    
    
    
}

