package zyBook_Chapter_10.zyBook_10_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 This frame demonstrates how to install an action listener.
 */
public class ButtonFrame1 extends JFrame
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 100;

    public ButtonFrame1()
    {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    /**
     An action listener that changes the label text.
     */
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("I was clicked.");
        }
    }

    private void createComponents()
    {
        JButton button = new JButton("Click me!");
        JPanel panel = new JPanel();
        panel.add(button);
        add(panel);

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
    }
}