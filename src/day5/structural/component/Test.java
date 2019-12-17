package day5.structural.component;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("LinuxCourse",11);
        CatalogComponent javaCourse = new Course("javaCourse",12);
        CatalogComponent osCourse = new Course("OSCourse",13);

        CatalogComponent javaCourse1 = new Course("javaCourse1",13);
        CatalogComponent javaCourseCatalog = new CourseCatalog("java catalog",2);
        javaCourseCatalog.add(javaCourse);
        javaCourseCatalog.add(javaCourse1);

//        javaCourseCatalog.print();

        CatalogComponent mainCatalog = new CourseCatalog("main catalog",1);
        mainCatalog.add(linuxCourse);
        mainCatalog.add(osCourse);
        mainCatalog.add(javaCourseCatalog);

        mainCatalog.print();
    }
}
