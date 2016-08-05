package com.edianjucai.page;

import com.edianjucai.common.Constant;

public class Pagination {

    // 总页数
    private int totalPage = 0;
    // 总记录数
    private int totalCount = 0;
    // 当前页
    private int currentPage = 1;
    // 每页总记录数
    private int pageSize = Constant.DEFAULT_PAGE_SIZE;
    // 当前页第一条数据在List中的位置,从0开始
    private int start = 0;

    public Pagination() {
    }

    public int getTotalPage() {
        totalPage = (int) Math.ceil((totalCount + pageSize - 1) / pageSize);
        return totalPage;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        if (currentPage > totalPage) {
            currentPage = totalPage;
        }
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        start = (currentPage - 1) * pageSize;
        return start;
    }

}
