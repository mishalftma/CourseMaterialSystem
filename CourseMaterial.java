abstract class CourseMaterial {
    protected String topic;
    protected double fileSize;

    public CourseMaterial(String topic, double fileSize) {
        this.topic = topic;
        this.fileSize = fileSize;
    }

    abstract double calculateWeight();
    abstract void openMaterial();

    public void displayBasicInfo() {
        System.out.println("Topic: " + topic);
        System.out.println("Size: " + fileSize);
    }

    public void simpleMessage() {
        System.out.println("This is a course material.");
    }

    public final void finalMethod() {
        System.out.println("Final method.");
    }
}