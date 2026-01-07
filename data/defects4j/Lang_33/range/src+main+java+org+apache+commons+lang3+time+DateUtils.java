{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/time/DateUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 1777,
      "comment": "\n * \u003cp\u003eA suite of utilities surrounding the use of the\n * {@link java.util.Calendar} and {@link java.util.Date} object.\u003c/p\u003e\n * \n * \u003cp\u003eDateUtils contains a lot of common methods considering manipulations\n * of Dates or Calendars. Some methods require some extra explanation.\n * The truncate, ceiling and round methods could be considered the Math.floor(),\n * Math.ceil() or Math.round versions for dates\n * This way date-fields will be ignored in bottom-up order.\n * As a complement to these methods we\u0027ve introduced some fragment-methods.\n * With these methods the Date-fields will be ignored in top-down order.\n * Since a date without a year is not a valid date, you have to decide in what\n * kind of date-field you want your result, for instance milliseconds or days.\n * \u003c/p\u003e\n *   \n *   \n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author Janek Bogucki\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Phil Steitz\n * @author Robert Scholte\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UTC_TIME_ZONE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The UTC time zone  (often referred to as GMT).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Number of milliseconds in a standard second.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_MINUTE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Number of milliseconds in a standard minute.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_HOUR"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Number of milliseconds in a standard hour.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_DAY"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Number of milliseconds in a standard day.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEMI_MONTH"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * This is half a month, so this represents whether a date is in the top\n     * or bottom half of the month.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 87,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_SUNDAY"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * A week range, starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_MONDAY"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * A week range, starting on Monday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_RELATIVE"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * A week range, starting on the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_CENTER"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * A week range, centered around the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_SUNDAY"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * A month range, the week starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_MONDAY"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * A month range, the week starting on Monday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_TRUNCATE"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Constant marker for truncating \n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_ROUND"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Constant marker for rounding\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_CEILING"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Constant marker for ceiling\n     * @since 3.0\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateUtils()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eDateUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eDateUtils.parse(str);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Date, java.util.Date)",
      "begin_line": 174,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eChecks if two date objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 47)",
        "(line 179,col 9)-(line 179,col 28)",
        "(line 180,col 9)-(line 180,col 47)",
        "(line 181,col 9)-(line 181,col 28)",
        "(line 182,col 9)-(line 182,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Calendar, java.util.Calendar)",
      "begin_line": 198,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either calendar is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Date, java.util.Date)",
      "begin_line": 219,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eChecks if two date objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Calendar, java.util.Calendar)",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameLocalTime(java.util.Calendar, java.util.Calendar)",
      "begin_line": 257,
      "end_line": 269,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same local time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the values of the fields of the two objects.\n     * In addition, both calendars must be the same of the same type.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 268,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDate(java.lang.String, java.lang.String[])",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser will be lenient toward the parsed date.\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable (or there were none)\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateStrictly(java.lang.String, java.lang.String[])",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser parses strictly - it does not allow for dates such as \"February 942, 1996\". \n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(java.lang.String, java.lang.String[], boolean)",
      "begin_line": 324,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @param lenient Specify whether or not date/time parsing is to be lenient.\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     * @see java.util.Calender#isLenient()\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 330,col 57)",
        "(line 331,col 9)-(line 331,col 35)",
        "(line 332,col 9)-(line 332,col 49)",
        "(line 333,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addYears(java.util.Date, int)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * Adds a number of years to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMonths(java.util.Date, int)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Adds a number of months to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addWeeks(java.util.Date, int)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * Adds a number of weeks to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addDays(java.util.Date, int)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Adds a number of days to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addHours(java.util.Date, int)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Adds a number of hours to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMinutes(java.util.Date, int)",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n     * Adds a number of minutes to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addSeconds(java.util.Date, int)",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n     * Adds a number of seconds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMilliseconds(java.util.Date, int)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Adds a number of milliseconds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.add(java.util.Date, int, int)",
      "begin_line": 482,
      "end_line": 490,
      "comment": "\n     * Adds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to add to\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 44)",
        "(line 487,col 9)-(line 487,col 24)",
        "(line 488,col 9)-(line 488,col 37)",
        "(line 489,col 9)-(line 489,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setYears(java.util.Date, int)",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Sets the years field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMonths(java.util.Date, int)",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n     * Sets the months field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setDays(java.util.Date, int)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Sets the day of month field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setHours(java.util.Date, int)",
      "begin_line": 549,
      "end_line": 551,
      "comment": "\n     * Sets the hours field to a date returning a new object.  Hours range \n     * from  0-23.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMinutes(java.util.Date, int)",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\n     * Sets the minute field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setSeconds(java.util.Date, int)",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * Sets the seconds field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMilliseconds(java.util.Date, int)",
      "begin_line": 594,
      "end_line": 596,
      "comment": "\n     * Sets the miliseconds field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.set(java.util.Date, int, int)",
      "begin_line": 611,
      "end_line": 621,
      "comment": "\n     * Sets the specified field to a date returning a new object.  \n     * This does not use a lenient calendar.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to set the amount to\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 44)",
        "(line 617,col 9)-(line 617,col 28)",
        "(line 618,col 9)-(line 618,col 24)",
        "(line 619,col 9)-(line 619,col 37)",
        "(line 620,col 9)-(line 620,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.util.Date, int)",
      "begin_line": 652,
      "end_line": 660,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 47)",
        "(line 657,col 9)-(line 657,col 27)",
        "(line 658,col 9)-(line 658,col 42)",
        "(line 659,col 9)-(line 659,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.util.Calendar, int)",
      "begin_line": 690,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 51)",
        "(line 695,col 9)-(line 695,col 45)",
        "(line 696,col 9)-(line 696,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.lang.Object, int)",
      "begin_line": 729,
      "end_line": 740,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, either Date or Calendar\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 739,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.util.Date, int)",
      "begin_line": 759,
      "end_line": 767,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 47)",
        "(line 764,col 9)-(line 764,col 27)",
        "(line 765,col 9)-(line 765,col 45)",
        "(line 766,col 9)-(line 766,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.util.Calendar, int)",
      "begin_line": 785,
      "end_line": 792,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 53)",
        "(line 790,col 9)-(line 790,col 50)",
        "(line 791,col 9)-(line 791,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.lang.Object, int)",
      "begin_line": 814,
      "end_line": 825,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 824,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Date, int)",
      "begin_line": 844,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 47)",
        "(line 849,col 9)-(line 849,col 27)",
        "(line 850,col 9)-(line 850,col 44)",
        "(line 851,col 9)-(line 851,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Calendar, int)",
      "begin_line": 870,
      "end_line": 877,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 50)",
        "(line 875,col 9)-(line 875,col 46)",
        "(line 876,col 9)-(line 876,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.lang.Object, int)",
      "begin_line": 899,
      "end_line": 910,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 909,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.modify(java.util.Calendar, int, int)",
      "begin_line": 921,
      "end_line": 1057,
      "comment": "\n     * \u003cp\u003eInternal calculation method.\u003c/p\u003e\n     * \n     * @param val  the calendar\n     * @param field  the field constant\n     * @param modType  type to truncate, round or ceiling\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 924,col 9)",
        "(line 926,col 9)-(line 928,col 9)",
        "(line 936,col 9)-(line 936,col 34)",
        "(line 937,col 9)-(line 937,col 35)",
        "(line 938,col 9)-(line 938,col 29)",
        "(line 941,col 9)-(line 941,col 54)",
        "(line 942,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 947,col 9)",
        "(line 950,col 9)-(line 950,col 47)",
        "(line 951,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 956,col 9)",
        "(line 959,col 9)-(line 959,col 47)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 965,col 9)-(line 968,col 9)",
        "(line 971,col 9)-(line 971,col 32)",
        "(line 972,col 9)-(line 1054,col 9)",
        "(line 1055,col 9)-(line 1055,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.util.Date, int)",
      "begin_line": 1084,
      "end_line": 1091,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, not null\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator, which always returns Calendar instances\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1087,col 9)",
        "(line 1088,col 9)-(line 1088,col 47)",
        "(line 1089,col 9)-(line 1089,col 28)",
        "(line 1090,col 9)-(line 1090,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.util.Calendar, int)",
      "begin_line": 1117,
      "end_line": 1187,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1120,col 9)",
        "(line 1121,col 9)-(line 1121,col 30)",
        "(line 1122,col 9)-(line 1122,col 28)",
        "(line 1123,col 9)-(line 1123,col 42)",
        "(line 1124,col 9)-(line 1124,col 42)",
        "(line 1125,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1173,col 9)",
        "(line 1174,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1179,col 9)",
        "(line 1180,col 9)-(line 1182,col 9)",
        "(line 1183,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1186,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.lang.Object, int)",
      "begin_line": 1208,
      "end_line": 1219,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, either\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param rangeStyle  the style constant to use. Must be one of the range\n     * styles listed for the {@link #iterator(Calendar, int)} method.\n     * @return the date iterator\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is\n     *  not a \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1209,col 9)-(line 1211,col 9)",
        "(line 1212,col 9)-(line 1218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Date, int)",
      "begin_line": 1254,
      "end_line": 1256,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e\n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of milliseconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all milliseconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e\n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538 (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1255,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Date, int)",
      "begin_line": 1294,
      "end_line": 1296,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Date, int)",
      "begin_line": 1334,
      "end_line": 1336,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1335,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Date, int)",
      "begin_line": 1374,
      "end_line": 1376,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Date, int)",
      "begin_line": 1414,
      "end_line": 1416,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of days  within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1415,col 9)-(line 1415,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Calendar, int)",
      "begin_line": 1454,
      "end_line": 1456,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MILLISECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538\n     *   (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1455,col 5)-(line 1455,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Calendar, int)",
      "begin_line": 1493,
      "end_line": 1495,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1494,col 9)-(line 1494,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Calendar, int)",
      "begin_line": 1533,
      "end_line": 1535,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1534,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Calendar, int)",
      "begin_line": 1573,
      "end_line": 1575,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *  \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1574,col 9)-(line 1574,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Calendar, int)",
      "begin_line": 1615,
      "end_line": 1617,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of days within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1616,col 9)-(line 1616,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragment(java.util.Date, int, int)",
      "begin_line": 1630,
      "end_line": 1637,
      "comment": "\n     * Date-version for fragment-calculation in any unit\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @param unit Calendar field defining the unit\n     * @return number of units within the fragment of the date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1631,col 9)-(line 1633,col 9)",
        "(line 1634,col 9)-(line 1634,col 51)",
        "(line 1635,col 9)-(line 1635,col 31)",
        "(line 1636,col 9)-(line 1636,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragment(java.util.Calendar, int, int)",
      "begin_line": 1650,
      "end_line": 1690,
      "comment": "\n     * Calendar-version for fragment-calculation in any unit\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @param unit Calendar field defining the unit\n     * @return number of units within the fragment of the calendar\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1651,col 9)-(line 1653,col 9)",
        "(line 1654,col 9)-(line 1654,col 52)",
        "(line 1655,col 9)-(line 1655,col 24)",
        "(line 1658,col 9)-(line 1665,col 9)",
        "(line 1667,col 9)-(line 1688,col 9)",
        "(line 1689,col 9)-(line 1689,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getMillisPerUnit(int)",
      "begin_line": 1700,
      "end_line": 1722,
      "comment": "\n     * Returns the number of millis of a datefield, if this is a constant value\n     * \n     * @param unit A Calendar field which is a valid unit for a fragment\n     * @return number of millis\n     * @throws IllegalArgumentException if date can\u0027t be represented in millisenconds\n     * @since 2.4 \n     ",
      "child_ranges": [
        "(line 1701,col 9)-(line 1701,col 37)",
        "(line 1702,col 9)-(line 1720,col 9)",
        "(line 1721,col 9)-(line 1721,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DateIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Calendar\u003e"
      ],
      "begin_line": 1727,
      "end_line": 1775,
      "comment": "\n     * \u003cp\u003eDate iterator.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endFinal"
      ],
      "begin_line": 1728,
      "end_line": 1728,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spot"
      ],
      "begin_line": 1729,
      "end_line": 1729,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.DateIterator(java.util.Calendar, java.util.Calendar)",
      "begin_line": 1737,
      "end_line": 1742,
      "comment": "\n         * Constructs a DateIterator that ranges from one date to another. \n         *\n         * @param startFinal start date (inclusive)\n         * @param endFinal end date (not inclusive)\n         ",
      "child_ranges": [
        "(line 1738,col 13)-(line 1738,col 20)",
        "(line 1739,col 13)-(line 1739,col 37)",
        "(line 1740,col 13)-(line 1740,col 30)",
        "(line 1741,col 13)-(line 1741,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.hasNext()",
      "begin_line": 1749,
      "end_line": 1751,
      "comment": "\n         * Has the iterator not reached the end date yet?\n         *\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has yet to reach the end date\n         ",
      "child_ranges": [
        "(line 1750,col 13)-(line 1750,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.next()",
      "begin_line": 1758,
      "end_line": 1764,
      "comment": "\n         * Return the next calendar in the iteration\n         *\n         * @return Object calendar for the next date\n         ",
      "child_ranges": [
        "(line 1759,col 13)-(line 1761,col 13)",
        "(line 1762,col 13)-(line 1762,col 39)",
        "(line 1763,col 13)-(line 1763,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.remove()",
      "begin_line": 1772,
      "end_line": 1774,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         * \n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 1773,col 13)-(line 1773,col 54)"
      ]
    }
  ]
}