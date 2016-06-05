package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intermediate_6 {
		public static void main(String[] args)  throws IOException{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String a = reader.readLine();
				      String words[] = a.split("[^a-zA-Z]"); // input in array words split chars symbols from a (a-z, A-Z)
				      int i, len = words.length; // var len - length, i - iteration
				      int max = 0, maxLength = 0; //maxLength - max length of words, max - maximum of letters in word
				      for (i = 0; i < len; i++) // run iteration
				         if (!"".equals(words[i]) && words[i].length() > maxLength) { // is find max word?
				            max = i; // found
				            maxLength = words[i].length(); // identify word
				         }
				         System.out.println(words[max]); // maximum word
				   }
				}