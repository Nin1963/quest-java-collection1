import java.util.*;
import java.util.ArrayList;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList <Hero> heroes = new ArrayList<>();
    	
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
    	Hero widow = new Hero("Black Widow", 34);
    	Hero america = new Hero("Captain America", 100);
    	Hero vision = new Hero("Vision", 3);
    	Hero ironMan = new Hero("Iron Man", 48);
    	Hero witch = new Hero("Scarlet Witch", 29);
    	Hero thor = new Hero("Thor", 1500);
    	Hero spiderMan = new Hero("Spider-Man", 18);
    	Hero hulk = new Hero("Hulk", 49);
    	Hero strange = new Hero("Doctor Strange", 42);

    	
    	
    	heroes.add(widow);
    	heroes.add(america);
    	heroes.add(vision);
    	heroes.add(ironMan);
    	heroes.add(witch);
    	heroes.add(thor);
    	heroes.add(spiderMan);
    	heroes.add(hulk);
    	heroes.add(strange);
    	

        // TODO 3 : It's Thor birthday, now he's 1501
    	Hero Thor = new Hero("Thor", 1501); 
    	heroes.set(5,  thor);

        // TODO 4 : Shuffle the heroes list 
    	Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
    	heroes.subList(0, 3);
    	
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
   
    		
    	List <Hero> heroes2 = heroes.subList(0, 4); 
    		for(Hero hero : heroes2) {
    			System.out.println(hero.getName());
    		}
       
         
    	
    }	
}