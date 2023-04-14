package collection;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> names = new java.util.HashSet<>();
        names.add("Zeel");
        names.add("Archi");
        names.add("Nirav");
        names.add("payal");

        System.out.println("Hastset elements:"+names);
        System.out.println("Length :"+names.size());

        names.remove("payal");
        names.remove("Nirav");

        System.out.println("Hashset after removing:"+names);
        System.out.println("Length after removing:"+names.size());

    }
}
