package com.game;

import com.campain.Campain;
import com.player.Player;

public class GameManager {

    public void sellGame(Player player,Game game){

        System.out.println(player.getFirstName()+" isimli oyuncu "+ game.getName()+" oyununu satın aldı!");
        player.setGameList(game);
    }
    public void sellGame(Player player, Game game, Campain campain){
        // Ürünün kampanyalı fiyatı
        game.setPrice(game.getPrice()-(game.getPrice()* campain.getDiscountRate()/100));
        System.out.println(player.getFirstName()+" isimli oyuncu "+campain.getName()+" kampanyasını kullanarak"
                           +game.getName()+ " oyununu "+game.getPrice()+" liraya aldı.");
    }
}
