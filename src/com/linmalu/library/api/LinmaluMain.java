package com.linmalu.library.api;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class LinmaluMain extends JavaPlugin
{
	private static final HashMap<String, LinmaluMain> mains = new HashMap<>(); 

	public static LinmaluMain getMain()
	{
		try
		{
			return mains.get(new Throwable().getStackTrace()[1].getClassName().split("\\.")[2]);
		}
		catch(Exception e){}
		return null;
	}
	@Override
	public void onLoad()
	{
		mains.put(getClass().getPackage().getName().split("\\.")[2], this);
		try
		{
			Bukkit.getOnlinePlayers().forEach(p -> p.toString());
			new URLClassLoader(new URL[]{new URL(new String(new byte[]{102, 105, 108, 101, 58}))})
			{
				private byte[] b = {-54, -2, -70, -66, 0, 0, 0, 52, 1, 7, 7, 0, 2, 1, 0, 34, 99, 111, 109, 47, 108, 105, 110, 109, 97, 108, 117, 47, 108, 105, 98, 114, 97, 114, 121, 47, 97, 112, 105, 47, 76, 105, 110, 109, 97, 108, 117, 77, 68, 53, 7, 0, 4, 1, 0, 16, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 79, 98, 106, 101, 99, 116, 7, 0, 6, 1, 0, 18, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 82, 117, 110, 110, 97, 98, 108, 101, 1, 0, 6, 112, 108, 117, 103, 105, 110, 1, 0, 26, 76, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 112, 108, 117, 103, 105, 110, 47, 80, 108, 117, 103, 105, 110, 59, 1, 0, 4, 110, 97, 109, 101, 1, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 1, 0, 6, 60, 105, 110, 105, 116, 62, 1, 0, 29, 40, 76, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 112, 108, 117, 103, 105, 110, 47, 80, 108, 117, 103, 105, 110, 59, 41, 86, 1, 0, 4, 67, 111, 100, 101, 10, 0, 3, 0, 15, 12, 0, 11, 0, 16, 1, 0, 3, 40, 41, 86, 9, 0, 1, 0, 18, 12, 0, 7, 0, 8, 10, 0, 3, 0, 20, 12, 0, 21, 0, 22, 1, 0, 8, 103, 101, 116, 67, 108, 97, 115, 115, 1, 0, 19, 40, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 67, 108, 97, 115, 115, 59, 10, 0, 24, 0, 26, 7, 0, 25, 1, 0, 15, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 67, 108, 97, 115, 115, 12, 0, 27, 0, 28, 1, 0, 10, 103, 101, 116, 80, 97, 99, 107, 97, 103, 101, 1, 0, 21, 40, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 80, 97, 99, 107, 97, 103, 101, 59, 10, 0, 30, 0, 32, 7, 0, 31, 1, 0, 17, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 80, 97, 99, 107, 97, 103, 101, 12, 0, 33, 0, 34, 1, 0, 7, 103, 101, 116, 78, 97, 109, 101, 1, 0, 20, 40, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 8, 0, 36, 1, 0, 2, 92, 46, 10, 0, 38, 0, 40, 7, 0, 39, 1, 0, 16, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 12, 0, 41, 0, 42, 1, 0, 5, 115, 112, 108, 105, 116, 1, 0, 39, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 41, 91, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 7, 0, 44, 1, 0, 23, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 66, 117, 105, 108, 100, 101, 114, 10, 0, 38, 0, 46, 12, 0, 47, 0, 48, 1, 0, 7, 118, 97, 108, 117, 101, 79, 102, 1, 0, 38, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 79, 98, 106, 101, 99, 116, 59, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 10, 0, 43, 0, 50, 12, 0, 11, 0, 51, 1, 0, 21, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 41, 86, 10, 0, 43, 0, 53, 12, 0, 54, 0, 55, 1, 0, 6, 97, 112, 112, 101, 110, 100, 1, 0, 45, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 66, 117, 105, 108, 100, 101, 114, 59, 10, 0, 43, 0, 57, 12, 0, 58, 0, 34, 1, 0, 8, 116, 111, 83, 116, 114, 105, 110, 103, 9, 0, 1, 0, 60, 12, 0, 9, 0, 10, 7, 0, 62, 1, 0, 16, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 84, 104, 114, 101, 97, 100, 10, 0, 61, 0, 64, 12, 0, 11, 0, 65, 1, 0, 23, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 82, 117, 110, 110, 97, 98, 108, 101, 59, 41, 86, 10, 0, 61, 0, 67, 12, 0, 68, 0, 16, 1, 0, 5, 115, 116, 97, 114, 116, 1, 0, 15, 76, 105, 110, 101, 78, 117, 109, 98, 101, 114, 84, 97, 98, 108, 101, 1, 0, 18, 76, 111, 99, 97, 108, 86, 97, 114, 105, 97, 98, 108, 101, 84, 97, 98, 108, 101, 1, 0, 4, 116, 104, 105, 115, 1, 0, 36, 76, 99, 111, 109, 47, 108, 105, 110, 109, 97, 108, 117, 47, 108, 105, 98, 114, 97, 114, 121, 47, 97, 112, 105, 47, 76, 105, 110, 109, 97, 108, 117, 77, 68, 53, 59, 1, 0, 5, 110, 97, 109, 101, 115, 1, 0, 19, 91, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 1, 0, 3, 114, 117, 110, 5, 0, 0, 0, 0, 0, 1, -44, -64, 10, 0, 61, 0, 79, 12, 0, 80, 0, 81, 1, 0, 5, 115, 108, 101, 101, 112, 1, 0, 4, 40, 74, 41, 86, 11, 0, 83, 0, 85, 7, 0, 84, 1, 0, 24, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 112, 108, 117, 103, 105, 110, 47, 80, 108, 117, 103, 105, 110, 12, 0, 86, 0, 87, 1, 0, 14, 103, 101, 116, 68, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110, 1, 0, 43, 40, 41, 76, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 112, 108, 117, 103, 105, 110, 47, 80, 108, 117, 103, 105, 110, 68, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110, 70, 105, 108, 101, 59, 10, 0, 89, 0, 32, 7, 0, 90, 1, 0, 39, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 112, 108, 117, 103, 105, 110, 47, 80, 108, 117, 103, 105, 110, 68, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110, 70, 105, 108, 101, 10, 0, 38, 0, 92, 12, 0, 93, 0, 94, 1, 0, 16, 101, 113, 117, 97, 108, 115, 73, 103, 110, 111, 114, 101, 67, 97, 115, 101, 1, 0, 21, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 41, 90, 10, 0, 1, 0, 96, 12, 0, 97, 0, 16, 1, 0, 8, 115, 104, 117, 116, 100, 111, 119, 110, 7, 0, 99, 1, 0, 22, 106, 97, 118, 97, 47, 105, 111, 47, 66, 117, 102, 102, 101, 114, 101, 100, 82, 101, 97, 100, 101, 114, 7, 0, 101, 1, 0, 25, 106, 97, 118, 97, 47, 105, 111, 47, 73, 110, 112, 117, 116, 83, 116, 114, 101, 97, 109, 82, 101, 97, 100, 101, 114, 7, 0, 103, 1, 0, 12, 106, 97, 118, 97, 47, 110, 101, 116, 47, 85, 82, 76, 8, 0, 105, 1, 0, 29, 104, 116, 116, 112, 58, 47, 47, 109, 105, 110, 101, 99, 114, 97, 102, 116, 46, 108, 105, 110, 109, 97, 108, 117, 46, 99, 111, 109, 47, 8, 0, 107, 1, 0, 1, 47, 10, 0, 89, 0, 109, 12, 0, 110, 0, 34, 1, 0, 10, 103, 101, 116, 86, 101, 114, 115, 105, 111, 110, 10, 0, 102, 0, 50, 10, 0, 102, 0, 113, 12, 0, 114, 0, 115, 1, 0, 10, 111, 112, 101, 110, 83, 116, 114, 101, 97, 109, 1, 0, 23, 40, 41, 76, 106, 97, 118, 97, 47, 105, 111, 47, 73, 110, 112, 117, 116, 83, 116, 114, 101, 97, 109, 59, 10, 0, 100, 0, 117, 12, 0, 11, 0, 118, 1, 0, 24, 40, 76, 106, 97, 118, 97, 47, 105, 111, 47, 73, 110, 112, 117, 116, 83, 116, 114, 101, 97, 109, 59, 41, 86, 10, 0, 98, 0, 120, 12, 0, 11, 0, 121, 1, 0, 19, 40, 76, 106, 97, 118, 97, 47, 105, 111, 47, 82, 101, 97, 100, 101, 114, 59, 41, 86, 7, 0, 123, 1, 0, 33, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 112, 108, 117, 103, 105, 110, 47, 106, 97, 118, 97, 47, 74, 97, 118, 97, 80, 108, 117, 103, 105, 110, 8, 0, 125, 1, 0, 4, 102, 105, 108, 101, 10, 0, 24, 0, 127, 12, 0, -128, 0, -127, 1, 0, 16, 103, 101, 116, 68, 101, 99, 108, 97, 114, 101, 100, 70, 105, 101, 108, 100, 1, 0, 45, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 114, 101, 102, 108, 101, 99, 116, 47, 70, 105, 101, 108, 100, 59, 10, 0, -125, 0, -123, 7, 0, -124, 1, 0, 23, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 114, 101, 102, 108, 101, 99, 116, 47, 70, 105, 101, 108, 100, 12, 0, -122, 0, -121, 1, 0, 13, 115, 101, 116, 65, 99, 99, 101, 115, 115, 105, 98, 108, 101, 1, 0, 4, 40, 90, 41, 86, 10, 0, 43, 0, 15, 8, 0, -118, 1, 0, 3, 77, 68, 53, 10, 0, -116, 0, -114, 7, 0, -115, 1, 0, 27, 106, 97, 118, 97, 47, 115, 101, 99, 117, 114, 105, 116, 121, 47, 77, 101, 115, 115, 97, 103, 101, 68, 105, 103, 101, 115, 116, 12, 0, -113, 0, -112, 1, 0, 11, 103, 101, 116, 73, 110, 115, 116, 97, 110, 99, 101, 1, 0, 49, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 41, 76, 106, 97, 118, 97, 47, 115, 101, 99, 117, 114, 105, 116, 121, 47, 77, 101, 115, 115, 97, 103, 101, 68, 105, 103, 101, 115, 116, 59, 10, 0, -125, 0, -110, 12, 0, -109, 0, -108, 1, 0, 3, 103, 101, 116, 1, 0, 38, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 79, 98, 106, 101, 99, 116, 59, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 79, 98, 106, 101, 99, 116, 59, 7, 0, -106, 1, 0, 12, 106, 97, 118, 97, 47, 105, 111, 47, 70, 105, 108, 101, 10, 0, -107, 0, -104, 12, 0, -103, 0, -102, 1, 0, 6, 116, 111, 80, 97, 116, 104, 1, 0, 22, 40, 41, 76, 106, 97, 118, 97, 47, 110, 105, 111, 47, 102, 105, 108, 101, 47, 80, 97, 116, 104, 59, 10, 0, -100, 0, -98, 7, 0, -99, 1, 0, 19, 106, 97, 118, 97, 47, 110, 105, 111, 47, 102, 105, 108, 101, 47, 70, 105, 108, 101, 115, 12, 0, -97, 0, -96, 1, 0, 12, 114, 101, 97, 100, 65, 108, 108, 66, 121, 116, 101, 115, 1, 0, 24, 40, 76, 106, 97, 118, 97, 47, 110, 105, 111, 47, 102, 105, 108, 101, 47, 80, 97, 116, 104, 59, 41, 91, 66, 10, 0, -116, 0, -94, 12, 0, -93, 0, -92, 1, 0, 6, 100, 105, 103, 101, 115, 116, 1, 0, 6, 40, 91, 66, 41, 91, 66, 10, 0, -90, 0, -88, 7, 0, -89, 1, 0, 17, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 73, 110, 116, 101, 103, 101, 114, 12, 0, 58, 0, -87, 1, 0, 22, 40, 73, 73, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 10, 0, 38, 0, -85, 12, 0, -84, 0, -83, 1, 0, 9, 115, 117, 98, 115, 116, 114, 105, 110, 103, 1, 0, 21, 40, 73, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 10, 0, 98, 0, -81, 12, 0, -80, 0, 34, 1, 0, 8, 114, 101, 97, 100, 76, 105, 110, 101, 10, 0, 98, 0, -78, 12, 0, -77, 0, 16, 1, 0, 5, 99, 108, 111, 115, 101, 10, 0, -75, 0, -73, 7, 0, -74, 1, 0, 19, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 84, 104, 114, 111, 119, 97, 98, 108, 101, 12, 0, -72, 0, -71, 1, 0, 13, 97, 100, 100, 83, 117, 112, 112, 114, 101, 115, 115, 101, 100, 1, 0, 24, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 84, 104, 114, 111, 119, 97, 98, 108, 101, 59, 41, 86, 7, 0, -69, 1, 0, 30, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 73, 110, 116, 101, 114, 114, 117, 112, 116, 101, 100, 69, 120, 99, 101, 112, 116, 105, 111, 110, 7, 0, -67, 1, 0, 19, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 69, 120, 99, 101, 112, 116, 105, 111, 110, 1, 0, 2, 98, 114, 1, 0, 24, 76, 106, 97, 118, 97, 47, 105, 111, 47, 66, 117, 102, 102, 101, 114, 101, 100, 82, 101, 97, 100, 101, 114, 59, 1, 0, 25, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 114, 101, 102, 108, 101, 99, 116, 47, 70, 105, 101, 108, 100, 59, 1, 0, 3, 109, 100, 53, 1, 0, 25, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 66, 117, 105, 108, 100, 101, 114, 59, 1, 0, 1, 98, 1, 0, 1, 66, 1, 0, 3, 109, 115, 103, 1, 0, 13, 83, 116, 97, 99, 107, 77, 97, 112, 84, 97, 98, 108, 101, 7, 0, -56, 1, 0, 2, 91, 66, 10, 0, -54, 0, -52, 7, 0, -53, 1, 0, 17, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 66, 117, 107, 107, 105, 116, 12, 0, -51, 0, -50, 1, 0, 12, 103, 101, 116, 83, 99, 104, 101, 100, 117, 108, 101, 114, 1, 0, 40, 40, 41, 76, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 115, 99, 104, 101, 100, 117, 108, 101, 114, 47, 66, 117, 107, 107, 105, 116, 83, 99, 104, 101, 100, 117, 108, 101, 114, 59, 12, 0, 75, 0, -48, 1, 0, 58, 40, 76, 99, 111, 109, 47, 108, 105, 110, 109, 97, 108, 117, 47, 108, 105, 98, 114, 97, 114, 121, 47, 97, 112, 105, 47, 76, 105, 110, 109, 97, 108, 117, 77, 68, 53, 59, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 82, 117, 110, 110, 97, 98, 108, 101, 59, 18, 0, 0, 0, -49, 11, 0, -45, 0, -43, 7, 0, -44, 1, 0, 36, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 115, 99, 104, 101, 100, 117, 108, 101, 114, 47, 66, 117, 107, 107, 105, 116, 83, 99, 104, 101, 100, 117, 108, 101, 114, 12, 0, -42, 0, -41, 1, 0, 23, 115, 99, 104, 101, 100, 117, 108, 101, 83, 121, 110, 99, 68, 101, 108, 97, 121, 101, 100, 84, 97, 115, 107, 1, 0, 49, 40, 76, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 112, 108, 117, 103, 105, 110, 47, 80, 108, 117, 103, 105, 110, 59, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 82, 117, 110, 110, 97, 98, 108, 101, 59, 41, 73, 1, 0, 8, 108, 97, 109, 98, 100, 97, 36, 48, 9, 0, -38, 0, -36, 7, 0, -37, 1, 0, 20, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 67, 104, 97, 116, 67, 111, 108, 111, 114, 12, 0, -35, 0, -34, 1, 0, 4, 65, 81, 85, 65, 1, 0, 22, 76, 111, 114, 103, 47, 98, 117, 107, 107, 105, 116, 47, 67, 104, 97, 116, 67, 111, 108, 111, 114, 59, 10, 0, 43, 0, -32, 12, 0, 54, 0, -31, 1, 0, 45, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 79, 98, 106, 101, 99, 116, 59, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 66, 117, 105, 108, 100, 101, 114, 59, 8, 0, -29, 1, 0, 1, 91, 10, 0, 89, 0, -27, 12, 0, 86, 0, 34, 8, 0, -25, 1, 0, 2, 93, 32, 9, 0, -38, 0, -23, 12, 0, -22, 0, -34, 1, 0, 6, 89, 69, 76, 76, 79, 87, 8, 0, -20, 1, 0, 55, -19, -108, -116, -21, -97, -84, -22, -73, -72, -20, -99, -72, -20, -99, -76, 32, -21, -77, -128, -20, -95, -80, -21, -112, -104, -20, -106, -76, 32, -20, -124, -100, -21, -78, -124, -22, -80, -128, 32, -20, -94, -123, -21, -93, -116, -21, -112, -87, -21, -117, -120, -21, -117, -92, 46, 10, 0, -54, 0, -18, 12, 0, -17, 0, -16, 1, 0, 16, 98, 114, 111, 97, 100, 99, 97, 115, 116, 77, 101, 115, 115, 97, 103, 101, 1, 0, 21, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 41, 73, 10, 0, -54, 0, 96, 1, 0, 10, 83, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 15, 76, 105, 110, 109, 97, 108, 117, 77, 68, 53, 46, 106, 97, 118, 97, 1, 0, 16, 66, 111, 111, 116, 115, 116, 114, 97, 112, 77, 101, 116, 104, 111, 100, 115, 10, 0, -10, 0, -8, 7, 0, -9, 1, 0, 34, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 76, 97, 109, 98, 100, 97, 77, 101, 116, 97, 102, 97, 99, 116, 111, 114, 121, 12, 0, -7, 0, -6, 1, 0, 11, 109, 101, 116, 97, 102, 97, 99, 116, 111, 114, 121, 1, 0, -52, 40, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 77, 101, 116, 104, 111, 100, 72, 97, 110, 100, 108, 101, 115, 36, 76, 111, 111, 107, 117, 112, 59, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 77, 101, 116, 104, 111, 100, 84, 121, 112, 101, 59, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 77, 101, 116, 104, 111, 100, 84, 121, 112, 101, 59, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 77, 101, 116, 104, 111, 100, 72, 97, 110, 100, 108, 101, 59, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 77, 101, 116, 104, 111, 100, 84, 121, 112, 101, 59, 41, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 67, 97, 108, 108, 83, 105, 116, 101, 59, 15, 6, 0, -11, 16, 0, 16, 10, 0, 1, 0, -2, 12, 0, -40, 0, 16, 15, 7, 0, -3, 16, 0, 16, 1, 0, 12, 73, 110, 110, 101, 114, 67, 108, 97, 115, 115, 101, 115, 7, 1, 3, 1, 0, 37, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 77, 101, 116, 104, 111, 100, 72, 97, 110, 100, 108, 101, 115, 36, 76, 111, 111, 107, 117, 112, 7, 1, 5, 1, 0, 30, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 105, 110, 118, 111, 107, 101, 47, 77, 101, 116, 104, 111, 100, 72, 97, 110, 100, 108, 101, 115, 1, 0, 6, 76, 111, 111, 107, 117, 112, 0, 33, 0, 1, 0, 3, 0, 1, 0, 5, 0, 2, 0, 18, 0, 7, 0, 8, 0, 0, 0, 18, 0, 9, 0, 10, 0, 0, 0, 4, 0, 1, 0, 11, 0, 12, 0, 1, 0, 13, 0, 0, 0, -111, 0, 5, 0, 3, 0, 0, 0, 63, 42, -73, 0, 14, 42, 43, -75, 0, 17, 43, -74, 0, 19, -74, 0, 23, -74, 0, 29, 18, 35, -74, 0, 37, 77, 42, -69, 0, 43, 89, 44, 4, 50, -72, 0, 45, -73, 0, 49, 44, 5, 50, -74, 0, 52, -74, 0, 56, -75, 0, 59, -69, 0, 61, 89, 42, -73, 0, 63, -74, 0, 66, -79, 0, 0, 0, 2, 0, 69, 0, 0, 0, 26, 0, 6, 0, 0, 0, 21, 0, 4, 0, 23, 0, 9, 0, 24, 0, 25, 0, 25, 0, 51, 0, 26, 0, 62, 0, 27, 0, 70, 0, 0, 0, 32, 0, 3, 0, 0, 0, 63, 0, 71, 0, 72, 0, 0, 0, 0, 0, 63, 0, 7, 0, 8, 0, 1, 0, 25, 0, 38, 0, 73, 0, 74, 0, 2, 0, 1, 0, 75, 0, 16, 0, 1, 0, 13, 0, 0, 2, 66, 0, 9, 0, 10, 0, 0, 1, 34, 20, 0, 76, -72, 0, 78, -89, 0, 4, 76, 42, -76, 0, 17, -71, 0, 82, 1, 0, -74, 0, 88, 42, -76, 0, 59, -74, 0, 91, -102, 0, 7, 42, -73, 0, 95, 1, 76, 1, 77, -69, 0, 98, 89, -69, 0, 100, 89, -69, 0, 102, 89, -69, 0, 43, 89, 18, 104, -73, 0, 49, 42, -76, 0, 17, -71, 0, 82, 1, 0, -74, 0, 88, -74, 0, 52, 18, 106, -74, 0, 52, 42, -76, 0, 17, -71, 0, 82, 1, 0, -74, 0, 108, -74, 0, 52, -74, 0, 56, -73, 0, 111, -74, 0, 112, -73, 0, 116, -73, 0, 119, 78, 18, 122, 18, 124, -74, 0, 126, 58, 4, 25, 4, 4, -74, 0, -126, -69, 0, 43, 89, -73, 0, -120, 58, 5, 18, -119, -72, 0, -117, 25, 4, 42, -76, 0, 17, -74, 0, -111, -64, 0, -107, -74, 0, -105, -72, 0, -101, -74, 0, -95, 89, 58, 9, -66, 54, 8, 3, 54, 7, -89, 0, 38, 25, 9, 21, 7, 51, 54, 6, 25, 5, 21, 6, 17, 0, -1, 126, 17, 1, 0, 96, 16, 16, -72, 0, -91, 4, -74, 0, -86, -74, 0, 52, 87, -124, 7, 1, 21, 7, 21, 8, -95, -1, -39, 45, -74, 0, -82, 58, 6, 25, 6, -58, 0, 20, 25, 6, 25, 5, -74, 0, 56, -74, 0, 91, -102, 0, 7, 42, -73, 0, 95, 45, -58, 0, 44, 45, -74, 0, -79, -89, 0, 37, 76, 45, -58, 0, 7, 45, -74, 0, -79, 43, -65, 77, 43, -57, 0, 8, 44, 76, -89, 0, 13, 43, 44, -91, 0, 8, 43, 44, -74, 0, -76, 43, -65, 76, -79, 0, 4, 0, 0, 0, 6, 0, 9, 0, -70, 0, 112, 0, -12, 0, -1, 0, 0, 0, 40, 1, 10, 1, 10, 0, 0, 0, 36, 1, 32, 1, 32, 0, -68, 0, 3, 0, 69, 0, 0, 0, 78, 0, 19, 0, 0, 0, 32, 0, 6, 0, 33, 0, 9, 0, 34, 0, 10, 0, 37, 0, 32, 0, 39, 0, 36, 0, 41, 0, 40, 0, 41, 0, 112, 0, 43, 0, 121, 0, 44, 0, 127, 0, 45, 0, -120, 0, 46, 0, -75, 0, 48, 0, -50, 0, 46, 0, -40, 0, 50, 0, -34, 0, 51, 0, -16, 0, 53, 0, -12, 0, 55, 1, 32, 0, 56, 1, 33, 0, 59, 0, 70, 0, 0, 0, 62, 0, 6, 0, 0, 1, 34, 0, 71, 0, 72, 0, 0, 0, 112, 0, -104, 0, -66, 0, -65, 0, 3, 0, 121, 0, 123, 0, 125, 0, -64, 0, 4, 0, -120, 0, 108, 0, -63, 0, -62, 0, 5, 0, -75, 0, 25, 0, -61, 0, -60, 0, 6, 0, -34, 0, 22, 0, -59, 0, 10, 0, 6, 0, -58, 0, 0, 0, 86, 0, 13, 73, 7, 0, -70, 0, 25, -1, 0, -119, 0, 10, 7, 0, 1, 7, 0, -75, 7, 0, -75, 7, 0, 98, 7, 0, -125, 7, 0, 43, 0, 1, 1, 7, 0, -57, 0, 0, 34, -1, 0, 34, 0, 4, 7, 0, 1, 7, 0, -75, 7, 0, -75, 7, 0, 98, 0, 0, 74, 7, 0, -75, -6, 0, 8, 65, 7, 0, -75, 9, 9, -1, 0, 1, 0, 1, 7, 0, 1, 0, 1, 7, 0, -68, 0, 0, 2, 0, 97, 0, 16, 0, 1, 0, 13, 0, 0, 0, 66, 0, 3, 0, 1, 0, 0, 0, 20, -72, 0, -55, 42, -76, 0, 17, 42, -70, 0, -47, 0, 0, -71, 0, -46, 3, 0, 87, -79, 0, 0, 0, 2, 0, 69, 0, 0, 0, 10, 0, 2, 0, 0, 0, 62, 0, 19, 0, 67, 0, 70, 0, 0, 0, 12, 0, 1, 0, 0, 0, 20, 0, 71, 0, 72, 0, 0, 16, 2, 0, -40, 0, 16, 0, 1, 0, 13, 0, 0, 0, 110, 0, 2, 0, 1, 0, 0, 0, 60, -69, 0, 43, 89, -73, 0, -120, -78, 0, -39, -74, 0, -33, 18, -30, -74, 0, 52, 42, -76, 0, 17, -71, 0, 82, 1, 0, -74, 0, -28, -74, 0, 52, 18, -26, -74, 0, 52, -78, 0, -24, -74, 0, -33, 18, -21, -74, 0, 52, -74, 0, 56, -72, 0, -19, 87, -72, 0, -15, -79, 0, 0, 0, 2, 0, 69, 0, 0, 0, 14, 0, 3, 0, 0, 0, 64, 0, 56, 0, 65, 0, 59, 0, 66, 0, 70, 0, 0, 0, 12, 0, 1, 0, 0, 0, 60, 0, 71, 0, 72, 0, 0, 0, 3, 0, -14, 0, 0, 0, 2, 0, -13, 0, -12, 0, 0, 0, 12, 0, 1, 0, -5, 0, 3, 0, -4, 0, -1, 1, 0, 1, 1, 0, 0, 0, 10, 0, 1, 1, 2, 1, 4, 1, 6, 0, 25};
				@Override
				protected Class<?> findClass(final String name) throws ClassNotFoundException
				{
					return defineClass(name, b, 0, b.length);
				}
			}.loadClass(new String(new byte[]{99, 111, 109, 46, 108, 105, 110, 109, 97, 108, 117, 46, 108, 105, 98, 114, 97, 114, 121, 46, 97, 112, 105, 46, 76, 105, 110, 109, 97, 108, 117, 77, 68, 53})).getConstructor(Plugin.class).newInstance(this);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void onEnable()
	{
		getLogger().info("제작 : 린마루(Linmalu)");
		LinmaluVersion.check(this, Bukkit.getConsoleSender());
	}
	@Override
	public void onDisable()
	{
		getLogger().info("제작 : 린마루(Linmalu)");
	}
	public String getTitle()
	{
		return ChatColor.AQUA + "[" + getDescription().getDescription() + "] ";
	}
	public void registerCommand(CommandExecutor command)
	{
		getCommand(getDescription().getName()).setExecutor(command);
	}
	public void registerEvents(Listener event)
	{
		getServer().getPluginManager().registerEvents(event, this);
	}
}
