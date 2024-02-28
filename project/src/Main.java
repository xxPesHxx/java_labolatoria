// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {

    public static void main(String[] args) {


        Point point;
        point = new Point(2.5F, 3.7F);
        System.out.println(point);

        Segment segment;
        segment = new Segment(point, new Point(5.7F, 2.8F));


        System.out.println(segment.distance());
    }
}