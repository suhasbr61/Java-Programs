
class School {
    public static void sriPoojitha() {
        int schoolage = 15;
        System.out.println("I am in 10th Class");
        System.out.println("School Age : " + schoolage);
    }

    public double sriPoojitha(double percentage) {
        // Use the parameter directly instead of redefining it.
        System.out.println("10th Class Percentage : " + percentage);
        return percentage;
    }
}

class Diploma extends School {
    public static void mbtsClg() {
        int diplomaage = 18;
        System.out.println("I am in Diploma");
        System.out.println("Diploma Age : " + diplomaage);
    }

    public double diploma(double percentage) {
        System.out.println("Diploma Percentage : " + percentage);
        return percentage;
    }
}

class BTech extends Diploma {
    public static void BtechClg() {
        int btechage = 21;
        System.out.println("I am in B.Tech");
        System.out.println("B.Tech Age : " + btechage);
    }

    public double btech(double percentage) {
        System.out.println("B.Tech Percentage : " + percentage);
        return percentage;
    }
}

class Afreed {
    public static void main(String[] args) {
        School s = new School();
        School.sriPoojitha(); // Call static method using the class name
        s.sriPoojitha(100);

        Diploma d = new Diploma();
        Diploma.mbtsClg(); // Call static method using the class name
        d.diploma(72.3);

        BTech b = new BTech();
        BTech.BtechClg(); // Call static method using the class name
        b.btech(78.9);
    }
}
