
public class Color {

    private String typeColor;
    private int priceColor;

    public Color(String typeColor, int priceColor) {
        this.typeColor = typeColor;
        this.priceColor = priceColor;
    }

    public String getTypeColor() {
        return typeColor;
    }

    public void setTypeColor(String typeColor) {
        this.typeColor = typeColor;
    }

    public int getPriceColor() {
        return priceColor;
    }

    public void setPriceColor(int priceColor) {
        this.priceColor = priceColor;
    }

}