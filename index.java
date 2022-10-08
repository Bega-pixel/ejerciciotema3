//parte 1
public class Main {
    public static void main (String[] arg) {
        
        suma (x:5, y:65, z:9)
        
    }
    public static void suma(int x, int y, int z) {
        int resultado;
        resultado = x+y+z;

        System.out.print(resultado);

    }
}

//parte 2

public class Main {
    public static void main (String[] arg) {
        
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();

        System.out.print(miCoche.puertas);
        
    }
    class Coche {
        public int puertas = 0;

        public void incrementarPuertas(){
            this.puertas ++;
        }
    }
}