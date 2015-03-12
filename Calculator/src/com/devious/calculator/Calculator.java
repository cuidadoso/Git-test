package com.devious.calculator;
 
import javax.swing.*;
 
public class Calculator
{
    public static void main(String[] args)
    {
        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {}
 
        JFrame calcFrame = new JFrame("Calculator");
       
        CalcMode model = new CalcMode();        
        CalcPanel calcPanel = new CalcPanel(model);
        calcPanel.init();
                
        calcFrame.setContentPane(calcPanel);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.pack();
        calcFrame.setVisible(true);
    }
}