import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Oi {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Cria uma janela Swing
            JFrame frame = new JFrame("Hello Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Cria um rótulo Swing
            JLabel label = new JLabel("Hello, World!");
            frame.getContentPane().add(label);

            // Configura o tamanho da janela
            frame.setSize(300, 200);

            // Exibe a janela
            frame.setVisible(true);
        });
    }
}
