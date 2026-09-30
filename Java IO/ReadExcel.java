import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

class ReadExcel {

    public static void main(String[] args) throws Exception {

        FileInputStream input =
                new FileInputStream("student.xlsx");

        Workbook workbook =
                WorkbookFactory.create(input);

        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {

            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }

            System.out.println();
        }

        workbook.close();
        input.close();
    }
}