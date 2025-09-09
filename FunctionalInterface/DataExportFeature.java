package functionalInterface;

interface DataExporter {
 void export(String data);

 default void exportToJSON(String data) {
     System.out.println("Exporting data to JSON: { \"data\": \"" + data + "\" }");
 }
}
class CSVExporter implements DataExporter {
 public void export(String data) {
     System.out.println("Exporting data to CSV: " + data);
 }
}
class PDFExporter implements DataExporter {
 public void export(String data) {
     System.out.println("Exporting data to PDF: " + data);
 }
}

public class DataExportFeature {
 public static void main(String[] args) {
     DataExporter csv = new CSVExporter();
     csv.export("Report Data");
     csv.exportToJSON("Report Data"); 
     DataExporter pdf = new PDFExporter();
     pdf.export("Invoice Data");
     pdf.exportToJSON("Invoice Data");
 }
}
