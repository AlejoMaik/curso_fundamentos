import java.util.ArrayList;

public class ZombieP1 {
    public String nombre;
    public float salud;
    public String tipoSangre;
    public int fechaDeNacimiento;
    public static int contDeZombies = 0;

    public ZombieP1(String nombre, float salud, String tipoSangre, int fechaNacimienton) {
        this.nombre = nombre;
        this.salud = salud;
        this.tipoSangre = tipoSangre;
        this.fechaDeNacimiento = fechaNacimienton;
        contDeZombies++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipoSangre() {
        return this.tipoSangre;
    }

    public float getSalud() {
        return this.salud;
    }

    public int getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }

    public void setSalud() {
        this.salud /= 2;
    }

    public static void mostrarMenu1(String nombre, float salud, String tipoSangre, int fechaNacimienton) {
        PrincipalP1.datosZombies.add(new ZombieP1(nombre, salud, tipoSangre, fechaNacimienton));
    }

    public static String mostrarMenu2(int i) {
        String dato = PrincipalP1.datosZombies.get(i).getNombre() + ", " + PrincipalP1.datosZombies.get(i).getSalud() + ", " + PrincipalP1.datosZombies.get(i).getTipoSangre() + ", " + PrincipalP1.datosZombies.get(i).getFechaDeNacimiento();
        return dato;
    }

    public static int mostrarMenu3(ArrayList<ZombieP1> zombies) {
        return zombies.size();
    }

    public static String mostrarMenu4(int i) {
        String dato = PrincipalP1.datosZombies.get(i).getNombre() + ", " + PrincipalP1.datosZombies.get(i).getSalud() + ", " + PrincipalP1.datosZombies.get(i).getTipoSangre() + ", " + PrincipalP1.datosZombies.get(i).getFechaDeNacimiento();
        return dato;
    }

    public static String mostrarMenu5(int i) {
        String dato = PrincipalP1.datosZombies.get(i).getNombre() + ", " + PrincipalP1.datosZombies.get(i).getSalud() + ", " + PrincipalP1.datosZombies.get(i).getTipoSangre() + ", " + PrincipalP1.datosZombies.get(i).getFechaDeNacimiento();
        return dato;
    }

    public static void mostrarMenu6() {
        for (int i = 0; i < contDeZombies; i++) {
            PrincipalP1.datosZombies.get(i).setSalud();
        }
    }

    public static String mostrarMenu11() {
        return PrincipalP1.frasesAleatorias[(int) (Math.random() * (5 - 0)) + 0];
    }
}
