import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionPrincipal = 0;

        while (opcionPrincipal != 4) {
            System.out.println("1. Conversor de monedas");
            System.out.println("2. Conversor de longitud");
            System.out.println("3. Conversor de temperatura");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    int opcionMonedas = 0;

                    while (opcionMonedas != 3) {
                        System.out.println("1. De pesos mexicanos a otras monedas");
                        System.out.println("2. De otras monedas a pesos mexicanos");
                        System.out.println("3. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcionMonedas = scanner.nextInt();

                        switch (opcionMonedas) {
                            case 1:
                                int opcionPesosAMonedas = 0;

                                while (opcionPesosAMonedas != 6) {
                                    System.out.println("1. Convertir de pesos mexicanos a Dólar");
                                    System.out.println("2. Convertir de pesos mexicanos a Euros");
                                    System.out.println("3. Convertir de pesos mexicanos a Libras Esterlinas");
                                    System.out.println("4. Convertir de pesos mexicanos a Yen Japonés");
                                    System.out.println("5. Convertir de pesos mexicanos a Won sul-coreano");
                                    System.out.println("6. Salir");
                                    System.out.print("Seleccione una opción: ");
                                    opcionPesosAMonedas = scanner.nextInt();

                                    if (opcionPesosAMonedas >= 1 && opcionPesosAMonedas <= 5) {
                                        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
                                        double cantidad = scanner.nextDouble();
                                        double resultado = 0.0;

                                        switch (opcionPesosAMonedas) {
                                            case 1:
                                                resultado = cantidad / 20.0; // Tipo de cambio: 1 USD = 20 MXN
                                                System.out.println("El resultado es: " + resultado + " dólares");
                                                break;
                                            case 2:
                                                resultado = cantidad / 24.0; // Tipo de cambio: 1 EUR = 24 MXN
                                                System.out.println("El resultado es: " + resultado + " euros");
                                                break;
                                            case 3:
                                                resultado = cantidad / 28.0; // Tipo de cambio: 1 GBP = 28 MXN
                                                System.out.println("El resultado es: " + resultado + " libras esterlinas");
                                                break;
                                            case 4:
                                                resultado = cantidad / 0.18; // Tipo de cambio: 1 JPY = 0.18 MXN
                                                System.out.println("El resultado es: " + resultado + " yen japonés");
                                                break;
                                            case 5:
                                                resultado = cantidad / 0.017; // Tipo de cambio: 1 KRW = 0.017 MXN
                                                System.out.println("El resultado es: " + resultado + " won sul-coreano");
                                                break;
                                        }

                                        System.out.println();
                                        System.out.println("1. Otra cantidad");
                                        System.out.println("2. Salir");
                                        System.out.print("Seleccione una opción: ");
                                        int opcion = scanner.nextInt();

                                        if (opcion == 2) {
                                            opcionPesosAMonedas = 6; // Salir del submenú
                                        }
                                    } else if (opcionPesosAMonedas != 6) {
                                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                    }
                                }

                                break;
                            case 2:
                                int opcionMonedasAPesos = 0;

                                while (opcionMonedasAPesos != 6) {
                                    System.out.println("1. Convertir de Dólar a pesos mexicanos");
                                    System.out.println("2. Convertir de Euros a pesos mexicanos");
                                    System.out.println("3. Convertir de Libras Esterlinas a pesos mexicanos");
                                    System.out.println("4. Convertir de Yen Japonés a pesos mexicanos");
                                    System.out.println("5. Convertir de Won sul-coreano a pesos mexicanos");
                                    System.out.println("6. Salir");
                                    System.out.print("Seleccione una opción: ");
                                    opcionMonedasAPesos = scanner.nextInt();

                                    if (opcionMonedasAPesos >= 1 && opcionMonedasAPesos <= 5) {
                                        System.out.print("Ingrese la cantidad a convertir: ");
                                        double cantidad = scanner.nextDouble();
                                        double resultado = 0.0;

                                        switch (opcionMonedasAPesos) {
                                            case 1:
                                                resultado = cantidad * 20.0; // Tipo de cambio: 1 USD = 20 MXN
                                                System.out.println("El resultado es: " + resultado + " pesos mexicanos");
                                                break;
                                            case 2:
                                                resultado = cantidad * 24.0; // Tipo de cambio: 1 EUR = 24 MXN
                                                System.out.println("El resultado es: " + resultado + " pesos mexicanos");
                                                break;
                                            case 3:
                                                resultado = cantidad * 28.0; // Tipo de cambio: 1 GBP = 28 MXN
                                                System.out.println("El resultado es: " + resultado + " pesos mexicanos");
                                                break;
                                            case 4:
                                                resultado = cantidad * 0.18; // Tipo de cambio: 1 JPY = 0.18 MXN
                                                System.out.println("El resultado es: " + resultado + " pesos mexicanos");
                                                break;
                                            case 5:
                                                resultado = cantidad * 0.017; // Tipo de cambio: 1 KRW = 0.017 MXN
                                                System.out.println("El resultado es: " + resultado + " pesos mexicanos");
                                                break;
                                        }

                                        System.out.println();
                                        System.out.println("1. Otra cantidad");
                                        System.out.println("2. Salir");
                                        System.out.print("Seleccione una opción: ");
                                        int opcion = scanner.nextInt();

                                        if (opcion == 2) {
                                            opcionMonedasAPesos = 6; // Salir del submenú
                                        }
                                    } else if (opcionMonedasAPesos != 6) {
                                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                    }
                                }

                                break;
                            case 3:
                                System.out.println("Regresando al menú principal...");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                    }

                    break;
                case 2:
                    int opcionLongitud = 0;

                    while (opcionLongitud != 3) {
                        System.out.println("1. De metros a pulgadas");
                        System.out.println("2. De pulgadas a metros");
                        System.out.println("3. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcionLongitud = scanner.nextInt();

                        switch (opcionLongitud) {
                            case 1:
                                System.out.print("Ingrese la cantidad en metros: ");
                                double metros = scanner.nextDouble();
                                double pulgadas = metros * 39.37; // 1 pulgada = 0.0254 metros
                                System.out.println("El resultado es: " + pulgadas + " pulgadas");
                                System.out.println();
                                break;
                            case 2:
                                System.out.print("Ingrese la cantidad en pulgadas: ");
                                double pulgadas2 = scanner.nextDouble();
                                double metros2 = pulgadas2 / 39.37; // 1 pulgada = 0.0254 metros
                                System.out.println("El resultado es: " + metros2 + " metros");
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("Regresando al menú principal...");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }

                        System.out.println();
                        System.out.println("1. Otra cantidad");
                        System.out.println("2. Salir");
                        System.out.print("Seleccione una opción: ");
                        int opcion = scanner.nextInt();

                        if (opcion == 2) {
                            opcionLongitud = 3; // Salir del submenú
                        }
                    }

                    break;
                case 3:
                    int opcionTemperatura = 0;

                    while (opcionTemperatura != 3) {
                        System.out.println("1. De Celsius a Fahrenheit");
                        System.out.println("2. De Fahrenheit a Celsius");
                        System.out.println("3. Salir");
                        System.out.print("Seleccione una opción: ");
                        opcionTemperatura = scanner.nextInt();

                        switch (opcionTemperatura) {
                            case 1:
                                System.out.print("Ingrese la temperatura en grados Celsius: ");
                                double celsius = scanner.nextDouble();
                                double fahrenheit = (celsius * 9 / 5) + 32;
                                System.out.println("El resultado es: " + fahrenheit + " grados Fahrenheit");
                                System.out.println();
                                break;
                            case 2:
                                System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                                double fahrenheit2 = scanner.nextDouble();
                                double celsius2 = (fahrenheit2 - 32) * 5 / 9;
                                System.out.println("El resultado es: " + celsius2 + " grados Celsius");
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("Regresando al menú principal...");
                                System.out.println();
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }

                        System.out.println();
                        System.out.println("1. Otra cantidad");
                        System.out.println("2. Salir");
                        System.out.print("Seleccione una opción: ");
                        int opcion = scanner.nextInt();

                        if (opcion == 2) {
                            opcionTemperatura = 3; // Salir del submenú
                        }
                    }

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
