package homework10;

public class UniversityEx extends SchoolBoy {
    private int age;

    public UniversityEx(String name, String secondname, String pol) {
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
        setAge(19);
        setJob("Student");
        System.out.println("Sou after 12 year in School Our "+getPol()+" is: "
                +getJob()+"\nHis Name: "+getName()+" "+getSecondname()
                +"\nHis Age now: "+getAge());
    }
}
