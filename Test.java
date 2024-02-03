public class Test {
    public static void main(String[] args){
        Cameraview cam = new Cameraview();
        item it = new item();
        ARview ar = new ARview();
        Colour cl = new Colour();
        Category ct = new Category();
        
        setItem(ct, ar, it);
        setName(it, ct);
        setObject(cam, ar);
        setColour(cl, cam);
        setCategory(ct, cam);
        setImage(cam);
        setDesc(it);
        setPreview(it);
        setDimension(ar);
        allGetMethod(cam, it, ar, cl, ct);

    }
    
    
    public static void setItem(Category ct, ARview ar,item it){
        ct.setItem(1);
        ar.setItem(it);

    }
    public static void setName(item it, Category ct){
        it.setName("Audi R8");
        ct.setName("Audi R8");
    }
    public static void setObject(Cameraview cam, ARview ar){
        cam.setObject(1);
        ar.setObject("Car");
    }
    public static void setColour(Colour cl,Cameraview cam){
        cl.setRed(255);
        cl.setGreen(255);
        cl.setBlue(255);
        cam.setColour(cl);
    }
    public static void setCategory(Category ct, Cameraview cam){
        cam.setCategory(ct);
    }
    public static void setImage(Cameraview cam){
        cam.setimage("Audi R8 pic");
    }
    public static void setDesc(item it){
        it.setDesc("The best car");
    }
    public static void setPreview(item it){
        it.setView("Side");
    }
    public static void setDimension(ARview ar){
        ar.setDimension(3);
    }
    public static void allGetMethod(Cameraview cam, item it, ARview ar, Colour cl, Category ct){
        System.out.println(cam.getImage());
        System.out.println(cam.getCategory());
        System.out.println(cam.getObject());
        System.out.println(ar.getObject());
        System.out.println(cl.getRed());
        System.out.println(cl.getGreen());
        System.out.println(cl.getBlue());
        System.out.println(cam.getColour());
        System.out.println(ct.getItem());
        System.out.println(ar.getItem());
        System.out.println(it.getName());
        System.out.println(ct.getName());
        System.out.println(it.getDesc());
        System.out.println(it.getView());
        System.out.println(ar.getDimension());
    }
}
