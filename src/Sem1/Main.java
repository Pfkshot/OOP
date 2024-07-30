package Sem1;

import java.util.ArrayList;
import java.util.List;

/**
 -Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
 initProducts (List <Sem1.Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
 - Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода
 сделанного в предыдущем задании.

 -Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
 сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа ТорговогоАвтомата
 (пример: ПродающийБутылкиВодыАвтомат)

 -Переопределите метод toString для Товара, запустите программу, после этого переопределите для
 наследника этот метод, после запуска обратите внимание на изменение поведения.

 Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
 входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
 возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)

 */
public class Main {
    public static void main(String[] args){
        HotDrinks drink1 = new HotDrinks("tea ", 50, 1,80);
        HotDrinks drink2 = new HotDrinks("coffee ", 100, 2,85);
        HotDrinks drink3 = new HotDrinks("cacao ", 150, 3,90);

        List <Product> productList = new ArrayList<>();
        productList.add(drink1);
        productList.add(drink2);
        productList.add(drink3);

        HotDrinksVendingMachine hdvm = new HotDrinksVendingMachine(productList);

        HotDrinks wantHotDrink = hdvm.getProduct("tea ",1,80);

        System.out.println(wantHotDrink);

        }

    }