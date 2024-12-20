package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.SwitchableLight;

public class Team6976HM2025 {

    public DcMotor DriveRightBack = null;

    public DcMotor DriveLeftBack = null;

    public DcMotor DriveLeftFront = null;

    public DcMotor DriveRightFront = null;

    public DcMotor Arm1 = null;

    public DcMotor Slides = null;

    public Servo Intake = null;

    public CRServo clawTilt = null;

    //public NormalizedColorSensor ColorSensor = null;



    //public ElapsedTime period  = new ElapsedTime();

    // public Team4008HMNew() {}

    HardwareMap hwMap = null;
    //FIX AND USE IT
    public void Map(HardwareMap hardwareMap)
    {
        hwMap = hardwareMap;
        DriveLeftFront = hwMap.get(DcMotor.class,"DriveLeftFront");
        DriveRightFront = hwMap.get(DcMotor.class,"DriveRightFront");
        DriveLeftBack = hwMap.get(DcMotor.class,"DriveLeftBack");
        DriveRightBack = hwMap.get(DcMotor.class,"DriveRightBack");

        Arm1 = hwMap.get(DcMotor.class, "Arm1");
        Arm1.setDirection(DcMotorSimple.Direction.REVERSE);
        Arm1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Arm1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        Slides = hwMap.get(DcMotor.class, "Slides");
        Slides.setDirection(DcMotorSimple.Direction.REVERSE);
        Slides.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Slides.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //   Lights = hwMap.get(RevBlinkinLedDriver.class,"Lights");

        DriveLeftFront.setDirection(DcMotor.Direction.FORWARD);
        DriveLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveLeftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DriveRightFront.setDirection(DcMotor.Direction.REVERSE);
        DriveRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveRightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DriveLeftBack.setDirection(DcMotor.Direction.FORWARD);
        DriveLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveLeftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DriveRightBack.setDirection(DcMotor.Direction.REVERSE);
        DriveRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DriveRightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


//        Turret = hwMap.get(DcMotor.class,"Turret");
//        Turret.setDirection(DcMotorSimple.Direction.REVERSE);
//        Turret.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        //IntakeLift.setDirection(DcMotor.Direction.REVERSE);

//        Elevator = hwMap.get(DcMotor.class, "Elevator");
//        Elevator.setDirection(DcMotorSimple.Direction.REVERSE);
//        Elevator.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        Elevator.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);



//        Arm2 = hwMap.get(DcMotor.class, "Arm2");
//        Arm2.setDirection(DcMotorSimple.Direction.REVERSE);
//        Arm2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        Arm2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        Intake = hwMap.get(Servo.class, "Intake");

        clawTilt = hwMap.get(CRServo.class, "clawTilt");

        //Arm = hwMap.get(DcMotor.class, "Arm");

//        ColorSensor = hwMap.get(NormalizedColorSensor.class, "sensor");

    }
}
