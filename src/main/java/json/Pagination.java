package json;

public class Pagination {
    private Integer offset;
    private Integer limit;
    private Integer totalCount;


    public Pagination(Integer offset, Integer limit, Integer totalCount) {
        this.offset = offset;
        this.limit = limit;
        this.totalCount = totalCount;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
