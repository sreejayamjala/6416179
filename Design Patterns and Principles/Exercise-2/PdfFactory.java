public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PDFDocument();
    }
}
