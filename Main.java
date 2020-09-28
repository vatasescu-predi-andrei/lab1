public class Main {
    public static void main(String args[]) {
        Student[] students = new Student[3];
        students[0] = new Student("Andrei", "Vatasescu", 80, 98);
        students[1] = new Student("Victor", "Ciobanu", 89, 70);
        students[2] = new Student("Narcis", "Spanache", 65, 70);
        students[0].setFirstname("MARIAN");
        students[1].setSurname("Predi");
        System.out.println(students[0].getFullName());
        System.out.println(students[1].getFirstname());
        System.out.println(students[1].getSurname());
        System.out.println(students[2].getSurname());


        System.out.println(students);
    }

}
