package Lab02;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getNbDigitalVideoDiscs(){
        return nbDigitalVideoDiscs;
    }
    public void setId(){
        id = getNbDigitalVideoDiscs();
        nbDigitalVideoDiscs++;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
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
    
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }
    public DigitalVideoDisc (String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc (String director, String category, String title, float cost){
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public  DigitalVideoDisc (String title, String category, String director, int length, float cost){
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.length = length;
    }
}
