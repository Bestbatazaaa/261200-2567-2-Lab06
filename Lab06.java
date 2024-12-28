public class Lab06 {
    public static void  main(String arg[]){
        Cow wagyu = new Cow();
        wagyu.sound();
        Pig burin = new Pig();
        burin.sound();
        Duck donald = new Duck("donald");
        donald.sound();
        Owl hedwig = new Owl();
        hedwig.sound();
        donald.clean(wagyu);
        PekingDuck jiatongheng = new PekingDuck("JTH");
        jiatongheng.clean(donald);
        jiatongheng.Fly();

        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());
        jiatongheng.BeCrispy();
    }
}