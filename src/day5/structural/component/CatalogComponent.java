package day5.structural.component;

public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("no supporting add");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("no supporting remove");
    }

    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("no supporting getName");
    }

    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("no supporting getPrice");
    }

    public void print(){
        throw new UnsupportedOperationException("no supporting print");
    }

}
