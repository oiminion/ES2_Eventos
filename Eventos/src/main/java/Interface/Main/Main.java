package Interface.Main;

import Interface.Tela.TelaInicial;

/**
 *
 * @author Sayu
 */
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            TelaInicial tela = new TelaInicial();
            tela.setVisible(true);
        });
    }

}
