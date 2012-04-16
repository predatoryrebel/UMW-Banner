
/**
 * Search for a class based on different criteria
 * @author cjoyner
 */
import java.util.*;
import javax.swing.*;
public class SearchClass extends javax.swing.JFrame {

    /**
     * Creates new form SearchClass
     */
   
    public SearchClass(LinkedList<CurrentCourse> course, LinkedList<Student> student, User person) {
        initComponents();
        user = person;
        courseList = course;
        studentList = student;
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchCourseList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        addList = new javax.swing.JScrollPane();
        addCourseList = new javax.swing.JList();
        addButton = new javax.swing.JButton();
        courseNameCheckBox = new javax.swing.JCheckBox();
        titleCheckBox = new javax.swing.JCheckBox();
        timeBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        timeText = new javax.swing.JTextField();

        jLabel1.setText("Search");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchCourseList.setToolTipText("");
        searchCourseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchCourseListMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(searchCourseList);

        addList.setViewportView(addCourseList);

        addButton.setText("Add Course");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        courseNameCheckBox.setSelected(true);
        courseNameCheckBox.setText("Course Name");

        titleCheckBox.setText("Title");

        timeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "T", "W", "R", "F" }));
        timeBox.setSelectedIndex(-1);
        timeBox.setSelectedItem(-1);
        timeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Day");

        jLabel4.setText("Time");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                .addComponent(addList)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(courseNameCheckBox)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(addList, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameCheckBox)
                    .addComponent(jLabel3)
                    .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleCheckBox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Uses button to search for a course
     * @param evt 
     */
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        SearchCourse search = new SearchCourse(courseList);
        LinkedList<CurrentCourse> searchList = null;
         DefaultListModel listModel; 
        //search title
        if (titleCheckBox.isSelected()){
            searchList = search.searchCourseByTitle(jTextField1.getText());
            search = new SearchCourse(searchList);
        }
        //Search course name
        if (courseNameCheckBox.isSelected()){
            searchList = search.searchCourseByCourseName(jTextField1.getText());
            search = new SearchCourse(searchList);
        }
        //Search day monday
        if (timeBox.getSelectedItem() == "M"){
            searchList = search.searchCourseByDay("M");
            search = new SearchCourse(searchList);
        }
        //Search day tuesday
        if (timeBox.getSelectedItem() == "T"){
            searchList = search.searchCourseByDay("T");
            search = new SearchCourse(searchList);
        }
        //search day wednesday
        if (timeBox.getSelectedItem() == "W"){
            searchList = search.searchCourseByDay("W");
            search = new SearchCourse(searchList);
        }
        //search day thursday
        if (timeBox.getSelectedItem() == "R"){
            searchList = search.searchCourseByDay("R");
            search = new SearchCourse(searchList);
        }
        //search day friday
        if (timeBox.getSelectedItem() == "F"){
            searchList = search.searchCourseByDay("F");
            search = new SearchCourse(searchList);
        }
        //search by time
        if (!timeText.getText().isEmpty())
        {
            searchList = search.searchCourseByTime(timeText.getText());
           
        }
        
        
        if (searchList != null){
            ListIterator<CurrentCourse> iterator = searchList.listIterator();
            listModel = new DefaultListModel();
            //adds found items to list
            while (iterator.hasNext())
            {
                CurrentCourse element = iterator.next();
                listModel.addElement(element);
            }   
        }
        else
        {
            //search matches
            listModel = new DefaultListModel();
            String noneFound = "Search item not found";
            listModel.addElement(noneFound);
        }
        
         searchCourseList.setModel(listModel);
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * Mouse is released adds selected course to add list box
     * @param evt 
     */
    private void searchCourseListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCourseListMouseReleased
        //get index of click object
        int index = searchCourseList.getSelectedIndex();
         //check index
        if (index != -1)
        {
            ListModel<CurrentCourse> listModel = searchCourseList.getModel();
            //get course
            CurrentCourse course = listModel.getElementAt(index);
            DefaultListModel addListModel = new DefaultListModel();
            listModel = addCourseList.getModel();
            //adds items already in addCourseList to addListModel
            for (int a = 0; a < listModel.getSize(); a++){
                addListModel.addElement(listModel.getElementAt(a));
            }
            //add course to addCourseList
            addListModel.addElement(course);
            addCourseList.setModel(addListModel);
        }
    }//GEN-LAST:event_searchCourseListMouseReleased

    /**
     * Adds a course to student's current enrolled lsit and adds a student to course current enrolled list
     * @param evt 
     */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        ListModel<CurrentCourse> listModel = addCourseList.getModel();
        
        for (int a = 0; a < listModel.getSize(); a++){
            CurrentCourse course = listModel.getElementAt(a);
            ListIterator<Student> iterator = studentList.listIterator();
            //seach student list for student
            while (iterator.hasNext())
            {
                Student element = iterator.next();
                //check username of user to student user name
                if (user.getUserName().equalsIgnoreCase(element.getUserName()))
                {
                    ListIterator<CurrentCourse> courseIterator = element.getCurrentSchudule().listIterator();
                    boolean courseAlreadyAdded = false;
                    boolean courseAlreadyTaken = false;
                    //checks to make sure the student isn't already enrolled in the class
                    while (courseIterator.hasNext())
                    {    
                        CurrentCourse courseElement = courseIterator.next();
                        if (courseElement.getName().equalsIgnoreCase(course.getName()))
                        {
                            courseAlreadyAdded = true;
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame, "You are already enrolled in " + course.getName() );
                        }
                    }
                    //check to make sure student has not take the course
                    ListIterator<PastCourse> pastIterator = element.getPastCourses().listIterator();
                    while (pastIterator.hasNext())
                    {
                        PastCourse pastElement = pastIterator.next();
                        if (pastElement.getName().equalsIgnoreCase(course.getName())  && !pastElement.getGrade().equalsIgnoreCase("F"))
                        {
                           courseAlreadyTaken = true;
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame, "You are already taking " + course.getName() );
                        }
                    }    
                   
                    //makes sure class is not full and student will not go over approved credits
                    int totalCredits = element.getCreditHoursEnrolled();
                    totalCredits = totalCredits + course.getCredits();
                    
                    //checks number of seats for course, student will not go over approved credits, student is not already enrolled
                    //in the class and holds
                    if (totalCredits <= element.getApprovedCredits()  && !courseAlreadyAdded  && element.getHolds() == false 
                            && !courseAlreadyTaken)
                    {
                        boolean availableSeat = course.addStudent();
                        if (availableSeat)
                        {//add course and set credits enrolled
                            element.getCurrentSchudule().add(course);
                            element.setCreditHoursEnrolled(totalCredits);
                            course.getEnrolledStudents().add(element);
                            JFrame frame = new JFrame();
                            JOptionPane.showMessageDialog(frame, "Course " + course.getName() + " has been added." );
                        }
                        else
                        {
                            ListIterator<Student> waitingIterator = course.getWaitingList().listIterator();
                            //check to see if student is already on the waitng list
                            boolean alreadyOnWaitingList = false;
                            while (waitingIterator.hasNext())
                            {
                                Student student = waitingIterator.next();
                                if (student.equals(element))
                                {
                                    alreadyOnWaitingList = true;
                                }
                            }
                            if (!alreadyOnWaitingList)
                            {
                                //add student to waiting list
                                course.getWaitingList().addLast(element);
                                JFrame frame = new JFrame();
                                JOptionPane.showMessageDialog(frame, course.getName() + " is full.  You have been put on the "
                                        + "waiting list.");
                            }
                            else
                            {
                                JFrame frame = new JFrame();
                                JOptionPane.showMessageDialog(frame, "You are already on " + course.getName()+ " waitng list.");
                            }
                        }
                    }
                    //message to tell use course was not added
                    else if (element.getHolds() == true)
                    {
                        JFrame frame = new JFrame();
                        JOptionPane.showMessageDialog(frame, course.getName() + " was not added check holds.");
                    }
                    else if (totalCredits > element.getApprovedCredits())
                    {
                        JFrame frame = new JFrame();
                        JOptionPane.showMessageDialog(frame, course.getName() + " was not added because ir would put you over"
                                + "the approved credits.");
                    }
                   
                }

            }
        }
        //back up student list
        Backup backup = new Backup();
        backup.backupStudents(studentList);
        backup.backupCourses(courseList);
        
        clear();
    }//GEN-LAST:event_addButtonActionPerformed

    private void timeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeBoxActionPerformed
    
    /**
     * Clears form 
     */
    private void clear()
    {
        DefaultListModel listModel = new DefaultListModel();
        
        timeBox.setSelectedIndex(-1);
        timeText.setText("");
        listModel.clear();
        addCourseList.setModel(listModel);
        searchCourseList.setModel(listModel);
    }
    
    /**
     * Clears list boxes 
     * @param evt 
     */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    /**
     * Exits SearchClass
     * @param evt 
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

    private LinkedList<Student> studentList;
    private User user;
    private LinkedList<CurrentCourse> courseList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JList addCourseList;
    private javax.swing.JScrollPane addList;
    private javax.swing.JButton clearButton;
    private javax.swing.JCheckBox courseNameCheckBox;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton searchButton;
    private javax.swing.JList searchCourseList;
    private javax.swing.JComboBox timeBox;
    private javax.swing.JTextField timeText;
    private javax.swing.JCheckBox titleCheckBox;
    // End of variables declaration//GEN-END:variables
}
