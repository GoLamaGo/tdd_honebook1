import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PhoneBookTest {

    @Test
    public void addOnePhone() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add(),"Должен вернуться один номер");
    }

    @Test
    public void addTwoEqualsPhomnes(){
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1,phoneBook.add(),"Должен вернуться один номер, дубли не храним");
    }

}
