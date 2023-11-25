import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        int [][] matriz = new int[500][500];
        int tam = 10;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (linha < 20)
                    matriz[linha][coluna] = 2;
                else {
                     matriz[linha][coluna] = 1;
                }
            }
        }


        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] == 1) {
                    g.setColor(Color.CYAN);
                }
                else if (matriz[linha][coluna] == 2) {
                    g.setColor(Color.RED);
                }
                g.fillRect(coluna, linha, 1, 1);
            }
        }

    }

    public static void main(String[] args) {
        
        JFrame app = new JFrame("APP");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500, 500);
        app.setVisible(true);

        JPanel panel = new Main();
        panel.setBounds(0, 0, 500, 500);
        app.add(panel);

    }

}