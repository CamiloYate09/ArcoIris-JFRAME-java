/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcoiris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Kernel-2018
 */
public class ArcoIris extends JPanel {

    private final static Color VIOLENTA = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLENTA, INDIGO,
        Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    public ArcoIris() {

        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics y) {

        super.paintComponent(y);

        int radio = 20;
        int centroX = getWidth() / 2;
        int centroY = getHeight() - 10;

        for (int contador = colores.length; contador > 0; contador--) {
            // establecer el color para el arco actual
            y.setColor(colores[contador - 1]);

            //rellena el arco  desde 0 a 180
            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;

            int ancho = contador * radio * 2;
            int alto = contador * radio * 2;
            
            y.fillArc(valorX, valorY, ancho, alto, 0, 180);

        }

    }


}
