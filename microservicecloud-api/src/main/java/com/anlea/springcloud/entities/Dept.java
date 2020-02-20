package com.anlea.springcloud.entities;

import java.io.Serializable;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Accessors(chain = true)
public class Dept implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long deptNo;
    private String dname;
    private String dbSource;

    public Dept() {
        super();
    }

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept [deptNo=" + deptNo + ", dname=" + dname + ", dbSource=" + dbSource + "]";
    }

}
