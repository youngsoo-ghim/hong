package kr.co.nurier.vo.good;

import kr.co.nurier.vo.code.DCommCdVO;

public class MGoodVO extends DCommCdVO{

    private String[] aGdKey      ;  /* 상품키   */    
    private String gdKey      ;  /* 상품키   */    
    private String[] aGdCd       ;  /* 상품코드 배열        */
    private String gdCd       ;  /* 상품코드        */
    private String gdClsCd       ;  /* 상품분류코드        */
    private int    gdCost     ;  /* 상품원가  */     
    private int    gdPrice    ;  /* 상품가격        */
    private int[]     aGdPrice   ; /* 상품가격 */
    private int[]     aGdUnitAmt ; /* 상품단위량 */
    private int       gdUnitAmt ; /* 상품단위량 */
    private String[]  aGdUnitCd  ; /* 상품단위코드 */
    private String    gdUnitCd  ; /* 상품단위코드 */
    private float[]    aGdBoxAmt ; /* 상품박스량 */
    private float      gdBoxAmt ;  /* 상품박스량 */
    private int    ordFcAmt   ;  /* 주문예상량       */
    private int[]  aOrdAmt     ;  /* 주문량    */   
    private int    ordAmt     ;  /* 주문량    */   
    private String baseDate   ;  /* 상품기준일 */
    private String gdMemo     ;  /* 상품메모   */
    private String gdNm       ; /* 상품명 */
    private String chFactor   ; /* 변경되었는지 확인인자값 */
    
    public String[] getaGdKey(){
        return aGdKey;
    }
    
    public void setaGdKey(String[] aGdKey){
        this.aGdKey = aGdKey;
    }
    
    public String getGdKey(){
        return gdKey;
    }
    
    public void setGdKey(String gdKey){
        this.gdKey = gdKey;
    }
    
    public String[] getaGdCd(){
        return aGdCd;
    }
    
    public void setaGdCd(String[] aGdCd){
        this.aGdCd = aGdCd;
    }
    
    public String getGdCd(){
        return gdCd;
    }
    
    public void setGdCd(String gdCd){
        this.gdCd = gdCd;
    }
    
    public String getGdClsCd(){
        return gdClsCd;
    }
    
    public void setGdClsCd(String gdClsCd){
        this.gdClsCd = gdClsCd;
    }
    
    public int getGdCost(){
        return gdCost;
    }
    
    public void setGdCost(int gdCost){
        this.gdCost = gdCost;
    }
    
    public int getGdPrice(){
        return gdPrice;
    }
    
    public void setGdPrice(int gdPrice){
        this.gdPrice = gdPrice;
    }
    
    public int[] getaGdPrice(){
        return aGdPrice;
    }
    
    public void setaGdPrice(int[] aGdPrice){
        this.aGdPrice = aGdPrice;
    }
    
    public int[] getaGdUnitAmt(){
        return aGdUnitAmt;
    }
    
    public void setaGdUnitAmt(int[] aGdUnitAmt){
        this.aGdUnitAmt = aGdUnitAmt;
    }
    
    public int getGdUnitAmt(){
        return gdUnitAmt;
    }
    
    public void setGdUnitAmt(int gdUnitAmt){
        this.gdUnitAmt = gdUnitAmt;
    }
    
    public String[] getaGdUnitCd(){
        return aGdUnitCd;
    }
    
    public void setaGdUnitCd(String[] aGdUnitCd){
        this.aGdUnitCd = aGdUnitCd;
    }
    
    public String getGdUnitCd(){
        return gdUnitCd;
    }
    
    public void setGdUnitCd(String gdUnitCd){
        this.gdUnitCd = gdUnitCd;
    }
    
    public float[] getaGdBoxAmt(){
        return aGdBoxAmt;
    }
    
    public void setaGdBoxAmt(float[] aGdBoxAmt){
        this.aGdBoxAmt = aGdBoxAmt;
    }
    
    public float getGdBoxAmt(){
        return gdBoxAmt;
    }
    
    public void setGdBoxAmt(float gdBoxAmt){
        this.gdBoxAmt = gdBoxAmt;
    }
    
    public int getOrdFcAmt(){
        return ordFcAmt;
    }
    
    public void setOrdFcAmt(int ordFcAmt){
        this.ordFcAmt = ordFcAmt;
    }
    
    public int[] getaOrdAmt(){
        return aOrdAmt;
    }
    
    public void setaOrdAmt(int[] aOrdAmt){
        this.aOrdAmt = aOrdAmt;
    }
    
    public int getOrdAmt(){
        return ordAmt;
    }
    
    public void setOrdAmt(int ordAmt){
        this.ordAmt = ordAmt;
    }
    
    public String getBaseDate(){
        return baseDate;
    }
    
    public void setBaseDate(String baseDate){
        this.baseDate = baseDate;
    }
    
    public String getGdMemo(){
        return gdMemo;
    }
    
    public void setGdMemo(String gdMemo){
        this.gdMemo = gdMemo;
    }
    
    public String getGdNm(){
        return gdNm;
    }
    
    public void setGdNm(String gdNm){
        this.gdNm = gdNm;
    }
    
    public String getChFactor(){
        return chFactor;
    }
    
    public void setChFactor(String chFactor){
        this.chFactor = chFactor;
    }
    


}
