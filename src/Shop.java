public class Shop {
    public static void main(String[] args) {
        GadgetsFactory gadgetsFactory = createGadgetsByKind("tv");
        Gadgets gadgets = gadgetsFactory.createGadget();
        gadgets.chooseGadget();
    }

    static GadgetsFactory createGadgetsByKind(String kind) {
        if (kind.equalsIgnoreCase("TV")) {
            return new TvFactory();
        } else if (kind.equalsIgnoreCase("Phone")){
            return new PhoneFactory();
        } else {
            throw new RuntimeException(kind + " gadget kind is not found");
        }
    }
}
