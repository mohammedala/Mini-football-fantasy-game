package Game_info;

public abstract class Player extends Person {

    private String club;
    private String position;
    private int goals;
    private int assist;
    private int cleansheet;
  

    public void set(String name, String club, String position, int goals, int assist, int cleansheet) {
        this.setName(name);
        this.club = club;
        this.position = position;
        this.goals = goals;
        this.assist = assist;
        this.cleansheet = cleansheet;

    }

    public String getClub() {
        return club;
    }

    public String getPosition() {
        return position;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssist() {
        return assist;
    }

    public int getCleansheet() {
        return cleansheet;
    }

}
