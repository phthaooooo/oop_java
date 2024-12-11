import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XuLyVanBan {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder paragraph = new StringBuilder();
        while (sc.hasNextLine()){
            String line = sc.nextLine().trim().toLowerCase();
            if(line.isEmpty()) break;
            paragraph.append(line);
        }
        String[] sentences = paragraph.toString().split("[.?!]");
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].trim();
            sentence = sentence.replaceAll("\\s+", " ");
            char firstChar = Character.toUpperCase(sentence.charAt(0));
            System.out.println(firstChar + sentence.substring(1));
        }
    }
}
