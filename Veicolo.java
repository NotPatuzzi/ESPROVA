
/**
 * Aggiungi qui una descrizione della classe Veicoli
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Veicolo{    
    private String targa;
    private String modello;
    private int tariffa;

    /**
     * Costruttore degli oggetti di classe  Veicoli
     */
    public Veicolo(String targa, String modello, int tariffa){
        this.targa=targa;
        this.modello=modello;
        this.tariffa=tariffa;
    }
    
    public Veicolo(){
        this.targa="";
        this.modello="";
        this.tariffa=0;
    }
    

    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    
    public String getTarga(){return this.targa;}
    public String getModello(){return this.modello;}
    public int getTariffa(){return this.tariffa;}
    
    public void setTarga(String targa){this.targa=targa;}
    public void setModello(String modello){this.modello=modello;}
    public void setTariffa(int tariffa){this.tariffa=tariffa;}
    
    public String toString(){
        return "\n targa: "+getTarga()+" modello: "+getModello()+" tariffa: "+getTariffa();
    }
}
