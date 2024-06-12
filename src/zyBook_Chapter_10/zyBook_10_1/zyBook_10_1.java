package zyBook_Chapter_10.zyBook_10_1;

import javax.swing.JFrame;

public class zyBook_10_1 {
    /*
    Definition of frame(框架): A window with a border(边框) and a title bar(标题栏).

    JFrame frame = new JFrame();
    // Size
    final int FRAME_WIDTH = 300;
    final int FRAME_HEIGHT = 400;
    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    // Title bar
    frame.setTitle("An empty frame");
    // Close option
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // 框架可见
    frame.setVisible(true);


    // User-Interface Components
    // Definition of panel: A user-interface component with no visual appearance. It can be used to group other components.
    JPanel panel = new JPanel();
    JButton button = new JButton("Click me!");
    JLabel label = new JLabel("Hello, World!");
    panel.add(button);
    panel.add(label);
    frame.add(panel);

     */

    public static void main(String[] args)
    {
        JFrame frame = new FilledFrame();
        frame.setTitle("A frame with two components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

