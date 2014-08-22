package kr.co.nurier.util;

/**
 * 
 * @(#) ComException.java
 * Copyright 1999-2000 by  Infron Systems, Inc.,
 * Information Technology Group
 * All rights reserved.
 *  
 * NOTICE !      You can copy or redistribute this code freely, 
 * but you should not remove the information about the copyright notice 
 * and the author.
 *  
 * @author Yun Han Yun, yunhany@empal.com
 * @version $Revision:   1.2  $ $Date:   Aug 26 2002 12:41:04  $
 */
public class ComException extends Exception implements java.io.Serializable {

  private String com_cmd;
  private String title;
  private String target;
  private String errmessage;
  private String errcode;
  private String errdetailcode;
  private String strUrl;
  private int popup = 0;

  public ComException() {
     super();
  }
       /**
  * @params java.lang.String
  */
  public ComException(String s)              {    super(s);  }
       /**
  * 에러코드를 읽어 온다
  * @return java.lang.String
  */
  public String getErrorCode()             { return errcode;   }
       
       /**
  * 에러코드를 읽어 저장
  * @params java.lang.String
  */
  public void setErrorCode(String errcode)   { this.errcode = errcode ;   }

  /**
  * 에러코드를 읽어 온다
  * @return java.lang.String
  */
  public String getErrorDetailCode()             { return errdetailcode;   }

   /**
  * 상세 에러코드를 읽어 저장
  * @params java.lang.String
  */
  public void setErrorDetailCode(String err)   { this.errdetailcode = err ;   }
  
       /**
  * Title Return!
  * @return java.lang.String
  */
  public String getTitle()       { return title;         }
       /**
  * Title Setting!
  * @params java.lang.String
  */
  public void setTitle(String title)         { this.title = title;   }
   
       /**
  * Target Return!
  * @return java.lang.String
  */
  public String getTarget()             { return target;      }
       /**
  * Target Setting!
  * @params java.lang.String
  */
  public void setTarget(String target)       { this.target = target;}
  
       /**
  * Errmessage Return!
  * @return java.lang.String
  */
  public String getErrmessage()       { return errmessage;      }
       /**
  * Errmessage Setting!
  * @params java.lang.String
  */
  public void setErrmessage(String errmessage) { this.errmessage = errmessage;  }


       /**
  * CMD Return!
  * @return java.lang.String
  */

  public String getCom_cmd()      { return com_cmd;      }

       /**
  * Com_cmd Setting!
  * @params java.lang.String
  */

  public void setCom_cmd(String com_cmd)      {

    if(com_cmd == null)
         com_cmd ="";
    this.com_cmd = com_cmd ;     }

       /**
  * Com_cmd Setting!
  * @params java.lang.String
  */
  public void setUrl(String strUrl)           { this.strUrl = strUrl ;     }
       /**
  * URL Setting!
  * @params java.lang.String
  */
  public String getUrl()                      { return strUrl ;     }

       /**
  * Popup창 여부 설정
  * @params Popup창 여부
  * 0( Default! ), 1(Close), 2(NextFlow)
  *
  */
  public void setPopup(int popup)              { this.popup = popup ;     }
       /**
  * Popup창 여부 리턴
  */
  public int getPopup()                        { return this.popup ;     }

 }
 