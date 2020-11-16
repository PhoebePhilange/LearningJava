package ch02;
import javax.swing.*;
import java.awt.*;

public class HelloJava {
    public static void main(String[] args ) {
        JFrame frame = new JFrame("Hello, World!");
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
        frame.add(label);
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}

