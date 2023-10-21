import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras10 extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g2) {
        super.paintComponent(g2);
    
        Graphics2D g = (Graphics2D) g2;
        g.setStroke(new BasicStroke(4));
        
        g.setColor(Color.BLACK);
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
        for (int v = 0; v <= 400; v = v + 20) {
           g.drawLine(200 - v/2, v, v, 400);
        }

        
        // g.drawLine(200, 0, 0, 400);
        // g.drawLine(190, 10, 10, 400);
    }


    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras10 painel = new Figuras10();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

}
