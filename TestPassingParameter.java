public class TestPassingParameter{

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinederellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinederellaDVD);
        System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
        System.out.println("cinederella dvd title: " + cinederellaDVD.getTitle());

        changeTitile(jungleDVD, cinederellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    static void changeTitile(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}