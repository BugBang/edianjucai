package com.edianjucai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edian_msg_box")
public class MsgBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "from_user_id")
    private int fromUserId;
    @Column(name = "to_user_id")
    private int toUserId;
    @Column(name = "is_read")
    private int isRead;
    @Column(name = "is_delete")
    private int isDelete;
    @Column(name = "system_msg_id")
    private int msgSystemId;
    @Column(name = "type")
    private int type;
    @Column(name = "group_key")
    private String groupKey;
    @Column(name = "is_notice")
    private int isNotice;
    @Column(name = "fav_id")
    private int favId;

    public MsgBox() {
        
    }
    
    public MsgBox(String title, String content, int fromUserId, int toUserId, int msgSystemId,
            int type, String groupKey, int isNotice, int favId) {
        super();
        this.title = title;
        this.content = content;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.msgSystemId = msgSystemId;
        this.type = type;
        this.groupKey = groupKey;
        this.isNotice = isNotice;
        this.favId = favId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getMsgSystemId() {
        return msgSystemId;
    }

    public void setMsgSystemId(int msgSystemId) {
        this.msgSystemId = msgSystemId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public int getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(int isNotice) {
        this.isNotice = isNotice;
    }

    public int getFavId() {
        return favId;
    }

    public void setFavId(int favId) {
        this.favId = favId;
    }
}
