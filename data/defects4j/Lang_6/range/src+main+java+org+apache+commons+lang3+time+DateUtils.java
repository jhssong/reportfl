{
  "filepath": "/tmp/Lang-6b/src/main/java/org/apache/commons/lang3/time/DateUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 1888,
      "comment": "\n * \u003cp\u003eA suite of utilities surrounding the use of the\n * {@link java.util.Calendar} and {@link java.util.Date} object.\u003c/p\u003e\n * \n * \u003cp\u003eDateUtils contains a lot of common methods considering manipulations\n * of Dates or Calendars. Some methods require some extra explanation.\n * The truncate, ceiling and round methods could be considered the Math.floor(),\n * Math.ceil() or Math.round versions for dates\n * This way date-fields will be ignored in bottom-up order.\n * As a complement to these methods we\u0027ve introduced some fragment-methods.\n * With these methods the Date-fields will be ignored in top-down order.\n * Since a date without a year is not a valid date, you have to decide in what\n * kind of date-field you want your result, for instance milliseconds or days.\n * \u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Number of milliseconds in a standard second.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_MINUTE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Number of milliseconds in a standard minute.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_HOUR"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Number of milliseconds in a standard hour.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_DAY"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Number of milliseconds in a standard day.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEMI_MONTH"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * This is half a month, so this represents whether a date is in the top\n     * or bottom half of the month.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 75,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_SUNDAY"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * A week range, starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_WEEK_MONDAY"
      ],
      "begin_line": 94,
      "end_line": 94,
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
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * A week range, centered around the day focused.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_SUNDAY"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * A month range, the week starting on Sunday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_MONTH_MONDAY"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * A month range, the week starting on Monday.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_TRUNCATE"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Constant marker for truncating.\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_ROUND"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Constant marker for rounding.\n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_CEILING"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Constant marker for ceiling.\n     * @since 3.0\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateUtils()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003e{@code DateUtils} instances should NOT be constructed in\n     * standard programming. Instead, the static methods on the class should\n     * be used, such as {@code DateUtils.parseDate(str);}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Date, java.util.Date)",
      "begin_line": 154,
      "end_line": 163,
      "comment": "\n     * \u003cp\u003eChecks if two date objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 47)",
        "(line 159,col 9)-(line 159,col 28)",
        "(line 160,col 9)-(line 160,col 47)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 162,col 9)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameDay(java.util.Calendar, java.util.Calendar)",
      "begin_line": 178,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects are on the same day ignoring time.\u003c/p\u003e\n     *\n     * \u003cp\u003e28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.\n     * 28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.\n     * \u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same day\n     * @throws IllegalArgumentException if either calendar is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 184,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Date, java.util.Date)",
      "begin_line": 199,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eChecks if two date objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param date1  the first date, not altered, not null\n     * @param date2  the second date, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameInstant(java.util.Calendar, java.util.Calendar)",
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same instant in time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the long millisecond time of the two objects.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.isSameLocalTime(java.util.Calendar, java.util.Calendar)",
      "begin_line": 237,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eChecks if two calendar objects represent the same local time.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method compares the values of the fields of the two objects.\n     * In addition, both calendars must be the same of the same type.\u003c/p\u003e\n     * \n     * @param cal1  the first calendar, not altered, not null\n     * @param cal2  the second calendar, not altered, not null\n     * @return true if they represent the same millisecond instant\n     * @throws IllegalArgumentException if either date is \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 248,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDate(java.lang.String, java.lang.String...)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser will be lenient toward the parsed date.\n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable (or there were none)\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDate(java.lang.String, java.util.Locale, java.lang.String...)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers,\n     * using the default date format symbols for the given locale.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser will be lenient toward the parsed date.\n     * \n     * @param str  the date to parse, not null\n     * @param locale the locale whose date format symbols should be used. If \u003ccode\u003enull\u003c/code\u003e,\n     * the system locale is used (as per {@link #parseDate(String, String...)}).\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable (or there were none)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateStrictly(java.lang.String, java.lang.String...)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser parses strictly - it does not allow for dates such as \"February 942, 1996\". \n     * \n     * @param str  the date to parse, not null\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateStrictly(java.lang.String, java.util.Locale, java.lang.String...)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers,\n     * using the default date format symbols for the given locale..\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * The parser parses strictly - it does not allow for dates such as \"February 942, 1996\". \n     * \n     * @param str  the date to parse, not null\n     * @param locale the locale whose date format symbols should be used. If \u003ccode\u003enull\u003c/code\u003e,\n     * the system locale is used (as per {@link #parseDateStrictly(String, String...)}).\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.parseDateWithLeniency(java.lang.String, java.util.Locale, java.lang.String[], boolean)",
      "begin_line": 352,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eParses a string representing a date by trying a variety of different parsers.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe parse will try each parse pattern in turn.\n     * A parse is only deemed successful if it parses the whole of the input string.\n     * If no parse patterns match, a ParseException is thrown.\u003c/p\u003e\n     * \n     * @param str  the date to parse, not null\n     * @param locale the locale to use when interpretting the pattern, can be null in which\n     * case the default system locale is used\n     * @param parsePatterns  the date format patterns to use, see SimpleDateFormat, not null\n     * @param lenient Specify whether or not date/time parsing is to be lenient.\n     * @return the parsed date\n     * @throws IllegalArgumentException if the date string or pattern array is null\n     * @throws ParseException if none of the date patterns were suitable\n     * @see java.util.Calender#isLenient()\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 358,col 32)",
        "(line 359,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 35)",
        "(line 366,col 9)-(line 366,col 49)",
        "(line 367,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addYears(java.util.Date, int)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Adds a number of years to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMonths(java.util.Date, int)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Adds a number of months to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addWeeks(java.util.Date, int)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Adds a number of weeks to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addDays(java.util.Date, int)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * Adds a number of days to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addHours(java.util.Date, int)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n     * Adds a number of hours to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMinutes(java.util.Date, int)",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\n     * Adds a number of minutes to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addSeconds(java.util.Date, int)",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * Adds a number of seconds to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.addMilliseconds(java.util.Date, int)",
      "begin_line": 501,
      "end_line": 503,
      "comment": "\n     * Adds a number of milliseconds to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.add(java.util.Date, int, int)",
      "begin_line": 516,
      "end_line": 524,
      "comment": "\n     * Adds to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the calendar field to add to\n     * @param amount  the amount to add, may be negative\n     * @return the new {@code Date} with the amount added\n     * @throws IllegalArgumentException if the date is null\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 44)",
        "(line 521,col 9)-(line 521,col 24)",
        "(line 522,col 9)-(line 522,col 37)",
        "(line 523,col 9)-(line 523,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setYears(java.util.Date, int)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * Sets the years field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMonths(java.util.Date, int)",
      "begin_line": 552,
      "end_line": 554,
      "comment": "\n     * Sets the months field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setDays(java.util.Date, int)",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\n     * Sets the day of month field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setHours(java.util.Date, int)",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\n     * Sets the hours field to a date returning a new object.  Hours range \n     * from  0-23.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMinutes(java.util.Date, int)",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\n     * Sets the minute field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setSeconds(java.util.Date, int)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Sets the seconds field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.setMilliseconds(java.util.Date, int)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "\n     * Sets the miliseconds field to a date returning a new object.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.set(java.util.Date, int, int)",
      "begin_line": 645,
      "end_line": 655,
      "comment": "\n     * Sets the specified field to a date returning a new object.  \n     * This does not use a lenient calendar.\n     * The original {@code Date} is unchanged.\n     *\n     * @param date  the date, not null\n     * @param calendarField  the {@code Calendar} field to set the amount to\n     * @param amount the amount to set\n     * @return a new {@code Date} set with the specified value\n     * @throws IllegalArgumentException if the date is null\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 650,col 44)",
        "(line 651,col 9)-(line 651,col 28)",
        "(line 652,col 9)-(line 652,col 24)",
        "(line 653,col 9)-(line 653,col 37)",
        "(line 654,col 9)-(line 654,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.toCalendar(java.util.Date)",
      "begin_line": 666,
      "end_line": 670,
      "comment": "\n     * Converts a {@code Date} into a {@code Calendar}. \n     * \n     * @param date the date to convert to a Calendar\n     * @return the created Calendar\n     * @throws NullPointerException if null is passed in\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 44)",
        "(line 668,col 9)-(line 668,col 24)",
        "(line 669,col 9)-(line 669,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.util.Date, int)",
      "begin_line": 699,
      "end_line": 707,
      "comment": "\n     * \u003cp\u003eRounds a date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or {@code SEMI_MONTH}\n     * @return the different rounded date, not null\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 47)",
        "(line 704,col 9)-(line 704,col 27)",
        "(line 705,col 9)-(line 705,col 42)",
        "(line 706,col 9)-(line 706,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.util.Calendar, int)",
      "begin_line": 736,
      "end_line": 743,
      "comment": "\n     * \u003cp\u003eRounds a date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different rounded date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 51)",
        "(line 741,col 9)-(line 741,col 45)",
        "(line 742,col 9)-(line 742,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.round(java.lang.Object, int)",
      "begin_line": 773,
      "end_line": 784,
      "comment": "\n     * \u003cp\u003eRounds a date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if this was passed with HOUR, it would return\n     * 28 Mar 2002 14:00:00.000. If this was passed with MONTH, it\n     * would return 1 April 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor a date in a timezone that handles the change to daylight\n     * saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.\n     * Suppose daylight saving time begins at 02:00 on March 30. Rounding a \n     * date that crosses this time would produce the following values:\n     * \u003cul\u003e\n     * \u003cli\u003eMarch 30, 2003 01:10 rounds to March 30, 2003 01:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 01:40 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:10 rounds to March 30, 2003 03:00\u003c/li\u003e\n     * \u003cli\u003eMarch 30, 2003 02:40 rounds to March 30, 2003 04:00\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different rounded date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 783,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.util.Date, int)",
      "begin_line": 802,
      "end_line": 810,
      "comment": "\n     * \u003cp\u003eTruncates a date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different truncated date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 47)",
        "(line 807,col 9)-(line 807,col 27)",
        "(line 808,col 9)-(line 808,col 45)",
        "(line 809,col 9)-(line 809,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.util.Calendar, int)",
      "begin_line": 827,
      "end_line": 834,
      "comment": "\n     * \u003cp\u003eTruncates a date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different truncated date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 53)",
        "(line 832,col 9)-(line 832,col 50)",
        "(line 833,col 9)-(line 833,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncate(java.lang.Object, int)",
      "begin_line": 852,
      "end_line": 863,
      "comment": "\n     * \u003cp\u003eTruncates a date, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 13:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Mar 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different truncated date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 862,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Date, int)",
      "begin_line": 882,
      "end_line": 890,
      "comment": "\n     * \u003cp\u003eGets a date ceiling, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 14:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Apr 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different ceil date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 47)",
        "(line 887,col 9)-(line 887,col 27)",
        "(line 888,col 9)-(line 888,col 44)",
        "(line 889,col 9)-(line 889,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.util.Calendar, int)",
      "begin_line": 908,
      "end_line": 915,
      "comment": "\n     * \u003cp\u003eGets a date ceiling, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 14:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Apr 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different ceil date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 50)",
        "(line 913,col 9)-(line 913,col 46)",
        "(line 914,col 9)-(line 914,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.ceiling(java.lang.Object, int)",
      "begin_line": 934,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003eGets a date ceiling, leaving the field specified as the most\n     * significant field.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if you had the date-time of 28 Mar 2002\n     * 13:45:01.231, if you passed with HOUR, it would return 28 Mar\n     * 2002 14:00:00.000.  If this was passed with MONTH, it would\n     * return 1 Apr 2002 0:00:00.000.\u003c/p\u003e\n     * \n     * @param date  the date to work with, either {@code Date} or {@code Calendar}, not null\n     * @param field  the field from {@code Calendar} or \u003ccode\u003eSEMI_MONTH\u003c/code\u003e\n     * @return the different ceil date, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}\n     * @throws ArithmeticException if the year is over 280 million\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 944,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.modify(java.util.Calendar, int, int)",
      "begin_line": 956,
      "end_line": 1092,
      "comment": "\n     * \u003cp\u003eInternal calculation method.\u003c/p\u003e\n     * \n     * @param val  the calendar, not null\n     * @param field  the field constant\n     * @param modType  type to truncate, round or ceiling\n     * @throws ArithmeticException if the year is over 280 million\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 959,col 9)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 971,col 9)-(line 971,col 34)",
        "(line 972,col 9)-(line 972,col 35)",
        "(line 973,col 9)-(line 973,col 29)",
        "(line 976,col 9)-(line 976,col 54)",
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 982,col 9)",
        "(line 985,col 9)-(line 985,col 47)",
        "(line 986,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 991,col 9)",
        "(line 994,col 9)-(line 994,col 47)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 1000,col 9)-(line 1003,col 9)",
        "(line 1006,col 9)-(line 1006,col 32)",
        "(line 1007,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1090,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.util.Date, int)",
      "begin_line": 1119,
      "end_line": 1126,
      "comment": "\n     * \u003cp\u003eConstructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, not null\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator, not null, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1122,col 9)",
        "(line 1123,col 9)-(line 1123,col 47)",
        "(line 1124,col 9)-(line 1124,col 28)",
        "(line 1125,col 9)-(line 1125,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.util.Calendar, int)",
      "begin_line": 1152,
      "end_line": 1222,
      "comment": "\n     * \u003cp\u003eConstructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method provides an iterator that returns Calendar objects.\n     * The days are progressed using {@link Calendar#add(int, int)}.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, not null\n     * @param rangeStyle  the style constant to use. Must be one of\n     * {@link DateUtils#RANGE_MONTH_SUNDAY}, \n     * {@link DateUtils#RANGE_MONTH_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_SUNDAY},\n     * {@link DateUtils#RANGE_WEEK_MONDAY},\n     * {@link DateUtils#RANGE_WEEK_RELATIVE},\n     * {@link DateUtils#RANGE_WEEK_CENTER}\n     * @return the date iterator, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the rangeStyle is invalid\n     ",
      "child_ranges": [
        "(line 1153,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 30)",
        "(line 1157,col 9)-(line 1157,col 28)",
        "(line 1158,col 9)-(line 1158,col 42)",
        "(line 1159,col 9)-(line 1159,col 42)",
        "(line 1160,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1205,col 9)",
        "(line 1206,col 9)-(line 1208,col 9)",
        "(line 1209,col 9)-(line 1211,col 9)",
        "(line 1212,col 9)-(line 1214,col 9)",
        "(line 1215,col 9)-(line 1217,col 9)",
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1221,col 9)-(line 1221,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.iterator(java.lang.Object, int)",
      "begin_line": 1240,
      "end_line": 1251,
      "comment": "\n     * \u003cp\u003eConstructs an \u003ccode\u003eIterator\u003c/code\u003e over each day in a date\n     * range defined by a focus date and range style.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor instance, passing Thursday, July 4, 2002 and a\n     * \u003ccode\u003eRANGE_MONTH_SUNDAY\u003c/code\u003e will return an \u003ccode\u003eIterator\u003c/code\u003e\n     * that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,\n     * 2002, returning a Calendar instance for each intermediate day.\u003c/p\u003e\n     *\n     * @param focus  the date to work with, either {@code Date} or {@code Calendar}, not null\n     * @param rangeStyle  the style constant to use. Must be one of the range\n     * styles listed for the {@link #iterator(Calendar, int)} method.\n     * @return the date iterator, not null\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the object type is not a {@code Date} or {@code Calendar}\n     ",
      "child_ranges": [
        "(line 1241,col 9)-(line 1243,col 9)",
        "(line 1244,col 9)-(line 1250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Date, int)",
      "begin_line": 1286,
      "end_line": 1288,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e\n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of milliseconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all milliseconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e\n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538 (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1287,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Date, int)",
      "begin_line": 1326,
      "end_line": 1328,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to deprecated date.getSeconds())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or\n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Date, int)",
      "begin_line": 1366,
      "end_line": 1368,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to deprecated date.getMinutes())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1367,col 9)-(line 1367,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Date, int)",
      "begin_line": 1406,
      "end_line": 1408,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to deprecated date.getHours())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1407,col 9)-(line 1407,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Date, int)",
      "begin_line": 1446,
      "end_line": 1448,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to deprecated date.getDay())\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param date the date to work with, not null\n     * @param fragment the {@code Calendar} field part of date to calculate \n     * @return number of days  within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1447,col 9)-(line 1447,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(java.util.Calendar, int)",
      "begin_line": 1486,
      "end_line": 1488,
      "comment": "\n     * \u003cp\u003eReturns the number of milliseconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the milliseconds of any date will only return the number of milliseconds\n     * of the current second (resulting in a number between 0 and 999). This \n     * method will retrieve the number of milliseconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s), minutes(s) and second(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MILLISECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538\n     *   (equivalent to calendar.get(Calendar.MILLISECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538\n     *   (10*1000 + 538)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in milliseconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of milliseconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1487,col 5)-(line 1487,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(java.util.Calendar, int)",
      "begin_line": 1525,
      "end_line": 1527,
      "comment": "\n     * \u003cp\u003eReturns the number of seconds within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the seconds of any date will only return the number of seconds\n     * of the current minute (resulting in a number between 0 and 59). This \n     * method will retrieve the number of seconds for any fragment. \n     * For example, if you want to calculate the number of seconds past today, \n     * your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will\n     * be all seconds of the past hour(s) and minutes(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a SECOND field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10\n     *   (equivalent to calendar.get(Calendar.SECOND))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110\n     *   (7*3600 + 15*60 + 10)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in seconds)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of seconds within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1526,col 9)-(line 1526,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(java.util.Calendar, int)",
      "begin_line": 1565,
      "end_line": 1567,
      "comment": "\n     * \u003cp\u003eReturns the number of minutes within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the minutes of any date will only return the number of minutes\n     * of the current hour (resulting in a number between 0 and 59). This \n     * method will retrieve the number of minutes for any fragment. \n     * For example, if you want to calculate the number of minutes past this month, \n     * your fragment is Calendar.MONTH. The result will be all minutes of the \n     * past day(s) and hour(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a MINUTE field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15\n     *   (equivalent to calendar.get(Calendar.MINUTES))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60 + 15)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in minutes)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of minutes within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1566,col 9)-(line 1566,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInHours(java.util.Calendar, int)",
      "begin_line": 1605,
      "end_line": 1607,
      "comment": "\n     * \u003cp\u003eReturns the number of hours within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the hours of any date will only return the number of hours\n     * of the current day (resulting in a number between 0 and 23). This \n     * method will retrieve the number of hours for any fragment. \n     * For example, if you want to calculate the number of hours past this month, \n     * your fragment is Calendar.MONTH. The result will be all hours of the \n     * past day(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a HOUR field will return 0.\u003c/p\u003e \n     *  \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7\n     *   (equivalent to calendar.get(Calendar.HOUR_OF_DAY))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7\u003c/li\u003e\n     *  \u003cli\u003eJanuary 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24 + 7)\u003c/li\u003e\n     *  \u003cli\u003eJanuary 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in hours)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *  \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of hours within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1606,col 9)-(line 1606,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragmentInDays(java.util.Calendar, int)",
      "begin_line": 1647,
      "end_line": 1649,
      "comment": "\n     * \u003cp\u003eReturns the number of days within the \n     * fragment. All datefields greater than the fragment will be ignored.\u003c/p\u003e \n     * \n     * \u003cp\u003eAsking the days of any date will only return the number of days\n     * of the current month (resulting in a number between 1 and 31). This \n     * method will retrieve the number of days for any fragment. \n     * For example, if you want to calculate the number of days past this year, \n     * your fragment is Calendar.YEAR. The result will be all days of the \n     * past month(s).\u003c/p\u003e \n     * \n     * \u003cp\u003eValid fragments are: Calendar.YEAR, Calendar.MONTH, both \n     * Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY, \n     * Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND\n     * A fragment less than or equal to a DAY field will return 0.\u003c/p\u003e \n     * \n     * \u003cp\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.MONTH as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_MONTH))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.YEAR as fragment will return 28\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eFebruary 28, 2008 with Calendar.YEAR as fragment will return 59\n     *   (equivalent to calendar.get(Calendar.DAY_OF_YEAR))\u003c/li\u003e\n     *  \u003cli\u003eJanuary 28, 2008 with Calendar.MILLISECOND as fragment will return 0\n     *   (a millisecond cannot be split in days)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the {@code Calendar} field part of calendar to calculate \n     * @return number of days within the fragment of date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1648,col 9)-(line 1648,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragment(java.util.Date, int, int)",
      "begin_line": 1662,
      "end_line": 1669,
      "comment": "\n     * Gets a Date fragment for any unit.\n     * \n     * @param date the date to work with, not null\n     * @param fragment the Calendar field part of date to calculate \n     * @param unit the {@code Calendar} field defining the unit\n     * @return number of units within the fragment of the date\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1663,col 9)-(line 1665,col 9)",
        "(line 1666,col 9)-(line 1666,col 51)",
        "(line 1667,col 9)-(line 1667,col 31)",
        "(line 1668,col 9)-(line 1668,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getFragment(java.util.Calendar, int, int)",
      "begin_line": 1682,
      "end_line": 1722,
      "comment": "\n     * Gets a Calendar fragment for any unit.\n     * \n     * @param calendar the calendar to work with, not null\n     * @param fragment the Calendar field part of calendar to calculate \n     * @param unit the {@code Calendar} field defining the unit\n     * @return number of units within the fragment of the calendar\n     * @throws IllegalArgumentException if the date is \u003ccode\u003enull\u003c/code\u003e or \n     * fragment is not supported\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1683,col 9)-(line 1685,col 9)",
        "(line 1686,col 9)-(line 1686,col 52)",
        "(line 1687,col 9)-(line 1687,col 24)",
        "(line 1690,col 9)-(line 1697,col 9)",
        "(line 1699,col 9)-(line 1720,col 9)",
        "(line 1721,col 9)-(line 1721,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Calendar, java.util.Calendar, int)",
      "begin_line": 1737,
      "end_line": 1739,
      "comment": "\n     * Determines if two calendars are equal up to no more than the specified \n     * most significant field.\n     * \n     * @param cal1 the first calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param cal2 the second calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from {@code Calendar}\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal; otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedEquals(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1738,col 9)-(line 1738,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedEquals(java.util.Date, java.util.Date, int)",
      "begin_line": 1754,
      "end_line": 1756,
      "comment": "\n     * Determines if two dates are equal up to no more than the specified \n     * most significant field.\n     * \n     * @param date1 the first date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param date2 the second date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from {@code Calendar}\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal; otherwise \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Date, int)\n     * @see #truncatedEquals(Calendar, Calendar, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1755,col 9)-(line 1755,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(java.util.Calendar, java.util.Calendar, int)",
      "begin_line": 1772,
      "end_line": 1776,
      "comment": "\n     * Determines how two calendars compare up to no more than the specified \n     * most significant field.\n     * \n     * @param cal1 the first calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param cal2 the second calendar, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from {@code Calendar}\n     * @return a negative integer, zero, or a positive integer as the first \n     * calendar is less than, equal to, or greater than the second.\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedCompareTo(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1773,col 9)-(line 1773,col 55)",
        "(line 1774,col 9)-(line 1774,col 55)",
        "(line 1775,col 9)-(line 1775,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(java.util.Date, java.util.Date, int)",
      "begin_line": 1792,
      "end_line": 1796,
      "comment": "\n     * Determines how two dates compare up to no more than the specified \n     * most significant field.\n     * \n     * @param date1 the first date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param date2 the second date, not \u003ccode\u003enull\u003c/code\u003e\n     * @param field the field from \u003ccode\u003eCalendar\u003c/code\u003e\n     * @return a negative integer, zero, or a positive integer as the first \n     * date is less than, equal to, or greater than the second.\n     * @throws IllegalArgumentException if any argument is \u003ccode\u003enull\u003c/code\u003e\n     * @see #truncate(Calendar, int)\n     * @see #truncatedCompareTo(Date, Date, int)\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1793,col 9)-(line 1793,col 53)",
        "(line 1794,col 9)-(line 1794,col 53)",
        "(line 1795,col 9)-(line 1795,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.getMillisPerUnit(int)",
      "begin_line": 1807,
      "end_line": 1829,
      "comment": "\n     * Returns the number of milliseconds of a {@code Calendar} field, if this is a constant value.\n     * This handles millisecond, second, minute, hour and day (even though days can very in length).\n     * \n     * @param unit  a {@code Calendar} field constant which is a valid unit for a fragment\n     * @return the number of milliseconds in the field\n     * @throws IllegalArgumentException if date can\u0027t be represented in milliseconds\n     * @since 2.4 \n     ",
      "child_ranges": [
        "(line 1808,col 9)-(line 1808,col 37)",
        "(line 1809,col 9)-(line 1827,col 9)",
        "(line 1828,col 9)-(line 1828,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DateIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Calendar\u003e"
      ],
      "begin_line": 1835,
      "end_line": 1886,
      "comment": "\n     * \u003cp\u003eDate iterator.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endFinal"
      ],
      "begin_line": 1836,
      "end_line": 1836,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spot"
      ],
      "begin_line": 1837,
      "end_line": 1837,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.DateIterator(java.util.Calendar, java.util.Calendar)",
      "begin_line": 1845,
      "end_line": 1850,
      "comment": "\n         * Constructs a DateIterator that ranges from one date to another. \n         *\n         * @param startFinal start date (inclusive)\n         * @param endFinal end date (inclusive)\n         ",
      "child_ranges": [
        "(line 1846,col 13)-(line 1846,col 20)",
        "(line 1847,col 13)-(line 1847,col 37)",
        "(line 1848,col 13)-(line 1848,col 30)",
        "(line 1849,col 13)-(line 1849,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.hasNext()",
      "begin_line": 1857,
      "end_line": 1860,
      "comment": "\n         * Has the iterator not reached the end date yet?\n         *\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the iterator has yet to reach the end date\n         ",
      "child_ranges": [
        "(line 1859,col 13)-(line 1859,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.next()",
      "begin_line": 1867,
      "end_line": 1874,
      "comment": "\n         * Return the next calendar in the iteration\n         *\n         * @return Object calendar for the next date\n         ",
      "child_ranges": [
        "(line 1869,col 13)-(line 1871,col 13)",
        "(line 1872,col 13)-(line 1872,col 39)",
        "(line 1873,col 13)-(line 1873,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtils.DateIterator.remove()",
      "begin_line": 1882,
      "end_line": 1885,
      "comment": "\n         * Always throws UnsupportedOperationException.\n         * \n         * @throws UnsupportedOperationException\n         * @see java.util.Iterator#remove()\n         ",
      "child_ranges": [
        "(line 1884,col 13)-(line 1884,col 54)"
      ]
    }
  ]
}