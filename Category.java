public class Category {
    private String name;
    private int id;
    private int noOfitems;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

    public void setItem(int it){
        this.noOfitems = it;
    }
    public int getItem(){
        return noOfitems;
    }
}
