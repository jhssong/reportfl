{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/time/FastDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 64,
      "end_line": 1513,
      "comment": "\n * \u003cp\u003eFastDateFormat is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class can be used as a direct replacement to\n * {@code SimpleDateFormat} in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * {@code SimpleDateFormat} is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, {@code \u0027Z\u0027}, to represent\n * time zones in RFC822 format (eg. {@code +0800} or {@code -1100}).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern {@code \u0027ZZ\u0027} has been made to represent\n * ISO8601 full format time zones (eg. {@code +08:00} or {@code -11:00}).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Required for serialization support.\n     *\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cache"
      ],
      "begin_line": 101,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Anonymous-b101214f-9356-4ca2-bb7a-dfa65d059f18.createInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 65)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 108,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default locale.\u003c/p\u003e\n     *\n     * @return a date/time formatter\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern in the\n     * default locale.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * time zone.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * locale.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or {@code null}\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     *\n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.Locale)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     *\n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.TimeZone)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     *\n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     *\n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     *\n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.Locale)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     *\n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     *\n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     *\n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style\n     * in the default time zone and locale.\u003c/p\u003e\n     *\n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.Locale)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     *\n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     *\n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 387,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     *\n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 402,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     *\n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use {@code TimeZone.LONG} or {@code TimeZone.SHORT}\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 85)",
        "(line 404,col 9)-(line 404,col 54)",
        "(line 405,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.FastDateFormat(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 426,
      "end_line": 432,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateFormat.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern\n     * @param timeZone  non-null time zone to use\n     * @param locale  non-null locale to use\n     * @throws NullPointerException if pattern, timeZone, or locale is null.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 27)",
        "(line 428,col 9)-(line 428,col 29)",
        "(line 429,col 9)-(line 429,col 25)",
        "(line 431,col 9)-(line 431,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.init()",
      "begin_line": 437,
      "end_line": 447,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 46)",
        "(line 439,col 9)-(line 439,col 63)",
        "(line 441,col 9)-(line 441,col 20)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 446,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parsePattern()",
      "begin_line": 457,
      "end_line": 578,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     *\n     * @return a {@code List} of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 67)",
        "(line 459,col 9)-(line 459,col 49)",
        "(line 461,col 9)-(line 461,col 42)",
        "(line 462,col 9)-(line 462,col 46)",
        "(line 463,col 9)-(line 463,col 56)",
        "(line 464,col 9)-(line 464,col 50)",
        "(line 465,col 9)-(line 465,col 60)",
        "(line 466,col 9)-(line 466,col 56)",
        "(line 468,col 9)-(line 468,col 39)",
        "(line 469,col 9)-(line 469,col 36)",
        "(line 471,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 577,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parseToken(java.lang.String, int[])",
      "begin_line": 587,
      "end_line": 637,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     *\n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 48)",
        "(line 590,col 9)-(line 590,col 28)",
        "(line 591,col 9)-(line 591,col 38)",
        "(line 593,col 9)-(line 593,col 35)",
        "(line 594,col 9)-(line 633,col 9)",
        "(line 635,col 9)-(line 635,col 24)",
        "(line 636,col 9)-(line 636,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.selectNumberRule(int, int)",
      "begin_line": 646,
      "end_line": 655,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     *\n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 654,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 668,
      "end_line": 680,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date}, {@code Calendar} or\n     * {@code Long} (milliseconds) object.\u003c/p\u003e\n     *\n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 679,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(long)",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * \u003cp\u003eFormats a millisecond {@code long} value.\u003c/p\u003e\n     *\n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Date)",
      "begin_line": 699,
      "end_line": 703,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date} object using a {@code GregorianCalendar}.\u003c/p\u003e\n     *\n     * @param date  the date to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 63)",
        "(line 701,col 9)-(line 701,col 24)",
        "(line 702,col 9)-(line 702,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Calendar)",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * \u003cp\u003eFormats a {@code Calendar} object.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(long, java.lang.StringBuffer)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     * \u003cp\u003eFormats a milliseond {@code long} value into the\n     * supplied {@code StringBuffer}.\u003c/p\u003e\n     *\n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 736,
      "end_line": 740,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date} object into the\n     * supplied {@code StringBuffer} using a {@code GregorianCalendar}.\u003c/p\u003e\n     *\n     * @param date  the date to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 63)",
        "(line 738,col 9)-(line 738,col 24)",
        "(line 739,col 9)-(line 739,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 750,
      "end_line": 752,
      "comment": "\n     * \u003cp\u003eFormats a {@code Calendar} object into the\n     * supplied {@code StringBuffer}.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 762,
      "end_line": 767,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 778,
      "end_line": 783,
      "comment": "\n     * \u003cp\u003eParsing is not supported.\u003c/p\u003e\n     *\n     * @param source  the string to parse\n     * @param pos  the parsing position\n     * @return {@code null} as not supported\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 24)",
        "(line 781,col 9)-(line 781,col 29)",
        "(line 782,col 9)-(line 782,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getPattern()",
      "begin_line": 792,
      "end_line": 794,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this formatter.\u003c/p\u003e\n     *\n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZone()",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this formatter.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for {@code Date} formatting. \u003c/p\u003e\n     *\n     * @return the time zone\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getLocale()",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\n     * \u003cp\u003eGets the locale used by this formatter.\u003c/p\u003e\n     *\n     * @return the locale\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getMaxLengthEstimate()",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     *\n     * @return the maximum formatted length\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.equals(java.lang.Object)",
      "begin_line": 837,
      "end_line": 846,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return {@code true} if equal\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 52)",
        "(line 843,col 9)-(line 845,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.hashCode()",
      "begin_line": 853,
      "end_line": 856,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     *\n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.toString()",
      "begin_line": 863,
      "end_line": 866,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     *\n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.readObject(java.io.ObjectInputStream)",
      "begin_line": 878,
      "end_line": 881,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the\n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 31)",
        "(line 880,col 9)-(line 880,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 888,
      "end_line": 903,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Rule.estimateLength()",
      "begin_line": 894,
      "end_line": 894,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         *\n         * @return the estimated length\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 902,
      "end_line": 902,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 908,
      "end_line": 916,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 915,
      "end_line": 915,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param value the value to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 921,
      "end_line": 947,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 922,
      "end_line": 922,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 930,
      "end_line": 932,
      "comment": "\n         * Constructs a new instance of {@code CharacterLiteral}\n         * to hold the specified value.\n         *\n         * @param value the character literal\n         ",
      "child_ranges": [
        "(line 931,col 13)-(line 931,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.estimateLength()",
      "begin_line": 937,
      "end_line": 939,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 938,col 13)-(line 938,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 944,
      "end_line": 946,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 945,col 13)-(line 945,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 952,
      "end_line": 978,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 953,
      "end_line": 953,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\n         * Constructs a new instance of {@code StringLiteral}\n         * to hold the specified value.\n         *\n         * @param value the string literal\n         ",
      "child_ranges": [
        "(line 962,col 13)-(line 962,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.estimateLength()",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 969,col 13)-(line 969,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 975,
      "end_line": 977,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 976,col 13)-(line 976,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 983,
      "end_line": 1019,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 984,
      "end_line": 984,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 985,
      "end_line": 985,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.TextField(int, java.lang.String[])",
      "begin_line": 994,
      "end_line": 997,
      "comment": "\n         * Constructs an instance of {@code TextField}\n         * with the specified field and values.\n         *\n         * @param field the field\n         * @param values the field values\n         ",
      "child_ranges": [
        "(line 995,col 13)-(line 995,col 27)",
        "(line 996,col 13)-(line 996,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.estimateLength()",
      "begin_line": 1002,
      "end_line": 1011,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1003,col 13)-(line 1003,col 24)",
        "(line 1004,col 13)-(line 1009,col 13)",
        "(line 1010,col 13)-(line 1010,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1017,col 13)-(line 1017,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1024,
      "end_line": 1063,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1025,
      "end_line": 1025,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 1032,
      "end_line": 1034,
      "comment": "\n         * Constructs an instance of {@code UnpadedNumberField} with the specified field.\n         *\n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1033,col 13)-(line 1033,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.estimateLength()",
      "begin_line": 1039,
      "end_line": 1041,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1040,col 13)-(line 1040,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1046,
      "end_line": 1048,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1047,col 13)-(line 1047,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1053,
      "end_line": 1062,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1054,col 13)-(line 1061,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1068,
      "end_line": 1104,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1069,
      "end_line": 1069,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 1075,
      "end_line": 1077,
      "comment": "\n         * Constructs an instance of {@code UnpaddedMonthField}.\n         *\n         ",
      "child_ranges": [
        "(line 1076,col 13)-(line 1076,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.estimateLength()",
      "begin_line": 1082,
      "end_line": 1084,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1083,col 13)-(line 1083,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1089,
      "end_line": 1091,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1090,col 13)-(line 1090,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1096,
      "end_line": 1103,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1097,col 13)-(line 1102,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1109,
      "end_line": 1166,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1110,
      "end_line": 1110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 1111,
      "end_line": 1111,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 1119,
      "end_line": 1126,
      "comment": "\n         * Constructs an instance of {@code PaddedNumberField}.\n         *\n         * @param field the field\n         * @param size size of the output field\n         ",
      "child_ranges": [
        "(line 1120,col 13)-(line 1123,col 13)",
        "(line 1124,col 13)-(line 1124,col 27)",
        "(line 1125,col 13)-(line 1125,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.estimateLength()",
      "begin_line": 1131,
      "end_line": 1133,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1132,col 13)-(line 1132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1138,
      "end_line": 1140,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1139,col 13)-(line 1139,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1145,
      "end_line": 1165,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1146,col 13)-(line 1164,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1171,
      "end_line": 1208,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1172,
      "end_line": 1172,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 1179,
      "end_line": 1181,
      "comment": "\n         * Constructs an instance of {@code TwoDigitNumberField} with the specified field.\n         *\n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1180,col 13)-(line 1180,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.estimateLength()",
      "begin_line": 1186,
      "end_line": 1188,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1187,col 13)-(line 1187,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1193,
      "end_line": 1195,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1194,col 13)-(line 1194,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1200,
      "end_line": 1207,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1201,col 13)-(line 1206,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1213,
      "end_line": 1244,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1214,
      "end_line": 1214,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 1219,
      "end_line": 1221,
      "comment": "\n         * Constructs an instance of {@code TwoDigitYearField}.\n         ",
      "child_ranges": [
        "(line 1220,col 13)-(line 1220,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.estimateLength()",
      "begin_line": 1226,
      "end_line": 1228,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1227,col 13)-(line 1227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1233,
      "end_line": 1235,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1234,col 13)-(line 1234,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1240,
      "end_line": 1243,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1241,col 13)-(line 1241,col 52)",
        "(line 1242,col 13)-(line 1242,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1249,
      "end_line": 1280,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1250,
      "end_line": 1250,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 1255,
      "end_line": 1257,
      "comment": "\n         * Constructs an instance of {@code TwoDigitMonthField}.\n         ",
      "child_ranges": [
        "(line 1256,col 13)-(line 1256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.estimateLength()",
      "begin_line": 1262,
      "end_line": 1264,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1263,col 13)-(line 1263,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1269,
      "end_line": 1271,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1270,col 13)-(line 1270,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1276,
      "end_line": 1279,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1277,col 13)-(line 1277,col 52)",
        "(line 1278,col 13)-(line 1278,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1285,
      "end_line": 1322,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1286,
      "end_line": 1286,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.TwelveHourField(org.apache.commons.lang3.time.FastDateFormat.NumberRule)",
      "begin_line": 1294,
      "end_line": 1296,
      "comment": "\n         * Constructs an instance of {@code TwelveHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1295,col 13)-(line 1295,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.estimateLength()",
      "begin_line": 1301,
      "end_line": 1303,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1302,col 13)-(line 1302,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1308,
      "end_line": 1314,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1309,col 13)-(line 1309,col 52)",
        "(line 1310,col 13)-(line 1312,col 13)",
        "(line 1313,col 13)-(line 1313,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1319,
      "end_line": 1321,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1320,col 13)-(line 1320,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1327,
      "end_line": 1364,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1328,
      "end_line": 1328,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang3.time.FastDateFormat.NumberRule)",
      "begin_line": 1336,
      "end_line": 1338,
      "comment": "\n         * Constructs an instance of {@code TwentyFourHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1337,col 13)-(line 1337,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.estimateLength()",
      "begin_line": 1343,
      "end_line": 1345,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1344,col 13)-(line 1344,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1350,
      "end_line": 1356,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1351,col 13)-(line 1351,col 59)",
        "(line 1352,col 13)-(line 1354,col 13)",
        "(line 1355,col 13)-(line 1355,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1361,
      "end_line": 1363,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1362,col 13)-(line 1362,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1369,
      "end_line": 1405,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1370,
      "end_line": 1370,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1371,
      "end_line": 1371,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1372,
      "end_line": 1372,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, java.util.Locale, int)",
      "begin_line": 1381,
      "end_line": 1386,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNameRule} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param locale the locale\n         * @param style the style\n         ",
      "child_ranges": [
        "(line 1382,col 13)-(line 1382,col 33)",
        "(line 1384,col 13)-(line 1384,col 75)",
        "(line 1385,col 13)-(line 1385,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.estimateLength()",
      "begin_line": 1391,
      "end_line": 1393,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1392,col 13)-(line 1392,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1398,
      "end_line": 1404,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1399,col 13)-(line 1403,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1411,
      "end_line": 1458,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number {@code +/-HHMM}\n     * or {@code +/-HH:MM}.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1412,
      "end_line": 1412,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1413,
      "end_line": 1413,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1415,
      "end_line": 1415,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1422,
      "end_line": 1424,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNumberRule} with the specified properties.\n         *\n         * @param colon add colon between HH and MM in the output if {@code true}\n         ",
      "child_ranges": [
        "(line 1423,col 13)-(line 1423,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1429,
      "end_line": 1431,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1430,col 13)-(line 1430,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1436,
      "end_line": 1457,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1437,col 13)-(line 1437,col 96)",
        "(line 1439,col 13)-(line 1444,col 13)",
        "(line 1446,col 13)-(line 1446,col 50)",
        "(line 1447,col 13)-(line 1447,col 52)",
        "(line 1448,col 13)-(line 1448,col 52)",
        "(line 1450,col 13)-(line 1452,col 13)",
        "(line 1454,col 13)-(line 1454,col 60)",
        "(line 1455,col 13)-(line 1455,col 54)",
        "(line 1456,col 13)-(line 1456,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1464,
      "end_line": 1512,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1465,
      "end_line": 1465,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1466,
      "end_line": 1466,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1467,
      "end_line": 1467,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1477,
      "end_line": 1485,
      "comment": "\n         * Constructs an instance of {@code TimeZoneDisplayKey} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if {@code true}\n         * @param style the timezone style\n         * @param locale the timezone locale\n         ",
      "child_ranges": [
        "(line 1479,col 13)-(line 1479,col 33)",
        "(line 1480,col 13)-(line 1482,col 13)",
        "(line 1483,col 13)-(line 1483,col 27)",
        "(line 1484,col 13)-(line 1484,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1490,
      "end_line": 1493,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1492,col 13)-(line 1492,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1498,
      "end_line": 1511,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1500,col 13)-(line 1502,col 13)",
        "(line 1503,col 13)-(line 1509,col 13)",
        "(line 1510,col 13)-(line 1510,col 25)"
      ]
    }
  ]
}