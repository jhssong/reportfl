{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateFormatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 320,
      "comment": "\n * \u003cp\u003eDate and time formatting utilities and constants.\u003c/p\u003e\n *\n * \u003cp\u003eFormatting is performed using the\n * {@link org.apache.commons.lang3.time.FastDateFormat} class.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Apache Ant - DateUtils\n * @author \u003ca href\u003d\"mailto:sbailliez@apache.org\"\u003eStephane Bailliez\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:stefan.bodewig@epost.de\"\u003eStefan Bodewig\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATETIME_FORMAT"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": "\n     * ISO8601 formatter for date-time without time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u0027T\u0027HH:mm:ss\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATETIME_TIME_ZONE_FORMAT"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": "\n     * ISO8601 formatter for date-time with time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u0027T\u0027HH:mm:ssZZ\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATE_FORMAT"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": "\n     * ISO8601 formatter for date without time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATE_TIME_ZONE_FORMAT"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": "\n     * ISO8601-like formatter for date with time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-ddZZ\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard does not allow a time zone  without a time.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_FORMAT"
      ],
      "begin_line": 74,
      "end_line": 75,
      "comment": "\n     * ISO8601 formatter for time without time zone.\n     * The format used is \u003ctt\u003e\u0027T\u0027HH:mm:ss\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_TIME_ZONE_FORMAT"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": "\n     * ISO8601 formatter for time with time zone.\n     * The format used is \u003ctt\u003e\u0027T\u0027HH:mm:ssZZ\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_NO_T_FORMAT"
      ],
      "begin_line": 90,
      "end_line": 91,
      "comment": "\n     * ISO8601-like formatter for time without time zone.\n     * The format used is \u003ctt\u003eHH:mm:ss\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard requires the \u0027T\u0027 prefix for times.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_NO_T_TIME_ZONE_FORMAT"
      ],
      "begin_line": 99,
      "end_line": 100,
      "comment": "\n     * ISO8601-like formatter for time with time zone.\n     * The format used is \u003ctt\u003eHH:mm:ssZZ\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard requires the \u0027T\u0027 prefix for times.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SMTP_DATETIME_FORMAT"
      ],
      "begin_line": 106,
      "end_line": 107,
      "comment": "\n     * SMTP (and probably other) date headers.\n     * The format used is \u003ctt\u003eEEE, dd MMM yyyy HH:mm:ss Z\u003c/tt\u003e in US locale.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.DateFormatUtils()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * \u003cp\u003eDateFormatUtils instances should NOT be constructed in standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.formatUTC(long, java.lang.String)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.formatUTC(java.util.Date, java.lang.String)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.formatUTC(long, java.lang.String, java.util.Locale)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.formatUTC(java.util.Date, java.lang.String, java.util.Locale)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(long, java.lang.String)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Date, java.lang.String)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar, java.lang.String)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eFormats a calendar into a specific pattern.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param pattern  the pattern to use to format the calendar\n     * @return the formatted calendar\n     * @see FastDateFormat#format(Calendar)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(long, java.lang.String, java.util.TimeZone)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param millis  the time expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.TimeZone)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar, java.lang.String, java.util.TimeZone)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003eFormats a calendar into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param pattern  the pattern to use to format the calendar\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted calendar\n     * @see FastDateFormat#format(Calendar)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(long, java.lang.String, java.util.Locale)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.Locale)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar, java.lang.String, java.util.Locale)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eFormats a calendar into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param pattern  the pattern to use to format the calendar\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted calendar\n     * @see FastDateFormat#format(Calendar)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(long, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 82)",
        "(line 301,col 9)-(line 301,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * \u003cp\u003eFormats a calendar into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param pattern  the pattern to use to format the calendar\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted calendar\n     * @see FastDateFormat#format(Calendar)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 82)",
        "(line 317,col 9)-(line 317,col 35)"
      ]
    }
  ]
}