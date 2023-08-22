package testing.uvlamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rs.ac.singidunum.testiranje.uvlamp.UVLamp;

public class UVLampTest {
    @Test
    public void UvLamp_ShouldCreateUVLampObjectInTurnedOffState(){
        UVLamp uvLamp = new UVLamp();

        Assertions.assertEquals(UVLamp.LED_STATE.OFF,uvLamp.getLedState());
        Assertions.assertEquals("",uvLamp.getScreenText());
    }


    @Test
    public void switch1_ShouldChangeStateToStandBy_IfCurrentStateIsTurnedOff(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("STBY",uvLamp.getScreenText());
    }
    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsStandBy(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch1();

        Assertions.assertEquals(UVLamp.LED_STATE.OFF,uvLamp.getLedState());
        Assertions.assertEquals("",uvLamp.getScreenText());
    }
    @Test
    public void switch2_ShouldChangeStateToSelectionModeIf_IfCurrentStateIsStandBy(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PRSEL",uvLamp.getScreenText());
    }
    @Test
    public void switch3_ShouldChangeStateToStandByIf_IfCurrentStateIsSelectionMode(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch3();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("STBY",uvLamp.getScreenText());
    }
    @Test
    public void switch1_ShouldChangeStateToTurnedOFF_IfCurrentStateIsSelectionMode(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch1();

        Assertions.assertEquals(UVLamp.LED_STATE.OFF,uvLamp.getLedState());
        Assertions.assertEquals("",uvLamp.getScreenText());
    }
    @Test
    public void switch2_ShouldChangeStateToProgramme1Selected_IfCurrentStateIsSelectionMode(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PR1",uvLamp.getScreenText());
    }
    @Test
    public void switch3_ShouldChangeStateToSelectionMode_IfCurrentStateIsProgramme1Selected(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch3();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PRSEL",uvLamp.getScreenText());
    }
    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsProgramme1Selected(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch1();

        Assertions.assertEquals(UVLamp.LED_STATE.OFF,uvLamp.getLedState());
        Assertions.assertEquals("",uvLamp.getScreenText());
    }
    @Test
    public void switch4_ShouldChangeStateToProgramme1Running_IfCurrentStateIsProgramme1Selected(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        Assertions.assertEquals(UVLamp.LED_STATE.BLINKING,uvLamp.getLedState());
        Assertions.assertEquals("PR1",uvLamp.getScreenText());
    }
    @Test
    public void switch3_ShouldChangeStateToProgramme1Paused_IfCurrentStateIsProgramme1Running(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();
        uvLamp.switch3();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PAUSE",uvLamp.getScreenText());
    }
    @Test
    public void switch4_ShouldChangeStateToProgramme1Running_IfCurrentStateIsProgramme1Paused(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();
        uvLamp.switch3();
        uvLamp.switch4();

        Assertions.assertEquals(UVLamp.LED_STATE.BLINKING,uvLamp.getLedState());
        Assertions.assertEquals("PR1",uvLamp.getScreenText());
    }
    @Test
    public void switch2_ShouldChangeStateToProgramme2Selected_IfCurrentStateIsProgramme1Selected(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PR2",uvLamp.getScreenText());
    }
    @Test
    public void switch2_ShouldChangeStateToProgramme1Selected_IfCurrentStateIsProgramme2Selected(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PR1",uvLamp.getScreenText());
    }
    @Test
    public void switch4_ShouldChangeStateToProgramme2Running_IfCurrentStateIsProgramme2Selected(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        Assertions.assertEquals(UVLamp.LED_STATE.BLINKING,uvLamp.getLedState());
        Assertions.assertEquals("PR2",uvLamp.getScreenText());
    }
    @Test
    public void switch1_ShouldChangeStateToTurnedOff_IfCurrentStateIsProgramme2Selected(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch1();

        Assertions.assertEquals(UVLamp.LED_STATE.OFF,uvLamp.getLedState());
        Assertions.assertEquals("",uvLamp.getScreenText());
    }
    @Test
    public void switch3_ShouldChangeStateToProgrammeSelection_IfCurrentStateIsProgramme2Selected(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch3();

        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PRSEL",uvLamp.getScreenText());
    }

    @Test
    public void internalEvent_ShouldChangeStateToStandBy_IfCurrentStateIsProgramme2Running_WhenMoreThan30SecondsPassed(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        try {
            Thread.sleep(31000);

        }catch (Exception e){

        }
        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("STBY",uvLamp.getScreenText());
    }
    @Test
    public void internalEvent_ShouldNotChangeStateToStandBy_IfCurrentStateIsProgramme2Running_WhenLessThan30SecondsPassed(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        try {
            Thread.sleep(29000);

        }catch (Exception e){

        }
        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("STBY",uvLamp.getScreenText());
    }
    @Test
    public void switch3ShouldChangeStateToSelectionMode_IfCurrentStateIsProgramme2RunningWhenLessThan30SecondsPassed(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        try {
            Thread.sleep(5000);

        }catch (Exception e){

        }

        uvLamp.switch3();

        try {
            Thread.sleep(1000);

        }catch (Exception e){

        }
        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PRSEL",uvLamp.getScreenText());
    }
    @Test
    public void internalEvent_ShouldChangeStateToStandBy_IfCurrentStateIsProgramme1Running_WhenMoreThan60SecondsPassed(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        try {
            Thread.sleep(61000);

        }catch (Exception e){

        }
        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("STBY",uvLamp.getScreenText());
    }
    @Test
    public void internalEvent_ShouldChangeStateToStandBy_IfCurrentStateIsProgramme1Running_WhenLess60SecondsPassed(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        try {
            Thread.sleep(59000);

        }catch (Exception e){

        }
        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("STBY",uvLamp.getScreenText());
    }
    @Test
    public void switch3ShouldChangeStateToPaused_IfCurrentStateIsProgramme1RunningWhenLessThan30SecondsPassed(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        try {
            Thread.sleep(5000);

        }catch (Exception e){

        }

        uvLamp.switch3();

        try {
            Thread.sleep(1000);

        }catch (Exception e){

        }
        Assertions.assertEquals(UVLamp.LED_STATE.ON,uvLamp.getLedState());
        Assertions.assertEquals("PAUSE",uvLamp.getScreenText());
    }
    @Test
    public void switch4ShouldChangeStateToProgramme1Running_IfCurrentStateIsPaused(){
        UVLamp uvLamp = new UVLamp();

        uvLamp.switch1();
        uvLamp.switch2();
        uvLamp.switch2();
        uvLamp.switch4();

        try {
            Thread.sleep(50000);

        }catch (Exception e){

        }

        uvLamp.switch3();

        try {
            Thread.sleep(20000);

        }catch (Exception e){

        }
        uvLamp.switch4();
        try {
            Thread.sleep(20000);

        }catch (Exception e){

        }
        Assertions.assertEquals(UVLamp.LED_STATE.BLINKING,uvLamp.getLedState());
        Assertions.assertEquals("PR1",uvLamp.getScreenText());
    }

}
