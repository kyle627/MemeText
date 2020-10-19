import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI extends JPanel{

    private JButton button;
    private JTextArea out, field;

    /**
     *
     * constructs panel
     */
    public GUI(){

        setUpField();
        setUpButton();
        setUpOut();

        button.addActionListener(new ButtonListener());

        setPreferredSize(new Dimension(800, 300)); //length x width
        setBackground(Color.cyan.darker());
    }

    private void setUpOut() {
        out = new JTextArea(10,30);
        out.setText("Meme text will output here.");
        out.setEditable(false);
        add(out); //adds the text area to the GUI
        out.setLineWrap(true);
        out.setWrapStyleWord(true);
    }

    private void setUpButton() {
        button = new JButton();
        button.setText("Enter");
        add(button);
    }

    private void setUpField() {
        field = new JTextArea(10,30);
        field.setText("Enter phrase here");
        add(field);
        field.setLineWrap(true);
        field.setWrapStyleWord(true);
    }

    /**
     *
     * appends output area with nothing then runs the conversion
     */
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Converter converter = new Converter();
            out.setText("");
            out.append(converter.makeMeme(field.getText()));
        }
    }

}


