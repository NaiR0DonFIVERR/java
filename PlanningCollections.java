import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;

public class PlanningCollections {
    private ArrayList <Reservation> chListeReservation = new ArrayList<Reservation>();
    private TreeSet <Reservation> chTreeReservation  = new TreeSet<Reservation>();
    private TreeMap <Integer, TreeSet<Reservation>> chMap = new TreeMap <Integer, TreeSet<Reservation>>();

    public void ajoutMap (Reservation parReserv){
        int noSem=parReserv.getDate().getNoSem(); // ajouter la methosde getnosem dans date calendrier
        if (chMap.containsKey(noSem)){
            TreeSet<Reservation> leset = chMap.get(noSem);
            leset.add(parReserv);
        }
        else{
            TreeSet<Reservation> nouv = new TreeSet<Reservation>();
            nouv.add(parReserv);
            chMap.put(noSem,nouv);
        }
    }
    
    public String toString() {
        //return "taille des listes est de " +  chListeReservation.size() +"\n"+ "Contenu de la liste ARRAY: "+chListeReservation.toString()+"\n"+"Contenu de la liste Treeset: "+ chTreeReservation.toString();
        String str = " " ;
        Set <Integer>cles = chMap.keySet();
        for(Integer cle:cles)
            str+=cle+":"+chMap.get(cle) +"\n";
        return str ;
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