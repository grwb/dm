package cn.edu.ustb.dm.model;

public class BookRelation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer BOOK_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_relation.RELATION_BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer RELATION_BOOK_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_relation.RELATION_BOOK_NAME
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private String RELATION_BOOK_NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_relation.BOOK_ID
     *
     * @return the value of book_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getBOOK_ID() {
        return BOOK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_relation.BOOK_ID
     *
     * @param BOOK_ID the value for book_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setBOOK_ID(Integer BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_relation.RELATION_BOOK_ID
     *
     * @return the value of book_relation.RELATION_BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getRELATION_BOOK_ID() {
        return RELATION_BOOK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_relation.RELATION_BOOK_ID
     *
     * @param RELATION_BOOK_ID the value for book_relation.RELATION_BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setRELATION_BOOK_ID(Integer RELATION_BOOK_ID) {
        this.RELATION_BOOK_ID = RELATION_BOOK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_relation.RELATION_BOOK_NAME
     *
     * @return the value of book_relation.RELATION_BOOK_NAME
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public String getRELATION_BOOK_NAME() {
        return RELATION_BOOK_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_relation.RELATION_BOOK_NAME
     *
     * @param RELATION_BOOK_NAME the value for book_relation.RELATION_BOOK_NAME
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setRELATION_BOOK_NAME(String RELATION_BOOK_NAME) {
        this.RELATION_BOOK_NAME = RELATION_BOOK_NAME == null ? null : RELATION_BOOK_NAME.trim();
    }
}