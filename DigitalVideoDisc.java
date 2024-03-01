public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title){
        this.title = title;
        nbDigitalVideoDiscs ++;
    }

    public DigitalVideoDisc(String title, String category){
        this(title);
        this.category = category;
        nbDigitalVideoDiscs ++;
    }

    public DigitalVideoDisc(String title, String category, String director){
        this(title, category);
        this.director = director;
        nbDigitalVideoDiscs ++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length){
        this(title, category, director);
        this.length = length;
        nbDigitalVideoDiscs ++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this(title, category, director, length);
        this.cost = cost;
        nbDigitalVideoDiscs ++;
    }

    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int count(){
        return nbDigitalVideoDiscs;
    }
}