package kr.co.nurier.vo.good;

public class DGoodVO extends MGoodVO{

    private String    gdKey     ; /* 상품키 */
    private String    gKey      ; /* 생성된상품키 */
    private String[]  aGKey     ; /* 생성된상품키 */
    private String    gdCd      ; /* 상품코드 */
    private String    gdNm      ; /* 상품명 */
    private int[]     aGdPrice   ; /* 상품가격 */
    private int       gdPrice   ; /* 상품가격 */
    private int[]     aGdUnitAmt ; /* 상품단위량 */
    private int       gdUnitAmt ; /* 상품단위량 */
    private String[]  aGdUnitCd  ; /* 상품단위코드 */
    private String    gdUnitCd  ; /* 상품단위코드 */
    private float[]    aGdBoxAmt ; /* 상품박스량 */
    private float      gdBoxAmt ;  /* 상품박스량 */
    
    public String getGdKey(){
        return gdKey;
    }
    
    public void setGdKey(String gdKey){
        this.gdKey = gdKey;
    }
    
    public String getgKey(){
        return gKey;
    }
    
    public void setgKey(String gKey){
        this.gKey = gKey;
    }
    
    public String[] getaGKey(){
        return aGKey;
    }
    
    public void setaGKey(String[] aGKey){
        this.aGKey = aGKey;
    }
    
    public String getGdCd(){
        return gdCd;
    }
    
    public void setGdCd(String gdCd){
        this.gdCd = gdCd;
    }
    
    public String getGdNm(){
        return gdNm;
    }
    
    public void setGdNm(String gdNm){
        this.gdNm = gdNm;
    }
    
    public int[] getaGdPrice(){
        return aGdPrice;
    }
    
    public void setaGdPrice(int[] aGdPrice){
        this.aGdPrice = aGdPrice;
    }
    
    public int getGdPrice(){
        return gdPrice;
    }
    
    public void setGdPrice(int gdPrice){
        this.gdPrice = gdPrice;
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
    

}
