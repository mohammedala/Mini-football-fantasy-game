package Game_info;


public class Striker extends Player {

    public static int counter;

    @Override
    public void Calculte_points() {
        this.setPoints(this.getGoals() * 3 + this.getAssist() * 4 + this.getCleansheet());
}

}
