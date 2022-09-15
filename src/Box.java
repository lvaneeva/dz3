import java.util.ArrayList;

public class Box<T extends Fruit> {
    //private T[] fruits;
    private ArrayList<T> fruits;
    private double weightBox;

    public Box(ArrayList<T> fruits){

        this.fruits = fruits;
    }
    public double getWeight(){
       /* for (int i=0;i< fruits.length;i++) {
            //weightBox +=  fruits[i].getWeightFru();
        }*/
        weightBox=0;
        for (int i=0;i< fruits.size();i++) {
            weightBox += fruits.get(i).getWeightFru();
        }
        return weightBox;
    }
    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }
    public void emptyBox(Box<T> another) {
        for (int i = 0; i < fruits.size(); i++) {
            another.fruits.add(fruits.get(i));
        }
        fruits.clear();
    }
    public  void addFruit(T fruit){
        fruits.add(fruit);
    }
}
