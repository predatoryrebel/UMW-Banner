/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cjoyner
 */
import java.awt.Component;
import java.util.*;
import javax.swing.JPanel;
public class Login extends javax.swing.JFrame {

    // Can be used as a link to the main window
    // If you need to change the main window, write a new method in MainGUI and call it from your class
    private MainGUI mainWindow;
    
    /**
     * Creates new form Login
     */
    
    public Login(LinkedList<User> user, MainGUI mw) {
        initComponents();
        userList = user;
        mainWindow = mw;    // The Main GUI. mainWindow can be used to call methods in the MainGUI object.
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        userNameTextBox = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        passwordTextBox = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userNameLabel.setText("User Name");

        passwordLabel.setText("Password");

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoginButton)
                        .addGap(52, 52, 52)
                        .addComponent(registerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel)
                            .addComponent(passwordLabel))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(passwordTextBox))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(registerButton))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        ListIterator<User> iterator = userList.listIterator();
       
        while (iterator.hasNext())
        {
            User element = iterator.next();
            if(element.getUserName().equalsIgnoreCase(userNameTextBox.getText()))
            {
                if (element.getPassword().equals(passwordTextBox.getText()));
                {
                    mainWindow.setActiveUser(element);    // Set the active account to the user who just logged in.
                    //SearchClass search = new SearchClass(courseList, studentList, facultyList, element);
                    //search.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        Register registerPanel = new Register(userList);
        registerPanel.setVisible(true);
        
    }//GEN-LAST:event_registerButtonActionPerformed

    
    private LinkedList<User> userList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextBox;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextBox;
    // End of variables declaration//GEN-END:variables
}

