package org.hotutilites.hotInterfaces;

import frc.robot.RobotCommandProvider;

public interface IHotUnsensedActuator
{
   public void preformAction(RobotCommandProvider commander, IRobotState robotState);
}