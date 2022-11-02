public class Student {
    String name;
    byte age;
    char gender;
    String phon;
    public void setGender(Student[] students){
        int counter=0;
        int counter1=0;
        for (Student student : students) {
            if (student.gender == 'F') {
                counter++;
            } else if (student.gender == 'M') {
                counter1++;
            }

        }
        System.out.println("F"+counter);
        System.out.println("M"+counter1);

    }
}
