{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/time/DateUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 1831,
      "comment": "\n * \u003cp\u003eA suite of utilities surrounding the use of the\n * {@link java.util.Calendar} and {@link java.util.Date} object.\u003c/p\u003e\n * \n * \u003cp\u003eDateUtils contains a lot of common methods considering manipulations\n * of Dates or Calendars. Some methods require some extra explanation.\n * The truncate, ceiling and round methods could be considered the Math.floor(),\n * Math.ceil() or Math.round versions for dates\n * This way date-fields will be ignored in bottom-up order.\n * As a complement to these methods we\u0027ve introduced some fragment-methods.\n * With these methods the Date-fields will be ignored in top-down order.\n * Since a date without a year is not a valid date, you have to decide in what\n * kind of date-field you want your result, for instance milliseconds or days.\n * \u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Number of milliseconds in a standard second.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_MINUTE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Number of milliseconds in a standard minute.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_HOUR"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Number of milliseconds in a standard hour.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_DAY"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Number of milliseconds in a standard day.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEMI_MONTH"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * This is half a month, so this represents whether a date is in the top\n     * or bottom half of the month.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 74,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_SUNDAY"
      ],
      "begin_line": 89,
      "end_line": 89,
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
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * A week range, starting on the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_CENTER"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * A week range, centered around the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_SUNDAY"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * A month range, the week starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_MONDAY"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * A month range, the week starting on Monday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_TRUNCATE"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Constant marker for truncating.\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_ROUND"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Constant marker for rounding.\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_CEILING"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Constant marker for ceiling.\n     * @since 3.0\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateUtils()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003e{@code DateUtils} instances should NOT be constructed in\n     * standard programming. Instead, the static methods on the class should\n     * be used, such as {@code DateUtils.parseDate(str);}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Date, java.util.Date)",
      "begin_line": 153,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003eChecks if two date objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 47)",
        "(line 158,col 9)-(line 158,col 28)",
        "(line 159,col 9)-(line 159,col 47)",
        "(line 160,col 9)-(line 160,col 28)",
        "(line 161,col 9)-(line 161,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Calendar, java.util.Calendar)",
      "begin_line": 177,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either calendar is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Date, java.util.Date)",
      "begin_line": 198,
      "end_line": 203,
      "comment": "\n     * \u003cp\u003eChecks if two date objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Calendar, java.util.Calendar)",
      "begin_line": 216,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameLocalTime(java.util.Calendar, java.util.Calendar)",
      "begin_line": 236,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same local time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the values of the fields of the two objects.\n     * In addition, both calendars must be the same of the same type.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 247,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDate(java.lang.String, java.lang.String...)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser will be lenient toward the parsed date.\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable (or there were none)\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateStrictly(java.lang.String, java.lang.String...)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser parses strictly - it does not allow for dates such as \"February 942, 1996\". \n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(java.lang.String, java.lang.String[], boolean)",
      "begin_line": 304,
      "end_line": 337,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @param lenient Specify whether or not date/time parsing is to be lenient.\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     * @see java.util.Calender#isLenient()\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 57)",
        "(line 311,col 9)-(line 311,col 35)",
        "(line 312,col 9)-(line 312,col 49)",
        "(line 313,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addYears(java.util.Date, int)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Adds a number of years to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMonths(java.util.Date, int)",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Adds a number of months to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addWeeks(java.util.Date, int)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Adds a number of weeks to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addDays(java.util.Date, int)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Adds a number of days to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addHours(java.util.Date, int)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * Adds a number of hours to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMinutes(java.util.Date, int)",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * Adds a number of minutes to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addSeconds(java.util.Date, int)",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n     * Adds a number of seconds to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMilliseconds(java.util.Date, int)",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Adds a number of milliseconds to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.add(java.util.Date, int, int)",
      "begin_line": 462,
      "end_line": 470,
      "comment": "\n     * Adds to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to add to\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 44)",
        "(line 467,col 9)-(line 467,col 24)",
        "(line 468,col 9)-(line 468,col 37)",
        "(line 469,col 9)-(line 469,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setYears(java.util.Date, int)",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\n     * Sets the years field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMonths(java.util.Date, int)",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\n     * Sets the months field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setDays(java.util.Date, int)",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n     * Sets the day of month field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setHours(java.util.Date, int)",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * Sets the hours field to a date returning a new object.  Hours range \n     * from  0-23.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMinutes(java.util.Date, int)",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n     * Sets the minute field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setSeconds(java.util.Date, int)",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * Sets the seconds field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMilliseconds(java.util.Date, int)",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n     * Sets the miliseconds field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.set(java.util.Date, int, int)",
      "begin_line": 591,
      "end_line": 601,
      "comment": "\n     * Sets the specified field to a date returning a new object.  \n     * This does not use a lenient calendar.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the {@code Calendar} field to set the amount to\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 594,col 9)",
        "(line 596,col 9)-(line 596,col 44)",
        "(line 597,col 9)-(line 597,col 28)",
        "(line 598,col 9)-(line 598,col 24)",
        "(line 599,col 9)-(line 599,col 37)",
        "(line 600,col 9)-(line 600,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.toCalendar(java.util.Date)",
      "begin_line": 612,
      "end_line": 616,
      "comment": "\n     * Convert a {@code Date} into a {@code Calendar}. \n     * \n     * @param date the date to convert to a Calendar\n     * @return the created Calendar\n     * @throws NullPointerException if null is passed in\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 44)",
        "(line 614,col 9)-(line 614,col 24)",
        "(line 615,col 9)-(line 615,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.util.Date, int)",
      "begin_line": 645,
      "end_line": 653,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or {@code SEMI_MONTH}\n     * @return the different rounded date, not null\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 47)",
        "(line 650,col 9)-(line 650,col 27)",
        "(line 651,col 9)-(line 651,col 42)",
        "(line 652,col 9)-(line 652,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.util.Calendar, int)",
      "begin_line": 682,
      "end_line": 689,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different rounded date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 51)",
        "(line 687,col 9)-(line 687,col 45)",
        "(line 688,col 9)-(line 688,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.lang.Object, int)",
      "begin_line": 719,
      "end_line": 730,
      "comment": "\n     * \u003cp\u003eRound this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different rounded date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 729,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.util.Date, int)",
      "begin_line": 748,
      "end_line": 756,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different truncated date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 47)",
        "(line 753,col 9)-(line 753,col 27)",
        "(line 754,col 9)-(line 754,col 45)",
        "(line 755,col 9)-(line 755,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.util.Calendar, int)",
      "begin_line": 773,
      "end_line": 780,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different truncated date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 53)",
        "(line 778,col 9)-(line 778,col 50)",
        "(line 779,col 9)-(line 779,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.lang.Object, int)",
      "begin_line": 798,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003eTruncate this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different truncated date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 808,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Date, int)",
      "begin_line": 828,
      "end_line": 836,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 14:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Apr 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different ceil date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 832,col 47)",
        "(line 833,col 9)-(line 833,col 27)",
        "(line 834,col 9)-(line 834,col 44)",
        "(line 835,col 9)-(line 835,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Calendar, int)",
      "begin_line": 854,
      "end_line": 861,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different ceil date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 858,col 50)",
        "(line 859,col 9)-(line 859,col 46)",
        "(line 860,col 9)-(line 860,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.lang.Object, int)",
      "begin_line": 880,
      "end_line": 891,
      "comment": "\n     * \u003cp\u003eCeil this date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the datetime of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different ceil date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 890,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.modify(java.util.Calendar, int, int)",
      "begin_line": 902,
      "end_line": 1038,
      "comment": "\n     * \u003cp\u003eInternal calculation method.\u003c/p\u003e\n     * \n     * @param val  the calendar, not null\n     * @param field  the field constant\n     * @param modType  type to truncate, round or ceiling\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 905,col 9)",
        "(line 907,col 9)-(line 909,col 9)",
        "(line 917,col 9)-(line 917,col 34)",
        "(line 918,col 9)-(line 918,col 35)",
        "(line 919,col 9)-(line 919,col 29)",
        "(line 922,col 9)-(line 922,col 54)",
        "(line 923,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 928,col 9)",
        "(line 931,col 9)-(line 931,col 47)",
        "(line 932,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 937,col 9)",
        "(line 940,col 9)-(line 940,col 47)",
        "(line 941,col 9)-(line 943,col 9)",
        "(line 946,col 9)-(line 949,col 9)",
        "(line 952,col 9)-(line 952,col 32)",
        "(line 953,col 9)-(line 1035,col 9)",
        "(line 1036,col 9)-(line 1036,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.util.Date, int)",
      "begin_line": 1065,
      "end_line": 1072,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, not null\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator, not null, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1068,col 9)",
        "(line 1069,col 9)-(line 1069,col 47)",
        "(line 1070,col 9)-(line 1070,col 28)",
        "(line 1071,col 9)-(line 1071,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.util.Calendar, int)",
      "begin_line": 1098,
      "end_line": 1168,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, not null\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1101,col 9)",
        "(line 1102,col 9)-(line 1102,col 30)",
        "(line 1103,col 9)-(line 1103,col 28)",
        "(line 1104,col 9)-(line 1104,col 42)",
        "(line 1105,col 9)-(line 1105,col 42)",
        "(line 1106,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1151,col 9)",
        "(line 1152,col 9)-(line 1154,col 9)",
        "(line 1155,col 9)-(line 1157,col 9)",
        "(line 1158,col 9)-(line 1160,col 9)",
        "(line 1161,col 9)-(line 1163,col 9)",
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1167,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.lang.Object, int)",
      "begin_line": 1186,
      "end_line": 1197,
      "comment": "\n     * \u003cp\u003eThis constructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, either {@code Date} or {@code Calendar}, not null\n     * @param rangeStyle  the style constant to use. Must be one of the range\n     * styles listed for the {@link #iterator(Calendar, int)} method.\n     * @return the date iterator, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}\n     ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1189,col 9)",
        "(line 1190,col 9)-(line 1196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Date, int)",
      "begin_line": 1232,
      "end_line": 1234,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e\n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of milliseconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all milliseconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e\n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538 (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1233,col 9)-(line 1233,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Date, int)",
      "begin_line": 1272,
      "end_line": 1274,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Date, int)",
      "begin_line": 1312,
      "end_line": 1314,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1313,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Date, int)",
      "begin_line": 1352,
      "end_line": 1354,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1353,col 9)-(line 1353,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Date, int)",
      "begin_line": 1392,
      "end_line": 1394,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of days  within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1393,col 9)-(line 1393,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Calendar, int)",
      "begin_line": 1432,
      "end_line": 1434,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MILLISECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538\n     *   (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1433,col 5)-(line 1433,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Calendar, int)",
      "begin_line": 1471,
      "end_line": 1473,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1472,col 9)-(line 1472,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Calendar, int)",
      "begin_line": 1511,
      "end_line": 1513,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1512,col 9)-(line 1512,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Calendar, int)",
      "begin_line": 1551,
      "end_line": 1553,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *  \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1552,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Calendar, int)",
      "begin_line": 1593,
      "end_line": 1595,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of days within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1594,col 9)-(line 1594,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragment(java.util.Date, int, int)",
      "begin_line": 1608,
      "end_line": 1615,
      "comment": "\n     * Date-version for fragment-calculation in any unit\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @param unit the {@code Calendar} field defining the unit\n     * @return number of units within the fragment of the date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1609,col 9)-(line 1611,col 9)",
        "(line 1612,col 9)-(line 1612,col 51)",
        "(line 1613,col 9)-(line 1613,col 31)",
        "(line 1614,col 9)-(line 1614,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragment(java.util.Calendar, int, int)",
      "begin_line": 1628,
      "end_line": 1668,
      "comment": "\n     * Calendar-version for fragment-calculation in any unit\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @param unit the {@code Calendar} field defining the unit\n     * @return number of units within the fragment of the calendar\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1631,col 9)",
        "(line 1632,col 9)-(line 1632,col 52)",
        "(line 1633,col 9)-(line 1633,col 24)",
        "(line 1636,col 9)-(line 1643,col 9)",
        "(line 1645,col 9)-(line 1666,col 9)",
        "(line 1667,col 9)-(line 1667,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Calendar, java.util.Calendar, int)",
      "begin_line": 1683,
      "end_line": 1685,
      "comment": "\n     * Determines if two calendars are equal up to no more than the specified \n     * most significant field.\n     * \n     * @param cal1 the first calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param cal2 the second calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from {@code Calendar}\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal; otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedEquals(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1684,col 9)-(line 1684,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Date, java.util.Date, int)",
      "begin_line": 1700,
      "end_line": 1702,
      "comment": "\n     * Determines if two dates are equal up to no more than the specified \n     * most significant field.\n     * \n     * @param date1 the first date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param date2 the second date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from {@code Calendar}\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal; otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Date, int)\n     * @see #truncatedEquals(Calendar, Calendar, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1701,col 9)-(line 1701,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(java.util.Calendar, java.util.Calendar, int)",
      "begin_line": 1718,
      "end_line": 1722,
      "comment": "\n     * Determines how two calendars compare up to no more than the specified \n     * most significant field.\n     * \n     * @param cal1 the first calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param cal2 the second calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from {@code Calendar}\n     * @return a negative integer, zero, or a positive integer as the first \n     * calendar is less than, equal to, or greater than the second.\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedCompareTo(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1719,col 9)-(line 1719,col 55)",
        "(line 1720,col 9)-(line 1720,col 55)",
        "(line 1721,col 9)-(line 1721,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(java.util.Date, java.util.Date, int)",
      "begin_line": 1738,
      "end_line": 1742,
      "comment": "\n     * Determines how two dates compare up to no more than the specified \n     * most significant field.\n     * \n     * @param date1 the first date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param date2 the second date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     * @return a negative integer, zero, or a positive integer as the first \n     * date is less than, equal to, or greater than the second.\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedCompareTo(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1739,col 9)-(line 1739,col 53)",
        "(line 1740,col 9)-(line 1740,col 53)",
        "(line 1741,col 9)-(line 1741,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getMillisPerUnit(int)",
      "begin_line": 1753,
      "end_line": 1775,
      "comment": "\n     * Returns the number of milliseconds of a {@code Calendar} field, if this is a constant value.\n     * This handles millisecond, second, minute, hour and day (even though days can very in length).\n     * \n     * @param unit  a {@code Calendar} field constant which is a valid unit for a fragment\n     * @return the number of milliseconds in the field\n     * @throws IllegalArgumentException if date can\u0027t be represented in milliseconds\n     * @since 2.4 \n     ",
      "child_ranges": [
        "(line 1754,col 9)-(line 1754,col 37)",
        "(line 1755,col 9)-(line 1773,col 9)",
        "(line 1774,col 9)-(line 1774,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DateIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Calendar\u003e"
      ],
      "begin_line": 1781,
      "end_line": 1829,
      "comment": "\n     * \u003cp\u003eDate iterator.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endFinal"
      ],
      "begin_line": 1782,
      "end_line": 1782,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spot"
      ],
      "begin_line": 1783,
      "end_line": 1783,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.DateIterator(java.util.Calendar, java.util.Calendar)",
      "begin_line": 1791,
      "end_line": 1796,
      "comment": "\n         * Constructs a DateIterator that ranges from one date to another. \n         *\n         * @param startFinal start date (inclusive)\n         * @param endFinal end date (not inclusive)\n         ",
      "child_ranges": [
        "(line 1792,col 13)-(line 1792,col 20)",
        "(line 1793,col 13)-(line 1793,col 37)",
        "(line 1794,col 13)-(line 1794,col 30)",
        "(line 1795,col 13)-(line 1795,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.hasNext()",
      "begin_line": 1803,
      "end_line": 1805,
      "comment": "\n         * Has the iterator not reached the end date yet?\n         *\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has yet to reach the end date\n         ",
      "child_ranges": [
        "(line 1804,col 13)-(line 1804,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.next()",
      "begin_line": 1812,
      "end_line": 1818,
      "comment": "\n         * Return the next calendar in the iteration\n         *\n         * @return Object calendar for the next date\n         ",
      "child_ranges": [
        "(line 1813,col 13)-(line 1815,col 13)",
        "(line 1816,col 13)-(line 1816,col 39)",
        "(line 1817,col 13)-(line 1817,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.remove()",
      "begin_line": 1826,
      "end_line": 1828,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         * \n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 1827,col 13)-(line 1827,col 54)"
      ]
    }
  ]
}