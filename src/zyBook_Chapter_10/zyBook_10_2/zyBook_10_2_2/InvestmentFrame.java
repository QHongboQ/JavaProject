package zyBook_Chapter_10.zyBook_10_2.zyBook_10_2_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InvestmentFrame extends JFrame
{
    private JButton button;
    private JLabel resultLabel;
    private double balance;

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;

    private static final double INTEREST_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;

    public InvestmentFrame()
    {
        balance = INITIAL_BALANCE;

        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }



    private void createComponents()
    {
        /** 放在指定的method中，或者放在method外面，此class里面，main程序只用调用就行了
         Adds interest to the balance and updates the display.
         */
        class AddInterestListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                balance = balance + balance * INTEREST_RATE / 100;;
                resultLabel.setText("Balance: " + balance);
            }
        }

        button = new JButton("Add Interest");
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);

        resultLabel = new JLabel("Balance: " + balance);

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(resultLabel);
        add(panel);
    }
}