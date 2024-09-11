public class Square extends Shape{
    int sideLength;

    public Square(){
        super();
        sideLength = 1;
    }


    public Square(int x, int y, int sideLength){
        super(x, y);
        setSideLength(sideLength);
    }

    public double getArea(){
        return sideLength * sideLength;
    }

    public void setSideLength(int sideLength){
        if (sideLength <= 0){
            throw new RuntimeException();
        }

        this.sideLength = sideLength;
    }
    
}
