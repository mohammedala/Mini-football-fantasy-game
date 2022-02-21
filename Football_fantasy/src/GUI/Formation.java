package GUI;

import java.sql.SQLException;
import Game_info.user;

public class Formation extends javax.swing.JFrame {
     user u = new user();
     
    public Formation(String u) {
        initComponents();
        this.u.setName(u);
        this.setResizable(false);
        this.setVisible(true);
        try {
            jLabel2.setIcon(new javax.swing.ImageIcon("src\\images\\Statement_Graphic_PL_Pink.png"));
               
        }
        catch (NullPointerException e){
            jLabel2.setText("image not found");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        squad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose your Squad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 220, 60));

        squad.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        squad.setForeground(new java.awt.Color(0, 0, 153));
        squad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 4 2", "3 5 2" }));
        squad.setSelectedIndex(-1);
        squad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squadActionPerformed(evt);
            }
        });
        jPanel1.add(squad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 210, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void squadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squadActionPerformed

       if (squad.getSelectedIndex() == 0){
           try {
               dispose();
              F442 p = new F442(u);
           } catch (ClassNotFoundException | SQLException ex) {
               System.out.println("class not found or sql exception");
           }
       }
       
      else if (squad.getSelectedIndex() == 1){
          
           try {
               dispose();
              F352 p = new F352(u);
           } catch (ClassNotFoundException | SQLException ex) {
               System.out.println("class not found or sql exception");
           }
      }

    }//GEN-LAST:event_squadActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> squad;
    // End of variables declaration//GEN-END:variables
}
