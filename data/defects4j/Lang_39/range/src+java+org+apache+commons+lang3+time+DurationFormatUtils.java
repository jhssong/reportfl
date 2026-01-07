{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/time/DurationFormatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DurationFormatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 668,
      "comment": "\n * \u003cp\u003eDuration formatting utilities and constants. The following table describes the tokens \n * used in the pattern language for formatting. \u003c/p\u003e\n * \u003ctable border\u003d\"1\"\u003e\n *  \u003ctr\u003e\u003cth\u003echaracter\u003c/th\u003e\u003cth\u003eduration element\u003c/th\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003ey\u003c/td\u003e\u003ctd\u003eyears\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eM\u003c/td\u003e\u003ctd\u003emonths\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003ed\u003c/td\u003e\u003ctd\u003edays\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eH\u003c/td\u003e\u003ctd\u003ehours\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003em\u003c/td\u003e\u003ctd\u003eminutes\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003es\u003c/td\u003e\u003ctd\u003eseconds\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eS\u003c/td\u003e\u003ctd\u003emilliseconds\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @author Apache Software Foundation\n * @author Apache Ant - DateUtils\n * @author \u003ca href\u003d\"mailto:sbailliez@apache.org\"\u003eStephane Bailliez\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:stefan.bodewig@epost.de\"\u003eStefan Bodewig\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.DurationFormatUtils()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * \u003cp\u003eDurationFormatUtils instances should NOT be constructed in standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ISO_EXTENDED_FORMAT_PATTERN"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003ePattern used with \u003ccode\u003eFastDateFormat\u003c/code\u003e and \u003ccode\u003eSimpleDateFormat\u003c/code\u003e\n     * for the ISO8601 period format used in durations.\u003c/p\u003e\n     * \n     * @see org.apache.commons.lang3.time.FastDateFormat\n     * @see java.text.SimpleDateFormat\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(long)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is ISO8601-like:\n     * \u003ci\u003eH\u003c/i\u003e:\u003ci\u003em\u003c/i\u003e:\u003ci\u003es\u003c/i\u003e.\u003ci\u003eS\u003c/i\u003e.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO(long)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is the ISO8601 period format.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * ISO format pattern, such as P7D6TH5M4.321S.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(long, java.lang.String)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format, and padding with zeros and \n     * using the default timezone.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @param format  the way in which to format the duration\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(long, java.lang.String, boolean)",
      "begin_line": 127,
      "end_line": 158,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional and \n     * the timezone may be specified.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @param format  the way in which to format the duration\n     * @param padWithZeros  whether to pad the left hand side of numbers with 0\u0027s\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 38)",
        "(line 131,col 9)-(line 131,col 29)",
        "(line 132,col 9)-(line 132,col 29)",
        "(line 133,col 9)-(line 133,col 29)",
        "(line 134,col 9)-(line 134,col 29)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 137,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(long, boolean, boolean)",
      "begin_line": 171,
      "end_line": 222,
      "comment": "\n     * \u003cp\u003eFormats an elapsed time into a plurialization correct string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the elapsed time to report in milliseconds\n     * @param suppressLeadingZeroElements  suppresses leading 0 elements\n     * @param suppressTrailingZeroElements  suppresses trailing 0 elements\n     * @return the formatted text in days/hours/minutes/seconds\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 103)",
        "(line 180,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 34)",
        "(line 217,col 9)-(line 217,col 80)",
        "(line 218,col 9)-(line 218,col 80)",
        "(line 219,col 9)-(line 219,col 76)",
        "(line 220,col 9)-(line 220,col 74)",
        "(line 221,col 9)-(line 221,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(long, long)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is the ISO8601 period format.\u003c/p\u003e\n     * \n     * @param startMillis  the start of the duration to format\n     * @param endMillis  the end of the duration to format\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(long, long, java.lang.String)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional.\n     * \n     * @param startMillis  the start of the duration\n     * @param endMillis  the end of the duration\n     * @param format  the way in which to format the duration\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(long, long, java.lang.String, boolean, java.util.TimeZone)",
      "begin_line": 274,
      "end_line": 404,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional and \n     * the timezone may be specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eWhen calculating the difference between months/days, it chooses to \n     * calculate months first. So when working out the number of months and \n     * days between January 15th and March 10th, it choose 1 month and \n     * 23 days gained by choosing January-\u003eFebruary \u003d 1 month and then \n     * calculating days forwards, and not the 1 month and 26 days gained by \n     * choosing March -\u003e February \u003d 1 month and then calculating days \n     * backwards. \u003c/p\u003e\n     *\n     * \u003cp\u003eFor more control, the \u003ca href\u003d\"http://joda-time.sf.net/\"\u003eJoda-Time\u003c/a\u003e\n     * library is recommended.\u003c/p\u003e\n     * \n     * @param startMillis  the start of the duration\n     * @param endMillis  the end of the duration\n     * @param format  the way in which to format the duration\n     * @param padWithZeros whether to pad the left hand side of numbers with 0\u0027s\n     * @param timezone the millis are defined in\n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 38)",
        "(line 287,col 9)-(line 287,col 56)",
        "(line 288,col 9)-(line 288,col 45)",
        "(line 289,col 9)-(line 289,col 54)",
        "(line 290,col 9)-(line 290,col 41)",
        "(line 293,col 9)-(line 293,col 91)",
        "(line 294,col 9)-(line 294,col 76)",
        "(line 295,col 9)-(line 295,col 76)",
        "(line 296,col 9)-(line 296,col 84)",
        "(line 297,col 9)-(line 297,col 85)",
        "(line 298,col 9)-(line 298,col 73)",
        "(line 299,col 9)-(line 299,col 70)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 380,col 9)",
        "(line 386,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 403,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.format(org.apache.commons.lang3.time.DurationFormatUtils.Token[], int, int, int, int, int, int, int, boolean)",
      "begin_line": 421,
      "end_line": 474,
      "comment": "\n     * \u003cp\u003eThe internal method to do the formatting.\u003c/p\u003e\n     * \n     * @param tokens  the tokens\n     * @param years  the number of years\n     * @param months  the number of months\n     * @param days  the number of days\n     * @param hours  the number of hours\n     * @param minutes  the number of minutes\n     * @param seconds  the number of seconds\n     * @param milliseconds  the number of millis\n     * @param padWithZeros  whether to pad\n     * @return the formatted string\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 49)",
        "(line 424,col 9)-(line 424,col 42)",
        "(line 425,col 9)-(line 425,col 31)",
        "(line 426,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 476,
      "end_line": 476,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "M"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "H"
      ],
      "begin_line": 479,
      "end_line": 479,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 480,
      "end_line": 480,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 481,
      "end_line": 481,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "S"
      ],
      "begin_line": 482,
      "end_line": 482,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.lexx(java.lang.String)",
      "begin_line": 490,
      "end_line": 544,
      "comment": "\n     * Parses a classic date format string into Tokens\n     *\n     * @param format to parse\n     * @return array of Token[]\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 44)",
        "(line 492,col 9)-(line 492,col 67)",
        "(line 494,col 9)-(line 494,col 34)",
        "(line 495,col 9)-(line 495,col 35)",
        "(line 496,col 9)-(line 496,col 30)",
        "(line 497,col 9)-(line 497,col 30)",
        "(line 498,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 549,
      "end_line": 666,
      "comment": "\n     * Element that is parsed from the format pattern.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(org.apache.commons.lang3.time.DurationFormatUtils.Token[], java.lang.Object)",
      "begin_line": 558,
      "end_line": 566,
      "comment": "\n         * Helper method to determine if a set of tokens contain a value\n         *\n         * @param tokens set to look in\n         * @param value to look for\n         * @return boolean \u003ccode\u003etrue\u003c/code\u003e if contained\n         ",
      "child_ranges": [
        "(line 559,col 13)-(line 559,col 35)",
        "(line 560,col 13)-(line 564,col 13)",
        "(line 565,col 13)-(line 565,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 568,
      "end_line": 568,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 569,
      "end_line": 569,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.Token(java.lang.Object)",
      "begin_line": 576,
      "end_line": 579,
      "comment": "\n         * Wraps a token around a value. A value would be something like a \u0027Y\u0027.\n         *\n         * @param value to wrap\n         ",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 31)",
        "(line 578,col 13)-(line 578,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.Token(java.lang.Object, int)",
      "begin_line": 588,
      "end_line": 591,
      "comment": "\n         * Wraps a token around a repeated number of a value, for example it would \n         * store \u0027yyyy\u0027 as a value for y and a count of 4.\n         *\n         * @param value to wrap\n         * @param count to wrap\n         ",
      "child_ranges": [
        "(line 589,col 13)-(line 589,col 31)",
        "(line 590,col 13)-(line 590,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.increment()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n         * Adds another one of the value\n         ",
      "child_ranges": [
        "(line 597,col 13)-(line 597,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.getCount()",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\n         * Gets the current number of values represented\n         *\n         * @return int number of values represented\n         ",
      "child_ranges": [
        "(line 606,col 13)-(line 606,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.getValue()",
      "begin_line": 614,
      "end_line": 616,
      "comment": "\n         * Gets the particular value this token represents.\n         * \n         * @return Object value\n         ",
      "child_ranges": [
        "(line 615,col 13)-(line 615,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.equals(java.lang.Object)",
      "begin_line": 624,
      "end_line": 643,
      "comment": "\n         * Supports equality of this Token to another Token.\n         *\n         * @param obj2 Object to consider equality of\n         * @return boolean \u003ccode\u003etrue\u003c/code\u003e if equal\n         ",
      "child_ranges": [
        "(line 626,col 13)-(line 641,col 13)",
        "(line 642,col 13)-(line 642,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.hashCode()",
      "begin_line": 652,
      "end_line": 655,
      "comment": "\n         * Returns a hashcode for the token equal to the \n         * hashcode for the token\u0027s value. Thus \u0027TT\u0027 and \u0027TTTT\u0027 \n         * will have the same hashcode. \n         *\n         * @return The hashcode for the token\n         ",
      "child_ranges": [
        "(line 654,col 13)-(line 654,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DurationFormatUtils.Token.toString()",
      "begin_line": 662,
      "end_line": 665,
      "comment": "\n         * Represents this token as a String.\n         *\n         * @return String representation of the token\n         ",
      "child_ranges": [
        "(line 664,col 13)-(line 664,col 73)"
      ]
    }
  ]
}