import javax.swing.*;
import java.util.LinkedList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

/**
 * @author Stephen Schmith
 */
 
public class MainGUI extends JFrame implements ActionListener
{
	public JMenuBar mainMenu;
	public JMenu fileMenu;
        public JMenu editMenu;
        public JMenu searchMenu;
        public JMenuItem dropAStudentFromTheUniversity;
        public JMenuItem dropAStudent;
        public JMenuItem dropItem;
        public JMenuItem searchForClassesItem;
	public JMenuItem loginItem;
	public JMenuItem logoutItem;
	public JMenuItem createAccount;
	public JMenuItem exitItem;
        public JMenuItem editFirstName;
        public JMenuItem editLastName;
        public JMenuItem editEmail;
        public JMenuItem editMajor;
        public JMenuItem editMinor;
        public JMenuItem createCourse;
        public JMenuItem dropACourse;
        public JMenuItem addGrade;
	public Container contentPane;
        // Display components
        // User Profile
        public JPanel profile;
        
        // Personal Info
        public JPanel personalPanel;
        public JLabel nameLabel;
        public JLabel emailLabel;
        public JLabel majorLabel;
        
        public JLabel blankLabel;
        
        // Academic Info
        public JPanel academicPanel;
        public JLabel currentCreditsLabel;
        public JLabel totalCreditsLabel;
        public JLabel gpaLabel;
        
        // Schedule
        public JPanel schedulePanel;
        public JLabel placeholder;
        // Organize scheduling info here
        
        public Login login;
        private User activeUser;
        private LinkedList<Student> studentList;
        private LinkedList<CurrentCourse> courseList;
        private LinkedList<Faculty> facultyList;
        private LinkedList<Admin> adminList;
        private LinkedList<User> userList;
        private LinkedList<PastCourse> pastList;
	
	public MainGUI(LinkedList<Student> student, LinkedList<CurrentCourse> course, LinkedList<Faculty> faculty, LinkedList<User> user,
                LinkedList<Admin> admin, LinkedList<PastCourse> past)
	{
		setSize(680,300);
		contentPane = getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainMenu = new JMenuBar();
		
		// Create File Menu buttons
		fileMenu = new JMenu("File");
                searchMenu = new JMenu("Search");
                addGrade = new JMenuItem("Add a Grade");
                addGrade.addActionListener(this);
                dropACourse = new JMenuItem("Drop a Course from the Course List");
                dropACourse.addActionListener(this);
                dropAStudentFromTheUniversity = new JMenuItem("Drop a Student from The University");
                dropAStudentFromTheUniversity.addActionListener(this);
                dropAStudent = new JMenuItem("Drop a Student from a Course");
                dropAStudent.addActionListener(this);
                dropItem = new JMenuItem("Drop");
                dropItem.addActionListener(this);
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
                editMajor = new JMenuItem("Edit Major");
                editMajor.addActionListener(this);
                editMinor = new JMenuItem("Edit Minor");
                editMinor.addActionListener(this);
                createCourse = new JMenuItem("Create Course");
                createCourse.addActionListener(this);
		
		// Add items to the file menu
		fileMenu.add(loginItem);
                fileMenu.add(createAccount);
		fileMenu.add(exitItem);
                
                // Add Items to the search menu
                searchMenu.add(searchForClassesItem);
                
                // Add items to the edit menu
                editMenu.add(editFirstName);
                editMenu.add(editLastName);
                editMenu.add(editEmail);
		
		// Add menus to the menubar
		mainMenu.add(fileMenu);
           
		setJMenuBar(mainMenu);
                
                // Create login window
                login = new Login(user, this);
                
                // Create the profile panel
                profile = new JPanel();
                contentPane.setLayout(new BorderLayout());
                profile.setLayout(new GridLayout(2,1,0,0));
                profile.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
                profile.setFont(new Font("SansSerif", Font.PLAIN, 12));
                
                // Create the personal info panel
                // Initalize components
                personalPanel = new JPanel();
                personalPanel.setLayout(new GridLayout(3,1,0,0));
                nameLabel = new JLabel("Name:");
                nameLabel.setFont(null);
                emailLabel = new JLabel("Email:");
                emailLabel.setFont(null);
                majorLabel = new JLabel("Major:");
                majorLabel.setFont(null);
                
                
                personalPanel.add(nameLabel);
                personalPanel.add(emailLabel);
                personalPanel.add(majorLabel);
               
                
                // Create the academic info panel
                // Initialize components
                academicPanel = new JPanel();
                academicPanel.setLayout(new GridLayout(3,1,0,0));
                currentCreditsLabel = new JLabel("Current Credits:");
                currentCreditsLabel.setFont(null);
                totalCreditsLabel = new JLabel("Earned Credits:");
                totalCreditsLabel.setFont(null);
                gpaLabel = new JLabel("GPA:");
                gpaLabel.setFont(null);
                academicPanel.add(currentCreditsLabel);
                academicPanel.add(totalCreditsLabel);
                academicPanel.add(gpaLabel);
                
                profile.add(personalPanel);
                profile.add(academicPanel);
                
                // Configure the schedule panel
                schedulePanel = new JPanel();
                schedulePanel.setLayout(new FlowLayout());
                schedulePanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
                placeholder = new JLabel("schedule");
                schedulePanel.add(placeholder);
                
                // Add everything to the content pane
                contentPane.add(profile,BorderLayout.WEST);
                contentPane.add(schedulePanel, BorderLayout.CENTER);
                contentPane.setVisible(false);
                
                
                // Set data members
                studentList = student;
                courseList = course;
                facultyList = faculty;
                adminList = admin;
                userList = user;
                pastList = past;
	}
        
        // Change the GUI to logged in state
        public void setActiveUser(User currentUser)
        {
            this.activeUser = currentUser;
            
            fileMenu.remove(loginItem);
            fileMenu.add(logoutItem, 0);
            mainMenu.add(editMenu);
            mainMenu.add(searchMenu);
            
            // Set basic information
            nameLabel.setText("<html><b>Name:</b>  " + activeUser.getFirstName() + " " + activeUser.getLastName() + "</html>");
            emailLabel.setText("<html><b>Email:  </b>" + activeUser.getEmail() + "</html>");    
            
            // If the user is an admin
            if(activeUser.getPermission() == 2)
            {
                fileMenu.add(createAccount);
                searchMenu.add(dropAStudent);
                searchMenu.add(dropAStudentFromTheUniversity);
                searchMenu.add(dropACourse);
                editMenu.add(createCourse);
                academicPanel.setVisible(false);
                majorLabel.setVisible(false);
            }
            if (activeUser.getPermission() == 0)
            {
                fileMenu.add(createAccount);
                searchMenu.add(dropItem);
                editMenu.add(editMajor);
                editMenu.add(editMinor);
                academicPanel.setVisible(true);
                Student s = (Student)activeUser;
                majorLabel.setText("<html><b>Major:</b>  " + s.getMajor() + "</html>");
                majorLabel.setVisible(true);
                currentCreditsLabel.setText("<html><b>Current Credits:</b>  " + s.getCreditHoursEnrolled() + "</html>");
                currentCreditsLabel.setVisible(true);
                totalCreditsLabel.setText("<html><b>Earned Credits:</b>  " + s.getEarnedCredits() + "</html>");
                gpaLabel.setText("<html><b>GPA:</b>  " + s.getGPA() + "</html>");
                gpaLabel.setVisible(true);
            }
            
            if (activeUser.getPermission() == 1)
            {
                fileMenu.add(createAccount);
                searchMenu.add(dropAStudent);
                searchMenu.add(addGrade);
                editMenu.add(createCourse);
                academicPanel.setVisible(false);
                majorLabel.setVisible(false);
            }
            contentPane.setVisible(true);
            refreshWindow();
        }
        
        // Set the current user's profile to the active account
        private void refreshWindow()
        {
            this.setVisible(false);
    
            // Set the title bar
            this.setTitle(activeUser.getFirstName() + " " + activeUser.getLastName() + " - " + activeUser.getEmail());
            
            this.setVisible(true);
        }
        
        // Actions for the MainGUI
        public void actionPerformed(ActionEvent ex)
        {
            String action = ex.getActionCommand();
            
            // FILE MENU
            
            if(action.equals("Login"))
            {
                // Create Login window
                login.clearText();
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
                contentPane.setVisible(false);
                
                Backup backup = new Backup();
                backup.backupAll(courseList, studentList, facultyList, adminList, pastList);
                this.activeUser = null;
            }
            
            if(action.equals("Create Account"))
            {
                if (activeUser.getPermission() == 0)
                {
                    CreateAccount createAccountWindow = new CreateAccount(activeUser, studentList);
                    createAccountWindow.setVisible(true);
                }
                
                if (activeUser.getPermission() == 1 || activeUser.getPermission() == 2)
                {
                    CreateAccountAdminAndFaculty createAccount = new CreateAccountAdminAndFaculty(activeUser, facultyList, adminList);
                    createAccount.setVisible(true);
                }
            }
            
            if(action.equals("Search For Classes"))
            {
                if (activeUser.getPermission() == 0)
                {
                    SearchClass s = new SearchClass(courseList, studentList, activeUser);
                    s.setVisible(true);
                }
            }
            
            if(action.equals("Drop"))
            {
                if (activeUser.getPermission() == 0)
                {    
                    FindUser find = new FindUser(activeUser, adminList, studentList, facultyList);
                    Student user = find.findStudent();
                    DropClass d = new DropClass(user, studentList, courseList);
                    d.setVisible(true);
                }
            }
            
            if (action.equals("Drop a Student from a Course"))
            {
                if (activeUser.getPermission() == 2)
                {
                   DropAStudentAdmin d = new DropAStudentAdmin(studentList, courseList);
                   d.setVisible(true);
                }
                if (activeUser.getPermission() == 1)
                {
                    FindUser find = new FindUser(activeUser, adminList, studentList, facultyList);
                    Faculty professor = find.findFaculty();
                    DropAStudentFaculty d = new DropAStudentFaculty(professor, studentList, courseList);
                    d.setVisible(true);
                }
            }
            
            if (action.equals("Drop a Student from The University"))
            {
                if (activeUser.getPermission() == 2)
                {
                    DropAStudentFromTheUniversityAdmin d = new DropAStudentFromTheUniversityAdmin(studentList, courseList);
                    d.setVisible(true);
                }
            }

            if (action.equals("Create Course"))
            {
                if ((activeUser.getPermission() == 2) || (activeUser.getPermission() == 1))
                {
                    CreateCourse d = new CreateCourse(courseList);
                    d.setVisible(true);
                }
            }
            
            if (action.equals("Drop a Course from the Course List"))       
            {
                if (activeUser.getPermission() == 2)
                {
                    DropACourse d = new DropACourse(courseList, studentList);
                    d.setVisible(true);
                }
            }
            
            if (action.equals("Add a Grade"))
            {
                if (activeUser.getPermission() == 1)
                {
                    FindUser find = new FindUser(activeUser, adminList, studentList, facultyList);
                    Faculty professor = find.findFaculty();
                    GradeAStudent g = new GradeAStudent(professor, pastList, courseList, studentList);
                    g.setVisible(true);
                }
            }
            
            if(action.equals("Edit First Name"))
            {
                // Get the new name from the JOptionPane
                String newFirstName = JOptionPane.showInputDialog("Edit First Name", activeUser.getFirstName());
                
                // If the user presses OK, change the name and refresh the window.
                // Otherwise, do nothing.
                if(newFirstName != null)
                {
                    activeUser.setFirstName(newFirstName);
                    nameLabel.setText("<html><b>Name:</b>  " + activeUser.getFirstName() + " " + activeUser.getLastName() + "</html>");
                    refreshWindow();
                }
            }
            
            if(action.equals("Edit Last Name"))
            {
                // Get the new name from the JOptionPane
                String newLastName = JOptionPane.showInputDialog("Edit Last Name", activeUser.getLastName());
                
                // If the user presses OK, change the name and refresh the window.
                // Otherwise, do nothing.
                if(newLastName != null)
                {
                    activeUser.setLastName(newLastName);
                    nameLabel.setText("<html><b>Name</b>:  " + activeUser.getFirstName() + " " + activeUser.getLastName() + "</html>");
                    refreshWindow();
                }
            }
            
            if(action.equals("Edit Email"))
            {
                // Get the new name from the JOptionPane
                String newEmail = JOptionPane.showInputDialog("Edit Email", activeUser.getEmail());
                
                // If the user presses OK, change the name and refresh the window.
                // Otherwise, do nothing.
                if(newEmail != null)
                {
                    activeUser.setEmail(newEmail);
                    emailLabel.setText("<html><b>Email:</b>  " + activeUser.getEmail() + "</html>");    
                    refreshWindow();
                }
            }
            
            if(action.equals("Edit Major"))
            {
                // User must be a student to perform this action
                Student student = (Student)activeUser;
                String major = JOptionPane.showInputDialog("Edit Major", student.getMajor());
                
                if(major != null)
                {
                    student.setMajor(major);
                    majorLabel.setText("<html><b>Major:</b>  " + student.getMajor() + "</html>");
                    refreshWindow();
                }
            }
            
            if(action.equals("Edit Minor"))
            {
                // User must be a student to perform this action
                Student student = (Student)activeUser;
                String minor = JOptionPane.showInputDialog("Edit Minor", student.getMinor());
                
                if(minor != null)
                {
                    student.setMinor(minor);
                }
            }
            
            if(action.equals("Exit"))
            {
                Backup backup = new Backup();
                backup.backupAll(courseList, studentList, facultyList, adminList, pastList);
                System.exit(0);
            }
        }
}	