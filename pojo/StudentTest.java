package pojo;

public class StudentTest {

    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            ImmutableStudent s = new ImmutableStudent("S9300"+i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                        default -> "Anoymous";
                    },
            "05/05/1992", "javaMasterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006","Ann","06/06/1993","javaMasterclass");
        ImmutableStudent recordStudent = new ImmutableStudent("S923007","jhon","07/07/1994","javaMasterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + " java OCP exam 829");
        
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name()+ " is taking " + recordStudent.classList());

    }
}
