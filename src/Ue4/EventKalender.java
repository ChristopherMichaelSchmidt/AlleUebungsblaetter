package Ue4;

import java.util.ArrayList;

public class EventKalender {
        private ArrayList<Event> events;

        public Event getByTitle(String title){

            for(Event event: events){
                if(event.getTitle()==title){
                    return  event;
                }
            }

            return null;
        }
        public ArrayList<Event> getByOrt(String ort){
            ArrayList<Event> hilf = new ArrayList<>();
            for (Event event:events){
                if(event.getOrt().equals(ort)){
                    hilf.add(event);
                }
            }
            return hilf;
        }

        public ArrayList<Event> getByEintrittsPreis(double min, double max){
            ArrayList<Event> hilf = new ArrayList<>();

            for (Event event:events){
                if(event.getEintrittsPreis()<=max && event.getEintrittsPreis()>= min){
                    hilf.add(event);
                }

            }
            return hilf;
        }
        public ArrayList<Event> getMostExpensiveByOrt(String ort){
            double hilf =  0.0;
            ArrayList<Event> hilf2= new ArrayList<>();
            for(Event event:events){
                if(event.getOrt().equals(ort) && hilf < event.getEintrittsPreis()){
                    hilf = event.getEintrittsPreis();
                }
            }
            for(Event event:events){
                if(event.getOrt().equals(ort) && event.getEintrittsPreis() == hilf){
                    hilf2.add(event);

                }

            }
            return hilf2;

        }
        public double getAvgPreisByORt(String ort){
            double hilf = 0.0;
            int count= 0;
            for(Event event:events){
                if(event.getOrt().equals(ort)){
                    hilf = hilf + event.getEintrittsPreis();
                    count++;

                }
            }
            return hilf/ (double)  count;


        }








}
