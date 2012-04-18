
import java.util.*;
import java.util.ListIterator;
import javax.swing.DefaultListModel;



/*
 * CreateCourse.java
 *
 * Created on Apr 11, 2012, 11:07:32 AM
 */

/**
 *
 * @author singularity
 */
public class CreateCourse extends javax.swing.JFrame {

    /** Creates new form CreateCourse */
    public CreateCourse(LinkedList<CurrentCourse> courses) {
        courselist = courses;
        initComponents();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        resetCurrentSchedule();

    }

    private void resetCurrentSchedule()
    {
        DefaultListModel listModel = new DefaultListModel();
        ListIterator<CurrentCourse> iterator = courselist.listIterator();
        ///adds courses
        while (iterator.hasNext())
        {
            Course course =  iterator.next();
            listModel.addElement(course);
        }

        courseList.setModel(listModel);

        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coursefield = new javax.swing.JTextField();
        sectionField = new javax.swing.JTextField();
        courseTitle = new javax.swing.JTextField();
        creditsField = new javax.swing.JTextField();
        professorField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseList = new javax.swing.JList();
        addButton = new javax.swing.JButton();
        listlabel = new javax.swing.JLabel();
        requs = new javax.swing.JTextField();
        days = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        building = new javax.swing.JTextField();
        room = new javax.swing.JTextField();
        Requirements = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        seats = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionFieldActionPerformed(evt);
            }
        });

        creditsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsFieldActionPerformed(evt);
            }
        });

        professorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Course");
        jLabel1.setToolTipText("");

        jLabel3.setText("Course Title");

        jLabel4.setText("Credit Hours");

        jLabel5.setText("Professor");

        jLabel6.setText("Section");

        courseList.setModel(courseList.getModel());
        jScrollPane1.setViewportView(courseList);

        addButton.setText("Add This Course!");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        listlabel.setText("Current Course List");

        Requirements.setText("Requirements");
        Requirements.setFocusCycleRoot(true);

        jLabel8.setText("Days");

        jLabel9.setText("Time");

        jLabel10.setText("Building");

        jLabel11.setText("Room #");

        jLabel7.setText("# of seats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(Requirements)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sectionField, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(creditsField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(courseTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(coursefield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(professorField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(building, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(room, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(requs, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(days, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(seats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listlabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(addButton)
                .addContainerGap(608, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(listlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coursefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(courseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(professorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Requirements))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(52, 52, 52)
                .addComponent(addButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void professorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorFieldActionPerformed

    private void sectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionFieldActionPerformed

    private void creditsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditsFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

        /* Declare a newcourse to be added to the courselist */
        CurrentCourse addCourse ;
        /* Make a random number generator to make a random CRN */
        Random CRN_Generator = new Random();
        /* Booleand variable used for looping and loop control */
        boolean proceed = false;

        /* create a random CRN object */
        int randomCRN = CRN_Generator.nextInt(courselist.size() + 50);

        /* Declare and initialize a new CurrentCourse iterator */
        Iterator<CurrentCourse> it = courselist.iterator();

        /* While the boolean variable isn't true */
        while(proceed != true){

            /* While there is a next object */
            while(it.hasNext()){

                /* If there is a duplicate CRN that we generated */
                if (it.next().getCRN().equals(""+ randomCRN)){

                    /* Make a new CRN and check */
                    randomCRN = CRN_Generator.nextInt(courselist.size() + 50);
                    proceed = false;
                    break;
                }

                proceed = true;
            }

            /*
             * CurrentCourse(String aCRN, String aCourse, int aSection, String theTitle, String thePrer, int numCredits, String theTime,
           String theDays, String theBuilding, String theRoom, String theProfessor, int totalSeatNumber, int theFilledSeats,
           String tempList)
             */
        addCourse = new CurrentCourse(("" + randomCRN), coursefield.getText(), Integer.parseInt(sectionField.getText()), courseTitle.getText(), Requirements.getText(), Integer.parseInt(creditsField.getText()), time.getText(), days.getText(), building.getText(), room.getText(), professorField.getText(), Integer.parseInt(seats.getText()), 0, "" );

        /* Add the new course to the current course list */
        courselist.add(addCourse);

        /* And refresh the current course list in the list window on the form */
        resetCurrentSchedule();
        
        }
    }//GEN-LAST:event_addButtonActionPerformed

    

    LinkedList<CurrentCourse> courselist;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Requirements;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField building;
    private javax.swing.JList courseList;
    private javax.swing.JTextField courseTitle;
    private javax.swing.JTextField coursefield;
    private javax.swing.JTextField creditsField;
    private javax.swing.JTextField days;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listlabel;
    private javax.swing.JTextField professorField;
    private javax.swing.JTextField requs;
    private javax.swing.JTextField room;
    private javax.swing.JTextField seats;
    private javax.swing.JTextField sectionField;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables

}
