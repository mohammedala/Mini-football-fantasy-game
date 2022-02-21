package GUI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Game_info.Database;
import Game_info.Defender;
import Game_info.Goalkeeper;
import Game_info.Midfielder;
import Game_info.Striker;
import Game_info.user;
import javax.swing.JOptionPane;


public class F352 extends javax.swing.JFrame {

    user single_player = new user();
    Goalkeeper goalkeeper[] = new Goalkeeper[7];
    Defender defender[] = new Defender[7];
    Midfielder mid[] = new Midfielder[7];
    Striker forward[] = new Striker[7];
    Goalkeeper g = new Goalkeeper();
    Defender d = new Defender();
    Midfielder m = new Midfielder();
    Striker s = new Striker();
    
    public F352(user u) throws ClassNotFoundException, SQLException {
        initComponents();
        single_player.setName(u.getName());
        this.setResizable(false);
        this.setVisible(true);
        try {
            jLabel2.setIcon(new javax.swing.ImageIcon("src\\images\\d7b05539aac8c5416c73ca046f977742_1_700x1000.jpg"));
               
        }
        catch (NullPointerException e){
            jLabel2.setText("image not found");
        }
        
        readData();
        for (int i = 0; i < 7; i++) {
            this.gk1.insertItemAt(goalkeeper[i].getClub() + "  " + goalkeeper[i].getName(), i);
            this.df1.insertItemAt(defender[i].getClub() + "  " + defender[i].getName(), i);
            this.df2.insertItemAt(defender[i].getClub() + "  " + defender[i].getName(), i);
            this.df3.insertItemAt(defender[i].getClub() + "  " + defender[i].getName(), i);
            this.md1.insertItemAt(mid[i].getClub() + "  " + mid[i].getName(), i);
            this.md2.insertItemAt(mid[i].getClub() + "  " + mid[i].getName(), i);
            this.md3.insertItemAt(mid[i].getClub() + "  " + mid[i].getName(), i);
            this.md4.insertItemAt(mid[i].getClub() + "  " + mid[i].getName(), i);
            this.md5.insertItemAt(mid[i].getClub() + "  " + mid[i].getName(), i);
            this.fw1.insertItemAt(forward[i].getClub() + "  " + forward[i].getName(), i);
            this.fw2.insertItemAt(forward[i].getClub() + "  " + forward[i].getName(), i);

        }
    }

    public void readData() throws ClassNotFoundException, SQLException {
        Database d = new Database();

        for (int i = 0; i < 7; i++) {

            goalkeeper[i] = new Goalkeeper();
            defender[i] = new Defender();
            mid[i] = new Midfielder();
            forward[i] = new Striker();

        }

        d.read(goalkeeper, g);
        d.read(defender, this.d);
        d.read(mid, m);
        d.read(forward, s);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gk1 = new javax.swing.JComboBox<>();
        md1 = new javax.swing.JComboBox<>();
        md2 = new javax.swing.JComboBox<>();
        md3 = new javax.swing.JComboBox<>();
        md4 = new javax.swing.JComboBox<>();
        md5 = new javax.swing.JComboBox<>();
        fw1 = new javax.swing.JComboBox<>();
        fw2 = new javax.swing.JComboBox<>();
        df1 = new javax.swing.JComboBox<>();
        df2 = new javax.swing.JComboBox<>();
        df3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Formation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gk1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gk1.setForeground(new java.awt.Color(0, 51, 153));
        gk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gk1ActionPerformed(evt);
            }
        });
        jPanel1.add(gk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 158, 33));

        md1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        md1.setForeground(new java.awt.Color(0, 51, 153));
        md1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                md1ActionPerformed(evt);
            }
        });
        jPanel1.add(md1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 158, 33));

        md2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        md2.setForeground(new java.awt.Color(0, 51, 153));
        md2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                md2ActionPerformed(evt);
            }
        });
        jPanel1.add(md2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 158, 33));

        md3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        md3.setForeground(new java.awt.Color(0, 51, 153));
        md3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                md3ActionPerformed(evt);
            }
        });
        jPanel1.add(md3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 158, 33));

        md4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        md4.setForeground(new java.awt.Color(0, 51, 153));
        md4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                md4ActionPerformed(evt);
            }
        });
        jPanel1.add(md4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 158, 33));

        md5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        md5.setForeground(new java.awt.Color(0, 51, 153));
        md5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                md5ActionPerformed(evt);
            }
        });
        jPanel1.add(md5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 158, 33));

        fw1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fw1.setForeground(new java.awt.Color(0, 51, 153));
        fw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fw1ActionPerformed(evt);
            }
        });
        jPanel1.add(fw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 158, 33));

        fw2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fw2.setForeground(new java.awt.Color(0, 51, 153));
        fw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fw2ActionPerformed(evt);
            }
        });
        jPanel1.add(fw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 158, 33));

        df1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        df1.setForeground(new java.awt.Color(0, 51, 153));
        df1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                df1ActionPerformed(evt);
            }
        });
        jPanel1.add(df1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 158, 33));

        df2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        df2.setForeground(new java.awt.Color(0, 51, 153));
        df2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                df2ActionPerformed(evt);
            }
        });
        jPanel1.add(df2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 158, 33));

        df3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        df3.setForeground(new java.awt.Color(0, 51, 153));
        df3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                df3ActionPerformed(evt);
            }
        });
        jPanel1.add(df3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 158, 33));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 90, 30));

        Formation.setBackground(new java.awt.Color(51, 0, 102));
        Formation.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Formation.setForeground(new java.awt.Color(255, 255, 255));
        Formation.setText("Squad");
        Formation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormationActionPerformed(evt);
            }
        });
        jPanel1.add(Formation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FW");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DF");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DF");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DF");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MF");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("FW");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormationActionPerformed

        dispose();
        Formation s = new Formation(single_player.getName());
        
    }//GEN-LAST:event_FormationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean flag1 = true;
        boolean flag2 = true;
        
        try {
            for (int i = 1; i < 11; i++) {
                for (int j = 1; j < 11; j++) {
                    if (i != j) {
                        if (single_player.getPlayerNamefromSquad(i).equalsIgnoreCase(single_player.getPlayerNamefromSquad(j))) {
                            JOptionPane.showMessageDialog(null, "you cannot the same player twice", "warrning", JOptionPane.WARNING_MESSAGE);
                            flag1 = false;
                            break;
                        }
                    }
                }

                if (flag1 == false) {
                    break;
                }
            }
            for (int i = 0; i < 11; i++) {
                int counter = 0;
                for (int j = 0; j < 11; j++) {
                    if (single_player.getClubSquad(i).equalsIgnoreCase(single_player.getClubSquad(j))) {
                        counter++;
                        if (counter > 3) {
                            JOptionPane.showMessageDialog(null, "you cannot select more than three players from the same club", "warrning", JOptionPane.WARNING_MESSAGE);
                            flag2 = false;
                            break;
                        }
                    }
                    if (flag2 == false) {
                        break;
                    }
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "you have to select all players", "warrning", JOptionPane.WARNING_MESSAGE);
            flag1 = false;
            flag2 = false;
        }

        if (flag1 == true && flag2 == true) {
            setVisible(false);
            Points p;
            try {
                p = new Points(single_player);
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("class not found or sql exception");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void df3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_df3ActionPerformed

        single_player.instantiate(3, 2);
        String playerName = String.valueOf(df3.getSelectedItem()).substring(4);
        String clubName = String.valueOf(df3.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < defender.length; i++) {
            if (defender[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(3, defender[i].getName(), defender[i].getClub(),
                    defender[i].getPosition(), defender[i].getGoals(), defender[i].getAssist(), defender[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_df3ActionPerformed

    private void df2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_df2ActionPerformed

        single_player.instantiate(2, 2);
        String playerName = String.valueOf(df2.getSelectedItem()).substring(4);
        String clubName = String.valueOf(df2.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < defender.length; i++) {
            if (defender[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(2, defender[i].getName(), defender[i].getClub(),
                    defender[i].getPosition(), defender[i].getGoals(), defender[i].getAssist(), defender[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_df2ActionPerformed

    private void df1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_df1ActionPerformed

        single_player.instantiate(1, 2);
        String playerName = String.valueOf(df1.getSelectedItem()).substring(4);
        String clubName = String.valueOf(df1.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < defender.length; i++) {
            if (defender[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(1, defender[i].getName(), defender[i].getClub(),
                    defender[i].getPosition(), defender[i].getGoals(), defender[i].getAssist(), defender[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_df1ActionPerformed

    private void fw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fw2ActionPerformed

        single_player.instantiate(10, 4);
        String playerName = String.valueOf(fw2.getSelectedItem()).substring(4);
        String clubName = String.valueOf(fw2.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < forward.length; i++) {
            if (forward[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(10, forward[i].getName(), forward[i].getClub(),
                    forward[i].getPosition(), forward[i].getGoals(), forward[i].getAssist(), forward[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_fw2ActionPerformed

    private void fw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fw1ActionPerformed

        single_player.instantiate(9, 4);
        String playerName = String.valueOf(fw1.getSelectedItem()).substring(4);
        String clubName = String.valueOf(fw1.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < forward.length; i++) {
            if (forward[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(9, forward[i].getName(), forward[i].getClub(),
                    forward[i].getPosition(), forward[i].getGoals(), forward[i].getAssist(), forward[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_fw1ActionPerformed

    private void md5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_md5ActionPerformed

        single_player.instantiate(8, 3);
        String playerName = String.valueOf(md5.getSelectedItem()).substring(4);
        String clubName = String.valueOf(md5.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < mid.length; i++) {
            if (mid[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(8, mid[i].getName(), mid[i].getClub(),
                    mid[i].getPosition(), mid[i].getGoals(), mid[i].getAssist(), mid[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_md5ActionPerformed

    private void md4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_md4ActionPerformed

        single_player.instantiate(7, 3);
        String playerName = String.valueOf(md4.getSelectedItem()).substring(4);
        String clubName = String.valueOf(md4.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < mid.length; i++) {
            if (mid[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(7, mid[i].getName(), mid[i].getClub(),
                    mid[i].getPosition(), mid[i].getGoals(), mid[i].getAssist(), mid[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_md4ActionPerformed

    private void md3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_md3ActionPerformed

        single_player.instantiate(6, 3);
        String playerName = String.valueOf(md3.getSelectedItem()).substring(4);
        String clubName = String.valueOf(md3.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < mid.length; i++) {
            if (mid[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(6, mid[i].getName(), mid[i].getClub(),
                    mid[i].getPosition(), mid[i].getGoals(), mid[i].getAssist(), mid[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_md3ActionPerformed

    private void md2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_md2ActionPerformed

        single_player.instantiate(5, 3);
        String playerName = String.valueOf(md2.getSelectedItem()).substring(4);
        String clubName = String.valueOf(md2.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < mid.length; i++) {
            if (mid[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(5, mid[i].getName(), mid[i].getClub(),
                    mid[i].getPosition(), mid[i].getGoals(), mid[i].getAssist(), mid[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_md2ActionPerformed

    private void md1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_md1ActionPerformed

        single_player.instantiate(4, 3);
        String playerName = String.valueOf(md1.getSelectedItem()).substring(4);
        String clubName = String.valueOf(md1.getSelectedItem()).substring(0, 3);
        for (int i = 0; i < mid.length; i++) {
            if (mid[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(4, mid[i].getName(), mid[i].getClub(),
                    mid[i].getPosition(), mid[i].getGoals(), mid[i].getAssist(), mid[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_md1ActionPerformed

    private void gk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gk1ActionPerformed

        single_player.instantiate(0, 1);
        String playerName = String.valueOf(gk1.getSelectedItem()).substring(4);
        String clubName = String.valueOf(gk1.getSelectedItem()).substring(0, 3);
        for (int i = 0; i <goalkeeper.length; i++) {
            if (goalkeeper[i].getName().trim().replaceAll("\\s+", "").equalsIgnoreCase(playerName.trim().replaceAll("\\s+", ""))) {
                single_player.setList(0, goalkeeper[i].getName(), goalkeeper[i].getClub(),
                    goalkeeper[i].getPosition(), goalkeeper[i].getGoals(), goalkeeper[i].getAssist(), goalkeeper[i].getCleansheet());
            }
        }
    }//GEN-LAST:event_gk1ActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Formation;
    private javax.swing.JComboBox<String> df1;
    private javax.swing.JComboBox<String> df2;
    private javax.swing.JComboBox<String> df3;
    private javax.swing.JComboBox<String> fw1;
    private javax.swing.JComboBox<String> fw2;
    private javax.swing.JComboBox<String> gk1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> md1;
    private javax.swing.JComboBox<String> md2;
    private javax.swing.JComboBox<String> md3;
    private javax.swing.JComboBox<String> md4;
    private javax.swing.JComboBox<String> md5;
    // End of variables declaration//GEN-END:variables
}
