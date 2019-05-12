package contest.week136;


/**
 * On an infinite plane, a robot initially stands at (0, 0) and faces north.  The robot can receive one of three instructions:
"G": go straight 1 unit;
"L": turn 90 degrees to the left;
"R": turn 90 degress to the right.
The robot performs the instructions given in order, and repeats them forever.
Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 * 
 * 1 <= instructions.length <= 100
instructions[i] is in {'G', 'L', 'R'}
 * 
 * @author angilin
 *
 */
public class P1041RobotBoundedInCircle {
	
    public boolean isRobotBounded(String instructions) {
    	//0 y+1   1 x+1  2 y-1  3 x-1
    	//R  direction+1
    	//L  direction-1
    	int direction = 0;
    	int x=0;
    	int y=0;
    	char[] instruction = instructions.toCharArray();
    	for(int i=0;i<instruction.length*100;i++) {
    		int index = i%instruction.length;
    		
    		if(instruction[index]=='G') {
    			if(direction==0) {
    				y++;
    			}
    			else if(direction==1) {
    				x++;
    			}
    			else if(direction==2) {
    				y--;
    			}
    			else if(direction==3) {
    				x--;
    			}
    		}
    		else if(instruction[index]=='L') {
    			direction = (direction+3)%4;
    		}
    		else if(instruction[index]=='R') {
    			direction = (direction+1)%4;
    		}
    		
    		if(i>=instruction.length-1 && x==0 && y==0) {
    			//System.out.println(i+1);
    			return true;
    		}
    	}
    	return false;
    }
}
