public class Zombie {
    public String nombre;
    public float salud;
    public String tipoSangre;
    public int fechaDeNacimiento;

    public Zombie(String nombre, float salud, String tipoSangre, int fechaNacimienton) {
        this.nombre = nombre;
        this.salud = salud;
        this.tipoSangre = tipoSangre;
        this.fechaDeNacimiento = fechaNacimienton;
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
        Principal.datosZombies.add(new Zombie(nombre, salud, tipoSangre, fechaNacimienton));
    }

    public static String mostrarMenu2(int i) {
        String dato = Principal.datosZombies.get(i).getNombre() + ", " + Principal.datosZombies.get(i).getSalud() + ", " + Principal.datosZombies.get(i).getTipoSangre() + ", " + Principal.datosZombies.get(i).getFechaDeNacimiento();
        return dato;
    }

    public static int mostrarMenu3() {
        return Principal.datosZombies.size();
    }

    public static String mostrarMenu4(int i) {
        String dato = Principal.datosZombies.get(i).getNombre() + ", " + Principal.datosZombies.get(i).getSalud() + ", " + Principal.datosZombies.get(i).getTipoSangre() + ", " + Principal.datosZombies.get(i).getFechaDeNacimiento();
        return dato;
    }

    public static String mostrarMenu5(int i) {
        String dato = Principal.datosZombies.get(i).getNombre() + ", " + Principal.datosZombies.get(i).getSalud() + ", " + Principal.datosZombies.get(i).getTipoSangre() + ", " + Principal.datosZombies.get(i).getFechaDeNacimiento();
        return dato;
    }

    public static void mostrarMenu6() {
        for (int i = 0; i < Principal.datosZombies.size(); i++) {
            Principal.datosZombies.get(i).setSalud();
        }
    }

    public static String mostrarMenu11() {
        return Principal.frasesAleatorias[(int) (Math.random() * (5 - 0)) + 0];
    }
}