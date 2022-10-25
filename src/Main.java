public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(70, 1.75);
        System.out.println(index);
    }
}