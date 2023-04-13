public class Animal {
    String name; // 동물 이름(종류)
    String color; // 동물 색상

    String cry; // 동물 울음소리, 멍멍, 야옹, 짹짹, 어흥
    String feed; // 동물 먹이, Herbivore(초식), Carnivore(육식)

    public Animal(String name, String color) { // 생성자
        this.name = name;
        this.color = color;
    }

    String animalCry() {
        switch (name) {
            case "강아지" :
                cry = "멍멍";
                break;
            case "고양이" :
                cry = "야옹";
                break;
            case "참새" :
                cry = "짹짹";
                break;
            case "호랑이" :
                cry = "어흥";
                break;
        }
        return cry;
    }

    String animalFeed() {
        if(name == "호랑이") {
            feed = "육식동물";
        }
        if(name == "강아지" || name == "고양이") {
            feed = "잡식동물";
        }
        if(name == "참새") {
            feed = "초식동물";
        }
        return feed;
    }
}
