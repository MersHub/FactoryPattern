public class PhoneFactory implements GadgetsFactory{
    @Override
    public Gadgets createGadget() {
        return new Phone();
    }
}
