package interfaces;

public class test {
    public static void main(String[] args){
      //  animal animal1 = new animal(1);            1
      //  Person person1 = new Person("Bob");
      //  animal1.sleep();
      //  person1.sayHello();
      // animal1.showInfo();
      //  person1.showInfo();                        1

         animal animal1 = new animal(1); 
         Person person1 = new Person("Bob");
     // Info info1 = new animal(1);                  2
     // Info info2 = new Person("Jack");
       // info1.showInfo();
       // info2.showInfo();
       // outputInfo(info1);                         
       // outputInfo(info2);                         2
       outputInfo(animal1);
       outputInfo(person1);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
