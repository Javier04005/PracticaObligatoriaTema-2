import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        //Iniciar variables
        Scanner s = new Scanner(System.in);

        //Precios de las habitaciones por noche
        final int tarifaDoble = 60;
        final int tarifaIndividual = 45;

        //VARIABLES DE CLIENTE, UNA POR HABITACIÓN ---
        // Se usan variables específicas para que los datos no se sobrescriban.
        String nombreCliente1 = ""; int telefono1 = 0;
        String nombreCliente2 = ""; int telefono2 = 0;
        String nombreCliente3 = ""; int telefono3 = 0;
        String nombreCliente4 = ""; int telefono4 = 0;
        String nombreCliente5 = ""; int telefono5 = 0;
        String nombreCliente6 = ""; int telefono6 = 0;
        String nombreCliente7 = ""; int telefono7 = 0;
        String nombreCliente8 = ""; int telefono8 = 0;
        String nombreCliente9 = ""; int telefono9 = 0;
        String nombreCliente10 = ""; int telefono10 = 0;

        //Variables de los menus
        String op, op2;
        int op4;

        //Variables de ingresos totales
        double ingresosTotales = 0.0;
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
        LocalDate entradaHabitacion1 = null;
        LocalDate entradaHabitacion2 = null;
        LocalDate entradaHabitacion3 = null;
        LocalDate entradaHabitacion4 = null;
        LocalDate entradaHabitacion5 = null;
        LocalDate entradaHabitacion6 = null;
        LocalDate entradaHabitacion7 = null;
        LocalDate entradaHabitacion8 = null;
        LocalDate entradaHabitacion9 = null;
        LocalDate entradaHabitacion10 = null;

        //Variables del administrador
        String nombreUsuario;
        String password;
        //Acceso para las credenciales del admin
        boolean accesoConcedido;

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
                                Hay 10 habitaciones (2 Individuales, 8 Dobles)
                                Qué tipo de habitación deseas consultar:
                                1-Individuales
                                2-Dobles
                                3-Salir""");
                        consultarTipoHabitacion = s.nextLine();
                        switch (consultarTipoHabitacion) {
                            case "1": //HABITACIONES INDIVIDUALES
                                System.out.println("La tarifa es de " + tarifaIndividual + "€");
                                System.out.println("La habitación 1 " + "está " + estadoHabitacion1 + (estadoHabitacion1.equals("Ocupada") ? " (Entrada: " + entradaHabitacion1 + ")" : ""));
                                System.out.println("La habitación 2 " + "está " + estadoHabitacion2 + (estadoHabitacion2.equals("Ocupada") ? " (Entrada: " + entradaHabitacion2 + ")" : ""));
                                break;
                            case "2": //HABITACIONES DOBLES
                                System.out.println("La tarifa es de " + tarifaDoble + "€");
                                System.out.println("La habitación 3 " + "está " + estadoHabitacion3 + (estadoHabitacion3.equals("Ocupada") ? " (Entrada: " + entradaHabitacion3 + ")" : ""));
                                System.out.println("La habitación 4 " + "está " + estadoHabitacion4 + (estadoHabitacion4.equals("Ocupada") ? " (Entrada: " + entradaHabitacion4 + ")" : ""));
                                System.out.println("La habitación 5 " + "está " + estadoHabitacion5 + (estadoHabitacion5.equals("Ocupada") ? " (Entrada: " + entradaHabitacion5 + ")" : ""));
                                System.out.println("La habitación 6 " + "está " + estadoHabitacion6 + (estadoHabitacion6.equals("Ocupada") ? " (Entrada: " + entradaHabitacion6 + ")" : ""));
                                System.out.println("La habitación 7 " + "está " + estadoHabitacion7 + (estadoHabitacion7.equals("Ocupada") ? " (Entrada: " + entradaHabitacion7 + ")" : ""));
                                System.out.println("La habitación 8 " + "está " + estadoHabitacion8 + (estadoHabitacion8.equals("Ocupada") ? " (Entrada: " + entradaHabitacion8 + ")" : ""));
                                System.out.println("La habitación 9 " + "está " + estadoHabitacion9 + (estadoHabitacion9.equals("Ocupada") ? " (Entrada: " + entradaHabitacion9 + ")" : ""));
                                System.out.println("La habitación 10 " + "está " + estadoHabitacion10 + (estadoHabitacion10.equals("Ocupada") ? " (Entrada: " + entradaHabitacion10 + ")" : ""));
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
                                            Elige una habitación: (1-10):""");
                                    numHabitacion = s.nextLine();

                                    int numHab = -1;
                                    try {
                                        numHab = Integer.parseInt(numHabitacion);
                                    } catch (NumberFormatException e) {
                                        if (!numHabitacion.equals("11")) {
                                            System.out.println("Entrada no válida. Introduce un número de habitación o 11 para salir.");
                                        }
                                        continue;
                                    }

                                    if (numHab >= 1 && numHab <= 10) {
                                        String estadoActual = null;

                                        // Determinar el estado
                                        switch (numHab) {
                                            case 1: estadoActual = estadoHabitacion1; break;
                                            case 2: estadoActual = estadoHabitacion2; break;
                                            case 3: estadoActual = estadoHabitacion3; break;
                                            case 4: estadoActual = estadoHabitacion4; break;
                                            case 5: estadoActual = estadoHabitacion5; break;
                                            case 6: estadoActual = estadoHabitacion6; break;
                                            case 7: estadoActual = estadoHabitacion7; break;
                                            case 8: estadoActual = estadoHabitacion8; break;
                                            case 9: estadoActual = estadoHabitacion9; break;
                                            case 10: estadoActual = estadoHabitacion10; break;
                                        }

                                        if (estadoActual.equals("Libre")) {
                                            //Variables temporales del Cliente
                                            String tempNombre;
                                            int tempTelefono = 0;

                                            System.out.print("¿Cómo te llamas?: ");
                                            tempNombre = s.nextLine();
                                            System.out.print("¿Cuál es tu número de teléfono?: ");
                                            try {
                                                tempTelefono = Integer.parseInt(s.nextLine());
                                            } catch (NumberFormatException e) {
                                                System.out.println("Número de teléfono no válido. La reserva no se completará.");
                                                continue;
                                            }

                                            // Asignar fecha de entrada (hoy)
                                            LocalDate fechaEntrada = LocalDate.now();

                                            // Actualizar estado, fecha Y DATOS DEL CLIENTE
                                            switch (numHab) {
                                                case 1:
                                                    estadoHabitacion1 = "Ocupada"; entradaHabitacion1 = fechaEntrada;
                                                    nombreCliente1 = tempNombre; telefono1 = tempTelefono;
                                                    break;
                                                case 2:
                                                    estadoHabitacion2 = "Ocupada"; entradaHabitacion2 = fechaEntrada;
                                                    nombreCliente2 = tempNombre; telefono2 = tempTelefono;
                                                    break;
                                                case 3:
                                                    estadoHabitacion3 = "Ocupada"; entradaHabitacion3 = fechaEntrada;
                                                    nombreCliente3 = tempNombre; telefono3 = tempTelefono;
                                                    break;
                                                case 4:
                                                    estadoHabitacion4 = "Ocupada"; entradaHabitacion4 = fechaEntrada;
                                                    nombreCliente4 = tempNombre; telefono4 = tempTelefono;
                                                    break;
                                                case 5:
                                                    estadoHabitacion5 = "Ocupada"; entradaHabitacion5 = fechaEntrada;
                                                    nombreCliente5 = tempNombre; telefono5 = tempTelefono;
                                                    break;
                                                case 6:
                                                    estadoHabitacion6 = "Ocupada"; entradaHabitacion6 = fechaEntrada;
                                                    nombreCliente6 = tempNombre; telefono6 = tempTelefono;
                                                    break;
                                                case 7:
                                                    estadoHabitacion7 = "Ocupada"; entradaHabitacion7 = fechaEntrada;
                                                    nombreCliente7 = tempNombre; telefono7 = tempTelefono;
                                                    break;
                                                case 8:
                                                    estadoHabitacion8 = "Ocupada"; entradaHabitacion8 = fechaEntrada;
                                                    nombreCliente8 = tempNombre; telefono8 = tempTelefono;
                                                    break;
                                                case 9:
                                                    estadoHabitacion9 = "Ocupada"; entradaHabitacion9 = fechaEntrada;
                                                    nombreCliente9 = tempNombre; telefono9 = tempTelefono;
                                                    break;
                                                case 10:
                                                    estadoHabitacion10 = "Ocupada"; entradaHabitacion10 = fechaEntrada;
                                                    nombreCliente10 = tempNombre; telefono10 = tempTelefono;
                                                    break;
                                            }

                                            System.out.println("Listo. Has reservado la habitación " + numHab + ". Fecha de entrada: " + fechaEntrada);
                                        } else {
                                            System.out.println("La habitación está ocupada");
                                        }
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
                        try {
                            op4 = Integer.parseInt(s.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada no válida. Introduce 1, 2 o 3.");
                            op4 = 0;
                            continue;
                        }

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
                                int numFacturar;
                                System.out.print("Introduce el número de habitación a facturar (1-10): ");
                                try {
                                    numFacturar = Integer.parseInt(s.nextLine());
                                } catch (NumberFormatException e) {
                                    System.out.println("Entrada no válida. Introduce un número.");
                                    break;
                                }

                                if (numFacturar >= 1 && numFacturar <= 10) {
                                    // Determinar la variable de fecha, la tarifa y el cliente a usar
                                    LocalDate entrada = null;
                                    int tarifa = 0;
                                    String tipoHabitacion = "";
                                    String nombreFactura = "";
                                    int telefonoFactura = 0;

                                    // Lógica para obtener los datos
                                    switch (numFacturar) {
                                        case 1: entrada = entradaHabitacion1; tarifa = tarifaIndividual; tipoHabitacion = "Individual"; nombreFactura = nombreCliente1; telefonoFactura = telefono1; break;
                                        case 2: entrada = entradaHabitacion2; tarifa = tarifaIndividual; tipoHabitacion = "Individual"; nombreFactura = nombreCliente2; telefonoFactura = telefono2; break;
                                        case 3: entrada = entradaHabitacion3; tarifa = tarifaDoble; tipoHabitacion = "Doble"; nombreFactura = nombreCliente3; telefonoFactura = telefono3; break;
                                        case 4: entrada = entradaHabitacion4; tarifa = tarifaDoble; tipoHabitacion = "Doble"; nombreFactura = nombreCliente4; telefonoFactura = telefono4; break;
                                        case 5: entrada = entradaHabitacion5; tarifa = tarifaDoble; tipoHabitacion = "Doble"; nombreFactura = nombreCliente5; telefonoFactura = telefono5; break;
                                        case 6: entrada = entradaHabitacion6; tarifa = tarifaDoble; tipoHabitacion = "Doble"; nombreFactura = nombreCliente6; telefonoFactura = telefono6; break;
                                        case 7: entrada = entradaHabitacion7; tarifa = tarifaDoble; tipoHabitacion = "Doble"; nombreFactura = nombreCliente7; telefonoFactura = telefono7; break;
                                        case 8: entrada = entradaHabitacion8; tarifa = tarifaDoble; tipoHabitacion = "Doble"; nombreFactura = nombreCliente8; telefonoFactura = telefono8; break;
                                        case 9: entrada = entradaHabitacion9; tarifa = tarifaDoble; tipoHabitacion = "Doble"; nombreFactura = nombreCliente9; telefonoFactura = telefono9; break;
                                        case 10: entrada = entradaHabitacion10; tarifa = tarifaDoble; tipoHabitacion = "Doble"; nombreFactura = nombreCliente10; telefonoFactura = telefono10; break;
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

                                    //Calculamos el cobro de la habitación y generamos la factura
                                    double subtotal = (double) diasEstancia * tarifa; // Monto o Subtotal (sin IVA)
                                    double ivaRate = 0.21;
                                    double iva = subtotal * ivaRate;
                                    double totalSinRedondear = subtotal + iva;

                                    // Redondeamos el total al euro más cercano para trabajar con el inventario de cambio
                                    int totalAPagar = (int) Math.round(totalSinRedondear);

                                    // Presentación de la factura
                                    System.out.println("\n====================== FACTURA ======================");
                                    System.out.println("Cliente: " + nombreFactura);
                                    System.out.println("Teléfono: " + telefonoFactura);
                                    System.out.println("Habitación: " + numFacturar + " (" + tipoHabitacion + ")");
                                    System.out.println("Tarifa por noche: " + tarifa + "€");
                                    System.out.println("Fecha de entrada: " + entrada);
                                    System.out.println("Fecha de salida:  " + salida);
                                    System.out.println("Días de estancia: " + diasEstancia);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.printf("Subtotal (Monto o Total sin IVA): %.2f€\n", subtotal);
                                    System.out.printf("IVA (21%%):                        %.2f€\n", iva);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.printf("TOTAL (Redondeado a entero):      %d€\n", totalAPagar);
                                    System.out.println("=====================================================\n");

                                    //Lógica de Pago y Cambio
                                    double dineroEntregado = 0.0;
                                    int cambioRequerido = 0;
                                    boolean pagado = false;

                                    while (!pagado) {
                                        try {
                                            System.out.printf("Pendiente de pago: %d€ (solo contado).\n", totalAPagar);
                                            System.out.print("Introduce la cantidad pagada: ");
                                            // Se usa replace para aceptar tanto ',' como '.' como separador decimal
                                            dineroEntregado = Double.parseDouble(s.nextLine().replace(',', '.'));
                                        } catch (NumberFormatException e) {
                                            System.out.println("Entrada no válida. Introduce una cantidad numérica.");
                                            continue;
                                        }

                                        if (dineroEntregado < totalAPagar) {
                                            System.out.printf("Error: La cantidad entregada (%.2f€) es insuficiente. El total es %d€.\n", dineroEntregado, totalAPagar);
                                            continue;
                                        }

                                        // Redondeamos el dinero entregado a entero para calcular el cambio
                                        cambioRequerido = (int) Math.round(dineroEntregado) - totalAPagar;

                                        if (cambioRequerido == 0) {
                                            System.out.println("Pago exacto recibido. No hay cambio.");
                                            pagado = true;
                                        } else {
                                            //Cambio de monedas
                                            int dar50 = 0;
                                            int dar20 = 0;
                                            int dar10 = 0;
                                            int dar5 = 0;
                                            int dar2 = 0;
                                            int dar1 = 0;

                                            int cambioRestante = cambioRequerido;

                                            // 50 EUROS
                                            if (cambioRestante >= 50) {
                                                int cantidadNecesaria = cambioRestante / 50;
                                                dar50 = Math.min(cantidadNecesaria, billetes50);
                                                cambioRestante -= dar50 * 50;
                                            }

                                            // 20 EUROS
                                            if (cambioRestante >= 20) {
                                                int cantidadNecesaria = cambioRestante / 20;
                                                dar20 = Math.min(cantidadNecesaria, billetes20);
                                                cambioRestante -= dar20 * 20;
                                            }

                                            // 10 EUROS
                                            if (cambioRestante >= 10) {
                                                int cantidadNecesaria = cambioRestante / 10;
                                                dar10 = Math.min(cantidadNecesaria, billetes10);
                                                cambioRestante -= dar10 * 10;
                                            }

                                            // 5 EUROS
                                            if (cambioRestante >= 5) {
                                                int cantidadNecesaria = cambioRestante / 5;
                                                dar5 = Math.min(cantidadNecesaria, billetes5);
                                                cambioRestante -= dar5 * 5;
                                            }

                                            // 2 EUROS
                                            if (cambioRestante >= 2) {
                                                int cantidadNecesaria = cambioRestante / 2;
                                                dar2 = Math.min(cantidadNecesaria, monedas2);
                                                cambioRestante -= dar2 * 2;
                                            }

                                            // 1 EURO
                                            if (cambioRestante >= 1) {
                                                int cantidadNecesaria = cambioRestante;
                                                dar1 = Math.min(cantidadNecesaria, monedas1);
                                                cambioRestante -= dar1;
                                            }

                                            boolean suficienteCambio = (cambioRestante == 0);

                                            if (suficienteCambio) {
                                                System.out.printf("Se debe entregar un cambio de %d€.\n", cambioRequerido);
                                                System.out.println("--- Cambio Entregado ---");

                                                // Actualizar inventario global e imprimir cambio
                                                if (dar50 > 0) {
                                                    System.out.printf("- %d x Billetes de 50€\n", dar50);
                                                    billetes50 -= dar50;
                                                }
                                                if (dar20 > 0) {
                                                    System.out.printf("- %d x Billetes de 20€\n", dar20);
                                                    billetes20 -= dar20;
                                                }
                                                if (dar10 > 0) {
                                                    System.out.printf("- %d x Billetes de 10€\n", dar10);
                                                    billetes10 -= dar10;
                                                }
                                                if (dar5 > 0) {
                                                    System.out.printf("- %d x Billetes de 5€\n", dar5);
                                                    billetes5 -= dar5;
                                                }
                                                if (dar2 > 0) {
                                                    System.out.printf("- %d x Monedas de 2€\n", dar2);
                                                    monedas2 -= dar2;
                                                }
                                                if (dar1 > 0) {
                                                    System.out.printf("- %d x Monedas de 1€\n", dar1);
                                                    monedas1 -= dar1;
                                                }

                                                // Actualizar ingresos y reservas
                                                ingresosTotales += totalAPagar;
                                                reservasFinalizadas++;
                                                pagado = true; // Pago exitoso
                                            } else {
                                                System.out.printf("ERROR: No tenemos suficiente cambio exacto (%d€) en caja para devolver.\n", cambioRequerido);
                                                System.out.printf("Por favor, pague con el importe exacto (%d€) o una cantidad que requiera menos cambio.\n%n", totalAPagar);
                                                // El bucle de pago continúa
                                            }
                                        }
                                    } // Fin del bucle de pago


                                    //Liberar habitación y datos del cliente
                                    if (pagado) {
                                        switch (numFacturar) {
                                            case 1: estadoHabitacion1 = "Libre"; entradaHabitacion1 = null; nombreCliente1 = ""; telefono1 = 0; break;
                                            case 2: estadoHabitacion2 = "Libre"; entradaHabitacion2 = null; nombreCliente2 = ""; telefono2 = 0; break;
                                            case 3: estadoHabitacion3 = "Libre"; entradaHabitacion3 = null; nombreCliente3 = ""; telefono3 = 0; break;
                                            case 4: estadoHabitacion4 = "Libre"; entradaHabitacion4 = null; nombreCliente4 = ""; telefono4 = 0; break;
                                            case 5: estadoHabitacion5 = "Libre"; entradaHabitacion5 = null; nombreCliente5 = ""; telefono5 = 0; break;
                                            case 6: estadoHabitacion6 = "Libre"; entradaHabitacion6 = null; nombreCliente6 = ""; telefono6 = 0; break;
                                            case 7: estadoHabitacion7 = "Libre"; entradaHabitacion7 = null; nombreCliente7 = ""; telefono7 = 0; break;
                                            case 8: estadoHabitacion8 = "Libre"; entradaHabitacion8 = null; nombreCliente8 = ""; telefono8 = 0; break;
                                            case 9: estadoHabitacion9 = "Libre"; entradaHabitacion9 = null; nombreCliente9 = ""; telefono9 = 0; break;
                                            case 10: estadoHabitacion10 = "Libre"; entradaHabitacion10 = null; nombreCliente10 = ""; telefono10 = 0; break;
                                        }
                                        System.out.println("\n-----------------------------------------------------");
                                        System.out.println("¡Transacción finalizada! Habitación " + numFacturar + " liberada.");
                                        System.out.println("-----------------------------------------------------");
                                    }

                                } else {
                                    System.out.println("Número de habitación no válido.");
                                }
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
                                    System.out.printf("Ingresos Totales Acumulados: %.2f€\n", ingresosTotales);
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
                                    valorTotalCambio = (billetes50 * 50) + (billetes20 * 20) + (billetes10 * 10) +
                                            (billetes5 * 5) + (monedas2 * 2) + (monedas1);
                                    System.out.println("La caja de cambio ha acumulado: " + valorTotalCambio + "€");
                                    break;
                                case "iii": //Apagar el software
                                    System.out.println("Apagando el sistema...");
                                    s.close();
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
        s.close();
    }
}