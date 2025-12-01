package Interface.Utilidade;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Sayu
 */
public class RoundInput extends JTextField {

    private Color corFundo = new Color(239, 232, 239);
    private Color corTexto = new Color(96, 63, 96);
    private Color corCirculo = Color.WHITE;

    public RoundInput() {
        // Define a fonte e cores iniciais
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setForeground(Color.GRAY); // Cor do texto digitado

        // Remove a borda quadrada padrão e o fundo padrão
        setOpaque(false);
        setBorder(new EmptyBorder(5, 10, 5, 10)); // Margem interna (Padding) para o texto não colar na borda
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Define a cor de fundo (Lilás bem clarinho conforme a imagem)
        g2.setColor(corFundo);

        // Desenha o fundo arredondado
        // O valor "15, 15" define o quão redondo são os cantos
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

        super.paintComponent(g);
    }
}
