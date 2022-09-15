import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1, 2, intArray);
        intBox.swap();
        /*for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }*/
        System.out.println(Arrays.toString(intArray));

        //Создадим набор яблок
        ArrayList<Apple> myApples = new ArrayList<Apple>();
        myApples.add(new Apple());
        myApples.add(new Apple());
        myApples.add(new Apple());
        myApples.add(new Apple());
        myApples.add(new Apple());
        myApples.add(new Apple());
        //Создаем коробку с яблоками
        Box myBox = new Box(myApples);

        //набор апельсинов
        ArrayList<Orange> myOranges = new ArrayList<>();
        myOranges.add(new Orange());
        myOranges.add(new Orange());
        myOranges.add(new Orange());
        myOranges.add(new Orange());
        //Создаем коробку с апельсинами
        Box myBox2 = new Box(myOranges);
        -
        System.out.println("Вес коробки с яблоками "+myBox.getWeight());
        System.out.println("Вес коробки с апельсинами "+myBox2.getWeight());

        //Сравним коробки по весу
        if (myBox.compare(myBox2)) {
            System.out.println("Коробки по весу равны");
        } else {
            System.out.println("Коробки по весу отличаются");
        }
        System.out.println(myBox.getWeight());

        //Добавим в коробку с яблоками одно яблоко
        Apple apple7 = new Apple();
        myBox.addFruit(apple7);
        System.out.println("Вес коробки с яблоками после добавления "+myBox.getWeight());

        //Создадим пустую коробку для яблок
        ArrayList<Apple> myApples2 = new ArrayList<>();
        Box myBoxNew=new Box(myApples2);
        //Пересыпем в пустую коробку myBoxNew яблоки из коробки myBox
        myBox.emptyBox(myBoxNew);
        System.out.println("Вес коробки с яблоками "+myBox.getWeight());
        System.out.println("Вес пустой(ранее) коробки с яблоками "+myBoxNew.getWeight());

    }
}