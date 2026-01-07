{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/time/DateFormatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateFormatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 262,
      "comment": "\n * \u003cp\u003eDate and time formatting utilities and constants.\u003c/p\u003e\n *\n * \u003cp\u003eFormatting is performed using the\n * {@link org.apache.commons.lang.time.FastDateFormat} class.\u003c/p\u003e\n *\n * @author Apache Ant - DateUtils\n * @author \u003ca href\u003d\"mailto:sbailliez@apache.org\"\u003eStephane Bailliez\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:stefan.bodewig@epost.de\"\u003eStefan Bodewig\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATETIME_FORMAT"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": "\n     * ISO8601 formatter for date-time without time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u0027T\u0027HH:mm:ss\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATETIME_TIME_ZONE_FORMAT"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": "\n     * ISO8601 formatter for date-time with time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u0027T\u0027HH:mm:ssZZ\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATE_FORMAT"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n     * ISO8601 formatter for date without time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATE_TIME_ZONE_FORMAT"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": "\n     * ISO8601-like formatter for date with time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-ddZZ\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard does not allow a time zone  without a time.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_FORMAT"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": "\n     * ISO8601 formatter for time without time zone.\n     * The format used is \u003ctt\u003e\u0027T\u0027HH:mm:ss\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_TIME_ZONE_FORMAT"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": "\n     * ISO8601 formatter for time with time zone.\n     * The format used is \u003ctt\u003e\u0027T\u0027HH:mm:ssZZ\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_NO_T_FORMAT"
      ],
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n     * ISO8601-like formatter for time without time zone.\n     * The format used is \u003ctt\u003eHH:mm:ss\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard requires the \u0027T\u0027 prefix for times.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_NO_T_TIME_ZONE_FORMAT"
      ],
      "begin_line": 98,
      "end_line": 99,
      "comment": "\n     * ISO8601-like formatter for time with time zone.\n     * The format used is \u003ctt\u003eHH:mm:ssZZ\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard requires the \u0027T\u0027 prefix for times.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SMTP_DATETIME_FORMAT"
      ],
      "begin_line": 105,
      "end_line": 106,
      "comment": "\n     * SMTP (and probably other) date headers.\n     * The format used is \u003ctt\u003eEEE, dd MMM yyyy HH:mm:ss Z\u003c/tt\u003e in US locale.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.DateFormatUtils()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * \u003cp\u003eDateFormatUtils instances should NOT be constructed in standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.formatUTC(long, java.lang.String)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.formatUTC(java.util.Date, java.lang.String)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.formatUTC(long, java.lang.String, java.util.Locale)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.formatUTC(java.util.Date, java.lang.String, java.util.Locale)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(long, java.lang.String)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(java.util.Date, java.lang.String)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(long, java.lang.String, java.util.TimeZone)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param millis  the time expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.TimeZone)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(long, java.lang.String, java.util.Locale)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.Locale)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(long, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 82)",
        "(line 259,col 9)-(line 259,col 31)"
      ]
    }
  ]
}