import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ConsultCurrency consult = new ConsultCurrency();
            ConvertCurrency convert = new ConvertCurrency();
            Currency currency = consult.getCurrency();
            Scanner monitor = new Scanner(System.in);
            int optionSelected= 0;
            Double actualCurrency;
            while (optionSelected != 7){
                System.out.println("*******************************************");
                System.out.println("Bienvenido al Conversor de Moneda");
                System.out.println("1) Dolar =>> Peso Argentino");
                System.out.println("2) Peso Argentino =>> Dolar");
                System.out.println("3) Dolar =>> Peso Mexicano");
                System.out.println("4) Peso Mexicano =>> Dolar");
                System.out.println("5) Dolar =>> Peso Colombiano");
                System.out.println("6) Peso Colombiano =>> Dolar");
                System.out.println("7) Salir");
                System.out.println("Elije una opcion valida:");
                System.out.println("*******************************************");
                optionSelected= Integer.valueOf(monitor.nextLine());
                if(optionSelected != 7){
                    System.out.println("Ingresa el valor que desea convertir:");
                    actualCurrency= Double.valueOf(monitor.nextLine());
                    String result = convert.changeCurrency(optionSelected, actualCurrency, currency);
                    System.out.println(result);
                }
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizo la aplicacion.");
        }
    }
}
