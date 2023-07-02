public class Main {


    public static void main(String[] args) {
        ColorsSets cs = new ColorsSets();
        ColorSetsUnique cs2 = new ColorSetsUnique();

        Helper.printColorSets(cs.colorSetFirst, cs.colorSetSecond, cs.colorSetThird, cs.colorSetFourth);
        System.out.println();
        Helper.printColorSets(cs2.colorSetFirst, cs2.colorSetSecond, cs2.colorSetThird, cs2.colorSetFourth);


    }



}