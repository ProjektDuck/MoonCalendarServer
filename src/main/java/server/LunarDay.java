package server;

public class LunarDay {

    private static int lunarDay;

    public static int get(int dayID) {

        System.out.println("LunarDay ::: ");

        try {

            int day = dayID;
            DBConnectorTEST dbConnector = new DBConnectorTEST(day);

            lunarDay = dbConnector.getLunarDay();
            System.out.println("LunarDay ::: Lunar day is " + lunarDay);

        } catch (Exception e) {
            System.out.println("LunarDay ::: Exception: " + e.toString());
        }
        return lunarDay;
    }
}
