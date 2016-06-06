package finalproject;

import java.util.Arrays;

public class questions {

	private String[] qs;
	private String[] one;
	private String[] two;
	private String[] three;
	private String[] four;
	
	private int pos;
	
	public questions(){
		pos = 0;
		setOne();
		setTwo();
		setThree();
		setFour();
		setQuestions();
		
	}
	
	public questions(int p){
		pos = p;
		setOne();
		setTwo();
		setThree();
		setFour();
		setQuestions();
	}
	
	public void setQuestions(){
		qs = new String[22];
		qs[0] = "What is the fastest bird on foot?";
		//ostrich sparrow eagle dragon 
		qs[1] = "Which planet is closest to the sun?";
		//Mercury Earth Venus Neptune
		qs[2] = "A heptagon is a shape with how many sides?";
		//7 6 4 9
		qs[3] = "How long is one regular term for a US Representative?";
		//2 6 4 indefinite
		qs[4] = "Which of the following states is NOT on the Gulf of Mexico?";
		//Georgia Texas Alabama Florida
		qs[5] = "What is the lowest prime number?";
		//2 1 0 3
		qs[6] = "What is the largest South American country by area?";
		//Brazil Mexico Peru Chile
		qs[7] = "Which one of the following states is NOT part of the Four Corners?";
		//Nevada Colorado Utah Arizona
		qs[8] = "Who was the first person to step on the moon?";
		//Neil Armstrong  Edwin 'Buzz' Aldrin  Lance Armstrong  Alan Shephard
		qs[9] = "'Carefully' is an example of what type of word?";
		//adverb adjective noun verb
		qs[10] = "In the northern hemisphere, in what month is the autumnal equinox?";
		//September August October April
		qs[11] = "Emma has 2 yard sticks. She also has a 12-inch ruler. \n"
				+ "She laid them end-to-end in a line. How many feet long is the line?";
		//7 feet  3 feet  5 feet  9 feet
		qs[12] = "Inca civilizations were concentrated on what continent?";
		//South America Africa North America Asia
		qs[13] = "What state is the Grand Canyon in?";
		//AZ CA ND NM
		qs[14] = "Who was the first president of the United States?";
		//George Washington  Aaron Burr  John Adams  Thomas Jefferson
		qs[15] = "Which artist was famous for his 'splattered paint' pieces?";
		//Jackson Pollock  Pablo Picasso  Vincent van Gogh  Andy Warhol
		qs[16] = "What is it called when animals move to a warmer area for the winter?";
		//migration habitation hibernation emulation
		qs[17] = "How many feet are in a mile?";
		//5280 1760 6380 11560
		qs[18] = "Who was the first Vice President of the United States?";
		//John Adams  Alexander Hamilton  Thomas Jefferson  John Jay
		qs[19] = "Which figure of speech uses exaggeration for emphasis or effect?";
		//hyperbole metaphor analogy similie
		qs[20] = "Bears are what kinds of animals?";
		//carnivores omnivores herbivores insectivores
		qs[21] = "The official language of the Roman empire was what?";
		//Latin Roman Greek Sanskrit
		
		
	}
	
	public void setOne(){
		one = new String[22];
		one[0] = "ostrich"; //correct
		one[1] = "Earth";
		one[2] = "4";
		one[3] = "indefinite";
		one[4] = "Georgia"; //correct
		one[5] = "1";
		one[6] = "Peru";
		one[7] = "Arizona";
		one[8] = "Neil Armstrong"; //correct
		one[9] = "adjective";
		one[10] = "October";
		one[11] = "5 feet";
		one[12] = "South America"; //correct
		one[13] = "California";
		one[14] = "John Adams";
		one[15] = "Andy Warhol";
		one[16] = "migration"; //correct
		one[17] = "1760";
		one[18] = "Thomas Jefferson";
		one[19] = "similie";
		one[20] = "carnivores"; //correct
		one[21] = "Roman";
	
	}
	
	public void setTwo(){
		two = new String[22];
		two[0] = "sparrow";
		two[1] = "Venus";
		two[2] = "9";
		two[3] = "2"; //correct
		two[4] = "Texas";
		two[5] = "0";
		two[6] = "Chile";
		two[7] = "Nevada"; //correct
		two[8] = "Edwin 'Buzz' Aldrin";
		two[9] = "noun";
		two[10] = "April";
		two[11] = "7 feet"; //correct
		two[12] = "Africa";
		two[13] = "North Dakota";
		two[14] = "Thomas Jefferson";
		two[15] = "Jackson Pollock"; //correct
		two[16] = "habitation";
		two[17] = "6380";
		two[18] = "John Jay";
		two[19] = "hyperbole"; //correct
		two[20] = "omnivores";
		two[21] = "Greek";
	}
	
	public void setThree(){
		three = new String[22];
		three[0] = "eagle";
		three[1] = "Neptune";
		three[2] = "7"; //correct
		three[3] = "6";
		three[4] = "Alabama";
		three[5] = "3";
		three[6] = "Brazil"; //correct
		three[7] = "Colorado";
		three[8] = "Lance Armstrong";
		three[9] = "verb";
		three[10] = "September"; //correct
		three[11] = "3 feet";
		three[12] = "North America";
		three[13] = "New Mexico";
		three[14] = "George Washington"; //correct
		three[15] = "Pablo Picasso";
		three[16] = "hibernation";
		three[17] = "11560";
		three[18] = "John Adams"; //correct
		three[19] = "metaphor";
		three[20] = "herbivores";
		three[21] = "Sanskrit";
		
	}
	
	public void setFour(){
		four = new String[22];
		four[0] = "dragon";
		four[1] = "Mercury"; //correct
		four[2] = "6";
		four[3] = "4";
		four[4] = "Florida";
		four[5] = "2"; //correct
		four[6] = "Mexico";
		four[7] = "Utah";
		four[8] = "Alan Shephard";
		four[9] = "adverb"; //correct
		four[10] = "August";
		four[11] = "5 feet";
		four[12] = "Asia";
		four[13] = "Arizona"; //correct
		four[14] = "Aaron Burr";
		four[15] = "Vincent van Gogh";
		four[16] = "emulation";
		four[17] = "5280"; //correct
		four[18] = "Alexander Hamilton";
		four[19] = "analogy";
		four[20] = "insectivores";
		four[21] = "Latin"; //correct
		
	}
	
	public String getQuestion(){
		
		return qs[pos];
	}
	
	public int getPosition(){
		return pos;
	}
	
	public String getAnswerOne(){
		return one[pos];
	}
	
	public String getAnswerTwo(){
		return two[pos];
	}
	
	public String getAnswerThree(){
		return three[pos];
	}
	
	public String getAnswerFour(){
		return four[pos];
	}
	
	public String[] getArray(){
		
		return qs;
	}
	
	
}
