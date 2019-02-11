import java.util.Scanner;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue+valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
       StringBuilder sb = new StringBuilder();
       for(int i=valueToBeReversed.length()-1;i>=0;i--)
       {sb.append(valueToBeReversed.charAt(i));
        }
        return sb.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        /*int position;
        int length;
        if(word.length()%2==0)
        {position=word.length()/2-1;
            length = 2;
        }
        else {position=word.length()/2;
            length = 1;
        }
        String s = word.substring(position, position+length);
        char c=s.charAt(0);*/
        int len = word.length();
        int c;
        if (len % 2 == 0)
           c = len / 2-1;
        else
            c = len / 2;
            
         return word.charAt(c);
        
       
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char c[] = value.toCharArray();
        String s=Character.toString(charToRemove);
        value = value.replace(s, ""); 
        return value;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        return lastWord;
    }
}
