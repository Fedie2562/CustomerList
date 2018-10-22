/*
 * Ferris D.
 * 18/10/2018
 * Customer List program
 */

package CustomerList;

import java.io.*;

/**
 *
 * @author fedie2562
 */
public class CustomerList extends javax.swing.JFrame {

    /**
     * Creates new form CustomerList
     */
    public CustomerList() {
        try{
            BufferedReader readFile = new BufferedReader(new FileReader("customerList.txt"));
            
        }catch(FileNotFoundException fnfe){
            try{
                PrintWriter fileOut = new PrintWriter(new FileWriter("customerList.txt", true));
                fileOut.close();
            }catch(IOException IOEx){}
        }
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

        jLabel1 = new javax.swing.JLabel();
        addCustomers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        nameVar = new javax.swing.JTextField();
        addressVar = new javax.swing.JTextField();
        yearVar = new javax.swing.JTextField();
        postalVar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loadButton = new javax.swing.JButton();
        deleteList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Discount Fly");

        addCustomers.setText("Add Customer");
        addCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomersActionPerformed(evt);
            }
        });

        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        nameVar.setToolTipText("Name");

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Year of Birth");

        jLabel5.setText("Postal Code");

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        deleteList.setText("Delete Customer List");
        deleteList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressVar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yearVar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(postalVar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameVar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(deleteList))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addCustomers)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addCustomers)
                    .addComponent(loadButton))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postalVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteList)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void addCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomersActionPerformed
       try{
            PrintWriter fileOut = new PrintWriter(new FileWriter("customerList.txt", true));
            boolean numberFormatGood = false;
            boolean letterFormatGood = false;
            boolean dateFormatGood = false;
            //Checking the year of birth format
            try{
                int year = Integer.parseInt(yearVar.getText());
                dateFormatGood = true;
            }catch(NumberFormatException nfe){}
            //Checking the letters
            letterFormatGood = Character.isAlphabetic(postalVar.getText().charAt(0));
            letterFormatGood = Character.isAlphabetic(postalVar.getText().charAt(2));
            letterFormatGood = Character.isAlphabetic(postalVar.getText().charAt(5));
            //Checkign the numbers
            try{
                Integer.parseInt(postalVar.getText().substring(1,2));
                Integer.parseInt(postalVar.getText().substring(4,5));
                Integer.parseInt(postalVar.getText().substring(6,7));
                numberFormatGood = true;
            }catch(NumberFormatException nfe){
                System.out.println("Please ensure that you have your postal code in this format\nL#L #L# where L is a letter and # is a number");
                numberFormatGood = false;
            }
            //If both formats are good it will output
            if(letterFormatGood&&numberFormatGood&&dateFormatGood){
                fileOut.println("Name : "+nameVar.getText());
                fileOut.println("Address : "+addressVar.getText());
                fileOut.println("Year of Birth : "+yearVar.getText());
                fileOut.println("Postal Code : "+postalVar.getText()+"\n");
                numberFormatGood = false;
                letterFormatGood = false;
            //If the formats are not good it will give a warning
            }else{System.out.println("Please ensure that you have your postal code in this format\nL#L #L# where L is a letter and # is a number"
                    + "\nPut the year into YYYY format"
                    + "\n|-----------------------------------------------------|");}
            fileOut.close();
            BufferedReader readFile = new BufferedReader(new FileReader("customerList.txt"));
            String line, output;
            output = "";
            while((line = readFile.readLine()) != null){
                output+=line+"\n";
            }
            displayArea.setText(output);
        }catch(IOException IOEx){}
    }//GEN-LAST:event_addCustomersActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // Load the file contents and print to the text box on screen
        try{
            BufferedReader readFile = new BufferedReader(new FileReader("customerList.txt"));
            String line, output;
            output = "";
            while((line = readFile.readLine()) != null){
                output+=line+"\n";
            }
            displayArea.setText(output);
        }catch(FileNotFoundException fnfe){
            
        }catch(IOException IOEx){
            
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void deleteListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteListActionPerformed
        // Clears the customer list file
        try{
            PrintWriter fileOut = new PrintWriter(new FileWriter("customerList.txt"));
            fileOut.println("");
            fileOut.close();
            BufferedReader readFile = new BufferedReader(new FileReader("customerList.txt"));
            String line, output;
            output = "";
            while((line = readFile.readLine()) != null){
                output+=line+"\n";
            }
            displayArea.setText(output);
        }catch(IOException IOEx){}
    }//GEN-LAST:event_deleteListActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomers;
    private javax.swing.JTextField addressVar;
    private javax.swing.JButton deleteList;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField nameVar;
    private javax.swing.JTextField postalVar;
    private javax.swing.JTextField yearVar;
    // End of variables declaration//GEN-END:variables
}
