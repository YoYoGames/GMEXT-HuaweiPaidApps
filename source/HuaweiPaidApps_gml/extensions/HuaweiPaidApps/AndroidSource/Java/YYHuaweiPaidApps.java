
package ${YYAndroidPackageName};

import ${YYAndroidPackageName}.R;
import com.yoyogames.runner.RunnerJNILib;

import com.huawei.android.sdk.drm.Drm;
import com.huawei.android.sdk.drm.DrmCheckCallback;

import android.util.Log;

public class YYHuaweiPaidApps extends RunnerSocial implements DrmCheckCallback
{
	private static final int EVENT_OTHER_SOCIAL = 70;

	public YYHuaweiPaidApps() 
	{
	}
	
	public void huawei_paid_apps_check()
	{
		String DRM_ID = RunnerJNILib.extOptGetString("YYHuaweiPaidApps","DRM_ID");
		String DRM_PUBLIC_KEY = RunnerJNILib.extOptGetString("YYHuaweiPaidApps","DRM_PUBLIC_KEY");
		Drm.check(RunnerActivity.CurrentActivity, RunnerActivity.CurrentActivity.getPackageName(), DRM_ID, DRM_PUBLIC_KEY, true, this);
	}

    @Override
    public void onCheckSuccess() 
	{
		int dsMapIndex = RunnerJNILib.jCreateDsMap(null, null, null);
		RunnerJNILib.DsMapAddString(dsMapIndex, "type", "huawei_paid_apps_check");
		RunnerJNILib.CreateAsynEventWithDSMap(dsMapIndex, EVENT_OTHER_SOCIAL);
    }
	
    @Override
    public void onCheckFailed(int errorCode) 
	{
		int dsMapIndex = RunnerJNILib.jCreateDsMap(null, null, null);
		RunnerJNILib.DsMapAddString(dsMapIndex, "type", "huawei_paid_apps_check");
		RunnerJNILib.DsMapAddDouble(dsMapIndex, "error_code", errorCode);
		RunnerJNILib.CreateAsynEventWithDSMap(dsMapIndex, EVENT_OTHER_SOCIAL);

    }

    @Override
    public void onCheckFailed(int errorCode, String appStorePkgName) 
	{
		int dsMapIndex = RunnerJNILib.jCreateDsMap(null, null, null);
		RunnerJNILib.DsMapAddString(dsMapIndex, "type", "huawei_paid_apps_check");
		RunnerJNILib.DsMapAddString(dsMapIndex, "appstore_package_name", appStorePkgName);
		RunnerJNILib.DsMapAddDouble(dsMapIndex, "error_code", errorCode);
		RunnerJNILib.CreateAsynEventWithDSMap(dsMapIndex, EVENT_OTHER_SOCIAL);

        //finish();
	}

}

