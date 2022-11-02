public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Alina";
        student.age = 20;
        student.gender = 'F';
        student.phon = "45678393";

        Student student1 = new Student();
        student1.name = "Arina";
        student1.age = 21;
        student1.gender = 'F';
        student1.phon = "45678083";

        Student student2 = new Student();
        student2.name = "lina";
        student2.age = 20;
        student2.gender = 'F';
        student2.phon = "45678093";

        Student student3 = new Student();
        student3.name = "Amin";
        student3.age = 20;
        student3.gender = 'M';
        student3.phon = "45178093";

        Student student4 = new Student();
        student4.name = "Alina";
        student4.age = 20;
        student4.gender = 'M';
        student4.phon = "45378093";

        Student student5 = new Student();
        student5.name = "Amir";
        student5.age = 20;
        student5.gender = 'M';
        student5.phon = "45578093";
     Student []students={student,student1,student2,student3,student4,student5};
     student.setGender( students);
    }
}