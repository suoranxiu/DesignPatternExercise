package day3.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        //与具体的xxxVideo 和xxxArticle类是解耦的
        //不和具体的产品发生依赖，只和生产产品的工厂发生依赖
        //当拓展新的产品等级时（例如：课程的源码，需要依次修改CourseFactory 以及xxxCourseFactory 并创建 Code抽象类
        // 以及xxxCode来继承），不符合开闭原则
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();

        video.produce();
        article.produce();

    }
}
