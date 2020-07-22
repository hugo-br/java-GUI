/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_package;

/**
 *
 * @author hugob
 */
public class ModifInterface extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
  NouvellesControleur controleur;
  Integer nouvelleInt;
    
    /**
     * Creates new form EditInterface
     */
    public ModifInterface(NouvellesControleur controleur) {
        this.controleur = controleur;
        this.nouvelleInt = 999;
        initComponents();
    }
    
    public void afficherModifNouvelle(int i){
       this.nouvelleInt = i;
       Nouvelles nouv = controleur.getNouvelle(i);
       titreModif.setText(nouv.getTitle());
       lienModif.setText(nouv.getLink());
       descModif.setText(nouv.getDescription());
       pubModif.setText(nouv.getPubDate());
    }
    
    public void ModifNouvelle(){
        Nouvelles nouv = controleur.getNouvelle(this.nouvelleInt);
        nouv.setTitle(titreModif.getText());
        nouv.setLink(lienModif.getText());
        nouv.setDescription(descModif.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        titreModif = new javax.swing.JTextField();
        lienModif = new javax.swing.JTextField();
        pubModif = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descModif = new javax.swing.JTextArea();
        ajoutEvnBtn1 = new javax.swing.JButton();
        fermerBtn2 = new javax.swing.JButton();
        supprimerBtnEdit = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrez les informations suivantes"));

        jLabel3.setText("Titre");

        jLabel4.setText("Lien");

        jLabel5.setText("Description");

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

        fermerBtn.setBackground(new java.awt.Color(225, 34, 33));
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

        ajoutEvnBtn.setBackground(new java.awt.Color(102, 255, 102));
        ajoutEvnBtn.setForeground(new java.awt.Color(51, 62, 44));
        ajoutEvnBtn.setText("AJOUTER");
        ajoutEvnBtn.setToolTipText("");
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
                .addGap(137, 137, 137)
                .addComponent(ajoutEvnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(fermerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
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

        setResizable(false);

        titreAjout.setAlignment(java.awt.Label.CENTER);
        titreAjout.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        titreAjout.setForeground(new java.awt.Color(0, 0, 0));
        titreAjout.setText("Gestion de la nouvelle");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifier les informations suivantes"));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setFocusCycleRoot(true);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel7.setText("Titre");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setText("Lien");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel9.setText("Description");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel10.setText("Date");

        titreModif.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        titreModif.setScrollOffset(1);
        titreModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titreModifActionPerformed(evt);
            }
        });

        pubModif.setEnabled(false);
        pubModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubModifActionPerformed(evt);
            }
        });

        descModif.setColumns(20);
        descModif.setRows(5);
        jScrollPane2.setViewportView(descModif);

        ajoutEvnBtn1.setBackground(new java.awt.Color(255, 204, 0));
        ajoutEvnBtn1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ajoutEvnBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_package/edit.png"))); // NOI18N
        ajoutEvnBtn1.setText("MODIFIER");
        ajoutEvnBtn1.setToolTipText("Modifier cette nouvelle");
        ajoutEvnBtn1.setIconTextGap(10);
        ajoutEvnBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutEvnBtn1ActionPerformed(evt);
            }
        });

        fermerBtn2.setBackground(new java.awt.Color(153, 153, 153));
        fermerBtn2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        fermerBtn2.setText("ANNULER");
        fermerBtn2.setToolTipText("Fermer la fenêtre");
        fermerBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermerBtn2MouseClicked(evt);
            }
        });
        fermerBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(ajoutEvnBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fermerBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addComponent(titreModif)
                    .addComponent(pubModif)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(lienModif))
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(titreModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lienModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pubModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajoutEvnBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fermerBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        supprimerBtnEdit.setBackground(new java.awt.Color(225, 34, 33));
        supprimerBtnEdit.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        supprimerBtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_package/trash.png"))); // NOI18N
        supprimerBtnEdit.setText("SUPPRIMER");
        supprimerBtnEdit.setToolTipText("Supprimer cette nouvelle");
        supprimerBtnEdit.setIconTextGap(10);
        supprimerBtnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerBtnEditMouseClicked(evt);
            }
        });
        supprimerBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerBtnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titreAjout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supprimerBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titreAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(supprimerBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titreInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titreInputActionPerformed

    private void dateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateInputActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dateInputActionPerformed

    private void fermerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_fermerBtnMouseClicked

    private void fermerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fermerBtnActionPerformed

    private void ajoutEvnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutEvnBtnActionPerformed
        // ajouter la nouvelle avec les parametres:

    }//GEN-LAST:event_ajoutEvnBtnActionPerformed

    private void titreModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titreModifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titreModifActionPerformed

    private void pubModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubModifActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_pubModifActionPerformed

    private void supprimerBtnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerBtnEditMouseClicked
        // TODO add your handling code here:
    //    this.setVisible(false);

    }//GEN-LAST:event_supprimerBtnEditMouseClicked

    private void supprimerBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerBtnEditActionPerformed
        // TODO add your handling code here:
        int r = this.nouvelleInt;
        controleur.supprimerNouvelle(r);
        this.setVisible(false);
    }//GEN-LAST:event_supprimerBtnEditActionPerformed

    private void ajoutEvnBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutEvnBtn1ActionPerformed
        // ajouter la nouvelle avec les parametres:
        ModifNouvelle();
        controleur.mettreAJour();
        this.setVisible(false);
    }//GEN-LAST:event_ajoutEvnBtn1ActionPerformed

    private void fermerBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerBtn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fermerBtn2MouseClicked

    private void fermerBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerBtn2ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_fermerBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(ModifInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new ModifInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajoutEvnBtn;
    private javax.swing.JButton ajoutEvnBtn1;
    private javax.swing.JTextField dateInput;
    private javax.swing.JTextArea descModif;
    private javax.swing.JTextArea descriptionInput;
    private javax.swing.JButton fermerBtn;
    private javax.swing.JButton fermerBtn2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lienInput;
    private javax.swing.JTextField lienModif;
    private javax.swing.JTextField pubModif;
    private javax.swing.JButton supprimerBtnEdit;
    private java.awt.Label titreAjout;
    private javax.swing.JTextField titreInput;
    private javax.swing.JTextField titreModif;
    // End of variables declaration//GEN-END:variables
}
