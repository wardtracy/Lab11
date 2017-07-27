public class Toolbag extends Toolbox {

    private String brandName;


    public Toolbag(String color, String material, String brandName) {
        super(color, material);
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}


