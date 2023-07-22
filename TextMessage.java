public class TextMessage {
    public String text = " said that Java fucking is heavy, just fucking";
    public String name = "";
    public String modifiedText = text.replace("fucking", "******g");

    // Конструктор по умолчанию.
    TextMessage (){

    }
    // Конструктор с одним аргументом.
    public TextMessage (String personsName) {
        name = personsName;


    }
}
