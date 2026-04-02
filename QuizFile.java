class QuizFile extends CourseMaterial {
    private int marks;

    public QuizFile(String topic, double fileSize, int marks) {
        super(topic, fileSize);
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    double calculateWeight() {
        return marks * 1.0;
    }

    void openMaterial() {
        System.out.println("Opening quiz file");
    }

    public String toString() {
        return "Quiz: " + topic + " marks=" + marks +
                "\nTopic: " + topic +
                "\nSize: " + fileSize +
                "\nWeight: " + calculateWeight();
    }
}