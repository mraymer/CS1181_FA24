public abstract class Shape {
    private int x;
    private int y;

    public Shape(){
        x = 0;
        y = 0;
    }

    public Shape(int x, int y) throws ShapeCoordinatesException{
        this.setX(x);
        this.setY(y);
    }

    public void setX(int x) throws ShapeCoordinatesException{
        if (x < 0){
            throw new ShapeCoordinatesException();
        }
        if (x == 3){
            throw new IllegalStateException();
        }
        this.x = x;
    }

    public void setY(int y){
        if (y < 0){
            throw new RuntimeException();
        }
        this.y = y;
    }

    public String getLocation(){
        return "(" + x + ", " + y + ")";
    }

    public abstract double getArea();

}