package Home004;

/*
    a.  Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b.  Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c.  Для хранения фруктов внутри коробки можно использовать ArrayList;
    d.  Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e.  Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
        подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;
    f.  Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g.  Не забываем про метод добавления фрукта в коробку.
 */

public class Program {
    public static void main(String[] args) {

        // Создаем ящики для яблок
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        // Создаем яблоки и добавляем их в первый ящик
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        appleBox1.addFruit(apple1);
        appleBox1.addFruit(apple2);
        appleBox1.addFruit(apple3);

        // Создаем ящик для апельсинов
        Box<Orange> orangeBox = new Box<>();

        // Создаем апельсины и добавляем их в ящик для апельсинов
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);

        // Вывод проверки равности масса ящиков
        System.out.println("Проверка равности масс ящиков: " + appleBox1.compare(orangeBox));

        // Выводим вес каждого ящика
        System.out.println("Вес ящика с яблоками 1: " + appleBox1.getWeight());
        System.out.println("Вес ящика с яблоками 2: " + appleBox2.getWeight());
        System.out.println("Вес ящика с апельсинами: " + orangeBox.getWeight());

        // Перекладываем фрукты из первого ящика с яблоками во второй
        appleBox1.transferFruits(appleBox2);

        // Выводим вес каждого ящика после перекладывания
        System.out.println("Вес ящика с яблоками 1 после перекладывания: " + appleBox1.getWeight());
        System.out.println("Вес ящика с яблоками 2 после перекладывания: " + appleBox2.getWeight());
    }
}
