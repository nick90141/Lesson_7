package task_3;

public class Price {
    public String good;
    public String magazine;
    public double priceUAH;
    public Price (String good, String magazine, double priceUAH) {
        this.good = good;
        this.magazine = magazine;
        this.priceUAH = priceUAH;
    }
   public String getmagazine() {
        return magazine;}
    public String getGood() {
        return good;
    }
    public double getPriceUAH() {
        return priceUAH;
    }

    @Override
    public String toString() {
        return "Товар: " + good + ", Магазин: " + magazine + ", Цена: " + priceUAH + " ГРН";
    }
}
