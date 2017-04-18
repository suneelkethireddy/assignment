package Answers;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountTheOccuranceOfWord {

	public static void main(String args[]) throws FileNotFoundException {
		occuranceofword();
	}

	public static void occuranceofword() throws FileNotFoundException {

		InputStream in = new FileInputStream(new File("Sentence.txt"));   // Read the content from a  file
		Scanner scan = new Scanner(in);
		Map<String, Integer> count = new HashMap<String, Integer>();

		while (scan.hasNext()) {
			String word = scan.next().toLowerCase();
			word = word.replaceAll("[^a-zA-Z0-9]", "");
			if (!count.containsKey(word))
				count.put(word, 1);        									
			else
				count.put(word, count.get(word) + 1);
		}
		for (Entry<String, Integer> entry : count.entrySet()) {
			System.out.println(entry.getValue() + "	 :	" + entry.getKey());
		}

	}
}
//Time complexity of hashmap is 0(n)
//Space complexity is 0(n)
