package test;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("1.)");
        System.out.println("Geburtsjahr 2006");
        System.out.println("a)");
        int geburtsjahr = 2006;
        if(geburtsjahr < 2006){
            System.out.println("Eintritt erlaut");
        }else{
            System.out.println("Eintritt nicht erlaubt");
        }
        System.out.println("");

        System.out.println("b)");
        if(geburtsjahr < 2006){
            System.out.println("Eintritt erlaut");
        }else if(geburtsjahr == 2006){
            System.out.println("Genaue Überprüfung des Geburtsjahrs ");
        }
        else{
            System.out.println("Eintritt nicht erlaubt");
        }
        System.out.println("");




        System.out.println("2.)");
        int kästen = 10;
        double kosten = (kästen * 12.29);
        if(kästen <= 49 && kästen >= 10){
            System.out.println("Sie erhalten einen Rabatt von 5%");
            kosten -= (kosten/100)*5;
        }
        else if(kästen >=50 && kästen <=99){
            System.out.println("Sie erhalten einen Rabatt von 7%");
            kosten -= (kosten/100)*7;
        }
        else if(kästen >= 100){
            System.out.println("Sie erhalten einen Rabatt vn 10%");
            kosten -= (kosten/100)*10;
        }
        System.out.println("Der Preis bei " + kästen + " Kisten beträgt somit " + kosten + "€.");




        System.out.println("");
        System.out.println("3.)");
        double gewicht = 73.5;
        double größe = 1.84;
        String gender = "Mann";
        System.out.println("Größe: " + größe + " Gewicht: " + gewicht + " Gender: " + gender);
        double bmi = gewicht / (größe * größe);
        System.out.println("Ihr BMI ist: " + bmi);
        if(gender == "Mann"){
            if(bmi < 20){
                System.out.println("Untergewicht");
            }
            else if(bmi >= 20 && bmi <=25){
                System.out.println("Normalgewicht");
            }
            else if(bmi >= 26){
                System.out.println("Übergewicht");
            }
        }
        else if(gender == "Frau"){
            if(bmi < 19){
                System.out.println("Untergewicht");
            }
            else if(bmi >= 19 && bmi <=24){
                System.out.println("Normalgewicht");
            }
            else if(bmi >= 25){
                System.out.println("Übergewicht");
            }
        }
    }
}
