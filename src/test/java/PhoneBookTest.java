import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    public void addOnePhone() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Jon";
        long phone = 89031114422L;
        assertEquals(1, phoneBook.add(name, phone), "Должен вернуться один номер");
    }

    @Test
    public void addTwoEqualPhones() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Jon";
        long phone1 = 89031112222L;
        long phone2 = 89031114422L;

        assertEquals(1, phoneBook.add(name, phone1), "Должен вернуться один номер, дубли не храним");
        assertEquals(1, phoneBook.add(name, phone2), "Должен вернуться один номер, дубли не храним");
    }

    @Test
    public void findByNumberReturnsPhone() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Jon";
        long phone = 89031112222L;
        phoneBook.add(name, phone);
        assertEquals(Map.of(name, phone), phoneBook.findByNumber(phone));
    }

    @Test
    public void findByNameReturnsPhone() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Jon";
        long phone = 89031112233L;
        phoneBook.add(name, phone);
        assertEquals(Map.of(name, phone), phoneBook.findByName(name));
    }

}
