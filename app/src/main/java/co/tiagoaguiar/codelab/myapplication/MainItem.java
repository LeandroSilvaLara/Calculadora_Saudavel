package co.tiagoaguiar.codelab.myapplication;

public class MainItem {

    private int id;
    private int textStringId;
    private int drawavleId;
    private int color;

    public MainItem(int id, int drawavleId, int textStringId, int color) {
        this.id = id;
        this.textStringId = textStringId;
        this.drawavleId = drawavleId;
        this.color = color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setDrawavleId(int drawavleId) {
        this.drawavleId = drawavleId;
    }

    public void setTextStringId(int textStringId) {
        this.textStringId = textStringId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getColor() {
        return color;
    }

    public int getTextStringId() {
        return textStringId;
    }

    public int getDrawavleId() {
        return drawavleId;
    }

}
