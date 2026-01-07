{
  "filepath": "/tmp/Lang-25b/src/main/java/org/apache/commons/lang3/time/DateUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 1871,
      "comment": "\n * \u003cp\u003eA suite of utilities surrounding the use of the\n * {@link java.util.Calendar} and {@link java.util.Date} object.\u003c/p\u003e\n * \n * \u003cp\u003eDateUtils contains a lot of common methods considering manipulations\n * of Dates or Calendars. Some methods require some extra explanation.\n * The truncate, ceiling and round methods could be considered the Math.floor(),\n * Math.ceil() or Math.round versions for dates\n * This way date-fields will be ignored in bottom-up order.\n * As a complement to these methods we\u0027ve introduced some fragment-methods.\n * With these methods the Date-fields will be ignored in top-down order.\n * Since a date without a year is not a valid date, you have to decide in what\n * kind of date-field you want your result, for instance milliseconds or days.\n * \u003c/p\u003e\n *   \n *   \n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author Janek Bogucki\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Phil Steitz\n * @author Robert Scholte\n * @author Paul Benedict\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UTC_TIME_ZONE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * The UTC time zone  (often referred to as GMT).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Number of milliseconds in a standard second.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_MINUTE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Number of milliseconds in a standard minute.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_HOUR"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Number of milliseconds in a standard hour.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_DAY"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Number of milliseconds in a standard day.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEMI_MONTH"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * This is half a month, so this represents whether a date is in the top\n     * or bottom half of the month.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 88,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_SUNDAY"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * A week range, starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_MONDAY"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * A week range, starting on Monday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_RELATIVE"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * A week range, starting on the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_CENTER"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * A week range, centered around the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_SUNDAY"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * A month range, the week starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_MONDAY"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * A month range, the week starting on Monday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_TRUNCATE"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Constant marker for truncating \n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_ROUND"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Constant marker for rounding\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_CEILING"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Constant marker for ceiling\n     * @since 3.0\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateUtils()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eDateUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eDateUtils.parse(str);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Date, java.util.Date)",
      "begin_line": 175,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eChecks if two date objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 47)",
        "(line 180,col 9)-(line 180,col 28)",
        "(line 181,col 9)-(line 181,col 47)",
        "(line 182,col 9)-(line 182,col 28)",
        "(line 183,col 9)-(line 183,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Calendar, java.util.Calendar)",
      "begin_line": 199,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either calendar is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 205,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Date, java.util.Date)",
      "begin_line": 220,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eChecks if two date objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Calendar, java.util.Calendar)",
      "begin_line": 238,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameLocalTime(java.util.Calendar, java.util.Calendar)",
      "begin_line": 258,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same local time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the values of the fields of the two objects.\n     * In addition, both calendars must be the same of the same type.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 269,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDate(java.lang.String, java.lang.String...)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser will be lenient toward the parsed date.\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable (or there were none)\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateStrictly(java.lang.String, java.lang.String...)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser parses strictly - it does not allow for dates such as \"February 942, 1996\". \n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(java.lang.String, java.lang.String[], boolean)",
      "begin_line": 326,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @param lenient Specify whether or not date/time parsing is to be lenient.\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     * @see java.util.Calender#isLenient()\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 57)",
        "(line 333,col 9)-(line 333,col 35)",
        "(line 334,col 9)-(line 334,col 49)",
        "(line 335,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addYears(java.util.Date, int)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Adds a number of years to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMonths(java.util.Date, int)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * Adds a number of months to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addWeeks(java.util.Date, int)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * Adds a number of weeks to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addDays(java.util.Date, int)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Adds a number of days to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addHours(java.util.Date, int)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Adds a number of hours to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMinutes(java.util.Date, int)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Adds a number of minutes to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addSeconds(java.util.Date, int)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * Adds a number of seconds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMilliseconds(java.util.Date, int)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n     * Adds a number of milliseconds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.add(java.util.Date, int, int)",
      "begin_line": 484,
      "end_line": 492,
      "comment": "\n     * Adds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to add to\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 44)",
        "(line 489,col 9)-(line 489,col 24)",
        "(line 490,col 9)-(line 490,col 37)",
        "(line 491,col 9)-(line 491,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setYears(java.util.Date, int)",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\n     * Sets the years field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMonths(java.util.Date, int)",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Sets the months field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setDays(java.util.Date, int)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n     * Sets the day of month field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setHours(java.util.Date, int)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n     * Sets the hours field to a date returning a new object.  Hours range \n     * from  0-23.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMinutes(java.util.Date, int)",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n     * Sets the minute field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setSeconds(java.util.Date, int)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * Sets the seconds field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMilliseconds(java.util.Date, int)",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * Sets the miliseconds field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.set(java.util.Date, int, int)",
      "begin_line": 613,
      "end_line": 623,
      "comment": "\n     * Sets the specified field to a date returning a new object.  \n     * This does not use a lenient calendar.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to set the amount to\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 9)",
        "(line 618,col 9)-(line 618,col 44)",
        "(line 619,col 9)-(line 619,col 28)",
        "(line 620,col 9)-(line 620,col 24)",
        "(line 621,col 9)-(line 621,col 37)",
        "(line 622,col 9)-(line 622,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.toCalendar(java.util.Date)",
      "begin_line": 634,
      "end_line": 638,
      "comment": "\n     * Convert a Date into a Calendar object. \n     * \n     * @param date the date to convert to a Calendar\n     * @return the created Calendar\n     * @throws NullPointerException if null is passed in\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 44)",
        "(line 636,col 9)-(line 636,col 24)",
        "(line 637,col 9)-(line 637,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.util.Date, int)",
      "begin_line": 669,
      "end_line": 677,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 47)",
        "(line 674,col 9)-(line 674,col 27)",
        "(line 675,col 9)-(line 675,col 42)",
        "(line 676,col 9)-(line 676,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.util.Calendar, int)",
      "begin_line": 707,
      "end_line": 714,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 51)",
        "(line 712,col 9)-(line 712,col 45)",
        "(line 713,col 9)-(line 713,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.lang.Object, int)",
      "begin_line": 746,
      "end_line": 757,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, either Date or Calendar\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 756,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.util.Date, int)",
      "begin_line": 776,
      "end_line": 784,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 780,col 47)",
        "(line 781,col 9)-(line 781,col 27)",
        "(line 782,col 9)-(line 782,col 45)",
        "(line 783,col 9)-(line 783,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.util.Calendar, int)",
      "begin_line": 802,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 53)",
        "(line 807,col 9)-(line 807,col 50)",
        "(line 808,col 9)-(line 808,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.lang.Object, int)",
      "begin_line": 831,
      "end_line": 842,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 841,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Date, int)",
      "begin_line": 862,
      "end_line": 870,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 866,col 47)",
        "(line 867,col 9)-(line 867,col 27)",
        "(line 868,col 9)-(line 868,col 44)",
        "(line 869,col 9)-(line 869,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Calendar, int)",
      "begin_line": 889,
      "end_line": 896,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 893,col 50)",
        "(line 894,col 9)-(line 894,col 46)",
        "(line 895,col 9)-(line 895,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.lang.Object, int)",
      "begin_line": 919,
      "end_line": 930,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.modify(java.util.Calendar, int, int)",
      "begin_line": 941,
      "end_line": 1077,
      "comment": "\n     * \u003cp\u003eInternal calculation method.\u003c/p\u003e\n     * \n     * @param val  the calendar\n     * @param field  the field constant\n     * @param modType  type to truncate, round or ceiling\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 944,col 9)",
        "(line 946,col 9)-(line 948,col 9)",
        "(line 956,col 9)-(line 956,col 34)",
        "(line 957,col 9)-(line 957,col 35)",
        "(line 958,col 9)-(line 958,col 29)",
        "(line 961,col 9)-(line 961,col 54)",
        "(line 962,col 9)-(line 964,col 9)",
        "(line 965,col 9)-(line 967,col 9)",
        "(line 970,col 9)-(line 970,col 47)",
        "(line 971,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 976,col 9)",
        "(line 979,col 9)-(line 979,col 47)",
        "(line 980,col 9)-(line 982,col 9)",
        "(line 985,col 9)-(line 988,col 9)",
        "(line 991,col 9)-(line 991,col 32)",
        "(line 992,col 9)-(line 1074,col 9)",
        "(line 1075,col 9)-(line 1075,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.util.Date, int)",
      "begin_line": 1104,
      "end_line": 1111,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, not null\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator, which always returns Calendar instances\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1107,col 9)",
        "(line 1108,col 9)-(line 1108,col 47)",
        "(line 1109,col 9)-(line 1109,col 28)",
        "(line 1110,col 9)-(line 1110,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.util.Calendar, int)",
      "begin_line": 1137,
      "end_line": 1207,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1141,col 30)",
        "(line 1142,col 9)-(line 1142,col 28)",
        "(line 1143,col 9)-(line 1143,col 42)",
        "(line 1144,col 9)-(line 1144,col 42)",
        "(line 1145,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1196,col 9)",
        "(line 1197,col 9)-(line 1199,col 9)",
        "(line 1200,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1205,col 9)",
        "(line 1206,col 9)-(line 1206,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.lang.Object, int)",
      "begin_line": 1228,
      "end_line": 1239,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, either\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param rangeStyle  the style constant to use. Must be one of the range\n     * styles listed for the {@link #iterator(Calendar, int)} method.\n     * @return the date iterator\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is\n     *  not a \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1231,col 9)",
        "(line 1232,col 9)-(line 1238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Date, int)",
      "begin_line": 1274,
      "end_line": 1276,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e\n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of milliseconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all milliseconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e\n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538 (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Date, int)",
      "begin_line": 1314,
      "end_line": 1316,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1315,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Date, int)",
      "begin_line": 1354,
      "end_line": 1356,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1355,col 9)-(line 1355,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Date, int)",
      "begin_line": 1394,
      "end_line": 1396,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1395,col 9)-(line 1395,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Date, int)",
      "begin_line": 1434,
      "end_line": 1436,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of days  within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1435,col 9)-(line 1435,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Calendar, int)",
      "begin_line": 1474,
      "end_line": 1476,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MILLISECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538\n     *   (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1475,col 5)-(line 1475,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Calendar, int)",
      "begin_line": 1513,
      "end_line": 1515,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1514,col 9)-(line 1514,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Calendar, int)",
      "begin_line": 1553,
      "end_line": 1555,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1554,col 9)-(line 1554,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Calendar, int)",
      "begin_line": 1593,
      "end_line": 1595,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *  \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1594,col 9)-(line 1594,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Calendar, int)",
      "begin_line": 1635,
      "end_line": 1637,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of days within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1636,col 9)-(line 1636,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragment(java.util.Date, int, int)",
      "begin_line": 1650,
      "end_line": 1657,
      "comment": "\n     * Date-version for fragment-calculation in any unit\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @param unit Calendar field defining the unit\n     * @return number of units within the fragment of the date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1651,col 9)-(line 1653,col 9)",
        "(line 1654,col 9)-(line 1654,col 51)",
        "(line 1655,col 9)-(line 1655,col 31)",
        "(line 1656,col 9)-(line 1656,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragment(java.util.Calendar, int, int)",
      "begin_line": 1670,
      "end_line": 1710,
      "comment": "\n     * Calendar-version for fragment-calculation in any unit\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @param unit Calendar field defining the unit\n     * @return number of units within the fragment of the calendar\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1671,col 9)-(line 1673,col 9)",
        "(line 1674,col 9)-(line 1674,col 52)",
        "(line 1675,col 9)-(line 1675,col 24)",
        "(line 1678,col 9)-(line 1685,col 9)",
        "(line 1687,col 9)-(line 1708,col 9)",
        "(line 1709,col 9)-(line 1709,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Calendar, java.util.Calendar, int)",
      "begin_line": 1725,
      "end_line": 1727,
      "comment": "\n     * Determines if two calendars are equal up to no more than the specified \n     * most significant field.\n     * \n     * @param cal1 the first calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param cal2 the second calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal; otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedEquals(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1726,col 9)-(line 1726,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Date, java.util.Date, int)",
      "begin_line": 1742,
      "end_line": 1744,
      "comment": "\n     * Determines if two dates are equal up to no more than the specified \n     * most significant field.\n     * \n     * @param date1 the first date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param date2 the second date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal; otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Date, int)\n     * @see #truncatedEquals(Calendar, Calendar, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1743,col 9)-(line 1743,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(java.util.Calendar, java.util.Calendar, int)",
      "begin_line": 1760,
      "end_line": 1764,
      "comment": "\n     * Determines how two calendars compare up to no more than the specified \n     * most significant field.\n     * \n     * @param cal1 the first calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param cal2 the second calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     * @return a negative integer, zero, or a positive integer as the first \n     * calendar is less than, equal to, or greater than the second.\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedCompareTo(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1761,col 9)-(line 1761,col 55)",
        "(line 1762,col 9)-(line 1762,col 55)",
        "(line 1763,col 9)-(line 1763,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(java.util.Date, java.util.Date, int)",
      "begin_line": 1780,
      "end_line": 1784,
      "comment": "\n     * Determines how two dates compare up to no more than the specified \n     * most significant field.\n     * \n     * @param date1 the first date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param date2 the second date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     * @return a negative integer, zero, or a positive integer as the first \n     * date is less than, equal to, or greater than the second.\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedCompareTo(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1781,col 9)-(line 1781,col 53)",
        "(line 1782,col 9)-(line 1782,col 53)",
        "(line 1783,col 9)-(line 1783,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getMillisPerUnit(int)",
      "begin_line": 1794,
      "end_line": 1816,
      "comment": "\n     * Returns the number of millis of a datefield, if this is a constant value\n     * \n     * @param unit A Calendar field which is a valid unit for a fragment\n     * @return number of millis\n     * @throws IllegalArgumentException if date can\u0027t be represented in millisenconds\n     * @since 2.4 \n     ",
      "child_ranges": [
        "(line 1795,col 9)-(line 1795,col 37)",
        "(line 1796,col 9)-(line 1814,col 9)",
        "(line 1815,col 9)-(line 1815,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DateIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Calendar\u003e"
      ],
      "begin_line": 1821,
      "end_line": 1869,
      "comment": "\n     * \u003cp\u003eDate iterator.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endFinal"
      ],
      "begin_line": 1822,
      "end_line": 1822,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spot"
      ],
      "begin_line": 1823,
      "end_line": 1823,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.DateIterator(java.util.Calendar, java.util.Calendar)",
      "begin_line": 1831,
      "end_line": 1836,
      "comment": "\n         * Constructs a DateIterator that ranges from one date to another. \n         *\n         * @param startFinal start date (inclusive)\n         * @param endFinal end date (not inclusive)\n         ",
      "child_ranges": [
        "(line 1832,col 13)-(line 1832,col 20)",
        "(line 1833,col 13)-(line 1833,col 37)",
        "(line 1834,col 13)-(line 1834,col 30)",
        "(line 1835,col 13)-(line 1835,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.hasNext()",
      "begin_line": 1843,
      "end_line": 1845,
      "comment": "\n         * Has the iterator not reached the end date yet?\n         *\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has yet to reach the end date\n         ",
      "child_ranges": [
        "(line 1844,col 13)-(line 1844,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.next()",
      "begin_line": 1852,
      "end_line": 1858,
      "comment": "\n         * Return the next calendar in the iteration\n         *\n         * @return Object calendar for the next date\n         ",
      "child_ranges": [
        "(line 1853,col 13)-(line 1855,col 13)",
        "(line 1856,col 13)-(line 1856,col 39)",
        "(line 1857,col 13)-(line 1857,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.remove()",
      "begin_line": 1866,
      "end_line": 1868,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         * \n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 1867,col 13)-(line 1867,col 54)"
      ]
    }
  ]
}