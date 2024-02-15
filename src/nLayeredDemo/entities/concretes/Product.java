package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

// entity katmanına iş yapan ama özellik tutan sınıfları koyuyoruz
public
class Product implements Entity { // bunun gibi bi nesne varsa onun ne nesnesi olduğunu sisteme anlatmamız lazım, dataAccess mi, api mi, biznıs mı
    // eğer bir class çıplak kalıyorsa ileride sıkıntı yaşarız. Base ya da interface ile süslenmesi lazım
    private int id;
    private int categoryId;
    private String name;
    private double unitPrice;
    private int unitInStock;

    public
    Product ( int id, int categoryId, String name, double unitPrice, int unitInStock ) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
    }

    public
    Product () {
    }

    public
    int getId () {
        return id;
    }

    public
    void setId ( int id ) {
        this.id = id;
    }

    public
    int getCategoryId () {
        return categoryId;
    }

    public
    void setCategoryId ( int categoryId ) {
        this.categoryId = categoryId;
    }

    public
    String getName () {
        return name;
    }

    public
    void setName ( String name ) {
        this.name = name;
    }

    public
    double getUnitPrice () {
        return unitPrice;
    }

    public
    void setUnitPrice ( double unitPrice ) {
        this.unitPrice = unitPrice;
    }

    public
    int getUnitInStock () {
        return unitInStock;
    }

    public
    void setUnitInStock ( int unitInStock ) {
        this.unitInStock = unitInStock;
    }
}
