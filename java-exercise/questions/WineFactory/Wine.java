package WineFactory;

public interface Wine {

    boolean hasbubble();

    enum Brand {
        WORLDWINE, FINEWINE,;
    }

    public static Wine create(WineFactory factory) {
        return factory.createWine();
    }

    public class WorldWineWR implements Wine {
        @Override
        public boolean hasbubble() {
            System.out.println("Too bad we don't have sparkling wine");
            return false;
        }
    }

    public class FineWineWR implements Wine {
        @Override
        public boolean hasbubble() {
            System.out.println("Want to try our lovely Champagne?");
            return true;
        }
    }

    public interface Beer {
        boolean isCraftBeer();

        public static Beer create(WineFactory factory) {
            return factory.createBeer();
        }
    }

    public class WorldWineBeer implements Beer {
        @Override
        public boolean isCraftBeer() {
            return false;
        }
    }

    public class FineWineBeer implements Beer {
        @Override
        public boolean isCraftBeer() {
            return true;
        }
    }


    public interface WineFactory {
        Wine createWine();

        Beer createBeer();

        public static WineFactory create(Brand brand) throws Exception {
            switch (brand) {
                case WORLDWINE:
                    return new WorldWine();
                case FINEWINE:
                    return new FineWine();
            }
            throw new Exception("Unknow factory");
        }
    }

    public class WorldWine implements WineFactory {
        @Override
        public Wine createWine() {
            System.out.println(
                    "We have our own way to create World Red and World White!");
            return new WorldWineWR();
        }

        @Override
        public Beer createBeer() {
            System.out.println("We have beer too... but not craft beer");
            return new WorldWineBeer();
        }
    }

    public class FineWine implements WineFactory {
        @Override
        public Wine createWine() {
            System.out.println("We create fine red and fine white.");
            return new FineWineWR();
        }

        @Override
        public Beer createBeer() {
            System.out.println("We have our own craft beer!");
            return new FineWineBeer();
        }
    }

    public class WineBuyer {

        public static void main(String[] args) throws Exception {
            WineFactory worldWineFactory = WineFactory.create(Brand.WORLDWINE);
            Wine WWwine = worldWineFactory.createWine();
            System.out.println(WWwine.hasbubble());
            Beer WWbeer = worldWineFactory.createBeer();
            System.out.println(WWbeer.isCraftBeer());

            WineFactory fineWineFactory = WineFactory.create(Brand.FINEWINE);
            Wine FWwine = fineWineFactory.createWine();
            System.out.println(FWwine.hasbubble());
            Beer FWbeer = fineWineFactory.createBeer();
            System.out.println(FWbeer.isCraftBeer());


        }
    }


}
