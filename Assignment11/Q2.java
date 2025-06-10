import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();        
        scanner.close();        
        findVowelWords(sentence);
    }
    public static void findVowelWords(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        System.out.println("Words starting with a vowel:");
        for (String word : words) {
            char firstChar = Character.toLowerCase(word.charAt(0)); // Convert first character to lowercase
            if (isVowel(firstChar)) {
                System.out.println(word);
            }
        }
    }
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1; // Check if the character is a vowel
    }
}
