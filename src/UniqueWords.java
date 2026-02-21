/* Project: Lab3 - CUS1156_Lab2
* Class: UniqueWords.java
* Author: Alisen Lam
* Date: February 21, 2026
* This program uses the method countUnique to count the number 
* of distinct elements in an ArrayList<String>.
*/
import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)
      {		
    	 String current = list.get(i);
    	 boolean unique = true;
    	 
    	 for (int j = 0; j < list.size(); j++)
		 {
    		 if(i!=j && list.get(j).equals(current)) { //Check i!=j so you do not compare the same index
    			 unique = false; 
    			 break;
    		 }
		 }
    	 
    	 if(unique) 
    		 count++;
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
