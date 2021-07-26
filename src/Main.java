public class Main {

    static int numerador = 10;
    static Integer denominador = null;
    static float division;

    public static void main(String[] args) {

        System.out.println("Antes de la división");
        try {
            division = numerador / denominador;
        } catch (ArithmeticException ex) {
            division = 0;
            System.out.println("Error: " +  ex.getMessage());
        } catch (NullPointerException error) {
            division = 0;
            System.out.println("Segundo catch");
            System.out.println("Error: " +  error.getMessage());
        } finally {
            System.out.println("Despues de la división");
        }

        System.out.println("******************************");

        String[] frutas;
        frutas = new String[]{"Pera", "Manzana", "Uva", "Mango"};

        for(String fruta: frutas ) {
            System.out.println(fruta);
        }

    }

}
