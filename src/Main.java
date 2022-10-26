public class Main {

    public static void main(String[] args) {
        System.out.println(temperature(29, -40));
        System.out.println(temperature(43,-20));
        System.out.println(temperature(14,4));
        System.out.println(temperature(9,32));
        System.out.println(temperature(20,18));

    }

    public static String temperature(int age, int temperate) {
        if (age >= 20 && age <= 45 && temperate >= -20 && temperate <= 30) {
            return ("Можно идти гулять");
        } else if (age < 20 && temperate >= 0 && temperate <= 28) {
            return ("Можно идти гулять");
        } else if (age > 45 && temperate >= -10 && temperate <= 25) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }
}