import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (i > 0 && map.get(c) > map.get(s.charAt(i - 1))) {
                result += map.get(c) - 2 * map.get(s.charAt(i - 1));
            } else {
                result += map.get(c);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumber = "MCMXCIV";
        int result = romanToInt(romanNumber);

        System.out.println("The Roman Number is: " + romanNumber);
        System.out.println("Its Integer Value is: " + result);

        System.out.println();

        romanNumber = "DCCXCIX";
        result = romanToInt(romanNumber);

        System.out.println("The Roman Number is: " + romanNumber);
        System.out.println("Its Integer Value is: " + result);

    }
}

