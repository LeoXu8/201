import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hohmann extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Timer timer;
    private double spacecraftAngle = 0;

    public Hohmann() {
        setTitle("Hohmann Transfer Simulation");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSimulation();
                repaint();
            }
        });
        timer.start();
    }

    private void updateSimulation() {
        spacecraftAngle += 0.005; // Adjust the rotation speed

        // Add your physics calculations here for the Hohmann transfer simulation

        // For simplicity, let's just draw two circles representing the orbits
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawOrbits(g);
        drawSpacecraft(g);
    }

    private void drawOrbits(Graphics g) {
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        int majorAxis1 = 200;
        int minorAxis1 = 100;

        int majorAxis2 = 400;
        int minorAxis2 = 200;

        g.setColor(Color.BLUE);
        g.drawOval(centerX - majorAxis1 / 2, centerY - minorAxis1 / 2, majorAxis1, minorAxis1);
        g.drawOval(centerX - majorAxis2 / 2, centerY - minorAxis2 / 2, majorAxis2, minorAxis2);
    }

    private void drawSpacecraft(Graphics g) {
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        int spacecraftRadius = 10;

        int spacecraftX = (int) (centerX + 200 * Math.cos(spacecraftAngle));
        int spacecraftY = (int) (centerY + 100 * Math.sin(spacecraftAngle));

        g.setColor(Color.RED);
        g.fillOval(spacecraftX - spacecraftRadius, spacecraftY - spacecraftRadius, 2 * spacecraftRadius, 2 * spacecraftRadius);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Hohmann hohmann = new Hohmann();
                hohmann.setVisible(true);
            }
        });

    }
}
