import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Figuras01 extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g2) {
        super.paintComponent(g2);
    
        Graphics2D g = (Graphics2D) g2;
        g.setStroke(new BasicStroke(4));
        
        g.setColor(Color.BLACK);
        
        //TODO - ESCREVA SEU CÓDIGO AQUI!!!
        g.drawLine(0, 0, 200, 200);

        g.setColor(Color.RED);
        g.drawLine(0, 400, 200, 200);

        g.setColor(Color.GREEN);
        
        for (int i = 0; i <= 400; i = i + 20)
            g.drawLine(0, 0, 400, i);
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
