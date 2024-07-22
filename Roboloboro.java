/**
 * Roboloboro - a robot by gabrieledecarvalho and fenamattos
 */

package roboloboropack;
import robocode.*;
//importando biblioteca de cores:
import java.awt.Color;
//importando biblioteca do robo avançado:
import robocode.AdvancedRobot;
//importanto util para utilizar angulos relativos/absolutos - para ser utilizado no onScannedRobotEvent:
import static robocode.util.Utils.normalRelativeAngleDegrees;
import robocode.util.*;

public class Roboloboro extends AdvancedRobot {
	 
	public void run() {		
		//MODIFICANDO AS CORES DO ROBO PARA QUE CADA PEÇA TENHA UMA COR DIFERENTE:
		setColors(new Color(150, 123, 182), new Color(153, 0, 0),new Color(255, 229, 180));
		
		//AJUSTANDO O ROBÔ AVANÇADO, ARMA E RADAR SE MOVEM LIVREMENTE:
		setAdjustGunForRobotTurn(true); //arma não se mexe com o corpo
		setAdjustRadarForGunTurn(true); //radar nao se mexe com a arma
		setAdjustRadarForRobotTurn(true); //radar não se mexe com o robo
		
		// Robot main loop
		while(true) {
			//Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		//captando informações inimigas, em radianos pois a função Math.sin e Math.cos só funcionam em radianos:
		
		double direcaoRobo = getHeadingRadians(); //direcao no campo a qual meu robo está indo
		double eAngulo = e.getBearingRadians(); //posicao (angulo) a qual o inimigo está
		
		double anguloRelativo = direcaoRobo + eAngulo; //angulo em relação ao roboloboro
		double eDistancia = e.getDistance(); //distancia entre o ponto central do inimigo e o ponto central do roboloboro
		
		double eX = getX() + Math.sin(anguloRelativo) * eDistancia; //posicao x do robo inimigo
		double eY = getX() + Math.cos(anguloRelativo) * eDistancia; //posicao y do robo inimigo
	
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