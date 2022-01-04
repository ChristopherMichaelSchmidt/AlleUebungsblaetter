package Klausur2;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer {
    private HashMap<String, Integer> result;

    public CountryAnalyzer() {
        result = new HashMap<>();
    }

    @Override
    public void analyze() {
        for(Person person : getPersons()){
            if(result.containsKey(person.getCountry())){
                Integer help = result.get(person.getCountry());
                help = help +1;
                result.put(person.getCountry(), help);
            }
            else result.put(person.getCountry(), 1);

        }

    }

    public HashMap<String, Integer> getResult() {
        return result;
    }
}
