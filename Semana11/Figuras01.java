import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras01 extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
    }


    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras01 painel = new Figuras01();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

}
