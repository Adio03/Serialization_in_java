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
        Address address = new Address();
        GeographicalLocation geographicalLocation = new GeographicalLocation();
        Company company = new Company();
        user.setName("wale");
        user.setUsername("maven");
        user.setEmail("adio@gmail.com");
        address.setStreet("sabo street");
        address.setSuite("suite-242");
        address.setCity("Lagos");
        address.setZipcode("746-222");
        geographicalLocation.setLongitude("-120.7677");
        geographicalLocation.setLongitude("-43.9509");
        address.setGeographicalLocation(geographicalLocation);
        user.setAddress(address);
        user.setPhoneNumber("09011223344");
        user.setWebsite("www.maven.com");
        company.setName("Classicas");
        company.setBusinessService("Ventures");
        company.setCatchPhrase("layered client-server");
        user.setCompany(company);
        users.add(user);
//        for (User user:users) {
//            user.setName("Ebuki");
//            users.add(user);
            System.out.println(users);

        }
    }

