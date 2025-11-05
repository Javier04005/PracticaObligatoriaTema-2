import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        //Iniciar variables
        Scanner s = new Scanner(System.in);
        //Precio de las habitaciones por noche
        final int tarifaDoble = 60;
        final int tarifaIndividual = 45;
        //Variables de los menus
        String op, op2;
        int op4;
        //Variables de ingresos totales ---
        long ingresosTotales = 0;
        int reservasFinalizadas = 0;
        //Inventario para el cambio
        int billetes50 = 2, billetes20 = 5, billetes10 = 10, billetes5 = 20, monedas2 = 50, monedas1 = 100;
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
        //Variables fecha de entrada
        LocalDate entradaHabitacion1 = LocalDate.now();
        LocalDate entradaHabitacion2 = LocalDate.now();
        LocalDate entradaHabitacion3 = LocalDate.now();
        LocalDate entradaHabitacion4 = LocalDate.now();
        LocalDate entradaHabitacion5 = LocalDate.now();
        LocalDate entradaHabitacion6 = LocalDate.now();
        LocalDate entradaHabitacion7 = LocalDate.now();
        LocalDate entradaHabitacion8 = LocalDate.now();
        LocalDate entradaHabitacion9 = LocalDate.now();
        LocalDate entradaHabitacion10 = LocalDate.now();
        //Variables del administrador
        String nombreUsuario;
        String password;
        //Acceso para las credenciales del admin
        boolean accesoConcedido = false;
        //Lógica
        do {
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
            op = s.nextLine().toLowerCase();
            switch (op) {
                case "a": //Estado de ocupación de las habitaciones
                    String consultarTipoHabitacion;
                    do {
                        System.out.println("""
                                =============================================================
                                Hay 10 habitaciones de las cuales 2 son Libres y 8 son Individuales
                                Que tipo de habitación deseas consultar:
                                1-Individuales
                                2-Dobles
                                3-Salir""");
                        consultarTipoHabitacion = s.nextLine();
                        switch (consultarTipoHabitacion) {
                            case "1": //HABITACIONES INDIVIDUALES
                                System.out.println("La tarifa es de " + tarifaIndividual + "€");
                                System.out.println("La habitación 1 " + "está " + estadoHabitacion1);
                                System.out.println("La habitación 2 " + "está " + estadoHabitacion2);
                                break;
                            case "2": //HABITACIONES DOBLES
                                System.out.println("La tarifa es de " + tarifaDoble + "€");
                                System.out.println("La habitación 3 " + "está " + estadoHabitacion3);
                                System.out.println("La habitación 4 " + "está " + estadoHabitacion4);
                                System.out.println("La habitación 5 " + "está " + estadoHabitacion5);
                                System.out.println("La habitación 6 " + "está " + estadoHabitacion6);
                                System.out.println("La habitación 7 " + "está " + estadoHabitacion7);
                                System.out.println("La habitación 8 " + "está " + estadoHabitacion8);
                                System.out.println("La habitación 9 " + "está " + estadoHabitacion9);
                                System.out.println("La habitación 10 " + "está " + estadoHabitacion10);
                                break;
                            case "3": //Salir al menú principal
                                break;
                            default:
                                System.out.println("No hay más opciones");
                        }
                        System.out.print("Pulsa enter para continuar: ");
                        s.nextLine();
                    } while (!consultarTipoHabitacion.equals("3"));
                    for (int i = 0; i < 100; i++) {
                        System.out.println();
                    }
                    break;
                case "b": //Reservar una habitación
                    //Menu de habitaciones disponibles
                    String habitacionesDisponibles;
                    do {
                        //Menu listado de habitaciones
                        System.out.print("""
                                ===========================
                                LISTADO DE HABITACIONES DISPONIBLES
                                1-Individuales
                                2-Dobles
                                3-Reservar una habitación
                                4-Salir
                                Introduce una opción:""");
                        habitacionesDisponibles = s.nextLine();
                        switch (habitacionesDisponibles) {
                            case "1": //Individuales
                                for (int i = 0; i < 1; i++) {
                                    System.out.println(" 1º" + estadoHabitacion1.concat(" 2º" + estadoHabitacion2));
                                }
                                break;
                            case "2": //Dobles
                                for (int i = 0; i < 1; i++) {
                                    System.out.println(" 3º" + estadoHabitacion3.concat(" 4º" +
                                            estadoHabitacion4).concat(" 5º" + estadoHabitacion5.concat(" 6º"
                                            + estadoHabitacion6).concat(" 7º" + estadoHabitacion7).concat(" 8º"
                                            + estadoHabitacion8).concat(" 9º" + estadoHabitacion9).concat(" 10º" + estadoHabitacion10)));
                                }
                                break;
                            case "3": //Reservar una habitación
                                String numHabitacion;
                                do {
                                    //Menu habitaciones
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
                                            Elige una habitación(1-10):""");
                                    numHabitacion = s.nextLine();
                                    switch (numHabitacion) {
                                        case "1": //Habitación 1
                                            if (estadoHabitacion1.equals("Libre")) {
                                                estadoHabitacion1 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "2": //Habitación 2
                                            if (estadoHabitacion2.equals("Libre")) {
                                                estadoHabitacion2 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "3": //Habitación 3
                                            if (estadoHabitacion3.equals("Libre")) {
                                                estadoHabitacion3 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "4": //Habitación 4
                                            if (estadoHabitacion4.equals("Libre")) {
                                                estadoHabitacion4 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "5": //Habitación 5
                                            if (estadoHabitacion5.equals("Libre")) {
                                                estadoHabitacion5 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "6": //Habitación 6
                                            if (estadoHabitacion6.equals("Libre")) {
                                                estadoHabitacion6 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "7": //Habitación 7
                                            if (estadoHabitacion7.equals("Libre")) {
                                                estadoHabitacion7 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "8": //Habitación 8
                                            if (estadoHabitacion8.equals("Libre")) {
                                                estadoHabitacion8 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "9": //Habitación 9
                                            if (estadoHabitacion9.equals("Libre")) {
                                                estadoHabitacion9 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "10": //Habitación 10
                                            if (estadoHabitacion10.equals("Libre")) {
                                                estadoHabitacion10 = "Ocupada";
                                                System.out.println("Listo. Has reservado la habitación");
                                            } else System.out.println("La habitación está ocupada");
                                            break;
                                        case "11":
                                            break;
                                        default:
                                            System.out.println("No hay más habitaciones");
                                    }
                                } while (!numHabitacion.equals("11"));
                                break;
                            case "4": //Salir
                                break;
                            default:
                                System.out.println("No hay más opciones");
                        }
                        System.out.print("Pulsa enter para continuar: ");
                        s.nextLine();
                    } while (!habitacionesDisponibles.equals("4"));
                    for (int i = 0; i < 100; i++) {
                        System.out.println();
                    }
                    break;
                case "c": //Realizar el checkout de una habitación (Fecha de salida,cobro,factura)
                    //Menu CHECKOUT
                    do {
                        System.out.print("""
                                ===========================
                                CHECKOUT DE HABITACIONES
                                1.-Ver habitaciones ocupadas
                                2.-Facturar habitación
                                3.-Salir
                                Elige una opción:""");
                        op4 = Integer.parseInt(s.nextLine());
                        switch (op4) {
                            case 1:
                                System.out.println("--- Habitaciones Ocupadas ---");
                                if (estadoHabitacion1.equals("Ocupada")) System.out.print("Habitación 1 ");
                                if (estadoHabitacion2.equals("Ocupada")) System.out.print("Habitación 2 ");
                                if (estadoHabitacion3.equals("Ocupada")) System.out.print("Habitación 3 ");
                                if (estadoHabitacion4.equals("Ocupada")) System.out.print("Habitación 4 ");
                                if (estadoHabitacion5.equals("Ocupada")) System.out.print("Habitación 5 ");
                                if (estadoHabitacion6.equals("Ocupada")) System.out.print("Habitación 6 ");
                                if (estadoHabitacion7.equals("Ocupada")) System.out.print("Habitación 7 ");
                                if (estadoHabitacion8.equals("Ocupada")) System.out.print("Habitación 8 ");
                                if (estadoHabitacion9.equals("Ocupada")) System.out.print("Habitación 9 ");
                                if (estadoHabitacion10.equals("Ocupada")) System.out.print("Habitación 10 ");
                                System.out.println();
                                break;
                            case 2:
                                int numFacturar = -1;
                                System.out.print("Introduce el número de habitación a liberar (1-10): ");
                                try {
                                    numFacturar = Integer.parseInt(s.nextLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("Entrada no válida. Introduce un número.");
                                    break;
                                }

                                if (numFacturar >= 1 && numFacturar <= 10) {
                                    // Determinar la variable de fecha y la tarifa a usar
                                    LocalDate entrada = null;
                                    int tarifa = 0;
                                    String tipoHabitacion = "";

                                    // Lógica para obtener los datos
                                    if (numFacturar == 1) {
                                        entrada = entradaHabitacion1;
                                        tarifa = tarifaIndividual;
                                        tipoHabitacion = "Individual";
                                    } else if (numFacturar == 2) {
                                        entrada = entradaHabitacion2;
                                        tarifa = tarifaIndividual;
                                        tipoHabitacion = "Individual";
                                    } else if (numFacturar == 3) {
                                        entrada = entradaHabitacion3;
                                        tarifa = tarifaDoble;
                                        tipoHabitacion = "Doble";
                                    } else if (numFacturar == 4) {
                                        entrada = entradaHabitacion4;
                                        tarifa = tarifaDoble;
                                        tipoHabitacion = "Doble";
                                    } else if (numFacturar == 5) {
                                        entrada = entradaHabitacion5;
                                        tarifa = tarifaDoble;
                                        tipoHabitacion = "Doble";
                                    } else if (numFacturar == 6) {
                                        entrada = entradaHabitacion6;
                                        tarifa = tarifaDoble;
                                        tipoHabitacion = "Doble";
                                    } else if (numFacturar == 7) {
                                        entrada = entradaHabitacion7;
                                        tarifa = tarifaDoble;
                                        tipoHabitacion = "Doble";
                                    } else if (numFacturar == 8) {
                                        entrada = entradaHabitacion8;
                                        tarifa = tarifaDoble;
                                        tipoHabitacion = "Doble";
                                    } else if (numFacturar == 9) {
                                        entrada = entradaHabitacion9;
                                        tarifa = tarifaDoble;
                                        tipoHabitacion = "Doble";
                                    } else if (numFacturar == 10) {
                                        entrada = entradaHabitacion10;
                                        tarifa = tarifaDoble;
                                        tipoHabitacion = "Doble";
                                    }

                                    // Verificar si la habitación está ocupada y tiene fecha de entrada
                                    if (entrada == null) {
                                        System.out.println("La Habitación " + numFacturar + " está Libre o no tiene registro de entrada.");
                                        break;
                                    }

                                    // Lógica de validación de fecha de salida
                                    LocalDate salida = null;
                                    long diasEstancia = 0;
                                    boolean fechaValida = false;

                                    while (!fechaValida) {
                                        try {
                                            System.out.print("Introduce la fecha de salida (YYYY-MM-DD): ");
                                            salida = LocalDate.parse(s.nextLine());

                                            if (salida.isBefore(entrada) || salida.isEqual(entrada)) {
                                                System.out.println("La fecha de salida debe ser posterior a la entrada (" + entrada + ").");
                                            } else {
                                                diasEstancia = ChronoUnit.DAYS.between(entrada, salida);
                                                fechaValida = true;
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Formato de fecha incorrecto. Usa YYYY-MM-DD.");
                                        }
                                    }

                                    // Calcular el cobro de la habitación y generar la factura
                                    long cobro = diasEstancia * tarifa;
                                    ingresosTotales += cobro;
                                    reservasFinalizadas++;

                                    System.out.println("\n================ FACTURA ================");
                                    System.out.println("Habitación: " + numFacturar + " (" + tipoHabitacion + ")");
                                    System.out.println("Tarifa por noche: " + tarifa + "€");
                                    System.out.println("Fecha de entrada: " + entrada);
                                    System.out.println("Fecha de salida:  " + salida);
                                    System.out.println("Días de estancia: " + diasEstancia);
                                    System.out.println("-----------------------------------------");
                                    System.out.println("COBRO TOTAL: " + cobro + "€");
                                    System.out.println("=========================================\n");

                                    // Liberar habitación para que esté libre de nuevo
                                    if (numFacturar == 1) {
                                        estadoHabitacion1 = "Libre";
                                        entradaHabitacion1 = null;
                                    } else if (numFacturar == 2) {
                                        estadoHabitacion2 = "Libre";
                                        entradaHabitacion2 = null;
                                    } else if (numFacturar == 3) {
                                        estadoHabitacion3 = "Libre";
                                        entradaHabitacion3 = null;
                                    } else if (numFacturar == 4) {
                                        estadoHabitacion4 = "Libre";
                                        entradaHabitacion4 = null;
                                    } else if (numFacturar == 5) {
                                        estadoHabitacion5 = "Libre";
                                        entradaHabitacion5 = null;
                                    } else if (numFacturar == 6) {
                                        estadoHabitacion6 = "Libre";
                                        entradaHabitacion6 = null;
                                    } else if (numFacturar == 7) {
                                        estadoHabitacion7 = "Libre";
                                        entradaHabitacion7 = null;
                                    } else if (numFacturar == 8) {
                                        estadoHabitacion8 = "Libre";
                                        entradaHabitacion8 = null;
                                    } else if (numFacturar == 9) {
                                        estadoHabitacion9 = "Libre";
                                        entradaHabitacion9 = null;
                                    } else if (numFacturar == 10) {
                                        estadoHabitacion10 = "Libre";
                                        entradaHabitacion10 = null;
                                    }

                                    System.out.println("Habitación " + numFacturar + " liberada y lista para la siguiente reserva.");

                                } else System.out.println("Número de habitación no válido.");
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("No hay más opciones");
                        }
                    } while (op4 != 3);
                    System.out.print("Pulsa enter para continuar: ");
                    s.nextLine();
                    break;
                case "d": //Menú del administrador
                    //Pedir datos de usuario
                    accesoConcedido = false;
                    int intentos = 0;
                    // Bucle de inicio de sesión con tres intentos
                    while (intentos < 3 && !accesoConcedido) {
                        System.out.print("Introduce tu nombre de usuario: ");
                        nombreUsuario = s.nextLine();
                        System.out.print("Introduce tu clave de usuario: ");
                        password = s.nextLine();

                        if (nombreUsuario.equals("admin") && password.equals("1234")) {
                            accesoConcedido = true;
                            System.out.println("¡BIENVENIDO ADMIN!");
                        } else {
                            intentos++;
                            System.out.println("Usuario o contraseña incorrectos.\nIntentos restantes: " + (3 - intentos));
                        }
                    }
                    if (accesoConcedido) {
                        //Menú administrador
                        do {
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
                                case "i": // Ingresos totales y reservas finalizadas
                                    System.out.println("\n--- INGRESOS DEL HOTEL ---");
                                    System.out.println("Ingresos Totales Acumulados: " + ingresosTotales + "€");
                                    System.out.println("Reservas Finalizadas: " + reservasFinalizadas);
                                    break;
                                case "ii": //Consultar las monedas restantes para el cambio.
                                    int valorTotalCambio;
                                    System.out.println("\n--- INVENTARIO DE CAMBIO ---");
                                    System.out.println("Billetes de 50€: " + billetes50);
                                    System.out.println("Billetes de 20€: " + billetes20);
                                    System.out.println("Billetes de 10€: " + billetes10);
                                    System.out.println("Billetes de 5€:  " + billetes5);
                                    System.out.println("Monedas de 2€:   " + monedas2);
                                    System.out.println("Monedas de 1€:   " + monedas1);
                                    valorTotalCambio = (billetes50 * 50) + (billetes20 * 20) +
                                            (billetes10 * 10) + (billetes5 * 5) +
                                            (monedas2 * 2) + (monedas1 * 1);
                                    System.out.println("La caja de cambio ha acumulado: " + valorTotalCambio + "€");
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
                    } else {
                        System.out.println("Acceso denegado. Volviendo al menú principal...");
                    }
                    System.out.print("Pulsa enter para continuar: ");
                    s.nextLine();
                    break;
                case "e": //Salir
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!op.equals("e"));
    }
}
