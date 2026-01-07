{
  "filepath": "/tmp/Lang-5b/src/test/java/org/apache/commons/lang3/time/DateUtilsRoundingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsRoundingTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 727,
      "comment": "\n * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.\n * The extremes are tested at the switch-point in milliseconds\n * \n * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th\n * When rounding Calendar.MONTH it depends on the number of days within that month.\n * A month with 28 days will be rounded up from the 15th\n * A month with 29 or 30 days will be rounded up from the 16th\n * A month with 31 days will be rounded up from the 17th\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dateTimeParser"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneDate"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetYearDate"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetDateDate",
        "targetDayOfMonthDate",
        "targetAmDate",
        "targetPmDate"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "No targetMonths, these must be tested for every type of month(28-31 days)"
    },
    {
      "type": "field",
      "varNames": [
        "targetHourOfDayDate",
        "targetHourDate"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMinuteDate"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetSecondDate"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMilliSecondDate"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneCalendar"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fdf"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.setUp()",
      "begin_line": 58,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 90)",
        "(line 63,col 9)-(line 63,col 77)",
        "(line 64,col 9)-(line 64,col 97)",
        "(line 65,col 9)-(line 65,col 73)",
        "(line 66,col 9)-(line 66,col 73)",
        "(line 67,col 9)-(line 67,col 74)",
        "(line 68,col 9)-(line 68,col 79)",
        "(line 69,col 9)-(line 69,col 77)",
        "(line 70,col 9)-(line 70,col 77)",
        "(line 71,col 9)-(line 71,col 82)",
        "(line 73,col 9)-(line 73,col 77)",
        "(line 74,col 9)-(line 74,col 52)",
        "(line 75,col 9)-(line 75,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundYear()",
      "begin_line": 84,
      "end_line": 91,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.Year\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 81)",
        "(line 88,col 9)-(line 88,col 46)",
        "(line 89,col 9)-(line 89,col 86)",
        "(line 90,col 9)-(line 90,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMonth()",
      "begin_line": 101,
      "end_line": 135,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days\n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 49)",
        "(line 104,col 9)-(line 104,col 65)",
        "(line 105,col 9)-(line 105,col 30)",
        "(line 108,col 9)-(line 108,col 74)",
        "(line 109,col 9)-(line 109,col 79)",
        "(line 110,col 9)-(line 110,col 85)",
        "(line 111,col 9)-(line 111,col 91)",
        "(line 114,col 9)-(line 114,col 74)",
        "(line 115,col 9)-(line 115,col 79)",
        "(line 116,col 9)-(line 116,col 85)",
        "(line 117,col 9)-(line 117,col 91)",
        "(line 120,col 9)-(line 120,col 72)",
        "(line 121,col 9)-(line 121,col 76)",
        "(line 122,col 9)-(line 122,col 82)",
        "(line 123,col 9)-(line 123,col 91)",
        "(line 126,col 9)-(line 126,col 73)",
        "(line 127,col 9)-(line 127,col 74)",
        "(line 128,col 9)-(line 128,col 80)",
        "(line 129,col 9)-(line 129,col 91)",
        "(line 132,col 9)-(line 132,col 73)",
        "(line 133,col 9)-(line 133,col 72)",
        "(line 134,col 9)-(line 134,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSemiMonth()",
      "begin_line": 145,
      "end_line": 203,
      "comment": "\n     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half \n     * Includes rounding to January 1\n     *      \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 55)",
        "(line 148,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 149,col 30)",
        "(line 152,col 9)-(line 152,col 78)",
        "(line 153,col 9)-(line 153,col 79)",
        "(line 154,col 9)-(line 154,col 84)",
        "(line 155,col 9)-(line 155,col 91)",
        "(line 158,col 9)-(line 158,col 74)",
        "(line 159,col 9)-(line 159,col 80)",
        "(line 160,col 9)-(line 160,col 85)",
        "(line 161,col 9)-(line 161,col 91)",
        "(line 164,col 9)-(line 164,col 78)",
        "(line 165,col 9)-(line 165,col 79)",
        "(line 166,col 9)-(line 166,col 84)",
        "(line 167,col 9)-(line 167,col 91)",
        "(line 170,col 9)-(line 170,col 74)",
        "(line 171,col 9)-(line 171,col 80)",
        "(line 172,col 9)-(line 172,col 85)",
        "(line 173,col 9)-(line 173,col 91)",
        "(line 176,col 9)-(line 176,col 75)",
        "(line 177,col 9)-(line 177,col 76)",
        "(line 178,col 9)-(line 178,col 81)",
        "(line 179,col 9)-(line 179,col 91)",
        "(line 182,col 9)-(line 182,col 72)",
        "(line 183,col 9)-(line 183,col 77)",
        "(line 184,col 9)-(line 184,col 82)",
        "(line 185,col 9)-(line 185,col 91)",
        "(line 188,col 9)-(line 188,col 73)",
        "(line 189,col 9)-(line 189,col 74)",
        "(line 190,col 9)-(line 190,col 79)",
        "(line 191,col 9)-(line 191,col 91)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 195,col 9)-(line 195,col 75)",
        "(line 196,col 9)-(line 196,col 80)",
        "(line 197,col 9)-(line 197,col 91)",
        "(line 200,col 9)-(line 200,col 73)",
        "(line 201,col 9)-(line 201,col 71)",
        "(line 202,col 9)-(line 202,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDate()",
      "begin_line": 213,
      "end_line": 228,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DATE\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 48)",
        "(line 216,col 9)-(line 216,col 65)",
        "(line 217,col 9)-(line 217,col 30)",
        "(line 219,col 9)-(line 219,col 73)",
        "(line 220,col 9)-(line 220,col 41)",
        "(line 221,col 9)-(line 221,col 80)",
        "(line 222,col 9)-(line 222,col 91)",
        "(line 225,col 9)-(line 225,col 73)",
        "(line 226,col 9)-(line 226,col 71)",
        "(line 227,col 9)-(line 227,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDayOfMonth()",
      "begin_line": 238,
      "end_line": 253,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 56)",
        "(line 241,col 9)-(line 241,col 65)",
        "(line 242,col 9)-(line 242,col 30)",
        "(line 244,col 9)-(line 244,col 73)",
        "(line 245,col 9)-(line 245,col 47)",
        "(line 246,col 9)-(line 246,col 80)",
        "(line 247,col 9)-(line 247,col 91)",
        "(line 250,col 9)-(line 250,col 73)",
        "(line 251,col 9)-(line 251,col 71)",
        "(line 252,col 9)-(line 252,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundAmPm()",
      "begin_line": 263,
      "end_line": 285,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.AM_PM\n     * Includes rounding the extremes of both AM and PM of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 49)",
        "(line 266,col 9)-(line 266,col 65)",
        "(line 267,col 9)-(line 267,col 30)",
        "(line 270,col 9)-(line 270,col 74)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 79)",
        "(line 273,col 9)-(line 273,col 91)",
        "(line 276,col 9)-(line 276,col 73)",
        "(line 277,col 9)-(line 277,col 39)",
        "(line 278,col 9)-(line 278,col 80)",
        "(line 279,col 9)-(line 279,col 91)",
        "(line 282,col 9)-(line 282,col 73)",
        "(line 283,col 9)-(line 283,col 70)",
        "(line 284,col 9)-(line 284,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHourOfDay()",
      "begin_line": 295,
      "end_line": 310,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 55)",
        "(line 298,col 9)-(line 298,col 65)",
        "(line 299,col 9)-(line 299,col 30)",
        "(line 301,col 9)-(line 301,col 73)",
        "(line 302,col 9)-(line 302,col 46)",
        "(line 303,col 9)-(line 303,col 79)",
        "(line 304,col 9)-(line 304,col 91)",
        "(line 307,col 9)-(line 307,col 73)",
        "(line 308,col 9)-(line 308,col 70)",
        "(line 309,col 9)-(line 309,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHour()",
      "begin_line": 320,
      "end_line": 335,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 48)",
        "(line 323,col 9)-(line 323,col 65)",
        "(line 324,col 9)-(line 324,col 30)",
        "(line 326,col 9)-(line 326,col 73)",
        "(line 327,col 9)-(line 327,col 41)",
        "(line 328,col 9)-(line 328,col 79)",
        "(line 329,col 9)-(line 329,col 91)",
        "(line 332,col 9)-(line 332,col 73)",
        "(line 333,col 9)-(line 333,col 70)",
        "(line 334,col 9)-(line 334,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMinute()",
      "begin_line": 345,
      "end_line": 360,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MINUTE\n     * Includes rounding the extremes of one minute \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 50)",
        "(line 348,col 9)-(line 348,col 65)",
        "(line 349,col 9)-(line 349,col 30)",
        "(line 351,col 9)-(line 351,col 73)",
        "(line 352,col 9)-(line 352,col 43)",
        "(line 353,col 9)-(line 353,col 79)",
        "(line 354,col 9)-(line 354,col 91)",
        "(line 357,col 9)-(line 357,col 73)",
        "(line 358,col 9)-(line 358,col 70)",
        "(line 359,col 9)-(line 359,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSecond()",
      "begin_line": 370,
      "end_line": 385,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.SECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 50)",
        "(line 373,col 9)-(line 373,col 65)",
        "(line 374,col 9)-(line 374,col 30)",
        "(line 376,col 9)-(line 376,col 73)",
        "(line 377,col 9)-(line 377,col 43)",
        "(line 378,col 9)-(line 378,col 79)",
        "(line 379,col 9)-(line 379,col 91)",
        "(line 382,col 9)-(line 382,col 73)",
        "(line 383,col 9)-(line 383,col 70)",
        "(line 384,col 9)-(line 384,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMilliSecond()",
      "begin_line": 395,
      "end_line": 408,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MILLISECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 55)",
        "(line 398,col 9)-(line 398,col 65)",
        "(line 399,col 9)-(line 399,col 30)",
        "(line 401,col 9)-(line 401,col 70)",
        "(line 402,col 9)-(line 402,col 73)",
        "(line 403,col 9)-(line 403,col 91)",
        "(line 406,col 9)-(line 406,col 43)",
        "(line 407,col 9)-(line 407,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateYear()",
      "begin_line": 416,
      "end_line": 421,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.YEAR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 48)",
        "(line 419,col 9)-(line 419,col 87)",
        "(line 420,col 9)-(line 420,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMonth()",
      "begin_line": 429,
      "end_line": 435,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 49)",
        "(line 432,col 9)-(line 432,col 79)",
        "(line 433,col 9)-(line 433,col 84)",
        "(line 434,col 9)-(line 434,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSemiMonth()",
      "begin_line": 444,
      "end_line": 489,
      "comment": "\n     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH\n     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 55)",
        "(line 447,col 9)-(line 447,col 45)",
        "(line 450,col 9)-(line 450,col 77)",
        "(line 451,col 9)-(line 451,col 82)",
        "(line 452,col 9)-(line 452,col 73)",
        "(line 455,col 9)-(line 455,col 78)",
        "(line 456,col 9)-(line 456,col 82)",
        "(line 457,col 9)-(line 457,col 73)",
        "(line 460,col 9)-(line 460,col 77)",
        "(line 461,col 9)-(line 461,col 82)",
        "(line 462,col 9)-(line 462,col 73)",
        "(line 465,col 9)-(line 465,col 78)",
        "(line 466,col 9)-(line 466,col 82)",
        "(line 467,col 9)-(line 467,col 73)",
        "(line 470,col 9)-(line 470,col 74)",
        "(line 471,col 9)-(line 471,col 79)",
        "(line 472,col 9)-(line 472,col 73)",
        "(line 475,col 9)-(line 475,col 75)",
        "(line 476,col 9)-(line 476,col 79)",
        "(line 477,col 9)-(line 477,col 73)",
        "(line 480,col 9)-(line 480,col 74)",
        "(line 481,col 9)-(line 481,col 79)",
        "(line 482,col 9)-(line 482,col 73)",
        "(line 485,col 9)-(line 485,col 75)",
        "(line 486,col 9)-(line 486,col 79)",
        "(line 487,col 9)-(line 487,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDate()",
      "begin_line": 497,
      "end_line": 502,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DATE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 48)",
        "(line 500,col 9)-(line 500,col 82)",
        "(line 501,col 9)-(line 501,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDayOfMonth()",
      "begin_line": 510,
      "end_line": 515,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 56)",
        "(line 513,col 9)-(line 513,col 82)",
        "(line 514,col 9)-(line 514,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateAmPm()",
      "begin_line": 524,
      "end_line": 535,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.AM_PM\n     * Includes truncating the extremes of both AM and PM of one day \n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 49)",
        "(line 529,col 9)-(line 529,col 82)",
        "(line 530,col 9)-(line 530,col 72)",
        "(line 533,col 9)-(line 533,col 77)",
        "(line 534,col 9)-(line 534,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHour()",
      "begin_line": 543,
      "end_line": 548,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 48)",
        "(line 546,col 9)-(line 546,col 81)",
        "(line 547,col 9)-(line 547,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHourOfDay()",
      "begin_line": 556,
      "end_line": 561,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 55)",
        "(line 559,col 9)-(line 559,col 81)",
        "(line 560,col 9)-(line 560,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMinute()",
      "begin_line": 569,
      "end_line": 574,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MINUTE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 50)",
        "(line 572,col 9)-(line 572,col 81)",
        "(line 573,col 9)-(line 573,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSecond()",
      "begin_line": 582,
      "end_line": 587,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 50)",
        "(line 585,col 9)-(line 585,col 81)",
        "(line 586,col 9)-(line 586,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMilliSecond()",
      "begin_line": 595,
      "end_line": 599,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 55)",
        "(line 598,col 9)-(line 598,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseRoundTest(java.util.Date, java.util.Date, java.util.Date, int)",
      "begin_line": 613,
      "end_line": 648,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastRoundDownDate should round down to roundedDownDate\u003cbr\u003e\n     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate\n     * \n     * @param roundedUpDate the next rounded date after \u003cstrong\u003eroundedDownDate\u003c/strong\u003e when using \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param roundedDownDate the result if \u003cstrong\u003elastRoundDownDate\u003c/strong\u003e was rounded with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastRoundDownDate rounding this value with \u003cstrong\u003ecalendarField\u003c/strong\u003e will result in \u003cstrong\u003eroundedDownDate\u003c/strong\u003e\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 80)",
        "(line 617,col 9)-(line 617,col 87)",
        "(line 618,col 9)-(line 618,col 83)",
        "(line 619,col 9)-(line 619,col 89)",
        "(line 620,col 9)-(line 620,col 86)",
        "(line 623,col 9)-(line 623,col 101)",
        "(line 624,col 9)-(line 624,col 53)",
        "(line 625,col 9)-(line 625,col 51)",
        "(line 626,col 9)-(line 626,col 55)",
        "(line 627,col 9)-(line 627,col 54)",
        "(line 628,col 9)-(line 628,col 53)",
        "(line 629,col 9)-(line 629,col 49)",
        "(line 630,col 9)-(line 630,col 57)",
        "(line 631,col 9)-(line 631,col 55)",
        "(line 634,col 9)-(line 634,col 95)",
        "(line 635,col 9)-(line 635,col 91)",
        "(line 636,col 9)-(line 636,col 97)",
        "(line 637,col 9)-(line 637,col 94)",
        "(line 640,col 9)-(line 640,col 96)",
        "(line 641,col 9)-(line 641,col 92)",
        "(line 642,col 9)-(line 642,col 98)",
        "(line 643,col 9)-(line 643,col 95)",
        "(line 644,col 9)-(line 644,col 100)",
        "(line 645,col 9)-(line 645,col 96)",
        "(line 646,col 9)-(line 646,col 98)",
        "(line 647,col 9)-(line 647,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseTruncateTest(java.util.Date, java.util.Date, int)",
      "begin_line": 661,
      "end_line": 690,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastTruncateDate should round down to truncatedDate\u003cbr\u003e\n     * lastTruncateDate + 1 millisecond should never round down to truncatedDate\n     * \n     * @param truncatedDate expected Date when \u003cstrong\u003elastTruncateDate\u003c/strong\u003e is truncated with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastTruncateDate the last possible Date which will truncate to \u003cstrong\u003etruncatedDate\u003c/strong\u003e with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param calendarField a Calendar.field value\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 79)",
        "(line 665,col 9)-(line 665,col 204)",
        "(line 666,col 9)-(line 666,col 89)",
        "(line 667,col 9)-(line 667,col 212)",
        "(line 670,col 9)-(line 670,col 79)",
        "(line 671,col 9)-(line 671,col 51)",
        "(line 672,col 9)-(line 672,col 54)",
        "(line 673,col 9)-(line 673,col 54)",
        "(line 674,col 9)-(line 674,col 49)",
        "(line 675,col 9)-(line 675,col 55)",
        "(line 676,col 9)-(line 676,col 55)",
        "(line 679,col 9)-(line 679,col 220)",
        "(line 680,col 9)-(line 680,col 97)",
        "(line 681,col 9)-(line 681,col 228)",
        "(line 684,col 9)-(line 684,col 236)",
        "(line 685,col 9)-(line 685,col 98)",
        "(line 686,col 9)-(line 686,col 236)",
        "(line 687,col 9)-(line 687,col 248)",
        "(line 688,col 9)-(line 688,col 102)",
        "(line 689,col 9)-(line 689,col 248)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.roundToJanuaryFirst(java.util.Date, java.util.Date, int)",
      "begin_line": 702,
      "end_line": 726,
      "comment": "\n     * \n     * Any January 1 could be considered as the ultimate extreme.\n     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. \n     * \n     * @param minDate\n     * @param maxDate\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 202)",
        "(line 704,col 9)-(line 704,col 78)",
        "(line 705,col 9)-(line 705,col 78)",
        "(line 707,col 9)-(line 707,col 54)",
        "(line 708,col 9)-(line 708,col 37)",
        "(line 709,col 9)-(line 709,col 54)",
        "(line 710,col 9)-(line 710,col 37)",
        "(line 711,col 9)-(line 711,col 214)",
        "(line 712,col 9)-(line 712,col 86)",
        "(line 713,col 9)-(line 713,col 86)",
        "(line 715,col 9)-(line 715,col 70)",
        "(line 716,col 9)-(line 716,col 69)",
        "(line 717,col 9)-(line 717,col 204)",
        "(line 718,col 9)-(line 718,col 204)",
        "(line 720,col 9)-(line 720,col 62)",
        "(line 721,col 9)-(line 721,col 53)",
        "(line 722,col 9)-(line 722,col 62)",
        "(line 723,col 9)-(line 723,col 53)",
        "(line 724,col 9)-(line 724,col 208)",
        "(line 725,col 9)-(line 725,col 208)"
      ]
    }
  ]
}