import java.util.*;

public class Principal {
    public static ArrayList<Zombie> datosZombies = new ArrayList<>();
    public static ArrayList<Ubicacion> datosUbicaciones = new ArrayList<>();
    public static String[] frasesAleatorias = {"Cada ser humano que salvamos es un zombie menos que combatir", "El mundo que conociamos se ha ido pero, mantenemos nuestra humanidad? Eso es una eleccion", "Estas rodeado de zombies. Eso son las malas noticias", "Cuando los muertos echan a andar, para que obstinarse en matarlos? No hay formas de vencerlos", "Regla No. 7: Viajar ligero. Y no me refiero solo a equipaje."};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 2;
        while (n != 0) {
            System.out.println("Ingrese un numero teniendo lo siguiente en cuenta:\n-Ingrese 0 para finalizar la ejecucion del programa.\n-Ingrese 1 para agregar un nuevo zombie.\n-Ingrese 2 para ver la informacion de todos los zombies almacenasdos hasta el momento.\n-Ingrese 3 para ver la cantidad de zombies ingresados hasta el momento.\n-Ingrese 4 para ver la informacion de los zombies tipo de sangre O+ o AB+.\n-Ingrese 5 para ver la informacion de los zombies que nacieron después del 2000.\n-Ingrese 6 para disminuir a la mitad la salud de todos los zombies. \n-Ingrese 7 para ingresar una nueva ubicacion. \n-Ingrese 8 para ver la informacion de todas las ubicaciones. \n-Ingrese 9 para ver la infromacion de la ubicacion más segura. \n-Ingrese 10 para ver las ubicaciones ordenadas por distancia a Alexandria. \n-Ingrese 11 para ver una frase sobre Zombies. \n-Ingrese 12 para eliminar un zombie");

            System.out.println("Numero: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Ingrese nombre del zombie");
                    String nombreZ = sc.next();
                    System.out.println("Ingrese salud del zombie");
                    float salud = sc.nextFloat();
                    System.out.println("Ingrese el tipo de sangre del zombie");
                    String tipoS = sc.next();
                    System.out.println("Ingrese la fecha de nacimiento del zombie");
                    int fechaN = sc.nextInt();
                    Zombie.mostrarMenu1(nombreZ, salud, tipoS, fechaN);
                    break;
                case 2:
                    for (int i = 0; i < Principal.datosZombies.size(); i++) {
                        System.out.println(Zombie.mostrarMenu2(i));
                    }
                    break;
                case 3:
                    System.out.println(Zombie.mostrarMenu3());
                    break;
                case 4:
                    for (int i = 0; i < Principal.datosZombies.size(); i++) {
                        if (Principal.datosZombies.get(i).getTipoSangre().equals("O+") || Principal.datosZombies.get(i).getTipoSangre().equals("AB+")) {
                            System.out.println(Zombie.mostrarMenu4(i));
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < Principal.datosZombies.size(); i++) {
                        if (Principal.datosZombies.get(i).getFechaDeNacimiento() > 2000) {
                            System.out.println(Zombie.mostrarMenu5(i));
                        }
                    }
                    break;
                case 6:
                    Zombie.mostrarMenu6();
                    break;
                case 7:
                    System.out.println("Ingrese nombre de la ubicacion");
                    String nombreU = sc.next();
                    System.out.println("Ingrese la distancia de la ubicacion");
                    float distancia = sc.nextFloat();
                    System.out.println("Ingrese la cantidad de zombies de la ubicacion");
                    int cantidadZombies = sc.nextInt();
                    Ubicacion.mostrarMenu7(nombreU, distancia, cantidadZombies);
                    break;
                case 8:
                    for (int i = 0; i < Ubicacion.cantidadUbicaciones; i++) {
                        System.out.println(Ubicacion.mostrarMenu8(i));
                    }
                    break;
                case 9:
                    System.out.println(Ubicacion.mostrarMenu9());
                    break;
                case 10:
                    System.out.println(Ubicacion.mostrarMenu10(Principal.datosUbicaciones));
                    break;
                case 11:
                    System.out.println(Zombie.mostrarMenu11());
                    break;
                case 12:
                    if (Principal.datosUbicaciones.size() < 1) {
                        System.out.println("Para usar esta funcion debe crear por lo menos una ubicacion");
                    } else {
                        System.out.println("Ingrese un numero entre 0 y " + (Principal.datosUbicaciones.size() - 1));
                        int pos = sc.nextInt();
                        Ubicacion.mostrarMenu12(pos);
                    }
                    break;
            }
        }
    }
}