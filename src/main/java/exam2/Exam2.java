package exam2;

import static exam2.SIze.*;

public class Exam2 {
    public static void main(String[] args) {

        Cloth[] clothes = new Cloth[3];
        clothes[0] = new Cloth("Jeans", SIze.MEDIUM, 30.00);
        clothes[1] = new Cloth("T-shirt", SIze.MEDIUM, 15.00);
        clothes[2] = new Cloth("Socks", SIze.LARGE, 5.00);




        double subTotal = 0.0;
        for (Cloth cloth : clothes) {
            subTotal += cloth.getPrice();
            System.out.println("Subtotal: $" + subTotal);
        }

        Student student = new Student("Aaron", SIze.MEDIUM);
        System.out.println(student.id);
        Student student1 = new Student("Ron", SMALL);
        System.out.println(student1.id);
        System.out.println(student.id);
        student1.printInfo();

        boolean findFit = true;
        for (Cloth cloth : clothes) {
            if (student.isAFit(cloth)) {
                System.out.println(cloth.getType() + " " + "size " + cloth.getSize() + " " + "fits " + student.getName());
                findFit = true;
                break;
            } else if (student1.isAFit(cloth)) {
                System.out.println(cloth.getType() + " " + "size " + cloth.getSize() + " " +" doesn't fits " + student1.getName());
            }
            findFit = true;
            System.out.println(student1);
            break;
        }
        if (student.getSize().equals(SIze.XLARGE)){
        }else{
            student1 = new Student("Ron", SIze.XLARGE);
        }
        System.out.println("Student 1: Name " + student.getName() + ", Size " + student.getSize());
        System.out.println("Student 2: Name " + student1.getName() + ", Size " + student1.getSize());

        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Alice", "alice1@gmail.com");
        customers[1] = new Customer("Bob", "bob1@gmail.com");
        customers[2] = new Customer("Troy", "troy1@gmail.com");

    }

}






