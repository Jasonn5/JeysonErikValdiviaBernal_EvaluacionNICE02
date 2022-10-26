import java.util.*;
class SpinWords {
    public static void main(String[] args) {        
        System.out.println("Escribe tu frase u oración:"); 
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String words[] = sentence.split(" ");
        String newSentence = "";
        for(String word : words){
            if(word.length()>=5){
                newSentence = newSentence + " "+spinWord(word);
            }else{
                newSentence = newSentence + " " + word;
            }
        }
        System.out.println(newSentence);
    }
    
    static String spinWord(String word){
        String newWord = "";
        for(int i = word.length()-1; i>=0; i--){
            newWord = newWord + word.charAt(i);
        }
        return newWord;
    }
}