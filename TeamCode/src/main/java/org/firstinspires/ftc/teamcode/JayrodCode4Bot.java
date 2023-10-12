package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp()
public class JayrodCode4Bot extends OpMode {
    public DcMotor arm = null;
    @Override
    public void init() {
        FtcDashboard dashboard = FtcDashboard.getInstance();
        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());
        arm = hardwareMap.get(DcMotor.class, "left_arm");
    }
    public void loop(){
        if (gamepad1.dpad_up){
            //arm up code
            arm.setPower(0.2);
        } else if (gamepad1.dpad_down){
            //arm down code
            arm.setPower(-.2);
        }else if (gamepad1.dpad_left){
            //open hands
        } else if (gamepad1.dpad_right){
            //close hands
        }
    }
}
//package org.firstinspires.ftc.teamcode;
//        import com.acmerobotics.dashboard.FtcDashboard;
//        import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
//        import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//@TeleOp()
//public class jayrod extends OpMode {
//    @Override
//    public void init() {
//        FtcDashboard dashboard = FtcDashboard.getInstance();
//        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());
//        double motorSpeed = 1;
//        boolean touchSensorPressed = true;
//
//        telemetry.addData("Motor Speed", motorSpeed);
//        telemetry.addData("Touch Sensor", touchSensorPressed);
//    }
//    @Override
//    public void loop() {
//        float gamepadY = gamepad1.left_stick_y;
//        float gamepadX = gamepad1.left_stick_x;
//        if (gamepad1.a && gamepad1.b){
//            gamepadX = gamepad1.left_stick_y;
//            gamepadY = gamepad1.left_stick_x;
//        }
//        if (gamepad1.left_stick_y < 0) {
//            telemetry.addData("Left Stick", " is negative");
//        } else if (gamepad1.left_stick_y == 0) {
//            telemetry.addData("Left Stick", " is neutral");
//        } else {
//            telemetry.addData("Left Stick", " is positive");
//        }
//        double forwardSpeed = gamepad1.left_stick_y;
//        if (!gamepad1.a){
//            forwardSpeed *= .5;
//        }
//        telemetry.addData("speed = ", forwardSpeed);
//    }
//}