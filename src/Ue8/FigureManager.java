package Ue8;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

    public ArrayList<Figure> figures = new ArrayList<>();


    public void add(Figure f){

        figures.add(f);
    }

    public double getMaxPerimeter(){
        double hilf = 0.0;
        for(Figure figure: figures){
            if(hilf<figure.getPerimeter()){
                hilf = figure.getPerimeter();
            }

        }
        return hilf;

    }

    public double getAverageSize(){
        double hilf = 0.0;
        int count = 0;
        for(Figure figure: figures){
            hilf = hilf + figure.getArea();
            count++;



        }
        return hilf/(double) count;

    }

    public HashMap<String, Double> getAreaBySizeCategories(){
        HashMap<String, Double> hilf = new HashMap<>();
        hilf.put("Klein", 0.0);
        hilf.put("Mittel", 0.0);
        hilf.put("Groß", 0.0);


        for(Figure figure: figures){
            if(figure.getArea()>=5000){
                double temp  = hilf.get("Groß");
                hilf.put("Groß", temp + figure.getArea());

            }
            else if(figure.getArea()>=1000){
                double temp = hilf.get("Mittel");
                hilf.put("Mittel", temp + figure.getArea());

            }
            else if(figure.getArea()<1000){
                double temp = hilf.get("Klein");
                hilf.put("Klein", temp + figure.getArea());


            }



        }
        return hilf;










    }








}
