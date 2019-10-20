
package mas;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FacultyFrame extends javax.swing.JFrame {

    
    JTable table,table1,table2;
    DefaultTableModel jmodel,jmodel1,jmodel2;
    private static Connection connection=null;
    LoginFrame frame;
    String user1;
    String pass1;
    public FacultyFrame(JFrame frame,String user,String pass) {
        initComponents();
        this.user1 = user;
        this.pass1 = pass;
        this.frame = (LoginFrame)frame;
        connection=MAS.getConnection();
        facultyFrame();
        refreshDeptList();
        refreshYearList();
        refreshSemesterList();
        refreshSubjectList();
        credits();      
    }
    
    protected void editRecord(){
        boolean state = false;
        for(int i=0;i<jmodel.getRowCount();i++){
        
        try{
            String query="Update grade set grade=?,department=?,deptyear=?,semester=?,student=?,subject=?,rollno=? where id=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,(String) jmodel.getValueAt(i,3));
            statement.setString(2,(String) comboDept.getSelectedItem());
            statement.setString(3,(String) comboYear.getSelectedItem());
            statement.setString(4,(String) comboSemester.getSelectedItem());
            statement.setString(6,(String) comboSubject.getSelectedItem());
            statement.setString(5,(String) jmodel.getValueAt(i,1));
            statement.setString(7,(String) jmodel.getValueAt(i,2));
            statement.setInt(8,Integer.parseInt(jmodel.getValueAt(i,0).toString()));
            statement.execute();
            state = true;
            }catch(Exception e){
            e.printStackTrace();
        }
        }
        if(state){
              JOptionPane.showMessageDialog(this, "Grades are edited", "MAS", JOptionPane.INFORMATION_MESSAGE);
          }else{
              JOptionPane.showMessageDialog(this, "Editing Failed !", "MAS", JOptionPane.ERROR_MESSAGE);
          }
    }
    protected void initTable1(){
        boolean state = false;
        try{
            String query="select * from grade where department=? and deptyear=? and semester=? and subject=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,(String) comboDept.getSelectedItem());
            statement.setString(2,(String) comboYear.getSelectedItem());
            statement.setString(3,(String) comboSemester.getSelectedItem());
            statement.setString(4,(String) comboSubject.getSelectedItem());
            
            table=new JTable();
            jmodel=new DefaultTableModel();
            String[] cols={"ID","Name","Roll","Grade"};

            table.setModel(jmodel);
            jmodel.setColumnIdentifiers(cols);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            ResultSet result=statement.executeQuery();
            
            while(result.next()){
            jmodel.addRow(new Object[]{
                result.getInt("id"),
                result.getString("student"),
                result.getString("rollno"),                
                result.getString("grade")
            });
            state = true;
            }
            if(state){
              JOptionPane.showMessageDialog(this, "Records are refreshed", "MAS", JOptionPane.INFORMATION_MESSAGE);
            }else{
              JOptionPane.showMessageDialog(this, "No Records Found!", "MAS", JOptionPane.ERROR_MESSAGE);
            }
            studentsPanel.add(table);
            this.show();
            }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    private void credits(){
        try{
            String query = "Select credits from subject where subject=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,(String)comboSubject.getSelectedItem());
            table2=new JTable();
            jmodel2=new DefaultTableModel();
            String[] cols={"Credits"};

            table2.setModel(jmodel2);
            jmodel2.setColumnIdentifiers(cols);
            table2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            ResultSet result=statement.executeQuery();
            while(result.next()){
            jmodel2.addRow(new Object[]{
                result.getString("credits")
            });
            }
            creditsPanel.add(table2);
            this.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void facultyFrame(){
         table=new JTable();
            jmodel=new DefaultTableModel();
            String[] cols={"Name"};

            table.setModel(jmodel);
            jmodel.setColumnIdentifiers(cols);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jmodel.addRow(new Object[]{
                user1
            });
            facultyPanel.add(table);
            this.show();
    }
    private void refreshSemesterList(){
        try{
            String query="SELECT DISTINCT SEMESTER FROM FACULTY WHERE name=? and password=?";   
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,user1);
            statement.setString(2,pass1);
            ResultSet result=statement.executeQuery();
            comboSemester.removeAllItems();
            while(result.next()){
              comboSemester.addItem(result.getString("semester"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void refreshDeptList(){
        try{
            String query="SELECT DISTINCT department FROM FACULTY WHERE name=? and password=?";   
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,user1);
            statement.setString(2,pass1);
            ResultSet result=statement.executeQuery();
            comboDept.removeAllItems();
            while(result.next()){
              comboDept.addItem(result.getString("department"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     private void refreshYearList(){
        try{
            String query="SELECT DISTINCT deptyear FROM FACULTY WHERE name=? and password=?";   
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,user1);
            statement.setString(2,pass1);
            ResultSet result=statement.executeQuery();
            comboYear.removeAllItems();
            while(result.next()){
              comboYear.addItem(result.getString("deptyear"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     private void refreshSubjectList(){
        try{
            String query="SELECT DISTINCT SUBJECT FROM FACULTY WHERE name=? and password=?";   
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,user1);
            statement.setString(2,pass1);
            ResultSet result=statement.executeQuery();
            comboSubject.removeAllItems();
            while(result.next()){
              comboSubject.addItem(result.getString("subject"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected void initTable(){

        try{
            String query="select * from students where dept=? and deptyear=? and semester=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,(String) comboDept.getSelectedItem());
            statement.setString(2,(String) comboYear.getSelectedItem());
            statement.setString(3,(String) comboSemester.getSelectedItem());
            
            table=new JTable();
            jmodel=new DefaultTableModel();
            String[] cols={"Name","Rollno","Grade"};

            table.setModel(jmodel);
            jmodel.setColumnIdentifiers(cols);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            ResultSet result=statement.executeQuery();
            while(result.next()){
            jmodel.addRow(new Object[]{
                result.getString("name"),
                result.getString("roll"),
                //result.getInt("credits"),
                result.getString("grade")
            });
            }
            studentsPanel.add(table);
            this.show();
            }catch(Exception e){
            e.printStackTrace();
        }
    }   
    protected void updateRecords(){
        boolean state = false;
        for(int i=0;i<jmodel.getRowCount();i++){
            try{
          String query="INSERT INTO GRADE(DEPARTMENT,DEPTYEAR,SEMESTER,STUDENT,SUBJECT,ROLLNO,GRADE,CREDITS) VALUES(?,?,?,?,?,?,?,?)";
          PreparedStatement statement=connection.prepareStatement(query);
          statement.setString(1,(String)comboDept.getSelectedItem());
          statement.setString(2,(String)comboYear.getSelectedItem());
          statement.setString(3,(String)comboSemester.getSelectedItem());
          statement.setString(4, (String)jmodel.getValueAt(i,0));
          statement.setString(5,(String) comboSubject.getSelectedItem());
          statement.setString(6, (String)jmodel.getValueAt(i,1));
          statement.setString(7,(String) jmodel.getValueAt(i,2));
          statement.setInt(8,Integer.parseInt(jmodel2.getValueAt(0,0).toString()));
          statement.execute();
          state = true;
                  
      }catch(Exception e){
          e.printStackTrace();
      }  
        }
        if(state){
              JOptionPane.showMessageDialog(this, "Grades are updated", "MAS", JOptionPane.INFORMATION_MESSAGE);
          }else{
              JOptionPane.showMessageDialog(this, "Updating Failed !", "MAS", JOptionPane.ERROR_MESSAGE);
          }
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        butUpdateGrade = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        facultyPanel = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        studentsScroll = new javax.swing.JScrollPane();
        studentsPanel = new javax.swing.JPanel();
        creditsPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        comboSubject = new javax.swing.JComboBox<>();
        comboSemester = new javax.swing.JComboBox<>();
        comboYear = new javax.swing.JComboBox<>();
        comboDept = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Welcome Faculty");

        back.setText("Logout");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HANDLING YEAR");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HANDLING SEM");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HANDLING SUB");

        btnShow.setText("Enter Grade");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        butUpdateGrade.setText("Update Grade");
        butUpdateGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateGradeActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("STUDENT NAME");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ROLL NO");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("GRADE");

        btnRefresh.setText("Refresh Records");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel9.setText("HANDLING DEPT");

        facultyPanel.setLayout(new java.awt.BorderLayout());

        btnEdit.setText("Edit Updated Grade");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        studentsPanel.setLayout(new java.awt.BorderLayout());
        studentsScroll.setViewportView(studentsPanel);

        creditsPanel.setLayout(new java.awt.BorderLayout());

        jLabel10.setText("SUB CREDITS");

        comboSubject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSubjectItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(studentsScroll, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(butUpdateGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboDept, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(creditsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(facultyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(back))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creditsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(comboDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(facultyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShow)
                    .addComponent(butUpdateGrade)
                    .addComponent(btnEdit)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addComponent(studentsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       frame.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        initTable();
    }//GEN-LAST:event_btnShowActionPerformed

    private void butUpdateGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateGradeActionPerformed
        updateRecords();
    }//GEN-LAST:event_butUpdateGradeActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
       initTable1();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        editRecord();
    }//GEN-LAST:event_btnEditActionPerformed

    private void comboSubjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSubjectItemStateChanged
        try{
            PreparedStatement statement=connection.prepareStatement("SELECT DISTINCT SEMESTER FROM FACULTY WHERE SUBJECT=?");
            statement.setString(1, evt.getItem().toString());
            ResultSet result=statement.executeQuery();           
            comboSemester.removeAllItems();
            while(result.next()){            
                comboSemester.addItem(result.getString("semester"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboSubjectItemStateChanged
    
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
            java.util.logging.Logger.getLogger(FacultyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton butUpdateGrade;
    private javax.swing.JComboBox<String> comboDept;
    private javax.swing.JComboBox<String> comboSemester;
    private javax.swing.JComboBox<String> comboSubject;
    private javax.swing.JComboBox<String> comboYear;
    private javax.swing.JPanel creditsPanel;
    private javax.swing.JPanel facultyPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel studentsPanel;
    private javax.swing.JScrollPane studentsScroll;
    // End of variables declaration//GEN-END:variables
}
