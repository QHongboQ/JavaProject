package zyBook_Chapter_10.Project_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.BorderLayout;

/**
 This frame demonstrates how to install an action listener.
 */
public class ButtonFrame1 extends JFrame
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 250;
    private JLabel resultLabel;
    JButton button1;
    JButton button2;

    public ButtonFrame1()
    {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == button1) {
                resultLabel.setText("Button First was clicked! Time: " + new java.util.Date());
            } else if (event.getSource() == button2) {
                resultLabel.setText("Button Second was clicked! Time: " + new java.util.Date());
            }
        }
    }

    private void createComponents()
    {

        button1 = new JButton("First ");
        button2 = new JButton("Second");
        resultLabel = new JLabel("Button was not click! Time: ");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button1, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.SOUTH);
        panel.add(resultLabel, BorderLayout.CENTER);
        add(panel);

        ActionListener listener = new ClickListener();

        button1.addActionListener(listener);
        button2.addActionListener(listener);
    }
}