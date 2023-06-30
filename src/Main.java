public class Main {

    public static void main(String[] args) {

        /*
        Tipos de datos
        1. Númericos
        1.1 Enteros
        1.2 Decimales
        2. Booleano
        3. Texto
         */


        // 1.1 Enteros

        byte var1 = 7; // Representa un tipo de dato de 8 bits con signo de -128 a 127 (ambos inclusive).
        short var2 = 10; // Representa un tipo de dato de 16 bits de -32.768 a 32.767.
        int var3 = 27; // Es un tipo de dato de 32 bits valor mínimo es -231 y el valor máximo 231-1.
        long var4 = 1014104104; // Es un tipo de dato de 64 bits entre -263 a 263-1
        System.out.println("Enteros: " + ("byte = " + var1) + (" / short = " + var2) +
                (" / int = " + var3) + (" / long = " + var4));

        // 1.2 Decimales

        float var5 = 1.5f; // Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.
        double var6 = 20.5d; // Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.
        System.out.println("Decimales: " + ("float = " + var5) + (" / double = " + var6));

        // 2. Booleano
        boolean var7 = false; // Tipo de dato para almacenar valor flase
        boolean var8 = true; // Tipo de dato para almacenar valor true
        System.out.println("Booleanos: " + ("¿Juega baloncesto? = " + var7) + " / ¿Lee revistas? = " + var8);

       // 3. Texto
        char var9 = 'n'; // Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.
        String var10 = "Pro"; // Es un tipo de dato inmutable. Es decir, que una vez creado, su valor no puede ser cambiado
        System.out.println("Texto: " + ("char = " + var9) + (" / String = " + var10));

    }
}