public class Main {
    public static void main(String[] args){
        DBConn dbConn = DBConn.getInstance();
        DBConn dbConn2 = DBConn.getInstance();
        System.out.println(dbConn);
        System.out.println(dbConn2);
    }
}
