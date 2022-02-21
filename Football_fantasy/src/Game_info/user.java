package Game_info;

public class user extends Person {

    private Player list[] = new Player[11];
    
    public void instantiate(int index , int flag) {
        switch(flag){
        
            case 1 : 
                list[index] = new Goalkeeper();
                break;
            case 2:
                list[index] = new Defender();
                break;
            case 3 : 
                list[index] = new Midfielder();
                break;
            case 4 :
                list[index] = new Striker();
                break;
        }
    }

    public void setList(int index, String name, String club, String pos, int goals, int ass, int cls) {
        
        this.list[index].set(name, club, pos, goals, ass, cls);
    }

    public String getClubSquad(int index) {

        return list[index].getClub();
    }

    public String getPlayerNamefromSquad(int index) {
        return list[index].getName();
    }
    
    public int getPlayerPointsfromSquad(int index) {
        return list[index].getPoints();
    }

    @Override
    public void  Calculte_points() {
        int total_points = 0;

        for (int i =0 ; i <11 ; i++){
            list[i].Calculte_points();
            total_points += this.list[i].getPoints();
        }
        this.setPoints(total_points);
        
    }

}
