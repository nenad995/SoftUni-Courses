import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Nenad", 5);
        map.put("Milica", 6);
        map.put("Nex", 5);
        map.put("Milan", 4);

        //Взимаме entry на map-а и по него пускаме stream
        //Върху stream-а извикваме метода sorted()
        //В sorted() метода създаваме два елемента (element1 и element2) и върху тях прилагаме компарация със символа "->"
        //За да може да подреди елементите правиме сравнение:
        //- ако числото е негативно редът е възходящ
        //- ако числото е позитивно редът е низходящ
        //- ако числото е 0 елементите са еднакви
        //Понеже сравняваме оценки, за две еднакви оценки сравняваме и ключовете, т.е. имената на студентите
        //След сравненията минаваме през всеки елемент от stream-a и принтираме му ключа и оценката
        map.entrySet().stream().sorted(
                (element1, element2) -> {
                    int result = element1.getValue() - element2.getValue();

                    if (result == 0){
                        result = element1.getKey().compareTo(element2.getKey());
                    }
                    return result;
                }
        ).forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
