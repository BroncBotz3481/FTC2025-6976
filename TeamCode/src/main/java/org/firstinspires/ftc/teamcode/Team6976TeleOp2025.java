package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "Team6976TeleOp2025", group = "6976")
public class Team6976TeleOp2025 extends LinearOpMode {
    Team6976HM2025 robot = new Team6976HM2025();

    public static double intakeClose = 0;
    public static double intakeOpen = 0.5;

    @Override
    public void runOpMode() {
        robot.Map(hardwareMap);
        telemetry.addData("Say", "TeleOp Starting");
        telemetry.update();
        robot.DriveRightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.DriveRightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.DriveLeftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.DriveLeftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.DriveRightBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.DriveRightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.DriveLeftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.DriveLeftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.Intake.setPosition(intakeClose);
//        robot.Intake.setPosition(0.3);

        int count = 0;
        //robot.Lights.setPattern(RevBlinkinLedDriver.BlinkinPattern.BEATS_PER_MINUTE_PARTY_PALETTE);
        waitForStart();

        while (opModeIsActive()) {
            boolean speedslow = gamepad1.right_bumper;
            double mag = speedslow ? 0.5 : 1.0;
            //Drivetrain controls (Controller 1)
            double y = gamepad1.left_stick_y; // Remember, this is reversed!
            double x = -gamepad1.left_stick_x * 1.1; // Counteract imperfect strafing
            double rx = -gamepad1.right_stick_x;
            // Arm controls (Controller 2)
            double y2 = gamepad2.left_stick_y;
            double y3 = gamepad2.right_stick_y;


          /*  if (robot.Touched.isPressed()) {
                telemetry.addData("Touch", robot.Touched.isPressed());
                telemetry.update();
            } */

            // hello
            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio, but only when
            // at least one is out of the range [-1, 1]
            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1.5);
            double frontLeftPower = (y + x + rx) / denominator;
            double backLeftPower = (y - x + rx) / denominator;
            double frontRightPower = (y - x - rx) / denominator;
            double backRightPower = (y + x - rx) / denominator;

            telemetry.addData("RightFront", robot.DriveRightFront.getCurrentPosition());
            telemetry.addData("RightBack", robot.DriveRightBack.getCurrentPosition());
            telemetry.addData("LeftFront", robot.DriveLeftFront.getCurrentPosition());
            telemetry.addData("LeftBack", robot.DriveLeftBack.getCurrentPosition());
            telemetry.update();

            robot.DriveLeftFront.setPower(frontLeftPower * mag);
            robot.DriveLeftBack.setPower(backLeftPower * mag);
            robot.DriveRightFront.setPower(frontRightPower * mag);
            robot.DriveRightBack.setPower(backRightPower * mag);

            boolean ArmSlow = gamepad2.a;
            double slow = ArmSlow ? 0.55 : 1;
            boolean ArmFast = gamepad2.b;
            double fast = ArmFast ? 10 : 1;
            boolean SlidesFast = gamepad2.x;
            double fast2 = SlidesFast ? 10 : 1;

            double armPos = -gamepad2.left_stick_y;
            robot.Arm1.setPower(armPos * 0.6 * slow * fast);

            double slidesPos = -gamepad2.right_stick_y;
            robot.Slides.setPower(slidesPos * 0.6 * fast2);

            double wristPos = gamepad2.right_stick_x;
            robot.clawTilt.setPower(wristPos);

            robot.Slides.setPower(slidesPos * 0.9 * fast2);


            if (gamepad2.right_bumper){
                robot.Intake.setPosition(intakeClose);
            }
            if (gamepad2.left_bumper){
                robot.Intake.setPosition(intakeOpen);
            }


            while (gamepad2.right_trigger > 0.3){
                robot.clawTilt.setPower(gamepad2.right_trigger);
            }
            robot.clawTilt.setPower(0);

            while (gamepad2.left_trigger > 0.3){
                robot.clawTilt.setPower(-gamepad2.left_trigger);
            }
            robot.clawTilt.setPower(0);





        }
    }
}