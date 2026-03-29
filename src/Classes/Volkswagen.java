package Classes;

public class Volkswagen extends Fabricante {
    public Volkswagen(float mediaBase){
        super(mediaBase);
    }

    public float calcularMedia(){
        return this.mediaBase * (1.0f + this.proconve.percentualAumentoMedia());
    }
}
