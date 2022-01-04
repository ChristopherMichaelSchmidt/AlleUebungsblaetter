package Klausur2;

public class GenderAnalyzer extends PersonAnalyzer{
    @Override
    public void analyze() {
        int countMen=0;
        int countWomen=0;
        int men=0;
        int women = 0;
        for(Person person: getPersons()){
            if(person.getGender() == 'F'){
                women = women + person.getSize();
                countWomen++;
            }
            if(person.getGender() =='M'){
                men = men + person.getSize();
                countMen++;
            }

        }
        System.out.println("Männer"+ countMen +"Durchschnittliche größe" + men/countMen);
        System.out.println("Männer"+ countWomen +"Durchschnittliche größe" + women/countWomen);


            }
}
