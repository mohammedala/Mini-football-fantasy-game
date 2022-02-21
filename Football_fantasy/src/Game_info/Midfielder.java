package Game_info;

public class Midfielder extends Player {

    public static int counter;

    public void Calculte_points() {
        this.setPoints(this.getGoals() * 4 + this.getAssist() * 3 + this.getCleansheet() * 2);
    }

}
