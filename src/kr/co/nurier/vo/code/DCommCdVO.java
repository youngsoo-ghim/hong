package kr.co.nurier.vo.code;

public class DCommCdVO {
    private String cdId    ; /* 코드아이디      */
    private String cdDtlId ; /* 코드상세아이디  */
    private String cdDtlNm ; /* 코드상세명      */
    private int    cdRank  ; /* 코드순위        */
    private String cdDesc  ; /* 코드설명        */
    private String isUsed  ; /* 사용여부        */

    public String getCdId() {
        return cdId;
    }
    public void setCdId(String cdId) {
        this.cdId = cdId;
    }
    public String getCdDtlId() {
        return cdDtlId;
    }
    public void setCdDtlId(String cdDtlId) {
        this.cdDtlId = cdDtlId;
    }
    public String getCdDtlNm() {
        return cdDtlNm;
    }
    public void setCdDtlNm(String cdDtlNm) {
        this.cdDtlNm = cdDtlNm;
    }
    public int getCdRank() {
        return cdRank;
    }
    public void setCdRank(int cdRank) {
        this.cdRank = cdRank;
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
