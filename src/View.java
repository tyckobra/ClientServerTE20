import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class View {
    private JPanel panel1;
    private JTextField textField1;
    private JButton sendButton;
    private JTextArea textArea1;

    public View() {
        textField1.addActionListener(new TextAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sendButton.addActionListener(new TextAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

}
