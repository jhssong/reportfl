{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/time/FastDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 68,
      "end_line": 1726,
      "comment": "\n * \u003cp\u003eFastDateFormat is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n * \n * \u003cp\u003eThis class can be used as a direct replacement to\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, \u003ccode\u003e\u0027Z\u0027\u003c/code\u003e, to represent\n * time zones in RFC822 format (eg. \u003ccode\u003e+0800\u003c/code\u003e or \u003ccode\u003e-1100\u003c/code\u003e).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern \u003ccode\u003e\u0027ZZ\u0027\u003c/code\u003e has been made to represent\n * ISO8601 full format time zones (eg. \u003ccode\u003e+08:00\u003c/code\u003e or \u003ccode\u003e-11:00\u003c/code\u003e).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * @author TeaTrove project\n * @author Brian S O\u0027Neill\n * @author Sean Schofield\n * @author Gary Gregory\n * @author Stephen Colebourne\n * @author Nikolay Metchev\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cDefaultPattern"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cInstanceCache"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateInstanceCache"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeInstanceCache"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateTimeInstanceCache"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Whether the time zone overrides any on Calendars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocaleForced"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Whether the locale overrides the default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @return a date/time formatter\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * time zone.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 201,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 83)",
        "(line 203,col 9)-(line 203,col 81)",
        "(line 204,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.Locale)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.TimeZone)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 269,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 40)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 77)",
        "(line 279,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.Locale)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 355,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 40)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 77)",
        "(line 365,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int)",
      "begin_line": 395,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style\n     * in the default time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.Locale)",
      "begin_line": 412,
      "end_line": 415,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone)",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 447,
      "end_line": 476,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 78)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 81)",
        "(line 459,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 489,
      "end_line": 498,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     * \n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use \u003ccode\u003eTimeZone.LONG\u003c/code\u003e\n     *  or \u003ccode\u003eTimeZone.SHORT\u003c/code\u003e\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 73)",
        "(line 491,col 9)-(line 491,col 63)",
        "(line 492,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getDefaultPattern()",
      "begin_line": 505,
      "end_line": 510,
      "comment": "\n     * \u003cp\u003eGets the default pattern.\u003c/p\u003e\n     * \n     * @return the default pattern\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.FastDateFormat(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 527,
      "end_line": 545,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateFormat.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  time zone to use, \u003ccode\u003enull\u003c/code\u003e means use\n     *  default for \u003ccode\u003eDate\u003c/code\u003e and value within for\n     *  \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param locale  locale, \u003ccode\u003enull\u003c/code\u003e means use system\n     *  default\n     * @throws IllegalArgumentException if pattern is invalid or\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 16)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 27)",
        "(line 534,col 9)-(line 534,col 45)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 29)",
        "(line 540,col 9)-(line 540,col 41)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.init()",
      "begin_line": 550,
      "end_line": 560,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 40)",
        "(line 552,col 9)-(line 552,col 72)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 559,col 9)-(line 559,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parsePattern()",
      "begin_line": 570,
      "end_line": 691,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     * \n     * @return a \u003ccode\u003eList\u003c/code\u003e of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 67)",
        "(line 572,col 9)-(line 572,col 37)",
        "(line 574,col 9)-(line 574,col 42)",
        "(line 575,col 9)-(line 575,col 46)",
        "(line 576,col 9)-(line 576,col 56)",
        "(line 577,col 9)-(line 577,col 50)",
        "(line 578,col 9)-(line 578,col 60)",
        "(line 579,col 9)-(line 579,col 56)",
        "(line 581,col 9)-(line 581,col 39)",
        "(line 582,col 9)-(line 582,col 36)",
        "(line 584,col 9)-(line 688,col 9)",
        "(line 690,col 9)-(line 690,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parseToken(java.lang.String, int[])",
      "begin_line": 700,
      "end_line": 750,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     * \n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 46)",
        "(line 703,col 9)-(line 703,col 28)",
        "(line 704,col 9)-(line 704,col 38)",
        "(line 706,col 9)-(line 706,col 35)",
        "(line 707,col 9)-(line 746,col 9)",
        "(line 748,col 9)-(line 748,col 24)",
        "(line 749,col 9)-(line 749,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.selectNumberRule(int, int)",
      "begin_line": 759,
      "end_line": 768,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     * \n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 767,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 781,
      "end_line": 792,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e, \u003ccode\u003eCalendar\u003c/code\u003e or\n     * \u003ccode\u003eLong\u003c/code\u003e (milliseconds) object.\u003c/p\u003e\n     * \n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(long)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\n     * \u003cp\u003eFormats a millisecond \u003ccode\u003elong\u003c/code\u003e value.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Date)",
      "begin_line": 811,
      "end_line": 815,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 54)",
        "(line 813,col 9)-(line 813,col 24)",
        "(line 814,col 9)-(line 814,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Calendar)",
      "begin_line": 823,
      "end_line": 825,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(long, java.lang.StringBuffer)",
      "begin_line": 836,
      "end_line": 838,
      "comment": "\n     * \u003cp\u003eFormats a milliseond \u003ccode\u003elong\u003c/code\u003e value into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 848,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 54)",
        "(line 850,col 9)-(line 850,col 24)",
        "(line 851,col 9)-(line 851,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 862,
      "end_line": 868,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 878,
      "end_line": 885,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 30)",
        "(line 880,col 9)-(line 880,col 32)",
        "(line 881,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 896,
      "end_line": 900,
      "comment": "\n     * \u003cp\u003eParsing is not supported.\u003c/p\u003e\n     * \n     * @param source  the string to parse\n     * @param pos  the parsing position\n     * @return \u003ccode\u003enull\u003c/code\u003e as not supported\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 24)",
        "(line 898,col 9)-(line 898,col 29)",
        "(line 899,col 9)-(line 899,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getPattern()",
      "begin_line": 909,
      "end_line": 911,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this formatter.\u003c/p\u003e\n     * \n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZone()",
      "begin_line": 923,
      "end_line": 925,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this formatter.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for \u003ccode\u003eDate\u003c/code\u003e formatting.\n     * If a \u003ccode\u003eCalendar\u003c/code\u003e is passed in to be formatted, the\n     * time zone on that may be used depending on\n     * {@link #getTimeZoneOverridesCalendar()}.\u003c/p\u003e\n     * \n     * @return the time zone\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getTimeZoneOverridesCalendar()",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the time zone of the\n     * calendar overrides the time zone of the formatter.\u003c/p\u003e\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if time zone of formatter\n     *  overridden for calendars\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getLocale()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003eGets the locale used by this formatter.\u003c/p\u003e\n     * \n     * @return the locale\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.getMaxLengthEstimate()",
      "begin_line": 956,
      "end_line": 958,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     * \n     * @return the maximum formatted length\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.equals(java.lang.Object)",
      "begin_line": 968,
      "end_line": 983,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 972,col 52)",
        "(line 973,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 982,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.hashCode()",
      "begin_line": 990,
      "end_line": 998,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     * \n     * @return a hashcode compatible with equals\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 22)",
        "(line 992,col 9)-(line 992,col 37)",
        "(line 993,col 9)-(line 993,col 38)",
        "(line 994,col 9)-(line 994,col 43)",
        "(line 995,col 9)-(line 995,col 36)",
        "(line 996,col 9)-(line 996,col 41)",
        "(line 997,col 9)-(line 997,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.toString()",
      "begin_line": 1005,
      "end_line": 1007,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     * \n     * @return a debugging string\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 1014,
      "end_line": 1029,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Rule.estimateLength()",
      "begin_line": 1020,
      "end_line": 1020,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         * \n         * @return the estimated length\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1028,
      "end_line": 1028,
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
      "begin_line": 1034,
      "end_line": 1042,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1041,
      "end_line": 1041,
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
      "begin_line": 1047,
      "end_line": 1073,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1048,
      "end_line": 1048,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eCharacterLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the character literal\n         ",
      "child_ranges": [
        "(line 1057,col 13)-(line 1057,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.estimateLength()",
      "begin_line": 1063,
      "end_line": 1065,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1064,col 13)-(line 1064,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1071,col 13)-(line 1071,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1078,
      "end_line": 1104,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1079,
      "end_line": 1079,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 1087,
      "end_line": 1089,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eStringLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the string literal\n         ",
      "child_ranges": [
        "(line 1088,col 13)-(line 1088,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.estimateLength()",
      "begin_line": 1094,
      "end_line": 1096,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1095,col 13)-(line 1095,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1101,
      "end_line": 1103,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1102,col 13)-(line 1102,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1109,
      "end_line": 1145,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
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
        "mValues"
      ],
      "begin_line": 1111,
      "end_line": 1111,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.TextField(int, java.lang.String[])",
      "begin_line": 1120,
      "end_line": 1123,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTextField\u003c/code\u003e\n         * with the specified field and values.\n         * \n         * @param field the field\n         * @param values the field values\n         ",
      "child_ranges": [
        "(line 1121,col 13)-(line 1121,col 27)",
        "(line 1122,col 13)-(line 1122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.estimateLength()",
      "begin_line": 1128,
      "end_line": 1137,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1129,col 13)-(line 1129,col 24)",
        "(line 1130,col 13)-(line 1135,col 13)",
        "(line 1136,col 13)-(line 1136,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1142,
      "end_line": 1144,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1143,col 13)-(line 1143,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1150,
      "end_line": 1191,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_YEAR"
      ],
      "begin_line": 1151,
      "end_line": 1151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1153,
      "end_line": 1153,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 1160,
      "end_line": 1162,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpadedNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1161,col 13)-(line 1161,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.estimateLength()",
      "begin_line": 1167,
      "end_line": 1169,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1168,col 13)-(line 1168,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1174,
      "end_line": 1176,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1175,col 13)-(line 1175,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1181,
      "end_line": 1190,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1182,col 13)-(line 1189,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1196,
      "end_line": 1232,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1197,
      "end_line": 1197,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 1203,
      "end_line": 1205,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpaddedMonthField\u003c/code\u003e.\n         *\n         ",
      "child_ranges": [
        "(line 1204,col 13)-(line 1204,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.estimateLength()",
      "begin_line": 1210,
      "end_line": 1212,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1211,col 13)-(line 1211,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1217,
      "end_line": 1219,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1218,col 13)-(line 1218,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1224,
      "end_line": 1231,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1225,col 13)-(line 1230,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1237,
      "end_line": 1294,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1238,
      "end_line": 1238,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 1239,
      "end_line": 1239,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 1247,
      "end_line": 1254,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePaddedNumberField\u003c/code\u003e.\n         * \n         * @param field the field\n         * @param size size of the output field\n         ",
      "child_ranges": [
        "(line 1248,col 13)-(line 1251,col 13)",
        "(line 1252,col 13)-(line 1252,col 27)",
        "(line 1253,col 13)-(line 1253,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.estimateLength()",
      "begin_line": 1259,
      "end_line": 1261,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1260,col 13)-(line 1260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1266,
      "end_line": 1268,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1267,col 13)-(line 1267,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1273,
      "end_line": 1293,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1274,col 13)-(line 1292,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1299,
      "end_line": 1336,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1300,
      "end_line": 1300,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 1307,
      "end_line": 1309,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         ",
      "child_ranges": [
        "(line 1308,col 13)-(line 1308,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.estimateLength()",
      "begin_line": 1314,
      "end_line": 1316,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1315,col 13)-(line 1315,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1321,
      "end_line": 1323,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1322,col 13)-(line 1322,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1328,
      "end_line": 1335,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1329,col 13)-(line 1334,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1341,
      "end_line": 1372,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1342,
      "end_line": 1342,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 1347,
      "end_line": 1349,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitYearField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1348,col 13)-(line 1348,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.estimateLength()",
      "begin_line": 1354,
      "end_line": 1356,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1355,col 13)-(line 1355,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1361,
      "end_line": 1363,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1362,col 13)-(line 1362,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1368,
      "end_line": 1371,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1369,col 13)-(line 1369,col 52)",
        "(line 1370,col 13)-(line 1370,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1377,
      "end_line": 1408,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1378,
      "end_line": 1378,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 1383,
      "end_line": 1385,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitMonthField\u003c/code\u003e.\n         ",
      "child_ranges": [
        "(line 1384,col 13)-(line 1384,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.estimateLength()",
      "begin_line": 1390,
      "end_line": 1392,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1391,col 13)-(line 1391,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1397,
      "end_line": 1399,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1398,col 13)-(line 1398,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1404,
      "end_line": 1407,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1405,col 13)-(line 1405,col 52)",
        "(line 1406,col 13)-(line 1406,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1413,
      "end_line": 1450,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1414,
      "end_line": 1414,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.TwelveHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule)",
      "begin_line": 1422,
      "end_line": 1424,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwelveHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1423,col 13)-(line 1423,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.estimateLength()",
      "begin_line": 1429,
      "end_line": 1431,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1430,col 13)-(line 1430,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1436,
      "end_line": 1442,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1437,col 13)-(line 1437,col 52)",
        "(line 1438,col 13)-(line 1440,col 13)",
        "(line 1441,col 13)-(line 1441,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1447,
      "end_line": 1449,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1448,col 13)-(line 1448,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1455,
      "end_line": 1492,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1456,
      "end_line": 1456,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang.time.FastDateFormat.NumberRule)",
      "begin_line": 1464,
      "end_line": 1466,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwentyFourHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         ",
      "child_ranges": [
        "(line 1465,col 13)-(line 1465,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.estimateLength()",
      "begin_line": 1471,
      "end_line": 1473,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1472,col 13)-(line 1472,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1478,
      "end_line": 1484,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1479,col 13)-(line 1479,col 59)",
        "(line 1480,col 13)-(line 1482,col 13)",
        "(line 1483,col 13)-(line 1483,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1489,
      "end_line": 1491,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1490,col 13)-(line 1490,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1497,
      "end_line": 1560,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1498,
      "end_line": 1498,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 1499,
      "end_line": 1499,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1500,
      "end_line": 1500,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1501,
      "end_line": 1501,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1502,
      "end_line": 1502,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1503,
      "end_line": 1503,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, boolean, java.util.Locale, int)",
      "begin_line": 1513,
      "end_line": 1526,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNameRule\u003c/code\u003e with the specified properties.\n         * \n         * @param timeZone the time zone\n         * @param timeZoneForced if \u003ccode\u003etrue\u003c/code\u003e the time zone is forced into standard and daylight\n         * @param locale the locale\n         * @param style the style\n         ",
      "child_ranges": [
        "(line 1514,col 13)-(line 1514,col 33)",
        "(line 1515,col 13)-(line 1515,col 45)",
        "(line 1516,col 13)-(line 1516,col 29)",
        "(line 1517,col 13)-(line 1517,col 27)",
        "(line 1519,col 13)-(line 1525,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.estimateLength()",
      "begin_line": 1531,
      "end_line": 1539,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1532,col 13)-(line 1538,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1544,
      "end_line": 1559,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1545,col 13)-(line 1558,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.time.FastDateFormat.Rule"
      ],
      "begin_line": 1566,
      "end_line": 1613,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number \u003ccode\u003e+/-HHMM\u003c/code\u003e\n     * or \u003ccode\u003e+/-HH:MM\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1567,
      "end_line": 1567,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1568,
      "end_line": 1568,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1570,
      "end_line": 1570,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1577,
      "end_line": 1579,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNumberRule\u003c/code\u003e with the specified properties.\n         * \n         * @param colon add colon between HH and MM in the output if \u003ccode\u003etrue\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 1578,col 13)-(line 1578,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1584,
      "end_line": 1586,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1585,col 13)-(line 1585,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1591,
      "end_line": 1612,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1592,col 13)-(line 1592,col 96)",
        "(line 1594,col 13)-(line 1599,col 13)",
        "(line 1601,col 13)-(line 1601,col 50)",
        "(line 1602,col 13)-(line 1602,col 52)",
        "(line 1603,col 13)-(line 1603,col 52)",
        "(line 1605,col 13)-(line 1607,col 13)",
        "(line 1609,col 13)-(line 1609,col 60)",
        "(line 1610,col 13)-(line 1610,col 54)",
        "(line 1611,col 13)-(line 1611,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1619,
      "end_line": 1665,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1620,
      "end_line": 1620,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1621,
      "end_line": 1621,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1622,
      "end_line": 1622,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1632,
      "end_line": 1640,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneDisplayKey\u003c/code\u003e with the specified properties.\n         *  \n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if \u003ccode\u003etrue\u003c/code\u003e\n         * @param style the timezone style\n         * @param locale the timezone locale\n         ",
      "child_ranges": [
        "(line 1634,col 13)-(line 1634,col 33)",
        "(line 1635,col 13)-(line 1637,col 13)",
        "(line 1638,col 13)-(line 1638,col 27)",
        "(line 1639,col 13)-(line 1639,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1645,
      "end_line": 1647,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1646,col 13)-(line 1646,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1652,
      "end_line": 1664,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1653,col 13)-(line 1655,col 13)",
        "(line 1656,col 13)-(line 1662,col 13)",
        "(line 1663,col 13)-(line 1663,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1674,
      "end_line": 1724,
      "comment": "\n     * \u003cp\u003eHelper class for creating compound objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eOne use for this class is to create a hashtable key\n     * out of multiple objects.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mObj1"
      ],
      "begin_line": 1675,
      "end_line": 1675,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mObj2"
      ],
      "begin_line": 1676,
      "end_line": 1676,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.Pair(java.lang.Object, java.lang.Object)",
      "begin_line": 1683,
      "end_line": 1686,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePair\u003c/code\u003e to hold the specified objects.\n         * @param obj1 one object in the pair\n         * @param obj2 second object in the pair\n         ",
      "child_ranges": [
        "(line 1684,col 13)-(line 1684,col 25)",
        "(line 1685,col 13)-(line 1685,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.equals(java.lang.Object)",
      "begin_line": 1691,
      "end_line": 1707,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1692,col 13)-(line 1694,col 13)",
        "(line 1696,col 13)-(line 1698,col 13)",
        "(line 1700,col 13)-(line 1700,col 33)",
        "(line 1702,col 13)-(line 1706,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.hashCode()",
      "begin_line": 1712,
      "end_line": 1716,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1713,col 13)-(line 1715,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.FastDateFormat.Pair.toString()",
      "begin_line": 1721,
      "end_line": 1723,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 1722,col 13)-(line 1722,col 51)"
      ]
    }
  ]
}