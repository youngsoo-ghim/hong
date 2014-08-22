package kr.co.nurier.vo.bbs;

public class BbsVO {
    private String  postId       ;   /* 게시글아이디 */
    private String  bbsId        ;   /* 보드아이디 */
    private String  postTitle    ;   /* 게시글제목 */
    private String  postContents ;   /* 게시글내용 */
    private String  ansYn        ;   /* 답변여부 */
    private String  parentsId    ;   /* 부모글번호 */
    private int     sortOrder    ;   /* 정렬순서 */
    private int     readCnt      ;   /* 읽은횟수 */
    private String  useYn        ;   /* 게시여부 */
    private String  postBeginDate;   /* 게시시작일 */
    private String  postEndDate  ;   /* 게시종료일 */
    private String  pwd          ;   /* 게시글비밀번호 */
    private String  attchedFileid;   /* 첨부화일아이디 */
    private String  insertId     ;   /* 입력자아이디 */
    private String  insertDate   ;   /* 입력시간 */
    private String  updateId     ;   /* 수정자아이디 */
    private String  updateDate   ;   /* 수정시간 */
    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }
    public String getBbsId() {
        return bbsId;
    }
    public void setBbsId(String bbsId) {
        this.bbsId = bbsId;
    }
    public String getPostTitle() {
        return postTitle;
    }
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
    public String getPostContents() {
        return postContents;
    }
    public void setPostContents(String postContents) {
        this.postContents = postContents;
    }
    public String getAnsYn() {
        return ansYn;
    }
    public void setAnsYn(String ansYn) {
        this.ansYn = ansYn;
    }
    public String getParentsId() {
        return parentsId;
    }
    public void setParentsId(String parentsId) {
        this.parentsId = parentsId;
    }
    public int getSortOrder() {
        return sortOrder;
    }
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
    public int getReadCnt() {
        return readCnt;
    }
    public void setReadCnt(int readCnt) {
        this.readCnt = readCnt;
    }
    public String getUseYn() {
        return useYn;
    }
    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }
    public String getPostBeginDate() {
        return postBeginDate;
    }
    public void setPostBeginDate(String postBeginDate) {
        this.postBeginDate = postBeginDate;
    }
    public String getPostEndDate() {
        return postEndDate;
    }
    public void setPostEndDate(String postEndDate) {
        this.postEndDate = postEndDate;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getAttchedFileid() {
        return attchedFileid;
    }
    public void setAttchedFileid(String attchedFileid) {
        this.attchedFileid = attchedFileid;
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
