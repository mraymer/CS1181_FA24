public class Square extends Shape implements Drawable, Comparable<Square>{
    int sideLength;

    public Square(){
        super();
        sideLength = 1;
    }

    public Square(int x, int y, int sideLength){
        super(x, y);
        setSideLength(sideLength);
    }

    @Override
    public double getArea(){
        return sideLength * sideLength;
    }

    public void setSideLength(int sideLength){
        if (sideLength <= 0){
            throw new RuntimeException();
        }

        this.sideLength = sideLength;
    }

    public void draw(){
        System.out.println("Drew the square at " + getLocation());
    }

    public void move(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public int compareTo(Square other){
        if (this.sideLength > other.sideLength){
            return 1;
        }
        else if (this.sideLength < other.sideLength){
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
