package au.com.iglooit.silverwater.model.entity;

import au.com.iglooit.silverwater.model.GeoIndexTypeConstant;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.search.Document;
import com.google.appengine.api.search.Field;
import com.google.appengine.api.search.GeoPoint;
import org.apache.commons.lang.StringUtils;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Broker extends BaseEntity {
    private static final String DEFAULT_DEFAULT_IMG = "https://googledrive.com/host/0B8FRF1S9z_A7TGxPeGdWeHJjYVU";
    private String name;
    private String surname;
    private String forename;
    private String email;
    private String address1;
    private String address2;
    private String address3;
    private String phone;
    private String fax;
    private String mobile;
    private String bio;
    private String title;
    private Set<String> suburbList = Collections.emptySet();
    private Integer rank = 3;
    private Date lastUpdateTime;
    private Date postDate;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String postcode;
    private String suburb;
    private String formatAddress;
    private String imageResourceId;
    private String imageFileName = DEFAULT_DEFAULT_IMG;
    private String canonicalSlugId;
    private long enquireCount = 0L;
    private Date lastEnquire;

    public static String getDefaultDefaultImg() {
        return DEFAULT_DEFAULT_IMG;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(String imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getCanonicalSlugId() {
        return canonicalSlugId;
    }

    public void setCanonicalSlugId(String canonicalSlugId) {
        this.canonicalSlugId = canonicalSlugId;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getFormatAddress() {
        return formatAddress;
    }

    public void setFormatAddress(String formatAddress) {
        this.formatAddress = formatAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getSuburbList() {
        return suburbList;
    }

    public void setSuburbList(Set<String> suburbList) {
        this.suburbList = suburbList;
    }

    public long getEnquireCount() {
        return enquireCount;
    }

    public void setEnquireCount(long enquireCount) {
        this.enquireCount = enquireCount;
    }

    public Date getLastEnquire() {
        return lastEnquire;
    }

    public void setLastEnquire(Date lastEnquire) {
        this.lastEnquire = lastEnquire;
    }

    /**
     * address1 + address2 + address3
     * @return
     */
    public String convertToAddress() {
        return address1 + " " + address2 + " " + address3;
    }

    @Override
    public Document toFullTextDocument() {
        Document.Builder builder = Document.newBuilder()
                .setId(KeyFactory.keyToString(getKey()))
                .addField(Field.newBuilder().setName("name").setText(getName()))
                .addField(Field.newBuilder().setName("email").setText(getEmail()))
                .addField(Field.newBuilder().setName("fullName").setText(getForename() + " " + getSurname()))
                .addField(Field.newBuilder().setName("bio").setText(getBio()))
                .addField(Field.newBuilder().setName("phone").setText(getPhone()));
        if (latitude != null && longitude != null) {
            builder.addField(Field.newBuilder().setName("point").setGeoPoint(
                    new GeoPoint(latitude.doubleValue(), longitude.doubleValue())));
        }
        for(String suburb : suburbList) {
            builder.addField(Field.newBuilder().setName("suburb").setText(
                    StringUtils.isBlank(suburb) ? "" : suburb));
        }

        builder.addField(Field.newBuilder().setName("address").setText(
                StringUtils.isBlank(getFormatAddress()) ? "" : getFormatAddress()))
                .addField(Field.newBuilder().setName("postcode").setText(
                        StringUtils.isBlank(getPostcode()) ? "" : getPostcode()))
                .addField(Field.newBuilder().setName("mobile").setText(getMobile()));
        return builder.build();
    }

    @Override
    public Document toGeoDocument() {
        Document.Builder builder = Document.newBuilder()
                .setId("geo-" + KeyFactory.keyToString(getKey()));
        if (latitude != null && longitude != null) {
            builder.addField(Field.newBuilder().setName("point").setGeoPoint(
                    new GeoPoint(latitude.doubleValue(), longitude.doubleValue())));
        }
        builder.addField(Field.newBuilder().setName("type").setText(GeoIndexTypeConstant.BROKER_TYPE));

        return builder.build();
    }
}
