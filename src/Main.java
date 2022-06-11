import com.campain.Campain;
import com.campain.CampainList;
import com.campain.CampainManager;
import com.game.Game;
import com.game.GameManager;
import com.mernis.manager.CheckPlayerManager;
import com.player.Player;
import com.player.PlayerManager;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        Player player=new Player(1,"Tufan kaan","şenel",1212121212121L,1998);
        PlayerManager playerManager=new PlayerManager(new CheckPlayerManager());
        playerManager.authenticate(player);

        Game game=new Game(100,"Cod mw 2");
        GameManager gameManager=new GameManager();




        Campain campain=new Campain("yaza hoşgeldin",10,"2022/06/11","2022/09/11");
        CampainManager campainManager=new CampainManager();
        campainManager.addCampain(campain);

        for (Campain c: CampainList.getCampains()){
            System.out.println(c.getName()+" "+c.getDiscountRate()+" "+c.getStartDate());
        }


        gameManager.sellGame(player,game,campain);



    }
}
