/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author ThinkPad
 */
public class Home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        TampilGambar halamanPin = new TampilGambar();
        //menambahkan title pada page pin
        halamanPin.setTitle("Authentication Your Pin");
        //hide maximize
        halamanPin.setResizable(false);
        halamanPin.setVisible(true);
        halamanPin.getContentPane().setBackground(Color.blue);
        menu menu  = new menu();
        menu.getContentPane().setBackground(Color.blue);
        halamanPin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Nama : M Septiawan_226240097
        //Github Account https://github.com/Mseptiawan1
        //Thankyou for StackOverFlow
        
        
    }
    
} 