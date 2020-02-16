package pl.sda.marcin.balicki.vector.paint.shapes;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double radius;

    public Circle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.radius = x1;
    }

    public void draw(GraphicsContext context) {
        context.beginPath();
        context.arcTo(x1, y1, x2, y2, radius);
        context.closePath();
        context.stroke();
        context.fill();
    }

    public String getData() {
        return null;
    }


}
