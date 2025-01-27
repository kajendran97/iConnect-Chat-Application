package iconnect;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ragulravindiran
 */
public class createThread extends javax.swing.JFrame {

    // create the connection with database
    Connection conn = new dbConnection().connect();

    /**
     * Creates new form createThread
     */
    public createThread() {
        initComponents();
        // setting the frame location to the middle
        setLocationRelativeTo(this);
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
        createThreadHeadLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        threadTitleLbl = new javax.swing.JLabel();
        creatorLbl = new javax.swing.JLabel();
        threadHead = new javax.swing.JTextField();
        creator = new javax.swing.JTextField();
        createThreadBtn = new javax.swing.JButton();
        backToSelectThreadBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        createThreadHeadLbl.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        createThreadHeadLbl.setForeground(new java.awt.Color(255, 153, 0));
        createThreadHeadLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createThreadHeadLbl.setText("#iConnect THREAD CREATE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(createThreadHeadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(createThreadHeadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        copyrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        copyrightLbl.setForeground(new java.awt.Color(255, 153, 0));
        copyrightLbl.setText("Copyright #iConnect, 2018");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(copyrightLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(copyrightLbl)
                .addContainerGap())
        );

        threadTitleLbl.setBackground(new java.awt.Color(0, 102, 153));
        threadTitleLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        threadTitleLbl.setForeground(new java.awt.Color(255, 153, 0));
        threadTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        threadTitleLbl.setText("TITLE");
        threadTitleLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        threadTitleLbl.setOpaque(true);

        creatorLbl.setBackground(new java.awt.Color(0, 102, 153));
        creatorLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        creatorLbl.setForeground(new java.awt.Color(255, 153, 0));
        creatorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creatorLbl.setText("CREATED BY");
        creatorLbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        creatorLbl.setOpaque(true);

        threadHead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        threadHead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threadHeadActionPerformed(evt);
            }
        });

        creator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        creator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creatorActionPerformed(evt);
            }
        });

        createThreadBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        createThreadBtn.setForeground(new java.awt.Color(102, 102, 102));
        createThreadBtn.setText("Create Thread");
        createThreadBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createThreadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createThreadBtnActionPerformed(evt);
            }
        });

        backToSelectThreadBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backToSelectThreadBtn.setForeground(new java.awt.Color(102, 102, 102));
        backToSelectThreadBtn.setText("Go Back");
        backToSelectThreadBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backToSelectThreadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToSelectThreadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(threadHead)
                            .addComponent(threadTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(creatorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(creator)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(createThreadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backToSelectThreadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(creatorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(threadTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(threadHead, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creator, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addComponent(createThreadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToSelectThreadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void threadHeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threadHeadActionPerformed
        
    }//GEN-LAST:event_threadHeadActionPerformed

    private void creatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creatorActionPerformed
        
    }//GEN-LAST:event_creatorActionPerformed

    private void createThreadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createThreadBtnActionPerformed

        String title = threadHead.getText();
        String createdBy = creator.getText();
        String editedTime = new SimpleDateFormat("yyyy/MM/dd || HH:mm:ss").format(Calendar.getInstance().getTime());

        if (evt.getSource() == createThreadBtn) {

            // check for empty fields
            if (title.isEmpty() || createdBy.isEmpty()) {

                // error messasges
                JOptionPane.showMessageDialog(null, "Please fill all the required fileds....!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                // call threadCreate() from server
                threadCreate(title, editedTime, createdBy);

                this.dispose();
                // sucess messasges
                JOptionPane.showMessageDialog(null, "Successfully Created Thread", "Success", JOptionPane.INFORMATION_MESSAGE);
                
                // direct select thread if creating thread is successful
                selectThread st = new selectThread();
                st.setVisible(true);
            }
        }

    }//GEN-LAST:event_createThreadBtnActionPerformed

    private void backToSelectThreadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToSelectThreadBtnActionPerformed

        // direct back to select thread page
        this.dispose();
        selectThread st = new selectThread();
        st.setVisible(true);
    }//GEN-LAST:event_backToSelectThreadBtnActionPerformed

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
            java.util.logging.Logger.getLogger(createThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createThread().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToSelectThreadBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton createThreadBtn;
    private javax.swing.JLabel createThreadHeadLbl;
    private javax.swing.JTextField creator;
    private javax.swing.JLabel creatorLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField threadHead;
    private javax.swing.JLabel threadTitleLbl;
    // End of variables declaration//GEN-END:variables

    private static void threadCreate(java.lang.String titleThread, java.lang.String lastEditedTime, java.lang.String editedBy) {
        iconnect.IConnectChatApp_Service service = new iconnect.IConnectChatApp_Service();
        iconnect.IConnectChatApp port = service.getIConnectChatAppPort();
        port.threadCreate(titleThread, lastEditedTime, editedBy);
    }

}
