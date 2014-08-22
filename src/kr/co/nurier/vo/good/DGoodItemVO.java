package kr.co.nurier.vo.good;

public class DGoodItemVO extends MGoodVO{

    private String    base_ymd     ; /* 도시락날짜 */
    private String    dsrk_cd      ; /* 도시락상품코드 */
    private String    gd_cd      ; /* 상품코드       */
    private int       gd_price   ; /* 상품가격      */
    private int       gd_unit_amt; /* 상품단위량      */
    private String    gd_unit_cd ; /* 상품단위코드   */
    private String[]  a_gd_cd      ; /* 상품코드       */
    private int[]     a_gd_price   ; /* 상품가격      */
    private int[]     a_gd_unit_amt; /* 상품단위량      */
    private String[]  a_gd_unit_cd ; /* 상품단위코드   */
    
    public String getBase_ymd(){
        return base_ymd;
    }
    
    public void setBase_ymd(String base_ymd){
        this.base_ymd = base_ymd;
    }
    
    public String getDsrk_cd(){
        return dsrk_cd;
    }
    
    public void setDsrk_cd(String dsrk_cd){
        this.dsrk_cd = dsrk_cd;
    }
    
    public String getGd_cd(){
        return gd_cd;
    }
    
    public void setGd_cd(String gd_cd){
        this.gd_cd = gd_cd;
    }
    
    public int getGd_price(){
        return gd_price;
    }
    
    public void setGd_price(int gd_price){
        this.gd_price = gd_price;
    }
    
    public int getGd_unit_amt(){
        return gd_unit_amt;
    }
    
    public void setGd_unit_amt(int gd_unit_amt){
        this.gd_unit_amt = gd_unit_amt;
    }
    
    public String getGd_unit_cd(){
        return gd_unit_cd;
    }
    
    public void setGd_unit_cd(String gd_unit_cd){
        this.gd_unit_cd = gd_unit_cd;
    }
    
    public String[] getA_gd_cd(){
        return a_gd_cd;
    }
    
    public void setA_gd_cd(String[] a_gd_cd){
        this.a_gd_cd = a_gd_cd;
    }
    
    public int[] getA_gd_price(){
        return a_gd_price;
    }
    
    public void setA_gd_price(int[] a_gd_price){
        this.a_gd_price = a_gd_price;
    }
    
    public int[] getA_gd_unit_amt(){
        return a_gd_unit_amt;
    }
    
    public void setA_gd_unit_amt(int[] a_gd_unit_amt){
        this.a_gd_unit_amt = a_gd_unit_amt;
    }
    
    public String[] getA_gd_unit_cd(){
        return a_gd_unit_cd;
    }
    
    public void setA_gd_unit_cd(String[] a_gd_unit_cd){
        this.a_gd_unit_cd = a_gd_unit_cd;
    }
    

}
