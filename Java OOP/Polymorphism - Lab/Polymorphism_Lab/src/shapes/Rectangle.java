package shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.setHeight(height);
        this.setWidth(width);
        this.calculatePerimeter();
        this.calculateArea();
    }

    public Double getHeight() {
        return height;
    }

    private void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    private void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    public Double calculateArea() {
        return height * width;
    }
}
