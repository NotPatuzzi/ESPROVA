import java.util.*;
class listaVuota extends Exception{
    
}
/**
 * Aggiungi qui una descrizione della classe Lista
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Lista{
    LinkedList<Noleggi> liste;

    /**
     * Costruttore degli oggetti di classe  Lista
     */
    public Lista(){
        liste=new LinkedList<Noleggi>();
    }
    
    public void aggiungiAllaLista(Noleggi n){
        liste.add(n);
    }
    
    public boolean daTogliere(Noleggi n) throws VeicoloInesistente{
        if(!(liste.contains(n))){
            throw new VeicoloInesistente();
        }else{
            return liste.remove(n);
        }
    }
    
    public String stampaLista() throws listaVuota{
        String stampa=" ";
        if(liste.isEmpty()){
            throw new listaVuota();
        }else{
            Iterator<Noleggi> itr=liste.iterator();
            while(itr.hasNext()){
                stampa+=itr.next().toString();
            }
        }
        return stampa;
    }
    
}
