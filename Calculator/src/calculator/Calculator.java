/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;


public class Calculator extends JPanel implements ActionListener{
    JLabel label1,label2,label3,label4,label5,label6;
    JPanel panel1,panel2;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    Font font;
    JTextField text1, text2,text3;
    JButton button1, button2;
    public Calculator(){
        font = new Font(" ",Font.BOLD,24);
        // general panel layout
        setLayout(null);
       // 1
       label1 = new JLabel("Simple calculator");
       label1.setFont(font);
       label1.setBounds(140,10,300,50);
       add(label1);
       // 2
      label2 = new JLabel("Operation");
      label2.setForeground(Color.BLUE);
      label2.setBounds(20,57,70,50);
      add(label2);
      r1 = new JRadioButton("Adition");
      r1.setBounds(30,90,70,50);add(r1); 
      r2 = new JRadioButton("Subtraction");
      r2.setBounds(120,90,100,50);add(r2); 
      r3 = new JRadioButton("Multiplication");
      r3.setBounds(220,90,100,50);add(r3); 
      r4 = new JRadioButton("Division");
      r4.setBounds(320,90,100,50);add(r4); 
      // 3
      label3 = new JLabel("Values");
      label3.setForeground(Color.BLUE);
      label3.setBounds(85,157,70,50);add(label3);
      label4 = new JLabel("First Number: ");
      label4.setBounds(90,200,100,80);add(label4);
      text1 = new JTextField();
      text1.setBounds(250,230,50,20);add(text1);
      label5 = new JLabel("Second Number: ");
      label5.setBounds(90,280,100,80);add(label5);
      text2 = new JTextField();
      text2.setBounds(250,310,50,20);add(text2);
      label6 = new JLabel("Result:");
      label6.setBounds(90,380,100,80);add(label6);
      text3 = new JTextField();
      text3.setBounds(250,410,50,20);add(text3);
      button1 = new JButton("Calculate");
      button1.setBounds(130,500,100,30);add(button1);
     button2 = new JButton("Close");
     button2.setBounds(260,500,100,30);add(button2);
//     r1.addItemListener(this);
//     r2.addItemListener(this);
//     r3.addItemListener(this);
//     r4.addItemListener(this);
//     button1.addItemListener(this);
//     button2.addItemListener(this);

       r1.addActionListener(this);
       r2.addActionListener(this);
       r3.addActionListener(this);
       r4.addActionListener(this);
       button1.addActionListener(this);
       button2.addActionListener(this);
     
    }
    public void paintComponent(Graphics g){
        g.drawRect(1,85,450,60);
        g.clearRect(15, 80,65,10);
        
        g.drawRoundRect(80, 180, 300, 300, 0, 0);
        g.clearRect(83, 180,50,10);
        
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 700);
        f.setVisible(true);
        Calculator clc = new Calculator();
        f.add(clc);
    }

//    @Override
//    public void itemStateChanged(ItemEvent ie) {
//        int result=0;
//        if(r1.isSelected()){
//            
//            String num1= text1.getText().toString();
//            String num2= text2.getText().toString();
//            int n1 =Integer.parseInt(num1);
//            int n2 =Integer.parseInt(num2);
//            result= n1+n2;
//            text3.setText(result+"");
//        }
//        if(r2.isSelected()){
//            String num1= text1.getText().toString();
//            String num2= text2.getText().toString();
//            int n1 =Integer.parseInt(num1);
//            int n2 =Integer.parseInt(num2);
//            result= n1-n2;
//            text3.setText(result+"");
//        }
//        if(r3.isSelected()&& ie.getSource()==button1){
//            String num1= text1.getText().toString();
//            String num2= text2.getText().toString();
//            int n1 =Integer.parseInt(num1);
//            int n2 =Integer.parseInt(num2);
//            result= n1*n2;
//            text3.setText(result+"");
//        }
//        if(r4.isSelected()&& ie.getSource()==button1){
//            String num1= text1.getText().toString();
//            String num2= text2.getText().toString();
//            int n1 =Integer.parseInt(num1);
//            int n2 =Integer.parseInt(num2);
//            result= n1/n2;
//            text3.setText(result+"");
//        }
//        if(ie.getSource()==button2){
//            System.exit(0);
//        }
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int result=0;
        if(ae.getSource()==button1 && r1.isSelected()){
           String num1= text1.getText().toString();
            String num2= text2.getText().toString();
            int n1 =Integer.parseInt(num1);
            int n2 =Integer.parseInt(num2);
            result= n1+n2;
            text3.setText(result+"");
            
        }if(ae.getSource()==button1 && r2.isSelected()){
           String num1= text1.getText().toString();
            String num2= text2.getText().toString();
            int n1 =Integer.parseInt(num1);
            int n2 =Integer.parseInt(num2);
            result= n1-n2;
            text3.setText(result+"");
            
        }if(ae.getSource()==button1 ){
            if(r3.isSelected()){
           String num1= text1.getText().toString();
            String num2= text2.getText().toString();
            int n1 =Integer.parseInt(num1);
            int n2 =Integer.parseInt(num2);
            result= n1*n2;
            text3.setText(result+"");
            
        }if(ae.getSource()==button1 && r4.isSelected()){
           String num1= text1.getText().toString();
            String num2= text2.getText().toString();
            int n1 =Integer.parseInt(num1);
            int n2 =Integer.parseInt(num2);
            result= n1/n2;
            text3.setText(result+"");
            
        }
    }
    
}
