/**
 * Roboloboro - a robot by gabrieledecarvalho
 */

package roboloboropack;
import robocode.*;
//(?)importando biblioteca de cores:
import java.awt.Color;

public class Roboloboro extends Robot
{
	/**
	 * run: Roboloboro's default behavior
	 */
	
	public void run() {		
		/** 
		* MODIFICANDO AS CORES DO ROBO PARA QUE CADA PEÇA TENHA UMA COR DIFERENTE:
		* setBodyColor(Color.red);
		* setGunColor(Color.white);
		* setRadarColor(Color.purple);
		*/
		
		/**
		* (?)DEFININDO A POSIÇÃO INICIAL E DIREÇÃO DO ROBÔ:
		* setAdjustGunForRobotTurn(true);
		* setAdjustRadarForGunTurn(true);
		* setAdjustRadarForRobotTurn(true);
		*/
		
		/**
		* (?)MODIFICANDO AS CORES DO ROBÔ BASEADO NA QUANTIDADE DE ENERGIA QUE ELE POSSUI NO MOMENTO:		* 
		* getEnergy();
		* if(getEnergy()>=90){
        	* setBodyColor(new Color(0, 255, 0));
		* }else if(getEnergy()<90 && getEnergy()>=40){
        	* setBodyColor(new Color(0, 0, 255)); 
	    * }else if(getEnergy()<40){
    	    * setBodyColor(new Color(255, 0, 0)); 
    	* }
		*/
		
		/**
		 * DEFININDO ALGUMAS VARIÁVEIS EM RELAÇÃO AO CAMPO DE BATALHA:
		 * double h = getBattleFieldHeight();
		 * double w = getBattleFieldWidth();
		 * double d1 = (h/2 + w/2)/2;
		 */		

		// Robot main loop
		while(true) {
			//Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html