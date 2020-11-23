package tshirtstrategy.tshirt;

/**
 *
 * @author ntsia
 */
public class Tshirt {
    
    private int price;
    private Color color;
    private Fabric fabric;
    private Size size;

    
    public Tshirt(Color color, Fabric fabric, Size size) {
        this.color = color;
        this.fabric = fabric;
        this.size = size;
        price = calculatePrice();
    }
    

    public int calculatePrice(){
        int p = 10+(color.getColorVal()+fabric.getFabricVal()+size.getSizeVal());
        return p;
    }
    
    public int getPrice() {
        return price;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    
}
