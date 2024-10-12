package questions;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quiz7{
    public int count=0,correct=0;
    public static Timer time;
    public Quiz7(){
        JFrame frame1=new JFrame();				//declaration of frames & components.
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JLabel title=new JLabel("Javascript Quiz");
        JLabel timer=new JLabel();
        JButton submit=new JButton("Submit");
        JButton back=new JButton("Back");
        JPanel btnPanel=new JPanel();
        JPanel[] subPanel=new JPanel[10];
        for(int i=0;i<10;i++){
            subPanel[i]=new JPanel();
            subPanel[i].setLayout(new BoxLayout(subPanel[i], BoxLayout.Y_AXIS));
        }

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(801,600);
        frame1.setLocation(280,0);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.add(panel1);								//adding of components to jframe.
        frame1.add(panel2);
        frame1.add(panel3);
        frame1.add(panel4);
        panel1.add(title);								//adding title label into panel1.
        panel2.add(timer);
        panel4.add(submit);
        panel4.add(back);
        title.setFont(new Font(Font.SANS_SERIF,Font.BOLD,22));
        timer.setFont(new Font(Font.SANS_SERIF,Font.BOLD,17));
        panel1.setBounds(1,1,599,50);							//panel dimensions and sizes.
        panel2.setBounds(600,1,199,50);
        panel3.setBounds(1,50,799,400);
        panel4.setBounds(1,449,799,50);
        submit.setBounds(125,460,100,30);
        back.setBounds(275,460,100,30);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black,1));		//setting border to panels.
        panel2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        panel3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        panel4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        panel3.setLayout(new BorderLayout());

        //Creating radio buttons for option --->
        JRadioButton[][] option=new JRadioButton[10][4];
        for(int i=0;i<10;i++){
            for(int j=0;j<4;j++){
                option[i][j]=new JRadioButton();
                option[i][j].setFont(new Font("Calibri",Font.BOLD,22));
            }
        }
        //------------------------------

        // Que 1  -------->
        JLabel que1=new JLabel("<html><br><br> Q.1) Javascript is an _______ language?<br><br> </html>");
        que1.setFont(new Font("Calibri",Font.BOLD,22));
        option[0][0].setText("Object-Oriented");
        option[0][1].setText("Object-Based");
        option[0][2].setText("Procedural");
        option[0][3].setText("None of the above");
        ButtonGroup group1=new ButtonGroup();
        group1.add(option[0][0]);
        group1.add(option[0][1]);
        group1.add(option[0][2]);
        group1.add(option[0][3]);
        subPanel[0].add(que1);
        subPanel[0].add(option[0][0]);
        subPanel[0].add(option[0][1]);
        subPanel[0].add(option[0][2]);
        subPanel[0].add(option[0][3]);
        panel3.add(subPanel[0]);
        //----------------

        // Que 2  -------->
        JLabel que2=new JLabel("<html><br><br> Q.2) Which of the following keyword is used to define a variable in javascript?<br><br> </html>");
        que2.setFont(new Font("Calibri",Font.BOLD,22));
        option[1][0].setText("var");
        option[1][1].setText("let");
        option[1][2].setText("Both A nad B");
        option[1][3].setText("None of the above");
        ButtonGroup group2=new ButtonGroup();
        group2.add(option[1][0]);
        group2.add(option[1][1]);
        group2.add(option[1][2]);
        group2.add(option[1][3]);
        subPanel[1].add(que2);
        subPanel[1].add(option[1][0]);
        subPanel[1].add(option[1][1]);
        subPanel[1].add(option[1][2]);
        subPanel[1].add(option[1][3]);
        //----------------

        // Que 3  -------->
        JLabel que3=new JLabel("<html><br><br> Q.3) Which of the following method is used to access HTML element using Javascript?<br><br> </html>");
        que3.setFont(new Font("Calibri",Font.BOLD,22));
        option[2][0].setText("getElementbyid()");
        option[2][1].setText("getElementByClassName");
        option[2][2].setText("Both A and B");
        option[2][3].setText("None of the above");
        ButtonGroup group3=new ButtonGroup();
        group3.add(option[2][0]);
        group3.add(option[2][1]);
        group3.add(option[2][2]);
        group3.add(option[2][3]);
        subPanel[2].add(que3);
        subPanel[2].add(option[2][0]);
        subPanel[2].add(option[2][1]);
        subPanel[2].add(option[2][2]);
        subPanel[2].add(option[2][3]);
        //----------------

        // Que 4  -------->
        JLabel que4=new JLabel("<html><br><br> Q.4) Upon encountering empty statements, what does the javascript interpreter do?<br><br> </html>");
        que4.setFont(new Font("Calibri",Font.BOLD,22));
        option[3][0].setText("Throws an error");
        option[3][1].setText("ignores the statement");
        option[3][2].setText("Gives a warning");
        option[3][3].setText("None of the above");
        ButtonGroup group4=new ButtonGroup();
        group4.add(option[3][0]);
        group4.add(option[3][1]);
        group4.add(option[3][2]);
        group4.add(option[3][3]);
        subPanel[3].add(que4);
        subPanel[3].add(option[3][0]);
        subPanel[3].add(option[3][1]);
        subPanel[3].add(option[3][2]);
        subPanel[3].add(option[3][3]);
        //----------------

        // Que 5  -------->
        JLabel que5=new JLabel("<html><br><br> Q.5) Which of the following methods can be used to display data in some form using Javascript?<br><br> </html>");
        que5.setFont(new Font("Calibri",Font.BOLD,22));
        option[4][0].setText("document.write()");
        option[4][1].setText("console.log()");
        option[4][2].setText("window.alert()");
        option[4][3].setText("All of the above");
        ButtonGroup group5=new ButtonGroup();
        group5.add(option[4][0]);
        group5.add(option[4][1]);
        group5.add(option[4][2]);
        group5.add(option[4][3]);
        subPanel[4].add(que5);
        subPanel[4].add(option[4][0]);
        subPanel[4].add(option[4][1]);
        subPanel[4].add(option[4][2]);
        subPanel[4].add(option[4][3]);
        //----------------

        // Que 6  -------->
        JLabel que6=new JLabel("<html><br><br> Q.6)How can a datatype be declared to be a constant type?<br><br> </html>");
        que6.setFont(new Font("Calibri",Font.BOLD,22));
        option[5][0].setText("const");
        option[5][1].setText("var");
        option[5][2].setText("let");
        option[5][3].setText("constant");
        ButtonGroup group6=new ButtonGroup();
        group6.add(option[5][0]);
        group6.add(option[5][1]);
        group6.add(option[5][2]);
        group6.add(option[5][3]);
        subPanel[5].add(que6);
        subPanel[5].add(option[5][0]);
        subPanel[5].add(option[5][1]);
        subPanel[5].add(option[5][2]);
        subPanel[5].add(option[5][3]);
        //----------------

        // Que 7  -------->
        JLabel que7=new JLabel("<html><br><br> Q.7) What keyword is used to check whether a given property is valid or not? <br><br> </html>");
        que7.setFont(new Font("Calibri",Font.BOLD,22));
        option[6][0].setText("in");
        option[6][1].setText("is in");
        option[6][2].setText("exists");
        option[6][3].setText("lies");
        ButtonGroup group7=new ButtonGroup();
        group7.add(option[6][0]);
        group7.add(option[6][1]);
        group7.add(option[6][2]);
        group7.add(option[6][3]);
        subPanel[6].add(que7);
        subPanel[6].add(option[6][0]);
        subPanel[6].add(option[6][1]);
        subPanel[6].add(option[6][2]);
        subPanel[6].add(option[6][3]);
        //----------------

        // Que 8  -------->
        JLabel que8=new JLabel("<html><br><br> Q.8) What is the use of the <noscript> tag in javascript?<br><br> </html>");
        que8.setFont(new Font("Calibri",Font.BOLD,22));
        option[7][0].setText("The contents are displayed by non-JS-based browsers.");
        option[7][1].setText("Clears all the cookies and cache");
        option[7][2].setText("Both A and B");
        option[7][3].setText("None of the above.");
        ButtonGroup group8=new ButtonGroup();
        group8.add(option[7][0]);
        group8.add(option[7][1]);
        group8.add(option[7][2]);
        group8.add(option[7][3]);
        subPanel[7].add(que8);
        subPanel[7].add(option[7][0]);
        subPanel[7].add(option[7][1]);
        subPanel[7].add(option[7][2]);
        subPanel[7].add(option[7][3]);
        //----------------

        // Que 9  -------->
        JLabel que9=new JLabel("<html><br><br> Q.9) When an operator's values is NULL, the typeof returned by the unary operator is:?<br><br> </html>");
        que9.setFont(new Font("Calibri",Font.BOLD,22));
        option[8][0].setText("Boolean");
        option[8][1].setText("Undefined");
        option[8][2].setText("object");
        option[8][3].setText("Integer");
        ButtonGroup group9=new ButtonGroup();
        group9.add(option[8][0]);
        group9.add(option[8][1]);
        group9.add(option[8][2]);
        group9.add(option[8][3]);
        subPanel[8].add(que9);
        subPanel[8].add(option[8][0]);
        subPanel[8].add(option[8][1]);
        subPanel[8].add(option[8][2]);
        subPanel[8].add(option[8][3]);
        //----------------

        // Que 10  -------->
        JLabel que10=new JLabel("<html><br><br> Q.10) What does the javascript the javascript 'debugger' statement do?<br><br> </html>");
        que10.setFont(new Font("Calibri",Font.BOLD,22));
        option[9][0].setText("It will debug all the error in the program at runtime.");
        option[9][1].setText("It acts as a breakpoint in a program.");
        option[9][2].setText("It will debug error in the current statment if any.");
        option[9][3].setText("All of the above.");
        ButtonGroup group10=new ButtonGroup();
        group10.add(option[9][0]);
        group10.add(option[9][1]);
        group10.add(option[9][2]);
        group10.add(option[9][3]);
        subPanel[9].add(que10);
        subPanel[9].add(option[9][0]);
        subPanel[9].add(option[9][1]);
        subPanel[9].add(option[9][2]);
        subPanel[9].add(option[9][3]);
        //----------------

        // adding previous & next button in panel3. ------------>
        JButton previous=new JButton("Previous");
        JButton next=new JButton("Next");
        btnPanel.add(previous);
        btnPanel.add(next);
        panel3.add(btnPanel, BorderLayout.SOUTH);
        btnPanel.setBounds(1,400,400,50);
        previous.setBounds(50,415,60,30);
        next.setBounds(150,415,60,30);
        //----------------------------

        //action listeners for previous & next buttons.
        ActionListener gotoPrevious=new ActionListener(){
            public void actionPerformed(ActionEvent pre){
                if(count>0){
                    count--;
                    subPanel[count+1].setVisible(false);
                    panel3.add(subPanel[count]);
                    subPanel[count].setVisible(true);
                }
            }
        };
        ActionListener gotoNext=new ActionListener(){
            public void actionPerformed(ActionEvent nxt){
                if(count>=0 && count<9){
                    count++;
                    subPanel[count-1].setVisible(false);
                    panel3.add(subPanel[count]);
                    subPanel[count].setVisible(true);
                }
            }
        };
        previous.addActionListener(gotoPrevious);
        next.addActionListener(gotoNext);
        //---------------------------------

        //action listener for submit button.
        ActionListener submitTest=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(option[0][0].isSelected()){
                    correct++;
                }
                if(option[1][2].isSelected()){
                    correct++;
                }
                if(option[2][2].isSelected()){
                    correct++;
                }
                if(option[3][1].isSelected()){
                    correct++;
                }
                if(option[4][3].isSelected()){
                    correct++;
                }
                if(option[5][0].isSelected()){
                    correct++;
                }
                if(option[6][0].isSelected()){
                    correct++;
                }
                if(option[7][0].isSelected()){
                    correct++;
                }
                if(option[8][2].isSelected()){
                    correct++;
                }
                if(option[9][2].isSelected()){
                    correct++;
                }
                JOptionPane.showMessageDialog(null, "Congratulations!\nTotal Question:10\nCorrect answers: "+correct, "Result", JOptionPane.YES_OPTION);
                frame1.dispose();
            }
        };
        submit.addActionListener(submitTest);
        //----------------------------------------------

        //action listener for back button --------->
        ActionListener goBack=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame1.dispose();
            }
        };
        back.addActionListener(goBack);
        //-----------------------------------------------

        // Creating a timer in panel no 2 --------->
        int delay=1000;
        ActionListener performTask= new ActionListener(){
            int seconds=59;
            int minutes=9;
            @Override
            public void actionPerformed(ActionEvent event){
                if(seconds==0){
                    if(minutes==0){
                        submit.doClick();
                        time.stop();
                    }
                    else{
                        minutes--;
                        seconds=59;
                    }
                }
                else{
                    seconds--;
                }
                if(seconds<10){
                    timer.setText("Time: 0"+minutes+":0"+seconds);
                }
                else{
                    timer.setText("Time: 0"+minutes+":"+seconds);
                }
            }
        };
        Timer time=new Timer(delay,performTask);
        time.start();
        //---------------------------------------
    }
    public static void main(String[] args){
        Quiz7 obj7=new Quiz7();

    }
}

