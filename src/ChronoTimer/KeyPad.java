/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChronoTimer;

/**
 *
 * @author ilan
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class KeyPad extends JFrame {
    
    GridLayout layout = new GridLayout(0,3);
    private int timesPressed = 0;
    private JPanel keyPad;
    
    public KeyPad(String name) {
        super(name);
        setResizable(false);
        keyPad = new JPanel();
    }
     
    public void addComponentsToPane(final Container pane) {
  
        keyPad.setLayout(layout);
         
        final Object [] buttons = 
        {new JButton("1"), new JButton("2"), new JButton("3"),
         new JButton("4"), new JButton("5"), new JButton("6"),
         new JButton("7"), new JButton("8"), new JButton("9"),
         new JButton("*"), new JButton("0"), new JButton("#")};

        for (int i = 0; i < buttons.length; ++i){
            if(buttons[i] instanceof JButton){
                keyPad.add((JButton)buttons[i]);
                final JButton temp = (JButton)buttons[i];
                ((JButton)buttons[i]).addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println(timesPressed++ + 
                                " pressed " + temp.getLabel());    
                    }
                });
            }
        } 
       pane.add(keyPad);
    }
 
    private void createAndShowGUI() {
        KeyPad frame = new KeyPad("KeyPad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane(frame.getContentPane());
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
     
    public void run() {
        
        // this section is basically copy and paste code
        //-------------------------
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        //-----------------------------
    }
}
