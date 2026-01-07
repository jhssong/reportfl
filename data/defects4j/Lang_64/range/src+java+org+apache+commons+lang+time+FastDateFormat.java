{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/time/FastDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 68,
      "end_line": 1733,
      "comment": "\n * \u003cp\u003eFastDateFormat is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n * \n * \u003cp\u003eThis class can be used as a direct replacement to\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, \u003ccode\u003e\u0027Z\u0027\u003c/code\u003e, to represent\n * time zones in RFC822 format (eg. \u003ccode\u003e+0800\u003c/code\u003e or \u003ccode\u003e-1100\u003c/code\u003e).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern \u003ccode\u003e\u0027ZZ\u0027\u003c/code\u003e has been made to represent\n * ISO8601 full format time zones (eg. \u003ccode\u003e+08:00\u003c/code\u003e or \u003ccode\u003e-11:00\u003c/code\u003e).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * @author TeaTrove project\n * @author Brian S O\u0027Neill\n * @author Sean Schofield\n * @author Gary Gregory\n * @author Stephen Colebourne\n * @author Nikolay Metchev\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cDefaultPattern"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cInstanceCache"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateInstanceCache"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeInstanceCache"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateTimeInstanceCache"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Whether the time zone overrides any on Calendars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocaleForced"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Whether the locale overrides the default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @return a date/time formatter\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * time zone.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 208,
      "end_line": 217,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 83)",
        "(line 210,col 9)-(line 210,col 81)",
        "(line 211,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.Locale)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.TimeZone)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 276,
      "end_line": 302,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 40)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 77)",
        "(line 286,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.Locale)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 362,
      "end_line": 388,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 40)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 77)",
        "(line 372,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style\n     * in the default time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.Locale)",
      "begin_line": 419,
      "end_line": 422,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone)",
      "begin_line": 437,
      "end_line": 440,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 454,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 78)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 465,col 81)",
        "(line 466,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 496,
      "end_line": 505,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     * \n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use \u003ccode\u003eTimeZone.LONG\u003c/code\u003e\n     *  or \u003ccode\u003eTimeZone.SHORT\u003c/code\u003e\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 73)",
        "(line 498,col 9)-(line 498,col 63)",
        "(line 499,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDefaultPattern()",
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
      "signature": "org.apache.commons.lang.time.FastDateFormat.FastDateFormat(java.lang.String, java.util.TimeZone, java.util.Locale)",
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
      "signature": "org.apache.commons.lang.time.FastDateFormat.init()",
      "begin_line": 557,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 40)",
        "(line 559,col 9)-(line 559,col 72)",
        "(line 561,col 9)-(line 561,col 20)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 566,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parsePattern()",
      "begin_line": 577,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     * \n     * @return a \u003ccode\u003eList\u003c/code\u003e of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 67)",
        "(line 579,col 9)-(line 579,col 37)",
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
      "signature": "org.apache.commons.lang.time.FastDateFormat.parseToken(java.lang.String, int[])",
      "begin_line": 707,
      "end_line": 757,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     * \n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 46)",
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
      "signature": "org.apache.commons.lang.time.FastDateFormat.selectNumberRule(int, int)",
      "begin_line": 766,
      "end_line": 775,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     * \n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 774,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 788,
      "end_line": 799,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e, \u003ccode\u003eCalendar\u003c/code\u003e or\n     * \u003ccode\u003eLong\u003c/code\u003e (milliseconds) object.\u003c/p\u003e\n     * \n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 798,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(long)",
      "begin_line": 808,
      "end_line": 810,
      "comment": "\n     * \u003cp\u003eFormats a millisecond \u003ccode\u003elong\u003c/code\u003e value.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Date)",
      "begin_line": 818,
      "end_line": 822,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 54)",
        "(line 820,col 9)-(line 820,col 24)",
        "(line 821,col 9)-(line 821,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Calendar)",
      "begin_line": 830,
      "end_line": 832,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(long, java.lang.StringBuffer)",
      "begin_line": 843,
      "end_line": 845,
      "comment": "\n     * \u003cp\u003eFormats a milliseond \u003ccode\u003elong\u003c/code\u003e value into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 855,
      "end_line": 859,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 54)",
        "(line 857,col 9)-(line 857,col 24)",
        "(line 858,col 9)-(line 858,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 869,
      "end_line": 875,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 885,
      "end_line": 892,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 30)",
        "(line 887,col 9)-(line 887,col 32)",
        "(line 888,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 891,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 903,
      "end_line": 907,
      "comment": "\n     * \u003cp\u003eParsing is not supported.\u003c/p\u003e\n     * \n     * @param source  the string to parse\n     * @param pos  the parsing position\n     * @return \u003ccode\u003enull\u003c/code\u003e as not supported\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 24)",
        "(line 905,col 9)-(line 905,col 29)",
        "(line 906,col 9)-(line 906,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getPattern()",
      "begin_line": 916,
      "end_line": 918,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this formatter.\u003c/p\u003e\n     * \n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZone()",
      "begin_line": 930,
      "end_line": 932,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this formatter.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for \u003ccode\u003eDate\u003c/code\u003e formatting.\n     * If a \u003ccode\u003eCalendar\u003c/code\u003e is passed in to be formatted, the\n     * time zone on that may be used depending on\n     * {@link #getTimeZoneOverridesCalendar()}.\u003c/p\u003e\n     * \n     * @return the time zone\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZoneOverridesCalendar()",
      "begin_line": 941,
      "end_line": 943,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the time zone of the\n     * calendar overrides the time zone of the formatter.\u003c/p\u003e\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if time zone of formatter\n     *  overridden for calendars\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getLocale()",
      "begin_line": 950,
      "end_line": 952,
      "comment": "\n     * \u003cp\u003eGets the locale used by this formatter.\u003c/p\u003e\n     * \n     * @return the locale\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getMaxLengthEstimate()",
      "begin_line": 963,
      "end_line": 965,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     * \n     * @return the maximum formatted length\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.equals(java.lang.Object)",
      "begin_line": 975,
      "end_line": 990,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 979,col 52)",
        "(line 980,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.hashCode()",
      "begin_line": 997,
      "end_line": 1005,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     * \n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 22)",
        "(line 999,col 9)-(line 999,col 37)",
        "(line 1000,col 9)-(line 1000,col 38)",
        "(line 1001,col 9)-(line 1001,col 43)",
        "(line 1002,col 9)-(line 1002,col 36)",
        "(line 1003,col 9)-(line 1003,col 41)",
        "(line 1004,col 9)-(line 1004,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.toString()",
      "begin_line": 1012,
      "end_line": 1014,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     * \n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 1021,
      "end_line": 1036,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Rule.estimateLength()",
      "begin_line": 1027,
      "end_line": 1027,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         * \n         * @return the estimated length\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1035,
      "end_line": 1035,
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
      "begin_line": 1041,
      "end_line": 1049,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1048,
      "end_line": 1048,
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
      "begin_line": 1054,
      "end_line": 1080,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1055,
      "end_line": 1055,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 1063,
      "end_line": 1065,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eCharacterLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the character literal\n         ",
      "child_ranges": [
        "(line 1064,col 13)-(line 1064,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.estimateLength()",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1071,col 13)-(line 1071,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1078,col 13)-(line 1078,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1085,
      "end_line": 1111,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1086,
      "end_line": 1086,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 1094,
      "end_line": 1096,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eStringLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the string literal\n         ",
      "child_ranges": [
        "(line 1095,col 13)-(line 1095,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.estimateLength()",
      "begin_line": 1101,
      "end_line": 1103,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1102,col 13)-(line 1102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1108,
      "end_line": 1110,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1109,col 13)-(line 1109,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1116,
      "end_line": 1152,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1117,
      "end_line": 1117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 1118,
      "end_line": 1118,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.TextField(int, java.lang.String[])",
      "begin_line": 1127,
      "end_line": 1130,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTextField\u003c/code\u003e\n         * with the specified field and values.\n         * \n         * @param field the field\n         * @param values the field values\n         ",
      "child_ranges": [
        "(line 1128,col 13)-(line 1128,col 27)",
        "(line 1129,col 13)-(line 1129,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.estimateLength()",
      "begin_line": 1135,
      "end_line": 1144,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1136,col 13)-(line 1136,col 24)",
        "(line 1137,col 13)-(line 1142,col 13)",
        "(line 1143,col 13)-(line 1143,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1149,
      "end_line": 1151,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1150,col 13)-(line 1150,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1157,
      "end_line": 1198,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_YEAR"
      ],
      "begin_line": 1158,
      "end_line": 1158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1160,
      "end_line": 1160,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 1167,
      "end_line": 1169,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpadedNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1168,col 13)-(line 1168,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.estimateLength()",
      "begin_line": 1174,
      "end_line": 1176,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1175,col 13)-(line 1175,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1181,
      "end_line": 1183,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1182,col 13)-(line 1182,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1188,
      "end_line": 1197,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1189,col 13)-(line 1196,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1203,
      "end_line": 1239,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1204,
      "end_line": 1204,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 1210,
      "end_line": 1212,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpaddedMonthField\u003c/code\u003e.\n         *\n         ",
      "child_ranges": [
        "(line 1211,col 13)-(line 1211,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.estimateLength()",
      "begin_line": 1217,
      "end_line": 1219,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1218,col 13)-(line 1218,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1224,
      "end_line": 1226,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1225,col 13)-(line 1225,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1231,
      "end_line": 1238,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1232,col 13)-(line 1237,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1244,
      "end_line": 1301,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1245,
      "end_line": 1245,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 1246,
      "end_line": 1246,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 1254,
      "end_line": 1261,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePaddedNumberField\u003c/code\u003e.\n         * \n         * @param field the field\n         * @param size size of the output field\n         ",
      "child_ranges": [
        "(line 1255,col 13)-(line 1258,col 13)",
        "(line 1259,col 13)-(line 1259,col 27)",
        "(line 1260,col 13)-(line 1260,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.estimateLength()",
      "begin_line": 1266,
      "end_line": 1268,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1267,col 13)-(line 1267,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1273,
      "end_line": 1275,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1274,col 13)-(line 1274,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1280,
      "end_line": 1300,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1281,col 13)-(line 1299,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1306,
      "end_line": 1343,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1307,
      "end_line": 1307,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 1314,
      "end_line": 1316,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1315,col 13)-(line 1315,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.estimateLength()",
      "begin_line": 1321,
      "end_line": 1323,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1322,col 13)-(line 1322,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1328,
      "end_line": 1330,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1329,col 13)-(line 1329,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1335,
      "end_line": 1342,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1336,col 13)-(line 1341,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1348,
      "end_line": 1379,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1349,
      "end_line": 1349,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 1354,
      "end_line": 1356,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitYearField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1355,col 13)-(line 1355,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.estimateLength()",
      "begin_line": 1361,
      "end_line": 1363,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1362,col 13)-(line 1362,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1368,
      "end_line": 1370,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1369,col 13)-(line 1369,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1375,
      "end_line": 1378,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1376,col 13)-(line 1376,col 52)",
        "(line 1377,col 13)-(line 1377,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1384,
      "end_line": 1415,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1385,
      "end_line": 1385,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 1390,
      "end_line": 1392,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitMonthField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1391,col 13)-(line 1391,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.estimateLength()",
      "begin_line": 1397,
      "end_line": 1399,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1398,col 13)-(line 1398,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1404,
      "end_line": 1406,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1405,col 13)-(line 1405,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1411,
      "end_line": 1414,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1412,col 13)-(line 1412,col 52)",
        "(line 1413,col 13)-(line 1413,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1420,
      "end_line": 1457,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1421,
      "end_line": 1421,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.TwelveHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule)",
      "begin_line": 1429,
      "end_line": 1431,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwelveHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1430,col 13)-(line 1430,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.estimateLength()",
      "begin_line": 1436,
      "end_line": 1438,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1437,col 13)-(line 1437,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1443,
      "end_line": 1449,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1444,col 13)-(line 1444,col 52)",
        "(line 1445,col 13)-(line 1447,col 13)",
        "(line 1448,col 13)-(line 1448,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1454,
      "end_line": 1456,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1455,col 13)-(line 1455,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1462,
      "end_line": 1499,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1463,
      "end_line": 1463,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule)",
      "begin_line": 1471,
      "end_line": 1473,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwentyFourHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1472,col 13)-(line 1472,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.estimateLength()",
      "begin_line": 1478,
      "end_line": 1480,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1479,col 13)-(line 1479,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1485,
      "end_line": 1491,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1486,col 13)-(line 1486,col 59)",
        "(line 1487,col 13)-(line 1489,col 13)",
        "(line 1490,col 13)-(line 1490,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1496,
      "end_line": 1498,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1497,col 13)-(line 1497,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1504,
      "end_line": 1567,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1505,
      "end_line": 1505,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 1506,
      "end_line": 1506,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1507,
      "end_line": 1507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1508,
      "end_line": 1508,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1509,
      "end_line": 1509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1510,
      "end_line": 1510,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, boolean, java.util.Locale, int)",
      "begin_line": 1520,
      "end_line": 1533,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNameRule\u003c/code\u003e with the specified properties.\n         * \n         * @param timeZone the time zone\n         * @param timeZoneForced if \u003ccode\u003etrue\u003c/code\u003e the time zone is forced into standard and daylight\n         * @param locale the locale\n         * @param style the style\n         ",
      "child_ranges": [
        "(line 1521,col 13)-(line 1521,col 33)",
        "(line 1522,col 13)-(line 1522,col 45)",
        "(line 1523,col 13)-(line 1523,col 29)",
        "(line 1524,col 13)-(line 1524,col 27)",
        "(line 1526,col 13)-(line 1532,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.estimateLength()",
      "begin_line": 1538,
      "end_line": 1546,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1539,col 13)-(line 1545,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1551,
      "end_line": 1566,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1552,col 13)-(line 1565,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1573,
      "end_line": 1620,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number \u003ccode\u003e+/-HHMM\u003c/code\u003e\n     * or \u003ccode\u003e+/-HH:MM\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1574,
      "end_line": 1574,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1575,
      "end_line": 1575,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1577,
      "end_line": 1577,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1584,
      "end_line": 1586,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNumberRule\u003c/code\u003e with the specified properties.\n         * \n         * @param colon add colon between HH and MM in the output if \u003ccode\u003etrue\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 1585,col 13)-(line 1585,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1591,
      "end_line": 1593,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1592,col 13)-(line 1592,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1598,
      "end_line": 1619,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1599,col 13)-(line 1599,col 96)",
        "(line 1601,col 13)-(line 1606,col 13)",
        "(line 1608,col 13)-(line 1608,col 50)",
        "(line 1609,col 13)-(line 1609,col 52)",
        "(line 1610,col 13)-(line 1610,col 52)",
        "(line 1612,col 13)-(line 1614,col 13)",
        "(line 1616,col 13)-(line 1616,col 60)",
        "(line 1617,col 13)-(line 1617,col 54)",
        "(line 1618,col 13)-(line 1618,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1626,
      "end_line": 1672,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1627,
      "end_line": 1627,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1628,
      "end_line": 1628,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1629,
      "end_line": 1629,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1639,
      "end_line": 1647,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneDisplayKey\u003c/code\u003e with the specified properties.\n         *  \n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if \u003ccode\u003etrue\u003c/code\u003e\n         * @param style the timezone style\n         * @param locale the timezone locale\n         ",
      "child_ranges": [
        "(line 1641,col 13)-(line 1641,col 33)",
        "(line 1642,col 13)-(line 1644,col 13)",
        "(line 1645,col 13)-(line 1645,col 27)",
        "(line 1646,col 13)-(line 1646,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1652,
      "end_line": 1654,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1653,col 13)-(line 1653,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1659,
      "end_line": 1671,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1660,col 13)-(line 1662,col 13)",
        "(line 1663,col 13)-(line 1669,col 13)",
        "(line 1670,col 13)-(line 1670,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1681,
      "end_line": 1731,
      "comment": "\n     * \u003cp\u003eHelper class for creating compound objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eOne use for this class is to create a hashtable key\n     * out of multiple objects.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mObj1"
      ],
      "begin_line": 1682,
      "end_line": 1682,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mObj2"
      ],
      "begin_line": 1683,
      "end_line": 1683,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.Pair(java.lang.Object, java.lang.Object)",
      "begin_line": 1690,
      "end_line": 1693,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePair\u003c/code\u003e to hold the specified objects.\n         * @param obj1 one object in the pair\n         * @param obj2 second object in the pair\n         ",
      "child_ranges": [
        "(line 1691,col 13)-(line 1691,col 25)",
        "(line 1692,col 13)-(line 1692,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.equals(java.lang.Object)",
      "begin_line": 1698,
      "end_line": 1714,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1699,col 13)-(line 1701,col 13)",
        "(line 1703,col 13)-(line 1705,col 13)",
        "(line 1707,col 13)-(line 1707,col 33)",
        "(line 1709,col 13)-(line 1713,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.hashCode()",
      "begin_line": 1719,
      "end_line": 1723,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1720,col 13)-(line 1722,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.toString()",
      "begin_line": 1728,
      "end_line": 1730,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1729,col 13)-(line 1729,col 51)"
      ]
    }
  ]
}