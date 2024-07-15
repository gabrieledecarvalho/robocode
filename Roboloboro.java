/**
 * Roboloboro - a robot by gabrieledecarvalho and fenamattos
 */

package roboloboropack;
import robocode.*;
//importando biblioteca de cores:
import java.awt.Color;

public class Roboloboro extends Robot
{
	/**
	 * run: Roboloboro's default behavior
	 */
	 
	public void run() {		
		//MODIFICANDO AS CORES DO ROBO PARA QUE CADA PEÇA TENHA UMA COR DIFERENTE:
		setColors(new Color(150, 123, 182), new Color(153, 0, 0),new Color(255, 229, 180));
		
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