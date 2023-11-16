
show_debug_message("ASYNC: " + json_encode(async_load))

if(async_load[?"type"] == "huawei_paid_apps_check")
{
	if(!ds_map_exists(async_load,"error_code"))
	{
		//SUCCESS
		show_message_async("HuaweiPaidApps_Check SUCCESS")
	}
	else
	{
		//FAILED
		//Error codes here: https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-Guides/appgallerykit-paidapps-errorcode-0000001074551186
		var errorCode = async_load[?"error_code"]
		show_message_async("HuaweiPaidApps_Check FAILED \n errorCode: " + string(errorCode))
	}
}

