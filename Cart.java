public class Cart {
    public static int value = 0;
    public static float Total;
    private static int[] iA = new int[20];
    public static final int MAX_NUMBERS = 20;
    private static DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS];

    public static void setup()
    {
        for(int res_0 = 0; res_0 < MAX_NUMBERS; res_0++)
        {
            itemsOrdered[res_0] = new DigitalVideoDisc("null", "null", "null", 0, 0);
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd)
    {
        boolean test_0 = false;
        if(value < MAX_NUMBERS){
            for(int res_0 = 0; res_0 < MAX_NUMBERS; res_0 ++)
            {
                if(iA[res_0] == 0 && test_0 == false)
                {
                    itemsOrdered[res_0] = new DigitalVideoDisc(dvd.getTitle(), dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
                    Total += dvd.getCost();
                    value++;
                    test_0 = true;
                    iA[res_0] = 1;
                }
            }
        }
    }

    public static void RemoveDigitalVideoDisc(DigitalVideoDisc dvd)
    {
        for(int res_0 = 0; res_0 < MAX_NUMBERS; res_0++)
        {
            if(dvd.getTitle() == itemsOrdered[res_0].getTitle())
            {
                itemsOrdered[res_0] = new DigitalVideoDisc("null", "null", "null", 0, 0);
                iA[res_0] = 0;
                Total -= dvd.getCost();
                value--;
            }
        }
    }

    public static int test()
    {
        return value;
    }
    public static float totalCost()
    {
        return Total;
    }
    public static boolean isMatch(String title){
        for(int res_0 = 0; res_0 < MAX_NUMBERS; res_0 ++)
        {
            if(title == itemsOrdered[res_0].getTitle())
                return true;
        }
        return false;
    }
}
