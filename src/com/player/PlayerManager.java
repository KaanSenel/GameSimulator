package com.player;

import com.mernis.manager.CheckPlayerService;

public class PlayerManager implements  PlayerService{
    CheckPlayerService checkPlayerService;

    public PlayerManager(CheckPlayerService checkPlayerService) {
        this.checkPlayerService = checkPlayerService;
    }

    public void authenticate(Player player) throws Exception {
        if(checkPlayerService.check(player)){
            add(player);
        }
        else {
            throw new Exception("Kimlik doğrulaması sırasında hata meydana geldi!");
        }
    }

    @Override
    public void add(Player player) {
        System.out.println(player.getFirstName()+" isimli oyuncu sisteme eklendi.");
    }

    @Override
    public void update(Player player) {
        System.out.println(player.getFirstName()+" isimli oyuncu güncellendi.");
    }

    @Override
    public void delete(Player player) {
        System.out.println(player.getFirstName()+" isimli oyuncu sistemden silindi.");
    }
}
