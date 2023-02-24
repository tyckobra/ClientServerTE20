import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class View {
    private JPanel panel1;
    private JButton sendButton;
    private JTextArea textArea1;
    private JTextField textField1;

    public JPanel getPanel1() {
        return panel1;
    }

    public JButton getSendButton() {return sendButton; }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public JTextField getTextField1() {
        return textField1;
    }
}
