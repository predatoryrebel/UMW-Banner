
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;


/**
 * Allows a faculty member give a student a grade
 * @author cjoyner
 */
public class GradeAStudent extends javax.swing.JFrame {

    /**
     * Creates new form GradeAStudent
     */
    public GradeAStudent(Faculty professor, LinkedList<PastCourse> past) {
        initComponents();
        faculty = professor;
        pastList = past;
        reset();
    }
    
    /**
     * Adds faculty member course to select list box, clears text box and student list box, set combo box index to -1
     */
    private void reset()
    {
        DefaultListModel<CurrentCourse> listModel = new DefaultListModel();
        ListIterator<CurrentCourse> iterator = faculty.getCourses().listIterator();
        
        //add courses to select list
        while (iterator.hasNext())
        {
            CurrentCourse course = iterator.next();
            listModel.addElement(course);
        }
        
        selectList.setModel(listModel);
        
        listModel = new DefaultListModel();
        listModel.clear();
        studentList.setModel(listModel);
        //clear text box
        nameField.setText("");
        //set combo box index to -1
        gradeBox.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        selectList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gradeBox = new javax.swing.JComboBox();
        grade = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                selectListMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(selectList);

        jLabel1.setText("Select Course");

        studentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                studentListMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(studentList);

        jLabel2.setText("Select Student");

        jLabel3.setText("Student");

        jLabel4.setText("Grade");

        gradeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" }));
        gradeBox.setSelectedIndex(-1);

        grade.setText("Grade");
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        nameField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grade)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Mouse is released adds selected course students to student list box
     * @param evt 
     */
    private void selectListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectListMouseReleased
        //get selected course
        int index = selectList.getSelectedIndex();
        ListModel<CurrentCourse> list = selectList.getModel();
        CurrentCourse course = list.getElementAt(index);
        
        //add students from selected course
        ListIterator<Student> iterator = course.getEnrolledStudents().listIterator();
        DefaultListModel listModel = new DefaultListModel();
        while (iterator.hasNext())
        {
            Student student = iterator.next();
            listModel.addElement(student);
        }
        //set student list box
        studentList.setModel(listModel);
    }//GEN-LAST:event_selectListMouseReleased

    /**
     * Mouse is released adds selected student to text box
     * @param evt 
     */
    private void studentListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListMouseReleased
        //get student
        int index = studentList.getSelectedIndex();
        ListModel<Student> listModel = studentList.getModel();
        Student student = listModel.getElementAt(index);
        
        String studentName = student.getFirstName() + " " + student.getLastName();
        nameField.setText(studentName);
    }//GEN-LAST:event_studentListMouseReleased

    /**
     * Gives a student a grade on a course, calculates a students GPA
     * @param evt 
     */
    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        //get student
        int indexStudent = studentList.getSelectedIndex();
        ListModel<Student> listModel = studentList.getModel();
        Student student = listModel.getElementAt(indexStudent);
         //get selected course
        int indexCourse = selectList.getSelectedIndex();
        ListModel<CurrentCourse> list = selectList.getModel();
        CurrentCourse course = list.getElementAt(indexCourse);
        //get grade 
        int index = gradeBox.getSelectedIndex();
        ListModel<String> model = gradeBox.getModel();
        String grade = model.getElementAt(index);
        
        ListIterator<CurrentCourse> iterator = student.getCurrentSchudule().listIterator();
        //delete course from current enrolled list
        while (iterator.hasNext())
        {
            CurrentCourse studentCourse = iterator.next();
            if (course == studentCourse)
            {
                //set past grade
                PastCourse past = new PastCourse(studentCourse.getCRN(), studentCourse.getName(), studentCourse.getSection(),
                    studentCourse.getTitle(), studentCourse.getCredits(), studentCourse.getProfessor(),grade, student.getUserName());
                student.getPastCourses().add(past);
                //calcualte gpa
                CalculateGPA gpaCal = new CalculateGPA(student.getPastCourses());
                student.setGPA(gpaCal.calculate());
                //remove course from current enrolled list
                student.getCurrentSchudule().remove(course);
                student.setCreditHoursEnrolled(student.getCreditHoursEnrolled() - course.getCredits());
                //add past corse to past list
                pastList.add(past);
                 //removes student from course
                course.getEnrolledStudents().remove(student);
                course.dropStudent();
                //displays message 
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, student.getFirstName() + " " + student.getLastName() + " has received a " + 
                grade);
            }
        }
        //backs up pastCourse.csv
        Backup backup = new Backup();
        backup.backupPast(pastList);
    }//GEN-LAST:event_gradeActionPerformed

    /**
     * calls reset
     * @param evt 
     */
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        reset();
    }//GEN-LAST:event_clearActionPerformed

    /**
     * Exits GradeAStudent
     * @param evt 
     */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private Faculty faculty; 
    private LinkedList<PastCourse> pastList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JButton grade;
    private javax.swing.JComboBox gradeBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JList selectList;
    private javax.swing.JList studentList;
    // End of variables declaration//GEN-END:variables
}
