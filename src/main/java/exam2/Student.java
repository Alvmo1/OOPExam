package exam2;

public class Student {
    String name;
    SIze sIze;
    public int id;
    public static int printUniqueStudentID;

    public String getName() {
        return name;
    }

    public SIze getSize() {
        return sIze;
    }

    public Student(String name, SIze sIze) {
        this.name = name;
        this.sIze = sIze;
        printUniqueStudentID++;
        id = printUniqueStudentID;
    }

    public void printInfo() {
        System.out.println(name + " " + printUniqueStudentID + " " + sIze);
    }
    public boolean isAFit(Cloth cloth){
       return this.sIze.equals(cloth.getSize());
    }

}
