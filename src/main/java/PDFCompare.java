import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.fit.pdfdom.PDFDomTree;

import java.io.*;
import java.util.*;





public class PDFCompare {

    public static void main(String[] args) {


        String src = "src/main/resources/PDF/test11.pdf";

        System.out.println("현재 경로" + System.getProperty("user.dir"));


        COSDocument cosDoc = null;

        File file = new File(src);



        System.out.println("file = " + file.getAbsolutePath());

        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("src/main/resources/PDF/tete1.pdf"));
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, new FileInputStream("src/main/resources/PDF/tt.html"));
            //document.close();
        }catch(Exception e) {
            e.printStackTrace();
        }




//        try {
//            PDDocument pdfDoc = PDDocument.load(file);
//            Writer output = new PrintWriter("src/main/resources/PDF/tt.html", "utf-8");
//            String text = new PDFTextStripper().getText(pdfDoc);
//            new PDFDomTree().writeText(pdfDoc, output);
//            System.out.println("pdfDoc = " + text);
//
//        }catch(IOException e) {
//            e.printStackTrace();
//        }



//        try{
//            File file = new File(src);
//            InputStream is = new FileInputStream(file);
//            cosDoc = parseDocument(is);
//            PDFTextStripper striper = new PDFTextStripper();
//            text = striper.getText(new PDDocument(cosDoc));
//            System.out.println(text);
//        }catch(IOException e){
//            e.printStackTrace();
//        }


//        System.out.println(fullPath + " PDF files parsing and converting TXT files.");
//
//
//        File file = new File(fullPath);
//
//        String[] files = file.list();             // list its files
//        Arrays.sort(files);                       // sort the files
//        for (int i = 0; i < files.length; i++) {          // recursively index them
//
//            String fileName = files[i];
//            if ((new File(fullPath+fileName)).isDirectory()) continue;
//
//
//            System.out.println(fileName);
//            try{
//                InputStream in = new FileInputStream(new File(fullPath+fileName));
//
//                String text = null;
//                PDFParser pdfp = new PDFParser(in);
//                pdfp.parse();
//
//                PDDocument pdd = pdfp.getPDDocument();
//                COSDocument cos = pdfp.getDocument();
//                PDFTextStripper pdfts = new PDFTextStripper();
//                //PDDocumentInformation pddi = pdd.getDocumentInformation();
//
//                pdfts.setLineSeparator("\n");
//                pdfts.setWordSeparator(" ");
//
//                text = pdfts.getText(pdd);
//
//
//                cos.close();
//                pdd.close();
//
//                BufferedWriter bw = new BufferedWriter(new FileWriter(fullPath+"txt/"+fileName.substring(0,fileName.length()-3)+"txt"));
//
//                bw.write(text);
//                bw.close();
//            } catch (Exception e) {
//                System.out.println("error : " + e);
//            }
//
//        }
//
//        System.out.println("finished! : " + (files.length-1) + " files created.");

    }

//    private static COSDocument parseDocument(InputStream is) throws IOException {
//        PDFParser parser = new PDFParser();
//        parser.parse();
//
//        return parser.getDocument();
//    }

}
