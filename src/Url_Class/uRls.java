package Url_Class;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeBase;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class uRls {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            URI uri = new URI("https://jsonplaceholder.typicode.com/users");
            URL url = uri.toURL();
            InputStream stream = url.openStream();
            List<User> users = mapper.readValue(stream, new TypeReference<>() {
            });
            displayUsers(users);
            stream.close();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    private static void displayUsers(List<User> users){
        User user = new User();
        user.setName("wale");
        user.
        for (User user:users) {
//            user.setName("Ebuki");
//            users.add(user);
            System.out.println(user);

        }
    }
}
