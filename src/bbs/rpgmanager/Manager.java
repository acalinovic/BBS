package bbs.rpgmanager;

import java.sql.Date;

import bbs.rpgmanager.db.RpgmJdbcTemplate;

public class Manager {

	public static void main(String[] args)  {
		PlayerManager pm = new PlayerManager(RpgmJdbcTemplate.getTemplate());
		System.out.println(pm.getPlayer(2));
		pm.delPlayer(3);
		pm.addPlayer("Frederick", "Warnant", "Squatman",new Date(1976-9-11), "warnant.frederick@gmail.com", 472484322, "Court-Saint-Etienne", "1490", "Rue du Bois des Rêves", 6, "", "Grave mais efficace\nMinimaxer");
		System.out.println(pm.getPlayer(3));

	
	}
}
