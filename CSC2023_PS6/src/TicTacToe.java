import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class TicTacToe extends JFrame {

    private JButton[] buttons;
    private static int xCount, oCount;
    private JLabel label1 = new JLabel("X Wins: " + xCount), label2 = new JLabel("O Wins: " + oCount);
    private char symbol = 'X';
    private ImageIcon X = new ImageIcon("C:/Users/vicer/Downloads/X.png"), O = new ImageIcon("C:/Users/vicer/Downloads/O.png"),
            blankIcon = new ImageIcon("C:/Users/vicer/Downloads/blank.jpg");
    private JButton selectedButton, b0, b1, b2, b3, b4, b5, b6, b7, b8;


    public TicTacToe() {
        super.setSize(650,650);
        super.setTitle("Tic Tac Toe");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildPanel();
        super.setVisible(true);
    }

    private void buildPanel() {

        ////// Visual //////

        // Game //
        JPanel centerPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(3, 3);
        centerPanel.setLayout(gridLayout);
        buttons = new JButton[9];

        BorderLayout borderLayout = new BorderLayout();
        super.setLayout(borderLayout);
        super.add(centerPanel, BorderLayout.CENTER);

        // Score //
        JPanel southPanel = new JPanel();
        southPanel.add(label1);
        southPanel.add(new JLabel("                        "));
        southPanel.add(label2);
        super.add(southPanel, BorderLayout.SOUTH);


        ////// Functionality //////

        ActionListener buttonPress = event -> {
            JButton blankButton = (JButton) event.getSource();
            ImageIcon blank = (ImageIcon) blankButton.getIcon();
            if (blank.equals(blankIcon) && symbol == 'O') {
                selectedButton = (JButton) event.getSource();
                selectedButton.setIcon(O);
                symbol = 'X';
            } else if (blank.equals(blankIcon) && symbol == 'X') {
                selectedButton = (JButton) event.getSource();
                selectedButton.setIcon(X);
                symbol = 'O';
            }

            for(int i = 0; i < buttons.length; i++) {
                b0 = buttons[0];
                b1 = buttons[1];
                b2 = buttons[2];
                b3 = buttons[3];
                b4 = buttons[4];
                b5 = buttons[5];
                b6 = buttons[6];
                b7 = buttons[7];
                b8 = buttons[8];
            }

            if((b0.getIcon().equals(X) && b1.getIcon().equals(X) && b2.getIcon().equals(X) && !b0.getIcon().equals(blankIcon) && !b1.getIcon().equals(blankIcon) && !b2.getIcon().equals(blankIcon))
                    || (b3.getIcon().equals(X) && b4.getIcon().equals(X) && b5.getIcon().equals(X) && !b3.getIcon().equals(blankIcon) && !b4.getIcon().equals(blankIcon) && !b5.getIcon().equals(blankIcon))
                    || (b6.getIcon().equals(X) && b7.getIcon().equals(X) && b8.getIcon().equals(X) && !b6.getIcon().equals(blankIcon) && !b7.getIcon().equals(blankIcon) && !b8.getIcon().equals(blankIcon))
                    || (b0.getIcon().equals(X) && b3.getIcon().equals(X) && b6.getIcon().equals(X) && !b0.getIcon().equals(blankIcon) && !b3.getIcon().equals(blankIcon) && !b6.getIcon().equals(blankIcon))
                    || (b1.getIcon().equals(X) && b4.getIcon().equals(X) && b7.getIcon().equals(X) && !b1.getIcon().equals(blankIcon) && !b4.getIcon().equals(blankIcon) && !b7.getIcon().equals(blankIcon))
                    || (b2.getIcon().equals(X) && b5.getIcon().equals(X) && b8.getIcon().equals(X) && !b2.getIcon().equals(blankIcon) && !b5.getIcon().equals(blankIcon) && !b8.getIcon().equals(blankIcon))
                    || (b0.getIcon().equals(X) && b4.getIcon().equals(X) && b8.getIcon().equals(X) && !b0.getIcon().equals(blankIcon) && !b4.getIcon().equals(blankIcon) && !b8.getIcon().equals(blankIcon))
                    || (b2.getIcon().equals(X) && b4.getIcon().equals(X) && b6.getIcon().equals(X) && !b2.getIcon().equals(blankIcon) && !b4.getIcon().equals(blankIcon) && !b6.getIcon().equals(blankIcon))) {
                JOptionPane.showMessageDialog(this, "X WINS\nResetting...");
                xCount++;
                this.dispose();
                TicTacToe game = new TicTacToe();
            }

            else if((b0.getIcon().equals(O) && b1.getIcon().equals(O) && b2.getIcon().equals(O) && !b0.getIcon().equals(blankIcon) && !b1.getIcon().equals(blankIcon) && !b2.getIcon().equals(blankIcon))
                    || (b3.getIcon().equals(O) && b4.getIcon().equals(O) && b5.getIcon().equals(O) && !b3.getIcon().equals(blankIcon) && !b4.getIcon().equals(blankIcon) && !b5.getIcon().equals(blankIcon))
                    || (b6.getIcon().equals(O) && b7.getIcon().equals(O) && b8.getIcon().equals(O) && !b6.getIcon().equals(blankIcon) && !b7.getIcon().equals(blankIcon) && !b8.getIcon().equals(blankIcon))
                    || (b0.getIcon().equals(O) && b3.getIcon().equals(O) && b6.getIcon().equals(O) && !b0.getIcon().equals(blankIcon) && !b3.getIcon().equals(blankIcon) && !b6.getIcon().equals(blankIcon))
                    || (b1.getIcon().equals(O) && b4.getIcon().equals(O) && b7.getIcon().equals(O) && !b1.getIcon().equals(blankIcon) && !b4.getIcon().equals(blankIcon) && !b7.getIcon().equals(blankIcon))
                    || (b2.getIcon().equals(O) && b5.getIcon().equals(O) && b8.getIcon().equals(O) && !b2.getIcon().equals(blankIcon) && !b5.getIcon().equals(blankIcon) && !b8.getIcon().equals(blankIcon))
                    || (b0.getIcon().equals(O) && b4.getIcon().equals(O) && b8.getIcon().equals(O) && !b0.getIcon().equals(blankIcon) && !b4.getIcon().equals(blankIcon) && !b8.getIcon().equals(blankIcon))
                    || (b2.getIcon().equals(O) && b4.getIcon().equals(O) && b6.getIcon().equals(O) && !b2.getIcon().equals(blankIcon) && !b4.getIcon().equals(blankIcon) && !b6.getIcon().equals(blankIcon))) {
                JOptionPane.showMessageDialog(this, "O WINS\nResetting...");
                oCount++;
                this.dispose();
                TicTacToe game = new TicTacToe();
            }

            else if(b0.getIcon() != blankIcon && b1.getIcon() != blankIcon && b2.getIcon() != blankIcon && b3.getIcon() != blankIcon
                    && b4.getIcon() != blankIcon && b5.getIcon() != blankIcon && b6.getIcon() != blankIcon && b7.getIcon() != blankIcon
                    && b8.getIcon() != blankIcon) {
                JOptionPane.showMessageDialog(this, "Cat's game\nResetting...");
                this.dispose();
                TicTacToe game = new TicTacToe();
            }

        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(blankIcon);
            buttons[i].addActionListener(buttonPress);
            centerPanel.add(buttons[i]);
        }
    }

    public static void main(String[] args) {
        ////// Starts Window //////
        TicTacToe game = new TicTacToe();
    }
}
