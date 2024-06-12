package Project.tictoc;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private JTextField display;
    private GameBoard gameBoard;
    private GameLogic gameLogic;

    public GameFrame() {
        setTitle("Tic Tac Toe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        display = new JTextField("It's O's turn");
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        gameLogic = new GameLogic(display);
        gameBoard = new GameBoard(gameLogic);
        add(gameBoard.getButtonPanel(), BorderLayout.CENTER);

        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(e -> gameBoard.resetBoard());
        add(restartButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}
