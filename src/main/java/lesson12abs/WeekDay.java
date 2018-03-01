package lesson12abs;

public enum WeekDay {
    MONDAY(2), TUSDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(1);

    private int dayInt;
    WeekDay(int dayInt){
        this.dayInt = dayInt;
    }
    public int getDayInt(){
        return dayInt;
    }
}
