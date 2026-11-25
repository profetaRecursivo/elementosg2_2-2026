
public class Maquina
{
    private Gancho<PapaFrita> ganchoP;
    private Gancho<Gomita> ganchoG;
    private Gancho<Nacho> ganchoN;
    private boolean alarma;
    private int X;
    
    public Maquina(int X){
        ganchoP = new Gancho<PapaFrita>();
        ganchoG = new Gancho();
        ganchoN = new Gancho();
        alarma = false;
        this.X = X;
    }
    
    
    public Producto vender(Producto deseado){
        Producto res = null;
        if(deseado instanceof PapaFrita){
            res = ganchoP.decolar();
            if(ganchoP.tamano() < X){
                alarma = true;
            }
        }else if(deseado instanceof Nacho){
            res = ganchoN.decolar();
            if(ganchoN.tamano() < X){
                alarma = true;
            }
        }else if(deseado instanceof Gomita){
            res = ganchoG.decolar();
            if(ganchoG.tamano() < X){
                alarma = true;
            }
        }
        return res;
    }
}