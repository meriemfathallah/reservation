package projet;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;


/**
 *
 * @author meriem
 */
public class PartieReservation extends javax.swing.JFrame {

    /**
     * Creates new form PartieReservation
     */
    public PartieReservation() {
        initComponents();
        this.setSize(1203,602);
        this.setLocationRelativeTo(null);
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
        votrereserv = new javax.swing.JLabel();
        nomcof = new javax.swing.JLabel();
        loca = new javax.swing.JLabel();
        nbpers = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numdispo = new javax.swing.JLabel();
        coff = new javax.swing.JComboBox<>();
        Mahdia = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        dispo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1203, 602));

        jPanel1.setLayout(null);

        votrereserv.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        votrereserv.setText("VOTRE RESERVATION");
        jPanel1.add(votrereserv);
        votrereserv.setBounds(70, 90, 310, 70);

        nomcof.setText("Nom du cafee");
        jPanel1.add(nomcof);
        nomcof.setBounds(50, 190, 90, 20);

        loca.setText("localisation");
        jPanel1.add(loca);
        loca.setBounds(70, 240, 70, 16);

        nbpers.setText("Nombre de personne");
        jPanel1.add(nbpers);
        nbpers.setBounds(30, 290, 150, 30);

        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setText("VOTRE RESERVATION");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(410, 50, 310, 70);

        jLabel7.setText("jLabel2");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(340, 220, 41, 16);

        jLabel8.setText("jLabel2");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(340, 120, 41, 16);

        jLabel9.setText("jLabel2");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(340, 150, 41, 16);

        jLabel10.setText("jLabel2");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(340, 190, 41, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        numdispo.setText("numereaux disponible");
        jPanel1.add(numdispo);
        numdispo.setBounds(30, 340, 160, 30);

        coff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blue note", "Marsana" }));
        jPanel1.add(coff);
        coff.setBounds(160, 190, 100, 22);

        Mahdia.setText("Mahdia");
        Mahdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MahdiaActionPerformed(evt);
            }
        });
        jPanel1.add(Mahdia);
        Mahdia.setBounds(180, 240, 47, 22);
        jPanel1.add(nombre);
        nombre.setBounds(180, 290, 50, 22);

        dispo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 18", "25", "15", "45" }));
        jPanel1.add(dispo);
        dispo.setBounds(170, 350, 45, 22);

        jButton1.setText("valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 420, 130, 50);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 610);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/reservat.jpg"))); // NOI18N
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 1200, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MahdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MahdiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MahdiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PartieReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartieReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartieReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartieReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartieReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Mahdia;
    private javax.swing.JComboBox<String> coff;
    private javax.swing.JComboBox<String> dispo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loca;
    private javax.swing.JLabel nbpers;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nomcof;
    private javax.swing.JLabel numdispo;
    private javax.swing.JLabel votrereserv;
    // End of variables declaration//GEN-END:variables
}
