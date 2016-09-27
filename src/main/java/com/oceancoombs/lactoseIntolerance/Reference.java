package com.oceancoombs.lactoseIntolerance;

public class Reference {
	public static final String MOD_ID = "ocmod";
	public static final String NAME = "Lactose Intolerance Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.oceancoombs.lactoseIntolerance.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.oceancoombs.lactoseIntolerance.proxy.ServerProxy";
	
	public static enum OcmodItems{
		CHEESE("cheese", "ItemCheese"),
		CHEESESANDWICH("cheesesandwich", "ItemCheeseSandwich");
		
		private String unlocalizedName;
		private String registryName;
		
		OcmodItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		public String getRegistryName(){
			return registryName;
		}
	}
	public static enum OcmodBlocks{
		CHEESE("cheese", "BlockCheese"),
		JAR("jar", "BlockJar");
		
		private String unlocalizedName;
		private String registryName;
		
		OcmodBlocks(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		public String getRegistryName(){
			return registryName;
		}
	}
}
