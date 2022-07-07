public class Main {
    public static void main(String[] args) {

            System.out.println("Dog");
Dog dog = new Dog();
dog.setName("Pytin");
dog.setAge(3);
dog.setColor("black");
dog.setWeight(3.5);
        System.out.println("name"+dog.getName());
        System.out.println("age"+dog.getAge());
        System.out.println("color "+dog.getColor());
        System.out.println("weight"+dog.getWeight());
            System.out.println("--------------------------");
            System.out.println("Cat");
Cat cat = new Cat();
cat.setName("Tom");
cat.setAge(2);
cat.setColor("blye");
cat.setWeight(2.4);
        System.out.println("name"+cat.getname());
        System.out.println("age"+cat.getAge());
        System.out.println("color "+cat.getColor());
        System.out.println("weight"+cat.getweight());
            System.out.println("---------------------------");
            System.out.println("Fish");

Fish fish = new  Fish();
fish.setName("Nemo");
fish.setAge(4);
fish.setColor("orange");
fish.setWeight(2.5);
        System.out.println("name"+fish.getName());
        System.out.println("age"+fish.getAge());
        System.out.println("color "+fish.getColor());
        System.out.println("weight"+fish.getWeight());
            System.out.println("________________________-");
            System.out.println("Popugai");

Popygai popygai = new Popygai();
popygai.setName("Petr");
popygai.setAge(2);
popygai.setColor("green");
popygai.setWeight(1.5);
        System.out.println("name"+popygai.getName());
        System.out.println("age"+popygai.getAge());
        System.out.println("color" +popygai.getColor());
        System.out.println("weight"+popygai.getWeight());



    }
}