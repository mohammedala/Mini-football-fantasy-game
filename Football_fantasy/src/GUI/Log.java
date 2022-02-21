package GUI;

import javax.swing.JFrame;


public class Log extends javax.swing.JFrame {
     String   player_name ;
     
    public Log() {
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            jLabel1.setIcon(new javax.swing.ImageIcon("src\\images\\Statement_Graphic_PL_Pink.png"));

        } catch (NullPointerException e) {
            jLabel1.setText("image not found");
        }
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 102));
        jTextField1.setText("Write your name");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 160, 30));

        name.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 160, 30));

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        next.setForeground(new java.awt.Color(0, 0, 153));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 90, 20));

        jLabel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        if (name.getText().trim().replaceAll("\\s+", "").equalsIgnoreCase("") != true) {
            player_name = name.getText();
            dispose();
            Formation p = new Formation(player_name);
            
        }
    }//GEN-LAST:event_nextActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
