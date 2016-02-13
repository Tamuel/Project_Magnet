package com.epicgames.ue4;

import com.YourCompany.Magnet.OBBDownloaderService;
import com.YourCompany.Magnet.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

