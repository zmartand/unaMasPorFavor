package Ejercicio5;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        int m = 56;
        int n = 48;

        MCD mcdIterativo = (a, b) -> {
            int r;
            while (b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return a;
        };

        MCD mcdRecursivo = new MCD() {
            @Override
            public int calculate(int a, int b) {
                if (b == 0) {
                    return a;
                } else {
                    return calculate(b, a % b);
                }
            }
        };

        System.out.println("MCD iterativo con expresión lambda: " + mcdIterativo.calculate(m, n));
        System.out.println("MCD recursivo con interfaz funcional: " + mcdRecursivo.calculate(m, n));
    }
}


