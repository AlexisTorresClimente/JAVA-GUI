package org.example;

import javax.swing.*;
import java.awt.*;

public class JFrameSettings extends JFrame{


    public static void MainSettings(JFrame Frame, String Title, int Width, int Height){

        Frame.setTitle(Title);
        Frame.setSize(Width,Height);
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLayout(new FlowLayout());
        Frame.setResizable(false);
    }

    public static void SecondarySettings(JFrame Frame, String Title, int Width, int Height){

        Frame.setTitle(Title);
        Frame.setSize(Width,Height);
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.setLayout(new FlowLayout());
        Frame.setResizable(false);
    }

    public static void MainSettings(JFrame Frame, String Title, int Width, int Height,LayoutManager Layout){

        Frame.setTitle(Title);
        Frame.setSize(Width,Height);
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLayout(Layout);
        Frame.setResizable(false);
    }

    public static void SecondarySettings(JFrame Frame, String Title, int Width, int Height,LayoutManager Layout){

        Frame.setTitle(Title);
        Frame.setSize(Width,Height);
        Frame.setVisible(true);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Frame.setLayout(Layout);
        Frame.setResizable(false);
    }
}