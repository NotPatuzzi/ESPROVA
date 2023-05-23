
/**
 * Aggiungi qui una descrizione della classe Automobile
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Automobile extends Veicolo{
    private int posti;

    /**
     * Costruttore degli oggetti di classe  Automobile
     */
    public Automobile(String targa, String modello, int tariffa, int posti){
        super(targa, modello, tariffa);
        this.posti=posti;
    }
    
    public Automobile(){
        
        this.posti=0;
    }
    
    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    
    public int getPosti(){return this.posti;}
    
    public void setPosti(int posti){this.posti=posti;}
    
    public String toString(){
        return super.toString()+" posti: "+getPosti();
    }
}
