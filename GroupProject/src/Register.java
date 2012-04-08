
/**
 *Lets a person register as a user
 * @author cjoyner
 */
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register(LinkedList<User> user) {
        initComponents();
        userList = user;
        person = null;
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        group1 = new javax.swing.ButtonGroup();
        userNameLabel = new javax.swing.JLabel();
        userNameTextBox = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextBox = new javax.swing.JPasswordField();
        password2Label = new javax.swing.JLabel();
        password2TextBox = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        emailTextBox = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        canelButton = new javax.swing.JButton();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextBox = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextBox = new javax.swing.JTextField();
        administrator = new javax.swing.JRadioButton();
        faculty = new javax.swing.JRadioButton();
        student = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userNameLabel.setText("Enter User Name:");

        passwordLabel.setText("Enter Password:");

        password2Label.setText("Retype password");

        emailLabel.setText("Enter your email address");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        canelButton.setText("Cancel");
        canelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canelButtonActionPerformed(evt);
            }
        });

        firstNameLabel.setText("Enter First Name:");

        lastNameLabel.setText("Enter Last Name");

        group1.add(administrator);
        administrator.setText("Administrator");

        group1.add(faculty);
        faculty.setText("Faculty");

        group1.add(student);
        student.setSelected(true);
        student.setText("Student");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(password2Label)
                                    .addComponent(passwordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordTextBox)
                                    .addComponent(password2TextBox))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(canelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailTextBox)
                                    .addComponent(firstNameTextBox)
                                    .addComponent(lastNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(student)
                                .addGap(18, 18, 18)
                                .addComponent(faculty)
                                .addGap(18, 18, 18)
                                .addComponent(administrator)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(canelButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password2Label)
                    .addComponent(password2TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailLabel)
                    .addComponent(emailTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(administrator)
                    .addComponent(faculty)
                    .addComponent(student))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Creates a user if username is unique and passwords match
     * @param evt 
     */
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        ListIterator<User> iterator = userList.listIterator();
        boolean validUserName = true;
        
        while (iterator.hasNext())
        {
            //gets users
            User element = iterator.next();
            //check for same usernae and incorrect password
            if (element.getUserName().equalsIgnoreCase(userNameTextBox.getText())|| 
                !passwordTextBox.getText().equalsIgnoreCase(password2TextBox.getText()) || 
                passwordTextBox.getText().isEmpty())
            {
                validUserName = false;
            }
            
        }
        
        if (!validUserName)
        {
            //displays error message about username or password
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "User name or password are invalid");
        }
        else
        {
            //creates a user based on enter information
            person = new User(userNameTextBox.getText(), passwordTextBox.getText(), emailTextBox.getText(), firstNameTextBox.getText(),
                        lastNameTextBox.getText());
            userList.add(person);
            
            if (student.isSelected() == true)
                person.setPermission(0);
            if (administrator.isSelected() == true)
                person.setPermission(2);
            if (faculty.isSelected() == true)
                person.setPermission(1);
            //displays mesage confirming user
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, userNameTextBox.getText() + " has been created. Please login.");
            this.setVisible(false);
        }
            
    }//GEN-LAST:event_registerButtonActionPerformed
/**
 * Exits Register
 * @param evt 
 */
    private void canelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_canelButtonActionPerformed

    
    private LinkedList<User> userList;
    private User person;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton administrator;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton canelButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextBox;
    private javax.swing.JRadioButton faculty;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextBox;
    private javax.swing.ButtonGroup group1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextBox;
    private javax.swing.JLabel password2Label;
    private javax.swing.JPasswordField password2TextBox;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextBox;
    private javax.swing.JButton registerButton;
    private javax.swing.JRadioButton student;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextBox;
    // End of variables declaration//GEN-END:variables
}
