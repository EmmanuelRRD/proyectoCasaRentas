package fondopanel;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoPanel extends JPanel {

    private Image imagen;

    public FondoPanel(String url) {
        // Intenta cargar la imagen una vez
        java.net.URL recurso = getClass().getResource(url);
        if (recurso != null) {
            imagen = new ImageIcon(recurso).getImage();
        } else {
            System.out.println("❌ Imagen no encontrada: " + url);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
