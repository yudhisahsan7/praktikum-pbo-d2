

public class Data<T extends Kupu> {
    private T kupu;

    public T getIsi() {
        return kupu;
    }

    public void setIsi(T faseKupu) {
        kupu = faseKupu;
    }

    public void gerak() {
        kupu.gerak();
    }
}
