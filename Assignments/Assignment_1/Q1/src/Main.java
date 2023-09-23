
public class Main {
    public static void main(String[] args) {
       Batsman ba1=new Batsman();
       ba1.setName("Baber Azam");
       ba1.setAge(23);
       ba1.setNationality("Pakistani");

       Bowler bo1=new Bowler();
       bo1.setName("Naseem Shah");
       bo1.setAge(21);
       bo1.setNationality("Pakistani");

       ba1.setRating(90);
       ba1.setScore(10000);
       ba1.print();
       System.out.println("Ranking : "+ba1.getRanking());


       bo1.setRanking(80);
       bo1.setWickets(200);
        bo1.print();
       System.out.println("Ranking : "+bo1.getRanking());



        Batsman ba2=new Batsman();
        ba2.setName("IMAD");
        ba2.setAge(30);
        ba2.setNationality("Pakistani");
        ba2.setScore(5000);
        ba2.setRating(60);

        Bowler bo2=new Bowler();
        bo2.setWickets(100);
        bo2.setRanking(40);


       AllRounder al1=new AllRounder(ba2,bo2);
       al1.print();
        System.out.println("Ranking : "+al1.getRanking());

    }
}