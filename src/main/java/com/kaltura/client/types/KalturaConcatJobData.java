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
import java.util.ArrayList;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Mon, 21 Sep 15 06:07:18 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaConcatJobData extends KalturaJobData {
	/**  Source files to be concatenated     */
    public ArrayList<KalturaString> srcFiles;
	/**  Output file     */
    public String destFilePath;
	/**  Flavor asset to be ingested with the output     */
    public String flavorAssetId;
	/**  Clipping offset in seconds     */
    public double offset = Double.MIN_VALUE;
	/**  Clipping duration in seconds     */
    public double duration = Double.MIN_VALUE;

    public KalturaConcatJobData() {
    }

    public KalturaConcatJobData(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("srcFiles")) {
                this.srcFiles = ParseUtils.parseArray(KalturaString.class, aNode);
                continue;
            } else if (nodeName.equals("destFilePath")) {
                this.destFilePath = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("flavorAssetId")) {
                this.flavorAssetId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("offset")) {
                this.offset = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("duration")) {
                this.duration = ParseUtils.parseDouble(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaConcatJobData");
        kparams.add("srcFiles", this.srcFiles);
        kparams.add("destFilePath", this.destFilePath);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("offset", this.offset);
        kparams.add("duration", this.duration);
        return kparams;
    }

}
