package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private Color color;
    private int side;
    private int height;

    public IsoscelesTrapezoid(Color color, int side, int height) {
        this.color = color;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((side + side) / 2) * height;
    }

    @Override
    public void print() {
        System.out.println("Figure: Square "
                + " area " + getArea() + " sq.units,"
                + " side " + side + " units,"
                + " height " + height + " units,"
                + " color " + color);
    }
}
