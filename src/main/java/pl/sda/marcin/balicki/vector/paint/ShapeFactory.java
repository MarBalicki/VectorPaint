package pl.sda.marcin.balicki.vector.paint;

import pl.sda.marcin.balicki.vector.paint.shapes.*;

import javax.xml.stream.events.StartDocument;

public class ShapeFactory {

    public Shape get(String string) {
        String[] data = string.split(";");
        String shapeName = data[0].toLowerCase();
        switch (shapeName) {
            case "line":
                return getLine(data);
            case "rectangle":
                return getRectangle(data);
            case "triangle":
                return getTriangle(data);
            case "ellipse":
                return getEllipse(data);
            case "circle":
                return getCircle(data);
            case "star":
                return getStar(data);
        }
        return null;
    }

    private Shape getLine(String[] data) {
//        Rectangle;109.0;100.27205100797698;413.0;169.2105364044981;0xffffffff;0xffffffff;
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];
        Line.Builder builder = new Line.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);
        return builder.build();
    }

    private Shape getRectangle(String[] data) {
//        Rectangle;109.0;100.27205100797698;413.0;169.2105364044981;0xffffffff;0xffffffff;
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];
        Rectangle.Builder builder = new Rectangle.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);
        return builder.build();
    }

    private Shape getTriangle(String[] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        double x3 = Double.parseDouble(data[5]);
        double y3 = Double.parseDouble(data[6]);
        String fillColor = data[7];
        String strokeColor = data[8];
        Triangle.Builder builder = new Triangle.Builder()
                .setPoint1(x1, y1)
                .setPoint2(x2, y2)
                .setPoint3(x3, y3)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);
        return builder.build();
    }

    private Shape getEllipse(String[] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        double y2 = Double.parseDouble(data[4]);
        String fillColor = data[5];
        String strokeColor = data[6];
        Ellipse.Builder builder = new Ellipse.Builder()
                .setX1(x1)
                .setY1(y1)
                .setX2(x2)
                .setY2(y2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);
        return builder.build();
    }

    private Shape getCircle(String[] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        String fillColor = data[4];
        String strokeColor = data[5];
        Circle.Builder builder = new Circle.Builder()
                .setXCenter(x1)
                .setYCenter(y1)
                .setRadius(x2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);
        return builder.build();
    }

    private Shape getStar(String[] data) {
        double x1 = Double.parseDouble(data[1]);
        double y1 = Double.parseDouble(data[2]);
        double x2 = Double.parseDouble(data[3]);
        String fillColor = data[4];
        String strokeColor = data[5];
        Star.Builder builder = new Star.Builder()
                .setXCenter(x1)
                .setYCenter(y1)
                .setRadius(x2)
                .setFillColor(fillColor)
                .setStrokeColor(strokeColor);
        return builder.build();
    }

    //todo star
}
