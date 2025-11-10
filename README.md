🏨 Sistema de Gestión Hotel Ciudad MartosEste proyecto es un sistema de gestión simple para un hotel, implementado en Java. Permite a los usuarios y administradores realizar reservas, verificar la ocupación de las habitaciones y gestionar la facturación (checkout) con control de inventario de cambio.
🚀 Cómo Empezar
Prerrequisitos
Necesitarás tener instalado un entorno de desarrollo de Java (JDK) para compilar y ejecutar el código.
Java Development Kit (JDK) 8 o superiorEjecución
Clona el repositorio a tu máquina local:
git clone [URL_DE_TU_REPOSITORIO]
cd Hotel
Compila el archivo Java (si usas la terminal):
javac Hotel.java
Ejecuta el programa:
java Hotel
El sistema se iniciará mostrando el menú principal.
✨ Funcionalidades
El sistema ofrece las siguientes características principales a través de un menú interactivo:
Consulta de Ocupación: Visualiza rápidamente qué habitaciones están Libres u Ocupadas, incluyendo la fecha de entrada de los huéspedes.
Reserva: Registra nuevos clientes con nombre y teléfono, y marca una habitación como Ocupada con la fecha actual.
Checkout y Facturación: Proceso de salida que incluye:
-Cálculo de la estancia y el costo total (aplicando un 21% de IVA).
-Gestión de pago en efectivo (redondeo del total a entero).
-Cálculo del cambio requerido y uso de un inventario predefinido de billetes/monedas.
-Liberación de la habitación.
Menú de Administrador: Acceso protegido por credenciales para consultar métricas financieras.
🔑 Acceso de Administrador
Para acceder a las funciones de gestión de ingresos y cambio, usa las siguientes credenciales:
-Usuario: admin
-Contraseña:1234 
Estructura y Tarifas del Hotel
El sistema gestiona 10 habitaciones con las siguientes tarifas por noche:
Tipo de Habitaciones
-INDIVIDUAL (1,2) 45€
-DOBLES (3-10) 60€
⚙️ Tecnologías Utilizadas
Lenguaje de Programación: Java
Librerías Clave: java.time.LocalDate y java.time.temporal.ChronoUnit (para manejo de fechas y cálculo de días).
💡 Notas de Desarrollo
1-El código utiliza variables específicas para cada una de las 10 habitaciones y sus respectivos clientes (estadoHabitacion1, nombreCliente1, etc.). 
2-El cálculo del cambio se realiza de forma greedy, priorizando la entrega de la denominación más alta disponible.
3-El total a pagar se redondea al euro más cercano para facilitar el cálculo del cambio con el inventario de caja.
