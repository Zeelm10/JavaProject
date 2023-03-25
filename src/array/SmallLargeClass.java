package array;
public class SmallLargeClass {

    public static void main(String[] args) {
        int arr[] = {23, -33, 478, 50, 650};
        int largest = arr[0];
        int smallest =arr[0];

        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];

        }
        System.out.println("The Largest Number is :" + largest);
        System.out.println("The smallest Number is :" + smallest);
    }
}
