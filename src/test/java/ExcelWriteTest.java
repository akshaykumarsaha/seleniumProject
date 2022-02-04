import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteTest {
    public static void main (String args[]) throws IOException {
        FileInputStream fi = new FileInputStream("C:\\Users\\user\\Desktop\\TestDataSheet.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet sheet = wb.getSheetAt(0);
        sheet.getRow(1).getCell(1).setCellValue("tyz");
        FileOutputStream fw = new FileOutputStream("C:\\Users\\user\\Desktop\\TestDataSheet.xlsx");
        wb.write(fw);
        fw.close();
    }
}

