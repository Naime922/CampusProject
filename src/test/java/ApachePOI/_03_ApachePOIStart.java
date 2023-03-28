package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);// connection to the file

        Workbook workbook= WorkbookFactory.create(fileInputStream); // getting the workbook with the connection

        Sheet sheet=workbook.getSheet("Sheet1"); // we got the sheet we want to work on

        Row row=sheet.getRow(0); // this row call the data inside the row

        Cell cell=row.getCell(0);

        Cell cell1=row.getCell(1);

        Row row1=sheet.getRow(1);
        Cell cell2=row1.getCell(2);
        System.out.println(cell2);

        System.out.println(cell1);

        System.out.println(cell);

    }
}
