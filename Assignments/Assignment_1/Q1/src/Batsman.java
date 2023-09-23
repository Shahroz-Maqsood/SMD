public class Batsman implements BatsmanInterface{

    private String name;

    private int age;

    private String nationality;

    private int score;

    private int rating;

    public void setScore(int score){
        this.score=score;
    }
   public int getRanking(){
       return this.rating;
   }
   public void print(){
       System.out.println("Name : "+this.getName());
       System.out.println("Age : "+getAge());
       System.out.println("Nationality"+this.getNationality());
       System.out.println("I am a Batsman with Score : "+this.score);
   }
   public void setRating(int rating){
        this.rating=rating;
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

   public int getScore(){
        return this.score;
   }
   public String getName(){
        return this.name;
   }
   public int getAge(){
        return this.age;
   }

   public String getNationality(){
        return this.nationality;
    }


}
