package com.yogeshjava.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainForMaps {
	
	public static void main(String[] args) {
		
		Map<String, String> movie=new HashMap<String, String>();
		movie.put("moviename", "Shawshank Redemption");
		movie.put("director", "Frank Darabont");
		movie.put("supporting actor", "Morgan Freeman");
		movie.put("lead actor", "Tim Robbins");
		movie.put("rating", "4.8");
		movie.put("moviename", "Mystic River");
		
		List<Map<String,String>> allTheMoviesIHaveSeenThisYear=new ArrayList();
		Set<List<Map<String, String>>> moviesThatIHaveSeenInMyLifeTime;
		Map<String, List<Account>> bankAccounts;
		
		// System.out.println(movie.get("moviename"));
		
	}

}
