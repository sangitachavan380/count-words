package com.sangita.wordprocessor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CountWordsTest {
	 
		@Test
		public void testCountWordsStartWithM() {
			
			List<String> words=Arrays.asList("Mango","of","Apple","May");
			long countwords=CountWords.countNumberwordsStartWithM(words);
			assertEquals(2, countwords);
			
			
		}
		
		@Test
		public void testWordsLongerThan() {
			
			List<String> words=Arrays.asList("Magical","of","Morning","Sundays");
			List<String> longwords=CountWords.printWordslongerThan(words,5);
			assertEquals(List.of("Magical","Morning","Sundays"), longwords);
			
			
		}
		
		@Test
		public void testEmptyFile() {
			
			List<String> words=Arrays.asList();
			List<String> longwords=CountWords.printWordslongerThan(words,5);
			long countwords=CountWords.countNumberwordsStartWithM(words);
			assertEquals(0, countwords);

			assertTrue(longwords.isEmpty());
			
			
		}
}
