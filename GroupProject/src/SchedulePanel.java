/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.awt.*;
/**
 *
 * @author Steve
 */
public class SchedulePanel extends javax.swing.JPanel {

    /**
     * Creates new form SchedulePanel
     */
    public SchedulePanel() {
        initComponents();
        int time = 8;
        scheduleTable.setFont(new Font("SansSerif", Font.PLAIN, 9));
        
        for(int i = 0; i < scheduleTable.getRowCount(); i++)
        {
            if(time < 12)
            {
                scheduleTable.setValueAt(time + ":00 AM", i, 0);
            }
            else
            {
                if(time == 12)
                {
                    scheduleTable.setValueAt("12:00 PM", i, 0);
                }
                else
                {
                    scheduleTable.setValueAt(time - 12 + ":00 PM", i, 0);
                }
            }
            time++;
        }
    }
    
    // Print schedule information for faculty and students
    public void setSchedule(User user, int clear)
    {
        String className = user.getClass().getName();
        System.out.println("Model: " + scheduleTable.getModel());
        
        if(className.equals("Student") || className.equals("Faculty"))
        {
            
            LinkedList<CurrentCourse> courses = new LinkedList<CurrentCourse>();
            
            if(className.equals("Student"))
            {
                Student s = (Student)user;
                courses = s.getCurrentSchudule();
            }
            else
            {
                Faculty f = (Faculty)user;
                courses = f.getCourses();
            }
            
            ListIterator<CurrentCourse> it = courses.listIterator();
            
            CurrentCourse current;
            String timeString, dayString;
            // If row is still -1 at the end of the method, do nothing
            int row = -1;
            int mIndex;
            ArrayList<Integer> columns = new ArrayList<Integer>();
            
            while(it.hasNext())
            {
                current = it.next();
                System.out.println("getTime: " + current.getTime());
                mIndex = current.getTime().indexOf("m");
                timeString = current.getTime().substring(0, mIndex + 1);
                dayString = current.getDays();
                
                // Find the row value
                switch(timeString)
                {
                    case "8:00 am":
                        row = 0;
                        break;
                    case "9:00 am":
                        row = 1;
                        break;
                    case "9:30 am":
                        row = 1;
                        break;
                    case "10:00 am":
                        row = 2;
                        break;
                    case "11:00 am":
                        row = 3;
                        break;
                    case "12:00 pm":
                        row = 4;
                        break;
                    case "12:30 pm":
                        row = 4;
                        break;
                    case "1:00 pm":
                        row = 5;
                        break;
                    case "2:00 pm":
                        row = 6;
                        break;
                    case "3:00 pm":
                        row = 7;
                        break;
                    case "4:00 pm":
                        row = 8;
                        break;
                    case "4:30 pm":
                        row = 4;
                        break;
                    case "5:00 pm":
                        row = 9;
                        break;
                    case "6:00 pm":
                        row = 10;
                        break;
                    case "7:00 pm":
                        row = 11;
                        break;
                }
                
                // Find the column values
                char c;
                for(int i = 0; i < dayString.length(); i++)
                {
                    c = dayString.charAt(i);
                    
                    switch(c)
                    {
                        case 'M':
                            columns.add(new Integer(1));
                            break;
                        case 'T':
                            columns.add(new Integer(2));
                            break;
                        case 'W':
                            columns.add(new Integer(3));
                            break;
                        case 'R':
                            columns.add(new Integer(4));
                            break;
                        case 'F':
                            columns.add(new Integer(5));
                            break;
                    }
                }
                
                // Print the class to the table
                if(row != -1 && clear == 0)   // Don't print anything if a timeslot wasn't found
                {                
                    for(int i = 0; i < columns.size(); i++)
                    {
                        scheduleTable.setValueAt(current.getTitle(), row, columns.get(i).intValue());
                    }
                }
                // If clear == 1, delete the timeslots that were filled by this user's schedule. 
                // Clearing the schdedule this way prevents a threading error in swing
                else    
                {
                    for(int i = 0; i < columns.size(); i++)
                    {
                        scheduleTable.setValueAt(" ", row, columns.get(i).intValue());
                    }
                }
                columns.clear();
            }
        }
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
        scheduleTable = new javax.swing.JTable();

        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scheduleTable.setRowHeight(32);
        jScrollPane1.setViewportView(scheduleTable);
        scheduleTable.getColumnModel().getColumn(0).setResizable(false);
        scheduleTable.getColumnModel().getColumn(1).setResizable(false);
        scheduleTable.getColumnModel().getColumn(2).setResizable(false);
        scheduleTable.getColumnModel().getColumn(3).setResizable(false);
        scheduleTable.getColumnModel().getColumn(4).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable scheduleTable;
    // End of variables declaration//GEN-END:variables
}
