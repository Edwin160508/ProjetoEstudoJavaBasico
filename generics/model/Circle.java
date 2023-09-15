package generics.model;

public class Circle implements Shape {
    private Double area;

    public Circle(Double area) {
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public Double area() {
        return this.area;
    }
}
