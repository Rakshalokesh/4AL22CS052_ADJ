//1. Write a java program for getting different colors through ArrayList interface and search whether
//the color "Red" is available or not


package github1;
import java.util.ArrayList;
import java.util.List;

public class pg1b1 {
	
	    public static void main(String[] args) {
	      
	        List<String> colors = new ArrayList<>();

	        // Adding colors to the list
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Purple");

	        // Display the list of colors
	        System.out.println("Colors in the list: " + colors);

	       
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }

}
