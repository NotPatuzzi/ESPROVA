
/**
 * Aggiungi qui una descrizione della classe Furgone
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Furgone extends Veicolo{
    private int capacita;

    /**
     * Costruttore degli oggetti di classe  Furgone
     */
    public Furgone(String targa, String modello, int tariffa, int capacita){
        super(targa, modello, tariffa);
        this.capacita=capacita;
    }
    
    public Furgone(){
        
        this.capacita=0;
    }
    
    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    
    public int getCapacita(){return this.capacita;}
    
    public void setCapacita(int capacita){this.capacita=capacita;}
    
    public String toString(){
        return super.toString()+" capacita: "+getCapacita()+"kg";
    }
    
}
