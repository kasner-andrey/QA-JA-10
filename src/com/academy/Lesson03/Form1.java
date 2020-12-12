package com.academy.Lesson03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



    //This program shows a series of dialog boxes one
//after the other
//Imports are listed in full to show what’s being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.Icon;
import java.awt.EventQueue;
    class SimpleDialogFrame extends JFrame{
        //Using a standard Java icon
        private Icon optionIcon = UIManager.getIcon("“FileView.computerIcon”");
        //Application start point
        public static void main(String[] args) {
//Use the event dispatch thread for Swing components
            EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
//create GUI frame
                    new SimpleDialogFrame().setVisible(true);
                }
            });
        }
        public SimpleDialogFrame()
        {
//make sure the program exits when the frame closes
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("“Simple Dialog Box Example”");
            setSize(500,500);
//This will center the JFrame in the middle of the screen
            setLocationRelativeTo(null);
//TO TRY: Comment out the above line and use null for the parent
//component in one of the JOptionPane calls to see the difference
//it makes to the position of the dialog box.
            setVisible(true);
//Use the showMessageDialog method for a plain message dialog box
            JOptionPane.showMessageDialog(this, "“This is the dialog message”"
                    ,"“This is the dialog title”", JOptionPane.PLAIN_MESSAGE);
//Use the showMessageDialog method for a error message dialog box
            JOptionPane.showMessageDialog(this, "“This is the dialog message”"
                    ,"“This is the dialog title”", JOptionPane.ERROR_MESSAGE);
//Use the showConfirmDialog method for a warning message dialog box
//with OK, CANCEL buttons. Capture the button number with an int variable
            int choice = JOptionPane.showConfirmDialog(this, "“This is the dialog message”"
                    ,"“This is the dialog title”", JOptionPane.WARNING_MESSAGE
                    , JOptionPane.OK_CANCEL_OPTION);
//Use the showConfirmDialog method for an information message dialog box
//with YES, NO, CANCEL buttons. It shows the button choice of previous
//message box
            JOptionPane.showConfirmDialog(this,"“Last button pressed was number ”" + choice
, "“This is the dialog title”", JOptionPane.INFORMATION_MESSAGE
                , JOptionPane.YES_NO_CANCEL_OPTION);
//The showOptionDialog method can be made to work as if it were the confirmDialog
//method by using null for the last three parameters. In this case the options for
//the button types (YES, NO, CANCEL) and the message type (INFORMATION_MESSAGE)
//will be used.
            JOptionPane.showOptionDialog(this, "“This is the dialog message”"
                    , "“This is the dialog title”", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE
                    ,null, null, null);
//Use the showOptionDialog method to make a custom box. If the options parameter
//is null the YES, NO, CANCEL buttons are used. Also notice that even though
//the message type is INFORMATION_MESSAGE the usual icon is overriden by the one
//provided.
            JOptionPane.showOptionDialog(this, "“This is the dialog message”"
                    , "“This is the dialog title”", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE
                    ,optionIcon, null, null);
//String array to be used for the buttons
            String[] buttonOptions = new String[] {"“Happy Button”", "“Sad Button”", "“Confused Button”"};
//If the options parameter is not null the YES, NO, CANCEL buttons are not used
//The buttons are made with the object array - in this case a String array.
            JOptionPane.showOptionDialog(this, "“This is the dialog message”"
                    , "“This is the dialog title”", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE
                    ,optionIcon, buttonOptions, buttonOptions[0]);
        }
    }

//  private static int a;
//    private static int b;
////    private JTextField a;
////    private JTextField b;
//    private static Random random = new Random();
//
//
//
//    public static void SwapText() {
//        String q = Integer.toString(random.nextInt(100));
//        a = new JButton (q) ;
//        b = random.nextInt(100);
//        JButton button = new JButton("Swap");
////        button.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent ae) {
////                String s = a.getText();
////                a.setText(b.getText());
////                b.setText(s);
////            }
////        });
//
//        JPanel panel = new JPanel(new FlowLayout());
//        panel.add(a);
//        panel.add(b);
//        panel.add(button);
//
//        JFrame frame = new JFrame("Swap fields");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(panel);
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        Form1.SwapText();
//    }



   // public static void main(String[] args) {
//        JFormattedTextField elementsArray = new JFormattedTextField(NumberFormat.getIntegerInstance());
//        System.out.println(elementsArray);
//        elementsArray.setValue(new Integer(100));
//        addRow("Number: ", elementsArray);
//**********************************************************************************
//        String[]options = {"I adore turtles", "Yes", "Maybe", "Urm...", "No", "Hate them"};
//        ImageIcon icon = new ImageIcon("src/images/turtle32.png");
//        String n = (String)JOptionPane.showInputDialog(null, "Do you like turtles??",
//                "I like turtles", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
//        System.out.println(n);
//*****************************************
//        Integer[] size = {2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int n = (Integer)JOptionPane.showInputDialog(null, "Pick a number that is not prime:",
//                "Prime numbers", JOptionPane.QUESTION_MESSAGE, null, size, size[1]);
//        System.out.println(n);
//        private JTextField a;
//        private JTextField b;
//
//        JPanel panel = new JPanel(new FlowLayout());
//        panel.add(a);
//        panel.add(b);
//        panel.add(button);
//
//
////        JFrame wer = new JFrame("Hello");
//        JFrame frame = new JFrame("Swap fields");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(panel);
//        frame.pack();
//        frame.setVisible(true);




//        int w = (Integer)JOptionPane.showInputDialog(null, "Number", "Numbers", JOptionPane.QUESTION_MESSAGE, null, null, null );
//        System.out.println(w);
//
//
//        System.exit(0);
   // }

//    public static void addRow(String s, final JFormattedTextField el) {

      //  mPanel.add(new JLabel());


   // }



