import java.util.*;
public class Examen {
    public static void main(String[] args) {
        //definir mis variables 
        Scanner leer = new Scanner(System.in); // el leer es para que pueda leer mis variables definidad por el string 
        String respuesta, multijugador, graficos ;
        
        //hago mi pregunta
        System.out.println("de que genero quieres tus juegos?? ");
        System.out.println("tengo de aventura, deportes y estrategia");
        respuesta = leer.nextLine();
        //el while es para palabras y lo pongo despues de la pregunta porque ahi quiero que identifique mis respuestas 
        while (true) {
            if (respuesta.equals("aventura") || respuesta.equals("deportes") || respuesta.equals("estrategia")) {
                System.out.println("esta bien permiteme un segundo");
                break;// es para salirse del ciclo cuando ya se haya cumplido la condicion
                
            }else{
                System.out.println("no tengo eso en mi catalogo");
                System.out.println("de que genero quieres tus juegos?? ");
                System.out.println("tengo de aventura, deportes y estrategia");
                respuesta = leer.nextLine();
            }
        } 
      //mi segunda pregunta
        System.out.println("quieres que sea multijugador ??");
        multijugador = leer.nextLine();
        if (multijugador.equals("si")) {
            System.out.println("esta bien");
        }else {
            System.out.println("ok un juego solo para ti ");

        }
        // mi tercera pregunta
        System.out.println("quieres que tenga graficos de alta calidad ???");
        graficos = leer.nextLine();
        if (graficos.equals("si")) {
            System.out.println("ok preparando los mejores juegos");

        }else{
            System.out.println("ok sin graficos de alta calidad");
        }
            //else if pregunta por otra condicion

        if (respuesta.equals("aventura")&& graficos.equals("si")) {
            System.out.println("te recomiendo este juego llamado The Legend of the Crystal Cave");
        }else if (respuesta.equals("estrategia")&& multijugador.equals("si")) {
            System.out.println("te recomiendo Galactic Conquerors");
        } else if (respuesta.equals("deporte")&& multijugador.equals("si")&& graficos.equals("si") ){
            System.out.println("te recomiendo Pro League Soccer 2024");
        }else {
            System.out.println("Explora nuestro catálogo para más opciones");
        }
        //cerrar leer 
        leer.close();  
        }
    }

        
    
