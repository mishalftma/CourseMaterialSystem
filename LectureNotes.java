class LectureNotes extends CourseMaterial {
    private int pages;

    public LectureNotes(String topic, double fileSize, int pages) {
        super(topic, fileSize);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    double calculateWeight() {
        return pages * 1.0;
    }

    void openMaterial() {
        System.out.println("Opening lecture notes");
    }

    public String toString() {
        return "Lecture: " + topic + " pages=" + pages +
                "\nTopic: " + topic +
                "\nSize: " + fileSize +
                "\nWeight: " + calculateWeight();
    }
}