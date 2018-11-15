package com.artur85;

import javax.swing.*;

public class UserInterface extends JFrame {
    private JPanel mainPanel;
    private JTextField sumField;
    private JTextField periodField;
    private JButton depositButton;
    private JList list1;
    private JButton buyButton;
    private JLabel businessLabel;
    private JLabel depositLabel;
    private JLabel appName;
    private JLabel wealth;
    private JLabel wealthSize;
    private JLabel earnings;
    private JLabel earningsSize;
    private JLabel depositInfo;
    private JLabel depositPeriod;
    private JLabel sumLabel;
    private JLabel businessInfo;
    private JSeparator topSeparator;


    public UserInterface() {
        super("My First App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setSize(600, 400);
        //pack();
    }
}
