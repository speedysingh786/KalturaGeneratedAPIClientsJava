// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2022  Kaltura Inc.
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
package com.kaltura.client.enums;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum ESearchGroupFieldName implements EnumAsString {
	COMPANY("company"),
	COUNTRY("country"),
	CREATED_AT("created_at"),
	EMAIL("email"),
	FIRST_NAME("first_name"),
	GROUP_IDS("group_ids"),
	LAST_NAME("last_name"),
	PERMISSION_NAMES("permission_names"),
	ROLE_IDS("role_ids"),
	SCREEN_NAME("screen_name"),
	TAGS("tags"),
	TITLE("title"),
	UPDATED_AT("updated_at"),
	USER_ID("user_id");

	private String value;

	ESearchGroupFieldName(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ESearchGroupFieldName get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ESearchGroupFieldName defined values and compare the inner value with the given one:
		for(ESearchGroupFieldName item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ESearchGroupFieldName.values().length > 0 ? ESearchGroupFieldName.values()[0]: null;
   }
}
