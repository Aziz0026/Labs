import processing.core.PApplet;

public class Main extends PApplet {
    final int COUNT = 100;

    float[] rays = new float[COUNT];
    float[] x = new float[COUNT];
    float[] y = new float[COUNT];
    float[] dx = new float[COUNT];
    float[] dy = new float[COUNT];
    float[] radius1 = new float[COUNT];
    float[] radius2 = new float[COUNT];
    float[] angle = new float[COUNT];
    float[] angleDelta = new float[COUNT];


    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        stroke(255);
        strokeWeight(1);

        for (int i = 0; i < COUNT; i++) {
            rays[i] = (int) random(8, 20);
            if (rays[i] % 2 != 0) {
                rays[i]++;
            }
            dx[i] = random(-3, 3);
            dy[i] = random(-3, 3);
            radius1[i] = random(10);
            radius2[i] = random(30);

            float radius = max(radius1[i], radius2[i]);
            x[i] = random(radius, width - radius);
            y[i] = random(radius, height - radius);
            angle[i] = random(random(TWO_PI));
            angleDelta[i] = random(-0.3f, 0.3f);

        }
    }

    public void draw() {
        background(0);

        for (int i = 0; i < COUNT; i++) {
            star(12, x[i], y[i], radius1[i], radius2[i], angle[i]);

            x[i] += -dx[i];
            y[i] += -dy[i];
            angle[i] += angleDelta[i];

            float radius = max(radius1[i], radius2[i]);
            if (x[i] - radius < 0 || x[i] + radius > width) {
                dx[i] = -dx[i];
            }
            if (y[i] - radius < 0 || y[i] + radius > height) {
                dy[i] = -dy[i];
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

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
}