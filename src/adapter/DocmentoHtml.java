package adapter;

public class DocmentoHtml implements Documento {

    protected String contenido;

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void dibuja() {
        System.out.println("Dibuja el documento HTML: "
                + contenido);
    }

    public void imprime() {
        System.out.println("Imprime el documento HTML: "
                + contenido);
    }
}
