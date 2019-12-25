package game_elements.cards.community_chest;

import game_elements.cards.Card;
import player.Player;

public class CommCard6 extends Card {

    public CommCard6() {
        super.setName("Chest6");
        super.setDescription("Grand Opera Night. Collect $50 from every player for opening night seats.");
        super.setAltDescription("A wall sign near steps reads \"Opera Tonight - 8 PM Sharp\"; Mr. Monopoly leans against it checking his pocket watch in annoyance");
    }

    @Override
    public void action(Player player, Player[] playerArray) {

        for(int i = 0 ; i < playerArray.length ; i++){

            if(player.getId() == playerArray[i].getId()){
                continue;
            }

            if(!playerArray[i].isBankrupt()){
                player.getMoney().addMoney(50);
                playerArray[i].getMoney().subtractMoney(50);
            }

        }
    }
}
