public class Triangle {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 20;

        if (a == b && b == c) {
            System.out.println("Triangle is Equilateral");
        }else if (a==b || b==c || a==c){
            System.out.println("Triangle is isoscalas");
        }else {
            System.out.println("Triangle is scalar");
        }
    }
}
