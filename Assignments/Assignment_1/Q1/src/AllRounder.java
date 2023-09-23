public class AllRounder implements AllRounderInteface{

    private BatsmanInterface Batsaman;
    private BowlerInterface Bowler;

    AllRounder(BatsmanInterface Batsman,BowlerInterface Bowler){
        this.Batsaman=Batsman;
        this.Bowler=Bowler;
    }

    public int getScore(){
        return this.Batsaman.getScore();
    }

    public String getName(){
        return this.Batsaman.getName();
    }
    public int getAge(){
        return this.Batsaman.getAge();
    }
    public String getNationality(){
        return this.Batsaman.getNationality();
    }

    public int getWickets(){
        return this.Bowler.getWickets();
    }

    public int getRanking()
    {
        return (this.Batsaman.getRanking()+this.Bowler.getRanking()/2);
    }
    public void print(){
        System.out.println("Name : "+this.Batsaman.getName());
        System.out.println("Age : "+this.Batsaman.getAge());
        System.out.println("Nationality"+this.Batsaman.getNationality());
        System.out.println("I am AllRounder with total "+this.Bowler.getWickets()+" Wickets "+" and Score"+this.Batsaman.getScore());
    }
}
