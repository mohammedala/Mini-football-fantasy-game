package Game_info;


public class Goalkeeper extends Player {

    public static int counter;

    @Override
    public void Calculte_points() {
        this.setPoints(this.getGoals() * 10 + this.getAssist() * 7 + this.getCleansheet() * 3);
       }

}
