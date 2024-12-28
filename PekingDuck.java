public class PekingDuck extends Duck{
    PekingDuck(String name){
        super(name);
    }

    @Override
    void clean(Animal animal) {
        System.out.println("ผีหลอก");
    }

    void BeCrispy() {
        System.out.println("กรอบๆ หอม อร่อย");
    }
}
