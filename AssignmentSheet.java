class AssignmentSheet extends CourseMaterial {
    private int questions;

    public AssignmentSheet(String topic, double fileSize, int questions) {
        super(topic, fileSize);
        this.questions = questions;
    }

    public int getQuestions() {
        return questions;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }

    double calculateWeight() {
        return questions * 1.0;
    }

    void openMaterial() {
        System.out.println("Opening assignment");
    }

    public String toString() {
        return "Assignment: " + topic + " questions=" + questions +
                "\nTopic: " + topic +
                "\nSize: " + fileSize +
                "\nWeight: " + calculateWeight();
    }
}