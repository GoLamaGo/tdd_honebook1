import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private final Map<String, Long> phonebook = new HashMap<>();

    public int add(String name, Long phone) {
        phonebook.put(name, phone);
        return phonebook.size();
    }

}
