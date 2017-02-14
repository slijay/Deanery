package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {

    private JButton ok;

    public Menu() {
        initialize();
    }

    private void initialize() {
        setTitle("Вхід в систему");
        JPanel contents = new JPanel();
        ok = new JButton("Вхід");
        setContentPane(contents);
        contents.add(ok);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
