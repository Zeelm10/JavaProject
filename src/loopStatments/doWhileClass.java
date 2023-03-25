package loopStatments;
public class doWhileClass {
    public static void printNum(){
        int i=1;
        do
        {
            if(i%2==0) //Condition to check even number
                System.out.print(" "+i);
            i++;
        }while(i<11);
    }
    public static void main(String[] args) {
        printNum();
    }
}

