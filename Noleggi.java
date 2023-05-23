import java.util.*;
class NoleggioPieno extends Exception{
    
}
class VeicoloInesistente extends Exception{
    
}
class NoleggioVuoto extends Exception{
    
}
/**
 * Aggiungi qui una descrizione della classe Noleggi
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Noleggi{
    private static int MAXL=10;
    private Cliente c;
    private int numGiorni;
    public Noleggi(int numGiorni){
        this.numGiorni=numGiorni;
    }
    public int getNumGiorni(){return this.numGiorni;}
    public void setNumGiorni(int numGiorni){this.numGiorni=numGiorni;} 
    private Noleggi n;
    
    HashMap<String,Veicolo> veicoli;
    public Noleggi(){
        veicoli=new HashMap<String,Veicolo>(MAXL);
    }
    
    public void aggiungi(Veicolo v) throws NoleggioPieno{
        if(veicoli.size()>=MAXL){
            throw new NoleggioPieno();
        }else{
            veicoli.put(v.getTarga()+c.getCodiceFisc()+n.getNumGiorni(),v);
        }
    }
    
    public void rimuovi(Veicolo v) throws VeicoloInesistente{
        if(!(veicoli.containsKey(v.getTarga()))){
            throw new VeicoloInesistente();
        }else{
            veicoli.remove(v.getTarga());
        }
    }
    
    public String stampa(){
        String stampare=" ";
        for(Veicolo v:veicoli.values()){
            stampare+=v.toString();
        }
        return stampare;
    }
    
    public boolean carca(Veicolo v) throws NoleggioVuoto{
        if(veicoli.isEmpty()){
            throw new NoleggioVuoto();
        }else{
            return veicoli.containsKey(v.getTarga());
        }
    }
}
