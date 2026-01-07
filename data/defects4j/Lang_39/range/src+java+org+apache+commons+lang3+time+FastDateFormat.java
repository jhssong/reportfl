{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/time/FastDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 71,
      "end_line": 1756,
      "comment": "\n * \u003cp\u003eFastDateFormat is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n * \n * \u003cp\u003eThis class can be used as a direct replacement to\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, \u003ccode\u003e\u0027Z\u0027\u003c/code\u003e, to represent\n * time zones in RFC822 format (eg. \u003ccode\u003e+0800\u003c/code\u003e or \u003ccode\u003e-1100\u003c/code\u003e).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern \u003ccode\u003e\u0027ZZ\u0027\u003c/code\u003e has been made to represent\n * ISO8601 full format time zones (eg. \u003ccode\u003e+08:00\u003c/code\u003e or \u003ccode\u003e-11:00\u003c/code\u003e).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author TeaTrove project\n * @author Brian S O\u0027Neill\n * @author Sean Schofield\n * @author Gary Gregory\n * @author Nikolay Metchev\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cDefaultPattern"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " lazily initialised by getInstance()"
    },
    {
      "type": "field",
      "varNames": [
        "cInstanceCache"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateInstanceCache"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeInstanceCache"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateTimeInstanceCache"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Whether the time zone overrides any on Calendars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocaleForced"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Whether the locale overrides the default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @return a date/time formatter\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * time zone.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 212,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 83)",
        "(line 214,col 9)-(line 214,col 64)",
        "(line 215,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.Locale)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.TimeZone)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 280,
      "end_line": 305,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 44)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 36)",
        "(line 292,col 9)-(line 292,col 60)",
        "(line 293,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.Locale)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 365,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 44)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 60)",
        "(line 375,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int)",
      "begin_line": 405,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style\n     * in the default time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.Locale)",
      "begin_line": 422,
      "end_line": 425,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone)",
      "begin_line": 440,
      "end_line": 443,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 457,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 86)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 36)",
        "(line 469,col 9)-(line 469,col 64)",
        "(line 470,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 496,
      "end_line": 505,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     * \n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use \u003ccode\u003eTimeZone.LONG\u003c/code\u003e\n     *  or \u003ccode\u003eTimeZone.SHORT\u003c/code\u003e\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 73)",
        "(line 498,col 9)-(line 498,col 54)",
        "(line 499,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDefaultPattern()",
      "begin_line": 512,
      "end_line": 517,
      "comment": "\n     * \u003cp\u003eGets the default pattern.\u003c/p\u003e\n     * \n     * @return the default pattern\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.FastDateFormat(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 534,
      "end_line": 552,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateFormat.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  time zone to use, \u003ccode\u003enull\u003c/code\u003e means use\n     *  default for \u003ccode\u003eDate\u003c/code\u003e and value within for\n     *  \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param locale  locale, \u003ccode\u003enull\u003c/code\u003e means use system\n     *  default\n     * @throws IllegalArgumentException if pattern is invalid or\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 16)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 27)",
        "(line 541,col 9)-(line 541,col 45)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 29)",
        "(line 547,col 9)-(line 547,col 41)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.init()",
      "begin_line": 557,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 46)",
        "(line 559,col 9)-(line 559,col 63)",
        "(line 561,col 9)-(line 561,col 20)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 566,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parsePattern()",
      "begin_line": 577,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     * \n     * @return a \u003ccode\u003eList\u003c/code\u003e of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 67)",
        "(line 579,col 9)-(line 579,col 49)",
        "(line 581,col 9)-(line 581,col 42)",
        "(line 582,col 9)-(line 582,col 46)",
        "(line 583,col 9)-(line 583,col 56)",
        "(line 584,col 9)-(line 584,col 50)",
        "(line 585,col 9)-(line 585,col 60)",
        "(line 586,col 9)-(line 586,col 56)",
        "(line 588,col 9)-(line 588,col 39)",
        "(line 589,col 9)-(line 589,col 36)",
        "(line 591,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 697,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parseToken(java.lang.String, int[])",
      "begin_line": 707,
      "end_line": 757,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     * \n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 48)",
        "(line 710,col 9)-(line 710,col 28)",
        "(line 711,col 9)-(line 711,col 38)",
        "(line 713,col 9)-(line 713,col 35)",
        "(line 714,col 9)-(line 753,col 9)",
        "(line 755,col 9)-(line 755,col 24)",
        "(line 756,col 9)-(line 756,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.selectNumberRule(int, int)",
      "begin_line": 766,
      "end_line": 775,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     * \n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 774,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 788,
      "end_line": 800,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e, \u003ccode\u003eCalendar\u003c/code\u003e or\n     * \u003ccode\u003eLong\u003c/code\u003e (milliseconds) object.\u003c/p\u003e\n     * \n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 799,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(long)",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eFormats a millisecond \u003ccode\u003elong\u003c/code\u003e value.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Date)",
      "begin_line": 819,
      "end_line": 823,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 54)",
        "(line 821,col 9)-(line 821,col 24)",
        "(line 822,col 9)-(line 822,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Calendar)",
      "begin_line": 831,
      "end_line": 833,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(long, java.lang.StringBuffer)",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * \u003cp\u003eFormats a milliseond \u003ccode\u003elong\u003c/code\u003e value into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 856,
      "end_line": 860,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 54)",
        "(line 858,col 9)-(line 858,col 24)",
        "(line 859,col 9)-(line 859,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 870,
      "end_line": 876,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 874,col 9)",
        "(line 875,col 9)-(line 875,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 886,
      "end_line": 893,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 30)",
        "(line 888,col 9)-(line 888,col 32)",
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 892,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 904,
      "end_line": 909,
      "comment": "\n     * \u003cp\u003eParsing is not supported.\u003c/p\u003e\n     * \n     * @param source  the string to parse\n     * @param pos  the parsing position\n     * @return \u003ccode\u003enull\u003c/code\u003e as not supported\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 24)",
        "(line 907,col 9)-(line 907,col 29)",
        "(line 908,col 9)-(line 908,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getPattern()",
      "begin_line": 918,
      "end_line": 920,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this formatter.\u003c/p\u003e\n     * \n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZone()",
      "begin_line": 932,
      "end_line": 934,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this formatter.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for \u003ccode\u003eDate\u003c/code\u003e formatting.\n     * If a \u003ccode\u003eCalendar\u003c/code\u003e is passed in to be formatted, the\n     * time zone on that may be used depending on\n     * {@link #getTimeZoneOverridesCalendar()}.\u003c/p\u003e\n     * \n     * @return the time zone\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZoneOverridesCalendar()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the time zone of the\n     * calendar overrides the time zone of the formatter.\u003c/p\u003e\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if time zone of formatter\n     *  overridden for calendars\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getLocale()",
      "begin_line": 952,
      "end_line": 954,
      "comment": "\n     * \u003cp\u003eGets the locale used by this formatter.\u003c/p\u003e\n     * \n     * @return the locale\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getMaxLengthEstimate()",
      "begin_line": 965,
      "end_line": 967,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     * \n     * @return the maximum formatted length\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.equals(java.lang.Object)",
      "begin_line": 977,
      "end_line": 993,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 982,col 52)",
        "(line 983,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 992,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.hashCode()",
      "begin_line": 1000,
      "end_line": 1009,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     * \n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 22)",
        "(line 1003,col 9)-(line 1003,col 37)",
        "(line 1004,col 9)-(line 1004,col 38)",
        "(line 1005,col 9)-(line 1005,col 43)",
        "(line 1006,col 9)-(line 1006,col 36)",
        "(line 1007,col 9)-(line 1007,col 41)",
        "(line 1008,col 9)-(line 1008,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.toString()",
      "begin_line": 1016,
      "end_line": 1019,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     * \n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.readObject(java.io.ObjectInputStream)",
      "begin_line": 1031,
      "end_line": 1034,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the \n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 31)",
        "(line 1033,col 9)-(line 1033,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 1041,
      "end_line": 1056,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Rule.estimateLength()",
      "begin_line": 1047,
      "end_line": 1047,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         * \n         * @return the estimated length\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1055,
      "end_line": 1055,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         * \n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1061,
      "end_line": 1069,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1068,
      "end_line": 1068,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         * \n         * @param buffer the output buffer\n         * @param value the value to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1074,
      "end_line": 1100,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1075,
      "end_line": 1075,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 1083,
      "end_line": 1085,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eCharacterLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the character literal\n         ",
      "child_ranges": [
        "(line 1084,col 13)-(line 1084,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.estimateLength()",
      "begin_line": 1090,
      "end_line": 1092,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1091,col 13)-(line 1091,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1097,
      "end_line": 1099,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1098,col 13)-(line 1098,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1105,
      "end_line": 1131,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1106,
      "end_line": 1106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 1114,
      "end_line": 1116,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eStringLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the string literal\n         ",
      "child_ranges": [
        "(line 1115,col 13)-(line 1115,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.estimateLength()",
      "begin_line": 1121,
      "end_line": 1123,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1122,col 13)-(line 1122,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1128,
      "end_line": 1130,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1129,col 13)-(line 1129,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1136,
      "end_line": 1172,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1137,
      "end_line": 1137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 1138,
      "end_line": 1138,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.TextField(int, java.lang.String[])",
      "begin_line": 1147,
      "end_line": 1150,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTextField\u003c/code\u003e\n         * with the specified field and values.\n         * \n         * @param field the field\n         * @param values the field values\n         ",
      "child_ranges": [
        "(line 1148,col 13)-(line 1148,col 27)",
        "(line 1149,col 13)-(line 1149,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.estimateLength()",
      "begin_line": 1155,
      "end_line": 1164,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1156,col 13)-(line 1156,col 24)",
        "(line 1157,col 13)-(line 1162,col 13)",
        "(line 1163,col 13)-(line 1163,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1169,
      "end_line": 1171,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1170,col 13)-(line 1170,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1177,
      "end_line": 1216,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1178,
      "end_line": 1178,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 1185,
      "end_line": 1187,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpadedNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1186,col 13)-(line 1186,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.estimateLength()",
      "begin_line": 1192,
      "end_line": 1194,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1193,col 13)-(line 1193,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1199,
      "end_line": 1201,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1200,col 13)-(line 1200,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1206,
      "end_line": 1215,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1207,col 13)-(line 1214,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1221,
      "end_line": 1257,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1222,
      "end_line": 1222,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 1228,
      "end_line": 1230,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpaddedMonthField\u003c/code\u003e.\n         *\n         ",
      "child_ranges": [
        "(line 1229,col 13)-(line 1229,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.estimateLength()",
      "begin_line": 1235,
      "end_line": 1237,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1236,col 13)-(line 1236,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1242,
      "end_line": 1244,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1243,col 13)-(line 1243,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1249,
      "end_line": 1256,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1250,col 13)-(line 1255,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1262,
      "end_line": 1319,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1263,
      "end_line": 1263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 1264,
      "end_line": 1264,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 1272,
      "end_line": 1279,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePaddedNumberField\u003c/code\u003e.\n         * \n         * @param field the field\n         * @param size size of the output field\n         ",
      "child_ranges": [
        "(line 1273,col 13)-(line 1276,col 13)",
        "(line 1277,col 13)-(line 1277,col 27)",
        "(line 1278,col 13)-(line 1278,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.estimateLength()",
      "begin_line": 1284,
      "end_line": 1286,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1285,col 13)-(line 1285,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1291,
      "end_line": 1293,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1292,col 13)-(line 1292,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1298,
      "end_line": 1318,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1299,col 13)-(line 1317,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1324,
      "end_line": 1361,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1325,
      "end_line": 1325,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 1332,
      "end_line": 1334,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1333,col 13)-(line 1333,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.estimateLength()",
      "begin_line": 1339,
      "end_line": 1341,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1340,col 13)-(line 1340,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1346,
      "end_line": 1348,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1347,col 13)-(line 1347,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1353,
      "end_line": 1360,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1354,col 13)-(line 1359,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1366,
      "end_line": 1397,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1367,
      "end_line": 1367,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 1372,
      "end_line": 1374,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitYearField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1373,col 13)-(line 1373,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.estimateLength()",
      "begin_line": 1379,
      "end_line": 1381,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1380,col 13)-(line 1380,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1386,
      "end_line": 1388,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1387,col 13)-(line 1387,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1393,
      "end_line": 1396,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1394,col 13)-(line 1394,col 52)",
        "(line 1395,col 13)-(line 1395,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1402,
      "end_line": 1433,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1403,
      "end_line": 1403,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 1408,
      "end_line": 1410,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitMonthField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1409,col 13)-(line 1409,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.estimateLength()",
      "begin_line": 1415,
      "end_line": 1417,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1416,col 13)-(line 1416,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1422,
      "end_line": 1424,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1423,col 13)-(line 1423,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1429,
      "end_line": 1432,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1430,col 13)-(line 1430,col 52)",
        "(line 1431,col 13)-(line 1431,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1438,
      "end_line": 1475,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1439,
      "end_line": 1439,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.TwelveHourField(org.apache.commons.lang3.time.FastDateFormat.NumberRule)",
      "begin_line": 1447,
      "end_line": 1449,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwelveHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1448,col 13)-(line 1448,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.estimateLength()",
      "begin_line": 1454,
      "end_line": 1456,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1455,col 13)-(line 1455,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1461,
      "end_line": 1467,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1462,col 13)-(line 1462,col 52)",
        "(line 1463,col 13)-(line 1465,col 13)",
        "(line 1466,col 13)-(line 1466,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1472,
      "end_line": 1474,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1473,col 13)-(line 1473,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1480,
      "end_line": 1517,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1481,
      "end_line": 1481,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang3.time.FastDateFormat.NumberRule)",
      "begin_line": 1489,
      "end_line": 1491,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwentyFourHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1490,col 13)-(line 1490,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.estimateLength()",
      "begin_line": 1496,
      "end_line": 1498,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1497,col 13)-(line 1497,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1503,
      "end_line": 1509,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1504,col 13)-(line 1504,col 59)",
        "(line 1505,col 13)-(line 1507,col 13)",
        "(line 1508,col 13)-(line 1508,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1514,
      "end_line": 1516,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1515,col 13)-(line 1515,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1522,
      "end_line": 1585,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1523,
      "end_line": 1523,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 1524,
      "end_line": 1524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1525,
      "end_line": 1525,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1526,
      "end_line": 1526,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1527,
      "end_line": 1527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1528,
      "end_line": 1528,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, boolean, java.util.Locale, int)",
      "begin_line": 1538,
      "end_line": 1551,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNameRule\u003c/code\u003e with the specified properties.\n         * \n         * @param timeZone the time zone\n         * @param timeZoneForced if \u003ccode\u003etrue\u003c/code\u003e the time zone is forced into standard and daylight\n         * @param locale the locale\n         * @param style the style\n         ",
      "child_ranges": [
        "(line 1539,col 13)-(line 1539,col 33)",
        "(line 1540,col 13)-(line 1540,col 45)",
        "(line 1541,col 13)-(line 1541,col 29)",
        "(line 1542,col 13)-(line 1542,col 27)",
        "(line 1544,col 13)-(line 1550,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.estimateLength()",
      "begin_line": 1556,
      "end_line": 1564,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1557,col 13)-(line 1563,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1569,
      "end_line": 1584,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1570,col 13)-(line 1583,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1591,
      "end_line": 1638,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number \u003ccode\u003e+/-HHMM\u003c/code\u003e\n     * or \u003ccode\u003e+/-HH:MM\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1592,
      "end_line": 1592,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1593,
      "end_line": 1593,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1595,
      "end_line": 1595,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1602,
      "end_line": 1604,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNumberRule\u003c/code\u003e with the specified properties.\n         * \n         * @param colon add colon between HH and MM in the output if \u003ccode\u003etrue\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 1603,col 13)-(line 1603,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1609,
      "end_line": 1611,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1610,col 13)-(line 1610,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1616,
      "end_line": 1637,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1617,col 13)-(line 1617,col 96)",
        "(line 1619,col 13)-(line 1624,col 13)",
        "(line 1626,col 13)-(line 1626,col 50)",
        "(line 1627,col 13)-(line 1627,col 52)",
        "(line 1628,col 13)-(line 1628,col 52)",
        "(line 1630,col 13)-(line 1632,col 13)",
        "(line 1634,col 13)-(line 1634,col 60)",
        "(line 1635,col 13)-(line 1635,col 54)",
        "(line 1636,col 13)-(line 1636,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1644,
      "end_line": 1692,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1645,
      "end_line": 1645,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1646,
      "end_line": 1646,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1647,
      "end_line": 1647,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1657,
      "end_line": 1665,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneDisplayKey\u003c/code\u003e with the specified properties.\n         *  \n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if \u003ccode\u003etrue\u003c/code\u003e\n         * @param style the timezone style\n         * @param locale the timezone locale\n         ",
      "child_ranges": [
        "(line 1659,col 13)-(line 1659,col 33)",
        "(line 1660,col 13)-(line 1662,col 13)",
        "(line 1663,col 13)-(line 1663,col 27)",
        "(line 1664,col 13)-(line 1664,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1670,
      "end_line": 1673,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1672,col 13)-(line 1672,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1678,
      "end_line": 1691,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1680,col 13)-(line 1682,col 13)",
        "(line 1683,col 13)-(line 1689,col 13)",
        "(line 1690,col 13)-(line 1690,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1701,
      "end_line": 1754,
      "comment": "\n     * \u003cp\u003eHelper class for creating compound objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eOne use for this class is to create a hashtable key\n     * out of multiple objects.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mObj1"
      ],
      "begin_line": 1702,
      "end_line": 1702,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mObj2"
      ],
      "begin_line": 1703,
      "end_line": 1703,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Pair.Pair(java.lang.Object, java.lang.Object)",
      "begin_line": 1710,
      "end_line": 1713,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePair\u003c/code\u003e to hold the specified objects.\n         * @param obj1 one object in the pair\n         * @param obj2 second object in the pair\n         ",
      "child_ranges": [
        "(line 1711,col 13)-(line 1711,col 25)",
        "(line 1712,col 13)-(line 1712,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Pair.equals(java.lang.Object)",
      "begin_line": 1718,
      "end_line": 1735,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1720,col 13)-(line 1722,col 13)",
        "(line 1724,col 13)-(line 1726,col 13)",
        "(line 1728,col 13)-(line 1728,col 33)",
        "(line 1730,col 13)-(line 1734,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Pair.hashCode()",
      "begin_line": 1740,
      "end_line": 1745,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1742,col 13)-(line 1744,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Pair.toString()",
      "begin_line": 1750,
      "end_line": 1753,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1752,col 13)-(line 1752,col 51)"
      ]
    }
  ]
}