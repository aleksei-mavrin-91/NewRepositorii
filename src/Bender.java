
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

public class Bender {

    public static void main(String[] args) {


        int i = 0;
        String word;
        Scanner in = new Scanner(System.in);


        List<String> list = new ArrayList<>();
        do {
            System.out.println("Input  a word: ");
            word = in.nextLine();
            list.add(word);
        } while (!word.equals("exitexit"));/*Прерываем ввод строкой exitexit*/


        System.out.println("You entered list: " + list);

        /*удаляем последний элемент из списка*/
        String hey = list.get(list.size() - 1);
        list.remove(hey);


        /*Удаляем элементы длиной 1*/
        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            String str = itr.next().toString();
            //System.out.println("next name =" + str);

            if (str.length() == 1) {
                itr.remove();
            }
        }

        System.out.println("You list after deleted : " + list);

        String[] array = null;

        array = list.toArray(new String[list.size()]);


        /*сортировка методом sort*/
        Arrays.sort(array);
        System.out.println("result = " + Arrays.toString(array));


    }


}
