import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Steve
 */

public class EditWindow extends JFrame implements ActionListener
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

    public void actionPerformed(ActionEvent ex)
  {
  }

}
