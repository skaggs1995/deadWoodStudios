package com.company;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Created by skaggsc2 on 3/4/16.
 */
public class LabelTrailer extends JPanel {

    public LabelTrailer(){
        super(new GridLayout(1,1));
        JLabel label;
        try {
            // JFrame frame = new JFrame();

            BufferedImage myPicture = ImageIO.read(new File("/home/skaggsc2/Documents/CS345/hw2/Gameboards/gameBoardTrailer.jpg"));
            ImageIcon pic = new ImageIcon(myPicture);
            label = new JLabel(pic, JLabel.CENTER);
            add(label);
        }
        catch (IOException ex){
            System.out.println("No Image");
        }


    }
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("LabelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Add content to the window.
        frame.add(new LabelTrailer());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

}