import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt, ch;
        var sel = new Scanner(System.in);
        String ticker1 = "";
        String ticker2 = "";
        double valor = 0;
        boolean exit = false;
        Moneda currency;

        GetMoneda exchange = new GetMoneda();

        System.out.println("Currency Exchange Challenge");
        System.out.println("Calculador de tipo de cambio - Challenge Alura\nSeleccione la opcion deseada");

        while(!exit){
            System.out.println("""
                1) Calcular USD a MXN
                2) Calcular MXN a USD
                3) Calcular USD a BRL
                4) Calcular BRL a USD
                5) Calcular USD a COP
                6) Calcular COP a USD
                7) Salir
                Elija una opción válida:
                """);
            try{
                opt = sel.nextInt();
                switch (opt) {

                    case 1:
                        System.out.print("\nIngresa la cantidad USD a convertir a MXN: ");
                        ticker1 = "USD";
                        ticker2 = "MXN";
                        valor = sel.nextDouble();
                        System.out.println();
                        currency = exchange.cambiarMoneda(ticker1, ticker2, valor);
                        StringConcat(valor, currency.cambioDeMoneda(), ticker1, ticker2);
                        ch = System.in.read();
                        // do something with the character (e.g., ignore it)
                        break;
                    case 2:
                        System.out.print("\nIngresa la cantidad MXN a convertir a USD: ");
                        ticker1 = "MXN";
                        ticker2 = "USD";
                        valor = sel.nextDouble();
                        System.out.println();
                        currency = exchange.cambiarMoneda(ticker1, ticker2, valor);
                        StringConcat(valor, currency.cambioDeMoneda(), ticker1, ticker2);
                        ch = System.in.read();
                        break;
                    case 3:
                        System.out.print("\nIngresa la cantidad USD a convertir a BRL: ");
                        ticker1 = "USD";
                        ticker2 = "BRL";
                        valor = sel.nextDouble();
                        System.out.println();
                        currency = exchange.cambiarMoneda(ticker1, ticker2, valor);
                        StringConcat(valor, currency.cambioDeMoneda(), ticker1, ticker2);
                        ch = System.in.read();
                        break;
                    case 4:
                        System.out.print("\nIngresa la cantidad BRL a convertir a USD: ");
                        ticker1 = "BRL";
                        ticker2 = "USD";
                        valor = sel.nextDouble();
                        System.out.println();
                        currency = exchange.cambiarMoneda(ticker1, ticker2, valor);
                        StringConcat(valor, currency.cambioDeMoneda(), ticker1, ticker2);
                        ch = System.in.read();
                        break;
                    case 5:
                        System.out.print("\nIngresa la cantidad USD a convertir a COP: ");
                        ticker1 = "USD";
                        ticker2 = "COP";
                        valor = sel.nextDouble();
                        System.out.println();
                        currency = exchange.cambiarMoneda(ticker1, ticker2, valor);
                        StringConcat(valor, currency.cambioDeMoneda(), ticker1, ticker2);
                        ch = System.in.read();
                        break;
                    case 6:
                        System.out.print("\nIngresa la cantidad COP a convertir a USD: ");
                        ticker1 = "COP";
                        ticker2 = "USD";
                        valor = sel.nextDouble();
                        System.out.println();
                        currency = exchange.cambiarMoneda(ticker1, ticker2, valor);
                        StringConcat(valor, currency.cambioDeMoneda(), ticker1, ticker2);
                        ch = System.in.read();
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Hasta la vista Baby!");
                        ch = System.in.read();
                        break;
                    default:
                        System.out.println("Opcion no valida!\b\b\b");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Debe ingresar el numero de la opcion deseada\b\n");
                sel.next();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static void StringConcat(double valor , String cadena, String ticker1, String ticker2){

        System.out.println("Sus "+valor+" "+cadena+" \n\b\b");
    }
}
