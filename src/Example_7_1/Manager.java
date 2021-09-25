package Example_7_1;

public class Manager {
    private String name;
    private int age;
    private String skill;

    public Manager(String name, int age, String skill) {
        super();
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void raisePrice(Selling s, double a) {
        s.setPrice(s.getPrice() + a);
    }
}
