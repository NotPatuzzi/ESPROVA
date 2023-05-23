
/**
 * Aggiungi qui una descrizione della classe Cliente
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Cliente{
    private String codiceFisc;
    private String nome;
    private String cognome;
    
    /**
     * Costruttore degli oggetti di classe  Cliente
     */
    public Cliente(String codiceFisc, String nome, String cognome){
        this.codiceFisc=codiceFisc;
        this.nome=nome;
        this.cognome=cognome;
    }
    
    public Cliente(){
        this.codiceFisc="";
        this.nome="";
        this.cognome="";
    }

    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    
    public String getCodiceFisc(){return this.codiceFisc;}
    public String getNome(){return this.nome;}
    public String getCognome(){return this.cognome;}
    
    public void setCodiceFisc(String codiceFisc){this.codiceFisc=codiceFisc;}
    public void setNome(String nome){this.nome=nome;}
    public void setCognome(String cognome){this.cognome=cognome;}
    
    public String toString(){
        return "\n codice fiscale: "+getCodiceFisc()+" nome: "+getNome()+" cognome: "+getCognome();
    }
}
