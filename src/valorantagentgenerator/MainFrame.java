/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorantagentgenerator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Julius Grajo
 */
public class MainFrame extends JFrame {
    
    MainFrame() {

        // Frame logo
        ImageIcon imageIcon = new ImageIcon("src/ValorantIcon.png");
        this.setIconImage(imageIcon.getImage());
        
        //Background
        this.getContentPane().setBackground(new Color(250,68,84));
        
        // Title
        JLabel title = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.BLACK,1);
        
        ImageIcon valorantIcon = new ImageIcon("src/images/ValorantIcon.png");
        Image image = valorantIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon valicon = new ImageIcon(newimg);
        
        title.setText("Valorant Random Agent Selector");
        title.setIcon(valicon);
        
        //for icon
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);
        title.setFont(new Font("Bahnscrift", Font.BOLD, 14));
        
        //for screen alignment
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(0, 0, 485, 50);
        
        title.setBackground(new Color (183,132,96));
        title.setBorder(border);
        title.setOpaque(true);
        title.setForeground(new Color (54,73,102));
        title.setIconTextGap(10);
        
        
        this.setTitle("Valorant Agent Generator"); // title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit app
        this.setResizable(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(title);
        
        
    }
    
}
