package org.firstinspires.ftc.teamcode.opmodes.auton.trajectories;

import static org.firstinspires.ftc.teamcode.utils.AutonomousHelpers.buildCurve;
import static org.firstinspires.ftc.teamcode.utils.AutonomousHelpers.buildLine;

import com.bylazar.configurables.annotations.Configurable;
import com.pedropathing.geometry.Pose;

import org.firstinspires.ftc.teamcode.utils.AutonomousHelpers;

import java.io.File;
import com.pedropathing.paths.Path;
import java.util.HashMap;

@Configurable
public class RedTiltTwoTrajectories {
    private final HashMap<String, Pose> poses;
    public Path shootFirst, intakeFirst, shootSecond, intakeSecond, shootThird, park;

    public RedTiltTwoTrajectories() {
        this.poses = AutonomousHelpers.getPosesByName(new File("").getAbsolutePath().concat("/sdcard/FIRST/positions/RedTiltTwo.pp"));

        this.shootFirst = buildLine(
                poses.get("startPoint"),
                poses.get("shootFirst"),
                AutonomousHelpers.HeadingInterpolation.LINEAR
        );

        this.intakeFirst = buildCurve(
                poses.get("shootFirst"),
                poses.get("intakeFirstControl0"),
                poses.get("intakeFirst"),
                AutonomousHelpers.HeadingInterpolation.LINEAR
        );

        this.shootSecond = buildCurve(
                poses.get("intakeFirst"),
                poses.get("shootSecondControl0"),
                poses.get("shootSecondControl1"),
                poses.get("shootSecond"),
                AutonomousHelpers.HeadingInterpolation.LINEAR
        );

        this.intakeSecond = buildCurve(
                poses.get("shootSecond"),
                poses.get("intakeSecondControl0"),
                poses.get("intakeSecond"),
                AutonomousHelpers.HeadingInterpolation.LINEAR
        );

        this.shootThird = buildCurve(
                poses.get("intakeSecond"),
                poses.get("shootThirdControl0"),
                poses.get("shootThird"),
                AutonomousHelpers.HeadingInterpolation.LINEAR
        );

        this.park = buildLine(
                poses.get("shootThird"),
                poses.get("park"),
                AutonomousHelpers.HeadingInterpolation.LINEAR
        );
    }

    public Pose getStart() { return this.poses.get("startPoint"); }
}
