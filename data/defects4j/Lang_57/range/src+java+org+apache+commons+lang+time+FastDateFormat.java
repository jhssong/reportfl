{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/time/FastDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 69,
      "end_line": 1734,
      "comment": "\n * \u003cp\u003eFastDateFormat is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n * \n * \u003cp\u003eThis class can be used as a direct replacement to\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, \u003ccode\u003e\u0027Z\u0027\u003c/code\u003e, to represent\n * time zones in RFC822 format (eg. \u003ccode\u003e+0800\u003c/code\u003e or \u003ccode\u003e-1100\u003c/code\u003e).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern \u003ccode\u003e\u0027ZZ\u0027\u003c/code\u003e has been made to represent\n * ISO8601 full format time zones (eg. \u003ccode\u003e+08:00\u003c/code\u003e or \u003ccode\u003e-11:00\u003c/code\u003e).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * @author TeaTrove project\n * @author Brian S O\u0027Neill\n * @author Sean Schofield\n * @author Gary Gregory\n * @author Stephen Colebourne\n * @author Nikolay Metchev\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cDefaultPattern"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cInstanceCache"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateInstanceCache"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeInstanceCache"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateTimeInstanceCache"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Whether the time zone overrides any on Calendars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocaleForced"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Whether the locale overrides the default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @return a date/time formatter\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * time zone.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 209,
      "end_line": 218,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 83)",
        "(line 211,col 9)-(line 211,col 81)",
        "(line 212,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.Locale)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.TimeZone)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 277,
      "end_line": 303,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 40)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 77)",
        "(line 287,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int)",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.Locale)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 363,
      "end_line": 389,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 40)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 77)",
        "(line 373,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int)",
      "begin_line": 403,
      "end_line": 406,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style\n     * in the default time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.Locale)",
      "begin_line": 420,
      "end_line": 423,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone)",
      "begin_line": 438,
      "end_line": 441,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 455,
      "end_line": 484,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 78)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 466,col 81)",
        "(line 467,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 497,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     * \n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use \u003ccode\u003eTimeZone.LONG\u003c/code\u003e\n     *  or \u003ccode\u003eTimeZone.SHORT\u003c/code\u003e\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 73)",
        "(line 499,col 9)-(line 499,col 63)",
        "(line 500,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDefaultPattern()",
      "begin_line": 513,
      "end_line": 518,
      "comment": "\n     * \u003cp\u003eGets the default pattern.\u003c/p\u003e\n     * \n     * @return the default pattern\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.FastDateFormat(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 535,
      "end_line": 553,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateFormat.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  time zone to use, \u003ccode\u003enull\u003c/code\u003e means use\n     *  default for \u003ccode\u003eDate\u003c/code\u003e and value within for\n     *  \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param locale  locale, \u003ccode\u003enull\u003c/code\u003e means use system\n     *  default\n     * @throws IllegalArgumentException if pattern is invalid or\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 16)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 27)",
        "(line 542,col 9)-(line 542,col 45)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 29)",
        "(line 548,col 9)-(line 548,col 41)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.init()",
      "begin_line": 558,
      "end_line": 568,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 40)",
        "(line 560,col 9)-(line 560,col 72)",
        "(line 562,col 9)-(line 562,col 20)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 567,col 9)-(line 567,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parsePattern()",
      "begin_line": 578,
      "end_line": 699,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     * \n     * @return a \u003ccode\u003eList\u003c/code\u003e of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 67)",
        "(line 580,col 9)-(line 580,col 37)",
        "(line 582,col 9)-(line 582,col 42)",
        "(line 583,col 9)-(line 583,col 46)",
        "(line 584,col 9)-(line 584,col 56)",
        "(line 585,col 9)-(line 585,col 50)",
        "(line 586,col 9)-(line 586,col 60)",
        "(line 587,col 9)-(line 587,col 56)",
        "(line 589,col 9)-(line 589,col 39)",
        "(line 590,col 9)-(line 590,col 36)",
        "(line 592,col 9)-(line 696,col 9)",
        "(line 698,col 9)-(line 698,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parseToken(java.lang.String, int[])",
      "begin_line": 708,
      "end_line": 758,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     * \n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 46)",
        "(line 711,col 9)-(line 711,col 28)",
        "(line 712,col 9)-(line 712,col 38)",
        "(line 714,col 9)-(line 714,col 35)",
        "(line 715,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 24)",
        "(line 757,col 9)-(line 757,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.selectNumberRule(int, int)",
      "begin_line": 767,
      "end_line": 776,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     * \n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 775,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 789,
      "end_line": 800,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e, \u003ccode\u003eCalendar\u003c/code\u003e or\n     * \u003ccode\u003eLong\u003c/code\u003e (milliseconds) object.\u003c/p\u003e\n     * \n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 799,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(long)",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eFormats a millisecond \u003ccode\u003elong\u003c/code\u003e value.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Date)",
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
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Calendar)",
      "begin_line": 831,
      "end_line": 833,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(long, java.lang.StringBuffer)",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * \u003cp\u003eFormats a milliseond \u003ccode\u003elong\u003c/code\u003e value into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Date, java.lang.StringBuffer)",
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
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Calendar, java.lang.StringBuffer)",
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
      "signature": "org.apache.commons.lang.time.FastDateFormat.applyRules(java.util.Calendar, java.lang.StringBuffer)",
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
      "signature": "org.apache.commons.lang.time.FastDateFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 904,
      "end_line": 908,
      "comment": "\n     * \u003cp\u003eParsing is not supported.\u003c/p\u003e\n     * \n     * @param source  the string to parse\n     * @param pos  the parsing position\n     * @return \u003ccode\u003enull\u003c/code\u003e as not supported\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 24)",
        "(line 906,col 9)-(line 906,col 29)",
        "(line 907,col 9)-(line 907,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getPattern()",
      "begin_line": 917,
      "end_line": 919,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this formatter.\u003c/p\u003e\n     * \n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZone()",
      "begin_line": 931,
      "end_line": 933,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this formatter.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for \u003ccode\u003eDate\u003c/code\u003e formatting.\n     * If a \u003ccode\u003eCalendar\u003c/code\u003e is passed in to be formatted, the\n     * time zone on that may be used depending on\n     * {@link #getTimeZoneOverridesCalendar()}.\u003c/p\u003e\n     * \n     * @return the time zone\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZoneOverridesCalendar()",
      "begin_line": 942,
      "end_line": 944,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the time zone of the\n     * calendar overrides the time zone of the formatter.\u003c/p\u003e\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if time zone of formatter\n     *  overridden for calendars\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getLocale()",
      "begin_line": 951,
      "end_line": 953,
      "comment": "\n     * \u003cp\u003eGets the locale used by this formatter.\u003c/p\u003e\n     * \n     * @return the locale\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getMaxLengthEstimate()",
      "begin_line": 964,
      "end_line": 966,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     * \n     * @return the maximum formatted length\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.equals(java.lang.Object)",
      "begin_line": 976,
      "end_line": 991,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 52)",
        "(line 981,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 990,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.hashCode()",
      "begin_line": 998,
      "end_line": 1006,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     * \n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 22)",
        "(line 1000,col 9)-(line 1000,col 37)",
        "(line 1001,col 9)-(line 1001,col 38)",
        "(line 1002,col 9)-(line 1002,col 43)",
        "(line 1003,col 9)-(line 1003,col 36)",
        "(line 1004,col 9)-(line 1004,col 41)",
        "(line 1005,col 9)-(line 1005,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.toString()",
      "begin_line": 1013,
      "end_line": 1015,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     * \n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 1022,
      "end_line": 1037,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Rule.estimateLength()",
      "begin_line": 1028,
      "end_line": 1028,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         * \n         * @return the estimated length\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1036,
      "end_line": 1036,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         * \n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1042,
      "end_line": 1050,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1049,
      "end_line": 1049,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         * \n         * @param buffer the output buffer\n         * @param value the value to be appended\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1055,
      "end_line": 1081,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1056,
      "end_line": 1056,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eCharacterLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the character literal\n         ",
      "child_ranges": [
        "(line 1065,col 13)-(line 1065,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.estimateLength()",
      "begin_line": 1071,
      "end_line": 1073,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1072,col 13)-(line 1072,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1078,
      "end_line": 1080,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1079,col 13)-(line 1079,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1086,
      "end_line": 1112,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1087,
      "end_line": 1087,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eStringLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the string literal\n         ",
      "child_ranges": [
        "(line 1096,col 13)-(line 1096,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.estimateLength()",
      "begin_line": 1102,
      "end_line": 1104,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1103,col 13)-(line 1103,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1109,
      "end_line": 1111,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1110,col 13)-(line 1110,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1117,
      "end_line": 1153,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1118,
      "end_line": 1118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 1119,
      "end_line": 1119,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.TextField(int, java.lang.String[])",
      "begin_line": 1128,
      "end_line": 1131,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTextField\u003c/code\u003e\n         * with the specified field and values.\n         * \n         * @param field the field\n         * @param values the field values\n         ",
      "child_ranges": [
        "(line 1129,col 13)-(line 1129,col 27)",
        "(line 1130,col 13)-(line 1130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.estimateLength()",
      "begin_line": 1136,
      "end_line": 1145,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1137,col 13)-(line 1137,col 24)",
        "(line 1138,col 13)-(line 1143,col 13)",
        "(line 1144,col 13)-(line 1144,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1150,
      "end_line": 1152,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1151,col 13)-(line 1151,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1158,
      "end_line": 1199,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_YEAR"
      ],
      "begin_line": 1159,
      "end_line": 1159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1161,
      "end_line": 1161,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 1168,
      "end_line": 1170,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpadedNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1169,col 13)-(line 1169,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.estimateLength()",
      "begin_line": 1175,
      "end_line": 1177,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1176,col 13)-(line 1176,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1182,
      "end_line": 1184,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1183,col 13)-(line 1183,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1189,
      "end_line": 1198,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1190,col 13)-(line 1197,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1204,
      "end_line": 1240,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1205,
      "end_line": 1205,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 1211,
      "end_line": 1213,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpaddedMonthField\u003c/code\u003e.\n         *\n         ",
      "child_ranges": [
        "(line 1212,col 13)-(line 1212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.estimateLength()",
      "begin_line": 1218,
      "end_line": 1220,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1219,col 13)-(line 1219,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1225,
      "end_line": 1227,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1226,col 13)-(line 1226,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1232,
      "end_line": 1239,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1233,col 13)-(line 1238,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1245,
      "end_line": 1302,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1246,
      "end_line": 1246,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 1247,
      "end_line": 1247,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 1255,
      "end_line": 1262,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePaddedNumberField\u003c/code\u003e.\n         * \n         * @param field the field\n         * @param size size of the output field\n         ",
      "child_ranges": [
        "(line 1256,col 13)-(line 1259,col 13)",
        "(line 1260,col 13)-(line 1260,col 27)",
        "(line 1261,col 13)-(line 1261,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.estimateLength()",
      "begin_line": 1267,
      "end_line": 1269,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1268,col 13)-(line 1268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1274,
      "end_line": 1276,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1275,col 13)-(line 1275,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1281,
      "end_line": 1301,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1282,col 13)-(line 1300,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1307,
      "end_line": 1344,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1308,
      "end_line": 1308,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 1315,
      "end_line": 1317,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1316,col 13)-(line 1316,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.estimateLength()",
      "begin_line": 1322,
      "end_line": 1324,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1323,col 13)-(line 1323,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1329,
      "end_line": 1331,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1330,col 13)-(line 1330,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1336,
      "end_line": 1343,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1337,col 13)-(line 1342,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1349,
      "end_line": 1380,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1350,
      "end_line": 1350,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 1355,
      "end_line": 1357,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitYearField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1356,col 13)-(line 1356,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.estimateLength()",
      "begin_line": 1362,
      "end_line": 1364,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1363,col 13)-(line 1363,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1369,
      "end_line": 1371,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1370,col 13)-(line 1370,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1376,
      "end_line": 1379,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1377,col 13)-(line 1377,col 52)",
        "(line 1378,col 13)-(line 1378,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1385,
      "end_line": 1416,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1386,
      "end_line": 1386,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 1391,
      "end_line": 1393,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitMonthField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1392,col 13)-(line 1392,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.estimateLength()",
      "begin_line": 1398,
      "end_line": 1400,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1399,col 13)-(line 1399,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1405,
      "end_line": 1407,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1406,col 13)-(line 1406,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1412,
      "end_line": 1415,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1413,col 13)-(line 1413,col 52)",
        "(line 1414,col 13)-(line 1414,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1421,
      "end_line": 1458,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1422,
      "end_line": 1422,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.TwelveHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule)",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwelveHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1431,col 13)-(line 1431,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.estimateLength()",
      "begin_line": 1437,
      "end_line": 1439,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1438,col 13)-(line 1438,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1444,
      "end_line": 1450,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1445,col 13)-(line 1445,col 52)",
        "(line 1446,col 13)-(line 1448,col 13)",
        "(line 1449,col 13)-(line 1449,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1455,
      "end_line": 1457,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1456,col 13)-(line 1456,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1463,
      "end_line": 1500,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1464,
      "end_line": 1464,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule)",
      "begin_line": 1472,
      "end_line": 1474,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwentyFourHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1473,col 13)-(line 1473,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.estimateLength()",
      "begin_line": 1479,
      "end_line": 1481,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1480,col 13)-(line 1480,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1486,
      "end_line": 1492,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1487,col 13)-(line 1487,col 59)",
        "(line 1488,col 13)-(line 1490,col 13)",
        "(line 1491,col 13)-(line 1491,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1497,
      "end_line": 1499,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1498,col 13)-(line 1498,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1505,
      "end_line": 1568,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1506,
      "end_line": 1506,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 1507,
      "end_line": 1507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1508,
      "end_line": 1508,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1509,
      "end_line": 1509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1510,
      "end_line": 1510,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1511,
      "end_line": 1511,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, boolean, java.util.Locale, int)",
      "begin_line": 1521,
      "end_line": 1534,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNameRule\u003c/code\u003e with the specified properties.\n         * \n         * @param timeZone the time zone\n         * @param timeZoneForced if \u003ccode\u003etrue\u003c/code\u003e the time zone is forced into standard and daylight\n         * @param locale the locale\n         * @param style the style\n         ",
      "child_ranges": [
        "(line 1522,col 13)-(line 1522,col 33)",
        "(line 1523,col 13)-(line 1523,col 45)",
        "(line 1524,col 13)-(line 1524,col 29)",
        "(line 1525,col 13)-(line 1525,col 27)",
        "(line 1527,col 13)-(line 1533,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.estimateLength()",
      "begin_line": 1539,
      "end_line": 1547,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1540,col 13)-(line 1546,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1552,
      "end_line": 1567,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1553,col 13)-(line 1566,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1574,
      "end_line": 1621,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number \u003ccode\u003e+/-HHMM\u003c/code\u003e\n     * or \u003ccode\u003e+/-HH:MM\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1575,
      "end_line": 1575,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1576,
      "end_line": 1576,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1578,
      "end_line": 1578,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1585,
      "end_line": 1587,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNumberRule\u003c/code\u003e with the specified properties.\n         * \n         * @param colon add colon between HH and MM in the output if \u003ccode\u003etrue\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 1586,col 13)-(line 1586,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1592,
      "end_line": 1594,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1593,col 13)-(line 1593,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1599,
      "end_line": 1620,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1600,col 13)-(line 1600,col 96)",
        "(line 1602,col 13)-(line 1607,col 13)",
        "(line 1609,col 13)-(line 1609,col 50)",
        "(line 1610,col 13)-(line 1610,col 52)",
        "(line 1611,col 13)-(line 1611,col 52)",
        "(line 1613,col 13)-(line 1615,col 13)",
        "(line 1617,col 13)-(line 1617,col 60)",
        "(line 1618,col 13)-(line 1618,col 54)",
        "(line 1619,col 13)-(line 1619,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1627,
      "end_line": 1673,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1628,
      "end_line": 1628,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1629,
      "end_line": 1629,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1630,
      "end_line": 1630,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1640,
      "end_line": 1648,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneDisplayKey\u003c/code\u003e with the specified properties.\n         *  \n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if \u003ccode\u003etrue\u003c/code\u003e\n         * @param style the timezone style\n         * @param locale the timezone locale\n         ",
      "child_ranges": [
        "(line 1642,col 13)-(line 1642,col 33)",
        "(line 1643,col 13)-(line 1645,col 13)",
        "(line 1646,col 13)-(line 1646,col 27)",
        "(line 1647,col 13)-(line 1647,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1653,
      "end_line": 1655,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1654,col 13)-(line 1654,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1660,
      "end_line": 1672,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1661,col 13)-(line 1663,col 13)",
        "(line 1664,col 13)-(line 1670,col 13)",
        "(line 1671,col 13)-(line 1671,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1682,
      "end_line": 1732,
      "comment": "\n     * \u003cp\u003eHelper class for creating compound objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eOne use for this class is to create a hashtable key\n     * out of multiple objects.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mObj1"
      ],
      "begin_line": 1683,
      "end_line": 1683,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mObj2"
      ],
      "begin_line": 1684,
      "end_line": 1684,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.Pair(java.lang.Object, java.lang.Object)",
      "begin_line": 1691,
      "end_line": 1694,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePair\u003c/code\u003e to hold the specified objects.\n         * @param obj1 one object in the pair\n         * @param obj2 second object in the pair\n         ",
      "child_ranges": [
        "(line 1692,col 13)-(line 1692,col 25)",
        "(line 1693,col 13)-(line 1693,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.equals(java.lang.Object)",
      "begin_line": 1699,
      "end_line": 1715,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1700,col 13)-(line 1702,col 13)",
        "(line 1704,col 13)-(line 1706,col 13)",
        "(line 1708,col 13)-(line 1708,col 33)",
        "(line 1710,col 13)-(line 1714,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.hashCode()",
      "begin_line": 1720,
      "end_line": 1724,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1721,col 13)-(line 1723,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.toString()",
      "begin_line": 1729,
      "end_line": 1731,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1730,col 13)-(line 1730,col 51)"
      ]
    }
  ]
}