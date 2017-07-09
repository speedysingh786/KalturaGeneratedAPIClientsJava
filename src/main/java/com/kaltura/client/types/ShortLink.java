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
import com.kaltura.client.enums.ShortLinkStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ShortLink extends ObjectBase {

    private String id;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer expiresAt;
    private Integer partnerId;
    private String userId;
    private String name;
    private String systemName;
    private String fullUrl;
    private ShortLinkStatus status;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // expiresAt:
    public Integer getExpiresAt(){
        return this.expiresAt;
    }
    public void setExpiresAt(Integer expiresAt){
        this.expiresAt = expiresAt;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // systemName:
    public String getSystemName(){
        return this.systemName;
    }
    public void setSystemName(String systemName){
        this.systemName = systemName;
    }

    // fullUrl:
    public String getFullUrl(){
        return this.fullUrl;
    }
    public void setFullUrl(String fullUrl){
        this.fullUrl = fullUrl;
    }

    // status:
    public ShortLinkStatus getStatus(){
        return this.status;
    }
    public void setStatus(ShortLinkStatus status){
        this.status = status;
    }


    public ShortLink() {
       super();
    }

    public ShortLink(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        expiresAt = GsonParser.parseInt(jsonObject.get("expiresAt"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));
        fullUrl = GsonParser.parseString(jsonObject.get("fullUrl"));
        status = ShortLinkStatus.get(GsonParser.parseInt(jsonObject.get("status")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaShortLink");
        kparams.add("expiresAt", this.expiresAt);
        kparams.add("userId", this.userId);
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("fullUrl", this.fullUrl);
        kparams.add("status", this.status);
        return kparams;
    }

}
