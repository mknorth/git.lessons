package homework10;



public class MainerClass {


    public static void main(String[] args) {

        SchoolBoy school = new SchoolBoy("Max","QQQQ","Boy");
        UniversityEx student = new UniversityEx("Max","WWWW","Boy");
        WorkerEx worker = new WorkerEx("Max","EEEE","male");
        school.getInfo();
        System.out.println();
        student.getInfo();
        System.out.println();
        /*"Max","Kravh",28,"male"*/
       // worker.setName(null);
//        worker.setName("Max");
//        worker.setSecondname("Kravc");
//        worker.setAge(28);
//        worker.setPol("Male");
//        System.out.println(worker.getName());
//        System.out.println(worker.getSecondname());
//        System.out.println(worker.getAge());
//        System.out.println(worker.getPol());
        worker.getInfo();
    }

}
