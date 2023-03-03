import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//NÄR SKA DET GÖRAS??

public class Controller {
    private Model m;
    private View v;

    public Controller(Model m, View v) {
        this.m = m;
        this.v = v;

        JFrame frame = new JFrame();
        frame.setTitle("ClientServerTE20");
        frame.setContentPane(v.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);



        ClassLoader cl = this.getClass().getClassLoader();
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(ImageIO.read(cl.getResource("skull.jfif")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setIconImage(icon.getImage());

    }


    public static void main(String[] args) throws IOException {
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m,v);
        m.getPrint();
        m.getServer();
    }
}
