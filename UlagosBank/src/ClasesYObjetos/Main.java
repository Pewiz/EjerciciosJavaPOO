package ClasesYObjetos;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Ejecutivo> ejecutivos = new ArrayList<Ejecutivo>();
    public static void main(String[] args) {
        Ejecutivo ejecutivoPrincipal = new Ejecutivo("Pedro", new Fecha(06, 02, 2003), "21234083-9", "1234567891", "qwerty");
        ejecutivos.add(ejecutivoPrincipal);
        Scanner leer = new Scanner(System.in);

        int opcionMenu1;

        do{
            boolean encontrado = false;
            System.out.println("--UlagosBank--");
            System.out.println("1.- Cliente");
            System.out.println("2.- Ejecutivo");
            System.out.println("3.- Salir");
            System.out.print("Opcion: ");
            opcionMenu1 = leer.nextInt();
            String rut="", usuario="", password="";
            
            switch (opcionMenu1) {
                case 1: 
                        System.out.println("-- LOGIN CLIENTE -- ");
                        System.out.print("Rut: ");
                        leer.nextLine();
                        rut = leer.nextLine();
                        System.out.print("Password: ");
                        password = leer.nextLine();
                        int i=0;
                        for(Cliente cliente: clientes){
                            if(cliente.getRut().equals(rut) && cliente.getPassword().equals(password)  ){
                                menuCliente(leer, i); 
                                encontrado = true;
                                break;
                                
                            }
                            i++;
                        }
                        if (!encontrado) {
                            System.out.println("Rut o Password incorrectos");
                            break;
                        }
                        break;
                case 2: 
                        System.out.println("-- LOGIN EJECUTIVO -- ");
                        System.out.print("Usuario: ");
                        leer.nextLine();
                        usuario = leer.nextLine();
                        System.out.print("Password: ");
                        password = leer.nextLine();
                        
                        for(Ejecutivo ejecutivo: ejecutivos){
                            if(ejecutivo.getUsuario().equals(usuario) && ejecutivo.getPassword().equals(password)){
                                menuEjecutivo(leer); 
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Rut o Password incorrectos");
                            break;
                        }
                        break;
                
                case 3: break;

                default: System.out.println("Opcion no valida"); break;
            }

        }while(opcionMenu1!=3);

    }

    public static void menuCliente(Scanner leer, int indiceCliente){
        int opcion, numeroCuenta, indiceCuenta;
        double cantidadDinero, cantidadRetirar;
        do{
            System.out.println("\t ---MENU---");
            System.out.println("1.- Consultar saldo");
            System.out.println("2.- Ingresar dinero");
            System.out.println("3.- Retirar dinero");
            System.out.println("4.- Ver movimientos");
            System.out.println("5.- Ver cuentas");
            System.out.println("6.- Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();

            switch(opcion){
                case 1: System.out.print("Ingrese el N° de cuenta:");
                        numeroCuenta = leer.nextInt();
                        indiceCuenta = clientes.get(indiceCliente).encontrarCuenta(numeroCuenta);
                        if( indiceCuenta == -1){
                            System.out.println("Cuenta no encontrada");
                        }else{
                            System.out.println("Su saldo es: $"+clientes.get(indiceCliente).consultarSaldo(indiceCuenta));
                        }
                        
                        break;
                
                case 2: System.out.print("Ingrese el N° de cuenta:");
                        numeroCuenta = leer.nextInt();
                        indiceCuenta = clientes.get(indiceCliente).encontrarCuenta(numeroCuenta);
                        if( indiceCuenta == -1){
                            System.out.println("Cuenta no encontrada");
                        }else{
                            System.out.print("Ingrese la cantidad de dinero: ");
                            cantidadDinero = leer.nextInt();
                            if(cantidadDinero>=0){
                                clientes.get(indiceCliente).ingresarDinero(indiceCuenta, cantidadDinero);
                            }else{
                                System.out.println("Valor no valido");
                            }

                            System.out.println("Su nuevo saldo es: "+clientes.get(indiceCliente).consultarSaldo(indiceCuenta));
                        }
                        break;

                case 3: System.out.print("Ingrese el N° de cuenta:");
                        numeroCuenta = leer.nextInt();
                        indiceCuenta = clientes.get(indiceCliente).encontrarCuenta(numeroCuenta);
                        if( indiceCuenta == -1){
                            System.out.println("Cuenta no encontrada");
                        }else{
                            System.out.print("Ingrese la cantidad a retirar: ");
                            cantidadRetirar = leer.nextInt();

                            if(cantidadRetirar>=0 && cantidadRetirar<= clientes.get(indiceCliente).consultarSaldo(indiceCuenta)){
                                clientes.get(indiceCliente).retirarDinero(indiceCuenta, cantidadRetirar);
                            }else{
                                System.out.println("El monto supera el disponible");
                            }
                            System.out.println("Su nuevo saldo es: "+clientes.get(indiceCliente).consultarSaldo(indiceCuenta));
                        }
                        
                        break;
                
                case 4: System.out.print("Ingrese el N° de cuenta:");
                        numeroCuenta = leer.nextInt();
                        indiceCuenta = clientes.get(indiceCliente).encontrarCuenta(numeroCuenta);
                        if( indiceCuenta == -1){
                            System.out.println("Cuenta no encontrada");
                        }else{
                            clientes.get(indiceCuenta).getMovimientosProductos(indiceCuenta);
                        }
                        
                        break;
                
                case 5:clientes.get(indiceCliente).getProductos(); break;

                case 6: break;
                default:System.out.println("Opcion no valida"); break;
                
                

            }
            
        }while(opcion!=6);

    }

    public static void menuEjecutivo(Scanner leer){
        int opcionMenu1,opcionMenu2, numeroCuenta;
        double saldo, bonificacion;
        do{ 
            System.out.println("--Bienvenido Ejecutivo--");
            System.out.println("1.- Crear un Cliente");
            System.out.println("2.- Crear un Ejecutivo");
            System.out.println("3.- Salir");
            System.out.print("Opcion: ");
            opcionMenu1 = leer.nextInt();
            
            switch (opcionMenu1) {
                case 1: 
                        Persona persona = crearClienteYEjecutivo(leer, opcionMenu1);
                        if (persona instanceof Cliente) {
                            Cliente nuevoCliente = (Cliente) persona;
                        
                        do{
                            System.out.println("-- CREAR CUENTA PARA "+nuevoCliente.getNombre()+" --");
                            System.out.println("1.- Cuenta");
                            System.out.println("2.- Cuenta Joven");
                            System.out.println("3.- Salir");
                            System.out.print("Opcion: ");
                            opcionMenu2 = leer.nextInt();

                            switch(opcionMenu2){
                                case 1: 
                                        System.out.println("-- DATOS CUENTA -- ");
                                        System.out.print("Numero de cuenta: ");
                                        numeroCuenta = leer.nextInt();
                                        System.out.print("Saldo: ");
                                        saldo = leer.nextDouble();

                                        Cuenta newCuenta = new Cuenta(nuevoCliente, numeroCuenta, saldo);

                                        nuevoCliente.agregarCuenta(newCuenta);

                                        clientes.add(nuevoCliente);

                                        break;
                                
                                case 2: 
                                        System.out.println("-- DATOS CUENTA JOVEN -- ");
                                        System.out.print("Numero de cuenta: ");
                                        numeroCuenta = leer.nextInt();
                                        System.out.print("Saldo: ");
                                        saldo = leer.nextDouble();
                                        System.out.print("Bonificación: ");
                                        bonificacion = leer.nextDouble();

                                        CuentaJoven newCuentaJoven = new CuentaJoven(nuevoCliente, numeroCuenta, saldo, bonificacion);

                                        nuevoCliente.agregarCuenta(newCuentaJoven);

                                        clientes.add(nuevoCliente);

                                        break;

                                case 3: break;

                                default: System.out.println("Opcion no valida"); break;
                            }

                        }while(opcionMenu2 !=3);

                        }
                        break;

                case 2: 
                        Persona persona1 = crearClienteYEjecutivo(leer, opcionMenu1);
                        if (persona1 instanceof Ejecutivo) {
                            Ejecutivo nuevoEjecutivo = (Ejecutivo) persona1;
                            ejecutivos.add(nuevoEjecutivo);

                        }
                        break;

                case 3: break;

                default: System.out.println("Opcion no valida"); break;
            }

        }while(opcionMenu1!=3);
    }

    public static Persona crearClienteYEjecutivo(Scanner leer, int opcion){
        int dia, mes, year;
        String nombre, rut, password, usuario;
        Fecha fechaDeNacimiento;

        System.out.println("-- DATOS NUEVO CLIENTE -- ");
        leer.nextLine();
        System.out.print("Nombre: ");
        nombre = leer.nextLine();
        do{
            System.out.print("RUT: ");
            rut = leer.nextLine();
            rut = rut.replace(".", "").replace("-", "");

            if(!validarRut(rut)){
                System.out.println("Rut ingresado no valido");
            }
            
        }while(!validarRut(rut));
        System.out.println("- FECHA DE NACIMIENTO -");
        System.out.print("Dia: ");
        dia = leer.nextInt();
        System.out.print("Mes: ");
        mes = leer.nextInt();
        System.out.print("Año: ");
        year = leer.nextInt();
        
        fechaDeNacimiento = new Fecha(dia, mes, year);

        do{ 
            leer.nextLine();
            System.out.print("\nPassword: ");
            password = leer.nextLine();

            if(password.length()!=10){
                System.out.println("El password tiene que tener 10 elementos");
            }
        }while(password.length()!=10);

        if(opcion == 2){
            do{
                System.out.print("\nUsuario: ");
                usuario = leer.nextLine();
    
                if(usuario.length()!=10){
                    System.out.println("El usuario tiene que tener 10 elementos");
                }
            }while(usuario.length()!=10);

            Ejecutivo nuevoEjecutivo = new Ejecutivo(nombre, fechaDeNacimiento, rut, usuario, password);
            Persona persona1 = nuevoEjecutivo;
            return persona1;
        }else{
            Cliente nuevoCliente = new Cliente(nombre, fechaDeNacimiento, rut, password);
            return nuevoCliente;
        }

        
    }



    //METODOS PARA VALIDAR RUT SACADOS DE INTERNET (Instrucciones del problema)

    public static boolean validarRut(String rut) {
        try {
            // Eliminar puntos y guión del RUT
            rut = rut.replace(".", "").replace("-", "");

            // Separar el cuerpo del RUT y el dígito verificador
            String rutCuerpo = rut.substring(0, rut.length() - 1);
            char digitoVerificador = rut.charAt(rut.length() - 1);

            // Calcular el dígito verificador
            int dvCalculado = calcularDigitoVerificador(rutCuerpo);

            // Convertir el dígito verificador en formato correcto (char)
            char dvEsperado = (dvCalculado == 10) ? 'K' : (dvCalculado == 11) ? '0' : (char) (dvCalculado + '0');

            // Comparar el dígito verificador calculado con el proporcionado
            return digitoVerificador == dvEsperado;
        } catch (Exception e) {
            // En caso de cualquier error (formato incorrecto), devolver false
            return false;
        }
    }

    private static int calcularDigitoVerificador(String rutCuerpo) {
        int suma = 0;
        int multiplicador = 2;

        // Iterar sobre los dígitos del RUT desde la derecha hacia la izquierda
        for (int i = rutCuerpo.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(rutCuerpo.charAt(i)) * multiplicador;
            multiplicador++;
            if (multiplicador > 7) {
                multiplicador = 2; // Volver a 2 cuando multiplicador es mayor a 7
            }
        }

        // Calcular el dígito verificador usando la fórmula estándar
        int resto = 11 - (suma % 11);
        return (resto == 11) ? 0 : resto; // Si el resto es 11, el dígito verificador es 0; si es 10, es 'K'
    }
}
