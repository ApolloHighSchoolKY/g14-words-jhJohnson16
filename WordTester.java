public class WordTester
{

    public static void main (string[] args)
    {
        Word word = new word("word");

        System.out.println(word);
        System.out.println("num of vowels = " + word.getNumVowels());
        System.out.println("Length = " + word.getLength());

        word.setWord("newWord");

        
    }



}