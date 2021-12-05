public class Client{
    public  static void main(String args[])
    {
        try{
            TV tv,tv1;
            HaierTVFactory factory=new HaierTVFactory();
            tv=factory.produceTV();
            tv.play();
            HuaweiTVFactory factory1=new HuaweiTVFactory();
            tv1=factory1.produceTV();
            tv1.play();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
