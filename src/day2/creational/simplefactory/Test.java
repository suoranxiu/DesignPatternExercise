package day2.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();
        //不需要具体类
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        video.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);//采用反射
        video.produce();

    }
}
