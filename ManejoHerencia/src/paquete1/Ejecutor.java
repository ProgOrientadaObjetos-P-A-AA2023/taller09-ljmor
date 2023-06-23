package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombreBeneficiario;
        String apellidoBeneficiario;
        String usuarioBeneficiario;
        String nombreGarante;
        String apellidoGarante;
        String usuarioGarante;
        int tiempoPrestamo;
        String ciudadPrestamo;
        String nombreInstitucion;
        String siglasInstitucion;
        String tipoAuto;
        String marcaAuto;
        double valorAuto;
        String nivelEstudio;
        double valorCarrera;

        boolean bandera = true;
        int opcionPrestamo;
        int opcionBandera;
        List<Prestamo> lista = new ArrayList<>();

        while (bandera) {
            System.out.print("\n¡Bienvenido al sistema de prestamos!\n"
                    + "Ingrese 1 para registrar un prestamo de automovil..\n"
                    + "Ingrese 2 para registrar un prestamo educativo..\n"
                    + ">> ");
            opcionPrestamo = ent.nextInt();

            ent.nextLine();
            System.out.print("Ingrese el nombre del beneficiario: ");
            nombreBeneficiario = ent.nextLine();
            System.out.print("Ingrese el apellido del beneficiario: ");
            apellidoBeneficiario = ent.nextLine();
            System.out.print("Ingrese el usuario del beneficiario: ");
            usuarioBeneficiario = ent.nextLine();
            System.out.print("Ingrese los meses del prestamo: ");
            tiempoPrestamo = ent.nextInt();
            ent.nextLine();
            System.out.print("Ingrese la ciudad donde se realizara el"
                    + " prestamo: ");
            ciudadPrestamo = ent.nextLine();

            switch (opcionPrestamo) {
                case 1:
                    System.out.print("Ingrese el tipo de auto: ");
                    tipoAuto = ent.nextLine();
                    System.out.print("Ingrese la marca del auto: ");
                    marcaAuto = ent.nextLine();
                    System.out.print("Ingrese el valor del auto: ");
                    valorAuto = ent.nextDouble();
                    ent.nextLine();
                    System.out.print("Ingrese el nombre del garante: ");
                    nombreGarante = ent.nextLine();
                    System.out.print("Ingrese el apellido del garante: ");
                    apellidoGarante = ent.nextLine();
                    System.out.print("Ingrese el usuario del garante: ");
                    usuarioGarante = ent.nextLine();

                    Persona datosBeneficiario
                            = new Persona(
                                    nombreBeneficiario,
                                    apellidoBeneficiario,
                                    usuarioBeneficiario);
                    Persona datosGarante = new Persona(nombreGarante,
                            apellidoGarante, usuarioGarante);

                    PrestamoAutomovil prestamoAutomovil
                            = new PrestamoAutomovil(tipoAuto,
                                    marcaAuto, datosGarante,
                                    valorAuto, datosBeneficiario,
                                    tiempoPrestamo, ciudadPrestamo);
                    prestamoAutomovil.calcularValorMensual();

                    lista.add(prestamoAutomovil);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del centro educativo: ");
                    nombreInstitucion = ent.nextLine();
                    System.out.print("Ingrese las siglas del centro educativo: ");
                    siglasInstitucion = ent.nextLine();
                    System.out.print("Ingrese el nivel de estudio: ");
                    nivelEstudio = ent.nextLine();
                    System.out.print("Ingrese el valor de la carrera: ");
                    valorCarrera = ent.nextDouble();

                    Persona datosBeneficiario2
                            = new Persona(
                                    nombreBeneficiario,
                                    apellidoBeneficiario,
                                    usuarioBeneficiario);

                    InstitucionEducativa centroEducativo
                            = new InstitucionEducativa(nombreInstitucion,
                                    siglasInstitucion);

                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo(
                            nivelEstudio, centroEducativo,
                            valorCarrera, datosBeneficiario2,
                            tiempoPrestamo, ciudadPrestamo);
                    prestamoEducativo.calcularValorMensual();

                    lista.add(prestamoEducativo);
                    break;
                default:
                    System.out.println("\nError, "
                            + "la opcion seleccionada no existe..\n");
                    break;
            }

            System.out.print("\nSi desea terminar de ingresar registros,"
                    + " pulse 0, de lo contrario pulse cualquier otro numero.."
                    + "\n>> ");
            opcionBandera = ent.nextInt();

            if (opcionBandera == 0) {
                bandera = false;
            }
        }

        for (Prestamo prestamo : lista) {
            System.out.println(prestamo);
        }
    }
}
