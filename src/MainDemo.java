public class MainDemo {
    public static void main(String[] args) {
        for(int i=20;i<30;i++){
            System.out.println("Batch 9 ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
