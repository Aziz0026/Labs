import processing.core.PApplet;

public class Main extends PApplet {
    public void star(int rayCount, float x, float y, float outerRadius, float innerRadius, float angle) {
        float angleDiff = TWO_PI / rayCount; // TwoPi = 360
        float prevEndX = x + cos(angle - angleDiff) * innerRadius;
        float prevEndY = y + sin(angle - angleDiff) * innerRadius;

        for (int i = 0; i < rayCount; i++) {
            float selectedRadius = i % 2 == 0 ? outerRadius : innerRadius;
            float endX = x + cos(angle) * selectedRadius;
            float endY = y + sin(angle) * selectedRadius;

            line(x, y, endX, endY);
            line(endX, endY, prevEndX, prevEndY);

            angle += angleDiff;
            prevEndX = endX;
            prevEndY = endY;
        }
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);

        final float SHIFT_X = 300;
        final float SHIFT_Y = 200;

        stroke(0xFFFF0000);
        strokeWeight(3);
        star(8, width / 2.0f, height / 2.0f, 200, 70, 0);
        stroke(0xFFFFFF00);
        star(8,width / 2.0f -  SHIFT_X, height / 2.0f - SHIFT_Y, 150,40, 0 );
        star(8 ,width / 2.0f + SHIFT_X, height / 2.0f - SHIFT_Y, 150, 40, 0);
        star(8,width / 2.0f +  SHIFT_X, height / 2.0f + SHIFT_Y,150, 40, 0);
        star(8,width / 2.0f -  SHIFT_X, height / 2.0f + SHIFT_Y, 150, 40, 0);
    }


    public void draw() {
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}