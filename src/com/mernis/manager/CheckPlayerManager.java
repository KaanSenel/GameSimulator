package com.mernis.manager;

import com.mernis.confirmation.IHHKPSPublicSoap;
import com.player.Player;

public class CheckPlayerManager implements  CheckPlayerService{

    @Override
    public boolean check(Player player) throws Exception {

        IHHKPSPublicSoap verify=new IHHKPSPublicSoap();
        return verify.TCKimlikNoDogrula(player.getValidationNumber(),
                                        player.getFirstName().toUpperCase(),
                                        player.getLastName().toUpperCase(),
                                        player.getBirthdayYear());
    }
}
