import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Steve
 */
<<<<<<< HEAD
public abstract class EditWindow extends JFrame implements ActionListener
=======
public class EditWindow extends JFrame implements ActionListener
>>>>>>> 90d43d4647ee8f731df59e8de8bf24c80541b03b
{
    public JLabel editLabel;
    public JButton okButton;
    public JButton cancelButton;
    public JTextField textBox;
    private String commandText;
    
    public EditWindow(String command)
    {
        setSize(300, 150);
        commandText = command;
        editLabel = new JLabel(commandText);
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        //textBox
    }
<<<<<<< HEAD
=======

    public void actionPerformed(ActionEvent ex)
  {
  }
>>>>>>> 90d43d4647ee8f731df59e8de8bf24c80541b03b
}
