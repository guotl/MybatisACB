package cn.guotl.common.vo;

import java.util.List;

/**
 * Created by guotianlin on 2018/3/31.
 */
public class PageParameterVo {

    private int pageSize;

    private int offset;

    private int page;

    private String sort;

    private String sortOrder;

    private List<?> rowDatas;

    private int total;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRowDatas() {
        return rowDatas;
    }

    public void setRowDatas(List<?> rowDatas) {
        this.rowDatas = rowDatas;
    }
}
