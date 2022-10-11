public class Player {
    
    public String name;
    public int points;

    //private String name;
    //private int points;

    public Player(){
        this("Player");
    }

    public Player(String name){
        this(name, 0);
    }
 
    public Player(String name, int points){
        this.name = name;

        if(points < 0){
            this.points = 0;
        }
        else{
            this.points = points;
        }

    }
    
    public void addPoints(int points){
        if(points > 0){
            this.points += points;
        }
    }

    public String getInfo(){
        return "Player " + this.name + " has " + this.points + " points";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return this.points;
    }
}
