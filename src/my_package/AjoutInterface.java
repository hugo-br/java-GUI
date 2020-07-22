/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_package;

import javax.swing.JTextField;

/**
 *
 * @author hugob
 */
public class AjoutInterface extends javax.swing.JFrame {

    /**
     * Creates new form AjoutInterface
     */
     Date date = new Date();
     NouvellesControleur controleur;
     
    
    public AjoutInterface(NouvellesControleur controleur) {
        this.controleur = controleur;
        initComponents();
        dateInput.setText(date.getDate());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titreInput = new javax.swing.JTextField();
        lienInput = new javax.swing.JTextField();
        dateInput = new javax.swing.JTextField();
        fermerBtn = new javax.swing.JButton();
        ajoutEvnBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionInput = new javax.swing.JTextArea();
        titreAjout = new java.awt.Label();

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 102, 0));
        label1.setText("Flux de nouvelles de la TELUQ");

        setTitle("Ajouter Évènement");
        setName("frameAjout"); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrez les informations suivantes"));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Titre");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("Lien");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Description");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Date");

        titreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titreInputActionPerformed(evt);
            }
        });

        dateInput.setEnabled(false);
        dateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateInputActionPerformed(evt);
            }
        });

        fermerBtn.setBackground(new java.awt.Color(153, 153, 153));
        fermerBtn.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        fermerBtn.setText("ANNULER");
        fermerBtn.setToolTipText("Fermer la fenêtre");
        fermerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermerBtnMouseClicked(evt);
            }
        });
        fermerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerBtnActionPerformed(evt);
            }
        });

        ajoutEvnBtn.setBackground(new java.awt.Color(51, 153, 0));
        ajoutEvnBtn.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        ajoutEvnBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hugob\\Pictures\\add-2.png")); // NOI18N
        ajoutEvnBtn.setText("AJOUTER");
        ajoutEvnBtn.setToolTipText("");
        ajoutEvnBtn.setIconTextGap(10);
        ajoutEvnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutEvnBtnActionPerformed(evt);
            }
        });

        descriptionInput.setColumns(20);
        descriptionInput.setRows(5);
        jScrollPane1.setViewportView(descriptionInput);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titreInput)
                    .addComponent(dateInput)
                    .addComponent(jScrollPane1)
                    .addComponent(lienInput))
                .addGap(63, 63, 63))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(ajoutEvnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(fermerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(titreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lienInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fermerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajoutEvnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        titreAjout.setAlignment(java.awt.Label.CENTER);
        titreAjout.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        titreAjout.setForeground(new java.awt.Color(0, 0, 0));
        titreAjout.setText("Ajouter une nouvelle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(titreAjout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titreAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Ajout Évènement");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fermerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fermerBtnActionPerformed

    private void ajoutEvnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutEvnBtnActionPerformed
        // ajouter la nouvelle avec les parametres:

        Nouvelles nouv = new Nouvelles();
        nouv.setTitle(titreInput.getText());
        nouv.setLink(lienInput.getText());
        nouv.setDescription(descriptionInput.getText());
        nouv.setPubDate(dateInput.getText());
        controleur.ajouterNouvelle(nouv);
        controleur.mettreAJour();
        clearFields();
        
        
    }//GEN-LAST:event_ajoutEvnBtnActionPerformed

    private void fermerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerBtnMouseClicked
        // TODO add your handling code here:
       this.setVisible(false);
         
    }//GEN-LAST:event_fermerBtnMouseClicked

    private void dateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateInputActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dateInputActionPerformed

    private void titreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titreInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titreInputActionPerformed

   
    
    
    // clear method
    private void clearFields() {
      titreInput.setText("");
      lienInput.setText("");
      descriptionInput.setText("");
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(AjoutInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //   new AjoutInterface().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajoutEvnBtn;
    private javax.swing.JTextField dateInput;
    private javax.swing.JTextArea descriptionInput;
    private javax.swing.JButton fermerBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextField lienInput;
    private java.awt.Label titreAjout;
    private javax.swing.JTextField titreInput;
    // End of variables declaration//GEN-END:variables
}