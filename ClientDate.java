public class ClientDate {
    public static void main (String [] args){
        Date d1 = new Date (1,1,2022);
        Date d2 = new Date(1,1,2022);
        System.out.println(d1.toString());
        System.out.println(Date.dernierJourDuMois(2,2008));
        System.out.println(d1.estValide());
        //Date d2 = Date.lireDate();
        //System.out.println(d2.toString());
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.dateDuLenDemain());
        System.out.println(d2.dateDeLaVeille());
        }
}