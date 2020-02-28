package pl.sda.marcin.balicki.vector.paint.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Star extends Shape {
    private double xCenter;
    private double yCenter;
    private double radius;

    public Star(double x1, double y1, double x2, double y2) {
        this.xCenter = (x1 + x2) / 2;
        this.yCenter = (y1 + y2) / 2;
        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);
        double d = Math.min(width, height);
        radius = d / 2;
    }

    private Star(Builder builder) {
        this.xCenter = builder.xCenter;
        this.yCenter = builder.yCenter;
        this.radius = builder.radius;
        setFillColor(builder.fillColor);
        setStrokeColor(builder.strokeColor);
    }

    public void draw(GraphicsContext context) {
        context.beginPath();
        context.moveTo(xCenter, yCenter - radius);
        int count = 10;          //zmiana wartości daje wielokąty
        for (int i = 0; i < count; i++) {
            double a = (double) i / count * 2 * Math.PI;
            double r = i % 2 == 0 ? radius : radius / 2;
            double xDelta = Math.sin(a) * r;
            double yDelta = Math.cos(a) * r;
            double x = xCenter + xDelta;
            double y = yCenter - yDelta;
            context.lineTo(x, y);
        }
        context.closePath();
        context.stroke();
        context.fill();

//        context.strokeOval();
//        context.fillOval(x, y, size, size);
    }

    public String getData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Star;");
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

        public Star build() {
            return new Star(this);
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
