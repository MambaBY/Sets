import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class Helper {

    static String [] colorsArray = new String[] {"red", "orange", "yellow", "green", "blue","indigo", "violet"};

    /*
    Method that generates random numbers from 1 to 7
     */
    public static int generateRandomNumber () {
        int min = 0;
        int max = 7; //count of colors in the rainbow
        return (int)(Math.random() * (max - min) + min);
    }

    /*
    Method that prints
     */
    public static void printColorSets (Set<String> colorSetFirst, Set<String> colorSetSecond, Set<String> colorSetThird, Set<String> colorSetFourth) {
        Set [] sets = {colorSetFirst, colorSetSecond, colorSetThird, colorSetFourth};
        Iterator<Set> itr = Arrays.stream(sets).iterator();
        int counter = 1;
        while (itr.hasNext()){
            System.out.printf("Set #%d - ", counter);
            System.out.println(itr.next());
            counter++;
        }
    }

    /*
     * Method for filling set with colors
     */
    public static Set fillSetWithColors(Set<String> colorSet) {
        while (colorSet.size() < 3){
            colorSet.add(colorsArray[generateRandomNumber()]);
        }
        return colorSet;
    }

    /*
     *  Method that compares sets of the colors and relill a set if it repeats
     */

    public static void compareSets (Set<String> colorSetFirst, Set<String> colorSetSecond, Set<String> colorSetThird, Set<String> colorSetFourth) {
        Set [] sets = {colorSetFirst, colorSetSecond, colorSetThird, colorSetFourth};
        for (int i = 0; i < sets.length; i++) {
            for (int j = 1; j < sets.length; j++) {
                if(!sets[i].equals(sets [j]) || j==i){
                    continue;
                }
                if (sets[i].equals(sets[j])){
                    fillSetWithColors(sets[j]);
                    j--;
                }
            }
        }
    }

}
