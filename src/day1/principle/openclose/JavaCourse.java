package day1.principle.openclose;

public class JavaCourse implements ICourse {

    private Integer Id;
    private String Name;
    private Double Price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        Name = name;
        Price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public Double getPrice() {
        return this.Price;
    }


}
