package Home004;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    /*
     * Функция для добавления фруктов в ящик
     */
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    /*
     * Функция для вычисления веса ящика
     */
    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    /*
     * Функция для проверки равности масса ящиков
     */
    public boolean compare(Box<?> anotherBox) {
        if (getWeight() == anotherBox.getWeight()){
            return true;
        }
        return false;
    }

    /*
     * Функция для перемещения фруктов из одного ящика в другой
     */
    public void transferFruits(Box<T> anotherBox) {
        if (getClass() == anotherBox.getClass()) {
            for (T fruit : fruits) {
                anotherBox.addFruit(fruit);
            }
            fruits.clear();
        } else {
            System.out.println("Нельзя пересыпать фрукты разных сортов в одну коробоку.");
        }
    }

}
