package variables;

public class VariableTypes {

    static int a = 10; //static variable
    int b = 20; //instance or global variable
    public static void main(String[] args) {

        int c ; // local variable

        System.out.println( "printing static variable value :" +a);

        VariableTypes var = new VariableTypes(); // created object to get global variable value
        int d = var.b; //assigning the global variable value in the variable d
        System.out.println("printing the value that is assigned to var d :"+d);
        System.out.println("printing global Variable value :" +var.b);

        c = a + d ; // storing sum of 2 variable in local variable c  ( a= static variable, d =global variable);
        c = a + var.b; // another way of getting value
        System.out.println("printing the value stored in local variable c :" +c);
        System.out.println("Value of c : "+c);

        System.out.println("End of the Program");

    }
}
