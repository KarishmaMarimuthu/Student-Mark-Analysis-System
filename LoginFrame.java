
package mas;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {
    private static Connection connection;
    FrontPage frame;
    public LoginFrame(JFrame frame) {
        this.frame = (FrontPage)frame;
        initComponents();
        connection=MAS.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        butLogin = new javax.swing.JButton();
        butReset = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 130, 48, 14);
        jPanel2.add(txtUser);
        txtUser.setBounds(100, 80, 120, 30);

        butLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        butLogin.setText("Login");
        butLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLoginActionPerformed(evt);
            }
        });
        jPanel2.add(butLogin);
        butLogin.setBounds(140, 230, 80, 23);

        butReset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        butReset.setText("Reset");
        butReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butResetActionPerformed(evt);
            }
        });
        jPanel2.add(butReset);
        butReset.setBounds(20, 230, 80, 23);
        jPanel2.add(txtPassword);
        txtPassword.setBounds(100, 120, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("User Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 90, 58, 14);

        comboRole.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Faculty", "Admin" }));
        jPanel2.add(comboRole);
        comboRole.setBounds(100, 160, 120, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Page");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 30, 88, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Role");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 170, 24, 14);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butResetActionPerformed
        reset();
    }//GEN-LAST:event_butResetActionPerformed

    private void butLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLoginActionPerformed

        if(validateFields()){
            String query="SELECT * FROM users where name=? AND password=? AND role=?";
            try{
                PreparedStatement statement=connection.prepareStatement(query);
                statement.setString(1, txtUser.getText());
                statement.setString(2, txtPassword.getText());
                String role=(String) comboRole.getSelectedItem();
                statement.setString(3, role);
                ResultSet result=statement.executeQuery();
                boolean state=false;
                if(result.next()){
                    state=true;
                    if(role.equals("Admin")){
                        AdminFrame frame = new AdminFrame(this);
                        frame.setVisible(true);
                        this.setVisible(false);
                    }
                }
                else if(role.equals("Faculty")){
                        faculty();
                    }
                else if(role.equals("Student")){
                    student();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid Details !", "MAS", JOptionPane.ERROR_MESSAGE); 
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please fill in all the details", "MAS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butLoginActionPerformed
    private boolean validateFields(){
        if(txtUser.getText().length()!=0 && txtPassword.getText().length()!=0){
            return true;
        }else{
            return false;
        }
    }
    private void student(){
        String query="SELECT * FROM students where name=? AND password=? AND role=?";
        try{
            
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, txtUser.getText());
            statement.setString(2, txtPassword.getText());
            String role=(String) comboRole.getSelectedItem();
            statement.setString(3, role);
            ResultSet result=statement.executeQuery();
            boolean state=false;
            if(result.next()){
                state=true;
                if(role.equals("Student")){
                    new StudentFrame(this,txtUser.getText(),txtPassword.getText()).setVisible(true);
                    this.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Invalid details!", "MAS", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void faculty() {
        String query="SELECT * FROM faculty where name=? AND password=? AND role=?";
        try{
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, txtUser.getText());
            statement.setString(2, txtPassword.getText());
            String role=(String) comboRole.getSelectedItem();
            statement.setString(3, role);
            ResultSet result=statement.executeQuery();
            boolean state=false;
            if(result.next()){
                state=true;
                if(role.equals("Faculty")){
                    new FacultyFrame(this, txtUser.getText(),txtPassword.getText()).setVisible(true);
                    this.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Invalid details!", "MAS", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }
    public void reset(){
        txtUser.setText("");
        txtPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butLogin;
    private javax.swing.JButton butReset;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    
}
