package Project.tictoc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLogic implements ActionListener {
    private JTextField display;
    private JButton[][] buttons;
    private boolean playerTurn = true;  // true for X, false for O

    public GameLogic(JTextField display) {
        this.display = display;
    }

    public void setButtons(JButton[][] buttons) {
        this.buttons = buttons;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (clickedButton.getText().equals("")) {
            if (playerTurn) {
                clickedButton.setText("X");
                display.setText("It's O's turn");
            } else {
                clickedButton.setText("O");
                display.setText("It's X's turn");
            }
            playerTurn = !playerTurn;
            checkForWin();
        }
    }

    private void checkForWin() {
        for (int i = 0; i < 3; i++) {
            // Check rows and columns
            if (!buttons[i][0].getText().equals("") &&
                    buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                    buttons[i][1].getText().equals(buttons[i][2].getText())) {
                announceWinner(buttons[i][0].getText());
                return;
            }
            if (!buttons[0][i].getText().equals("") &&
                    buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                    buttons[1][i].getText().equals(buttons[2][i].getText())) {
                announceWinner(buttons[0][i].getText());
                return;
            }
        }

        // Check diagonals
        if (!buttons[0][0].getText().equals("") &&
                buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][2].getText())) {
            announceWinner(buttons[0][0].getText());
            return;
        }
        if (!buttons[0][2].getText().equals("") &&
                buttons[0][2].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][0].getText())) {
            announceWinner(buttons[0][2].getText());
            return;
        }

        // Check for draw
        boolean draw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    draw = false;
                    break;
                }
            }
        }

        if (draw) {
            announceWinner("Draw");
        }
    }

    private void announceWinner(String winner) {
        if (winner.equals("Draw")) {
            JOptionPane.showMessageDialog(null, "It's a draw!");
        } else {
            JOptionPane.showMessageDialog(null, winner + " wins!");
        }
        resetBoard();
    }

    private void resetBoard() {
        for (JButton[] buttonRow : buttons) {
            for (JButton button : buttonRow) {
                button.setText("");
            }
        }
        playerTurn = true; // X starts the new game
        display.setText("It's X's turn");
    }
}
