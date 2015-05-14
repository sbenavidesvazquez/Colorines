/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Sergio Benavides
 */
public class Ventana implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton botAz,botAm,botVer;
    
    
    public void amosar(){
        marco=new JFrame("Colores");
        panel=new JPanel();
        botAz=new JButton("Azul");
        botAm=new JButton("Amarillo");
        botVer=new JButton("Verde");
        
        panel.setLayout(new FlowLayout());
        
        panel.add(botAz);
        panel.add(botAm);
        panel.add(botVer);
        marco.add(panel);
        marco.setSize(250, 250);
        
        botAz.addActionListener(this);
        botAm.addActionListener(this);
        botVer.addActionListener(this);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(botAz==e.getSource()){
            panel.setBackground(Color.BLUE);
        }
        if(botAm==e.getSource()){
            panel.setBackground(Color.YELLOW);
        }
        if(botVer==e.getSource()){
            panel.setBackground(Color.GREEN);
        }
        
    }
    
}
