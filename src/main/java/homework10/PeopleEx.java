package homework10;

public class PeopleEx {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    private String name ;
    private String secondname;
//    private int age;
    private String pol;

// это конструктор!!!!!!!!!!!!
        public PeopleEx(String name, String secondname, String pol){
            this.name = name;
            this.secondname = secondname;
//            this.age = age;
            this.pol = pol;
        }


}
