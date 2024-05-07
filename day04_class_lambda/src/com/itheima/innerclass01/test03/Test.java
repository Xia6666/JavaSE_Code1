package com.itheima.innerclass01.test03;

public class Test {

    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Animal animal = new Dog();
        animalManager.manager(animal);

        animal =new Cat();
        animalManager.manager(animal);

        animal =new Pig();
        animalManager.manager(animal);

    }
}
