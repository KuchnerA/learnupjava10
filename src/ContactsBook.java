import java.util.*;

public class ContactsBook {

    Map<String, Contact> map = new HashMap<>();

    public void add(Contact contact) {
        map.put(contact.getPhone(), contact);
    }

    public Contact getByPhone(String phone) {

        if (map.containsKey(phone)) {
            return map.get(phone);
        }
        return null;
    }

    public void removeByPhone(String phone) {

        if (map.containsKey(phone)) {
            map.remove(phone);
            return;
        }
        throw new PhoneException(phone);
    }

    public List<Contact> returnContactsBook() {
        List<Contact> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list;
    }

}

