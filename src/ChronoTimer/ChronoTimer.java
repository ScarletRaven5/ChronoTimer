/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChronoTimer;

import ChronoTimer.KeyPad;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ilan
 */
public class ChronoTimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //just throwing this in here as a standalone keypad for now
        //will change keypad so that it can be native to a Container
        KeyPad test = new KeyPad("KeyPad");
        test.run();
        
    }
}
