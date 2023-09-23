public abstract class Person {
protected int adharCard;
protected String name;

protected String address;

protected int phoneNo;

protected String Profession;

Person(int adhar,String name,String address,int phoneNo,String Profession){
        this.adharCard=adhar;
        this.name=name;
        this.address=address;
        this.phoneNo=phoneNo;
        this.Profession=Profession;
    }
public String Register(int UID){
    this.adharCard=UID;
    return "Registration Successful";
}
public String Perform(String duty){
    return "Chutiya Performs Duty : "+duty;
}
public String Include(String Service){
    return "Chutiya give services : "+Service;
}

public String Like(String Item){
    return "Chutiya Likes this item : "+Item;
}
}
