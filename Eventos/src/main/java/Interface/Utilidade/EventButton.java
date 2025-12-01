package Interface.Utilidade;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 *
 * @author Sayu
 */
public class EventButton extends JButton{
        private Color corFundo = new Color(239, 232, 239);
        private Color corTexto = new Color(96, 63, 96);
        private Color corCirculo = Color.WHITE;
        private Color corFundoRoll = new Color(234, 225, 234);
        
    public EventButton() {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        setFont(new Font("Segoe UI", Font.PLAIN, 12));
        setForeground(corTexto);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       
        
        if (getModel().isRollover()) {
            g2.setColor(corFundoRoll);
        } else {
            g2.setColor(corFundo);
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        
        int tamanhoCirculo = getHeight() - 6;
        int xCirculo = 3;
        int yCirculo = 3;
        g2.setColor(corCirculo);
        g2.fillOval(xCirculo, yCirculo, tamanhoCirculo, tamanhoCirculo);
        
        g2.setColor(corTexto);
        g2.setFont(getFont());
        FontMetrics metrics = g2.getFontMetrics();
        int xTexto = xCirculo + tamanhoCirculo + 5;
        int yTexto = ((getHeight() - metrics.getHeight())/2) + metrics.getAscent();
        
        g2.drawString(getText(), xTexto, yTexto);
    }
}
