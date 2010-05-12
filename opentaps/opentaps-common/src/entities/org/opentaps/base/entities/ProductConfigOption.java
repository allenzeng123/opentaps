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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductConfigOption.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CONFIG_OPTION")
public class ProductConfigOption extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("configItemId", "CONFIG_ITEM_ID");
        fields.put("configOptionId", "CONFIG_OPTION_ID");
        fields.put("configOptionName", "CONFIG_OPTION_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductConfigOption", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductConfigOption> {
    configItemId("configItemId"),
    configOptionId("configOptionId"),
    configOptionName("configOptionName"),
    description("description"),
    sequenceNum("sequenceNum"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductConfigOptionPkBridge.class)
     private ProductConfigOptionPk id = new ProductConfigOptionPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductConfigOptionPk</code>
     */
      public ProductConfigOptionPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductConfigOptionPk</code> value to set
    */   
      public void setId(ProductConfigOptionPk id) {
         this.id = id;
      }
   @Column(name="CONFIG_OPTION_NAME")
   private String configOptionName;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONFIG_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductConfigItem configItemProductConfigItem = null;
   private transient List<ProductConfigConfig> configOptionProductConfigConfigs = null;
   private transient List<ProductConfigOptionIactn> configOptionProductConfigOptionIactns = null;
   private transient List<ProductConfigOptionIactn> configOptionToProductConfigOptionIactns = null;
   private transient List<ProductConfigProduct> configOptionProductConfigProducts = null;

  /**
   * Default constructor.
   */
  public ProductConfigOption() {
      super();
      this.baseEntityName = "ProductConfigOption";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("configItemId");this.primaryKeyNames.add("configOptionId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("configItemId");this.allFieldsNames.add("configOptionId");this.allFieldsNames.add("configOptionName");this.allFieldsNames.add("description");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductConfigOption(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param configItemId the configItemId to set
     */
    public void setConfigItemId(String configItemId) {
        id.setConfigItemId(configItemId);
    }
    /**
     * Auto generated value setter.
     * @param configOptionId the configOptionId to set
     */
    public void setConfigOptionId(String configOptionId) {
        id.setConfigOptionId(configOptionId);
    }
    /**
     * Auto generated value setter.
     * @param configOptionName the configOptionName to set
     */
    public void setConfigOptionName(String configOptionName) {
        this.configOptionName = configOptionName;
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
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigItemId() {
        return this.id.getConfigItemId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigOptionId() {
        return this.id.getConfigOptionId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigOptionName() {
        return this.configOptionName;
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
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>ProductConfigItem</code> by the relation named <code>ConfigItemProductConfigItem</code>.
     * @return the <code>ProductConfigItem</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductConfigItem getConfigItemProductConfigItem() throws RepositoryException {
        if (this.configItemProductConfigItem == null) {
            this.configItemProductConfigItem = getRelatedOne(ProductConfigItem.class, "ConfigItemProductConfigItem");
        }
        return this.configItemProductConfigItem;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigConfig</code> by the relation named <code>ConfigOptionProductConfigConfig</code>.
     * @return the list of <code>ProductConfigConfig</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigConfig> getConfigOptionProductConfigConfigs() throws RepositoryException {
        if (this.configOptionProductConfigConfigs == null) {
            this.configOptionProductConfigConfigs = getRelated(ProductConfigConfig.class, "ConfigOptionProductConfigConfig");
        }
        return this.configOptionProductConfigConfigs;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigOptionIactn</code> by the relation named <code>ConfigOptionProductConfigOptionIactn</code>.
     * @return the list of <code>ProductConfigOptionIactn</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigOptionIactn> getConfigOptionProductConfigOptionIactns() throws RepositoryException {
        if (this.configOptionProductConfigOptionIactns == null) {
            this.configOptionProductConfigOptionIactns = getRelated(ProductConfigOptionIactn.class, "ConfigOptionProductConfigOptionIactn");
        }
        return this.configOptionProductConfigOptionIactns;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigOptionIactn</code> by the relation named <code>ConfigOptionToProductConfigOptionIactn</code>.
     * @return the list of <code>ProductConfigOptionIactn</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigOptionIactn> getConfigOptionToProductConfigOptionIactns() throws RepositoryException {
        if (this.configOptionToProductConfigOptionIactns == null) {
            this.configOptionToProductConfigOptionIactns = getRelated(ProductConfigOptionIactn.class, "ConfigOptionToProductConfigOptionIactn");
        }
        return this.configOptionToProductConfigOptionIactns;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigProduct</code> by the relation named <code>ConfigOptionProductConfigProduct</code>.
     * @return the list of <code>ProductConfigProduct</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigProduct> getConfigOptionProductConfigProducts() throws RepositoryException {
        if (this.configOptionProductConfigProducts == null) {
            this.configOptionProductConfigProducts = getRelated(ProductConfigProduct.class, "ConfigOptionProductConfigProduct");
        }
        return this.configOptionProductConfigProducts;
    }

    /**
     * Auto generated value setter.
     * @param configItemProductConfigItem the configItemProductConfigItem to set
    */
    public void setConfigItemProductConfigItem(ProductConfigItem configItemProductConfigItem) {
        this.configItemProductConfigItem = configItemProductConfigItem;
    }
    /**
     * Auto generated value setter.
     * @param configOptionProductConfigConfigs the configOptionProductConfigConfigs to set
    */
    public void setConfigOptionProductConfigConfigs(List<ProductConfigConfig> configOptionProductConfigConfigs) {
        this.configOptionProductConfigConfigs = configOptionProductConfigConfigs;
    }
    /**
     * Auto generated value setter.
     * @param configOptionProductConfigOptionIactns the configOptionProductConfigOptionIactns to set
    */
    public void setConfigOptionProductConfigOptionIactns(List<ProductConfigOptionIactn> configOptionProductConfigOptionIactns) {
        this.configOptionProductConfigOptionIactns = configOptionProductConfigOptionIactns;
    }
    /**
     * Auto generated value setter.
     * @param configOptionToProductConfigOptionIactns the configOptionToProductConfigOptionIactns to set
    */
    public void setConfigOptionToProductConfigOptionIactns(List<ProductConfigOptionIactn> configOptionToProductConfigOptionIactns) {
        this.configOptionToProductConfigOptionIactns = configOptionToProductConfigOptionIactns;
    }
    /**
     * Auto generated value setter.
     * @param configOptionProductConfigProducts the configOptionProductConfigProducts to set
    */
    public void setConfigOptionProductConfigProducts(List<ProductConfigProduct> configOptionProductConfigProducts) {
        this.configOptionProductConfigProducts = configOptionProductConfigProducts;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setConfigItemId((String) mapValue.get("configItemId"));
        setConfigOptionId((String) mapValue.get("configOptionId"));
        setConfigOptionName((String) mapValue.get("configOptionName"));
        setDescription((String) mapValue.get("description"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("configItemId", getConfigItemId());
        mapValue.put("configOptionId", getConfigOptionId());
        mapValue.put("configOptionName", getConfigOptionName());
        mapValue.put("description", getDescription());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}