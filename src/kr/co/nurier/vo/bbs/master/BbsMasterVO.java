package kr.co.nurier.vo.bbs.master;

public class BbsMasterVO {

    private String bbsId           ;    /* 게시판아이디 */
    private String bbsNm           ;    /* 보드명 */
    private String bbsIntro        ;    /* 보드설명 */
    private String typeCode        ;    /* 보드 타입코드 */
    private String attrCode        ;    /* 보드 속성 코드 */
    private String replyYn         ;    /* 답변 여부 */
    private String attachedfileYn  ;    /* 화일첨부여부 */
    private int    attechedfileNum ;    /* 화일첨부가능개수 */
    private String useYn           ;    /* 사용여부 */
    private String insertId        ;    /* 입력자아이디 */
    private String insertDate      ;    /* 입력시간 */
    private String updateId        ;    /* 수정자아이디 */
    private String updateDate      ;    /* 수정시간 */

    public String getBbsId() {
        return bbsId;
    }
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    public String getBbsNm() {
        return bbsNm;
    }
    public void setBbsNm(String bbsNm) {
        this.bbsNm = bbsNm;
    }
    public String getBbsIntro() {
        return bbsIntro;
    }
    public void setBbsIntro(String bbsIntro) {
        this.bbsIntro = bbsIntro;
    }
    public String getTypeCode() {
        return typeCode;
    }
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
    public String getAttrCode() {
        return attrCode;
    }
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }
    public String getReplyYn() {
        return replyYn;
    }
    public void setReplyYn(String replyYn) {
        this.replyYn = replyYn;
    }
    public String getAttachedfileYn() {
        return attachedfileYn;
    }
    public void setAttachedfileYn(String attachedfileYn) {
        this.attachedfileYn = attachedfileYn;
    }
    public int getAttechedfileNum() {
        return attechedfileNum;
    }
    public void setAttechedfileNum(int attechedfileNum) {
        this.attechedfileNum = attechedfileNum;
    }
    public String getUseYn() {
        return useYn;
    }
    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }
    public String getInsertId() {
        return insertId;
    }
    public void setInsertId(String insertId) {
        this.insertId = insertId;
    }
    public String getInsertDate() {
        return insertDate;
    }
    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }
    public String getUpdateId() {
        return updateId;
    }
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }
    public String getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    
    
}
