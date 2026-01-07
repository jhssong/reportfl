{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/time/DateUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 990,
      "comment": "\n * \u003cp\u003eA suite of utilities surrounding the use of the\n * {@link java.util.Calendar} and {@link java.util.Date} object.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author Stephen Colebourne\n * @author Janek Bogucki\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Phil Steitz\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UTC_TIME_ZONE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The UTC time zone  (often referred to as GMT).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Number of milliseconds in a standard second.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_MINUTE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Number of milliseconds in a standard minute.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_HOUR"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Number of milliseconds in a standard hour.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_DAY"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Number of milliseconds in a standard day.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEMI_MONTH"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * This is half a month, so this represents whether a date is in the top\n     * or bottom half of the month.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 73,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_SUNDAY"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * A week range, starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_MONDAY"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * A week range, starting on Monday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_RELATIVE"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * A week range, starting on the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_CENTER"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * A week range, centered around the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_SUNDAY"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * A month range, the week starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_MONDAY"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * A month range, the week starting on Monday.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DateUtils.DateUtils()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eDateUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eDateUtils.parse(str);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameDay(java.util.Date, java.util.Date)",
      "begin_line": 141,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eChecks if two date objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 148,col 28)",
        "(line 149,col 9)-(line 149,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameDay(java.util.Calendar, java.util.Calendar)",
      "begin_line": 165,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either calendar is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameInstant(java.util.Date, java.util.Date)",
      "begin_line": 186,
      "end_line": 191,
      "comment": "\n     * \u003cp\u003eChecks if two date objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameInstant(java.util.Calendar, java.util.Calendar)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.isSameLocalTime(java.util.Calendar, java.util.Calendar)",
      "begin_line": 224,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same local time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the values of the fields of the two objects.\n     * In addition, both calendars must be the same of the same type.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 235,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.parseDate(java.lang.String, java.lang.String[])",
      "begin_line": 252,
      "end_line": 272,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed sucessful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 39)",
        "(line 258,col 9)-(line 258,col 49)",
        "(line 259,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addYears(java.util.Date, int)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Adds a number of years to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addMonths(java.util.Date, int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Adds a number of months to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addWeeks(java.util.Date, int)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Adds a number of weeks to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addDays(java.util.Date, int)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Adds a number of days to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addHours(java.util.Date, int)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Adds a number of hours to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addMinutes(java.util.Date, int)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Adds a number of minutes to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addSeconds(java.util.Date, int)",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Adds a number of seconds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.addMilliseconds(java.util.Date, int)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Adds a number of milliseconds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.add(java.util.Date, int, int)",
      "begin_line": 397,
      "end_line": 405,
      "comment": "\n     * Adds to a date returning a new object.\n     * The original date object is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to add to\n     * @param amount  the amount to add, may be negative\n     * @return the new date object with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 44)",
        "(line 402,col 9)-(line 402,col 24)",
        "(line 403,col 9)-(line 403,col 37)",
        "(line 404,col 9)-(line 404,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.round(java.util.Date, int)",
      "begin_line": 436,
      "end_line": 444,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 47)",
        "(line 441,col 9)-(line 441,col 27)",
        "(line 442,col 9)-(line 442,col 34)",
        "(line 443,col 9)-(line 443,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.round(java.util.Calendar, int)",
      "begin_line": 474,
      "end_line": 481,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 51)",
        "(line 479,col 9)-(line 479,col 37)",
        "(line 480,col 9)-(line 480,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.round(java.lang.Object, int)",
      "begin_line": 513,
      "end_line": 524,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, either Date or Calendar\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 523,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.truncate(java.util.Date, int)",
      "begin_line": 543,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 47)",
        "(line 548,col 9)-(line 548,col 27)",
        "(line 549,col 9)-(line 549,col 35)",
        "(line 550,col 9)-(line 550,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.truncate(java.util.Calendar, int)",
      "begin_line": 569,
      "end_line": 576,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date (a different object)\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 53)",
        "(line 574,col 9)-(line 574,col 40)",
        "(line 575,col 9)-(line 575,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.truncate(java.lang.Object, int)",
      "begin_line": 598,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either \u003ccode\u003eDate\u003c/code\u003e\n     *  or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param field  the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     *  or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the rounded date\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 608,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.modify(java.util.Calendar, int, boolean)",
      "begin_line": 620,
      "end_line": 744,
      "comment": "\n     * \u003cp\u003eInternal calculation method.\u003c/p\u003e\n     * \n     * @param val  the calendar\n     * @param field  the field constant\n     * @param round  true to round, false to truncate\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 627,col 9)",
        "(line 635,col 9)-(line 635,col 34)",
        "(line 636,col 9)-(line 636,col 35)",
        "(line 637,col 9)-(line 637,col 29)",
        "(line 640,col 9)-(line 640,col 54)",
        "(line 641,col 9)-(line 646,col 9)",
        "(line 649,col 9)-(line 649,col 47)",
        "(line 650,col 9)-(line 655,col 9)",
        "(line 658,col 9)-(line 658,col 47)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 664,col 9)-(line 667,col 9)",
        "(line 670,col 9)-(line 670,col 32)",
        "(line 671,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.iterator(java.util.Date, int)",
      "begin_line": 771,
      "end_line": 778,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, not null\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator, which always returns Calendar instances\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 47)",
        "(line 776,col 9)-(line 776,col 28)",
        "(line 777,col 9)-(line 777,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.iterator(java.util.Calendar, int)",
      "begin_line": 804,
      "end_line": 874,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 30)",
        "(line 809,col 9)-(line 809,col 28)",
        "(line 810,col 9)-(line 810,col 42)",
        "(line 811,col 9)-(line 811,col 42)",
        "(line 812,col 9)-(line 854,col 9)",
        "(line 855,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.iterator(java.lang.Object, int)",
      "begin_line": 895,
      "end_line": 906,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, either\n     *  \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param rangeStyle  the style constant to use. Must be one of the range\n     * styles listed for the {@link #iterator(Calendar, int)} method.\n     * @return the date iterator\n     * @throws IllegalArgumentException if the date\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is\n     *  not a \u003ccode\u003eDate\u003c/code\u003e or \u003ccode\u003eCalendar\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 905,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DateIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator"
      ],
      "begin_line": 911,
      "end_line": 959,
      "comment": "\n     * \u003cp\u003eDate iterator.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endFinal"
      ],
      "begin_line": 912,
      "end_line": 912,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spot"
      ],
      "begin_line": 913,
      "end_line": 913,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DateUtils.DateIterator.DateIterator(java.util.Calendar, java.util.Calendar)",
      "begin_line": 921,
      "end_line": 926,
      "comment": "\n         * Constructs a DateIterator that ranges from one date to another. \n         *\n         * @param startFinal start date (inclusive)\n         * @param endFinal end date (not inclusive)\n         ",
      "child_ranges": [
        "(line 922,col 13)-(line 922,col 20)",
        "(line 923,col 13)-(line 923,col 37)",
        "(line 924,col 13)-(line 924,col 30)",
        "(line 925,col 13)-(line 925,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.DateIterator.hasNext()",
      "begin_line": 933,
      "end_line": 935,
      "comment": "\n         * Has the iterator not reached the end date yet?\n         *\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has yet to reach the end date\n         ",
      "child_ranges": [
        "(line 934,col 13)-(line 934,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.DateIterator.next()",
      "begin_line": 942,
      "end_line": 948,
      "comment": "\n         * Return the next calendar in the iteration\n         *\n         * @return Object calendar for the next date\n         ",
      "child_ranges": [
        "(line 943,col 13)-(line 945,col 13)",
        "(line 946,col 13)-(line 946,col 39)",
        "(line 947,col 13)-(line 947,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtils.DateIterator.remove()",
      "begin_line": 956,
      "end_line": 958,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         * \n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 957,col 13)-(line 957,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_IN_SECOND"
      ],
      "begin_line": 970,
      "end_line": 970,
      "comment": "\n     * Number of milliseconds in a standard second.\n     * \n     * @deprecated Use MILLIS_PER_SECOND. This will be removed in Commons Lang 3.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_IN_MINUTE"
      ],
      "begin_line": 976,
      "end_line": 976,
      "comment": "\n     * Number of milliseconds in a standard minute.\n     * \n     * @deprecated Use MILLIS_PER_MINUTE. This will be removed in Commons Lang 3.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_IN_HOUR"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": "\n     * Number of milliseconds in a standard hour.\n     * \n     * @deprecated Use MILLIS_PER_HOUR. This will be removed in Commons Lang 3.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_IN_DAY"
      ],
      "begin_line": 988,
      "end_line": 988,
      "comment": "\n     * Number of milliseconds in a standard day.\n     * \n     * @deprecated Use MILLIS_PER_DAY. This will be removed in Commons Lang 3.0.\n     "
    }
  ]
}