package variables;

public class Operators {

    static int a = 10;
    static int b = 20;

    static int x =3;

    public  static void arithmetic(){
        int ans1 = a + b;
        System.out.println("Sum of 2 number :"+ans1);
        int ans2 = a - b;
        System.out.println("Sub of 2 number :"+ans2);
        int ans3 = (a / b);
        System.out.println("division of 2 number :"+ans3);
        int ans4 = a * b;
        System.out.println("multiplication of 2 number :"+ans4);
        int ans5 = a % b;
        System.out.println("modulus of 2 number :"+ans5);
        a++;
        System.out.println(" value of a:" + a);
        a--;
        System.out.println("value of a :"+a);
        --a;
        System.out.println("value of a :"+a);
        b++;
        System.out.println("value of b :"+b);
        b--;
        System.out.println("value of b :"+b);
        --b;
        System.out.println("value of a :"+b);

    }

    public static void assignment(){
        System.out.println("x:"+x);
        int ans1 = x+=2;
        System.out.println(ans1);
        int ans2 = x-=1;
        System.out.println(ans2);
        int ans3 = x*=4;
        System.out.println(ans3);
        int ans4 = x/=3;
        System.out.println(ans4);
        int ans5 = x%=2;
        System.out.println(ans5);
    }
     public static void comparison(){
         boolean ans1 = a==b;
         System.out.println(ans1);
         boolean ans2 = a>= b;
         System.out.println(ans2);
         boolean ans3 = a<=b;
         System.out.println(ans3);
         boolean ans4 = a!=b;
         System.out.println(ans4);
         boolean ans5 = a > b;
         System.out.println(ans5);
         boolean ans6 = a < b;
         System.out.println(ans6);
     }

     public static void logical(){
        boolean ans = (a>3) && (b>4);
         System.out.println(ans);
        boolean ans1 =(a>20) || (b>10);
         System.out.println(ans1);
        boolean ans2 = (a!=b);


     }


    public static void main(String[] args) {
       arithmetic();
       assignment();
       comparison();
       logical();
    }
}
