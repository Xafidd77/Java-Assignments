public class Assingment2 {

    // DATA FIELDS

    private String name;
    private int age;
    private double weight;   // weight in pounds
    private double height;   // height in inches


    // CONSTRUCTOR 1
    // Name, Age, Weight, Height

    public Assingment2(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // CONSTRUCTOR 2
    // Name, Weight, Height
    // Default age = 20

    public Assingment2(String name, double weight, double height) {
        this.name = name;
        this.age = 20;
        this.weight = weight;
        this.height = height;
    }


    // GETTER METHODS

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

        // CALCULATE BMI

    public double getBMI() {

        // BMI formula:
               return (weight * 703) / (height * height);
    }


    // GET BMI STATUS

    public String getStatus() {

        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi < 25.0) {
            return "Normal";
        }
        else if (bmi < 30.0) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }



    // TOSTRING METHOD

    @Override
    public String toString() {

        return "Name: " + name +
                "\nAge: " + age +
                "\nWeight: " + weight + " pounds" +
                "\nHeight: " + height + " inches" +
                "\nBMI: " + String.format("%.2f", getBMI()) +
                "\nStatus: " + getStatus();
    }


    // MAIN METHOD

    public static void main(String[] args) {

          // First BMI object
        // Name + Age + Weight + Height

        Assingment2 person1 =
                new Assingment2("Ismail", 22, 160, 68);

        System.out.println("======== BMI INFORMATION ========");
        System.out.println(person1);


        // Second BMI object
        // Name + Weight + Height
        // Age automatically becomes 20

        Assingment2 person2 =
                new Assingment2("Ahmed", 180, 70);

        System.out.println();
        System.out.println("======== BMI INFORMATION ========");

        System.out.println(person2);



        // Testing Getter Methods

        System.out.println();
        System.out.println("======== GETTER METHOD TEST  ========");


        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Weight: " + person1.getWeight());
        System.out.println("Height: " + person1.getHeight());
        System.out.printf("BMI: %.2f%n", person1.getBMI());
        System.out.println("Status: " + person1.getStatus());
    }
}