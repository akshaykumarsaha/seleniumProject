
public class ExcelReadUsingInBuiltFile {
    public static void main(String args[])
    {
        Xls_Reader xl = new Xls_Reader("C:\\Users\\user\\Desktop\\TestDataSheet.xlsx");
        int row =xl.getRowCount("Sheet1");
        System.out.println(row);

        String username = xl.getCellData("sheet1","Username",2);
        System.out.println(username);

        xl.setCellData("Sheet1","Status",2,"PASSED");
    }
}
