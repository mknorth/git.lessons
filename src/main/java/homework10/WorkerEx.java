package homework10;

public class WorkerEx extends UniversityEx{

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String job;
    private int age;
    public void getInfo(){
        setAge(25);
        setJob("Worker");
      System.out.println("Sou after 6 year in UNIVERSITY Our "+getPol()+" is: "
              +getJob()+"\nHis Name: "+getName()+" "+getSecondname()
              +"\nHis Age now: "+getAge());
    }
    public WorkerEx(String name, String secondname, String pol) {
        super(name, secondname, pol);
    }
}
