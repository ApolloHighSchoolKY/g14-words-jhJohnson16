import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		list = new ArrayList<wordlist>();
	}

	public Words(String s)
	{
		list = new ArrayList<wordlist>();

		setList(s);
	}

	public void setWords(String s)
	{
		list.clear();
		//Create a Scanner for the list of words in the string "s"
		Scanner silly = new Scanner(s);

		//Continue to loop while there are more words to read
			while(silly.hasNext())
			{
				list.add(new wordList(silly.nextInt()));
			}
			//Add objects of the type Word to our ArrayList "wordList"


	}

	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"
			for(wordList Word: list)
				if(word.length==size)
				count++;



			//if the length of the "theWord" is the same as the parameter "size"

		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;

		//for each Word in the ArrayList "words" loop
			for(wordList word: list)
				if(word.size==Char)
				vowelCount++;
			//if the Word has "size" characters


		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"
			for(wordList word: list)
				if(theWord.getLength() == size)
				count++;
			//if the number of vowels in "theWord" is the same as the parameter "numVowels"


		return count;
	}

	public String toString()
	{
	   return "";
	}
}