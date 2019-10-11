public class HundeRoboterKatze implements IRoboter, IEtwasWasSichBewegt, IBellendesObjekt, IKatze{

    @Override
    public void miau() {
        System.out.println("miau");

    }

    @Override
    public void bellen() {
        System.out.println("wuff");

    }

    @Override
    public void bewege() {
        System.out.println("bewege");

    }

    @Override
    public void toeten() {
        System.out.println("kill");
    }
    
}