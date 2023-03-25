package Ejercicio3;
public class DecimalABase {
    private static final char[] DIGITOS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String aBase(int num, int base) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            int resto = num % base;
            char digito = DIGITOS[resto];
            sb.append(digito);
            num /= base;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int decimal = 65029;
        String hexadecimal = aBase(decimal, 16);
        System.out.println(decimal + "|10 = " + hexadecimal + "|16");
    }
}

