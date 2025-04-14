import java.util.Arrays;

public class StringOperations {
    public static void main(String[] args) {
        String name = "Nagesh";
        System.out.println("before reverse: " + name);
        char[] spelling = name.toCharArray();
        int index = 0;
        for (char c: spelling) {
            index++;
        }
        char[] reversed = new char[index];
        int length = index - 1;
        for (char m: spelling) {
            reversed[length] = m;
            length--;
        }
        String rev = new String(reversed);
        System.out.println("after reverse: " + rev);


        System.out.println("\n----------------");
        String sentence = "Hello my name is nagesh";
        String[] word = sentence.split(" ");
        for (String i: word){
            System.out.print(i + " ");
        }
        System.out.println("\nno of words: " + word.length);

        System.out.println("----------------");
        String target = "my";
        boolean present = false;
        for (String l: word) {
            if (target.equals(l)) {
                present = true;
                break;
            }
        }
        if (present) {
            System.out.println("target word '" + target + "' is present in the sentence '" + sentence +"'");
        }else {
            System.out.println("target is not present");
        }

        System.out.println("----------------");
        int sum = 0;
        String sentences = "With great power comes great responsibility";
        String[] words = sentences.split(" ");
        for(String s: words) {
            char[] letters = s.toCharArray();
            for (char letter: letters) {
                sum += 1;
            }
        }
        System.out.println("number of characters in a sentence: " + sum);

        System.out.println("----------------");
        int lenght = words.length - 1;
        System.out.println("Number of spaces in '" + sentences + "' is: " + lenght);

        System.out.println("----------------");
        String updatedSentence = sentences.replace(" ", " % ");
        System.out.println(updatedSentence);

        System.out.println("----------------");
        String freqSentence = "the cat is on the mat and it is sleeping";
        System.out.println(freqSentence);
        String[] freqWord = freqSentence.split(" ");
        for (String f: freqWord) {
            int frequency = 0;
            for (String w: freqWord) {
                if (f.equals(w)) {
                    frequency += 1;
                }
            }
            System.out.println("frequency of '" + f + "' in the above sentence is: " + frequency);
        }

        System.out.println("----------------");
        char[] freqchar = freqSentence.toCharArray();
        for (char s : freqchar) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
        for (char let : freqchar){
            int freq = 0;
            for (char freqlet : freqchar) {
                if (let == freqlet) {
                    freq += 1;
                }
            }
            System.out.println("frequency of letter '" + let + "' in the above sentence is:" + freq);
        }

        System.out.println("----------------");
        String palindromeString = "racecar";
        System.out.println("before reverse: " + palindromeString);
        char[] pali = palindromeString.toCharArray();
        char[] palindrome = new char[pali.length];
        int len = pali.length - 1;
        for (char p :pali) {
            palindrome[len] = p;
            len -= 1;
        }
        String updatedPalindrome = new String(palindrome);
        System.out.println("after reverse: " + updatedPalindrome);
        if (updatedPalindrome.equals(palindromeString)) {
            System.out.println("given string is a palindrome");
        }else {
            System.out.println("given string is not a palindrome");
        }

    }
}
