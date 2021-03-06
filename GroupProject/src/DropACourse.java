
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *Allows an Admin to drop a course from the course list
 * @author cjoyner
 */
public class DropACourse extends javax.swing.JFrame {

     /**
     * Creates new form DropACourse
     */
    public DropACourse(LinkedList<CurrentCourse> course, LinkedList<Student> student, LinkedList<Faculty> faculty) {
        initComponents();
        courseList = course;
        listStudent = student;
        facultyList = faculty;
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        reset();
    }
    
    /**
     * Display course list
     */
    private void reset()
    {
        DefaultListModel<CurrentCourse> listModel = new DefaultListModel();
        ListIterator<CurrentCourse> iterator = courseList.listIterator();
        //set course list into list model
        while (iterator.hasNext())
        {
            CurrentCourse course = iterator.next();
            listModel.addElement(course);
        }
        
        selectList.setModel(listModel);
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
        dropList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        drop = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                selectListMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(selectList);

        jLabel1.setText("Select Course to Drop from Course List");

        jScrollPane2.setViewportView(dropList);

        jLabel2.setText("Drop Course");

        drop.setText("Drop");
        drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drop)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Once mouse is released add course to drop list
     * @param evt 
     */
    private void selectListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectListMouseReleased
         //get index of click object
        int index = selectList.getSelectedIndex();
        //check index
        if (index != -1)
        {
            ListModel<CurrentCourse> listModel = selectList.getModel();
            //get course
            CurrentCourse course = listModel.getElementAt(index);
            DefaultListModel<CurrentCourse> dropListModel = new DefaultListModel();
            listModel = dropList.getModel();
            //adds items already in dropList to dropListModel
            for (int a = 0; a < listModel.getSize(); a++){
                dropListModel.addElement(listModel.getElementAt(a));
            }
            //add course to dropList
            dropListModel.addElement(course);
            dropList.setModel(dropListModel);
        }
    }//GEN-LAST:event_selectListMouseReleased
    
    /**
     * Use a drop button to drop classes in the drop box
     * @param evt 
     */
    private void dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropActionPerformed
        ListModel<CurrentCourse> listModel = dropList.getModel();
        //drop courses in dropList box
        for (int a  = 0; a < listModel.getSize(); a++)
        {
            //get course
            CurrentCourse course = listModel.getElementAt(a);
            ListIterator<Student> iterator = course.getEnrolledStudents().listIterator();
            //drop course from enrolled students
            while (iterator.hasNext())
            {
                Student student = iterator.next();
                student.getCurrentSchudule().remove(course);
                student.setCreditHoursEnrolled(student.getCreditHoursEnrolled() - course.getCredits());
            }
            
            //drop course from course list
            courseList.remove(course);
            
            //drop course from faculty course list
            ListIterator<Faculty> fIterator = facultyList.listIterator();
            while (fIterator.hasNext())
            {
                Faculty element = fIterator.next();
                ListIterator<CurrentCourse> cIterator = element.getCourses().listIterator();
                
                //find course in professor course list
                while (cIterator.hasNext())
                {
                    CurrentCourse facultyCourse = cIterator.next();
                    
                    //removes course from faculty course list if CRN match
                    if (course.getCRN().equalsIgnoreCase(facultyCourse.getCRN()))
                        element.getCourses().remove(facultyCourse);
                }
            }
            //display a successful drop
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, course.getName() +  " has been removed." );
            Backup backup = new Backup();
            backup.backupCourses(courseList);
            backup.backupStudents(listStudent);
            backup.backupFaculty(facultyList);
        }
        clear();
        reset();
    }//GEN-LAST:event_dropActionPerformed
    /**
     * Clears select list and drop list.  calls reset
     * @param evt 
     */
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
        reset();
    }//GEN-LAST:event_clearActionPerformed
    
    /**
     * Clear list boxes
     */
    private void clear()
    {
        DefaultListModel listModel = new DefaultListModel();
        listModel.clear();
        dropList.setModel(listModel);
        selectList.setModel(listModel);
    }
    
    /**
     * Exits drop a course
     * @param evt 
     */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

   private LinkedList<Student> listStudent;
   private LinkedList<Faculty> facultyList;
   private LinkedList<CurrentCourse> courseList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton drop;
    private javax.swing.JList dropList;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList selectList;
    // End of variables declaration//GEN-END:variables
}
