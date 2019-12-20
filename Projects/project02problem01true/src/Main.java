import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    static int n;

    final float minr = 20;
    final float maxr = 50;


    float[] x;
    float[] y;
    float[] dx;
    float[] dy;
    float[] r;
    int[] c;
    float alpha = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);
        noStroke();
        x = new float[n];
        y = new float[n];
        dx = new float[n];
        dy = new float[n];
        r = new float[n];
        c = new int[n];
        for (int i = 0; i < n; i++) {

            x[i] = random(width);
            y[i] = random(height);
            dx[i] = random(-2, 2);
            dy[i] = random(-2, 2);
            r[i] = random(minr, maxr);
            c[i] = (int) (0xFF000000 + random(0x00FFFFFF));

        }
    }

    public void draw() {
        background(0);

        for (int i = 0; i < n; i++) {

            pushMatrix();
            translate(x[i], y[i]);
            rotate(alpha);
            alpha += 0.05;
            stroke(c[i]);
            strokeWeight(3);
            for (int j = 0; j <= 10; j++) {

                line(0, 0, r[i], 0);
                rotate(PI / 5);
            }
            popMatrix();


            x[i] += dx[i];
            y[i] += dy[i];

            if (x[i] < r[i]) {
                x[i] = r[i];
                dx[i] = -dx[i];
            }
            if (x[i] > width - r[i]) {
                x[i] = width - r[i];
                dx[i] = -dx[i];
            }
            if (y[i] < r[i]) {
                y[i] = r[i];
                dy[i] = -dy[i];
            }
            if (y[i] > height - r[i]) {
                y[i] = height - r[i];
                dy[i] = -dy[i];
            }
        }

    }

    public static void main(String[] args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N? "));
        PApplet.main("Main");
    }
}