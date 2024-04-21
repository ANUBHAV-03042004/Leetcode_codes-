/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class triangle
{
	public static void main(String[] args) {
	ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

triangle.add(new ArrayList<>(Arrays.asList(2)));
triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));

		 
	    for(int i = 1; i < triangle.size(); i++) {
            triangle.get(i).set(0, triangle.get(i).get(0) + triangle.get(i-1).get(0));
            for(int j = 1; j < i; j++) {
                int minPath = Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
                triangle.get(i).set(j, triangle.get(i).get(j) + minPath);
            }
            triangle.get(i).set(i, triangle.get(i).get(i) + triangle.get(i-1).get(i-1));
        }
       System.out.print(Collections.min(triangle.get(triangle.size()-1)));
	}
}
