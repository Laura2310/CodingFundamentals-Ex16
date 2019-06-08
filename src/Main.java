public class Main {
    public static void main(String[] args) {
    Cilindru c1= new Cilindru(5,10);
    Cilindru c2 = new Cilindru(6,10);

        System.out.println(c1);
        System.out.printf("Aria c1 %.2f\n", c1.CalculeazaSuprafata());
        System.out.println(c2);
        System.out.printf("Volumul c2 %.2f\n", c2.CalculeazaVolumul());
    }
}
