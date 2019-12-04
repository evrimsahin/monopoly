package game.elements.cards.community.chest;

import game.elements.cards.Card;
import player.Player;

public class commCard3 extends Card {

    public commCard3() {
        super.setName("Chest3");
        super.setDescription("Doctor's fees. Pay $25");
        super.setAltDescription("Mr. Monopoly angrily brandishes crutches as he stomps with a leg cast");
    }

    @Override
    public void action(Player player, Player[] playerArray) {
        player.getMoney().subtractMoney(25);
    }
}