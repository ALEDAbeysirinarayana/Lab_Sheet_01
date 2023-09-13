import java.util.Scanner;
public class Area2 {
    int length;
    int breadth;
    int Area1;

    public void SetDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        Area1 = length * breadth;
        return Area1;
    }
}


