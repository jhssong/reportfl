{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/time/DateFormatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateFormatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 261,
      "comment": "\n * \u003cp\u003eDate and time formatting utilities and constants.\u003c/p\u003e\n *\n * \u003cp\u003eFormatting is performed using the\n * {@link org.apache.commons.lang.time.FastDateFormat} class.\u003c/p\u003e\n *\n * @author Apache Ant - DateUtils\n * @author \u003ca href\u003d\"mailto:sbailliez@apache.org\"\u003eStephane Bailliez\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:stefan.bodewig@epost.de\"\u003eStefan Bodewig\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATETIME_FORMAT"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": "\n     * ISO8601 formatter for date-time without time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u0027T\u0027HH:mm:ss\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATETIME_TIME_ZONE_FORMAT"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": "\n     * ISO8601 formatter for date-time with time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u0027T\u0027HH:mm:ssZZ\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATE_FORMAT"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": "\n     * ISO8601 formatter for date without time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-dd\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_DATE_TIME_ZONE_FORMAT"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": "\n     * ISO8601-like formatter for date with time zone.\n     * The format used is \u003ctt\u003eyyyy-MM-ddZZ\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard does not allow a time zone  without a time.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_FORMAT"
      ],
      "begin_line": 72,
      "end_line": 73,
      "comment": "\n     * ISO8601 formatter for time without time zone.\n     * The format used is \u003ctt\u003e\u0027T\u0027HH:mm:ss\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_TIME_ZONE_FORMAT"
      ],
      "begin_line": 79,
      "end_line": 80,
      "comment": "\n     * ISO8601 formatter for time with time zone.\n     * The format used is \u003ctt\u003e\u0027T\u0027HH:mm:ssZZ\u003c/tt\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_NO_T_FORMAT"
      ],
      "begin_line": 88,
      "end_line": 89,
      "comment": "\n     * ISO8601-like formatter for time without time zone.\n     * The format used is \u003ctt\u003eHH:mm:ss\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard requires the \u0027T\u0027 prefix for times.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_TIME_NO_T_TIME_ZONE_FORMAT"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": "\n     * ISO8601-like formatter for time with time zone.\n     * The format used is \u003ctt\u003eHH:mm:ssZZ\u003c/tt\u003e.\n     * This pattern does not comply with the formal ISO8601 specification\n     * as the standard requires the \u0027T\u0027 prefix for times.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SMTP_DATETIME_FORMAT"
      ],
      "begin_line": 104,
      "end_line": 105,
      "comment": "\n     * SMTP (and probably other) date headers.\n     * The format used is \u003ctt\u003eEEE, dd MMM yyyy HH:mm:ss Z\u003c/tt\u003e in US locale.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.DateFormatUtils()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * \u003cp\u003eDateFormatUtils instances should NOT be constructed in standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.formatUTC(long, java.lang.String)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.formatUTC(java.util.Date, java.lang.String)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.formatUTC(long, java.lang.String, java.util.Locale)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.formatUTC(java.util.Date, java.lang.String, java.util.Locale)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern using the UTC time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(long, java.lang.String)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(java.util.Date, java.lang.String)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(long, java.lang.String, java.util.TimeZone)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param millis  the time expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.TimeZone)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(long, java.lang.String, java.util.Locale)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.Locale)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a locale.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(long, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param millis  the date to format expressed in milliseconds\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateFormatUtils.format(java.util.Date, java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * \u003cp\u003eFormats a date/time into a specific pattern in a time zone  and locale.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param pattern  the pattern to use to format the date\n     * @param timeZone  the time zone  to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param locale  the locale to use, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the formatted date\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 82)",
        "(line 258,col 9)-(line 258,col 31)"
      ]
    }
  ]
}