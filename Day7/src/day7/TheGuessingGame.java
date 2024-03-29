/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TheGuessingGame extends javax.swing.JFrame {
    
    private String wordToGuess = "";
    private String guess = "";
    private boolean whosTurnToPlay = false;
    // false - player1( sets the word to guess)
    // true - player2( guesses the word)
    private int chances;
//    private ArrayList<Character> wordToGuessList = new ArrayList<Character>();
//    private ArrayList<Character> guessList = new ArrayList<Character>();
//    private ArrayList<Character> guessedLettersList = new ArrayList<Character>();
    
    /**
     * Creates new form TheGuessingGame
     */
    public TheGuessingGame() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfInput = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblChances = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        lblChancesLeft = new javax.swing.JLabel();
        lblPS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblOutput.setText("Player 1,please type in a word in the window below");
        lblOutput.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblChancesLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lblChances, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addComponent(lblPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPS, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblChancesLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
//        for(int k = 0; k < wordToGuess.length(); k++){
//            try{
//                Character.isLetter(wordToGuess.charAt(k));
//            }catch(Exception ex){
//                lblOutput.setText("Cannot contain digits, symbols or be empty");
//            }
//        }
        
        if(whosTurnToPlay == false){
//            lblOutput.setText("");
//            CheckingInputsClass check = new CheckingInputsClass();
//            check.CheckingInputs(tfInput.getText(),lblOutput.getText());
            wordToGuess = tfInput.getText();
            tfInput.setText("");
            whosTurnToPlay = true;
            for(int k = 0; k < wordToGuess.length(); k++){
                try{
                    Character.isLetter(wordToGuess.charAt(k));
                    
                }catch(Exception ex){
                    lblOutput.setText("Cannot contain digits, symbols or be empty");
                    whosTurnToPlay = false;
                    break;
                }
            }
            chances = 5;
            lblChancesLeft.setText("Chances left");
            lblOutput.setText("Word accepted! Player 2, guess the word!");
            lblPS.setText("");
        }else{
            guess = tfInput.getText();
            if(guess.equals(wordToGuess)){
                whosTurnToPlay = false;
                lblOutput.setText("Bingo! Player 1,please type in a word in the window below.");
                tfInput.setText("");
                lblChancesLeft.setText("");
                lblPS.setText("");
            }else{
                ArrayList<Character> wordToGuessList = new ArrayList<Character>();
                for(int i = 0; i < wordToGuess.length(); i++){
                    wordToGuessList.add(wordToGuess.charAt(i)); 
                }
                ArrayList<Character> guessList = new ArrayList<Character>();
                for(int i = 0; i < guess.length(); i++){
                    guessList.add(guess.charAt(i));
                }
                ArrayList<Character> guessedLettersList = new ArrayList<Character>();
                for(int i = 0; i < wordToGuessList.size(); i++){
                    for(int j = 0; j < guessList.size(); j++){
                        if(wordToGuessList.get(i).equals(guessList.get(j)) 
//                           && !guessedLettersList.contains(wordToGuessList.get(i))
                            ){
                            guessedLettersList.add(wordToGuessList.get(i));
                            break;
                        }   
                    }
                }
                lblOutput.setText("Wrong guess! The word you entered contains letters \n"
                                   + "that the word you are guessing also contains. \n" 
                                   + " These are the letters: " + guessedLettersList);
                lblPS.setText("P.S. Letters are ordered the way they stand in the word you're guessing \n"
                                   + " and if a letter repeats this means it repeats in the word you're guessing.\n"
                                   + " Try again!");
                tfInput.setText("");
                chances--;
                lblChances.setText(String.valueOf(chances));
                if(chances == 0){
                    whosTurnToPlay = false;
                    lblOutput.setText("Game over!"
                            + "Player 1,please type in a word in the window below.");
                    lblChancesLeft.setText("");
                    lblPS.setText("");
                }
            }
        }
        
        if(whosTurnToPlay == false){
            lblChances.setText("");
        }else{
            lblChances.setText(String.valueOf(chances));
        }
        
//        for( int k = 0; k < tfInput.getText().length(); k++){
//            if(!Character.isLetter(tfInput.getText().charAt(k))
//                        || tfInput.getText().equals("")){
//                lblOutput.setText("The word cannot contain digits or symbols"
//                            + " or cannot be empty!"
//                            + "Please type in a word in the window below.");
//                tfInput.setText("");
//                break;
//            }else {
//
//            }
//        }
           
        
//       XXX 
//        for(int i = 0; i < guessList.size(); i++){
//            for(int j = 0; j < wordToGuessList.size(); j++){
//                if(guessList.get(i).equals(wordToGuessList.get(j))){
//                   guessedLettersList.add(guessList.get(i));
//                   break;
//                }
//            }
//        }
//          *****
//        for(int i = 0; i < wordToGuessList.size(); i++){
//            for(int j = 0; j < guessList.size(); j++){
//                if(wordToGuessList.get(i).equals(guessList.get(j))){
//                    guessedLettersList.add(wordToGuessList.get(i));
//                    break;
//                }
//            }
//        }

//        guessedLettersList = wordToGuessList;
//        for(int i = 0; i < guessedLettersList .size(); i++){
//            for(int j = 0; j < guessList.size(); j++){
//                if(!guessedLettersList.get(i).equals(guessList.get(j))){
//                   
//                }
//            }
//        }

//        for(int i = 0; i < wordToGuess.length(); i++){
//            for(int  j = 0; j < guess.length(); j++){
//                
//                if(!guess.charAt(j).equals(wordToGuess.charAt(i))){
//                    
//                    
//                } else {
//                }
//            }
//        }
        
//        System.out.println(wordToGuessList);
//        System.out.println(guessList);
//        System.out.println(guessedLettersList);

    }//GEN-LAST:event_btnSubmitActionPerformed

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TheGuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheGuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheGuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheGuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheGuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblChances;
    private javax.swing.JLabel lblChancesLeft;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblPS;
    private javax.swing.JTextField tfInput;
    // End of variables declaration//GEN-END:variables

    private static class CheckingInputsClass {

        public void CheckingInputs(String _tfInput, String _lblOutput){
         for( int k = 0; k < _tfInput.length(); k++){
                try{
                    Character.isLetter(_tfInput.charAt(k));
                    
                }catch(Exception ex){
                   _lblOutput = "Cannot contain digits, symbols or be empty";
                }
            }
        }
    }
}
