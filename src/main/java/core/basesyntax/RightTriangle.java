package core.basesyntax;

public class RightTriangle extends Figure {
    private Color color;
    private int side;
    private int height;

    public RightTriangle(Color color, int side, int height) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle "
                + " area " + getArea() + " sq.units,"
                + " side " + side + " units"
                + " height " + height + " units"
                + " color " + color);
    }
}
