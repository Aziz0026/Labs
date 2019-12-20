import processing.core.PApplet;
import javax.swing.*;
import java.awt.*;
public class Main extends PApplet {
    static int num;
    float x;
    float y;
    float alpha = 0;
    float beta;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        x = width / 3;
        y = height / 12;
        frameRate(30);
        noStroke();
    }
    public void draw() {

        background(0, 0, 0,10);
        pushMatrix();
        translate(width / 2, height / 2);
        rotate(alpha);
        alpha += 0.05;
        for (int i = 1; i <= num; i++) {
            fill(300, 50,100,100);
            ellipse(0, 0, x, y);
            rotate(beta);
            beta = PI/num;
        }
        popMatrix();
    }
    public static void main(String... args) {
        num = Integer.parseInt(JOptionPane.showInputDialog("Num: "));
        PApplet.main("Main");
    }
}