import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class WriteExcel {

    public static void main(String[] args) throws Exception {

        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Students");

        Row row = sheet.createRow(0);

        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Age");
        row.createCell(2).setCellValue("Course");

        Row row2 = sheet.createRow(1);

        row2.createCell(0).setCellValue("Yogesh");
        row2.createCell(1).setCellValue(22);
        row2.createCell(2).setCellValue("Java");

        FileOutputStream output =
                new FileOutputStream("student.xlsx");

        workbook.write(output);

        workbook.close();
        output.close();

        System.out.println("Excel file created successfully");
    }
}