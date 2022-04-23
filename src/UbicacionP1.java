import java.util.*;

public class UbicacionP1 {
    public String nombre;
    public float distancia;
    public int cantidadZombies;
    public static int cantidadUbicaciones = 0;

    public UbicacionP1(String nombre, float distancia, int cantidadZombies) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.cantidadZombies = cantidadZombies;
        UbicacionP1.cantidadUbicaciones++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return this.cantidadZombies;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public static void mostrarMenu7(String nombre, float distancia, int cantidadZombies) {
        PrincipalP1.datosUbicaciones.add(new UbicacionP1(nombre, distancia, cantidadZombies));
    }

    public static String mostrarMenu8(int i) {
        String dato = PrincipalP1.datosUbicaciones.get(i).getNombre() + ", " + PrincipalP1.datosUbicaciones.get(i).getDistancia() + ", " + PrincipalP1.datosUbicaciones.get(i).getCantidad();
        return dato;
    }

    public static String mostrarMenu9() {
        int temp = 99999;
        for (int i = 0; i < cantidadUbicaciones; i++) {
            if (PrincipalP1.datosUbicaciones.get(i).getCantidad() < temp) {
                temp = PrincipalP1.datosUbicaciones.get(i).getCantidad();
            }
        }
        for (int i = 0; i < cantidadUbicaciones; i++) {
            if (PrincipalP1.datosUbicaciones.get(i).getCantidad() == temp) {
                return PrincipalP1.datosUbicaciones.get(i).getNombre() + ", " + PrincipalP1.datosUbicaciones.get(i).getDistancia() + ", " + PrincipalP1.datosUbicaciones.get(i).getCantidad();
            }
        }
        return "";
    }

    public static String mostrarMenu10(ArrayList<UbicacionP1> dBUs) {
        float[] ordenado = new float[dBUs.size()];
        float temp = 99999;
        UbicacionP1 temp2;
        int pos = 0;
        for (int j = 0; j < dBUs.size(); j++) {
            for (int i = j; i < dBUs.size(); i++) {
                if (dBUs.get(i).getDistancia() < temp) {
                    temp = dBUs.get(i).getDistancia();
                    pos = i;
                }
            }
            temp2 = dBUs.get(pos);
            dBUs.remove(pos);
            dBUs.add(j, temp2);
            ordenado[j] = temp;
            temp = 99999;
        }
        String dato = "";
        for (int h = 0; h < dBUs.size(); h++) {
            for (int i = 0; i < dBUs.size(); i++) {
                if (ordenado[h] == dBUs.get(i).getDistancia()) {
                    dato = dato + dBUs.get(i).getNombre() + ", " + dBUs.get(i).getDistancia() + ", " + dBUs.get(i).getCantidad() + "\n";
                }
            }
        }
        return dato;
    }

    public static void mostrarMenu12(int pos) {
        PrincipalP1.datosUbicaciones.remove(pos);
        UbicacionP1.cantidadUbicaciones--;
    }
}
