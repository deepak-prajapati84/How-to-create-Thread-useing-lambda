public class Thrd{
    public static void main(String[] args){
    //Child
        new Thread(()->{ //Lambda Expression Useing
            for(int i=0;i<=10;i++){
                System.out.println("Value is : " + i);
                try{
                    Thread.sleep(5000);
                }catch(Exception e){e.printStackTrace();}
            }
        }).start();
    }
}