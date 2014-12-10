
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{   
   
   private int sangre;
   
   private int limite;      
   
   public Bebedor( int limite)
   {       
       sangre= 0;
       this.limite=limite;        
    } 
    
   /**
    * Elige bebida y los ml que va a tomar de ella.
    */ 
   public void beberCopa(Cubata copa, int ml)
   {
           if (sangre<=limite)
           {
          sangre = sangre + (copa.getGraduacion()/100)*ml;
        }
           else
           {
               System.out.println("No, ya estoy borracho :)");
            }
    }
   
    
    public void preguntar(String pregunta)
    {       
            if(!(sangre>=limite)) 
        {       
            if (pregunta.length()%2==0)
            {
                System.out.println("Si");
            }
            else
            {
                System.out.println("No");
            }
        }
        else
        {
            System.out.println(pregunta.toUpperCase());
        }
    }
    }
    

