public class T{
    public static void main(String[] args){
        new Thread(()->{
            for(int i=1;i<20;i++){
                System.out.println("Value is : " + i);
                try{
                    Thread.sleep(5000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }).start();

        for(int j=1;j<20;j++){
            System.out.println("value2 is :" + j);
            try{
                Thread.sleep(4000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}