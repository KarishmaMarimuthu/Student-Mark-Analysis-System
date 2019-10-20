package mas;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class StudentFrame extends javax.swing.JFrame {
private static Connection connection=null;

    JTable table,table1,table2;
    DefaultTableModel jmodel,jmodel1,jmodel2;
    LoginFrame frame;
    int gradePoint;
    float gpa;
    float numerator=0;
    float numerators[]=new float[50];
    float credit=0;
    float credits[]= new float[100];
    String grade,roll;
    String user1,dept;
    String pass1;
    public StudentFrame(JFrame frame,String user,String pass) {
        initComponents();
        this.user1 = user;
        this.pass1 = pass;
        this.frame = (LoginFrame)frame;
        connection=MAS.getConnection();
        initTable();
        refreshSemesterList();
    }
    private String gpaCalculation(){
        int i;
        for(i=0;i<jmodel.getRowCount();i++){
        try{
            String query = "Select * from grade where subject=? and student=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,(String)jmodel.getValueAt(i,0));
            statement.setString(2,(String)jmodel1.getValueAt(0,0));
            ResultSet result=statement.executeQuery();
            while(result.next()){
                grade = result.getString("grade");
                credits[i] = result.getInt("credits");
            }
            if(grade.equals("S")){
                gradePoint=10;
                numerators[i] = gradePoint*credits[i];
            }
            else if(grade.equals("A")){
                gradePoint=9;
                numerators[i] = gradePoint*credits[i];
            }
            else if(grade.equals("B")){
                gradePoint=8;
                numerators[i] = gradePoint*credits[i];
            }
            else if(grade.equals("C")){
                gradePoint=7;
                numerators[i] = gradePoint*credits[i];
            }
            else if(grade.equals("D")){
                gradePoint=6;
                numerators[i] = gradePoint*credits[i];            
            }
            else if(grade.equals("E")){
                gradePoint=5;
                numerators[i] = gradePoint*credits[i];
            }
            else{
                gradePoint=0;
                numerator = gradePoint*credits[i];
                System.out.println(numerator);
            }
            credit = credit+credits[i];
            numerator=numerator+numerators[i];
            }catch(Exception e){
            e.printStackTrace();
        }
      }
        gpa = numerator/credit;
        String gradePointAverage = String.format ("%.2f", gpa);
        return gradePointAverage;
    }
    private void initTable2(){
            table2=new JTable();
            jmodel2=new DefaultTableModel();
            String[] cols={"GPA"};

            table2.setModel(jmodel2);
            jmodel2.setColumnIdentifiers(cols);
            table2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jmodel2.addRow(new Object[]{
                gpaCalculation()
            });
            gpaPanel.add(table2);
            this.show();
    }
    private void initTable(){

        try{
            String query="select distinct * from students where name=? and roll=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,user1 );
            statement.setString(2,pass1 );
            
            table1=new JTable();
            jmodel1=new DefaultTableModel();
            String[] cols={"Name","Rollno","Department","Year"};

            table1.setModel(jmodel1);
            jmodel1.setColumnIdentifiers(cols);
            table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            ResultSet result=statement.executeQuery();
            while(result.next()){
            jmodel1.addRow(new Object[]{
                
                user1,
                roll = pass1,   
                dept = result.getString("dept"),
                result.getString("deptyear"),
            });
            }
            studentPanel.add(table1);
            this.show();
            
            }catch(Exception e){
            e.printStackTrace();
        }
     }
    private void initTable1(){

        try{
            String query="select distinct subject,grade from grade where student=? and rollno=? and semester=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,user1);
            statement.setString(2,pass1);
            statement.setString(3,(String)comboStudentSemester.getSelectedItem());
            table=new JTable();
            jmodel=new DefaultTableModel();
            String[] cols={"Subject","Grade"};

            table.setModel(jmodel);
            jmodel.setColumnIdentifiers(cols);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            ResultSet result=statement.executeQuery();
            while(result.next()){
            jmodel.addRow(new Object[]{
                result.getString("subject"),
                result.getString("grade")
            });
            }
            gradePanel.add(table);
            this.show();
            
            }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void refreshSemesterList(){
        try{
            String query="SELECT DISTINCT SEMESTER FROM GRADE WHERE student=? and rollno=?";   
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,user1);
            statement.setString(2,pass1);
            ResultSet result=statement.executeQuery();
            comboStudentSemester.removeAllItems();
            while(result.next()){
              comboStudentSemester.addItem(result.getString("semester"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        studentPanel = new javax.swing.JPanel();
        gpaPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradePanel = new javax.swing.JPanel();
        btnCGPA = new javax.swing.JButton();
        comboStudentSemester = new javax.swing.JComboBox<>();
        btnResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Welcome Student");

        back.setText("Logout");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setText("NAME");

        jLabel3.setText("ROLL NO");

        jLabel4.setText("DEPARTMENT");

        jLabel5.setText("YEAR");

        jLabel6.setText("SEMESTER");

        jLabel7.setText("SUBJECT");

        jLabel8.setText("GRADE");

        studentPanel.setLayout(new java.awt.BorderLayout());

        gpaPanel.setLayout(new java.awt.BorderLayout());

        jLabel9.setText("GPA ");

        gradePanel.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(gradePanel);

        btnCGPA.setText("Calculate CGPA");
        btnCGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCGPAActionPerformed(evt);
            }
        });

        btnResult.setText("Show Result");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addComponent(gpaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCGPA)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addGap(363, 363, 363)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studentPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel3)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel4)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboStudentSemester, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6))
                            .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboStudentSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResult)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(gpaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCGPA, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
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

    private void btnCGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCGPAActionPerformed
         new CGPAFrame(this,user1,dept,roll).setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_btnCGPAActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        initTable1();
        initTable2();
    }//GEN-LAST:event_btnResultActionPerformed

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnCGPA;
    private javax.swing.JButton btnResult;
    private javax.swing.JComboBox<String> comboStudentSemester;
    private javax.swing.JPanel gpaPanel;
    private javax.swing.JPanel gradePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel studentPanel;
    // End of variables declaration//GEN-END:variables

    
}
