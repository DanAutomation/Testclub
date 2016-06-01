package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intermediate_6 {
		public static void main(String[] args)  throws IOException{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String a = reader.readLine();
				      String words[] = a.split("[^a-zA-Z]");
				      int i, len = words.length;
				      int max = -1, maxLength = -1;
				      for (i = 0; i < len; i++)
				         if (!"".equals(words[i]) && words[i].length() > maxLength) {
				            max = i;
				            maxLength = words[i].length();
				         }
				         System.out.println(words[max]);
				   }
				}