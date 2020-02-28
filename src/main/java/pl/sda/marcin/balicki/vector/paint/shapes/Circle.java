package pl.sda.marcin.balicki.vector.paint.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    private double xCenter;
    private double yCenter;
    private double radius;

    public Circle(double x1, double y1, double x2, double y2) {
        this.xCenter = (x1 + x2) / 2;
        this.yCenter = (y1 + y2) / 2;
        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);
        double d = Math.min(width, height);
        radius = d / 2;
    }

    private Circle(Builder builder) {
        this.xCenter = builder.xCenter;
        this.yCenter = builder.yCenter;
        this.radius = builder.radius;
        setFillColor(builder.fillColor);
        setStrokeColor(builder.strokeColor);
    }

    public void draw(GraphicsContext context) {
        double x = xCenter - radius;
        double y = yCenter - radius;
        double size = 2 * radius;
        context.strokeOval(x, y, size, size);
        context.fillOval(x, y, size, size);
    }

    public String getData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Circle;");
        builder.append(xCenter).append(";");
        builder.append(yCenter).append(";");
        builder.append(radius).append(";");
        builder.append(getFillColor()).append(";");
        builder.append(getStrokeColor()).append(";");
        return builder.toString();
    }

    public static class Builder {
        double xCenter;
        double yCenter;
        double radius;
        Color fillColor;
        Color strokeColor;

        public Circle build() {
            return new Circle(this);
        }

        public Builder setXCenter(double x1) {
            this.xCenter = x1;
            return this;
        }

        public Builder setYCenter(double y1) {
            this.yCenter = y1;
            return this;
        }

        public Builder setRadius(double x2) {
            this.radius = x2;
            return this;
        }

        public Builder setFillColor(String fillColor) {
            this.fillColor = Color.valueOf(fillColor);
            return this;
        }

        public Builder setStrokeColor(String strokeColor) {
            this.strokeColor = Color.valueOf(strokeColor);
            return this;
        }
    }
}
