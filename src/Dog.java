public class Dog {
    private String name;
    private int age;
    private String breed;
    private float weight;
    private static int dogs;

    public Dog(String thename, int theage, String thebreed, float theweight) {
        name = thename;
        age = theage;
        breed = thebreed;
        weight = theweight;
        dogs++;
    }

    public void setName(String thename) {
        name = thename;
    }
    public void setAge(int theage) {
        age = theage;
    }
    public void setBreed(String thebreed) {
        breed = thebreed;
    }
    public void setWeight(float theweight) {
        weight = theweight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public float getWeight() {
        return weight;
    }

    public static void getDogs() {
        System.out.println("You have " + dogs + " dogs!");
    }

    public String toString() {
        String output = "Name: " + name +
                "\nAge: " + age +
                "\nBreed: " + breed +
                "\nWeight: " + weight;
        return output;
    }
}

