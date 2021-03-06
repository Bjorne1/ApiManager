package cn.crap.utils;

/**
 * @author Ehsan
 */
public interface IConst {
	String NULL = "_NULL";
	String C_TRUE = "true";
	String NULL_ID = "NULL"; //当新增数据时，前段传递的id=NULL
	String NOT_NULL = "NOT_NULL";
	String BLANK = "_BLANK"; 
	String ALL = "_ALL"; 
	String C_SUPER = "super";
	String C_AUTH_USER = "USER";
	String C_HOT_SEARCH = "HOTS_EARCH";
	String C_AUTH_MENU = "MENU";
	String C_AUTH_SETTING = "SETTING";
	String C_AUTH_ADMIN = "ADMIN";// 管理员
	String C_AUTH_ROLE = "ROLE";
	String C_AUTH_PROJECT = "PROJECT_";
	String C_DELETE_PASSWORD = "delete";
	String C_PARAM_FORM = "FORM";
    String C_PARAM_RAW = "RAW";
    String C_PARAM_FORM_PRE = "form=";
    String C_METHOD_POST = "POST";
    String C_METHOD_GET = "GET";


    int ALL_PAGE_SIZE = -100; // 不分页

	// 缓存
    String C_CACHE_LEFT_MENU = "cache:leftMenu";

	String CACHE_IMGCODE = ":imgCode";
	String CACHE_IMGCODE_TIMES = ":imgCodeTimes";
	String C_CACHE_ERROR_TIP = ":errorTip:";
	String CACHE_AUTHORIZE = ":authorize:";
	String CACHE_FINDPWD= ":findPwd:";


	/**
	 * cookie前端名称要尽量短，且不易识别
	 */
	String C_COOKIE_USERID = "cookieUserId";
	String COOKIE_USERNAME = "cookieUserName";
	String COOKIE_PASSWORD = "cookiePassword";
	String COOKIE_TOKEN= "token";
	String COOKIE_UUID = "uuid";
	String COOKIE_REMBER_PWD = "cookieRemberPwd";
	String SEPARATOR = "SEPARATOR";
	String REGISTER = "register";
	String GITHUB = "gitHub:";
	String OSCHINA = "oschina:";
	String DOMAIN = "DOMAIN";
	String ADMIN = "admin";
	// url
	String FRONT_PROJECT_URL = "project.do#/module/list?projectId=%s";
	
	//系统设置
	String SETTING_OPEN_REGISTER = "openRegister";
	String SETTING_GITHUB_ID = "githubClientID";
}
