package com.xl.dy.dal.dataobject;


/**
 * The table SHECHEM_ES_ATTRIBUTE
 */
public class ShechemEsAttributeDO{

    /**
     * id ID.
     */
    private Integer id;
    /**
     * mid MID.
     */
    private String mid;
    /**
     * uid UID.
     */
    private Integer uid;
    /**
     * turn 排序.
     */
    private Integer turn;
    /**
     * type 属性是否多选; 0否; 1是 如果可以多选,则可以自定义属性,并且可以根据值的不同定不同的价.
     */
    private Boolean type;
    /**
     * title 属性名称.
     */
    private String title;
    /**
     * status STATUS.
     */
    private Boolean status;
    /**
     * typeId 商品类型编号（ 同ECS_TYPE的 ID）.
     */
    private Integer typeId;
    /**
     * values 即选择输入,则NAME对应的值的取值就是该这字段值 .
     */
    private String values;
    /**
     * display DISPLAY.
     */
    private Boolean display;
    /**
     * isthumb 是否为图片属性.
     */
    private Boolean isthumb;
    /**
     * storeId 子店铺ID.
     */
    private Integer storeId;
    /**
     * isLinked 是否关联,0 不关联 1关联; 如果关联, 那么用户在购买该商品时,具有有该属性相同的商品将被推荐给用户.
     */
    private Boolean isLinked;
    /**
     * attrGroup 属性分组,相同的为一个属性组应该取自ECS_TYPE的GROUP的值的顺序..
     */
    private String attrGroup;
    /**
     * inputType 当添加商品时,该属性的添加类别;（0为手功输入;1为选择输入;2为多行文本输入）.
     */
    private Boolean inputType;
    /**
     * inputtime INPUTTIME.
     */
    private Integer inputtime;
    /**
     * searchType 属性是否可以检索;0不需要检索; 1关键字检索2范围检索,该属性应该是如果检索的话,可以通过该属性找到有该属性的商品.
     */
    private Boolean searchType;
    /**
     * updatetime UPDATETIME.
     */
    private Integer updatetime;

    /**
     * Set id ID.
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set mid MID.
     */
    public void setMid(String mid){
        this.mid = mid;
    }

    /**
     * Get mid MID.
     *
     * @return the string
     */
    public String getMid(){
        return mid;
    }

    /**
     * Set uid UID.
     */
    public void setUid(Integer uid){
        this.uid = uid;
    }

    /**
     * Get uid UID.
     *
     * @return the string
     */
    public Integer getUid(){
        return uid;
    }

    /**
     * Set turn 排序.
     */
    public void setTurn(Integer turn){
        this.turn = turn;
    }

    /**
     * Get turn 排序.
     *
     * @return the string
     */
    public Integer getTurn(){
        return turn;
    }

    /**
     * Set type 属性是否多选; 0否; 1是 如果可以多选,则可以自定义属性,并且可以根据值的不同定不同的价.
     */
    public void setType(Boolean type){
        this.type = type;
    }

    /**
     * Get type 属性是否多选; 0否; 1是 如果可以多选,则可以自定义属性,并且可以根据值的不同定不同的价.
     *
     * @return the string
     */
    public Boolean getType(){
        return type;
    }

    /**
     * Set title 属性名称.
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Get title 属性名称.
     *
     * @return the string
     */
    public String getTitle(){
        return title;
    }

    /**
     * Set status STATUS.
     */
    public void setStatus(Boolean status){
        this.status = status;
    }

    /**
     * Get status STATUS.
     *
     * @return the string
     */
    public Boolean getStatus(){
        return status;
    }

    /**
     * Set typeId 商品类型编号（ 同ECS_TYPE的 ID）.
     */
    public void setTypeId(Integer typeId){
        this.typeId = typeId;
    }

    /**
     * Get typeId 商品类型编号（ 同ECS_TYPE的 ID）.
     *
     * @return the string
     */
    public Integer getTypeId(){
        return typeId;
    }

    /**
     * Set values 即选择输入,则NAME对应的值的取值就是该这字段值 .
     */
    public void setValues(String values){
        this.values = values;
    }

    /**
     * Get values 即选择输入,则NAME对应的值的取值就是该这字段值 .
     *
     * @return the string
     */
    public String getValues(){
        return values;
    }

    /**
     * Set display DISPLAY.
     */
    public void setDisplay(Boolean display){
        this.display = display;
    }

    /**
     * Get display DISPLAY.
     *
     * @return the string
     */
    public Boolean getDisplay(){
        return display;
    }

    /**
     * Set isthumb 是否为图片属性.
     */
    public void setIsthumb(Boolean isthumb){
        this.isthumb = isthumb;
    }

    /**
     * Get isthumb 是否为图片属性.
     *
     * @return the string
     */
    public Boolean getIsthumb(){
        return isthumb;
    }

    /**
     * Set storeId 子店铺ID.
     */
    public void setStoreId(Integer storeId){
        this.storeId = storeId;
    }

    /**
     * Get storeId 子店铺ID.
     *
     * @return the string
     */
    public Integer getStoreId(){
        return storeId;
    }

    /**
     * Set isLinked 是否关联,0 不关联 1关联; 如果关联, 那么用户在购买该商品时,具有有该属性相同的商品将被推荐给用户.
     */
    public void setIsLinked(Boolean isLinked){
        this.isLinked = isLinked;
    }

    /**
     * Get isLinked 是否关联,0 不关联 1关联; 如果关联, 那么用户在购买该商品时,具有有该属性相同的商品将被推荐给用户.
     *
     * @return the string
     */
    public Boolean getIsLinked(){
        return isLinked;
    }

    /**
     * Set attrGroup 属性分组,相同的为一个属性组应该取自ECS_TYPE的GROUP的值的顺序..
     */
    public void setAttrGroup(String attrGroup){
        this.attrGroup = attrGroup;
    }

    /**
     * Get attrGroup 属性分组,相同的为一个属性组应该取自ECS_TYPE的GROUP的值的顺序..
     *
     * @return the string
     */
    public String getAttrGroup(){
        return attrGroup;
    }

    /**
     * Set inputType 当添加商品时,该属性的添加类别;（0为手功输入;1为选择输入;2为多行文本输入）.
     */
    public void setInputType(Boolean inputType){
        this.inputType = inputType;
    }

    /**
     * Get inputType 当添加商品时,该属性的添加类别;（0为手功输入;1为选择输入;2为多行文本输入）.
     *
     * @return the string
     */
    public Boolean getInputType(){
        return inputType;
    }

    /**
     * Set inputtime INPUTTIME.
     */
    public void setInputtime(Integer inputtime){
        this.inputtime = inputtime;
    }

    /**
     * Get inputtime INPUTTIME.
     *
     * @return the string
     */
    public Integer getInputtime(){
        return inputtime;
    }

    /**
     * Set searchType 属性是否可以检索;0不需要检索; 1关键字检索2范围检索,该属性应该是如果检索的话,可以通过该属性找到有该属性的商品.
     */
    public void setSearchType(Boolean searchType){
        this.searchType = searchType;
    }

    /**
     * Get searchType 属性是否可以检索;0不需要检索; 1关键字检索2范围检索,该属性应该是如果检索的话,可以通过该属性找到有该属性的商品.
     *
     * @return the string
     */
    public Boolean getSearchType(){
        return searchType;
    }

    /**
     * Set updatetime UPDATETIME.
     */
    public void setUpdatetime(Integer updatetime){
        this.updatetime = updatetime;
    }

    /**
     * Get updatetime UPDATETIME.
     *
     * @return the string
     */
    public Integer getUpdatetime(){
        return updatetime;
    }
}
