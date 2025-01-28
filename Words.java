import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		wordList = new ArrayList<word>();
	}

	public Words(String s)
	{
		wordList = new ArrayList<word>();

		setList(s);
	}

	public void setWords(String s)
	{
		wordList.clear();
		//Create a Scanner for the list of words in the string "s"
		Scanner silly = new Scanner(s);

		//Continue to loop while there are more words to read
			while(silly.hasNext())
			{
				wordList.add(new Word(silly.next()));
			}
			//Add objects of the type Word to our ArrayList "wordList"


	}

	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"
			for(Word theWord: wordList)
				if(word.getLength()==size)
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
			for(int i=wordList.size()-1; i>0; i--)
				if(wordList.get(i).getNumVowels()>-1)
				{
					vowelCount++;
				}
				if(wordList.get(i).getLength()==size)
				{
					wordList.remove(i);
				}
			//if the Word has "size" characters


		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"
			for(Word words: wordList)
				if(words.getNumVowels() == numVowels)
				count++;
			//if the number of vowels in "theWord" is the same as the parameter "numVowels"


		return count;
	}

	public String toString()
	{
	   return "";
	}
}