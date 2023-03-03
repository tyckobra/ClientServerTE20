import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class View {
        private JPanel panel;
        private JButton sendButton;
        private JTextArea textArea;
        private JTextField textField;

        public JPanel getPanel () {
            return panel;
        }

        public JButton getSendButton () {
            return sendButton;
        }

        public JTextArea getTextArea () {
            return textArea;
        }

        public JTextField getTextField () {
            return textField;
        }


            ActionListener SendButton = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getSendButton().addActionListener(SendButton);
                }
            };

            ActionListener text = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textArea.getText());
                    text.toString();
                }
            };

}
