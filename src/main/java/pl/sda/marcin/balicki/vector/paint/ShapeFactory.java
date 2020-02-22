package pl.sda.marcin.balicki.vector.paint;

import pl.sda.marcin.balicki.vector.paint.shapes.Line;
import pl.sda.marcin.balicki.vector.paint.shapes.Rectangle;
import pl.sda.marcin.balicki.vector.paint.shapes.Shape;
import pl.sda.marcin.balicki.vector.paint.shapes.Triangle;

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
}
