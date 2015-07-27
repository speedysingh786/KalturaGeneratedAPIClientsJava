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
// Copyright (C) 2006-2015  Kaltura Inc.
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

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.enums.KalturaStatsKmcEventType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Mon, 27 Jul 15 07:10:06 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Will hold data from the Kaltura UI components to be passed on to the reports and
  analytics system    */
@SuppressWarnings("serial")
public class KalturaStatsKmcEvent extends KalturaObjectBase {
    public String clientVer;
    public String kmcEventActionPath;
    public KalturaStatsKmcEventType kmcEventType;
	/**  the client's timestamp of this event     */
    public double eventTimestamp = Double.MIN_VALUE;
	/**  a unique string generated by the client that will represent the client-side
	  session: the primary component will pass it on to other components that sprout
	  from it     */
    public String sessionId;
    public int partnerId = Integer.MIN_VALUE;
    public String entryId;
    public String widgetId;
    public int uiconfId = Integer.MIN_VALUE;
	/**  the partner's user id      */
    public String userId;
	/**  will be retrieved from the request of the user      */
    public String userIp;

    public KalturaStatsKmcEvent() {
    }

    public KalturaStatsKmcEvent(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("clientVer")) {
                this.clientVer = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("kmcEventActionPath")) {
                this.kmcEventActionPath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("kmcEventType")) {
                this.kmcEventType = KalturaStatsKmcEventType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("eventTimestamp")) {
                this.eventTimestamp = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("sessionId")) {
                this.sessionId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("widgetId")) {
                this.widgetId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("uiconfId")) {
                this.uiconfId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("userId")) {
                this.userId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("userIp")) {
                this.userIp = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaStatsKmcEvent");
        kparams.add("clientVer", this.clientVer);
        kparams.add("kmcEventActionPath", this.kmcEventActionPath);
        kparams.add("kmcEventType", this.kmcEventType);
        kparams.add("eventTimestamp", this.eventTimestamp);
        kparams.add("sessionId", this.sessionId);
        kparams.add("partnerId", this.partnerId);
        kparams.add("entryId", this.entryId);
        kparams.add("widgetId", this.widgetId);
        kparams.add("uiconfId", this.uiconfId);
        kparams.add("userId", this.userId);
        return kparams;
    }

}

