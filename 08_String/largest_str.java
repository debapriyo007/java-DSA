public class largest_str {
    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango" };

        String largestFruit = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largestFruit.compareTo(fruits[i]) < 0) {
                largestFruit = fruits[i];
            }
        }
        System.out.println(largestFruit);
    }

}
