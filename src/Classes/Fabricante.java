package Classes;

import Interface.Proconve;

public abstract class Fabricante {
    protected Proconve proconve;

    protected float mediaBase;

    public Fabricante(float mediaBase) {
        this.mediaBase = mediaBase;
    }

    public void setProconve(Proconve proconve) {
        this.proconve = proconve;
    }

    public abstract float calcularMedia();
}
