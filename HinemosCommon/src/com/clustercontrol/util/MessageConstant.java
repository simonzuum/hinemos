package com.clustercontrol.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public enum MessageConstant {
	ADMINISTRATOR,
	AGENT,
	AGENT_AWAKE_PORT,
	AGENT_TIMEOUT_ERROR,
	APPLICATION,
	BASIC_INFORMATION,
	CALENDAR_DETAIL_BEFORE_AFTER,
	CALENDAR_DETAIL_DATE_TYPE,
	CALENDAR_DETAIL_SUBSTITUTE_LIMIT,
	CALENDAR_DETAIL_SUBSTITUTE_TIME,
	CALENDAR_DETAIL_XTH,
	CALENDAR_ID,
	CALENDAR_NAME,
	CALENDAR_PATTERN,
	CALENDAR_PATTERN_ID,
	CALENDAR_PATTERN_NAME,
	CHARACTER_SET,
	CHARSET_SNMPTRAP_CODE,
	CLOUD_LOCATION,
	CLOUD_RESOURCE_ID,
	CLOUD_RESOURCE_NAME,
	CLOUD_RESOURCE_TYPE,
	CLOUD_SCOPE,
	CLOUD_SERVICE,
	COLLECTION_DISPLAY_NAME,
	COLLECTION_LATEST_DATE,
	COLLECTION_OLDEST_DATE,
	COLLECTION_UNIT,
	COLLECT_GRAPH_FLG,
	CONVERT_NO,
	HUB_LOG_FORMAT_ID,
	HUB_LOG_FORMAT_KEY,
	HUB_TRANSFER_ID,
	COMMAND,
	COMMENT,
	COMMENT_DATE,
	COMMENT_USER,
	COMMUNITY,
	COMMUNITY_NAME,
	CONFIRM_TIME,
	CONFIRM_USER,
	CONFIRMED,
	CONNECTION_URL,
	CPU,
	CPU_LIST,
	CRITICAL,
	HUB_LOG_FORMAT_DATE_EXTRACTION_PATTERN,
	DAY,
	DEF_RESULT,
	DELTA,
	DESCRIPTION,
	DEVICE_DISPLAY_NAME,
	DEVICE_INDEX,
	DEVICE_NAME,
	DEVICE_SIZE,
	DEVICE_SIZE_UNIT,
	DEVICE_TYPE,
	DIRECTORY,
	DISK,
	DISK_LIST,
	EFFECTIVE_USER,
	EMAIL_ADDRESS_SSV,
	END,
	EXISTENT,
	FACILITY_ID,
	FACILITY_NAME,
	FILE_CHECK,
	FILE_ENCODING,
	FILE_NAME,
	FILE_RETURNCODE,
	FILE_SYSTEM,
	FILE_SYSTEM_LIST,
	GENERAL_DEVICE,
	GENERAL_DEVICE_LIST,
	GENERATION_TIME,
	HARDWARE,
	HARDWARE_TYPE,
	HEADER,
	HINEMOS_PROPERTY_KEY,
	HINEMOS_PROPERTY_VALUE,
	HOST_NAME,
	ICON_IMAGE,
	ICON_ID,
	INFO,
	INFRA_FILEMANAGER_FILE_ID,
	INFRA_FILEMANAGER_FILE_NAME,
	INFRA_MANAGEMENT_DESCRIPTION,
	INFRA_MANAGEMENT_ID,
	INFRA_MANAGEMENT_NAME,
	INFRA_MANAGEMENT_REPLACEMENT_WORDS,
	INFRA_MANAGEMENT_SEARCH_WORDS,
	INFRA_MANAGEMENT,
	INFRA_MODULE_CHECK_COMMAND,
	INFRA_MODULE_EXEC_COMMAND,
	INFRA_MODULE_ID,
	INFRA_MODULE_NAME,
	INFRA_MODULE_PLACEMENT_FILE,
	INFRA_MODULE_PLACEMENT_PATH,
	INFRA_MODULE_TRANSFER_METHOD_OWNER,
	INFRA_MODULE_TRANSFER_METHOD_SCP_FILE_ATTRIBUTE,
	INFRA_MODULE_TRANSFER_METHOD_WINRM,
	IP_ADDRESS_V4,
	IP_ADDRESS_V6,
	IP_ADDRESS_VERSION,
	IPMI_LEVEL,
	IPMI_PROTOCOL,
	IPMI_RETRIES,
	IPMI_TIMEOUT,
	IPMI_USER,
	IPMI_USER_PASSWORD,
	JOB,
	JOBKICK_ID,
	JOBKICK_NAME,
	JOBKICK_PARAM_ID,
	JOBKICK_TYPE,
	JOBKICK_DEFAULT_VALUE,
	JOBKICK_DESCRIPTION,
	JOBKICK_DETAIL_PARAM_VALUE,
	JOBKICK_DETAIL_DESCRIPTION,
	JOB_ID,
	JOB_MANAGEMENT,
	JOB_NAME,
	JOB_PARAM_ID,
	JOB_PARAM_VALUE,
	JOB_SCRIPT_NAME,
	JOB_SCRIPT_ENCODING,
	JOB_SCRIPT,
	JOB_ENV_ID,
	JOB_ENV_VALUE,
	JOB_ENV_DESCRIPTION,
	JOB_PROCESS_SHUTDOWN,
	JOB_RETRIES,
	JOB_START_COMMAND_REPLACE_COMMAND,
	JOB_STOP_FORCE,
	JOBUNIT_ID,
	LASTTIME,
	LOGFILE_FILENAME,
	LOGFILE_LINE,
	LOGFILE_PATTERN,
	MAIL_ADDRESS,
	MAIL_SUBJECT,
	MAIL_TEMPLATE_ID,
	MAINTENANCE_ID,
	MAINTENANCE_RETENTION_PERIOD,
	MEMORY,
	MEMORY_LIST,
	MESSAGE,
	MESSAGE_ORG,
	MONITOR_DETAIL_ID,
	MONITOR_HTTP_SCENARIO_AUTHPASSWORD,
	MONITOR_HTTP_SCENARIO_AUTHUSER,
	MONITOR_HTTP_SCENARIO_CONNECTTIMEOUT,
	MONITOR_HTTP_SCENARIO_PAGE_DESCRIPTION,
	MONITOR_HTTP_SCENARIO_PAGE_EXPECTED_STATUSCODE,
	MONITOR_HTTP_SCENARIO_PAGE_ORDERNO,
	MONITOR_HTTP_SCENARIO_PAGE_STATUSCODE,
	MONITOR_HTTP_SCENARIO_PAGE_URL,
	MONITOR_HTTP_SCENARIO_PATTERN_DESCRIPTION,
	MONITOR_HTTP_SCENARIO_PATTERN_PATTERN,
	MONITOR_HTTP_SCENARIO_POST,
	MONITOR_HTTP_SCENARIO_PROXYPASSWORD,
	MONITOR_HTTP_SCENARIO_PROXYPORT,
	MONITOR_HTTP_SCENARIO_PROXYURL,
	MONITOR_HTTP_SCENARIO_PROXYUSER,
	MONITOR_HTTP_SCENARIO_REDIRECT_URL,
	MONITOR_HTTP_SCENARIO_REQUESTTIMEOUT,
	MONITOR_HTTP_SCENARIO_RESPONSE,
	MONITOR_HTTP_SCENARIO_TOTAL_RESPONSETIME,
	MONITOR_HTTP_SCENARIO_TOTAL_RESPONSETIME_MS,
	MONITOR_HTTP_SCENARIO_USERAGENT,
	MONITOR_HTTP_SCENARIO_VARIABLE_NAME,
	MONITOR_HTTP_SCENARIO_VARIABLE_VALUE,
	MONITOR_ID,
	MONITOR_JMX_AUTHPASSWORD,
	MONITOR_JMX_MASTER_ATTRIBUTENAME,
	MONITOR_JMX_MASTER_ID,
	MONITOR_JMX_MASTER_KEYS,
	MONITOR_JMX_MASTER_MEASURE,
	MONITOR_JMX_MASTER_NAME,
	MONITOR_JMX_MASTER_OBJECTNAME,
	MONITOR_JMX_PORT,
	MONITOR_SNMPTRAP_VALUE_MIB,
	MONITOR_SNMPTRAP_VALUE_PATTERN_DESCRIPTION,
	MONITOR_SNMPTRAP_VALUE_VARBINDPATTERN,
	MONITOR_STATUS_NO_UPDATE,
	MONITOR_SETTING,
	MONITORJOB_CRITICAL,
	MONITORJOB_WARNING,
	MONITORJOB_VERBOSE,
	MONITORJOB_ERROR,
	MONITORJOB_INFORMATION,
	MONITORJOB_RETURNVALUE_INFO,
	MONITORJOB_RETURNVALUE_WARNING,
	MONITORJOB_RETURNVALUE_CRITICAL,
	MONITORJOB_RETURNVALUE_UNKNOWN,
	MONITORJOB_RETURNVALUE_WAIT,
	MONITORJOB_MINUTE_WAIT,
	MONTH,
	MONTHDAY,
	NETWORK,
	NETWORK_INTERFACE,
	NETWORK_INTERFACE_LIST,
	NODE_NAME,
	NODE_VARIABLE,
	NODEMAP_FILE_NAME_TOO_LONG,
	NONEXISTENT,
	NOTIFY_ID,
	NOTIFY_INITIAL,
	NOTIFY,
	NUMBER,
	OBJECT_ID,
	OBJECT_PRIVILEGE,
	OBJECT_TYPE,
	OID,
	OS,
	OS_NAME,
	OS_RELEASE,
	OS_VERSION,
	OWNER_ROLE_ID,
	PARAM,
	PASSWORD,
	PATTERN_MATCHING_EXPRESSION,
	PING_REACH,
	PLATFORM_FAMILY_NAME,
	PLUGIN_ID,
	PORT_NUMBER,
	PRIORITY,
	PROCESS_NUMBER,
	PROTOCOL_DNS,
	PROTOCOL_FTP,
	PROTOCOL_IMAP,
	PROTOCOL_IMAPS,
	PROTOCOL_NTP,
	PROTOCOL_POP3,
	PROTOCOL_POP3S,
	PROTOCOL_SMTP,
	PROTOCOL_SMTPS,
	RECEIVE_TIME,
	RECORD,
	RECORD_VALUE,
	RECORDS_NUMBER,
	REPORT_OUTPUT_DATE,
	REPORT_OUTPUT_USER,
	REPORT_TITLE_MONITOR_EVENT,
	REQUEST_URL,
	RESPONSE_BODY,
	RESPONSE_TIME_MILLI_SEC,
	RETRYING,
	ROLE,
	ROLE_ID,
	ROLE_NAME,
	ROOT,
	RUN_COUNT,
	RUN_INTERVAL,
	SCHEDULE,
	SCOPE,
	SELECT_VALUE,
	SERVICE_PROTOCOL,
	SNMP_AUTH_PASSWORD,
	SNMP_AUTH_PROTOCOL,
	SNMP_PRIV_PASSWORD,
	SNMP_PRIV_PROTOCOL,
	SNMP_RETRIES,
	SNMP_TIMEOUT,
	SNMP_USER,
	SNMP_VERSION_1,
	SNMP_VERSION_2,
	SNMP_VERSION_3,
	SQL_STRING,
	START,
	STATUS_CODE,
	STOP_AT_ONCE,
	SUBJECT,
	SUB_PLATFORM_FAMILY_NAME,
	SUMMARYTYPE,
	SUPPRESS_BY_TIME_INTERVAL,
	SUSPEND,
	TCP_CONNECT_ONLY,
	THISTIME,
	TIME,
	TIME_OUT,
	TIMESTAMP,
	TRAP_NAME,
	TRIGGER_MANUAL,
	TRIGGER_MONITOR,
	TYPE_ALL,
	TYPE_BENEATH,
	TYPE_CONFIRMED,
	TYPE_OFF,
	TYPE_ON,
	TYPE_UNCONFIRMED,
	UNKNOWN,
	USER_ID,
	USER_NAME,
	WAIT_AGENT_RESPONSE,
	WAIT_APPROVAL,
	WAIT_MONITOR_RESPONSE,
	WAIT_COMMAND_END,
	WAIT_RULE_DECISION_CONDITION,
	WAIT_RULE_DECISION_VALUE_1,
	WAIT_RULE_DECISION_VALUE_2,
	WARNING,
	WBEM_RETRIES,
	WBEM_TIMEOUT,
	WBEM_USER,
	WBEM_USER_PASSWORD,
	WEEKDAY,
	WINEVENT_CATEGORY,
	WINEVENT_ID,
	WINEVENT_KEYWORDS,
	WINEVENT_LOG,
	WINEVENT_SOURCE,
	WINRM_RETRIES,
	WINRM_TIMEOUT,
	WINRM_USER,
	WINRM_USER_PASSWORD,
	WINSERVICE_NAME,
	YEAR,
	MESSAGE_AGENT_IS_AVAILABLE,
	MESSAGE_AGENT_IS_NOT_AVAILABLE,
	MESSAGE_AGENT_REPLACE_FILE_FAULURE_NOTIFY_MSG,
	MESSAGE_AGENT_REPLACE_FILE_FAULURE_NOTIFY_ORIGMSG,
	MESSAGE_AGENT_STOPPED,
	MESSAGE_CALENDAR_ID_IS_NULL,
	MESSAGE_CALENDAR_ID_NOT_EXIST,
	MESSAGE_CANNOT_FIND_JDBC_DRIVER,
	MESSAGE_COULD_NOT_GET_NODE_ATTRIBUTES,
	MESSAGE_COULD_NOT_GET_NODE_ATTRIBUTES_PING,
	MESSAGE_COULD_NOT_GET_NUMERIC_VALUE,
	MESSAGE_COULD_NOT_GET_VALUE,
	MESSAGE_COULD_NOT_GET_VALUE_HTTP,
	MESSAGE_COULD_NOT_GET_VALUE_JMX,
	MESSAGE_COULD_NOT_GET_VALUE_PERFORMANCE,
	MESSAGE_COULD_NOT_GET_VALUE_PROCESS,
	MESSAGE_DATA_IS_TOO_OLD_TO_CHECK,
	MESSAGE_DELAY_OF_END_OCCURRED,
	MESSAGE_DELAY_OF_START_OCCURRED,
	MESSAGE_DELETE_NG_CALENDAR_REFERENCE,
	MESSAGE_DELETE_NG_ICONID_DEFAULT,
	MESSAGE_DELETE_NG_JOB_REFERENCE_TO_MONITOR,
	MESSAGE_DELETE_NG_JOB_REFERENCE,
	MESSAGE_DELETE_NG_JOB_REFERENCE_TO_ICONFILE,
	MESSAGE_DELETE_NG_JOBFILECHECK_REFERENCE,
	MESSAGE_DELETE_NG_JOBFILECHECK_REFERENCE_JOB,
	MESSAGE_DELETE_NG_JOBSCHEDULE_REFERENCE,
	MESSAGE_DELETE_NG_JOBTRIGGERTYPE_REFERENCE,
	MESSAGE_DELETE_NG_MAINTENANCE_REFERENCE,
	MESSAGE_DELETE_NG_MONITOR_REFERENCE,
	MESSAGE_DELETE_NG_NOTIFY_REFERENCE,
	MESSAGE_DO_NOT_HAVE_ENOUGH_PERMISSION,
	MESSAGE_END_VALUE,
	MESSAGE_ERROR_IN_OID,
	MESSAGE_ERROR_IN_OVERLAP,
	MESSAGE_ERROR_IN_TRAPOID_OVERLAPS,
	MESSAGE_EXCEED_LIMIT_NUMBER_256NODES,
	MESSAGE_EXCEEDED_MULTIPLICITY_OF_JOBS,
	MESSAGE_EXECUTED_AUTO_SEARCH_DEVICES,
	MESSAGE_FAIL_AT_WINRM_ID_OR_PASSWORD_OR_LOGINAUTH_ERR,
	MESSAGE_FAIL_TO_ANALYZE_PROXY_URL,
	MESSAGE_FAIL_TO_CHECK_NOT_TEXT,
	MESSAGE_FAIL_TO_EXECUTE_PING,
	MESSAGE_FAIL_TO_EXECUTE_TO_CONNECT,
	MESSAGE_FAILED_AUTO_SEARCH_DEVICES,
	MESSAGE_FAILED_TO_EXECUTE_SQL,
	MESSAGE_FAILED_TO_START_JOB,
	MESSAGE_FAILED_TO_TRANSFER_FILE,
	MESSAGE_FILE_NOT_FOUND,
	MESSAGE_FINISHED_TRANSFERRING_FILE,
	MESSAGE_ID_ILLEGAL_CHARACTERS,
	MESSAGE_ID_IS_NULL,
	MESSAGE_INPUT_BETWEEN,
	MESSAGE_INPUT_OVER_LIMIT,
	MESSAGE_INPUT_RANGE_OVER,
	MESSAGE_INPUT_RANGE_OVER_JOB_SETTINGTIME,
	MESSAGE_INPUT_UNDER,
	MESSAGE_JOB_MONITOR_RESULT_NOT_FOUND,
	MESSAGE_JOB_MONITOR_ORGMSG_CUSTOM_N,
	MESSAGE_JOB_MONITOR_ORGMSG_CUSTOM_S,
	MESSAGE_JOB_MONITOR_ORGMSG_CUSTOM_TRP_N,
	MESSAGE_JOB_MONITOR_ORGMSG_CUSTOM_TRP_S,
	MESSAGE_JOB_MONITOR_ORGMSG_HTTP,
	MESSAGE_JOB_MONITOR_ORGMSG_HTTP_SCENARIO_NOPROXY,
	MESSAGE_JOB_MONITOR_ORGMSG_HTTP_SCENARIO_PROXY,
	MESSAGE_JOB_MONITOR_ORGMSG_JMX,
	MESSAGE_JOB_MONITOR_ORGMSG_LOGFILE,
	MESSAGE_JOB_MONITOR_ORGMSG_PERFORMANCE,
	MESSAGE_JOB_MONITOR_ORGMSG_PING,
	MESSAGE_JOB_MONITOR_ORGMSG_PORT,
	MESSAGE_JOB_MONITOR_ORGMSG_PROCESS,
	MESSAGE_JOB_MONITOR_ORGMSG_SNMP_N,
	MESSAGE_JOB_MONITOR_ORGMSG_SQL,
	MESSAGE_JOB_MONITOR_ORGMSG_WINEVENT,
	MESSAGE_JOB_MONITOR_NOT_FOUND,
	MESSAGE_JOBFILECHECK_NOT_EXIST_REFERENCE,
	MESSAGE_JOBKICK_NG_DUPLICATE_PARAM,
	MESSAGE_JOBKICK_NG_DUPLICATE_SYSTEM_PARAM,
	MESSAGE_JOBTREE_OLD,
	MESSAGE_JOBTREE_OLD_JOBUNIT_ALREADY_DELETE,
	MESSAGE_JOBTRIGGERTYPE_NOT_EXIST_REFERENCE,
	MESSAGE_JOBUNIT_NG_DUPLICATE_JOB,
	MESSAGE_JOBUNITS_LOCK_OTHER_PEOPLE_GET,
	MESSAGE_JOBUNITS_LOCK_NO_GET,
	MESSAGE_LOG_FAILED_TO_READ_FILE,
	MESSAGE_LOG_FILE_NOT_FOUND,
	MESSAGE_LOG_FILE_SIZE_BYTE,
	MESSAGE_LOG_FILE_SIZE_EXCEEDED_UPPER_BOUND,
	MESSAGE_LOG_FILE,
	MESSAGE_MAINTENACE_STOPPED_SUCCESS,
	MESSAGE_MAINTENANCE_STOPPED_FAILED,
	MESSAGE_MATCH_RESPONSE_OF_PAGE_WITH_STRING_PATTERN,
	MESSAGE_MODULE_CHECK_BEGINS,
	MESSAGE_MODULE_CHECK_FAILED,
	MESSAGE_MODULE_CHECK_IS_COMPLETED_SUCCESSFULLY,
	MESSAGE_MODULE_EXECUTION_BEGINS,
	MESSAGE_MODULE_EXECUTION_FAILED,
	MESSAGE_MODULE_EXECUTION_IS_COMPLETED_SUCCESSFULLY,
	MESSAGE_MONITOR_UNCOMPLETED,
	MESSAGE_MULTIPLE_AGENTS_STARTED_SAME_FACILITY,
	MESSAGE_MUST_SET_MORE_THAN_ONE_PATTERN,
	MESSAGE_MUST_SET_ONE_OR_MORE_PATTERNS,
	MESSAGE_NODE_FOR_EXPORT_NOT_EXIST,
	MESSAGE_NOT_ALLOWED_IN_REPOSITORY,
	MESSAGE_NOT_FOUND_A_REDIRECT_URL_ON_PAGE,
	MESSAGE_NOT_FOUND_PLACEMENT_FILE,
	MESSAGE_NOT_MATCH_RESPONSE_OF_PAGE_WITH_ALL_STRING_PATTERNS,
	MESSAGE_NOT_REGISTER_IN_REPOSITORY,
	MESSAGE_NOT_REGISTER_IN_REPOSITORY_PORT,
	MESSAGE_NOTIFY_ID_IS_NULL,
	MESSAGE_NOTIFY_ID_NOT_EXIST,
	MESSAGE_OPERATION_IS_ABOUT_TO_BE_RUN,
	MESSAGE_OWNERROLEID_CHANGE_NG,
	MESSAGE_PLEASE_INPUT,
	MESSAGE_PLEASE_INPUT_COMMAND,
	MESSAGE_PLEASE_INPUT_EFFECTIVEUSER,
	MESSAGE_PLEASE_INPUT_RANGE,
	MESSAGE_PLEASE_INPUT_RUNCOUNT,
	MESSAGE_PLEASE_INPUT_RUNINTERVAL,
	MESSAGE_PLEASE_INPUT_TIME,
	MESSAGE_PLEASE_INPUT_TIMEOUT,
	MESSAGE_PLEASE_INPUT_TIMEOUT_SHORTER_THAN_MONITOR_INTERVAL,
	MESSAGE_PLEASE_INPUT_SUBSTITUTE_TIME,
	MESSAGE_PLEASE_INPUT_SUBSTITUTE_LIMIT,
	MESSAGE_PLEASE_INPUT_VALUE_AND_RANGE,
	MESSAGE_PLEASE_SELECT_INFO_ONE_OR_MORE,
	MESSAGE_PLEASE_SELECT_NODE_RUN_COMMAND,
	MESSAGE_PLEASE_SET_APPLICATION,
	MESSAGE_PLEASE_SET_APPROVAL_REQ_ROLEID,
	MESSAGE_PLEASE_SET_APPROVAL_REQ_USERID,
	MESSAGE_PLEASE_SET_APPROVAL_REQ_SENTENCE,
	MESSAGE_PLEASE_SET_APPROVAL_REQ_MAIL_TITLE,
	MESSAGE_PLEASE_SET_APPROVAL_REQ_MAIL_BODY,
	MESSAGE_PLEASE_SET_AUTHPASS_8CHARA_MINIMUM,
	MESSAGE_PLEASE_SET_CALENDAR_DETAIL,
	MESSAGE_PLEASE_SET_CALENDAR_PATTERN,
	MESSAGE_PLEASE_SET_CHARACTER_CODE,
	MESSAGE_PLEASE_SET_COMMAND,
	MESSAGE_PLEASE_SET_COMMAND_NOTIFY,
	MESSAGE_PLEASE_SET_COMMUNITY_NAME,
	MESSAGE_PLEASE_SET_CONNECTION_URL,
	MESSAGE_PLEASE_SET_CONNECTION_URL_CORRECT_FORMAT,
	MESSAGE_PLEASE_SET_CONTROL,
	MESSAGE_PLEASE_SET_CORRECT_RANGE_OF_IP_ADDRESSES,
	MESSAGE_PLEASE_SET_COUNT,
	MESSAGE_PLEASE_SET_DAY,
	MESSAGE_PLEASE_SET_DIR,
	MESSAGE_PLEASE_SET_DIR_NAME,
	MESSAGE_PLEASE_SET_EFFECTIVEUSER,
	MESSAGE_PLEASE_SET_FACILIY,
	MESSAGE_PLEASE_SET_FILE_ENCODING,
	MESSAGE_PLEASE_SET_FILE_NAME,
	MESSAGE_PLEASE_SET_FILE_RETURNCODE,
	MESSAGE_PLEASE_SET_FILENAME,
	MESSAGE_PLEASE_SET_FROM_MIN,
	MESSAGE_PLEASE_SET_HOUR,
	MESSAGE_PLEASE_SET_HOW_TO_RUN_COMMAND,
	MESSAGE_PLEASE_SET_INFRA_MANAGEMENT,
	MESSAGE_PLEASE_SET_INFRA_MANAGEMENT_ID,
	MESSAGE_PLEASE_SET_INFO_LOWERVALUE,
	MESSAGE_PLEASE_SET_INFO_UPPERVALUE_EXCEED_LOWERVALUE,
	MESSAGE_PLEASE_SET_INTERVAL,
	MESSAGE_PLEASE_SET_IPADDR_CORRECT_FORMAT,
	MESSAGE_PLEASE_SET_IPV4_CORRECT_FORMAT,
	MESSAGE_PLEASE_SET_IPV6_CORRECT_FORMAT,
	MESSAGE_PLEASE_SET_JOB,
	MESSAGE_PLEASE_SET_JOB_MONITOR_WAIT_TIME,
	MESSAGE_PLEASE_SET_JOB_MONITOR_WAIT_END_VALUE,
	MESSAGE_PLEASE_SET_JOB_MONITOR_END_VALUE,
	MESSAGE_PLEASE_SET_JOBID,
	MESSAGE_PLEASE_SET_LATER_DATE_AND_TIME,
	MESSAGE_PLEASE_SET_LATER_TIME,
	MESSAGE_PLEASE_SET_MAILADDR_CORRECT_FORMAT,
	MESSAGE_PLEASE_SET_MAINTENANCE_ID,
	MESSAGE_PLEASE_SET_MAINTENANCE_TYPE,
	MESSAGE_PLEASE_SET_MESSAGE,
	MESSAGE_PLEASE_SET_METHOD_OF_CALCULATION,
	MESSAGE_PLEASE_SET_MIN,
	MESSAGE_PLEASE_SET_MIN_EACH,
	MESSAGE_PLEASE_SET_MONITOR_ID,
	MESSAGE_PLEASE_SET_MONITOR_ITEM,
	MESSAGE_PLEASE_SET_MONTH,
	MESSAGE_PLEASE_SET_NODE,
	MESSAGE_PLEASE_SET_NODE_REPOSITORY,
	MESSAGE_PLEASE_SET_OID,
	MESSAGE_PLEASE_SET_OWNERROLEID,
	MESSAGE_PLEASE_SET_PASSWORD,
	MESSAGE_PLEASE_SET_PORT_NUM,
	MESSAGE_PLEASE_SET_PORT_NUMBER,
	MESSAGE_PLEASE_SET_PRIORITY,
	MESSAGE_PLEASE_SET_PRIVPASS_8CHARA_MINIMUM,
	MESSAGE_PLEASE_SET_REFERENCE_JOBID,
	MESSAGE_PLEASE_SET_REFERENCE_JOBUNITID,
	MESSAGE_PLEASE_SET_REGEX,
	MESSAGE_PLEASE_SET_REGEX_TO_ARGUMENT,
	MESSAGE_PLEASE_SET_REGEX_TO_COMMAND,
	MESSAGE_PLEASE_SET_RETENTION_PERIOD,
	MESSAGE_PLEASE_SET_SCOPE,
	MESSAGE_PLEASE_SET_SCOPE_NOTIFY,
	MESSAGE_PLEASE_SET_SEARCH_IPADDR,
	MESSAGE_PLEASE_SET_SELECT_STATEMENT_IN_SQL,
	MESSAGE_PLEASE_SET_SERVICE_PROTOCOL,
	MESSAGE_PLEASE_SET_SNMP_VERSION,
	MESSAGE_PLEASE_SET_TIMEOUT_LOWERVALUE,
	MESSAGE_PLEASE_SET_UR_CORRECT_FORMAT,
	MESSAGE_PLEASE_SET_URL,
	MESSAGE_PLEASE_SET_USER_ID,
	MESSAGE_PLEASE_SET_USER_NAME,
	MESSAGE_PLEASE_SET_VALIDITY_PERIOD,
	MESSAGE_PLEASE_SET_VALUE_SMALLER_INTERVAL,
	MESSAGE_PLEASE_SET_VALUE_WITH_REGEX,
	MESSAGE_PLEASE_SET_WARN_LOWERVALUE,
	MESSAGE_PLEASE_SET_WARN_UPPERVALUE_EXCEED_LOWERVALUE,
	MESSAGE_PLEASE_SET_WEEK,
	MESSAGE_PLEASE_SET_WIN_SERVICE_NAME,
	MESSAGE_PRIORITY_SCOPE_CRITICAL,
	MESSAGE_PRIORITY_SCOPE_INFO,
	MESSAGE_PRIORITY_SCOPE_UNKNOWN,
	MESSAGE_PRIORITY_SCOPE_WARNING,
	MESSAGE_REFERENCE_JOBID_NG_INVALID_JOBID,
	MESSAGE_REFERENCE_JOBID_NG_INVALID_SETTING,
	MESSAGE_REFERENCE_JOBID_NG_INVALID_SUBORDINATE_JOB,
	MESSAGE_REGEX_INVALID,
	MESSAGE_REQUEST_TIMEOUT,
	MESSAGE_RESPONSE_NOT_FOUND,
	MESSAGE_SCHEDULE_NOT_EXIST,
	MESSAGE_STARTED_SUCCESSFULLY,
	MESSAGE_STARTED_TO_TRANSFER_FILE,
	MESSAGE_STOPCOMMAND_NG_IN_FILE_TRANSFER,
	MESSAGE_STOPPED_STATUS_ERROR,
	MESSAGE_STOPPED_STATUS_NORMAL,
	MESSAGE_STOPPED_STATUS_WARNING,
	MESSAGE_SYS_001_MNG,
	MESSAGE_SYS_001_MON,
	MESSAGE_SYS_001_MON_PNG,
	MESSAGE_SYS_001_SYS_SFC,
	MESSAGE_SYS_002_MNG,
	MESSAGE_SYS_002_SYS_SFC,
	MESSAGE_SYS_003_JOB,
	MESSAGE_SYS_003_SYS_SFC,
	MESSAGE_SYS_004_MAILTEMP,
	MESSAGE_SYS_004_NOTIFY,
	MESSAGE_SYS_004_SYS_SFC,
	MESSAGE_SYS_005_SYS_SFC,
	MESSAGE_SYS_006_NOTIFY,
	MESSAGE_SYS_006_SYS_SFC,
	MESSAGE_SYS_007_JOB,
	MESSAGE_SYS_007_NOTIFY,
	MESSAGE_SYS_007_SYS_SFC,
	MESSAGE_SYS_008_JOB,
	MESSAGE_SYS_008_NOTIFY,
	MESSAGE_SYS_008_SYS_SFC,
	MESSAGE_SYS_009_JOB,
	MESSAGE_SYS_009_NOTIFY,
	MESSAGE_SYS_009_SYS_SFC,
	MESSAGE_SYS_009_TRAP,
	MESSAGE_SYS_010_JOB,
	MESSAGE_SYS_010_MON,
	MESSAGE_SYS_010_SYS_SFC,
	MESSAGE_SYS_011_JOB,
	MESSAGE_SYS_011_MON,
	MESSAGE_SYS_011_SYS_SFC,
	MESSAGE_SYS_012_JOB,
	MESSAGE_SYS_012_MON,
	MESSAGE_SYS_012_SYS_SFC,
	MESSAGE_SYS_013_JOB,
	MESSAGE_SYS_013_MON,
	MESSAGE_SYS_013_SYS_SFC,
	MESSAGE_SYS_015_JOB,
	MESSAGE_SYS_016_JOB,
	MESSAGE_SYS_017_JOB,
	MESSAGE_SYS_018_JOB,
	MESSAGE_SYS_019_JOB,
	MESSAGE_SYS_020_JOB,
	MESSAGE_SYS_021_SYS_SFC,
	MESSAGE_SYS_022_CUSTOM_TRAP_NUM_OVER,
	MESSAGE_SYS_023_SYS_SFC,
	MESSAGE_TIME_OUT,
	MESSAGE_TOO_OLD_TO_CALCULATE,
	MESSAGE_UNEXPECTED_ERR_OCCURRED,
	MESSAGE_UNEXPECTED_EXCEPTION_OCCURRED,
	MESSAGE_UNEXPECTED_STATUS_CODE_RETURNED,
	MESSAGE_WAIT_JOBID_NG_INVALID_JOBID,
	MESSAGE_WANT_TO_GET_LOCK,
	MESSAGE_WINEVENT_CANNOT_EXECUTE_POWERSHELL_COMMAND,
	MESSAGE_WINEVENT_EVENTS_LOST_REACHED_MAXIMUM_EVENT_PER_POLLING,
	MESSAGE_WINEVENT_FAILED_TO_GET_WINDOWS_EVENTLOG,
	MESSAGE_WINEVENT_FAILED_TO_MONITOR_EVENTLOG_EXECUTION_STRING_MAXIMUM_VALUE,
	MESSAGE_WINEVENT_FAILED_TO_CREATE_BOOKMARK,
	MESSAGE_WINEVENT_INVALID_POWERSHELL_EXECUTION_POLICY,
	MESSAGE_WINEVENT_EVENTS_LOST,
	MESSAGE_WINSERVICE_NAME_NOT_EXIST_OR_NOT_REFERENCE_AUTHORITY_TO_WINRM,
	MONITOR_CUSTOMTRAP_KEY_PATTERN,
	MESSAGE_HUB_LOG_FORMAT_USED,
	MESSAGE_HUB_LOG_FORMAT_DUPLICATION_KEY,
	MESSAGE_HUB_LOG_FORMAT_DUPLICATION_ID,
	MESSAGE_HUB_TRANSFER_DUPLICATION_ID,
	MESSAGE_HUB_DATA_TRANSFER_FAILED,
	MESSAGE_HUB_SEARCH_DATE_INVALID,
	MESSAGE_HUB_SEARCH_KEYWORD_INVALID,
	MESSAGE_HUB_SEARCH_TIMEOUT,
	MESSAGE_HUB_SEARCH_NO_NODE,
	MESSAGE_HUB_COLLECT_NUMBERING_OVER_INTERMEDIATE
	;
	
	public static final String DELIMITER = ":";
	public static final String ARGS_SEPARATOR = "\"";
	private static final String PREFIX = "$[";
	private static final String POSTFIX = "]";
	private static final String ESCAPE = ".";
	
	private static Log m_log = LogFactory.getLog( MessageConstant.class );
	public String getMessage(String... args) {
		String ret = PREFIX + toString();
		m_log.trace("before = " + ret);
		for (String s : args) {
			ret += DELIMITER + ARGS_SEPARATOR + s + ARGS_SEPARATOR;
		}
		m_log.trace("after = " + ret);
		return ret + POSTFIX;
	}
	
	public static String escape (String s) {
		return s.replaceAll("$\\[", ESCAPE).replaceAll("\\]", ESCAPE).replaceAll("\\:", ESCAPE);
	}
	
	public static void main (String args[]) {
		String s = MessageConstant.ADMINISTRATOR.getMessage();
		System.out.println("s=" + s);
		System.out.println("s=" + escape(s));
	}
}
