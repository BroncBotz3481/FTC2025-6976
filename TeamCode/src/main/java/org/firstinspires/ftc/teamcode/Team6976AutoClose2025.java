package org.firstinspires.ftc.teamcode;
/* This should theoretically work on both the red and blue sides of the field, and it really only
depends on if we're on the right side or the left side of the field, relative to the
driver/operator/coach area, of course.*/

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous (name="Team6976AutoClose2025", group="6976")
public class Team6976AutoClose2025 extends LinearOpMode {

    Team6976HM2025 robot = new Team6976HM2025();
    ElapsedTime Time = new ElapsedTime();

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);
        waitForStart();
        //This should park. Maybe.
        moveRight(0.4, 1200);   //moves right



    }

    public void moveForward (double power, int time) {
        robot.DriveRightFront.setPower(-power);
        robot.DriveLeftFront.setPower(-power);
        robot.DriveRightBack.setPower(-power);
        robot.DriveLeftBack.setPower(-power);
        sleep(time);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);
    }
    public void moveBackward (double power, int time){
        robot.DriveRightFront.setPower(power);
        robot.DriveLeftFront.setPower(power);
        robot.DriveRightBack.setPower(power);
        robot.DriveLeftBack.setPower(power);
        sleep(time);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);
    }
    public void moveLeft (double power, int time){
        robot.DriveRightFront.setPower(power);
        robot.DriveLeftFront.setPower(-power);
        robot.DriveRightBack.setPower(-power );
        robot.DriveLeftBack.setPower(power);
        sleep(time);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveLeftBack.setPower(0);
    }
    public void moveRight (double power, int time){
        robot.DriveRightFront.setPower(power);
        robot.DriveLeftFront.setPower(-power);
        robot.DriveRightBack.setPower(-power);
        robot.DriveRightBack.setPower(power);
        sleep(time);
        robot.DriveRightFront.setPower(0);
        robot.DriveLeftFront.setPower(0);
        robot.DriveRightBack.setPower(0);
        robot.DriveRightBack.setPower(0);
    }
}
