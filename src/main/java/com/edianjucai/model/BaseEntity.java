package com.edianjucai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@MappedSuperclass
@Component  
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -4558372649768918370L;
    
    /**
     * ID
     */
    private String uuid;
    
    /**
     * 创建日期
     */
    private Date createDate;
    
    /**
     * 修改日期
     */
    private Date modifyDate;

    @Id
    @Column(length = 32, nullable = true)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getUUID() {
        return uuid;
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    @Column(updatable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public int hashCode() {
        return uuid == null ? System.identityHashCode(this) : uuid.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getPackage() != obj.getClass().getPackage()) {
            return false;
        }
        final BaseEntity other = (BaseEntity) obj;
        if (uuid == null) {
            if (other.getUUID() != null) {
                return false;
            }
        } else if (!uuid.equals(other.getUUID())) {
            return false;
        }
        return true;
    }
}
