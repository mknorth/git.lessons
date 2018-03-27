package homework10;

public class SchoolBoy extends PeopleEx {
    private int age;

    public SchoolBoy(String name, String secondname, String pol) {
        super(name, secondname, pol);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String job;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getInfo(){
        setAge(7);
        setJob("SchoolBoy");
        System.out.println("Sou after 7 year after born Our "+getPol()+" is: "
                +getJob()+"\nHis Name: "+getName()+" "+getSecondname()
                +"\nHis Age now: "+getAge());
    }
}
