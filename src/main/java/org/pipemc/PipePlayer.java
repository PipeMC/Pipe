package org.pipemc;

import org.bukkit.entity.Entity;

public interface PipePlayer extends PipeEntity {

	void setDisplayName(String name, boolean aboveHead, boolean tabList);
	
	void setStatus(byte status);
	
	void setStatus(Entity entity);
	
	String getLocale();
	
	int getPing();
	
	void sendActionBar(String text);
	
	
}