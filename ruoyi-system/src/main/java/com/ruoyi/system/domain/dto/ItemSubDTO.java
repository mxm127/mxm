package com.ruoyi.system.domain.dto;

import com.ruoyi.common.annotation.Excel;

public class ItemSubDTO {
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Integer subId;

    /** 关联作品主键 */
    @Excel(name = "关联作品主键")
    private Integer itemId;

    /** 子标题 */
    @Excel(name = "子标题")
    private String subTitle;

    /** 识别属于哪一部分 */
    @Excel(name = "识别属于哪一部分")
    private String keyWord;

    /** 下载地址 */
    @Excel(name = "下载地址")
    private String url;

    /** 文件格式 */
    @Excel(name = "文件格式")
    private Integer fileType;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }
}
