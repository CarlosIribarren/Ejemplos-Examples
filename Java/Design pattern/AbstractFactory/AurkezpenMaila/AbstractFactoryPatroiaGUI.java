/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AurkezpenMaila;

import LogikaMaila.FrutakBizkaia.FrutaBizkaiaAbstract;
import LogikaMaila.FrutakBizkaia.FrutaBizkaiaFactory;
import LogikaMaila.FrutakGipuzkoa.FrutaGipuzkoaAbstract;
import LogikaMaila.FrutakGipuzkoa.FrutaGipuzkoaFactory;

/**
 *
 * @author Carolo
 */
public class AbstractFactoryPatroiaGUI extends javax.swing.JFrame {

    /**
     * Creates new form AbstractFactoryPatroiaGUI
     */
    public AbstractFactoryPatroiaGUI() {
        super("Abstract Factory Patroia Adibidea - Carlos Iribarren Zubizarreta");
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Laranja Sortu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Limoia Sortu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sagarra Sortu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Laranja Sortu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Limoia Sortu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Sagarra Sortu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gipuzkoa Fruta Frabrika");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Bizkaia Fruta Frabrika");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        FrutaGipuzkoaFactory nereFrutaFactory = new FrutaGipuzkoaFactory();
        FrutaGipuzkoaAbstract nereFruta;
        nereFruta = (FrutaGipuzkoaAbstract) nereFrutaFactory.sortuLaranja();
        String irteera = "Sortutako Fruta hau da :\n-Fruta izena : " + nereFruta.getIzena() + "\n-Fruta Denboraldia :" + nereFruta.getDenboraldia() + "\n-Fruta Prezio/Kilo : " + nereFruta.getPrezioKilo() + "\n-Fruta hiria : " + nereFruta.getHiria()+ "\n-Fruta Probintzia : " + nereFruta.getProbintzia();
        this.jTextArea1.setText(irteera);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        FrutaGipuzkoaFactory nereFrutaFactory = new FrutaGipuzkoaFactory();
        FrutaGipuzkoaAbstract nereFruta;
        nereFruta = (FrutaGipuzkoaAbstract) nereFrutaFactory.sortuLimoia();
        String irteera = "Sortutako Fruta hau da :\n-Fruta izena : " + nereFruta.getIzena() + "\n-Fruta Denboraldia :" + nereFruta.getDenboraldia() + "\n-Fruta Prezio/Kilo : " + nereFruta.getPrezioKilo() + "\n-Fruta hiria : " + nereFruta.getHiria()+ "\n-Fruta Probintzia : " + nereFruta.getProbintzia();
        this.jTextArea1.setText(irteera);      

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FrutaGipuzkoaFactory nereFrutaFactory = new FrutaGipuzkoaFactory();
        FrutaGipuzkoaAbstract nereFruta;
        nereFruta = (FrutaGipuzkoaAbstract) nereFrutaFactory.sortuSagarra();
        String irteera = "Sortutako Fruta hau da :\n-Fruta izena : " + nereFruta.getIzena() + "\n-Fruta Denboraldia :" + nereFruta.getDenboraldia() + "\n-Fruta Prezio/Kilo : " + nereFruta.getPrezioKilo() + "\n-Fruta hiria : " + nereFruta.getHiria()+ "\n-Fruta Probintzia : " + nereFruta.getProbintzia();
        this.jTextArea1.setText(irteera);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FrutaBizkaiaFactory nereFrutaFactory = new FrutaBizkaiaFactory();
        FrutaBizkaiaAbstract nereFruta;
        nereFruta = (FrutaBizkaiaAbstract) nereFrutaFactory.sortuLaranja();
        String irteera = "Sortutako Fruta hau da :\n-Fruta izena : " + nereFruta.getIzena() + "\n-Fruta Denboraldia :" + nereFruta.getDenboraldia() + "\n-Fruta Prezio/Kilo : " + nereFruta.getPrezioKilo() + "\n-Fruta hiria : " + nereFruta.getHiria()+ "\n-Fruta Probintzia : " + nereFruta.getProbintzia();
        this.jTextArea2.setText(irteera);      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        FrutaBizkaiaFactory nereFrutaFactory = new FrutaBizkaiaFactory();
        FrutaBizkaiaAbstract nereFruta;
        nereFruta = (FrutaBizkaiaAbstract) nereFrutaFactory.sortuLimoia();
        String irteera = "Sortutako Fruta hau da :\n-Fruta izena : " + nereFruta.getIzena() + "\n-Fruta Denboraldia :" + nereFruta.getDenboraldia() + "\n-Fruta Prezio/Kilo : " + nereFruta.getPrezioKilo() + "\n-Fruta hiria : " + nereFruta.getHiria()+ "\n-Fruta Probintzia : " + nereFruta.getProbintzia();
        this.jTextArea2.setText(irteera);            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        FrutaBizkaiaFactory nereFrutaFactory = new FrutaBizkaiaFactory();
        FrutaBizkaiaAbstract nereFruta;
        nereFruta = (FrutaBizkaiaAbstract) nereFrutaFactory.sortuSagarra();
        String irteera = "Sortutako Fruta hau da :\n-Fruta izena : " + nereFruta.getIzena() + "\n-Fruta Denboraldia :" + nereFruta.getDenboraldia() + "\n-Fruta Prezio/Kilo : " + nereFruta.getPrezioKilo() + "\n-Fruta hiria : " + nereFruta.getHiria()+ "\n-Fruta Probintzia : " + nereFruta.getProbintzia();
        this.jTextArea2.setText(irteera);           
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AbstractFactoryPatroiaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbstractFactoryPatroiaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbstractFactoryPatroiaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbstractFactoryPatroiaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbstractFactoryPatroiaGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
