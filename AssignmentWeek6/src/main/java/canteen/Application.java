package canteen;

import dao.CanteenDao;

public class Application
{

    public static void main(String[] args) throws Exception
    {

       CanteenDao ctd = new CanteenDao();
       //ctd.createTable();
       ctd.insertTable();
       //ctd.getData();
        ctd.deleteData();

            /*String sql = "CREATE TABLE canteen " +
                    "(id INTEGER not NULL, " +
                    " canteen_name VARCHAR(25))";
            // ResultSet rs = st.executeUpdate(sql);
            st.executeUpdate(sql);
            System.out.println("Created table in given database...");
*/


    }
}
