package com.example.battleshipv7.GUI;
import com.example.battleshipv7.GUI.Update_view;
import javax.swing.*;
import java.awt.*;

public class BoardGUI extends JFrame {

    public static JFrame frame;
    JPanel mainPanel;
    JPanel buttonPanel;
    public static JButton instructionBtn;
    public static JButton playBtn;

    public BoardGUI() {
    }

    public void createMainBoard()
    {
        frame=new JFrame();
        frame.setTitle("Game Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add(BorderLayout.CENTER);

        //Grid JPanel
        mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=2;

        //Label:
        JLabel label = new JLabel("Welcome to Battleship! Let's Play!");
        c.insets = new Insets(2, 2, 70, 2);
        c.gridx = 1;
        c.gridy = 0;
        label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        mainPanel.add(label,c);

        //platBtn:
        playBtn=new JButton("New Game");
        playBtn.addActionListener(new Update_view());
        playBtn.setPreferredSize(new Dimension(120,70));
        playBtn=new JButton("",new ImageIcon(getClass().getResource("/static/start.png")));
        playBtn.setBackground(Color.decode("#A3E4E1"));
        c.fill = GridBagConstraints.CENTER;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 3;
        mainPanel.add(playBtn,c);

        //Instructions Button:
        instructionBtn=new JButton("Instructions");
        instructionBtn.addActionListener(new Update_view());
        c.fill = GridBagConstraints.CENTER;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 4;
        instructionBtn=new JButton("",new ImageIcon(getClass().getResource("/static/instructions.png")));
        instructionBtn.setBackground(Color.decode("#A3E4E1"));
        mainPanel.add(instructionBtn,c);

        //Main Frame
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(mainPanel);
    }
}
