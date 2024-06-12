package Project.tictoc;

import javax.swing.*;
import java.awt.*;

public class GameBoard {
    private JPanel buttonPanel;
    private JButton[][] buttons = new JButton[3][3];

    public GameBoard(GameLogic gameLogic) {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));

        Font buttonFont = new Font("SansSerif", Font.BOLD, 40);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(buttonFont);
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].addActionListener(gameLogic);
                buttonPanel.add(buttons[i][j]);
            }
        }
        gameLogic.setButtons(buttons);
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public void resetBoard() {
        for (JButton[] buttonRow : buttons) {
            for (JButton button : buttonRow) {
                button.setText("");
            }
        }
    }
}
