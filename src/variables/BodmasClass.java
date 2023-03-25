package variables;

public class BodmasClass {

    public static void main(String[] args) {

        // Bodmas calculation

        float ans = (20+30)*5/5-6;
                  // 50 *5 /5 -6
                  //50 * 1 - 6
                  // 50 -6
                  // 44
        System.out.println("Bodmas Answer: "+ans);

        // Concatenation

        String a = "Hello";
        String b = "World";
        String c = a+b;

        System.out.println(" Concatenation of two string :" +c);
        System.out.println(" concatenation of two string :" +a +" "+b + "!!!");
    }
}
