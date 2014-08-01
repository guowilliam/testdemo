package svxdemo.model;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({ @NamedQuery(name = "SvxDocument.findAll", query = "select o from SvxDocument o") })
@Table(name = "SVX_DOCUMENT")
@XmlRootElement
public class SvxDocument implements Serializable {
    private static final long serialVersionUID = 3108153725177263766L;
    @Column(name = "ADVISER_UPLOADED", length = 60)
    private String adviserUploaded;
    @Column(name = "ADVISER_VIEWABLE", length = 60)
    private String adviserViewable;
    @Column(length = 60)
    private String category;
    @Column(name = "CLIENT_ID")
    private BigDecimal clientId;
    @Column(length = 60)
    private String comment1;
    @Column(length = 60)
    private String comment10;
    @Column(length = 60)
    private String comment2;
    @Column(length = 60)
    private String comment3;
    @Column(length = 60)
    private String comment4;
    @Column(length = 60)
    private String comment5;
    @Column(length = 60)
    private String comment6;
    @Column(length = 60)
    private String comment7;
    @Column(length = 60)
    private String comment8;
    @Column(length = 60)
    private String comment9;
    @Column(name = "CONTENT_TYPE", length = 60)
    private String contentType;
    @Column(length = 60)
    private String creator;
    @Id
    @Column(name = "DOC_ID", nullable = false)
    private BigDecimal docId;
    @Column(length = 60)
    private String filename;
    @Column(name = "TYPE_ID")
    private BigDecimal typeId;
    @Temporal(TemporalType.DATE)
    private Date uploaddate;
    @Column(length = 60)
    private String viewed;

    public SvxDocument() {
    }

    public SvxDocument(String adviserUploaded, String adviserViewable, String category, BigDecimal clientId,
                       String comment1, String comment10, String comment2, String comment3, String comment4,
                       String comment5, String comment6, String comment7, String comment8, String comment9,
                       String contentType, String creator, BigDecimal docId, String filename, BigDecimal typeId,
                       Date uploaddate, String viewed) {
        this.adviserUploaded = adviserUploaded;
        this.adviserViewable = adviserViewable;
        this.category = category;
        this.clientId = clientId;
        this.comment1 = comment1;
        this.comment10 = comment10;
        this.comment2 = comment2;
        this.comment3 = comment3;
        this.comment4 = comment4;
        this.comment5 = comment5;
        this.comment6 = comment6;
        this.comment7 = comment7;
        this.comment8 = comment8;
        this.comment9 = comment9;
        this.contentType = contentType;
        this.creator = creator;
        this.docId = docId;
        this.filename = filename;
        this.typeId = typeId;
        this.uploaddate = uploaddate;
        this.viewed = viewed;
    }


    public String getAdviserUploaded() {
        return adviserUploaded;
    }

    public void setAdviserUploaded(String adviserUploaded) {
        this.adviserUploaded = adviserUploaded;
    }

    public String getAdviserViewable() {
        return adviserViewable;
    }

    public void setAdviserViewable(String adviserViewable) {
        this.adviserViewable = adviserViewable;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getClientId() {
        return clientId;
    }

    public void setClientId(BigDecimal clientId) {
        this.clientId = clientId;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getComment10() {
        return comment10;
    }

    public void setComment10(String comment10) {
        this.comment10 = comment10;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    public String getComment4() {
        return comment4;
    }

    public void setComment4(String comment4) {
        this.comment4 = comment4;
    }

    public String getComment5() {
        return comment5;
    }

    public void setComment5(String comment5) {
        this.comment5 = comment5;
    }

    public String getComment6() {
        return comment6;
    }

    public void setComment6(String comment6) {
        this.comment6 = comment6;
    }

    public String getComment7() {
        return comment7;
    }

    public void setComment7(String comment7) {
        this.comment7 = comment7;
    }

    public String getComment8() {
        return comment8;
    }

    public void setComment8(String comment8) {
        this.comment8 = comment8;
    }

    public String getComment9() {
        return comment9;
    }

    public void setComment9(String comment9) {
        this.comment9 = comment9;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public BigDecimal getDocId() {
        return docId;
    }

    public void setDocId(BigDecimal docId) {
        this.docId = docId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public BigDecimal getTypeId() {
        return typeId;
    }

    public void setTypeId(BigDecimal typeId) {
        this.typeId = typeId;
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getViewed() {
        return viewed;
    }

    public void setViewed(String viewed) {
        this.viewed = viewed;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("adviserUploaded=");
        buffer.append(getAdviserUploaded());
        buffer.append(',');
        buffer.append("adviserViewable=");
        buffer.append(getAdviserViewable());
        buffer.append(',');
        buffer.append("category=");
        buffer.append(getCategory());
        buffer.append(',');
        buffer.append("clientId=");
        buffer.append(getClientId());
        buffer.append(',');
        buffer.append("comment1=");
        buffer.append(getComment1());
        buffer.append(',');
        buffer.append("comment10=");
        buffer.append(getComment10());
        buffer.append(',');
        buffer.append("comment2=");
        buffer.append(getComment2());
        buffer.append(',');
        buffer.append("comment3=");
        buffer.append(getComment3());
        buffer.append(',');
        buffer.append("comment4=");
        buffer.append(getComment4());
        buffer.append(',');
        buffer.append("comment5=");
        buffer.append(getComment5());
        buffer.append(',');
        buffer.append("comment6=");
        buffer.append(getComment6());
        buffer.append(',');
        buffer.append("comment7=");
        buffer.append(getComment7());
        buffer.append(',');
        buffer.append("comment8=");
        buffer.append(getComment8());
        buffer.append(',');
        buffer.append("comment9=");
        buffer.append(getComment9());
        buffer.append(',');
        buffer.append("contentType=");
        buffer.append(getContentType());
        buffer.append(',');
        buffer.append("creator=");
        buffer.append(getCreator());
        buffer.append(',');
        buffer.append("docId=");
        buffer.append(getDocId());
        buffer.append(',');
        buffer.append("filename=");
        buffer.append(getFilename());
        buffer.append(',');
        buffer.append("typeId=");
        buffer.append(getTypeId());
        buffer.append(',');
        buffer.append("uploaddate=");
        buffer.append(getUploaddate());
        buffer.append(',');
        buffer.append("viewed=");
        buffer.append(getViewed());
        buffer.append(']');
        return buffer.toString();
    }
}
