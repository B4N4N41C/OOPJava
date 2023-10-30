public class Master {
    private String name;
    private int level;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public int getMonthOfBirth() {
        return monthOfBirth;
    }
    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }
    public int getDayOfBirth() {
        return dayOfBirth;
    }
    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        if(level >= 1 || level <= 3){
            this.level = level;
        }else if(level < 1){
            this.level = 1;
        }else if(level > 3){
            this.level = 3;
        }
    }
    public Master(String name, int level, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.name = name;
        setLevel(level);
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
    }
    public Master(String name, int level, int yearOfBirth) {
        this.name = name;
        setLevel(level);
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public String toString() {
        if(level == 3){
            return "Старший мастер " + name;
        }
        if(level == 2){
            return "Мастер " + name;
        }
        if(level == 1){
            return "Стажор " + name;
        }
        return "Мастер не определён";
    }
}
