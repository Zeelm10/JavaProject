package array;

public class ArrayDemoClass {

    public static void main(String[] args) {

        String names[]={"Nirav","Zeel","Payal","Archi"};
        int num[]= {10,30,40,50};
        char ch[] = {'a','A','b'};

        for(int i=0; i<= names.length; i++){
            System.out.print(names[i]);
        }

        for(int i=0; i<= num.length; i++){
            System.out.println(num[i]);
        }

        for(int i=0; i<= ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}
