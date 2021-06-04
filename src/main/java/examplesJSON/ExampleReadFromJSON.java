package examplesJSON;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ExampleReadFromJSON {
  public static void main(String[] args) throws IOException, ParseException {
    // parsing file "JSONExample.json"
    Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));

    // typecasting obj to JSONObject
    JSONObject jsonObject = (JSONObject) obj;

    // getting firstName and lastName
    String firstName = (String) jsonObject.get("firstName");
    String lastName = (String) jsonObject.get("lastName");

    System.out.println(firstName);
    System.out.println(lastName);

    // getting age
    long age = (long) jsonObject.get("age");
    System.out.println(age);

    // getting address
    Map address = ((Map)jsonObject.get("address"));

    // iterating address Map
    Iterator<Entry> itr1 = address.entrySet().iterator();
    while (itr1.hasNext()) {
      Map.Entry pair = itr1.next();
      System.out.println(pair.getKey() + " : " + pair.getValue());
    }

    // getting phoneNumbers
    JSONArray ja = (JSONArray) jsonObject.get("phoneNumbers");

    // iterating phoneNumbers

    for (Object o : ja) {
      for (Entry pair : (Iterable<Entry>) ((Map) o).entrySet()){
        System.out.println(pair.getKey() + " : " + pair.getValue());
      }
    }
  }




}
