
public class Marziano {
	int auton, ai, tecn; 
	String matricola;

    Marziano(){
        matricola= "indefinito";
        auton= 50;
        ai=5;
        tecn=5;
        Statistiche.incMarziani();
        System.out.print("\nIl Marziano " + matricola + " entra in gioco.");
    }
    Marziano(String matricola, int[] param){
        this.matricola= matricola;
        auton= param[0];
        ai=param[1];
        tecn= param[2];
        Statistiche.incMarziani();
        System.out.print("\nIl Marziano " + matricola + " entra in gioco.");
    }
    
    boolean attivo(){
        if(auton > 0)
            return true;
        else
            return false;
    }

    public String toString(){
        return "\nMatricola: " + matricola + "\nAutonomia: " + auton + "\nAI: " + ai +"\nTecnologia: " + tecn;
    }

    void attaccaTerrestri(Terrestre x){
        if(!attivo())
            System.out.println("Impossibile, sono morto");
        else{
            if(Statistiche.getNumMarziani()>= Statistiche.getNumTerrestri()) {
                x.vita = x.vita - 20 + 2 * x.vel + x.arm;
                System.out.println("\nx102 attacca Ken! \nStato di vita del terrestre: " + x.vivente() + "\nTotale vita: " + x.vita);
            }else
                System.out.println("Marziano " + matricola + ". Non mi conviene attaccare!");
        }
    }

    boolean equals(Marziano x){
        if(x.auton == auton && x.ai == ai && x.tecn == tecn)
            return true;
        else
            return false;
    }
}

