
package mas;

import java.sql.*;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CGPAFrame extends javax.swing.JFrame {
    private static Connection connection=null;
    StudentFrame frame;
    String student,dept,rollno;
    JTable table,table1,table2,table3,table4;
    DefaultTableModel jmodel,jmodel1,jmodel2,jmodel3,jmodel4;
    int gradePoint;
    float gpa;
    float numerator=0;
    float numerators[]=new float[50];
    float credit=0;
    float credits[]= new float[100];
    String grade;
    public CGPAFrame(JFrame frame,String user,String dept,String rollno) {
        initComponents();
        this.student = user;
        this.dept = dept;
        this.rollno = rollno;
        this.frame=(StudentFrame)frame;
        connection=MAS.getConnection();
        initTable();
        initTable1();
        initTable2();
        grades();
        cgpa();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cgpaPanel = new javax.swing.JPanel();
        cgpaDisplayPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        deptPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rollnoPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CGPA Calculation");

        jLabel2.setText("Name");

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        cgpaPanel.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(cgpaPanel);

        cgpaDisplayPanel.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Subject");

        jLabel4.setText("Semester");

        jLabel5.setText("Credits");

        jLabel6.setText("CGPA");

        jLabel7.setText("Grade");

        jLabel8.setText("Department");

        namePanel.setLayout(new java.awt.BorderLayout());

        deptPanel.setLayout(new java.awt.BorderLayout());

        jLabel9.setText("Roll No");

        rollnoPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addComponent(cgpaDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                                .addComponent(backbtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel4)
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(rollnoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addGap(42, 42, 42)
                        .addComponent(deptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel7)
                        .addGap(152, 152, 152))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rollnoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(deptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cgpaDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initTable(){
            table=new JTable();
            jmodel=new DefaultTableModel();
            String[] cols={"Name"};

            table.setModel(jmodel);
            jmodel.setColumnIdentifiers(cols);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jmodel.addRow(new Object[]{
                student
            });
            namePanel.add(table);
            this.show();
    }
    private void initTable1(){
            table1=new JTable();
            jmodel1=new DefaultTableModel();
            String[] cols={"Roll No"};

            table1.setModel(jmodel1);
            jmodel1.setColumnIdentifiers(cols);
            table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jmodel1.addRow(new Object[]{
                rollno
            });
            rollnoPanel.add(table1);
            this.show();
    }
    private void initTable2(){
            table2=new JTable();
            jmodel2=new DefaultTableModel();
            String[] cols={"Roll No"};

            table2.setModel(jmodel2);
            jmodel2.setColumnIdentifiers(cols);
            table2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jmodel2.addRow(new Object[]{
                dept
            });
            deptPanel.add(table2);
            this.show();
    }
    private void grades(){

        try{
            String query="select distinct * from grade where student=? and rollno=? and department=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1,student);
            statement.setString(2,rollno);
            statement.setString(3,dept);
            table3=new JTable();
            jmodel3=new DefaultTableModel();
            String[] cols={"Semester","Credits","Subject","Grade"};

            table3.setModel(jmodel3);
            jmodel3.setColumnIdentifiers(cols);
            table3.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            ResultSet result=statement.executeQuery();
            while(result.next()){
            jmodel3.addRow(new Object[]{
                result.getString("semester"),
                result.getInt("credits"),
                result.getString("subject"),
                result.getString("grade")
            });
            }
            cgpaPanel.add(table3);
            this.show();
            
            }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void cgpa(){
            table4=new JTable();
            jmodel4=new DefaultTableModel();
            String[] cols={"GPA"};

            table4.setModel(jmodel4);
            jmodel4.setColumnIdentifiers(cols);
            table4.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jmodel4.addRow(new Object[]{
                cgpaCalculation()
            });
            cgpaDisplayPanel.add(table4);
            this.show();
    }
    private String cgpaCalculation(){
        int i;
        for(i=0;i<jmodel3.getRowCount();i++){
        try{
            String query = "Select * from grade where subject=? and student=? and rollno=? and department=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,(String)jmodel3.getValueAt(i,2));
            statement.setString(2,(String)jmodel.getValueAt(0,0));
            statement.setString(3,(String)jmodel1.getValueAt(0,0));
            statement.setString(4,(String)jmodel2.getValueAt(0,0));
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
    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

       
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
            java.util.logging.Logger.getLogger(CGPAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CGPAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CGPAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CGPAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton backbtn;
    private javax.swing.JPanel cgpaDisplayPanel;
    private javax.swing.JPanel cgpaPanel;
    private javax.swing.JPanel deptPanel;
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
    private javax.swing.JPanel namePanel;
    private javax.swing.JPanel rollnoPanel;
    // End of variables declaration//GEN-END:variables
}
