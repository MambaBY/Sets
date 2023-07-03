/*
 *Задача 17. Коллекции. Множество HashSet. Наборы цветов шариков
 * Нужно:
 * б. создать генератор случайных чисел (int)(Math.random() * (max - min) + min), выделив его в метод;
 * в. используя генератор сформировать четыре набора по три разных цвета воздушных шариков в каждом;
 * г. вывести на консоль наборы цветов воздушных шариков.


 * Задача 17а. Коллекции. Множество TreeSet. Уникальные наборы цветов шариков
 * Решить Задачу 17 таким образом, чтобы четыре сформированных набора были уникальны, т.е. не повторялись между собой.
 */

public class Main {
    public static void main(String[] args) {
        ColorsSets colorsSets = new ColorsSets();
        ColorSetsUnique colorSetsUnique = new ColorSetsUnique();

        Helper.printColorSets(colorsSets.colorSetFirst, colorsSets.colorSetSecond, colorsSets.colorSetThird, colorsSets.colorSetFourth);
        System.out.println();
        Helper.printColorSets(colorSetsUnique.colorSetFirst, colorSetsUnique.colorSetSecond, colorSetsUnique.colorSetThird, colorSetsUnique.colorSetFourth);


    }



}