import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) {
        //Iniciar variables
        Scanner s = new Scanner(System.in);
        //Menú de bienvenida
        System.out.println("""
                \n
                ░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗
                ░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝
                ░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░
                ░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░
                ░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗
                ░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝
                `'::::.
                        _____A_
                       /      /\\
                    __/__/\\__/  \\___
                ---/__|" '' "| /___/\\----
                   |''|"'||'"| |' '||
                   `""`""))""`"`""\""`""");
        //Dia actual
        LocalDate diaActual = LocalDate.now();
        LocalDate entrada = LocalDate.now();
        LocalDate salida;
        //Precio de las habitaciones por noche
        final int tarifaDoble = 60;
        final int tarifaIndividual = 45;
        //Variables de los menus
        String op,op2;
        //Variables del administrador
        String nombreUsuario = "admin", password = "1234";
        //Tipo de habitaciones
        String habitacion1 = "Individual";
        String habitacion2 = "Individual";
        String habitacion3 = "Doble";
        String habitacion4 = "Doble";
        String habitacion5 = "Doble";
        String habitacion6 = "Doble";
        String habitacion7 = "Doble";
        String habitacion8 = "Doble";
        String habitacion9 = "Doble";
        String habitacion10 = "Doble";
        //Estado de cada habitacion predefinida
        String estadoHabitacion1 = "Libre";
        String estadoHabitacion2 = "Libre";
        String estadoHabitacion3 = "Libre";
        String estadoHabitacion4 = "Libre";
        String estadoHabitacion5 = "Libre";
        String estadoHabitacion6 = "Libre";
        String estadoHabitacion7 = "Libre";
        String estadoHabitacion8 = "Libre";
        String estadoHabitacion9 = "Libre";
        String estadoHabitacion10 = "Libre";
        boolean accesoConcedido = false;
        do {
            //Menú principal
            System.out.print("""
                   ==================================================
                   HOTEL CIUDAD MARTOS
                   a. Ver el estado de ocupación de las habitaciones
                   b. Reservar una habitación
                   c. Realizar el checkout de una habitación
                   d. Menú de Administrador
                   e. Salir
                   Elige una opción:""");
            op = s.nextLine();
            switch (op){
                case "a": //Estado de ocupación de las habitaciones
                    System.out.println("HABITACIÓN 1: " + estadoHabitacion1);
                    System.out.println("HABITACIÓN 2: " + estadoHabitacion2);
                    System.out.println("HABITACIÓN 3: " + estadoHabitacion3);
                    System.out.println("HABITACIÓN 4: " + estadoHabitacion4);
                    System.out.println("HABITACIÓN 5: " + estadoHabitacion5);
                    System.out.println("HABITACIÓN 6: " + estadoHabitacion6);
                    System.out.println("HABITACIÓN 7: " + estadoHabitacion7);
                    System.out.println("HABITACIÓN 8: " + estadoHabitacion8);
                    System.out.println("HABITACIÓN 9: " + estadoHabitacion9);
                    System.out.println("HABITACIÓN 10: " + estadoHabitacion10);
                    break;
                case "b": //Reservar una habitación
                    //Menu de habitaciones
                    System.out.print("""
                            ===========================
                            LISTADO DE HABITACIONES DISPONIBLES
                            1.-Habitación 1 : Individual
                            2.-Habitación 2 : Individual
                            3.-Habitación 3 : Doble
                            4.-Habitación 4 : Doble
                            5.-Habitación 5 : Doble
                            6.-Habitación 6 : Doble
                            7.-Habitación 7 : Doble
                            8.-Habitación 8 : Doble
                            9.-Habitación 9 : Doble
                            10.-Habitación 10 : Doble
                            -Que habitación deseas reservar (1-10):""");
                    int numHabitacion = Integer.parseInt(s.nextLine());
                    switch (numHabitacion){
                        case 1: //Habitación 1
                            if (estadoHabitacion1.equals("Libre")) estadoHabitacion1 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 2: //Habitación 2
                            if (estadoHabitacion2.equals("Libre")) estadoHabitacion2 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 3: //Habitación 3
                            if (estadoHabitacion3.equals("Libre")) estadoHabitacion3 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 4: //Habitación 4
                            if (estadoHabitacion4.equals("Libre")) estadoHabitacion4 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 5: //Habitación 5
                            if (estadoHabitacion5.equals("Libre")) estadoHabitacion5 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 6: //Habitación 6
                            if (estadoHabitacion6.equals("Libre")) estadoHabitacion6 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 7: //Habitación 7
                            if (estadoHabitacion7.equals("Libre")) estadoHabitacion7 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 8: //Habitación 8
                            if (estadoHabitacion8.equals("Libre")) estadoHabitacion8 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 9: //Habitación 9
                            if (estadoHabitacion9.equals("Libre")) estadoHabitacion9 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        case 10: //Habitación 10
                            if (estadoHabitacion10.equals("Libre")) estadoHabitacion10 = "Ocupada";
                            System.out.println("Listo. Has reservado la habitación");
                            break;
                        default:
                            System.out.println("No hay más habitaciones");
                    }
                    break;
                case "c": //Realizar el checkout de una habitación
                    //Menu de habitaciones
                    boolean checkoutDone = false;
                    do {
                        System.out.print("""
                            ===========================
                            LISTADO DE HABITACIONES
                            1.-Habitación 1
                            2.-Habitación 2
                            3.-Habitación 3
                            4.-Habitación 4
                            5.-Habitación 5
                            6.-Habitación 6
                            7.-Habitación 7
                            8.-Habitación 8
                            9.-Habitación 9
                            10.-Habitación 10
                            11.-Salir
                            -Que habitación deseas consultar (1-10):""");
                        int checkout = Integer.parseInt(s.nextLine());
                        //Información sobre cada habitación
                        switch (checkout){
                            case 1:
                                System.out.println("La habitación es " + habitacion1 + " y está " + estadoHabitacion1);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 2:
                                System.out.println("La habitación es " + habitacion2 + " y está " + estadoHabitacion2);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 3:
                                System.out.println("La habitación es " + habitacion3 + " y está " + estadoHabitacion3);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 4:
                                System.out.println("La habitación es " + habitacion4 + " y está " + estadoHabitacion4);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 5:
                                System.out.println("La habitación es " + habitacion5 + " y está " + estadoHabitacion5);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 6:
                                System.out.println("La habitación es " + habitacion6 + " y está " + estadoHabitacion6);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 7:
                                System.out.println("La habitación es " + habitacion7 + " y está " + estadoHabitacion7);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 8:
                                System.out.println("La habitación es " + habitacion8 + " y está " + estadoHabitacion8);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 9:
                                System.out.println("La habitación es " + habitacion9 + " y está " + estadoHabitacion9);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 10:
                                System.out.println("La habitación es " + habitacion10 + " y está " + estadoHabitacion10);
                                System.out.println("Su precio es de: " + tarifaIndividual + " €");
                                System.out.println("Fecha de entrada: " + entrada);
                                System.out.println("¿Cúal es la fecha de salida?:");
                                salida = LocalDate.parse(s.nextLine());
                                if (salida.equals(entrada)) System.out.println("Fecha de salida incorrecta");
                                else System.out.println("Fecha de salida: " + salida);
                                break;
                            case 11: //Salir
                                break;
                            default:
                                System.out.println("No hay más habitaciones");
                        }
                    }while (!checkoutDone);
                    break;
                case "d": //Menú del administrador
                    do {
                        //Pedir datos de usuario
                        System.out.print("Introduce el nombre de usuario: ");
                        nombreUsuario = s.nextLine();
                        System.out.print("Introduce la contraseña: ");
                        password = s.nextLine();
                        //Lógica de login
                        if (nombreUsuario.equals("admin") && password.equals("1234")) {
                            accesoConcedido = true;
                            System.out.println("¡BIENVENIDO!!");
                            do {
                                //Menú administrador
                                System.out.print("""
                                        \n================================================================
                                        MENU DEL ADMINISTRADOR
                                        i. Consultar los ingresos totales y el número de reservas finalizadas.
                                        ii. Consultar las monedas restantes para el cambio.
                                        iii. Apagar el software
                                        iv. Volver al menú principal
                                        Elige una opción:""");
                                op2 = s.nextLine();
                                switch (op2) {
                                    case "i": //Consultar los ingresos totales y el número de reservas finalizadas.
                                        break;
                                    case "ii": //Consultar las monedas restantes para el cambio.
                                        break;
                                    case "iii": //Apagar el software
                                        System.out.println("Apagando el sistema...");
                                        System.exit(0); //Apaga el sistema
                                        break;
                                    case "iv": //Volver al menú principal
                                        System.out.println("Volviendo al menú principal");
                                        break;
                                    default:
                                        System.out.println("Opción incorrecta");
                                }
                            } while (!op2.equals("iv"));
                        }else{
                                System.out.println("Usuario o contraseña incorrectos");
                            }
                    }while (!accesoConcedido);
                        break;
                case "e": //Salir
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while (!op.equals("e"));
    }
}
