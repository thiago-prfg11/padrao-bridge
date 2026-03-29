package Classes;

public class Mercedes extends Fabricante {
    public Mercedes(float mediaBase){
        super(mediaBase);
    }

    public float calcularMedia(){
        return this.mediaBase * (1.0f + this.proconve.percentualAumentoMedia());
    }
}
