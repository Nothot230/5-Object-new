public class ARview {
    private item Item;
    private String tdObject;
    private Colour colour;
    private int dimension;

    public void setItem(item it){
        this.Item = it;
    }
    public item getItem(){
        return Item;
    }

    public void setObject(String obj){
        this.tdObject = obj;
    }
    public String getObject(){
        return tdObject;
    }
    public void setColour(Colour c){
        this.colour = c;
    }

    public void setDimension(int d){
        this.dimension = d;
    }
    public int getDimension(){
        return dimension;
    }
}
