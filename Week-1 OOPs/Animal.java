class Animal{
    void eat(){
        System.out.println("Eating Habits");
    }
}

class herbivores extends Animal{
    void eat(){
        System.out.println("Herbivores eat plants");
    }
}

class carnivores extends Animal{
    void eat(){
        System.out.println("Carnivores eat meat");
    }
}

class omnivores extends Animal{
    void eat(){
        System.out.println("Omnivores eat plants and meat");
    }
}

class main{
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal giraffee = new herbivores();
        Animal bears = new omnivores();
        Animal lion = new carnivores();
        animal1.eat();
        giraffee.eat();
        bears.eat();
        lion.eat();
    }
}
// run -time polymorphism