import javax.management.RuntimeErrorException;

public abstract class Shape {
    private int x;
    private int y;

    public Shape(){
        x = 0;
        y = 0;
    }

    public Shape(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public void setX(int x){
        if (x < 0){
            throw new RuntimeException();
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