package com.itheima.innerclass01.test03;

public class AnimalManager {
    private Animal animal;

    public AnimalManager() {
    }

    public AnimalManager(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void manager(Animal animal)
    {
        animal.eat();
    }

}
