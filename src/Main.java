import javax.swing.*;

public class Main {
    /**
     * Main method sets up the GUI
     * @param args
     */
    public static void main(String[] args){
        JFrame frame = new JFrame("Meme Text Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI gui = new GUI();
        frame.getContentPane().add(gui);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
