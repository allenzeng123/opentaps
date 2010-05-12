package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity AcctgTransAndEntriesForReconciliation.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectAcctgTransAndEntriesForReconciliations", query="SELECT ATR.ACCTG_TRANS_ID AS \"acctgTransId\",ATR.ACCTG_TRANS_TYPE_ID AS \"acctgTransTypeId\",ATR.PARTY_ID AS \"partyId\",ATR.PAYMENT_ID AS \"paymentId\",ATR.TRANSACTION_DATE AS \"transactionDate\",ATR.IS_POSTED AS \"isPosted\",ATR.DESCRIPTION AS \"description\",ATE.ACCTG_TRANS_ENTRY_SEQ_ID AS \"acctgTransEntrySeqId\",ATE.GL_ACCOUNT_ID AS \"glAccountId\",ATE.DEBIT_CREDIT_FLAG AS \"debitCreditFlag\",ATE.AMOUNT AS \"amount\",ATE.RECONCILE_STATUS_ID AS \"reconcileStatusId\",PMT.PAYMENT_REF_NUM AS \"paymentRefNum\",PMT.PAYMENT_TYPE_ID AS \"paymentTypeId\" FROM ACCTG_TRANS ATR INNER JOIN ACCTG_TRANS_ENTRY ATE ON ATR.ACCTG_TRANS_ID = ATE.ACCTG_TRANS_ID LEFT JOIN PAYMENT PMT ON ATR.PAYMENT_ID = PMT.PAYMENT_ID", resultSetMapping="AcctgTransAndEntriesForReconciliationMapping")
@SqlResultSetMapping(name="AcctgTransAndEntriesForReconciliationMapping", entities={
@EntityResult(entityClass=AcctgTransAndEntriesForReconciliation.class, fields = {
@FieldResult(name="acctgTransId", column="acctgTransId")
,@FieldResult(name="acctgTransTypeId", column="acctgTransTypeId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="paymentId", column="paymentId")
,@FieldResult(name="transactionDate", column="transactionDate")
,@FieldResult(name="isPosted", column="isPosted")
,@FieldResult(name="description", column="description")
,@FieldResult(name="acctgTransEntrySeqId", column="acctgTransEntrySeqId")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="debitCreditFlag", column="debitCreditFlag")
,@FieldResult(name="amount", column="amount")
,@FieldResult(name="reconcileStatusId", column="reconcileStatusId")
,@FieldResult(name="refNum", column="refNum")
,@FieldResult(name="paymentTypeId", column="paymentTypeId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class AcctgTransAndEntriesForReconciliation extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("acctgTransId", "ATR.ACCTG_TRANS_ID");
        fields.put("acctgTransTypeId", "ATR.ACCTG_TRANS_TYPE_ID");
        fields.put("partyId", "ATR.PARTY_ID");
        fields.put("paymentId", "ATR.PAYMENT_ID");
        fields.put("transactionDate", "ATR.TRANSACTION_DATE");
        fields.put("isPosted", "ATR.IS_POSTED");
        fields.put("description", "ATR.DESCRIPTION");
        fields.put("acctgTransEntrySeqId", "ATE.ACCTG_TRANS_ENTRY_SEQ_ID");
        fields.put("glAccountId", "ATE.GL_ACCOUNT_ID");
        fields.put("debitCreditFlag", "ATE.DEBIT_CREDIT_FLAG");
        fields.put("amount", "ATE.AMOUNT");
        fields.put("reconcileStatusId", "ATE.RECONCILE_STATUS_ID");
        fields.put("refNum", "PMT.PAYMENT_REF_NUM");
        fields.put("paymentTypeId", "PMT.PAYMENT_TYPE_ID");
fieldMapColumns.put("AcctgTransAndEntriesForReconciliation", fields);
}
  public static enum Fields implements EntityFieldInterface<AcctgTransAndEntriesForReconciliation> {
    acctgTransId("acctgTransId"),
    acctgTransTypeId("acctgTransTypeId"),
    partyId("partyId"),
    paymentId("paymentId"),
    transactionDate("transactionDate"),
    isPosted("isPosted"),
    description("description"),
    acctgTransEntrySeqId("acctgTransEntrySeqId"),
    glAccountId("glAccountId"),
    debitCreditFlag("debitCreditFlag"),
    amount("amount"),
    reconcileStatusId("reconcileStatusId"),
    refNum("refNum"),
    paymentTypeId("paymentTypeId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String acctgTransId;
    
   private String acctgTransTypeId;
    
   private String partyId;
    
   private String paymentId;
    
   private Timestamp transactionDate;
    
   private String isPosted;
    
   private String description;
    
   private String acctgTransEntrySeqId;
    
   private String glAccountId;
    
   private String debitCreditFlag;
    
   private BigDecimal amount;
    
   private String reconcileStatusId;
    
   private String refNum;
    
   private String paymentTypeId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ACCTG_TRANS_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private AcctgTransType acctgTransType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Payment payment = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentType paymentType = null;

  /**
   * Default constructor.
   */
  public AcctgTransAndEntriesForReconciliation() {
      super();
      this.baseEntityName = "AcctgTransAndEntriesForReconciliation";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("acctgTransId");this.primaryKeyNames.add("acctgTransEntrySeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("acctgTransId");this.allFieldsNames.add("acctgTransTypeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("paymentId");this.allFieldsNames.add("transactionDate");this.allFieldsNames.add("isPosted");this.allFieldsNames.add("description");this.allFieldsNames.add("acctgTransEntrySeqId");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("debitCreditFlag");this.allFieldsNames.add("amount");this.allFieldsNames.add("reconcileStatusId");this.allFieldsNames.add("refNum");this.allFieldsNames.add("paymentTypeId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AcctgTransAndEntriesForReconciliation(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param acctgTransId the acctgTransId to set
     */
    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransTypeId the acctgTransTypeId to set
     */
    public void setAcctgTransTypeId(String acctgTransTypeId) {
        this.acctgTransTypeId = acctgTransTypeId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    /**
     * Auto generated value setter.
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }
    /**
     * Auto generated value setter.
     * @param isPosted the isPosted to set
     */
    public void setIsPosted(String isPosted) {
        this.isPosted = isPosted;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransEntrySeqId the acctgTransEntrySeqId to set
     */
    public void setAcctgTransEntrySeqId(String acctgTransEntrySeqId) {
        this.acctgTransEntrySeqId = acctgTransEntrySeqId;
    }
    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param debitCreditFlag the debitCreditFlag to set
     */
    public void setDebitCreditFlag(String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }
    /**
     * Auto generated value setter.
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Auto generated value setter.
     * @param reconcileStatusId the reconcileStatusId to set
     */
    public void setReconcileStatusId(String reconcileStatusId) {
        this.reconcileStatusId = reconcileStatusId;
    }
    /**
     * Auto generated value setter.
     * @param refNum the refNum to set
     */
    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }
    /**
     * Auto generated value setter.
     * @param paymentTypeId the paymentTypeId to set
     */
    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransId() {
        return this.acctgTransId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransTypeId() {
        return this.acctgTransTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentId() {
        return this.paymentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTransactionDate() {
        return this.transactionDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsPosted() {
        return this.isPosted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransEntrySeqId() {
        return this.acctgTransEntrySeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountId() {
        return this.glAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDebitCreditFlag() {
        return this.debitCreditFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReconcileStatusId() {
        return this.reconcileStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRefNum() {
        return this.refNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentTypeId() {
        return this.paymentTypeId;
    }

    /**
     * Auto generated method that gets the related <code>AcctgTransType</code> by the relation named <code>AcctgTransType</code>.
     * @return the <code>AcctgTransType</code>
     * @throws RepositoryException if an error occurs
     */
    public AcctgTransType getAcctgTransType() throws RepositoryException {
        if (this.acctgTransType == null) {
            this.acctgTransType = getRelatedOne(AcctgTransType.class, "AcctgTransType");
        }
        return this.acctgTransType;
    }
    /**
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>Payment</code>.
     * @return the <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public Payment getPayment() throws RepositoryException {
        if (this.payment == null) {
            this.payment = getRelatedOne(Payment.class, "Payment");
        }
        return this.payment;
    }
    /**
     * Auto generated method that gets the related <code>PaymentType</code> by the relation named <code>PaymentType</code>.
     * @return the <code>PaymentType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentType getPaymentType() throws RepositoryException {
        if (this.paymentType == null) {
            this.paymentType = getRelatedOne(PaymentType.class, "PaymentType");
        }
        return this.paymentType;
    }

    /**
     * Auto generated value setter.
     * @param acctgTransType the acctgTransType to set
    */
    public void setAcctgTransType(AcctgTransType acctgTransType) {
        this.acctgTransType = acctgTransType;
    }
    /**
     * Auto generated value setter.
     * @param payment the payment to set
    */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    /**
     * Auto generated value setter.
     * @param paymentType the paymentType to set
    */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAcctgTransId((String) mapValue.get("acctgTransId"));
        setAcctgTransTypeId((String) mapValue.get("acctgTransTypeId"));
        setPartyId((String) mapValue.get("partyId"));
        setPaymentId((String) mapValue.get("paymentId"));
        setTransactionDate((Timestamp) mapValue.get("transactionDate"));
        setIsPosted((String) mapValue.get("isPosted"));
        setDescription((String) mapValue.get("description"));
        setAcctgTransEntrySeqId((String) mapValue.get("acctgTransEntrySeqId"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setDebitCreditFlag((String) mapValue.get("debitCreditFlag"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setReconcileStatusId((String) mapValue.get("reconcileStatusId"));
        setRefNum((String) mapValue.get("refNum"));
        setPaymentTypeId((String) mapValue.get("paymentTypeId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("acctgTransId", getAcctgTransId());
        mapValue.put("acctgTransTypeId", getAcctgTransTypeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("paymentId", getPaymentId());
        mapValue.put("transactionDate", getTransactionDate());
        mapValue.put("isPosted", getIsPosted());
        mapValue.put("description", getDescription());
        mapValue.put("acctgTransEntrySeqId", getAcctgTransEntrySeqId());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("debitCreditFlag", getDebitCreditFlag());
        mapValue.put("amount", getAmount());
        mapValue.put("reconcileStatusId", getReconcileStatusId());
        mapValue.put("refNum", getRefNum());
        mapValue.put("paymentTypeId", getPaymentTypeId());
        return mapValue;
    }


}