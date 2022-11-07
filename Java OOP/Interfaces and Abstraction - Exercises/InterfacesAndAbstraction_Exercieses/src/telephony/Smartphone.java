package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : urls){
            if (validateUrl(url)){
                sb.append(String.format("Browsing: %s!%n", url));
            } else {
                sb.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String number : numbers){
            if (validatePhoneNumber(number)){
                sb.append(String.format("Calling... %s%n", number));
            } else {
                sb.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return sb.toString().trim();
    }

    private boolean validateUrl(String url) {
        for (char ch : url.toCharArray()){
            if (Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        for (char ch : phoneNumber.toCharArray()){
            if (!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
