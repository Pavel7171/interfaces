package interfaces;

public class animal implements Info {
    public int id;

    public animal(int id){
        this.id = id;
    }
    public void sleep(){
        System.out.println("I'm sleeping");
    }
    public void showInfo(){
        System.out.println("Id is " + this.id);
    }
}
