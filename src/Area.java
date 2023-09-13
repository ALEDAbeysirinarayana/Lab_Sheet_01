public class Area {
    int length = 5;
    int breadth = 10;
    int Area1;
    public void SetDim(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea(){
        Area1 = length * breadth;
        return Area1;

    }
    public static void main(String []args){
        Area aa = new Area();
        aa.SetDim (5,10);
        int cc = aa.getArea();
    System.out.println("Area of the rectangle is " + cc);
    }
}