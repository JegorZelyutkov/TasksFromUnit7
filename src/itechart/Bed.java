package itechart;

public class Bed {

    private final String style;
    private final int pillows;
    private final int sheets;
    private final int quilt;
    private final int height;

    public Bed(String style, int pillows, int sheets, int quilt, int height) {
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilt = quilt;
        this.height = height;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getHeight() {
        return height;
    }
}
