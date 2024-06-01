package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * itemSubs对象 sys_item_sublist
 * 
 * @author mxm
 * @date 2024-05-30
 */
public class ItemSub extends BaseEntity
{
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

    public void setSubId(Integer subId) 
    {
        this.subId = subId;
    }

    public Integer getSubId() 
    {
        return subId;
    }
    public void setItemId(Integer itemId) 
    {
        this.itemId = itemId;
    }

    public Integer getItemId() 
    {
        return itemId;
    }
    public void setSubTitle(String subTitle) 
    {
        this.subTitle = subTitle;
    }

    public String getSubTitle() 
    {
        return subTitle;
    }
    public void setKeyWord(String keyWord) 
    {
        this.keyWord = keyWord;
    }

    public String getKeyWord() 
    {
        return keyWord;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setFileType(Integer fileType) 
    {
        this.fileType = fileType;
    }

    public Integer getFileType() 
    {
        return fileType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("subId", getSubId())
            .append("itemId", getItemId())
            .append("subTitle", getSubTitle())
            .append("keyWord", getKeyWord())
            .append("url", getUrl())
            .append("fileType", getFileType())
            .toString();
    }
}
