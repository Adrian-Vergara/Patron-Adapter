package adapter;

public class Adapter {

    public static void main(String[] args) {

        Documento documento1, documento2;
        documento1 = new DocmentoHtml();
        documento1.setContenido("QUE HONDA WEY");
        documento1.dibuja();
        System.out.println();
        
        documento2 = new DocumentoPdf();
        documento2.setContenido("QUE HONDA WEY");
        documento2.dibuja();

    }

}
