import java.util.Set;
import java.util.TreeSet;

public class ColorSetsUnique {
    Set<String> colorSetFirst = new TreeSet<>();
    Set<String> colorSetSecond = new TreeSet<>();
    Set<String> colorSetThird = new TreeSet<>();
    Set<String> colorSetFourth = new TreeSet<>();
    public ColorSetsUnique() {
        Helper.fillSetWithColors(colorSetFirst);
        Helper.fillSetWithColors(colorSetSecond);
        Helper.fillSetWithColors(colorSetThird);
        Helper.fillSetWithColors(colorSetFourth);

        Helper.compareSets(colorSetFirst, colorSetSecond, colorSetThird,colorSetFourth);
    }

}
