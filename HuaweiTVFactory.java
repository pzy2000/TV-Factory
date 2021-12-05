public class HuaweiTVFactory implements TVFactory{
    public TV produceTV()
    {
        System.out.println("海思工厂生产华为智慧屏！");
        return new HuaweiTV();
    }
}
