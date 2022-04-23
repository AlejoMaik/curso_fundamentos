import java.util.*;

public class Ubicacion {
    public String nombre;
    public float distancia;
    public int cantidadZombies;
    public static int cantidadUbicaciones = 0;

    public Ubicacion(String nombre, float distancia, int cantidadZombies) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.cantidadZombies = cantidadZombies;
        Ubicacion.cantidadUbicaciones++;
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
        Principal.datosUbicaciones.add(new Ubicacion(nombre, distancia, cantidadZombies));
    }

    public static String mostrarMenu8(int i) {
        String dato = Principal.datosUbicaciones.get(i).getNombre() + ", " + Principal.datosUbicaciones.get(i).getDistancia() + ", " + Principal.datosUbicaciones.get(i).getCantidad();
        return dato;
    }

    public static String mostrarMenu9() {
        int temp = 99999;
        for (int i = 0; i < cantidadUbicaciones; i++) {
            if (Principal.datosUbicaciones.get(i).getCantidad() < temp) {
                temp = Principal.datosUbicaciones.get(i).getCantidad();
            }
        }
        for (int i = 0; i < cantidadUbicaciones; i++) {
            if (Principal.datosUbicaciones.get(i).getCantidad() == temp) {
                return Principal.datosUbicaciones.get(i).getNombre() + ", " + Principal.datosUbicaciones.get(i).getDistancia() + ", " + Principal.datosUbicaciones.get(i).getCantidad();
            }
        }
        return "";
    }

    public static String mostrarMenu10(ArrayList<Ubicacion> dBUs) {
        float[] ordenado = new float[dBUs.size()];
        float temp = 99999;
        Ubicacion temp2;
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
        Principal.datosUbicaciones.remove(pos);
        Ubicacion.cantidadUbicaciones--;
    }
}