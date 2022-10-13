public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract boolean addCourse(String course);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
