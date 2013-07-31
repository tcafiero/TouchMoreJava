// File : ./GUI_SIMULATION.java

import java.util.concurrent.Semaphore;

public class GUI_SIMULATION
{
  // \ART_SMG :: Created for state : GUI_SIMULATION
  public enum RtsGUI_SIMULATION_States
  {
    RtsGUI_SIMULATION_States_FirstState,
    RtsGUI_SIMULATION_States_SecondState,
    RtsGUI_SIMULATION_States_NotIn_GUI_SIMULATION
  }
  
  // Attributes
  
  private Timer RtsTimer;
  
  // \ART_SMG :: Created for state : GUI_SIMULATION
  private RtsGUI_SIMULATION_States RtsCurrent_GUI_SIMULATION;
  
  // \ART_SMG :: Always Created
  private Semaphore RtsBusy;
  
  // Operations
  
  public void Click()
  {
  // ## OperationBody [bbf510c0-895b-4cea-bfec-e22fb9177e22] 
  /* START_SMG_BODY */
  
  try
  {
    RtsBusy.acquire();
  }
  catch (InterruptedException e)
  {}
  Click_In_GUI_SIMULATION();
  while(RtsRunToCompletion());
  RtsBusy.release();
  /* END_SMG_BODY */
  // ## OperationBody End 
  }
  
  public void ClickDx()
  {
  // ## OperationBody [626003fd-cf64-48b0-bd5f-1b36bfcccb67] 
  /* START_SMG_BODY */
  
  try
  {
    RtsBusy.acquire();
  }
  catch (InterruptedException e)
  {}
  ClickDx_In_GUI_SIMULATION();
  while(RtsRunToCompletion());
  RtsBusy.release();
  /* END_SMG_BODY */
  // ## OperationBody End 
  }
  
  public GUI_SIMULATION()
  {
  // ## OperationBody [8d42ae50-5b0d-41c4-a081-780f2a2fd63b] 
  RtsTimer=new Timer();
  /* START_SMG_BODY */
  
  
  RtsBusy = new Semaphore(1);
  try
  {
    RtsBusy.acquire();
  }
  catch (InterruptedException e)
  {}
  
  
  /* Initialising State Vectors to NotIn */
  RtsCurrent_GUI_SIMULATION=RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_NotIn_GUI_SIMULATION;
  
  while(RtsRunToCompletion());
  RtsBusy.release();
  
  /* END_SMG_BODY */
  // ## OperationBody End 
  }
  
  public void KeyPress()
  {
  // ## OperationBody [d8eedc1b-4ad4-4dbb-9511-2ae3c91efd85] 
  /* START_SMG_BODY */
  
  try
  {
    RtsBusy.acquire();
  }
  catch (InterruptedException e)
  {}
  KeyPress_In_GUI_SIMULATION();
  while(RtsRunToCompletion());
  RtsBusy.release();
  /* END_SMG_BODY */
  // ## OperationBody End 
  }
  
  public static int TimerSet(boolean bPaused,
    Object TimerInstance,
    long lTimeToFire,
    Object TimerDetails,
    long lMultiplier)
  {
  int Ret = 1;
  if(bPaused == true)
  {
  	((RtsTimer)TimerInstance).RtsStopTimer();
  }
  else
  {
  	// Restart it
  	((RtsTimer)TimerInstance).RtsStartTimer(lTimeToFire);
  }
  return Ret;
  }
  
  private boolean RtsRunToCompletion()
  {
  if (RtsCurrent_GUI_SIMULATION == RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_NotIn_GUI_SIMULATION)
  {
  	RtsEnter_FirstState();
  	return true;
  }
  return false;
  }
  
  // \ART_SMG :: Destructor
  public void SMGDestroy()
  {
  RtsBusy = null;
  
  }
  
  // \ART_SMG :: Created for state : FirstState
  private void RtsEnter_FirstState()
  {
  RtsCurrent_GUI_SIMULATION = RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_FirstState;
  
  }
  
  // \ART_SMG :: Created for state : SecondState
  private void RtsEnter_SecondState()
  {
  RtsCurrent_GUI_SIMULATION = RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_SecondState;
  
  }
  
  // \ART_SMG :: Created for state : FirstState
  private void RtsExit_FirstState()
  {
  	
  	}
  
  // \ART_SMG :: Created for state : SecondState
  private void RtsExit_SecondState()
  {
  		
  		}
  
  private boolean Click_In_GUI_SIMULATION()
  {
  if (RtsCurrent_GUI_SIMULATION == RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_FirstState)
  {
  	RtsExit_FirstState();
  	
  // ## Action [d6376b30-7bec-4e3d-af1a-d0377ced8835] 
  dsp.doMute();
  // ## Action End 
  
  	RtsEnter_FirstState();
  	
  	return true;
  }
  if (RtsCurrent_GUI_SIMULATION == RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_SecondState)
  {
  	RtsExit_SecondState();
  	
  // ## Action [d3244437-f871-423d-a098-2ee8f9ba1da6] 
  dsp.doDeMute();
  // ## Action End 
  
  	RtsEnter_SecondState();
  	
  	return true;
  }
  return false;
  }
  
  private boolean ClickDx_In_GUI_SIMULATION()
  {
  if (RtsCurrent_GUI_SIMULATION == RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_FirstState)
  {
  	RtsExit_FirstState();
  	RtsEnter_SecondState();
  	
  	return true;
  }
  if (RtsCurrent_GUI_SIMULATION == RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_SecondState)
  {
  	RtsExit_SecondState();
  	RtsEnter_FirstState();
  	
  	return true;
  }
  return false;
  }
  
  private boolean KeyPress_In_GUI_SIMULATION()
  {
  if (RtsCurrent_GUI_SIMULATION == RtsGUI_SIMULATION_States.RtsGUI_SIMULATION_States_SecondState)
  {
  	RtsExit_SecondState();
  	
  // ## Action [1c3b63da-caca-4238-9e45-dd4a4bc58764] 
  System.out.println("Key pressed");
  // ## Action End 
  
  	RtsEnter_SecondState();
  	
  	return true;
  }
  return false;
  }

}
