public class PieceOfClothing {
    private int identifier;
    private String brandName;
    private String type;

    public PieceOfClothing(String brandName, String type) {
        this.identifier = setIdentifier();
        this.brandName = brandName;
        if (type == "shirt" || type == "blouse" || type == "skirt" || type == "trousers") {
            this.type = type;
        } else {
            System.out.println("This type doesn't exist in this world. I'm making this a shirt");
            this.type = "shirt";
        }
    }
    public PieceOfClothing() {
        this.identifier = setIdentifier();
        this.brandName = "NoName Brand";
        this.type = "shirt";      /*autorytarnie przypisuję sobie typ, ale gdybym miała morze czasu to to jest miejsce na komunikację z userem) */
    }

    public int setIdentifier() {
        /* potrzebne sprawdzanie czy numer się nie powtarza */
        return (int) Math.floor((Math.random() * 5000) + 1);
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getType() {
        return type;
    }
}
