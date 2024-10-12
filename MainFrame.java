
import javax.swing.*;
import questions.Quiz1;
import questions.Quiz2;
import questions.Quiz3;
import questions.Quiz4;
import questions.Quiz5;
import questions.Quiz6;
import questions.Quiz7;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MainFrame{
    JFrame frame;
    JPanel panel1,panel2,panel3;
    JLabel l1,l2;
    JList list;
    Font myFont=new Font("Times New Roman",Font.BOLD,40);
    Font myFont1=new Font("Times New Roman",Font.BOLD,20);
    JScrollPane scr;

    MainFrame(){
        String[] language={"C Language","C++","Java","Python","HTML","CSS","JavaScript",".",".","."};
        frame=new JFrame();
        frame.setSize(800,600);
        frame.setLocation(280,0);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        panel1=new JPanel();
        panel1.setBounds(0,0,800,150);
        l1=new JLabel("Programming Quiz!");
        l1.setFont(myFont);
        l1.setForeground(Color.WHITE);
        l1.setBounds(200,50,600,50);
        l2=new JLabel("Select any language");
        l2.setFont(myFont1);
        panel1.add(l1);
        panel1.setBackground(Color.BLACK);
        panel1.setLayout(null);
        
        panel3=new JPanel(new FlowLayout());
        panel3.setBounds(200,250,380,30);
        panel3.add(l2);
        panel3.setBackground(Color.CYAN);

        list=new JList(language);
        list.setFont(myFont1);
        list.setVisibleRowCount(5);
        scr=new JScrollPane(list,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        l2.setBounds(150,280,100,40);
        panel2=new JPanel(new GridLayout(1,1));
        panel2.setBounds(200,300,380,150);
        panel2.add(scr,BorderLayout.NORTH);

        frame.getContentPane().add(panel1);
        frame.add(panel3);
        frame.add(panel2);
        frame.setVisible(true);

        ListSelectionListener selectionListener=new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                  String text= (String) list.getSelectedValue();
                  
                    int value =JOptionPane.showConfirmDialog(null, "The Quize will have 10\n Multiple choice question with \nTime of 10  mins,\n Press YES to proceed!", "Reminder", JOptionPane.YES_NO_OPTION);
                    if(value==JOptionPane.YES_OPTION){
                        if(text=="C Language"){
                            Quiz1 q1=new Quiz1();
                            q1.time.start();
                        }
                        if(text=="C++"){
                            Quiz2 q2=new Quiz2();
                            q2.time.start();
                        }
                        if(text=="Java"){
                            Quiz3 q3=new Quiz3();
                            q3.time.start();
                        }
                        if(text=="Python"){
                            Quiz4 q4=new Quiz4();
                            q4.time.start();
                        }
                        if(text=="HTML"){
                            Quiz5 q5=new Quiz5();
                            q5.time.start();
                        }
                        if(text=="CSS"){
                            Quiz6 q6=new Quiz6();
                            q6.time.start();
                        }
                        if(text=="CSS"){
                            Quiz6 q6=new Quiz6();
                            q6.time.start();
                        }
                        if (text=="JavaScript"){
                            Quiz7 q7=new Quiz7();
                            q7.time.start();
                        }
                    }
                    else {
                        frame.dispose();
                        MainFrame m=new MainFrame();
                    }
                }
            }
        };
        list.addListSelectionListener(selectionListener);
    }

    public static void main(String[] args){
        MainFrame m=new MainFrame();
    }
}
