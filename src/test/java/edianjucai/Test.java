package edianjucai;

import com.edianjucai.page.Pagination;

public class Test {

    public static void main(String[] args) {
        Pagination pagination = new Pagination();
        pagination.setCurrentPage(3);
        pagination.setTotalCount(40);
        int start = pagination.getStart();
        System.out.println(pagination.getTotalPage());
    }

}
