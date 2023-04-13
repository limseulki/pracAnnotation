public class Legs extends Animal {
    String name; // 동물 종류
    int legs; // 동물 다리 개수, 2, 4

    public Legs(String name, String color) { // 생성자
        super(name, color); // 안 넣어주면 오류 발생
        this.name = name;

        switch (name) {
            case "강아지" :
                this.legs = 4;
                break;
            case "고양이" :
                this.legs = 4;
                break;
            case "참새" :
                this.legs = 2;
                break;
            case "호랑이" :
                this.legs = 4;
                break;
        }
    }
}
