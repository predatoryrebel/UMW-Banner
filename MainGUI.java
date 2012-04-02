import javax.swing.*;
import java.util.LinkedList;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Stephen Schmith
 */
 
public class MainGUI extends JFrame implements ActionListener
{
	public JMenuBar mainMenu;
	public JMenu fileMenu;
        public JMenu editMenu;
        public JMenu searchMenu;
        public JMenuItem searchForClassesItem;
	public JMenuItem loginItem;
	public JMenuItem logoutItem;
	public JMenuItem createAccount;
	public JMenuItem exitItem;
        public JMenuItem editFirstName;
        public JMenuItem editLastName;
        public JMenuItem editEmail;
        public JMenuItem editAddress;
        public JMenuItem editMajor;
        public JMenuItem editMinor;
	public Container contentPane;
        public JPanel profile;
        public JTextArea profileText;
        public Login login;
        private User activeUser;
        private LinkedList<Student> studentList;
        private LinkedList<Course> courseList;
        private LinkedList<Faculty> facultyList;
        private LinkedList<User> userList;
	
	public MainGUI(LinkedList<Student> student, LinkedList<Course> course, LinkedList<Faculty> faculty, LinkedList<User> user)
	{
		setSize(680,300);
		contentPane = getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainMenu = new JMenuBar();
		
		// Create File Menu buttons
		fileMenu = new JMenu("File");
                searchMenu = new JMenu("Search");
		loginItem = new JMenuItem("Login");
		loginItem.addActionListener(this);
		logoutItem = new JMenuItem("Logout");
		logoutItem.addActionListener(this);
		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(this);
		createAccount = new JMenuItem("Create Account");
		createAccount.addActionListener(this);
                searchForClassesItem = new JMenuItem("Search For Classes");
                searchForClassesItem.addActionListener(this);
                
                editMenu = new JMenu("Edit");
                editLastName = new JMenuItem("Edit Last Name");
                editLastName.addActionListener(this);
                editFirstName = new JMenuItem("Edit First Name");
                editFirstName.addActionListener(this);
                editEmail = new JMenuItem("Edit Email");
                editEmail.addActionListener(this);
                editAddress = new JMenuItem("Edit Address");
                editAddress.addActionListener(this);
                editMajor = new JMenuItem("Edit Major");
                editMajor.addActionListener(this);
                editMinor = new JMenuItem("Edit Minor");
                editMinor.addActionListener(this);
		
		// Add items to the file menu
		fileMenu.add(loginItem);
		fileMenu.add(exitItem);
                
                // Add Items to the search menu
                searchMenu.add(searchForClassesItem);
                
                // Add items to the edit menu
                editMenu.add(editFirstName);
                editMenu.add(editLastName);
                editMenu.add(editEmail);
                editMenu.add(editAddress);
                editMenu.add(editMajor);
                editMenu.add(editMinor);
		
		// Add menus to the menubar
		mainMenu.add(fileMenu);
           
		setJMenuBar(mainMenu);
                
                // Create login window
                login = new Login(student, course, faculty, user, this);
                
                // Create the profile panel
                profile = new JPanel();
                profileText = new JTextArea();
                
                contentPane.setLayout(new FlowLayout());
                profile.setLayout(new FlowLayout());
                contentPane.add(profile);
                profile.add(profileText);
                
                // Set data members
                studentList = student;
                courseList = course;
                facultyList = faculty;
                userList = user;
	}
        
        // Change the GUI to logged in state
        public void setActiveUser(User currentUser)
        {
            this.setActiveAccount(currentUser);
            fileMenu.remove(loginItem);
            fileMenu.add(logoutItem, 0);
            mainMenu.add(editMenu);
            mainMenu.add(searchMenu);
            
            // If the user is an admin
            if(activeUser.getPermission() == 2)
            {
                fileMenu.add(createAccount, 0);
            }
            
            // Add the current profile's text to the text box
            profileText.setText(activeUser.toString());
        }
        
        // Set the current user's profile to the active account
        private void setActiveAccount(User currentUser)
        {
            this.activeUser = currentUser;
            this.setTitle(currentUser.getFirstName() + " " + currentUser.getLastName() + " - " + currentUser.getEmail());
        }
        
        // Edit the active profile
        private void editProfile(String command)
        {
            
        }
        
        // Actions for the MainGUI
        public void actionPerformed(ActionEvent ex)
        {
            String action = ex.getActionCommand();
            
            // FILE MENU
            
            if(action.equals("Login"))
            {
                // Create Login window
                login.setVisible(true);
            }
            
            // Change the GUI to logged out status.
            // Current user set to NULL
            if(action.equals("Logout"))
            {
                fileMenu.remove(logoutItem);
                fileMenu.add(loginItem, 0);
                mainMenu.remove(searchMenu);
                mainMenu.remove(editMenu);
                this.setTitle("");
                profileText.setText("");
                this.activeUser = null;
            }
            
            if(action.equals("Create Account"))
            {
                
            }
            
            if(action.equals("Search For Classes"))
            {
                SearchClass s = new SearchClass(courseList, studentList, facultyList, activeUser);
                s.setVisible(true);
            }
            
            if(action.equals("Edit First Name"))
            {
                editProfile(action);
            }
            
            if(action.equals("Exit"))
            {
                System.exit(0);
            }
        }
}	