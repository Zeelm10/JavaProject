package loopStatments;

public class timeTable {
    public static void tables(int num){
        System.out.println("This is the table of :"+num);
        System.out.println("===========================");
        for(int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" +num*i);
        }
        System.out.println("===========================");
    }
    public static void main(String[] args) {
        for (int j =1; j<=5;j++)
        tables(j);
    }
}
