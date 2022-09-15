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

        //�������� ����� �����
        ArrayList<Apple> myApples = new ArrayList<Apple>();
        myApples.add(new Apple());
        myApples.add(new Apple());
        myApples.add(new Apple());
        myApples.add(new Apple());
        myApples.add(new Apple());
        myApples.add(new Apple());
        //������� ������� � ��������
        Box myBox = new Box(myApples);

        //����� ����������
        ArrayList<Orange> myOranges = new ArrayList<>();
        myOranges.add(new Orange());
        myOranges.add(new Orange());
        myOranges.add(new Orange());
        myOranges.add(new Orange());
        //������� ������� � �����������
        Box myBox2 = new Box(myOranges);
        -
        System.out.println("��� ������� � �������� "+myBox.getWeight());
        System.out.println("��� ������� � ����������� "+myBox2.getWeight());

        //������� ������� �� ����
        if (myBox.compare(myBox2)) {
            System.out.println("������� �� ���� �����");
        } else {
            System.out.println("������� �� ���� ����������");
        }
        System.out.println(myBox.getWeight());

        //������� � ������� � �������� ���� ������
        Apple apple7 = new Apple();
        myBox.addFruit(apple7);
        System.out.println("��� ������� � �������� ����� ���������� "+myBox.getWeight());

        //�������� ������ ������� ��� �����
        ArrayList<Apple> myApples2 = new ArrayList<>();
        Box myBoxNew=new Box(myApples2);
        //��������� � ������ ������� myBoxNew ������ �� ������� myBox
        myBox.emptyBox(myBoxNew);
        System.out.println("��� ������� � �������� "+myBox.getWeight());
        System.out.println("��� ������(�����) ������� � �������� "+myBoxNew.getWeight());

    }
}