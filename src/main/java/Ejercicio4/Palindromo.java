package Ejercicio4;
public class Palindromo {
    public static boolean esPalindromoRecursivo(String s) {
        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return esPalindromoRecursivo(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

    public static boolean esPalindromoIterativo(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palindromo = "DABALEARROZALAZORRAELABAD";
        System.out.println(palindromo + " es palíndromo (recursivo): " + esPalindromoRecursivo(palindromo));
        System.out.println(palindromo + " es palíndromo (iterativo): " + esPalindromoIterativo(palindromo));
    }
}

