package pl.sda.marcin.balicki.vector.paint.shapes;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape {
    private double centerX;
    private double centerY;
    private double radiusX;
    private double radiusY;
    private double startAngle;
    private double length;

    public Circle(double x1, double y1, double x2, double y2) {

    }

    public void draw(GraphicsContext context) {
//        context.beginPath();
//        context.
//        context.arc(90,90,70,70,Math.PI * 200 * 200,200);
//        context.arcTo(100,100,200,200,500);
        context.fillOval(100,100,300,300);
//        context.arcTo(x1, y1, x2, y2, 400);
//        context.closePath();
        context.stroke();
        context.fill();
    }

    public String getData() {
        return null;
    }


}
