// Assignment 69 WAP on String functions using equals and equalsIgnoreCase
package string01;

public class WordCounter {

	public static void main(String[] args) {
		//count "Orange" or "orange" present in given sentence.
		String sentence = "Orange leaves crunched beneath my feet as I walked through "
				+ "the autumn "
				+ "forest. The sky was painted in hues of pink and orange, "
				+ "signaling the end of the day. An old wooden cart, filled with "
				+ "ripe orange pumpkins, stood near the farmer’s market. "
				+ "Orange flowers swayed gently in the cool evening breeze, "
				+ "filling the air with their sweet fragrance. The cat stretched "
				+ "lazily on the porch, its fur glowing under the soft orange light of "
				+ "the lanterns.";
		int count1 = 0;
		String word[] = sentence.split(" ");
		for(int i = 0;i<word.length;i++) {
			if(word[i].equalsIgnoreCase("Orange"))
				count1++;
		}
		System.out.println("Occurences of 'Orange' or 'orange': "+count1);
		count1 = 0;
		for(int j = 0;j<word.length;j++) {
			if(word[j].equals("Orange"))
				count1++;
		}
		System.out.println("Occurences of 'Orange': "+count1);


	}

}
