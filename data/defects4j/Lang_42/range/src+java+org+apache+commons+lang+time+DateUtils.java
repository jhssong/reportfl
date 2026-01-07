{
  "filepath": "/tmp/Lang-42b/src/java/org/apache/commons/lang/time/DateUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 1648,
      "comment": "\n * \u003cp\u003eA suite of utilities surrounding the use of the\n * {@link java.util.Calendar} and {@link java.util.Date} object.\u003c/p\u003e\n * \n * \u003cp\u003eDateUtils contains a lot of common methods considering manipulations\n * of Dates or Calendars. Some methods require some extra explanation.\n * The truncate and round methods could be considered the Math.floor(),\n * Math.ceil() or Math.round versions for dates\n * This way date-fields will be ignored in bottom-up order.\n * As a complement to these methods we\u0027ve introduced some fragment-methods.\n * With these methods the Date-fields will be ignored in top-down order.\n * Since a date without a year is not a valid date, you have to decide in what\n * kind of date-field you want your result, for instance milliseconds or days.\n * \u003c/p\u003e\n *   \n *   \n *\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author Stephen Colebourne\n * @author Janek Bogucki\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Phil Steitz\n * @author Robert Scholte\n * @since 2.0\n * @version $Id$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DateUtils.DateUtils()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eDateUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eDateUtils.parse(str);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameDay(java.util.Date, java.util.Date)",
      "begin_line": 155,
      "end_line": 164,
      "comment": "\n     * \u003cp\u003eChecks if two date objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 47)",
        "(line 160,col 9)-(line 160,col 28)",
        "(line 161,col 9)-(line 161,col 47)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 163,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameDay(java.util.Calendar, java.util.Calendar)",
      "begin_line": 179,
      "end_line": 186,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either calendar is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 185,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameInstant(java.util.Date, java.util.Date)",
      "begin_line": 200,
      "end_line": 205,
      "comment": "\n     * \u003cp\u003eChecks if two date objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameInstant(java.util.Calendar, java.util.Calendar)",
      "begin_line": 218,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameLocalTime(java.util.Calendar, java.util.Calendar)",
      "begin_line": 238,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same local time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the values of the fields of the two objects.\n     * In addition, both calendars must be the same of the same type.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 249,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.parseDate(java.lang.String, java.lang.String[])",
      "begin_line": 266,
      "end_line": 286,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed sucessful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 49)",
        "(line 273,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addYears(java.util.Date, int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Adds a number of years to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addMonths(java.util.Date, int)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Adds a number of months to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addWeeks(java.util.Date, int)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Adds a number of weeks to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addDays(java.util.Date, int)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Adds a number of days to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addHours(java.util.Date, int)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Adds a number of hours to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addMinutes(java.util.Date, int)",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Adds a number of minutes to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addSeconds(java.util.Date, int)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Adds a number of seconds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addMilliseconds(java.util.Date, int)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Adds a number of milliseconds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.add(java.util.Date, int, int)",
      "begin_line": 412,
      "end_line": 420,
      "comment": "\n     * Adds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to add to\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     * @deprecated Will become privately scoped in 3.0\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 44)",
        "(line 417,col 9)-(line 417,col 24)",
        "(line 418,col 9)-(line 418,col 37)",
        "(line 419,col 9)-(line 419,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.setYears(java.util.Date, int)",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n     * Sets the years field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.setMonths(java.util.Date, int)",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Sets the months field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.setDays(java.util.Date, int)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * Sets the day of month field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.setHours(java.util.Date, int)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Sets the hours field to a date returning a new object.  Hours range \n     * from  0-23.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.setMinutes(java.util.Date, int)",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * Sets the minute field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.setSeconds(java.util.Date, int)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * Sets the seconds field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.setMilliseconds(java.util.Date, int)",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * Sets the miliseconds field to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.set(java.util.Date, int, int)",
      "begin_line": 541,
      "end_line": 551,
      "comment": "\n     * Sets the specified field to a date returning a new object.  \n     * This does not use a lenient calendar.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to set the amount to\n     * @param amount the amount to set\n     * @return a new Date object set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 44)",
        "(line 547,col 9)-(line 547,col 28)",
        "(line 548,col 9)-(line 548,col 24)",
        "(line 549,col 9)-(line 549,col 37)",
        "(line 550,col 9)-(line 550,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.round(java.util.Date, int)",
      "begin_line": 582,
      "end_line": 590,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 47)",
        "(line 587,col 9)-(line 587,col 27)",
        "(line 588,col 9)-(line 588,col 34)",
        "(line 589,col 9)-(line 589,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.round(java.util.Calendar, int)",
      "begin_line": 620,
      "end_line": 627,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 51)",
        "(line 625,col 9)-(line 625,col 37)",
        "(line 626,col 9)-(line 626,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.round(java.lang.Object, int)",
      "begin_line": 659,
      "end_line": 670,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, either Date or Calendar\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 669,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.truncate(java.util.Date, int)",
      "begin_line": 689,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 47)",
        "(line 694,col 9)-(line 694,col 27)",
        "(line 695,col 9)-(line 695,col 35)",
        "(line 696,col 9)-(line 696,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.truncate(java.util.Calendar, int)",
      "begin_line": 715,
      "end_line": 722,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 53)",
        "(line 720,col 9)-(line 720,col 40)",
        "(line 721,col 9)-(line 721,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.truncate(java.lang.Object, int)",
      "begin_line": 744,
      "end_line": 755,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 754,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.modify(java.util.Calendar, int, boolean)",
      "begin_line": 766,
      "end_line": 902,
      "comment": "\n     * \u003cp\u003eInternal calculation method.\u003c/p\u003e\n     * \n     * @param val  the calendar\n     * @param field  the field constant\n     * @param round  true to round, false to truncate\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 769,col 9)",
        "(line 771,col 9)-(line 773,col 9)",
        "(line 781,col 9)-(line 781,col 34)",
        "(line 782,col 9)-(line 782,col 35)",
        "(line 783,col 9)-(line 783,col 29)",
        "(line 786,col 9)-(line 786,col 54)",
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 795,col 9)-(line 795,col 47)",
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 801,col 9)",
        "(line 804,col 9)-(line 804,col 47)",
        "(line 805,col 9)-(line 807,col 9)",
        "(line 810,col 9)-(line 813,col 9)",
        "(line 816,col 9)-(line 816,col 32)",
        "(line 817,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 900,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.iterator(java.util.Date, int)",
      "begin_line": 929,
      "end_line": 936,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, not null\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator, which always returns Calendar instances\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 47)",
        "(line 934,col 9)-(line 934,col 28)",
        "(line 935,col 9)-(line 935,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.iterator(java.util.Calendar, int)",
      "begin_line": 962,
      "end_line": 1032,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 965,col 9)",
        "(line 966,col 9)-(line 966,col 30)",
        "(line 967,col 9)-(line 967,col 28)",
        "(line 968,col 9)-(line 968,col 42)",
        "(line 969,col 9)-(line 969,col 42)",
        "(line 970,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1018,col 9)",
        "(line 1019,col 9)-(line 1021,col 9)",
        "(line 1022,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1027,col 9)",
        "(line 1028,col 9)-(line 1030,col 9)",
        "(line 1031,col 9)-(line 1031,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.iterator(java.lang.Object, int)",
      "begin_line": 1053,
      "end_line": 1064,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, either\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param rangeStyle  the style constant to use. Must be one of the range\n     * styles listed for the {@link #iterator(Calendar, int)} method.\n     * @return the date iterator\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is\n     *  not a \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1063,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInMilliseconds(java.util.Date, int)",
      "begin_line": 1099,
      "end_line": 1101,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e\n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of milliseconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all milliseconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e\n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538 (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInSeconds(java.util.Date, int)",
      "begin_line": 1139,
      "end_line": 1141,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInMinutes(java.util.Date, int)",
      "begin_line": 1179,
      "end_line": 1181,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInHours(java.util.Date, int)",
      "begin_line": 1219,
      "end_line": 1221,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInDays(java.util.Date, int)",
      "begin_line": 1259,
      "end_line": 1261,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @return number of days  within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInMilliseconds(java.util.Calendar, int)",
      "begin_line": 1299,
      "end_line": 1301,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MILLISECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538\n     *   (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1300,col 5)-(line 1300,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInSeconds(java.util.Calendar, int)",
      "begin_line": 1338,
      "end_line": 1340,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1339,col 9)-(line 1339,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInMinutes(java.util.Calendar, int)",
      "begin_line": 1378,
      "end_line": 1380,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1379,col 9)-(line 1379,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInHours(java.util.Calendar, int)",
      "begin_line": 1418,
      "end_line": 1420,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *  \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1419,col 9)-(line 1419,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragmentInDays(java.util.Calendar, int)",
      "begin_line": 1460,
      "end_line": 1462,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @return number of days within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1461,col 9)-(line 1461,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragment(java.util.Date, int, int)",
      "begin_line": 1475,
      "end_line": 1482,
      "comment": "\n     * Date-version for fragment-calculation in any unit\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @param unit Calendar field defining the unit\n     * @return number of units within the fragment of the date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1476,col 9)-(line 1478,col 9)",
        "(line 1479,col 9)-(line 1479,col 51)",
        "(line 1480,col 9)-(line 1480,col 31)",
        "(line 1481,col 9)-(line 1481,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getFragment(java.util.Calendar, int, int)",
      "begin_line": 1495,
      "end_line": 1532,
      "comment": "\n     * Calendar-version for fragment-calculation in any unit\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @param unit Calendar field defining the unit\n     * @return number of units within the fragment of the calendar\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1496,col 9)-(line 1498,col 9)",
        "(line 1499,col 9)-(line 1499,col 52)",
        "(line 1500,col 9)-(line 1500,col 24)",
        "(line 1503,col 9)-(line 1510,col 9)",
        "(line 1512,col 9)-(line 1530,col 9)",
        "(line 1531,col 9)-(line 1531,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.getMillisPerUnit(int)",
      "begin_line": 1542,
      "end_line": 1564,
      "comment": "\n     * Returns the number of millis of a datefield, if this is a constant value\n     * \n     * @param unit A Calendar field which is a valid unit for a fragment\n     * @return number of millis\n     * @throws IllegalArgumentException if date can\u0027t be represented in millisenconds\n     * @since 2.4 \n     ",
      "child_ranges": [
        "(line 1543,col 9)-(line 1543,col 37)",
        "(line 1544,col 9)-(line 1562,col 9)",
        "(line 1563,col 9)-(line 1563,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DateIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 1569,
      "end_line": 1617,
      "comment": "\n     * \u003cp\u003eDate iterator.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endFinal"
      ],
      "begin_line": 1570,
      "end_line": 1570,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spot"
      ],
      "begin_line": 1571,
      "end_line": 1571,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DateUtils.DateIterator.DateIterator(java.util.Calendar, java.util.Calendar)",
      "begin_line": 1579,
      "end_line": 1584,
      "comment": "\n         * Constructs a DateIterator that ranges from one date to another. \n         *\n         * @param startFinal start date (inclusive)\n         * @param endFinal end date (not inclusive)\n         ",
      "child_ranges": [
        "(line 1580,col 13)-(line 1580,col 20)",
        "(line 1581,col 13)-(line 1581,col 37)",
        "(line 1582,col 13)-(line 1582,col 30)",
        "(line 1583,col 13)-(line 1583,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.DateIterator.hasNext()",
      "begin_line": 1591,
      "end_line": 1593,
      "comment": "\n         * Has the iterator not reached the end date yet?\n         *\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has yet to reach the end date\n         ",
      "child_ranges": [
        "(line 1592,col 13)-(line 1592,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.DateIterator.next()",
      "begin_line": 1600,
      "end_line": 1606,
      "comment": "\n         * Return the next calendar in the iteration\n         *\n         * @return Object calendar for the next date\n         ",
      "child_ranges": [
        "(line 1601,col 13)-(line 1603,col 13)",
        "(line 1604,col 13)-(line 1604,col 39)",
        "(line 1605,col 13)-(line 1605,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.DateIterator.remove()",
      "begin_line": 1614,
      "end_line": 1616,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         * \n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 1615,col 13)-(line 1615,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_IN_SECOND"
      ],
      "begin_line": 1628,
      "end_line": 1628,
      "comment": "\n     * Number of milliseconds in a standard second.\n     * \n     * @deprecated Use MILLIS_PER_SECOND. This will be removed in Commons Lang 3.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_IN_MINUTE"
      ],
      "begin_line": 1634,
      "end_line": 1634,
      "comment": "\n     * Number of milliseconds in a standard minute.\n     * \n     * @deprecated Use MILLIS_PER_MINUTE. This will be removed in Commons Lang 3.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_IN_HOUR"
      ],
      "begin_line": 1640,
      "end_line": 1640,
      "comment": "\n     * Number of milliseconds in a standard hour.\n     * \n     * @deprecated Use MILLIS_PER_HOUR. This will be removed in Commons Lang 3.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_IN_DAY"
      ],
      "begin_line": 1646,
      "end_line": 1646,
      "comment": "\n     * Number of milliseconds in a standard day.\n     * \n     * @deprecated Use MILLIS_PER_DAY. This will be removed in Commons Lang 3.0.\n     "
    }
  ]
}