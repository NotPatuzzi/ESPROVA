
/**
 * Aggiungi qui una descrizione della classe Test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Test{
    public static void main(String[] args) throws listaVuota, NoleggioPieno,VeicoloInesistente,NoleggioVuoto{
        Automobile a1=new Automobile("AX743HJ","Fiat Panda",55,4);
        Automobile a2=new Automobile("GJ924LR","Fiat Punto",60,5);
        Furgone f1=new Furgone("TY467WE","Fiat Ducato",125,750);
        Cliente c1=new Cliente("NREFBA76A01L219J","Fabio","Neri");
        Cliente c2=new Cliente("RSSMRA80A01L219M","Marco","Rossi");
        Lista l=new Lista();
        //l.aggiungiAllaLista(a1);
        System.out.println(l.stampaLista());
        
        
    }
}
