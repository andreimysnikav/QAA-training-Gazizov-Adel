package package_first;

public class Equals {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        String s1 = new String("asd");
        String s2 = new String("asd");
        System.out.println(s1.equals(s2));

        if(i < j) {
            System.out.println("Большее число - " + j);
        } else {
            System.out.println("Большее число - " + i);
        }

        switch (i) {
            case (10):
                System.out.println("10");
                break;
            case (5):
                System.out.println("5");
                break;
            default:
                System.out.println("def");
        }
    }
}
