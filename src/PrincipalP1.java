import java.util.*;

public class PrincipalP1 {
    public static ArrayList<ZombieP1> datosZombies = new ArrayList<>();
    public static ArrayList<UbicacionP1> datosUbicaciones = new ArrayList<>();
    public static String[] frasesAleatorias = {"Cada ser humano que salvamos es un zombie menos que combatir", "El mundo que conociamos se ha ido pero, mantenemos nuestra humanidad? Eso es una eleccion", "Estas rodeado de zombies. Eso son las malas noticias", "Cuando los muertos echan a andar, para que obstinarse en matarlos? No hay formas de vencerlos", "Regla No. 7: Viajar ligero. Y no me refiero solo a equipaje."};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero teniendo lo siguiente en cuenta:\n-Ingrese 0 para finalizar la ejecucion del programa.\n-Ingrese 1 para agregar un nuevo zombie.\n-Ingrese 2 para ver la informacion de todos los zombies almacenasdos hasta el momento.\n-Ingrese 3 para ver la cantidad de zombies ingresados hasta el momento.\n-Ingrese 4 para ver la informacion de los zombies tipo de sangre O+ o AB+.\n-Ingrese 5 para ver la informacion de los zombies que nacieron después del 2000.\n-Ingrese 6 para disminuir a la mitad la salud de todos los zombies. \n-Ingrese 7 para ingresar una nueva ubicacion. \n-Ingrese 8 para ver la informacion de todas las ubicaciones. \n-Ingrese 9 para ver la infromacion de la ubicacion más segura. \n-Ingrese 10 para ver las ubicaciones ordenadas por distancia a Alexandria. \n-Ingrese 11 para ver una frase sobre Zombies. \n-Ingrese 12 para eliminar un zombie");
        int n = 2;
        while (n != 0) {
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
                    ZombieP1.mostrarMenu1(nombreZ, salud, tipoS, fechaN);
                    break;
                case 2:
                    for (int i = 0; i < ZombieP1.contDeZombies; i++) {
                        System.out.println(ZombieP1.mostrarMenu2(i));
                    }
                    break;
                case 3:
                    System.out.println(ZombieP1.mostrarMenu3(PrincipalP1.datosZombies));
                    break;
                case 4:
                    for (int i = 0; i < ZombieP1.contDeZombies; i++) {
                        if (PrincipalP1.datosZombies.get(i).getTipoSangre().equals("O+") || PrincipalP1.datosZombies.get(i).getTipoSangre().equals("AB+")) {
                            System.out.println(ZombieP1.mostrarMenu4(i));
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < ZombieP1.contDeZombies; i++) {
                        if (PrincipalP1.datosZombies.get(i).getFechaDeNacimiento() > 2000) {
                            System.out.println(ZombieP1.mostrarMenu5(i));
                        }
                    }
                    break;
                case 6:
                    ZombieP1.mostrarMenu6();
                    break;
                case 7:
                    System.out.println("Ingrese nombre de la ubicacion");
                    String nombreU = sc.next();
                    System.out.println("Ingrese la distancia de la ubicacion");
                    float distancia = sc.nextFloat();
                    System.out.println("Ingrese la cantidad de zombies de la ubicacion");
                    int cantidadZombies = sc.nextInt();
                    UbicacionP1.mostrarMenu7(nombreU, distancia, cantidadZombies);
                    break;
                case 8:
                    for (int i = 0; i < UbicacionP1.cantidadUbicaciones; i++) {
                        System.out.println(UbicacionP1.mostrarMenu8(i));
                    }
                    break;
                case 9:
                    System.out.println(UbicacionP1.mostrarMenu9());
                    break;
                case 10:
                    System.out.println(UbicacionP1.mostrarMenu10(PrincipalP1.datosUbicaciones));
                    break;
                case 11:
                    System.out.println(ZombieP1.mostrarMenu11());
                    break;
                case 12:
                    if (PrincipalP1.datosUbicaciones.size() < 1) {
                        System.out.println("Para usar esta funcion debe crear por lo menos una ubicacion");
                    } else {
                        System.out.println("Ingrese un numero entre 0 y " + (PrincipalP1.datosUbicaciones.size() - 1));
                        int pos = sc.nextInt();
                        UbicacionP1.mostrarMenu12(pos);
                    }
                    break;
            }
        }
    }
}