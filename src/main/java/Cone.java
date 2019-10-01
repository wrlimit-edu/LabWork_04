public class Cone {

    private double height;
    private double radius;

    public Cone() {
    }

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                ",radius=" + radius +
                "}";
    }

    public double getGeneratorLength() {
        return (Math.sqrt(Math.pow(this.getHeight(), 2) + Math.pow(this.getRadius(), 2)));
    }

    public double getBaseArea() {
        return (Math.PI * Math.pow(this.getRadius(), 2));
    }

    public double getSideArea() {
        return (Math.PI * this.getRadius() * this.getGeneratorLength());
    }

    public double getArea() {
        return (this.getBaseArea() + this.getSideArea());
    }

    public double getVolume() {
        return ((double) 1 / 3 * this.getBaseArea() * this.getHeight());
    }
}