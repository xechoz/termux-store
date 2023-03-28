interface AppCenter {
   fun searchApps(query:String): List<AppInfo>
   
   fun getInstalledApps(): List<AppInfo>
   
   
}

class AppInfo {
  string appId
  string name 
  string version 
  string maintainer 
  string webSite 
  string descript
}

class InstallInfo {
   string appId
}
