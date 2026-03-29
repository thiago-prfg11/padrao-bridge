package Classes;

public class Volvo extends Fabricante {
    public Volvo(float mediaBase){
        super(mediaBase);
    }

    public float calcularMedia(){
        return this.mediaBase * (1.0f + this.proconve.percentualAumentoMedia());
    }
}