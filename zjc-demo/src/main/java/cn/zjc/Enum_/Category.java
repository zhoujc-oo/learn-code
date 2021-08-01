package cn.zjc.Enum_;

public enum  Category {
    FOOD(1),
    COOK(3),
    SNACk(5),
    CLOTHES(7),
    ELECTRIC(9);

    private int id;

    Category (int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                '}';
    }
}
