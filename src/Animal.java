public class Animal {
    // animal name
    private String name;
    private String type;
    private String description;
    private double price;
    private boolean isInStock;

    public Animal() {

    }

    public Animal(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }
   public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setIsInStock(boolean isInStock) {
        this.isInStock = isInStock;
    }

    public boolean getIsInStock() {
        return isInStock;
    }

    public String getPet() {
        return "Animal Name: " + getName()
                + "\nType: " + getType()
                + "\nDescription: " + getDescription();
    }


}
