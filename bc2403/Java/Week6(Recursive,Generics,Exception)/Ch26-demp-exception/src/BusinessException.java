public class BusinessException extends Exception {

 private int code;

 private BusinessException(Syscode syscode) { // Why private?
  super(syscode.getDesc());
  this.code = syscode.getCode();
 }
  /* Constructor is private becuase -> 封裝 */
  /* 封裝咗個Constructor */
  /* prensent 緊下面這個static method */
  /* 這技巧係逼對方用static method */
 public static BusinessException of(Syscode syscode) {
  if (syscode == null) // 防守check吓係咪null
   throw new IllegalArgumentException();
  return new BusinessException(syscode);
 }

 public static void main(String[] args) throws BusinessException {
  Exception e = new Exception("Login Fail!");
  

  // Objective: 1000 -> Login Fail
  // 1001 -> Password Wrong
  // 1002 -> user id not found
  BusinessException be = new BusinessException(Syscode.ID_NOT_FOUND);
  
  // be is a throwable
  throw be;

 }
}
