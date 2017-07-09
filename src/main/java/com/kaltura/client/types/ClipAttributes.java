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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Clip operation attributes  */
@SuppressWarnings("serial")
public class ClipAttributes extends OperationAttributes {

	/**  Offset in milliseconds  */
    private Integer offset;
	/**  Duration in milliseconds  */
    private Integer duration;

    // offset:
    public Integer getOffset(){
        return this.offset;
    }
    public void setOffset(Integer offset){
        this.offset = offset;
    }

    // duration:
    public Integer getDuration(){
        return this.duration;
    }
    public void setDuration(Integer duration){
        this.duration = duration;
    }


    public ClipAttributes() {
       super();
    }

    public ClipAttributes(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        offset = GsonParser.parseInt(jsonObject.get("offset"));
        duration = GsonParser.parseInt(jsonObject.get("duration"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaClipAttributes");
        kparams.add("offset", this.offset);
        kparams.add("duration", this.duration);
        return kparams;
    }

}
