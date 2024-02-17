package lsp1.shape;

public class Square extends Shape {

    private int side;

    public Square(int side) {
            this.side = side;
    }
    

    public void setSide(int side) {
            this.side = side;
    }
    // @Override
    // public void setSideA(int sideA) {
    //     super.setSideA(sideA);
    // }

    // @Override
    // public void setSideB(int sideB) {
    //     super.setSideA(sideB);
    // }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
 