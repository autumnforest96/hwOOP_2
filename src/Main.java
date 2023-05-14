public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 74; // вес
        double height = 1.80; // рост
        int index = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + index);
    }
}