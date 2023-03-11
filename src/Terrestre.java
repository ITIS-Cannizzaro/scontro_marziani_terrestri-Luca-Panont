
public class Terrestre {

	String nome;
    int vita, vel, arm;

    Terrestre(){
        nome="sconosciuto";
        vita=50;
        vel=5;
        arm=5;
        Statistiche.incTerrestri();
        System.out.print("\nIl Terrestre " + nome + " entra in gioco");
    }

    Terrestre(String nome, int[] param){
        this.nome= nome;
        vita= param[0];
        vel= param[1];
        arm= param[2];
        Statistiche.incTerrestri();
        System.out.print("\nIl Terrestre " + nome + " entra in gioco");
    }
    
    boolean vivente(){
        if(vita > 0)
            return true;
        else
            return false;
    }

    public String toString(){
        return "\nNome: " + nome + "\nVita: " + vita + "\nVelocità: " + vel + "\nArmamento: " + arm;
    }

    void attaccaMarziani(Marziano x){
        if(!vivente())
            System.out.println("Impossibile, sono morto!");
        else{
            if(Statistiche.getNumMarziani() <= Statistiche.getNumTerrestri()) {
                x.auton = x.auton - 20 + 2 * x.ai + x.tecn;
                System.out.println("\nKen attacca x102! \nStato di vita del marziano: " + x.attivo() + "\nAutonomia: " + x.auton);
            }else
                System.out.println("Terrestre " + nome + ". Sconveniente!");
        }
    }

    boolean equals(Terrestre x){
        if(x.vita == vita && x.vel == vel && x.arm == arm)
            return true;
        else
            return false;
    }
}
