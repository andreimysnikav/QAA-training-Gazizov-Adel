public class Application {
    public static void main(String[] args) {
        Application.liveAnotherDay(24);
    }

    public static void liveAnotherDay(int lastNumber) {
        var i = 1;
        while (i <= lastNumber) {
            System.out.println(i);
            i = i + 1;
        }
    }
}
