public class EjercicioDatos {
    public static void main(String [] args){

        int a = 2 + 200;
        int b = 100 - 2000;
        int c = 2000 / 10;
        int d = 20 * 20;
        int e = 247 + 200 - 500;

        String saludo = "Buenas tardes.";
        String nombre_apellido = "Juan Lopez";
        String email = "icromeroa@usbbog.edu.co";
        String animal = "cisne";
        String marca = "Google";

        char f = 'A';
        char g = 'G';
        char h = 'O';
        char i = 'S';
        char j = 'T';
        char k = 'O';
        
        Boolean es_mayor = a>b;
        Boolean es_menor = d<e;
        Boolean comparacion_1 = c == a;
        Boolean comparacion_2 = c != b;
        Boolean comparacion_3 = saludo == animal;

        System.out.println(es_mayor);
        System.out.println(es_menor);
        System.out.println(comparacion_1);
        System.out.println(comparacion_2);
        System.out.println(comparacion_3);

        double division = 666/5;
        double multi = 2.4 * 2.67;
        double suma = 4.666 + 2.666;
        double resta = 3.888 - 4.700;
        double op_combinada = (3.777/3) - 300.9;

        System.out.println(division);
        System.out.println(multi);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(op_combinada);
        
    }

}