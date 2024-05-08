import java.text.DecimalFormat;

public class ConvertCurrency {
    public String changeCurrency(int optionSelected, Double actualCurrency, Currency currency) {
        String newCurrency;
        Double value;
        Double result;
        Double roundedResult;
        switch (optionSelected) {
            case 1:
            case 2:
                newCurrency = "ARS";
                break;
            case 3:
            case 4:
                newCurrency = "MXN";
                break;
            case 5:
            case 6:
                newCurrency = "COP";
                break;
            default:
                newCurrency = "Numero invalido";
                break;
        }
        if (newCurrency.equalsIgnoreCase("Numero invalido")) {
            throw new IllegalArgumentException("Número de moneda inválido");
        }
        value = currency.conversion_rates().get(newCurrency);
        if (optionSelected == 1 || optionSelected == 3 || optionSelected == 5) {
            result = actualCurrency * value;
        } else {
            result = actualCurrency / value;
            newCurrency = "USD";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        roundedResult = Double.parseDouble(decimalFormat.format(result));
        return roundedResult + " " + newCurrency;
    }
}
