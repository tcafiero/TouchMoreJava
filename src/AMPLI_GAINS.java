//  ----------------------------------------------------------------------------
//  * This file was automatically generated by SWIG (http://www.swig.org).
//  * Version 2.0.9
//  *
//  * Do not make changes to this file unless you know what you are doing--modify
//  * the SWIG interface file instead.
//  * -----------------------------------------------------------------------------

public final class AMPLI_GAINS
{
  // Attributes
  
  private static int swigNext = 0;
  
  private final int swigValue;
  
  private final String swigName;
  
  // Roles
  
  public final static AMPLI_GAINS NO_GAIN = new AMPLI_GAINS("NO_GAIN");
  
  public final static AMPLI_GAINS LOW_GAIN12 = new AMPLI_GAINS("LOW_GAIN12");
  
  public final static AMPLI_GAINS HIGH_GAIN26 = new AMPLI_GAINS("HIGH_GAIN26");
  
  public final static AMPLI_GAINS END_GAIN = new AMPLI_GAINS("END_GAIN");
  
  private static AMPLI_GAINS[] swigValues = { NO_GAIN, LOW_GAIN12, HIGH_GAIN26, END_GAIN };
  
  // Operations
  
  public final int swigValue()
  {
  // ## OperationBody [86bd6b88-4523-482d-8803-26d17178a610] 
      return swigValue;
  // ## OperationBody End 
  }
  
  public String toString()
  {
  // ## OperationBody [54351f70-654c-4b07-9e51-9de622233eb7] 
      return swigName;
  // ## OperationBody End 
  }
  
  public static AMPLI_GAINS swigToEnum(int swigValue)
  {
  // ## OperationBody [e04632e0-6851-48a8-9442-000081f861d3] 
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AMPLI_GAINS.class + " with value " + swigValue);
  // ## OperationBody End 
  }
  
  private AMPLI_GAINS(String swigName)
  {
  // ## OperationBody [5ec5a21c-3078-4999-8a32-ceb8f43e1425] 
      this.swigName = swigName;
      this.swigValue = swigNext++;
  // ## OperationBody End 
  }
  
  private AMPLI_GAINS(String swigName,
    int swigValue)
  {
  // ## OperationBody [cd1279d9-acb2-4a89-a382-db2461e10d1b] 
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
  // ## OperationBody End 
  }
  
  private AMPLI_GAINS(String swigName,
    AMPLI_GAINS swigEnum)
  {
  // ## OperationBody [1a8528f0-520f-4071-a922-b249abe9606b] 
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
  // ## OperationBody End 
  }

}
