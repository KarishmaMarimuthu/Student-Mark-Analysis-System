
package mas;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminFrame extends javax.swing.JFrame {

    private static Connection connection=null;
    LoginFrame frame;
    public AdminFrame(JFrame frame) {
        initComponents();
        this.frame = (LoginFrame)frame;
        connection=MAS.getConnection();
        refreshDepartmentList();
        refreshYearList();
        refreshSubjectList();
        refreshStudentList();
        refreshSemesterList();
        refreshFacultyList();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabPane = new javax.swing.JTabbedPane();
        panDepartment = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtDepartment = new javax.swing.JTextField();
        butAddDepartment = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        butRemoveDepartment = new javax.swing.JButton();
        comboRemoveDepartment = new javax.swing.JComboBox<>();
        panYear = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        comboDepartment = new javax.swing.JComboBox<>();
        comboYear = new javax.swing.JComboBox<>();
        butAddYear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        comboDepartment1 = new javax.swing.JComboBox<>();
        comboYear1 = new javax.swing.JComboBox<>();
        butRemoveYear = new javax.swing.JButton();
        panSubject = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboSubjectDept = new javax.swing.JComboBox<>();
        comboSubjectYear = new javax.swing.JComboBox<>();
        comboSemesterYear = new javax.swing.JComboBox<>();
        txtSubject = new javax.swing.JTextField();
        butAddSubject = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        subjectCredits = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        comboSubject = new javax.swing.JComboBox<>();
        butRemoveSubject = new javax.swing.JButton();
        panStudent = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStudentRoll = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboStudentDept = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboStudentYear = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtStudentPassword = new javax.swing.JTextField();
        butAddStudent = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        comboStudentSemester = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboStudent = new javax.swing.JComboBox<>();
        butRemoveStudent = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnAddFaculty = new javax.swing.JButton();
        facultyName = new javax.swing.JTextField();
        facultyPass = new javax.swing.JTextField();
        comboFacultyDept = new javax.swing.JComboBox<>();
        comboFacultyYear = new javax.swing.JComboBox<>();
        comboSemester = new javax.swing.JComboBox<>();
        comboSubject1 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        comboFaculty = new javax.swing.JComboBox<>();
        btnRemoveFaculty = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Welcome Admin");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Department"));

        butAddDepartment.setText("Add Department");
        butAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                .addComponent(butAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butAddDepartment))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Department"));

        butRemoveDepartment.setText("Remove Department");
        butRemoveDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemoveDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboRemoveDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butRemoveDepartment)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRemoveDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butRemoveDepartment))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panDepartmentLayout = new javax.swing.GroupLayout(panDepartment);
        panDepartment.setLayout(panDepartmentLayout);
        panDepartmentLayout.setHorizontalGroup(
            panDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDepartmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panDepartmentLayout.setVerticalGroup(
            panDepartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDepartmentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPane.addTab("Department", panDepartment);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Year"));

        comboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Year", "Second Year", "Third Year", "Fourth Year" }));

        butAddYear.setText("Add Year");
        butAddYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butAddYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboYear, 0, 175, Short.MAX_VALUE))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butAddYear)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Remove Year"));

        comboDepartment1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDepartment1ItemStateChanged(evt);
            }
        });

        butRemoveYear.setText("Remove Year");
        butRemoveYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemoveYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(comboDepartment1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butRemoveYear, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(comboYear1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(369, 369, 369))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboDepartment1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butRemoveYear)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panYearLayout = new javax.swing.GroupLayout(panYear);
        panYear.setLayout(panYearLayout);
        panYearLayout.setHorizontalGroup(
            panYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panYearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panYearLayout.setVerticalGroup(
            panYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panYearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        tabPane.addTab("Year", panYear);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Subject"));

        jLabel8.setText("Department");

        jLabel9.setText("Year");

        jLabel10.setText("Semester");

        jLabel11.setText("Subject");

        comboSubjectDept.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSubjectDeptItemStateChanged(evt);
            }
        });

        comboSemesterYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII" }));

        butAddSubject.setText("Add ");
        butAddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddSubjectActionPerformed(evt);
            }
        });

        jLabel21.setText("Credits");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSubjectDept, 0, 123, Short.MAX_VALUE)
                    .addComponent(comboSubjectYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboSemesterYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel21))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(subjectCredits))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboSubjectDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboSubjectYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(subjectCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboSemesterYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butAddSubject)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Remove Subject"));

        jLabel12.setText("Select Subject");

        butRemoveSubject.setText("Remove");
        butRemoveSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemoveSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(comboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                .addComponent(butRemoveSubject)
                .addGap(51, 51, 51))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(comboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butRemoveSubject))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panSubjectLayout = new javax.swing.GroupLayout(panSubject);
        panSubject.setLayout(panSubjectLayout);
        panSubjectLayout.setHorizontalGroup(
            panSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSubjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panSubjectLayout.setVerticalGroup(
            panSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSubjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        tabPane.addTab("Subject", panSubject);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Student"));

        jLabel2.setText("Name");

        jLabel3.setText("Roll No");

        jLabel4.setText("Dept");

        comboStudentDept.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboStudentDeptItemStateChanged(evt);
            }
        });

        jLabel5.setText("Year");

        jLabel6.setText("Password");

        butAddStudent.setText("Add");
        butAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddStudentActionPerformed(evt);
            }
        });

        jLabel20.setText("Semester");

        comboStudentSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboStudentDept, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel20))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboStudentYear, 0, 129, Short.MAX_VALUE)
                        .addComponent(txtStudentPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addComponent(comboStudentSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(comboStudentYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboStudentDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel20)
                    .addComponent(comboStudentSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(butAddStudent)
                .addGap(25, 25, 25))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Remove Student"));

        jLabel7.setText("Select Student");

        butRemoveStudent.setText("Remove");
        butRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemoveStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addComponent(comboStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butRemoveStudent)
                .addGap(33, 33, 33))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butRemoveStudent))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panStudentLayout = new javax.swing.GroupLayout(panStudent);
        panStudent.setLayout(panStudentLayout);
        panStudentLayout.setHorizontalGroup(
            panStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panStudentLayout.setVerticalGroup(
            panStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        tabPane.addTab("Student", panStudent);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Faculty"));

        jLabel13.setText("Name");

        jLabel14.setText("Password");

        jLabel15.setText("Dept");

        jLabel16.setText("Handling year");

        jLabel17.setText("Semester");

        jLabel18.setText("Subject");

        btnAddFaculty.setText("Add");
        btnAddFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFacultyActionPerformed(evt);
            }
        });

        comboFacultyDept.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFacultyDeptItemStateChanged(evt);
            }
        });

        comboFacultyYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFacultyYearItemStateChanged(evt);
            }
        });

        comboSemester.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSemesterItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(facultyPass, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(facultyName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboFacultyYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFacultyDept, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(comboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(296, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(btnAddFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(facultyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(facultyPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboFacultyDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(btnAddFaculty)
                    .addComponent(comboFacultyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Remove Faculty"));

        btnRemoveFaculty.setText("Remove");
        btnRemoveFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFacultyActionPerformed(evt);
            }
        });

        jLabel19.setText("Select Faculty");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(comboFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveFaculty)
                    .addComponent(jLabel19))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPane.addTab("Faculty", jPanel10);

        back.setText("Logout");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabPane)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(tabPane)
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

    private void butRemoveDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemoveDepartmentActionPerformed
        if(comboRemoveDepartment.getSelectedItem()!=null){
        try{
            String query="DELETE FROM DEPARTMENT WHERE NAME=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, (String) comboRemoveDepartment.getSelectedItem());
            if(!statement.execute()){
                JOptionPane.showMessageDialog(this, "Department Removed", "MAS", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Department Removing Failed", "MAS", JOptionPane.ERROR_MESSAGE);
            }
            refreshDepartmentList();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Choose a valid selection from the list", "MAS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butRemoveDepartmentActionPerformed
   
    private void butAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddDepartmentActionPerformed
      if(txtDepartment.getText().length()!=0){
        try{
          String query="INSERT INTO DEPARTMENT(NAME) VALUES(?)";
          PreparedStatement statement=connection.prepareStatement(query);
          statement.setString(1, txtDepartment.getText());
          if(!statement.execute()){
              JOptionPane.showMessageDialog(this, "Department Added", "MAS", JOptionPane.INFORMATION_MESSAGE);
              txtDepartment.setText("");
              refreshDepartmentList();
          }else{
              JOptionPane.showMessageDialog(this, "Department Adding Failed !", "MAS", JOptionPane.ERROR_MESSAGE);
          }        
      }catch(Exception e){
          e.printStackTrace();
      }
      }
      else{
          JOptionPane.showMessageDialog(this, "Please fill in the textfield", "MAS", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_butAddDepartmentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        frame.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void btnRemoveFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFacultyActionPerformed
        if(comboFaculty.getSelectedItem()!=null){
        try{
            String query="DELETE FROM FACULTY WHERE NAME=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, (String)comboFaculty.getSelectedItem());  
            if(!statement.execute()){
                JOptionPane.showMessageDialog(this, "Faculty Removed", "MAS", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Faculty Removing Failed", "MAS", JOptionPane.ERROR_MESSAGE);
            }
            refreshFacultyList();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Choose a valid selection from the list", "MAS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveFacultyActionPerformed
  
    private void butAddYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddYearActionPerformed
        if((comboDepartment.getSelectedItem()!=null) && (comboYear.getSelectedItem()!=null)){
        try{
          String query="INSERT INTO YEARS(DEPARTMENT,DEPTYEAR) VALUES(?,?)";
          PreparedStatement statement=connection.prepareStatement(query);
          statement.setString(1,(String) comboDepartment.getSelectedItem());
          statement.setString(2,(String) comboYear.getSelectedItem());
          if(!statement.execute()){
              JOptionPane.showMessageDialog(this, "Year Added", "MAS", JOptionPane.INFORMATION_MESSAGE);
              refreshYearList();
          }else{
              JOptionPane.showMessageDialog(this, "Year Adding Failed !", "MAS", JOptionPane.ERROR_MESSAGE);
          }        
      }catch(Exception e){
          e.printStackTrace();
      }
        }
        else{
            JOptionPane.showMessageDialog(this, "Choose a valid selection from the list", "MAS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butAddYearActionPerformed

    private void butRemoveYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemoveYearActionPerformed
     if((comboDepartment1.getSelectedItem()!=null) && (comboYear1.getSelectedItem()!=null)){
        try{
            String query="DELETE FROM YEARS WHERE DEPTYEAR=? and DEPARTMENT=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, (String) comboYear1.getSelectedItem());
            statement.setString(2, (String) comboDepartment1.getSelectedItem());
            if(!statement.execute()){
                JOptionPane.showMessageDialog(this, "Year Removed", "MAS", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Year Removing Failed", "MAS", JOptionPane.ERROR_MESSAGE);
            }
            refreshYearList();
        }catch(Exception e){
            e.printStackTrace();
        }
     }
     else{
         JOptionPane.showMessageDialog(this, "Choose a valid selection from the list", "MAS", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_butRemoveYearActionPerformed

    private void butAddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddSubjectActionPerformed
       if((comboSubjectDept.getSelectedItem()!=null) && (comboSubjectYear.getSelectedItem()!=null) && (comboSemesterYear.getSelectedItem()!=null) && txtSubject.getText().length()!=0 && subjectCredits.getText().length()!=0){
        try{
          String query="INSERT INTO SUBJECT(DEPARTMENT,DEPTYEAR,SEMESTER,SUBJECT,CREDITS) VALUES(?,?,?,?,?)";
          PreparedStatement statement=connection.prepareStatement(query);
          statement.setString(1,(String) comboSubjectDept.getSelectedItem());
          statement.setString(2,(String) comboSubjectYear.getSelectedItem());
          statement.setString(3,(String) comboSemesterYear.getSelectedItem());
          statement.setString(4,txtSubject.getText());
          statement.setString(5,subjectCredits.getText());
          if(!statement.execute()){
              JOptionPane.showMessageDialog(this, "Subject Added", "MAS", JOptionPane.INFORMATION_MESSAGE);
              txtSubject.setText("");
              subjectCredits.setText("");
              refreshSubjectList();
              refreshSemesterList();
          }else{
              JOptionPane.showMessageDialog(this, "Subject Adding Failed !", "MAS", JOptionPane.ERROR_MESSAGE);
          }        
      }catch(Exception e){
          e.printStackTrace();
      }
       }
       else{
           JOptionPane.showMessageDialog(this, "Check whether all are filled without error", "MAS", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_butAddSubjectActionPerformed

    private void butRemoveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemoveSubjectActionPerformed
       if(comboSubject.getSelectedItem()!=null){
        try{
        String query="DELETE FROM SUBJECT WHERE SUBJECT=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, (String)comboSubject.getSelectedItem());  
            if(!statement.execute()){
                JOptionPane.showMessageDialog(this, "Subject Removed", "MAS", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Subject Removing Failed", "MAS", JOptionPane.ERROR_MESSAGE);
            }
            refreshSubjectList();
            refreshSemesterList();
        }catch(Exception e){
            e.printStackTrace();
        }
       }
       else{
           JOptionPane.showMessageDialog(this, "Choose a valid selection from the list", "MAS", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_butRemoveSubjectActionPerformed

    private void butAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddStudentActionPerformed
        if((comboStudentDept.getSelectedItem()!=null) && (comboStudentYear.getSelectedItem()!=null) && txtStudentName.getText().length()!=0 && txtStudentRoll.getText().length()!=0 && txtStudentPassword.getText().length()!=0){
        try{
          String query="INSERT INTO STUDENTS(NAME,ROLL,DEPT,DEPTYEAR,PASSWORD,SEMESTER) VALUES(?,?,?,?,?,?)";
          PreparedStatement statement=connection.prepareStatement(query);
          statement.setString(1,txtStudentName.getText());
          statement.setString(2,txtStudentRoll.getText());
          statement.setString(3,(String) comboStudentDept.getSelectedItem());
          statement.setString(4,(String) comboStudentYear.getSelectedItem());
          statement.setString(5,txtStudentPassword.getText());
          statement.setString(6,(String) comboStudentSemester.getSelectedItem());
          if(!statement.execute()){
              JOptionPane.showMessageDialog(this, "Student Added", "MAS", JOptionPane.INFORMATION_MESSAGE);
              txtStudentName.setText("");
              txtStudentRoll.setText("");
              txtStudentPassword.setText("");
              refreshStudentList();
          }else{
              JOptionPane.showMessageDialog(this, "Student Adding Failed !", "MAS", JOptionPane.ERROR_MESSAGE);
          }        
      }catch(Exception e){
          e.printStackTrace();
      }
        }
        else{
            JOptionPane.showMessageDialog(this, "Check whether all are filled without error", "MAS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butAddStudentActionPerformed

    private void butRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemoveStudentActionPerformed
        if(comboStudent.getSelectedItem()!=null){
        try{
            String query="DELETE FROM STUDENTS WHERE NAME=?";
            PreparedStatement statement=connection.prepareStatement(query);
            statement.setString(1, (String)comboStudent.getSelectedItem());  
            if(!statement.execute()){
                JOptionPane.showMessageDialog(this, "Student Removed", "MAS", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Student Removing Failed", "MAS", JOptionPane.ERROR_MESSAGE);
            }
            refreshStudentList();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Choose a valid selection from the list", "MAS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butRemoveStudentActionPerformed

    private void btnAddFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFacultyActionPerformed
        if((comboFacultyDept.getSelectedItem()!=null) && (comboFacultyYear.getSelectedItem()!=null) && (comboSemester.getSelectedItem()!=null) && (comboSubject1.getSelectedItem()!=null) && facultyName.getText().length()!=0 && facultyPass.getText().length()!=0){
        try{
          String query="INSERT INTO FACULTY(NAME,PASSWORD,DEPARTMENT,DEPTYEAR,SEMESTER,SUBJECT) VALUES(?,?,?,?,?,?)";
          PreparedStatement statement=connection.prepareStatement(query);
          statement.setString(1,facultyName.getText());
          statement.setString(2,facultyPass.getText());
          statement.setString(3,(String) comboFacultyDept.getSelectedItem());
          statement.setString(4,(String) comboFacultyYear.getSelectedItem());
          statement.setString(5,(String) comboSemester.getSelectedItem());
          statement.setString(6,(String) comboSubject1.getSelectedItem());
          if(!statement.execute()){
              JOptionPane.showMessageDialog(this, "Faculty Added", "MAS", JOptionPane.INFORMATION_MESSAGE);
              facultyName.setText("");
              facultyPass.setText("");
              refreshFacultyList();
          }else{
              JOptionPane.showMessageDialog(this, "Faculty Adding Failed !", "MAS", JOptionPane.ERROR_MESSAGE);
          }        
      }catch(Exception e){
          e.printStackTrace();
      }
        }
        else{
            JOptionPane.showMessageDialog(this, "Choose a valid selection from the list", "MAS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddFacultyActionPerformed

    private void comboDepartment1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboDepartment1ItemStateChanged
        try{
            PreparedStatement statement=connection.prepareStatement("SELECT DISTINCT DEPTYEAR FROM YEARS WHERE DEPARTMENT=?");
            statement.setString(1, evt.getItem().toString());
            ResultSet result=statement.executeQuery();
            comboYear1.removeAllItems();
            while(result.next()){
                comboYear1.addItem(result.getString("deptyear"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboDepartment1ItemStateChanged

    private void comboSubjectDeptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSubjectDeptItemStateChanged
        try{
            PreparedStatement statement=connection.prepareStatement("SELECT DISTINCT DEPTYEAR FROM YEARS WHERE DEPARTMENT=?");
            statement.setString(1, evt.getItem().toString());
            ResultSet result=statement.executeQuery();
            comboSubjectYear.removeAllItems();
            while(result.next()){
                comboSubjectYear.addItem(result.getString("deptyear"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboSubjectDeptItemStateChanged

    private void comboStudentDeptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboStudentDeptItemStateChanged
        try{
            PreparedStatement statement=connection.prepareStatement("SELECT DISTINCT DEPTYEAR FROM YEARS WHERE DEPARTMENT=?");
            statement.setString(1, evt.getItem().toString());
            ResultSet result=statement.executeQuery();
            comboStudentYear.removeAllItems();
            while(result.next()){
                comboStudentYear.addItem(result.getString("deptyear"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboStudentDeptItemStateChanged

    private void comboFacultyDeptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFacultyDeptItemStateChanged
        try{
            PreparedStatement statement=connection.prepareStatement("SELECT DISTINCT DEPTYEAR FROM YEARS WHERE DEPARTMENT=?");
            statement.setString(1, evt.getItem().toString());
            ResultSet result=statement.executeQuery();
            comboFacultyYear.removeAllItems();
            while(result.next()){
                comboFacultyYear.addItem(result.getString("deptyear"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboFacultyDeptItemStateChanged

    private void comboFacultyYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFacultyYearItemStateChanged
        try{
            PreparedStatement statement=connection.prepareStatement("SELECT DISTINCT SEMESTER FROM SUBJECT WHERE DEPTYEAR=?");
            statement.setString(1, evt.getItem().toString());
            ResultSet result=statement.executeQuery();
            comboSemester.removeAllItems();
            while(result.next()){
                comboSemester.addItem(result.getString("semester"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboFacultyYearItemStateChanged

    private void comboSemesterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSemesterItemStateChanged
        try{
            PreparedStatement statement=connection.prepareStatement("SELECT DISTINCT SUBJECT FROM SUBJECT WHERE SEMESTER=?");
            statement.setString(1, evt.getItem().toString());
            ResultSet result=statement.executeQuery();           
            comboSubject1.removeAllItems();
            while(result.next()){            
                comboSubject1.addItem(result.getString("subject"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboSemesterItemStateChanged
    private void refreshDepartmentList(){
        try{
            Statement statement=connection.createStatement();
            String query="SELECT DISTINCT NAME FROM DEPARTMENT ";   
            ResultSet result=statement.executeQuery(query);
            comboRemoveDepartment.removeAllItems();
            comboDepartment.removeAllItems();
            comboDepartment1.removeAllItems();
            comboSubjectDept.removeAllItems();
            comboStudentDept.removeAllItems();
            comboFacultyDept.removeAllItems();
            
            while(result.next()){
              comboRemoveDepartment.addItem(result.getString("name"));
              comboDepartment.addItem(result.getString("name"));
              comboDepartment1.addItem(result.getString("name"));
              comboSubjectDept.addItem(result.getString("name"));
              comboStudentDept.addItem(result.getString("name"));
              comboFacultyDept.addItem(result.getString("name"));
              }
        }catch(Exception e){
            e.printStackTrace();
        }
    }  
    private void refreshYearList(){
        try{
            Statement statement=connection.createStatement();
            String query="SELECT DISTINCT DEPTYEAR FROM YEARS";   
            ResultSet result=statement.executeQuery(query);
            comboYear1.removeAllItems();
            comboSubjectYear.removeAllItems();
            comboStudentYear.removeAllItems();
            comboFacultyYear.removeAllItems();
            while(result.next()){
              comboYear1.addItem(result.getString("deptyear"));
              comboSubjectYear.addItem(result.getString("deptyear"));
              comboStudentYear.addItem(result.getString("deptyear"));
              comboFacultyYear.addItem(result.getString("deptyear"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    private void refreshSemesterList(){
        try{
            Statement statement=connection.createStatement();
            String query="SELECT DISTINCT SEMESTER FROM SUBJECT";   
            ResultSet result=statement.executeQuery(query);
            comboSemester.removeAllItems();
            while(result.next()){
              comboSemester.addItem(result.getString("semester"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void refreshSubjectList() {
        try{
            Statement statement=connection.createStatement();
            String query="SELECT DISTINCT SUBJECT FROM SUBJECT";   
            ResultSet result=statement.executeQuery(query);
            comboSubject.removeAllItems();
            comboSubject1.removeAllItems();
            while(result.next()){
              comboSubject.addItem(result.getString("subject"));
              comboSubject1.addItem(result.getString("subject"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void refreshStudentList() {
     try{
            Statement statement=connection.createStatement();
            String query="SELECT DISTINCT NAME FROM STUDENTS";   
            ResultSet result=statement.executeQuery(query);
            comboStudent.removeAllItems();
            while(result.next()){
              comboStudent.addItem(result.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void refreshFacultyList() {
    try{
            Statement statement=connection.createStatement();
            String query="SELECT DISTINCT NAME FROM FACULTY";   
            ResultSet result=statement.executeQuery(query);
            comboFaculty.removeAllItems();
            while(result.next()){
              comboFaculty.addItem(result.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnAddFaculty;
    private javax.swing.JButton btnRemoveFaculty;
    private javax.swing.JButton butAddDepartment;
    private javax.swing.JButton butAddStudent;
    private javax.swing.JButton butAddSubject;
    private javax.swing.JButton butAddYear;
    private javax.swing.JButton butRemoveDepartment;
    private javax.swing.JButton butRemoveStudent;
    private javax.swing.JButton butRemoveSubject;
    private javax.swing.JButton butRemoveYear;
    private javax.swing.JComboBox<String> comboDepartment;
    private javax.swing.JComboBox<String> comboDepartment1;
    private javax.swing.JComboBox<String> comboFaculty;
    private javax.swing.JComboBox<String> comboFacultyDept;
    private javax.swing.JComboBox<String> comboFacultyYear;
    private javax.swing.JComboBox<String> comboRemoveDepartment;
    private javax.swing.JComboBox<String> comboSemester;
    private javax.swing.JComboBox<String> comboSemesterYear;
    private javax.swing.JComboBox<String> comboStudent;
    private javax.swing.JComboBox<String> comboStudentDept;
    private javax.swing.JComboBox<String> comboStudentSemester;
    private javax.swing.JComboBox<String> comboStudentYear;
    private javax.swing.JComboBox<String> comboSubject;
    private javax.swing.JComboBox<String> comboSubject1;
    private javax.swing.JComboBox<String> comboSubjectDept;
    private javax.swing.JComboBox<String> comboSubjectYear;
    private javax.swing.JComboBox<String> comboYear;
    private javax.swing.JComboBox<String> comboYear1;
    private javax.swing.JTextField facultyName;
    private javax.swing.JTextField facultyPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panDepartment;
    private javax.swing.JPanel panStudent;
    private javax.swing.JPanel panSubject;
    private javax.swing.JPanel panYear;
    private javax.swing.JTextField subjectCredits;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtStudentPassword;
    private javax.swing.JTextField txtStudentRoll;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables
}
