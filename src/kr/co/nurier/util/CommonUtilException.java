/**<pre>
 * CommonUtilException : 공통 유틸에서 발생하는 Exception.
 * 공통 유틸에서 발생하는 Exception의 경우 에러메세지와 함께 CommonUtilException를 throws한다.
 * 
 * update history
 * @since 2002/08/31
 * </pre>
*/


package kr.co.nurier.util;

public class CommonUtilException extends ComException
{
  public CommonUtilException()
  {
    super();
  }

  public CommonUtilException(String error)
  {
    super(error);
  }

  public CommonUtilException(String errorCode, String error)
  {
    super(error);
    super.setErrorCode(errorCode);
  }

  public CommonUtilException(String errorCode, String errorMessage, String error)
  {
    super(error);
    super.setErrorCode(errorCode);
    super.setErrmessage(errorMessage);
  }

}

