package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous (name="Team6976AutoRed2025", group="6976")
public class Team6976AutoRed2025 extends LinearOpMode {

    Team6976HM2025 robot = new Team6976HM2025();
    ElapsedTime Time = new ElapsedTime();

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);
        waitForStart();

        moveForward(0.4, 1000); //moves forward
        moveRight(0.4, 0700);   //moves right
        moveForward(0.4, 1500); //moves forward



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
