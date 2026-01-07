{
  "filepath": "/tmp/Lang-59b/src/java/org/apache/commons/lang/time/DurationFormatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DurationFormatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 639,
      "comment": "\n * \u003cp\u003eDuration formatting utilities and constants. The following table describes the tokens \n * used in the pattern language for formatting. \u003c/p\u003e\n * \u003ctable border\u003d\"1\"\u003e\n *  \u003ctr\u003e\u003cth\u003echaracter\u003c/th\u003e\u003cth\u003eduration element\u003c/th\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003ey\u003c/td\u003e\u003ctd\u003eyears\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eM\u003c/td\u003e\u003ctd\u003emonths\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003ed\u003c/td\u003e\u003ctd\u003edays\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eH\u003c/td\u003e\u003ctd\u003ehours\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003em\u003c/td\u003e\u003ctd\u003eminutes\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003es\u003c/td\u003e\u003ctd\u003eseconds\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eS\u003c/td\u003e\u003ctd\u003emilliseconds\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @author Apache Ant - DateUtils\n * @author \u003ca href\u003d\"mailto:sbailliez@apache.org\"\u003eStephane Bailliez\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:stefan.bodewig@epost.de\"\u003eStefan Bodewig\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.DurationFormatUtils()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eDurationFormatUtils instances should NOT be constructed in standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO_EXTENDED_FORMAT_PATTERN"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * \u003cp\u003ePattern used with \u003ccode\u003eFastDateFormat\u003c/code\u003e and \u003ccode\u003eSimpleDateFormat\u003c/code\u003e\n     * for the ISO8601 period format used in durations.\u003c/p\u003e\n     * \n     * @see org.apache.commons.lang.time.FastDateFormat\n     * @see java.text.SimpleDateFormat\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS(long)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is ISO8601-like:\n     * \u003ci\u003eH\u003c/i\u003e:\u003ci\u003em\u003c/i\u003e:\u003ci\u003es\u003c/i\u003e.\u003ci\u003eS\u003c/i\u003e.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO(long)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is the ISO8601 period format.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * ISO format pattern, such as P7D6TH5M4.321S.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDuration(long, java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format, and padding with zeros and \n     * using the default timezone.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @param format  the way in which to format the duration\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDuration(long, java.lang.String, boolean)",
      "begin_line": 125,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional and \n     * the timezone may be specified.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @param format  the way in which to format the duration\n     * @param padWithZeros  whether to pad the left hand side of numbers with 0\u0027s\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)",
        "(line 129,col 9)-(line 129,col 29)",
        "(line 130,col 9)-(line 130,col 29)",
        "(line 131,col 9)-(line 131,col 29)",
        "(line 132,col 9)-(line 132,col 29)",
        "(line 133,col 9)-(line 133,col 29)",
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(long, boolean, boolean)",
      "begin_line": 169,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eFormats an elapsed time into a plurialization correct string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the elapsed time to report in milliseconds\n     * @param suppressLeadingZeroElements  suppresses leading 0 elements\n     * @param suppressTrailingZeroElements  suppresses trailing 0 elements\n     * @return the formatted text in days/hours/minutes/seconds\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 103)",
        "(line 178,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 34)",
        "(line 215,col 9)-(line 215,col 80)",
        "(line 216,col 9)-(line 216,col 80)",
        "(line 217,col 9)-(line 217,col 76)",
        "(line 218,col 9)-(line 218,col 74)",
        "(line 219,col 9)-(line 219,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(long, long)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is the ISO8601 period format.\u003c/p\u003e\n     * \n     * @param startMillis  the start of the duration to format\n     * @param endMillis  the end of the duration to format\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(long, long, java.lang.String)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional.\n     * \n     * @param startMillis  the start of the duration\n     * @param endMillis  the end of the duration\n     * @param format  the way in which to format the duration\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(long, long, java.lang.String, boolean, java.util.TimeZone)",
      "begin_line": 272,
      "end_line": 377,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional and \n     * the timezone may be specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eWhen calculating the difference between months/days, it chooses to \n     * calculate months first. So when working out the number of months and \n     * days between January 15th and March 10th, it choose 1 month and \n     * 23 days gained by choosing January-\u003eFebruary \u003d 1 month and then \n     * calculating days forwards, and not the 1 month and 26 days gained by \n     * choosing March -\u003e February \u003d 1 month and then calculating days \n     * backwards. \u003c/p\u003e\n     *\n     * \u003cp\u003eFor more control, the Joda Time library is recommended\n     * (\u003ca href\u003d\"http://joda-time.sf.net/\"). \u003c/p\u003e\n     * \n     * @param startMillis  the start of the duration\n     * @param endMillis  the end of the duration\n     * @param format  the way in which to format the duration\n     * @param padWithZeros whether to pad the left hand side of numbers with 0\u0027s\n     * @param timezone the millis are defined in\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 46)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 38)",
        "(line 284,col 9)-(line 284,col 56)",
        "(line 285,col 9)-(line 285,col 45)",
        "(line 286,col 9)-(line 286,col 54)",
        "(line 287,col 9)-(line 287,col 41)",
        "(line 290,col 9)-(line 290,col 91)",
        "(line 291,col 9)-(line 291,col 76)",
        "(line 292,col 9)-(line 292,col 76)",
        "(line 293,col 9)-(line 293,col 84)",
        "(line 294,col 9)-(line 294,col 85)",
        "(line 295,col 9)-(line 295,col 73)",
        "(line 296,col 9)-(line 296,col 70)",
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 328,col 9)",
        "(line 334,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.format(org.apache.commons.lang.time.DurationFormatUtils.Token[], int, int, int, int, int, int, int, boolean)",
      "begin_line": 394,
      "end_line": 447,
      "comment": "\n     * \u003cp\u003eThe internal method to do the formatting.\u003c/p\u003e\n     * \n     * @param tokens  the tokens\n     * @param years  the number of years\n     * @param months  the number of months\n     * @param days  the number of days\n     * @param hours  the number of hours\n     * @param minutes  the number of minutes\n     * @param seconds  the number of seconds\n     * @param milliseconds  the number of millis\n     * @param padWithZeros  whether to pad\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 49)",
        "(line 397,col 9)-(line 397,col 42)",
        "(line 398,col 9)-(line 398,col 31)",
        "(line 399,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "M"
      ],
      "begin_line": 450,
      "end_line": 450,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "H"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "S"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.lexx(java.lang.String)",
      "begin_line": 463,
      "end_line": 517,
      "comment": "\n     * Parses a classic date format string into Tokens\n     *\n     * @param format to parse\n     * @return Token[] of tokens\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 44)",
        "(line 465,col 9)-(line 465,col 73)",
        "(line 467,col 9)-(line 467,col 34)",
        "(line 468,col 9)-(line 468,col 35)",
        "(line 469,col 9)-(line 469,col 30)",
        "(line 470,col 9)-(line 470,col 30)",
        "(line 471,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 522,
      "end_line": 637,
      "comment": "\n     * Element that is parsed from the format pattern.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue(org.apache.commons.lang.time.DurationFormatUtils.Token[], java.lang.Object)",
      "begin_line": 531,
      "end_line": 539,
      "comment": "\n         * Helper method to determine if a set of tokens contain a value\n         *\n         * @param tokens set to look in\n         * @param value to look for\n         * @return boolean \u003ccode\u003etrue\u003c/code\u003e if contained\n         ",
      "child_ranges": [
        "(line 532,col 13)-(line 532,col 35)",
        "(line 533,col 13)-(line 537,col 13)",
        "(line 538,col 13)-(line 538,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.Token(java.lang.Object)",
      "begin_line": 549,
      "end_line": 552,
      "comment": "\n         * Wraps a token around a value. A value would be something like a \u0027Y\u0027.\n         *\n         * @param value to wrap\n         ",
      "child_ranges": [
        "(line 550,col 13)-(line 550,col 31)",
        "(line 551,col 13)-(line 551,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.Token(java.lang.Object, int)",
      "begin_line": 561,
      "end_line": 564,
      "comment": "\n         * Wraps a token around a repeated number of a value, for example it would \n         * store \u0027yyyy\u0027 as a value for y and a count of 4.\n         *\n         * @param value to wrap\n         * @param count to wrap\n         ",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 31)",
        "(line 563,col 13)-(line 563,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.increment()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n         * Adds another one of the value\n         ",
      "child_ranges": [
        "(line 570,col 13)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.getCount()",
      "begin_line": 578,
      "end_line": 580,
      "comment": "\n         * Gets the current number of values represented\n         *\n         * @return int number of values represented\n         ",
      "child_ranges": [
        "(line 579,col 13)-(line 579,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.getValue()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n         * Gets the particular value this token represents.\n         * \n         * @return Object value\n         ",
      "child_ranges": [
        "(line 588,col 13)-(line 588,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.equals(java.lang.Object)",
      "begin_line": 597,
      "end_line": 616,
      "comment": "\n         * Supports equality of this Token to another Token.\n         *\n         * @param obj2 Object to consider equality of\n         * @return boolean \u003ccode\u003etrue\u003c/code\u003e if equal\n         ",
      "child_ranges": [
        "(line 598,col 13)-(line 615,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.hashCode()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\n         * Returns a hashcode for the token equal to the \n         * hashcode for the token\u0027s value. Thus \u0027TT\u0027 and \u0027TTTT\u0027 \n         * will have the same hashcode. \n         *\n         * @return The hashcode for the token\n         ",
      "child_ranges": [
        "(line 626,col 13)-(line 626,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.toString()",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n         * Represents this token as a String.\n         *\n         * @return String representation of the token\n         ",
      "child_ranges": [
        "(line 635,col 13)-(line 635,col 73)"
      ]
    }
  ]
}