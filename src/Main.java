public class Main
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Rover", 1, "Golden Retriever", 20);
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println();
        System.out.println("Age " + dog1.getAge());
        System.out.println();
        System.out.println("Weight: " + dog2.getWeight());
        System.out.println();
        System.out.println(dog3.toString());
        System.out.println();
        Dog.getDogs();
    }//End main
}//End main class