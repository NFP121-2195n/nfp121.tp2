package question2;


/**
 * Classe qui assure la conversion des valeurs de Fahrenheit en Celsius
 * avec gestion de l'exception "NumberFormatException".
 * 
 * @author (Jessica Bassil) 
 * @version (1.0)
 */
public class FahrenheitCelsius{

    /**
     * Cette fonction prend en ligne de commande des valeurs entieres dans
     * des String et les converties en Integer.
     * 
     * Ces valeurs representent les valeurs en degres Fahrenheit qui seront
     * converties en degres Celcius.
     * 
     * Les valeurs en Celcius seront affichees.
     * 
     * Note: L’exception “NumberFormatException” est levée lors d’une
     *       mauvaise entrée sur la ligne de commande i.e. d’une entrée 
     *       autre qu’une chaîne convertible en “int”
     * 
     * @param args
     *            les valeurs en degres Fahrenheit a convertir
     */
    public static void main(String[] args){
        int fahrenheit = 0;
        float celsius = 0;
        
        for(int i=0; i<args.length; i++){
            try{
                fahrenheit = Integer.parseInt(args[i]);
                celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
            } catch(NumberFormatException nfe){
               System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
            }
        }
        
    }
    
     
    /** 
     * Conversion d'une valeur Fahrenheit en Celsius.
     * Notant que le resultat est avec un seul chiffre derniere la virgule.
     * 
     * @param f la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius( int f){
        float div = 5.0F/9.0F;
        float res = (float)(f-32)*div;
        res = (int)(res*10)/10.0F;
        return res;
    }

}
