package com.sangita.wordprocessor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountWords {
	public static void main(String[] args) {

		
		
		if(args.length!=1) {
			System.out.println("Error: Please provide exactly one file path as argument.");
			System.exit(1);
		}
		
		String Filepath=args[0];
		
		try {
			List<String> words=countNumberofWordsfromFile(Filepath);
			long wordcount=countNumberwordsStartWithM(words);
			List<String> longwords=printWordslongerThan(words,BusinessRulesConfig.MIN_WORD_LENGTH);
			
			System.out.println("Number of words start with M or m :" +wordcount);
			System.out.println("Words longer than 5 Characters :");
			longwords.forEach(System.out::println);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
	        System.err.println("File not found " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
	        System.err.println("Error reading file: " + e.getMessage());
		}
		
		
		
	}

	public static List<String> printWordslongerThan(List<String> words, int i) {
		// TODO Auto-generated method stub
		List<String> longwords=new ArrayList<String>();
		for(String word :words) {
			if(word.length()>i) {
				longwords.add(word);
			}
		}
		
		
		return longwords;
	}

	public static long countNumberwordsStartWithM(List<String> words) {
		// TODO Auto-generated method stub
		
		return words.stream()
				.filter(word->word.toLowerCase().startsWith(BusinessRulesConfig.STARTING_LETTER)).count();
	}

	public static List<String> countNumberofWordsfromFile(String filepath) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		List<String> words=new ArrayList<>();
		try(BufferedReader br=new BufferedReader(new FileReader(filepath))){
			String line;
			while((line=br.readLine())!=null) {
			String[] spilt=line.split("\\W+");
			for(String word: spilt) {
				if(!word.isEmpty()) {
					words.add(word);
				}
			}
			
			
		}
		return words;
	}
	}
	}


