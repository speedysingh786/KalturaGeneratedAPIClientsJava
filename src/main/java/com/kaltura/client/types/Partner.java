// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.CommercialUseType;
import com.kaltura.client.enums.PartnerType;
import com.kaltura.client.enums.PartnerStatus;
import com.kaltura.client.enums.PartnerGroupType;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class Partner extends ObjectBase {

    private Integer id;
    private String name;
    private String website;
    private String notificationUrl;
    private Integer appearInSearch;
    private Integer createdAt;
	/**  deprecated - lastName and firstName replaces this field  */
    private String adminName;
    private String adminEmail;
    private String description;
    private CommercialUseType commercialUse;
    private String landingPage;
    private String userLandingPage;
    private String contentCategories;
    private PartnerType type;
    private String phone;
    private String describeYourself;
    private Boolean adultContent;
    private String defConversionProfileType;
    private Integer notify;
    private PartnerStatus status;
    private Integer allowQuickEdit;
    private Integer mergeEntryLists;
    private String notificationsConfig;
    private Integer maxUploadSize;
    private Integer partnerPackage;
    private String secret;
    private String adminSecret;
    private String cmsPassword;
    private Integer allowMultiNotification;
    private Integer adminLoginUsersQuota;
    private String adminUserId;
	/**  firstName and lastName replace the old (deprecated) adminName  */
    private String firstName;
	/**  lastName and firstName replace the old (deprecated) adminName  */
    private String lastName;
	/**  country code (2char) - this field is optional  */
    private String country;
	/**  state code (2char) - this field is optional  */
    private String state;
    private List<KeyValue> additionalParams;
    private Integer publishersQuota;
    private PartnerGroupType partnerGroupType;
    private Boolean defaultEntitlementEnforcement;
    private String defaultDeliveryType;
    private String defaultEmbedCodeType;
    private List<PlayerDeliveryType> deliveryTypes;
    private List<PlayerEmbedCodeType> embedCodeTypes;
    private Integer templatePartnerId;
    private Boolean ignoreSeoLinks;
    private String host;
    private String cdnHost;
    private Boolean isFirstLogin;
    private String logoutUrl;
    private Integer partnerParentId;
    private String crmId;
    private String referenceId;
    private Boolean timeAlignedRenditions;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // website:
    public String getWebsite(){
        return this.website;
    }
    public void setWebsite(String website){
        this.website = website;
    }

    // notificationUrl:
    public String getNotificationUrl(){
        return this.notificationUrl;
    }
    public void setNotificationUrl(String notificationUrl){
        this.notificationUrl = notificationUrl;
    }

    // appearInSearch:
    public Integer getAppearInSearch(){
        return this.appearInSearch;
    }
    public void setAppearInSearch(Integer appearInSearch){
        this.appearInSearch = appearInSearch;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // adminName:
    public String getAdminName(){
        return this.adminName;
    }
    public void setAdminName(String adminName){
        this.adminName = adminName;
    }

    // adminEmail:
    public String getAdminEmail(){
        return this.adminEmail;
    }
    public void setAdminEmail(String adminEmail){
        this.adminEmail = adminEmail;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // commercialUse:
    public CommercialUseType getCommercialUse(){
        return this.commercialUse;
    }
    public void setCommercialUse(CommercialUseType commercialUse){
        this.commercialUse = commercialUse;
    }

    // landingPage:
    public String getLandingPage(){
        return this.landingPage;
    }
    public void setLandingPage(String landingPage){
        this.landingPage = landingPage;
    }

    // userLandingPage:
    public String getUserLandingPage(){
        return this.userLandingPage;
    }
    public void setUserLandingPage(String userLandingPage){
        this.userLandingPage = userLandingPage;
    }

    // contentCategories:
    public String getContentCategories(){
        return this.contentCategories;
    }
    public void setContentCategories(String contentCategories){
        this.contentCategories = contentCategories;
    }

    // type:
    public PartnerType getType(){
        return this.type;
    }
    public void setType(PartnerType type){
        this.type = type;
    }

    // phone:
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    // describeYourself:
    public String getDescribeYourself(){
        return this.describeYourself;
    }
    public void setDescribeYourself(String describeYourself){
        this.describeYourself = describeYourself;
    }

    // adultContent:
    public Boolean getAdultContent(){
        return this.adultContent;
    }
    public void setAdultContent(Boolean adultContent){
        this.adultContent = adultContent;
    }

    // defConversionProfileType:
    public String getDefConversionProfileType(){
        return this.defConversionProfileType;
    }
    public void setDefConversionProfileType(String defConversionProfileType){
        this.defConversionProfileType = defConversionProfileType;
    }

    // notify:
    public Integer getNotify(){
        return this.notify;
    }
    public void setNotify(Integer notify){
        this.notify = notify;
    }

    // status:
    public PartnerStatus getStatus(){
        return this.status;
    }
    public void setStatus(PartnerStatus status){
        this.status = status;
    }

    // allowQuickEdit:
    public Integer getAllowQuickEdit(){
        return this.allowQuickEdit;
    }
    public void setAllowQuickEdit(Integer allowQuickEdit){
        this.allowQuickEdit = allowQuickEdit;
    }

    // mergeEntryLists:
    public Integer getMergeEntryLists(){
        return this.mergeEntryLists;
    }
    public void setMergeEntryLists(Integer mergeEntryLists){
        this.mergeEntryLists = mergeEntryLists;
    }

    // notificationsConfig:
    public String getNotificationsConfig(){
        return this.notificationsConfig;
    }
    public void setNotificationsConfig(String notificationsConfig){
        this.notificationsConfig = notificationsConfig;
    }

    // maxUploadSize:
    public Integer getMaxUploadSize(){
        return this.maxUploadSize;
    }
    public void setMaxUploadSize(Integer maxUploadSize){
        this.maxUploadSize = maxUploadSize;
    }

    // partnerPackage:
    public Integer getPartnerPackage(){
        return this.partnerPackage;
    }
    public void setPartnerPackage(Integer partnerPackage){
        this.partnerPackage = partnerPackage;
    }

    // secret:
    public String getSecret(){
        return this.secret;
    }
    public void setSecret(String secret){
        this.secret = secret;
    }

    // adminSecret:
    public String getAdminSecret(){
        return this.adminSecret;
    }
    public void setAdminSecret(String adminSecret){
        this.adminSecret = adminSecret;
    }

    // cmsPassword:
    public String getCmsPassword(){
        return this.cmsPassword;
    }
    public void setCmsPassword(String cmsPassword){
        this.cmsPassword = cmsPassword;
    }

    // allowMultiNotification:
    public Integer getAllowMultiNotification(){
        return this.allowMultiNotification;
    }
    public void setAllowMultiNotification(Integer allowMultiNotification){
        this.allowMultiNotification = allowMultiNotification;
    }

    // adminLoginUsersQuota:
    public Integer getAdminLoginUsersQuota(){
        return this.adminLoginUsersQuota;
    }
    public void setAdminLoginUsersQuota(Integer adminLoginUsersQuota){
        this.adminLoginUsersQuota = adminLoginUsersQuota;
    }

    // adminUserId:
    public String getAdminUserId(){
        return this.adminUserId;
    }
    public void setAdminUserId(String adminUserId){
        this.adminUserId = adminUserId;
    }

    // firstName:
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // lastName:
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // country:
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    // state:
    public String getState(){
        return this.state;
    }
    public void setState(String state){
        this.state = state;
    }

    // additionalParams:
    public List<KeyValue> getAdditionalParams(){
        return this.additionalParams;
    }
    public void setAdditionalParams(List<KeyValue> additionalParams){
        this.additionalParams = additionalParams;
    }

    // publishersQuota:
    public Integer getPublishersQuota(){
        return this.publishersQuota;
    }
    public void setPublishersQuota(Integer publishersQuota){
        this.publishersQuota = publishersQuota;
    }

    // partnerGroupType:
    public PartnerGroupType getPartnerGroupType(){
        return this.partnerGroupType;
    }
    public void setPartnerGroupType(PartnerGroupType partnerGroupType){
        this.partnerGroupType = partnerGroupType;
    }

    // defaultEntitlementEnforcement:
    public Boolean getDefaultEntitlementEnforcement(){
        return this.defaultEntitlementEnforcement;
    }
    public void setDefaultEntitlementEnforcement(Boolean defaultEntitlementEnforcement){
        this.defaultEntitlementEnforcement = defaultEntitlementEnforcement;
    }

    // defaultDeliveryType:
    public String getDefaultDeliveryType(){
        return this.defaultDeliveryType;
    }
    public void setDefaultDeliveryType(String defaultDeliveryType){
        this.defaultDeliveryType = defaultDeliveryType;
    }

    // defaultEmbedCodeType:
    public String getDefaultEmbedCodeType(){
        return this.defaultEmbedCodeType;
    }
    public void setDefaultEmbedCodeType(String defaultEmbedCodeType){
        this.defaultEmbedCodeType = defaultEmbedCodeType;
    }

    // deliveryTypes:
    public List<PlayerDeliveryType> getDeliveryTypes(){
        return this.deliveryTypes;
    }
    public void setDeliveryTypes(List<PlayerDeliveryType> deliveryTypes){
        this.deliveryTypes = deliveryTypes;
    }

    // embedCodeTypes:
    public List<PlayerEmbedCodeType> getEmbedCodeTypes(){
        return this.embedCodeTypes;
    }
    public void setEmbedCodeTypes(List<PlayerEmbedCodeType> embedCodeTypes){
        this.embedCodeTypes = embedCodeTypes;
    }

    // templatePartnerId:
    public Integer getTemplatePartnerId(){
        return this.templatePartnerId;
    }
    public void setTemplatePartnerId(Integer templatePartnerId){
        this.templatePartnerId = templatePartnerId;
    }

    // ignoreSeoLinks:
    public Boolean getIgnoreSeoLinks(){
        return this.ignoreSeoLinks;
    }
    public void setIgnoreSeoLinks(Boolean ignoreSeoLinks){
        this.ignoreSeoLinks = ignoreSeoLinks;
    }

    // host:
    public String getHost(){
        return this.host;
    }
    public void setHost(String host){
        this.host = host;
    }

    // cdnHost:
    public String getCdnHost(){
        return this.cdnHost;
    }
    public void setCdnHost(String cdnHost){
        this.cdnHost = cdnHost;
    }

    // isFirstLogin:
    public Boolean getIsFirstLogin(){
        return this.isFirstLogin;
    }
    public void setIsFirstLogin(Boolean isFirstLogin){
        this.isFirstLogin = isFirstLogin;
    }

    // logoutUrl:
    public String getLogoutUrl(){
        return this.logoutUrl;
    }
    public void setLogoutUrl(String logoutUrl){
        this.logoutUrl = logoutUrl;
    }

    // partnerParentId:
    public Integer getPartnerParentId(){
        return this.partnerParentId;
    }
    public void setPartnerParentId(Integer partnerParentId){
        this.partnerParentId = partnerParentId;
    }

    // crmId:
    public String getCrmId(){
        return this.crmId;
    }
    public void setCrmId(String crmId){
        this.crmId = crmId;
    }

    // referenceId:
    public String getReferenceId(){
        return this.referenceId;
    }
    public void setReferenceId(String referenceId){
        this.referenceId = referenceId;
    }

    // timeAlignedRenditions:
    public Boolean getTimeAlignedRenditions(){
        return this.timeAlignedRenditions;
    }
    public void setTimeAlignedRenditions(Boolean timeAlignedRenditions){
        this.timeAlignedRenditions = timeAlignedRenditions;
    }


    public Partner() {
       super();
    }

    public Partner(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        website = GsonParser.parseString(jsonObject.get("website"));
        notificationUrl = GsonParser.parseString(jsonObject.get("notificationUrl"));
        appearInSearch = GsonParser.parseInt(jsonObject.get("appearInSearch"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        adminName = GsonParser.parseString(jsonObject.get("adminName"));
        adminEmail = GsonParser.parseString(jsonObject.get("adminEmail"));
        description = GsonParser.parseString(jsonObject.get("description"));
        commercialUse = CommercialUseType.get(GsonParser.parseInt(jsonObject.get("commercialUse")));
        landingPage = GsonParser.parseString(jsonObject.get("landingPage"));
        userLandingPage = GsonParser.parseString(jsonObject.get("userLandingPage"));
        contentCategories = GsonParser.parseString(jsonObject.get("contentCategories"));
        type = PartnerType.get(GsonParser.parseInt(jsonObject.get("type")));
        phone = GsonParser.parseString(jsonObject.get("phone"));
        describeYourself = GsonParser.parseString(jsonObject.get("describeYourself"));
        adultContent = GsonParser.parseBoolean(jsonObject.get("adultContent"));
        defConversionProfileType = GsonParser.parseString(jsonObject.get("defConversionProfileType"));
        notify = GsonParser.parseInt(jsonObject.get("notify"));
        status = PartnerStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        allowQuickEdit = GsonParser.parseInt(jsonObject.get("allowQuickEdit"));
        mergeEntryLists = GsonParser.parseInt(jsonObject.get("mergeEntryLists"));
        notificationsConfig = GsonParser.parseString(jsonObject.get("notificationsConfig"));
        maxUploadSize = GsonParser.parseInt(jsonObject.get("maxUploadSize"));
        partnerPackage = GsonParser.parseInt(jsonObject.get("partnerPackage"));
        secret = GsonParser.parseString(jsonObject.get("secret"));
        adminSecret = GsonParser.parseString(jsonObject.get("adminSecret"));
        cmsPassword = GsonParser.parseString(jsonObject.get("cmsPassword"));
        allowMultiNotification = GsonParser.parseInt(jsonObject.get("allowMultiNotification"));
        adminLoginUsersQuota = GsonParser.parseInt(jsonObject.get("adminLoginUsersQuota"));
        adminUserId = GsonParser.parseString(jsonObject.get("adminUserId"));
        firstName = GsonParser.parseString(jsonObject.get("firstName"));
        lastName = GsonParser.parseString(jsonObject.get("lastName"));
        country = GsonParser.parseString(jsonObject.get("country"));
        state = GsonParser.parseString(jsonObject.get("state"));
        additionalParams = GsonParser.parseArray(jsonObject.getAsJsonArray("additionalParams"), KeyValue.class);
        publishersQuota = GsonParser.parseInt(jsonObject.get("publishersQuota"));
        partnerGroupType = PartnerGroupType.get(GsonParser.parseInt(jsonObject.get("partnerGroupType")));
        defaultEntitlementEnforcement = GsonParser.parseBoolean(jsonObject.get("defaultEntitlementEnforcement"));
        defaultDeliveryType = GsonParser.parseString(jsonObject.get("defaultDeliveryType"));
        defaultEmbedCodeType = GsonParser.parseString(jsonObject.get("defaultEmbedCodeType"));
        deliveryTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("deliveryTypes"), PlayerDeliveryType.class);
        embedCodeTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("embedCodeTypes"), PlayerEmbedCodeType.class);
        templatePartnerId = GsonParser.parseInt(jsonObject.get("templatePartnerId"));
        ignoreSeoLinks = GsonParser.parseBoolean(jsonObject.get("ignoreSeoLinks"));
        host = GsonParser.parseString(jsonObject.get("host"));
        cdnHost = GsonParser.parseString(jsonObject.get("cdnHost"));
        isFirstLogin = GsonParser.parseBoolean(jsonObject.get("isFirstLogin"));
        logoutUrl = GsonParser.parseString(jsonObject.get("logoutUrl"));
        partnerParentId = GsonParser.parseInt(jsonObject.get("partnerParentId"));
        crmId = GsonParser.parseString(jsonObject.get("crmId"));
        referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
        timeAlignedRenditions = GsonParser.parseBoolean(jsonObject.get("timeAlignedRenditions"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPartner");
        kparams.add("name", this.name);
        kparams.add("website", this.website);
        kparams.add("notificationUrl", this.notificationUrl);
        kparams.add("appearInSearch", this.appearInSearch);
        kparams.add("adminName", this.adminName);
        kparams.add("adminEmail", this.adminEmail);
        kparams.add("description", this.description);
        kparams.add("commercialUse", this.commercialUse);
        kparams.add("landingPage", this.landingPage);
        kparams.add("userLandingPage", this.userLandingPage);
        kparams.add("contentCategories", this.contentCategories);
        kparams.add("type", this.type);
        kparams.add("phone", this.phone);
        kparams.add("describeYourself", this.describeYourself);
        kparams.add("adultContent", this.adultContent);
        kparams.add("defConversionProfileType", this.defConversionProfileType);
        kparams.add("notify", this.notify);
        kparams.add("allowQuickEdit", this.allowQuickEdit);
        kparams.add("mergeEntryLists", this.mergeEntryLists);
        kparams.add("notificationsConfig", this.notificationsConfig);
        kparams.add("maxUploadSize", this.maxUploadSize);
        kparams.add("partnerPackage", this.partnerPackage);
        kparams.add("allowMultiNotification", this.allowMultiNotification);
        kparams.add("adminUserId", this.adminUserId);
        kparams.add("firstName", this.firstName);
        kparams.add("lastName", this.lastName);
        kparams.add("country", this.country);
        kparams.add("state", this.state);
        kparams.add("additionalParams", this.additionalParams);
        kparams.add("partnerParentId", this.partnerParentId);
        kparams.add("referenceId", this.referenceId);
        return kparams;
    }

}
