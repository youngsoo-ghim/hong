package kr.co.nurier.vo.code;

public class MCommCdVO {
    private String cdId   ; /* 코드아이디 */
    private String cdNm   ; /* 코드명     */
    private String cdDesc ; /* 코드설명   */
    private String isUsed ; /* 사용여부   */
    
    public String getCdId() {
        return cdId;
    }
    public void setCdId(String cdId) {
        this.cdId = cdId;
    }
    public String getCdNm() {
        return cdNm;
    }
    public void setCdNm(String cdNm) {
        this.cdNm = cdNm;
    }
    public String getCdDesc() {
        return cdDesc;
    }
    public void setCdDesc(String cdDesc) {
        this.cdDesc = cdDesc;
    }
    public String getIsUsed() {
        return isUsed;
    }
    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }
}
