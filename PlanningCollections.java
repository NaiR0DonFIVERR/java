import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class PlanningCollections {
    private ArrayList <Reservation> chListeReservation = new ArrayList<Reservation>();
    private TreeSet <Reservation> chTreeReservation  = new TreeSet<Reservation>();

    public String toString() {
        return "taille des listes est de " +  chListeReservation.size() +"\n"+ "Contenu de la liste ARRAY: "+chListeReservation.toString()+"\n"+"Contenu de la liste Treeset: "+ chTreeReservation.toString();
    }
    public void ajout(Reservation parReserv){
        chListeReservation.add(parReserv);
        chTreeReservation.add(parReserv);   // "Implements comparable" sur les class Reservation , DateCalendrier  , PlageHoraire
    }
    public TreeSet<Reservation> getReserv(DateCalendrier parDate){
        TreeSet <Reservation> unSet = new TreeSet<Reservation>();
        Iterator <Reservation> it = chTreeReservation.iterator();
        while(it.hasNext()){
            Reservation r = it.next();
            if (r.getDate().compareTo(parDate)==0)
                unSet.add(r);
        }
        if (unSet.size()==0)
            return null;
        return unSet;
    }
    public TreeSet<Reservation> getReserv(String parString){
        TreeSet <Reservation> unSetz = new TreeSet<Reservation>();
        Iterator <Reservation> it = chTreeReservation.iterator();
        while(it.hasNext()){
            Reservation r2 = it.next();
            if (r2.getTitre().equals(parString)){
                unSetz.add(r2);
            }
        }
        if (unSetz.size()==0)
            return null;
        return unSetz;
        
    }
    
}   