import processing.core.PApplet;

import javax.swing.*;
public class Main extends PApplet {
    static int n;
    float x;
    float x1;
    float y;
    float y1;
    float r;
    float mainSquare = 300;
    float distance;
    float alfa;
    float dx = 3;
    float dy = 3;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);
        noStroke();
        r = (float) (mainSquare / (Math.sqrt(2.0)) / n);
        distance = mainSquare / n /2;
        x1 = width / 2 - distance * (n - 1);
        y1 = height / 2 - distance * (n - 1);
        x = width/2;
        y = height/2;
    }
    public void draw() {
        background(0, 40);
        pushMatrix();
        translate(x, y);
        for (float i = 0; i <= distance*2 * (n-1); i += 2 * distance)
        {
            kvadrat(i, 0);
            for (float f = 0; f <= distance*2 * (n - 1); f +=2*
                    distance) {
                kvadrat(i, f);
            }
        }
        popMatrix();
        x += dx;
        y += dy;
        if (x > width + distance - mainSquare){
            x = width + distance - mainSquare;
            dx = -dx;
        }
        if (x < distance){
            x = distance;
            dx = -dx;
        }
        if (y > height + distance - mainSquare){
            y = height + distance - mainSquare;
            dy = -dy;
        }
        if (y < distance ){
            y = distance;
            dy = -dy;
        }
    }
    void kvadrat(float x, float y) {
        pushMatrix();
        translate(x, y);
        rotate(alfa);
        alfa += 0.003;
        fill(100, 100,100);
        rectMode(CENTER);
        rect(0, 0, r, r);
        popMatrix();
    }
    public static void main(String... args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N? "));
        PApplet.main("Main");
    }
}