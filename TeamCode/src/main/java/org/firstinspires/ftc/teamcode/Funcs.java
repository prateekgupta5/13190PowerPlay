package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ServoImpl;


public final class Funcs  {

    public static ServoImpl armServo, clawServo; // will hve to initialise these in a separate init
    //public DcMotor armMotor;

    /**
    *Rotates the arm 180 degrees. It assumes that the limit on the servo would be 0 and 180.
    *It returns 0 if it worked and -1 if nothing happened, likely because the arm was not close to it's 0 or 1 position.
    */
    public static int turnArm() {

        if ( armServo.getPosition() > .9 ) {
            armServo.setPosition(0);

            return 0;
        }

        if ( armServo.getPosition() < .1 ) {
            armServo.setPosition(1);
            return 0;
        }

        return -1;

    }

    /**
     *If the claw is open, it will close it. Closed, it will open it. if the claw is in the middle, nothing will happen.
     *Assumes that the open and close state are 0 and 1 position for servo.
     */
    public static void runClaw() {
        if ( clawServo.getPosition() > .9 ) {
            clawServo.setPosition(0);
        }

        if ( clawServo.getPosition() < .1 ) {
            clawServo.setPosition(1);
        }
    }

    public static int turn (int num, int denom) {
        int radius = 6;
        num *= radius;
        num*= Math.PI;
        return ( inchesToTicks( num/denom) );
    }

    //------------------------------------------------------------------------------------------------------------------
    // a bunch of funcs that need more

    /**
     *
     */

    //public int ticksToInches(int ticks) {
        //return WHEEL_RADIUS * 2 * Math.PI * GEAR_RATIO * ticks / TICKS_PER_REV;
        //need specs
        //return 0;
    //}

    /**
    *
    */

    public static int inchesToTicks(int inches) {
        //return (int)( (inches * TICKS_PER_REV ) / ( WHEEL_RADIUS * 2 * Math.PI * GEAR_RATIO ) );
        //needs specs
        return 0; // temporary
    }

    /**
     *
     */

    // public void runArm() {
        //needs ticks per rotation to see how far to extend the linear slides
    //}

    /**
     *
     */

    //public void runToPos(int x, int y) {
        //..
    //}
}
