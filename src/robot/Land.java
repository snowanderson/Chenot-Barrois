package robot;


public enum Land {

    Terre(1),
    Roche(2),
    Sable(4),
    Boue(3),
    Infranchissable(0);

    public final int coefficient;

    private Land(int coefficient) {
        this.coefficient = coefficient;
    }

    public static Land getLandByOrdinal(int ordinal) throws TerrainNonRepertorieException {
        for (Land land : Land.values()) {
            if (land.ordinal()==ordinal) return land;
        }
        throw new TerrainNonRepertorieException();
    }

    public static int CountLand() {
        return Land.values().length;
    }
}
