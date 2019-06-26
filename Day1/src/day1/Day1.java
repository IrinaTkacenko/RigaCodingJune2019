/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sum(2,3);
        // metodi, kurai padod ieksa 3 parametrus - 
        // 2 int tipa skaitli
        // strings
        //ievada skaitlus, plusu vai minusu un tad izpildam darbibu
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter either - or + in order to perform the action.");
        String action = sc.nextLine(); 
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Enter another number: ");
        int number2 = sc.nextInt();
        
        
        
        calculation(action, number, number2);
        
       
        
    }
    
    private static void sum(int a, int b){
        System.out.println(a+b);
    }
    
    private static void example(){
        System.out.println("Hello world!"); // ar enter
        System.out.print("Hello world!"); //bez enter
        
        //mainigo tipi, tie pasi, kas C#
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ievadiet tekstu!");
        String text = sc.nextLine(); // ievade konsole
        
        System.out.println("ievadiet skaitli!");
        int number = sc.nextInt(); //ievadam skaitli
        
       
        System.out.println(text); // izvade
        
        if(!text.equals("vii")){
            // vai nav vienads
        }
        
        if(number == 3){
            //if piemers
        }else{
            
        }
    }
    
    private static void calculation(String c, int a, int b){
        if(c.equals("-"))
        {
            int sub = a-b;
            System.out.println(sub);
        }
        else if(c.equals("+"))
        {
            int add = a+b;
            System.out.println(add);
        }
        
    }
}
