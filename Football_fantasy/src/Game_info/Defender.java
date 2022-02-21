package Game_info;


public class Defender extends Player {

    public static int counter;

    @Override
    public void Calculte_points() {
        this.setPoints(((this.getGoals() * 7) + (this.getAssist() * 5) + (this.getCleansheet() * 4)));
    }

}
