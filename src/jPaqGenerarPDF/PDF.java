package jPaqGenerarPDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class PDF {

    public boolean gemerarPDF(String varMatrizReporte[][], String varTitulo, String varRuta) {
        Document documento = new Document();
        Font objFuente = new Font();
        objFuente.setSize(9);
        try {
            String ruta = System.getProperty("user.home");
System.out.println(ruta + varRuta);
            PdfWriter.getInstance(documento, new FileOutputStream(ruta +  varRuta));
            
            documento.open();

            try {
                //Obtenemos la instancia de la imagen/logo.
                Image imagen = Image.getInstance("C:\\Users\\estiven\\Desktop\\univalle 3 semetre\\proyectos en java\\proyecto\\iconos\\logo.png");
                //Alineamos la imagen al centro del documento.
                imagen.setAlignment(Image.ALIGN_CENTER);
                //Agregamos la imagen al documento.
                documento.add(imagen);
            } catch (Exception e) {
                System.err.println("Error 1");
            }

            //Creamos un párrafo nuevo llamado "vacio1" para espaciar los elementos.
            Paragraph vacio1 = new Paragraph();
            vacio1.add("\n\n");
            documento.add(vacio1);

            //Declaramos un texto llamado "titulo" como Paragraph. 
            //Le podemos dar formato alineado, tamaño, color, etc.
            Paragraph titulo = new Paragraph();
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            titulo.setFont(FontFactory.getFont("Times New Roman", 24, Font.BOLD, BaseColor.RED));
            titulo.add(varTitulo);

            try {
                //Agregamos el texto "titulo" al documento.
                documento.add(titulo);
            } catch (Exception e) {
                System.err.println("Error 2");
            }

            //Creamos un párrafo nuevo llamado "saltolinea1" simulando un salto de linea para espaciar
            //los elementos del PDF.
            Paragraph saltolinea1 = new Paragraph();
            saltolinea1.add("\n\n");
            documento.add(saltolinea1);

            PdfPTable tabla = new PdfPTable(7);
            tabla.addCell((new Paragraph("CODIGO FACTURA", objFuente)));
            tabla.addCell((new Paragraph("PLACA", objFuente)));
            tabla.addCell(new Paragraph("VEHICULO", objFuente));
            tabla.addCell(new Paragraph("COSTO", objFuente));
            tabla.addCell(new Paragraph("HORA DE INGRESO", objFuente));
            tabla.addCell(new Paragraph("HORA DE SALIDA", objFuente));
            tabla.addCell(new Paragraph("FECHA REGISTRO", objFuente));
            for (int i = 0; i < varMatrizReporte.length; i++) {
                for (int j = 0; j < 7; j++) {
                    tabla.addCell(new Paragraph(varMatrizReporte[i][j], objFuente));
                }
            }
            documento.add(tabla);
            documento.close();
            return true;
        } catch (Exception e) {
            System.err.println("Error");
        }
        return false;
    }
}
