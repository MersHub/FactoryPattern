public class TvFactory implements GadgetsFactory{
    @Override
    public Gadgets createGadget() {
        return new TV();
    }
}
