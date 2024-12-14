package decorator_pattern;

public class App {
    public static void main(String[] args) {
        Toast toast1 = new MilkBread();
        toast1 = new Ham(toast1);
        toast1 = new Cheeze(toast1);
        toast1 = new Vegetable(toast1);

        System.out.println("주문한 토스트: " + toast1.getName());
        System.out.println("칼로리: " + toast1.getKcal());


        Toast toast2 = new NormalBread();
        toast2 = new Cheeze(toast2);
        toast2 = new Vegetable(toast2);

        System.out.println("주문한 토스트: " + toast2.getName());
        System.out.println("칼로리: " + toast2.getKcal());

    }
}
