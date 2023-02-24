import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Controller {
    private Model m;
    private View v;

    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;

        JFrame frame = new JFrame();
        frame.setTitle("ClientServerTE20");
        frame.setContentPane(v.getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);

        v.getTextField1();

        v.getTextArea1();

        v.getSendButton();

        ClassLoader cl = this.getClass().getClassLoader();
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(ImageIO.read(cl.getResource("skull.jfif")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setIconImage(icon.getImage());

    }


    public static void main(String[] args) {
        Controller c = new Controller(new Model(), new View());

    }
}
