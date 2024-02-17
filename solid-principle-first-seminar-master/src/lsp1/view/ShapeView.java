package lsp1.view;

import lsp1.shape.Rectangle;
import lsp1.shape.Shape;
import lsp1.shape.Square;

public class ShapeView {
    private Shape shape;

    public ShapeView(Square square) {
        this.shape = square;
    }

    public void showArea() {
        System.out.print("Area of shape equal: ");
        System.out.println(shape.getArea());
    }
}
