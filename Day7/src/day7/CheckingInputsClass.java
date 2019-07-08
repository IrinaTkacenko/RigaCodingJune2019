/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author User
 */
public class CheckingInputsClass {
    
     public void CheckingInputs(String _tfInput, String _wordToGuess, String _lblOutput){
         for( int k = 0; k < _tfInput.length(); k++){
                try{
                    Character.isLetter(_wordToGuess.charAt(k));
                    
                }catch(Exception ex){
                   _lblOutput = "Cannot contain digits, symbols or be empty";
                }
            }
    }
}
