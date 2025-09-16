import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] symbols = {"🍒", "🍋", "🍉", "⭐", "7️⃣"};

        System.out.println("🎰 Welcome to the Slot Machine! 🎰");
        System.out.println("Press Enter to spin...");
        sc.nextLine();

        // Spin three slots
        String slot1 = symbols[rand.nextInt(symbols.length)];
        String slot2 = symbols[rand.nextInt(symbols.length)];
        String slot3 = symbols[rand.nextInt(symbols.length)];

        // Display the result
        System.out.println("-----------------");
        System.out.println("| " + slot1 + " | " + slot2 + " | " + slot3 + " |");
        System.out.println("-----------------");

        // Check win
        if (slot1.equals(slot2) && slot2.equals(slot3)) {
            System.out.println("🎉 JACKPOT! You win! 🎉");
        } else if (slot1.equals(slot2) || slot1.equals(slot3) || slot2.equals(slot3)) {
            System.out.println("😊 You got a small win!");
        } else {
            System.out.println("😢 Better luck next time!");
        }

        sc.close();
    }
}
