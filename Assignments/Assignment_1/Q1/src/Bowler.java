public class Bowler implements BowlerInterface{

    private int Wickets;

    private int ranking;

    private String name;
    private int age;
    private String nationality;
   public int getRanking(){
       return this.ranking;
    }

    public void setRanking(int ranking){
       this.ranking=ranking;
    }
    public void setWickets(int wickets){
       this.Wickets=wickets;
    }
    public void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Nationality"+this.nationality);
        System.out.println("I am a Bowler with Wickets : "+this.Wickets);
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    public int getWickets(){
       return this.Wickets;
    }

}
