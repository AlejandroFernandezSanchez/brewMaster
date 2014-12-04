
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
    
   public void beberCopa(Cubata copa)
   {
       if (sangre<=limite)
       {
      sangre = sangre + copa.getAlcohol();
    }
       else
       {
           System.out.println("No tíos que me va dar algo si bebo más");
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
    

