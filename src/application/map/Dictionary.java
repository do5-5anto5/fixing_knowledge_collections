package application.map;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

	Map<String, String> dictionary;

	public Dictionary() {
		dictionary = new TreeMap<>();
	}

	public void addWord(String word, String meaning) {
		dictionary.put(word, meaning);
	}

	public void removeWord(String word) {
		if (!dictionary.isEmpty()) {
			dictionary.remove(word);
		} else {
			System.out.println("Empty dictionary.");
		}
	}

	public void showAllWords() {
		if (!dictionary.isEmpty()) {
			System.out.println("\nAll words:\n");
			for (String key : dictionary.keySet()) {
				System.out.println(key + dictionary.get(key));
			}
		} else {
			System.out.println("Empty dictionary.");
		}
	}

	public void searchWord(String word) {
		if (!dictionary.isEmpty()) {
			System.out.println(word + " meaning: " + dictionary.get(word)); 
		}
		else {
			System.out.println("Empty dictionary.");
		}
	}
	
	public static void main (String[] args) {
		
		Dictionary dictionary = new Dictionary();
		
		dictionary.addWord("Abacaxi", " a tropical fruit with a thick skin and yellow and sour pulp.");
		dictionary.addWord("Bicicleta", " a vehicle with two wheels powered by pedals.");
		dictionary.addWord("Cachorro", " a mammal, quadruped and domestic animal, from the family of canids.");
		dictionary.addWord("Dado", " a cubic object that has on each face a number of dots from 1 to 6, used in games of chance or luck.");
		dictionary.addWord("Estrela", " a luminous star that shines in the sky at night.");
		dictionary.addWord("Fada", " a mythical creature that has magical powers and wings.");
		dictionary.addWord("Gato", " a mammal, quadruped and domestic animal, from the family of felids.");
		dictionary.addWord("Hotel", " a commercial establishment that offers accommodation, food and other services to guests.");
		dictionary.addWord("Ilha", " a portion of land surrounded by water on all sides.");
		dictionary.addWord("Jardim", " an outdoor space where ornamental plants, flowers and trees are grown.");
		
		dictionary.showAllWords();
		
		dictionary.removeWord("Ilha");
		dictionary.showAllWords();
		
	}
}
