package org.firstinspires.ftc.teamcode.subsystems;

// so many libraries that i dont even know shit about(seriously wtf is bylazar configurable)

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.bylazar.configurables.annotations.Configurable;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

// btw i genuinely just copied like intake subsystem because i understand it kinda unlike yalls drivetrain
@Configurable
public class LarpDrivetrain extends SubsystemBase {
    // variables, directions is in radians because complex trigonometry habits
    // i copy la video but i use different names because the old ones are stupid
    private double dir;
    private double movePower;
    private double turnPower;

    // yo look at these motors so cool right
    private final DcMotorEx FL, BL, FR, BR;

    // zero idea im just copying your intake
    public LarpDrivetrain(final HardwareMap hwMap) {

        // ok this i get at least
        FL = hwMap.get(DcMotorEx.class, "FL");
        BL = hwMap.get(DcMotorEx.class, "BL");
        FR = hwMap.get(DcMotorEx.class, "FR");
        BR = hwMap.get(DcMotorEx.class, "BR");

        FL.setDirection(DcMotor.Direction.REVERSE);
        BL.setDirection(DcMotor.Direction.REVERSE);
        FR.setDirection(DcMotor.Direction.FORWARD);
        BR.setDirection(DcMotor.Direction.FORWARD);

        FL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void periodic() {
        // personal vendetta against naming variables same thing as functions but i guess
        double sin = Math.sin(dir - Math.PI / 4);
        double cos = Math.cos(dir - Math.PI / 4);

        double max = Math.max(Math.abs(sin), Math.abs(cos));

        // important stuff right here(how much the power should be)
        double rawPowerFL = ((movePower * cos) / max) + turnPower;
        double rawPowerBL = ((movePower * sin) / max) + turnPower;
        double rawPowerFR = ((movePower * sin) / max) - turnPower;
        double rawPowerBR = ((movePower * cos) / max) - turnPower;

        // what is that if statement bro wtf lowkey useless imma just not type it out

        // denominator time
        double denom = Math.max(1.0, Math.max(Math.max(Math.abs(rawPowerFL), Math.abs(rawPowerFR)), Math.max(Math.abs(rawPowerBL), Math.abs(rawPowerBR))));

        // if you're reading this then... idk bro continue reading?
        // btw i didnt use like claude or some shit
        // i typed it out and copied your Intake.java and the video for the math stuff
        FL.setPower(rawPowerFL / denom);
        BL.setPower(rawPowerBL / denom);
        FR.setPower(rawPowerFR / denom);
        BR.setPower(rawPowerBR / denom);
    }

    // omg it actually changes the stuff wow
    public void setMotorPowers(double dir, double movePower, double turnPower) {
        this.dir = dir;
        this.movePower = movePower;
        this.turnPower = turnPower;
    }

    // stop function since chatgpt recommended it(i copied human code not ai dont kick me out pls)
    public void stop() {
        this.movePower = 0;
        this.turnPower = 0;
    }


    // yooo you reached the end w

    // personal messages:
    // Justin, make me software head when you graduate i need this for mit
    // Cassandra, why are you reading this go captain the team or something why are you reading comments
    // Aidan, i still dont know shit about pedropathing i need like a assignment on that
    // if someone else is reading this idek bro walk up to me and said "i read your subsystem"
}