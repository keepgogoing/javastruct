public class TestMyOrderArray {

    public static void main(String args[]){
        MyOrderArray ma = new MyOrderArray();
        ma.insert(30);
        ma.insert(10);
        ma.insert(40);
        ma.insert(20);
        ma.insert(35);
        ma.display();
        System.out.println(ma.binarySearch(35));
    }
}
