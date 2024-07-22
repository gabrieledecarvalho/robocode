/**
 * Roboloboro - a robot by gabrieledecarvalho and fenamattos
 */

package roboloboropack;
import robocode.*;
//(?)importando biblioteca de cores:
import java.awt.Color;

public class Roboloboro extends AdvancedRobot
{
	/**
	 * run: Roboloboro's default behavior
	 */
	
	public void run() {		
				
		// DEFININDO A POSIÇÃO INICIAL E DIREÇÃO DO ROBÔ:
		setAdjustGunForRobotTurn(true);
		setAdjustRadarForGunTurn(true);
		setAdjustRadarForRobotTurn(true);	

		// MOVIMENTAÇÃO PRINCIPAL DO ROBOLOBORO, SEM EVENTOS:
		while(true) {
			//DEFININDO ALGUMAS VARIÁVEIS EM RELAÇÃO AO CAMPO DE BATALHA:
			double wBattleField = getBattleFieldHeight(); //profundidade do campo de batalha
			double hBattleField = getBattleFieldWidth(); //altura do campo de batalha
			double diagonalBattleField = (Math.sqrt((Math.pow(wBattleField,2) + Math.pow(hBattleField,2))))/2;			
			setTurnRight(45);
			setAhead(diagonalBattleField/2);
			setTurnGunRight(360);
			execute(); //executa as 4 ações acima junto 
			turnRadarRight(360);
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
		double energia = getEnergy();
		double eDirecao = e.getBearing(); //direção que a bala chegou
		if(energia < 80){
			setTurnRight(-eDirecao); //vai para o lado oposto
			setAhead(100);
			execute();
		}else{
			turnGunRight(360);
		}
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		double wBattleField = getBattleFieldHeight(); //profundidade do campo de batalha
		double hBattleField = getBattleFieldWidth(); //altura do campo de batalha
		double diagonalBattleField = (Math.sqrt((Math.pow(wBattleField,2)+Math.pow(hBattleField,2))))/2;
		double eDirecao = e.getBearing(); //direção da parede
   	 	turnRight(-eDirecao); //vai para o lado oposto
	    ahead(diagonalBattleField/2);
	}

	public void onWin(WinEvent e) {
		turnRight(720);
		turnLeft(720);
	}
}
// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html