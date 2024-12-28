public class Duck extends Animal implements Flyable{
    String name;

    public Duck(String name){
          this.name = name;
    }

    @Override
    void sound() {
        System.out.println("quack quack");
    }
    void layegg(){
        System.out.println(". . . now laying egg . . .");
    }

    @Override
    public void Fly() {
        System.out.println("fly!!");
    }

    @Override
    public void Glide() {
        System.out.println("Glide!!!");
    }

    void clean(Animal animal){
        System.out.println(this.toString() + " is cleaning " + animal);
    }

    public String toString(){
        return "Duckkie " + this.name;
    }
}
