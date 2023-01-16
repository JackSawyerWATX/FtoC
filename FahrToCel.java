import java.util.*;

class FahrToCel {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner (System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        temperature = in.nextInt();

        temperature =((temperature - 32) * 5) / 9;

        System.out.print("Temperature in Celsius is: " + temperature);
    }
}