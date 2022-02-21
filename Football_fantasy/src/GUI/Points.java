package GUI;

import java.sql.SQLException;
import Game_info.Database;
import Game_info.user;
import javax.swing.JFrame;

public class Points extends javax.swing.JFrame {
      user u = new user();
      String x[] = new String[11];
   
    public Points(user u) throws ClassNotFoundException, SQLException {
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.u = u;
        this.u.Calculte_points();
        for (int i =0; i<11; i++){
           x[i] = this.u.getClubSquad(i) + "  " + this.u.getPlayerNamefromSquad(i) +" :" + this.u.getPlayerPointsfromSquad(i);
        }
        
        this.lpoint.setListData(x);
        this.points.setText(String.valueOf(this.u.getPoints()));
        
        try {
            jLabel1.setIcon(new javax.swing.ImageIcon("src\\images\\Statement_Graphic_PL_Pink.png"));
               
        }
        catch (NullPointerException e){
            jLabel1.setText("image not found");
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        points = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lpoint = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Next Week");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 166, 47));

        points.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        points.setForeground(new java.awt.Color(0, 0, 153));
        points.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsActionPerformed(evt);
            }
        });
        jPanel1.add(points, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 70, 50));

        lpoint.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lpoint.setForeground(new java.awt.Color(0, 51, 153));
        jScrollPane2.setViewportView(lpoint);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 260, 310));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("             Player's points");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 240, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Points");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 100, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              dispose();
              Database.nweek++;
              Formation p = new Formation(u.getName());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointsActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lpoint;
    private javax.swing.JTextField points;
    // End of variables declaration//GEN-END:variables
}
