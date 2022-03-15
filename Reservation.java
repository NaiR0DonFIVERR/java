public class Reservation implements Comparable <Reservation>{ // permet de savoir que c'est super charger 
    private String ChTitle;
    private DateCalendrier ChDate;
    private PlageHoraire ChPH;
    public Reservation(String parTitre, DateCalendrier parDate, PlageHoraire parPH){
        ChTitle=parTitre;
        ChDate=parDate;
        ChPH=parPH;
    }
    public int compareTo(Reservation parReserv){
        if(ChDate.compareTo(parReserv.ChDate) !=0){
            return ChDate.compareTo(parReserv.ChDate);
        }
        return ChPH.compareTo(parReserv.ChPH);
    }
    public String toString(){
        return ChTitle + " " + ChDate.toString() + " " + ChPH.toString();
    }
    public DateCalendrier getDate(){
        return ChDate;
    }
    public String getTitre(){
        return ChTitle;
    }
}