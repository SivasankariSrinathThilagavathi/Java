import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter a sentence containing 'cat' and 'dog': ");
        String sentence = scanner.nextLine();         
        System.out.print("Enter a name for 'cat': ");
        String catName = scanner.nextLine();        
        System.out.print("Enter a name for 'dog': ");
        String dogName = scanner.nextLine();        
        scanner.close();                
        String modifiedSentence = sentence.replaceAll("(?i)\\bcat\\b", catName)
                                          .replaceAll("(?i)\\bdog\\b", dogName);        
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
