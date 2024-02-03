public class item {
    private String name;
    private String id;
    private String description;
    private String preview;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(String i){
        this.id = i;
    }
    public String getId(){
        return id;
    }

    public void setDesc(String des){
        this.description = des;
    }
    public String getDesc(){
        return description;
    }

    public void setView(String v){
        this.preview = v;
    }
    public String getView(){
        return preview;
    }
}
