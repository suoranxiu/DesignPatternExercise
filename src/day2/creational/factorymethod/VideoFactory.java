package day2.creational.factorymethod;

public abstract class VideoFactory {

//    public Video getVideo(Class c){//一般采用反射，增加可扩展性
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return video;
//    }
    public abstract Video getVideo();//工厂方法对比简单工厂，将实例化过程推迟到工厂类的子类过程中
}
