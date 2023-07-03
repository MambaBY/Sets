public class Main {


    public static void main(String[] args) {
        ColorsSets colorsSets = new ColorsSets();
        ColorSetsUnique colorSetsUnique = new ColorSetsUnique();

        Helper.printColorSets(colorsSets.colorSetFirst, colorsSets.colorSetSecond, colorsSets.colorSetThird, colorsSets.colorSetFourth);
        System.out.println();
        Helper.printColorSets(colorSetsUnique.colorSetFirst, colorSetsUnique.colorSetSecond, colorSetsUnique.colorSetThird, colorSetsUnique.colorSetFourth);


    }



}