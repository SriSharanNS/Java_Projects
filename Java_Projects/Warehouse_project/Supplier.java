public class Supplier {
    private String supplierId;
    private String supplierName;
    private String contactInfo;

    public Supplier(String supplierId, String supplierName, String contactInfo) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactInfo = contactInfo;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
