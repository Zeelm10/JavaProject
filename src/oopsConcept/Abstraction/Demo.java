package oopsConcept.Abstraction;
class Demo extends Sum{
    @Override
    public int sumoftwoNum(int n1, int n2) {
        return n1+n2;
    }
    @Override
    public int sumofthreeNum(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

    public static void main(String[] args) {
        Sum s = new Demo();
        System.out.println(s.sumoftwoNum(5,8));
        System.out.println(s.sumofthreeNum(2,5,1));
        s.display();
    }
}
