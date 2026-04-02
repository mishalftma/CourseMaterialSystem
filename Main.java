public class Main {
    public static void main(String[] args) {

        CourseMaterial c1 = new LectureNotes("AbstractClasses", 2.5, 50);
        CourseMaterial c2 = new AssignmentSheet("Java", 1.2, 10);
        CourseMaterial c3 = new QuizFile("MCQs", 0.8, 20);

        CourseMaterial[] list = {c1, c2, c3};

        System.out.println("=== BEFORE MODIFICATION ===\n");

        for (CourseMaterial c : list) {
            System.out.println("----------------------");
            System.out.println(c);
        }

        for (CourseMaterial c : list) {
            if (c instanceof LectureNotes) {
                LectureNotes l = (LectureNotes) c;
                l.setPages(l.getPages() + 50);
            }
        }

        for (CourseMaterial c : list) {
            if (c instanceof AssignmentSheet) {
                AssignmentSheet a = (AssignmentSheet) c;
                if (a.getQuestions() < 15) {
                    a.setQuestions(a.getQuestions() + 5);
                }
            }

            if (c instanceof QuizFile) {
                QuizFile q = (QuizFile) c;
                if (q.getMarks() < 30) {
                    q.setMarks(q.getMarks() + 5);
                }
            }
        }

        System.out.println("\n=== AFTER MODIFICATION ===\n");

        for (CourseMaterial c : list) {
            System.out.println("----------------------");
            System.out.println(c);
        }
    }
}