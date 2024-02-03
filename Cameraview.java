public class Cameraview {
    private String image;
    private Category category;
    private int noOfobject;
    private Colour colourGradient;

    public void  setimage(String img){
        this.image = img;
    }
    public String getImage(){
        return image;
    }

    public void setCategory(Category gn){
        this.category = gn;
    }
    public Category getCategory(){
        return category;
    }

    public void setObject(int obj){
        this.noOfobject = obj;
    }
    public int  getObject(){
        return noOfobject;
    }

    public void setColour(Colour rgb){
        this.colourGradient = rgb;
    }
    public Colour getColour(){
        return colourGradient;
    }
}
