public class Flys extends Animal {
    String name;
    boolean fly; // 날 수 있는지 여부

    public Flys(String name, String color){
        super(name, color);
        this.name = name;
    }

    boolean canFly() {
        if(name == "강아지" || name == "고양이" | name == "호랑이") {
            fly = false;
        }
        if(name == "참새") {
            fly = true;
        }
        return fly;
    }
}
