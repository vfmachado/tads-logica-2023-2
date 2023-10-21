import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras09 extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g2) {
        super.paintComponent(g2);
    
        Graphics2D g = (Graphics2D) g2;
        g.setStroke(new BasicStroke(2));
        
        g.setColor(Color.BLACK);
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
        for (int v = 0; v <= 400; v = v + 20) {
            g.drawLine(v, v, 400 - v, 0);
        }


    }


    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Figuras09 painel = new Figuras09();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

}
