{
  "filepath": "/tmp/Lang-8b/src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateFormatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 323,
      "comment": "\n * \u003cp\u003eDate and time formatting utilities and constants.\u003c/p\u003e\n *\n * \u003cp\u003eFormatting is performed using the thread-safe\n * {@link org.apache.commons.lang3.time.FastDateFormat} class.\u003c/p\u003e\n *\n * \u003cp\u003eNote that the JDK has a bug wherein calling Calendar.get(int) will \n * override any previously called Calendar.clear() calls. See LANG-755.\u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UTC_TIME_ZONE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The UTC time zone (often referred to as GMT).\n     * This is private as it is mutable.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATETIME_FORMAT"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * ISO8601 formatter for date-time without time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u0027T\u0027HH:mm:ss\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATETIME_TIME_ZONE_FORMAT"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": "\n     * ISO8601 formatter for date-time with time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u0027T\u0027HH:mm:ssZZ\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATE_FORMAT"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": "\n     * ISO8601 formatter for date without time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATE_TIME_ZONE_FORMAT"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": "\n     * ISO8601-like formatter for date with time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-ddZZ\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard does not allow a time zone  without a time.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_FORMAT"
      ],
      "begin_line": 77,
      "end_line": 78,
      "comment": "\n     * ISO8601 formatter for time without time zone.\n     * The format used is \u003ctt\u003e\u0027T\u0027HH:mm:ss\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_TIME_ZONE_FORMAT"
      ],
      "begin_line": 84,
      "end_line": 85,
      "comment": "\n     * ISO8601 formatter for time with time zone.\n     * The format used is \u003ctt\u003e\u0027T\u0027HH:mm:ssZZ\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_NO_T_FORMAT"
      ],
      "begin_line": 93,
      "end_line": 94,
      "comment": "\n     * ISO8601-like formatter for time without time zone.\n     * The format used is \u003ctt\u003eHH:mm:ss\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard requires the \u0027T\u0027 prefix for times.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_NO_T_TIME_ZONE_FORMAT"
      ],
      "begin_line": 102,
      "end_line": 103,
      "comment": "\n     * ISO8601-like formatter for time with time zone.\n     * The format used is \u003ctt\u003eHH:mm:ssZZ\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard requires the \u0027T\u0027 prefix for times.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SMTP_DATETIME_FORMAT"
      ],
      "begin_line": 109,
      "end_line": 110,
      "comment": "\n     * SMTP (and probably other) date headers.\n     * The format used is \u003ctt\u003eEEE, dd MMM yyyy HH:mm:ss Z\u003c/tt\u003e in US locale.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.DateFormatUtils()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eDateFormatUtils instances should NOT be constructed in standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.formatUTC(long, java.lang.String)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date, not null\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.formatUTC(java.util.Date, java.lang.String)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format, not null\n     * @param pattern  the pattern to use to format the date, not null\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.formatUTC(long, java.lang.String, java.util.Locale)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date, not null\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.formatUTC(java.util.Date, java.lang.String, java.util.Locale)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format, not null\n     * @param pattern  the pattern to use to format the date, not null\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(long, java.lang.String)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date, not null\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Date, java.lang.String)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern.\u003c/p\u003e\n     * \n     * @param date  the date to format, not null\n     * @param pattern  the pattern to use to format the date, not null\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar, java.lang.String)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * \u003cp\u003eFormats a calendar into a specific pattern.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format, not null\n     * @param pattern  the pattern to use to format the calendar, not null\n     * @return the formatted calendar\n     * @see FastDateFormat#format(Calendar)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(long, java.lang.String, java.util.TimeZone)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param millis  the time expressed in milliseconds\n     * @param pattern  the pattern to use to format the date, not null\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.TimeZone)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format, not null\n     * @param pattern  the pattern to use to format the date, not null\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar, java.lang.String, java.util.TimeZone)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * \u003cp\u003eFormats a calendar into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format, not null\n     * @param pattern  the pattern to use to format the calendar, not null\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted calendar\n     * @see FastDateFormat#format(Calendar)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(long, java.lang.String, java.util.Locale)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date, not null\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.Locale)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param date  the date to format, not null\n     * @param pattern  the pattern to use to format the date, not null\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar, java.lang.String, java.util.Locale)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * \u003cp\u003eFormats a calendar into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format, not null\n     * @param pattern  the pattern to use to format the calendar, not null\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted calendar\n     * @see FastDateFormat#format(Calendar)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(long, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date, not null\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param date  the date to format, not null\n     * @param pattern  the pattern to use to format the date, not null, not null\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 82)",
        "(line 304,col 9)-(line 304,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateFormatUtils.format(java.util.Calendar, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003eFormats a calendar into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format, not null\n     * @param pattern  the pattern to use to format the calendar, not null\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted calendar\n     * @see FastDateFormat#format(Calendar)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 82)",
        "(line 320,col 9)-(line 320,col 35)"
      ]
    }
  ]
}