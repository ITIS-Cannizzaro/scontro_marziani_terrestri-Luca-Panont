
public class Main {
	public static void main(String[] args){
        System.out.println("INIZIO DEL GIOCO!");
        Marziano mar1= new Marziano();
        Terrestre ter1= new Terrestre();


        int[] parametriMar= {50, 5, 5};
        int[] parametriTerr= {75, 10, 6};
        
        Marziano x102= new Marziano("x102", parametriMar);
        Terrestre ken= new Terrestre("Ken", parametriTerr);


        System.out.println("\n\nConfronto terrestri: ");
        if(ter1.equals(ken) == true)
            System.out.println("I due terrestri si equivalgono!");
        else
            System.out.println("I due terrestri non si equivalgono!");

        System.out.println("\nConfronto marziani: ");
        if(mar1.equals(x102) == true)
            System.out.println("I due marziani si equivalgono!");
        else
            System.out.println("I due marziani non si equivalgono!");
        
        System.out.println();

        ken.toString();
        x102.toString();

        for(int i= 0; i < 2; i++){
            ken.attaccaMarziani(x102);
            x102.attaccaTerrestri(ken);
        }
        System.out.println("\n\nIL GIOCO È TERMINATO!");
    }
}

