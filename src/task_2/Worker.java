package task_2;

public class Worker {
    public String name;
    public String position;
    public int year;

    public Worker (String name, String position, int year){
        this.name = name;
        this.position = position;
        this.year = year;
    }
    public String getName() {return name;}
    public int experience() {
        return year;
    }
    @Override
    public String toString() {
        return name + ", " + position + ", год зачисления на работу: " + year;
    }
}
