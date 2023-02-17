import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        ActionListener A = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v.getSendButton(actionPerformed(true));
            }
        };
    }


    public static void main(String[] args) {
        Controller c = new Controller(new Model(), new View());
    }
}
