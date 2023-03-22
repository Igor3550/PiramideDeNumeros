public class App {
    public static void main(String[] args) throws Exception {
        
        int x = 5;

        for(int i = 1; i<=x; i++){
            String array = "";
            for(int y = 0; y<i; y++){
                array = array + i;
            }
            System.out.println(array);
        }

    }
}
