public class ClientPlaning {
    public static void main(String[]args){
        Reservation r1 = new Reservation("Coach Sigma B.", new DateCalendrier(19,06,2022), new PlageHoraire(new Horaire(14, 30),new Horaire(15, 30)));
        Reservation r2 = new Reservation("Coach Sigma B.", new DateCalendrier(21,06,2022), new PlageHoraire(new Horaire(16,20), new Horaire(17,45)));
        Reservation r3 = new Reservation("Coach Badel S.", new DateCalendrier(1,05,2022), new PlageHoraire(new Horaire(10,9), new Horaire(13,15)));
        Reservation r4 = new Reservation("Coach Badel S.", new DateCalendrier(28,06,2022), new PlageHoraire(new Horaire(17,27), new Horaire(19,00)));
        Reservation r5 = new Reservation("Coach Igo O.", new DateCalendrier(21,05,2022), new PlageHoraire(new Horaire(9,10), new Horaire(12,05)));
        Reservation r6 = new Reservation("Coach Igo O.", new DateCalendrier(11,06,2022), new PlageHoraire(new Horaire(13,20), new Horaire(20,45)));
        //System.out.println(r1.toString() + "\n" + r2.toString() + "\n" + r3.toString()+ "\n" + r4.toString()+ "\n" + r5.toString()+ "\n" + r6.toString());
        //System.out.println(r1.compareTo(r2));
        Planing p1 = new Planing(6);
        p1.ajout(r1);
        p1.ajout(r2);
        p1.ajout(r3);
        p1.ajout(r4);
        p1.ajout(r5);
        p1.ajout(r6);
        System.out.println(p1.toString());
        System.out.println(p1.getReservation(new Date(1,01,22)));
        System.out.println(p1.getReservations(new Date(1,03,22)));
    }
}