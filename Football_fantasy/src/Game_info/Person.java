package Game_info;


public abstract class  Person {

    private String name;
    private int points;

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public abstract void Calculte_points();

}
