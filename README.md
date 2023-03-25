# unaMasPorFavor
## Nota:
Mi repositorio es: https://github.com/zmartand/unaMasPorFavor.git
## Enunciados:
### Ejercicio 1.  
Dado el siguiente fragmento de código C:
static final double N = 2;
static final double PREC = 1e-6;
static double f (double x)
{
return x*x-N;
}
static double bisect (double min, double max)
{
double med = (min+max)/2;
if (max-min<PREC) {
return med;
} else if (f(min)*f(med)<0) {
return bisect (min,med);
} else {
return bisect (med,max);
}
}
a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?
#### Respuesta:  
La llamada a la función recursiva bisect(0,N) calcula la raíz cuadrada de 2 utilizando el método de bisección. 
El valor de N representa el número para el que se desea calcular la raíz cuadrada. Si se cambia el valor de N, 
se calculará la raíz cuadrada de ese nuevo número. Si se cambia la función f(x), se calculará la raíz de la ecuación 
f(x) = 0 en el intervalo (0, N).

b) Implemente un algoritmo iterativo equivalente.

```static double bisect_iter (double min, double max) {
    double med = (min+max)/2;
    while (max-min >= PREC) {
        if (f(min)*f(med) < 0) {
            max = med;
        } else {
            min = med;
        }
        med = (min+max)/2;
    }
    return med;
} ```

### Ejercicio 2.  
Dado el siguiente algoritmo recursivo:
a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función
recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda
equivalentes.

### Ejercicio 3.  
Construya una función que convierta un número decimal en una cadena que represente el
valor del número en hexadecimal (base 16). A continuación, generalice la función para
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante
static final double N = 2;
static final double PREC = 1e-6;
static double f (double x)
{
return x*x-N;
}
static double bisect (double min, double max)
{
double med = (min+max)/2;
if (max-min<PREC) {
return med;
} else if (f(min)*f(med)<0) {
return bisect (min,med);
} else {
return bisect (med,max);
}
}
void f(int num, int div)
{
if (num>1) {
if ((num%div) == 0) {
System.out.println(div);
f(num/div,div);
} else {
f(num,div+1);
}
}
}
expresiones lambda.
Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16
en las cuales los restos determinan los dígitos hexadecimales del número según
la siguiente correspondencia:
Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Dígito 0 1 2 3 4 5 6 7 8 9 A B C D E F
Por ejemplo:
65029|10 = FE05|16
### Ejercicio 4.  
Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo,
“DABALEARROZALAZORRAELABAD” es un palíndromo.
### Ejercicio 5.  
Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda,
una función que nos devuelva el máximo común divisor de dos números enteros
utilizando el algoritmo de Euclides.
ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n,
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).
