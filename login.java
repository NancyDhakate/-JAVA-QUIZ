import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class login extends JFrame implements ActionListener {
  JButton back, rules;
  JTextField tfname;

  login() {
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/login.jpeg"));
    JLabel image = new JLabel(i1);
    image.setBounds(0, 0, 600, 500);
    add(image);

    JLabel heading = new JLabel("Simple Minds");
    heading.setBounds(750, 60, 300, 45);
    heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
    heading.setForeground(new Color(30, 144, 254));
    add(heading);

    JLabel name = new JLabel("Enter your name : ");
    name.setBounds(810, 150, 300, 20);
    name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
    name.setForeground(new Color(30, 144, 254));
    add(name);

    tfname = new JTextField();
    tfname.setBounds(735, 200, 300, 25);
    tfname.setFont(new Font("Times new roman", Font.BOLD, 20));
    add(tfname);

    rules = new JButton("Rules");
    rules.setBounds(735, 270, 120, 25);
    rules.setForeground(new Color(30, 144, 254));
    rules.addActionListener(this);
    add(rules);

    back = new JButton("Back");
    back.setBounds(915, 270, 120, 25);
    back.setForeground(new Color(30, 144, 254));
    back.addActionListener(this);
    add(back);

    setSize(1200, 500);
    setLocation(150, 200);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == rules) {
      String name = tfname.getText();
      setVisible(false);
      new Rules(name); // Ensure the correct constructor is called
    } else if (ae.getSource() == back) {
      setVisible(false);
    }
  }

  public static void main(String[] args) {
    new login();
  }
}