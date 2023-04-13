public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("강아지", "흰색"); // 객체 생성

        System.out.println(animal.color + animal.name + "는 " + animal.animalCry() + "하고 웁니다.");
        System.out.println(animal.color + animal.name + "는 " + animal.animalFeed() + "입니다.");

        Flys flys = new Flys("호랑이", "노란색"); // 자식클래스 객체 생성
        if(flys.canFly() == true) {
            System.out.println(flys.name + "는 날 수 있습니다.");
        }
        else {
            System.out.println(flys.name + "는 날 수 없습니다.");
        }

        Legs legs = new Legs("참새", "갈색"); // 자식클래스 객체 생성
        System.out.println(legs.color + legs.name + "의 다리 개수는 " + legs.legs + "개 입니다.");

    }
}
