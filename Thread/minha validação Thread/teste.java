public class teste {
    public static void main(String[] args) {
        System.out.println("A corrida começou!");
        MinhaThread thread = new MinhaThread("Cristiano", 1000);
        MinhaThread thread2 = new MinhaThread("Neymar", 1004);
        MinhaThread thread3 = new MinhaThread("Messi", 1003);
        try {
            thread.join();
            thread2.join();
            thread3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("A corrida acabou!");
        System.out.println("Cristiano Ganhou!");
        System.out.println("Messi Chegou em 2º");
        System.out.println("Neymar Chegou em 3º");

    }
}
