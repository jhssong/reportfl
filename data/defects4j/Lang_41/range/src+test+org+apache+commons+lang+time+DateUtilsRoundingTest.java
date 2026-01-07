{
  "filepath": "/tmp/Lang-41b/src/test/org/apache/commons/lang/time/DateUtilsRoundingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsRoundingTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 45,
      "end_line": 714,
      "comment": "\n * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.\n * The extremes are tested at the switch-point in milliseconds\n * \n * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th\n * When rounding Calendar.MONTH it depends on the number of days within that month.\n * A month with 28 days will be rounded up from the 15th\n * A month with 29 or 30 days will be rounded up from the 16th\n * A month with 31 days will be rounded up from the 17th\n * \n * @todo Add DateUtils.ceil()-tests if method is available\n *   \n * @author Robert Scholte\n * @since 3.0\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.suite()",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 69)",
        "(line 49,col 9)-(line 49,col 50)",
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "dateTimeParser"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneDate"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetYearDate"
      ],
      "begin_line": 56,
      "end_line": 56,
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
      "begin_line": 58,
      "end_line": 58,
      "comment": "No targetMonths, these must be tested for every type of month(28-31 days)"
    },
    {
      "type": "field",
      "varNames": [
        "targetHourOfDayDate",
        "targetHourDate"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMinuteDate"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetSecondDate"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMilliSecondDate"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneCalendar"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fdf"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.setUp()",
      "begin_line": 67,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)",
        "(line 70,col 9)-(line 70,col 90)",
        "(line 72,col 9)-(line 72,col 77)",
        "(line 73,col 9)-(line 73,col 97)",
        "(line 74,col 9)-(line 74,col 73)",
        "(line 75,col 9)-(line 75,col 73)",
        "(line 76,col 9)-(line 76,col 74)",
        "(line 77,col 9)-(line 77,col 79)",
        "(line 78,col 9)-(line 78,col 77)",
        "(line 79,col 9)-(line 79,col 77)",
        "(line 80,col 9)-(line 80,col 82)",
        "(line 82,col 9)-(line 82,col 77)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 84,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundYear()",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.Year\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 48)",
        "(line 95,col 9)-(line 95,col 81)",
        "(line 96,col 9)-(line 96,col 46)",
        "(line 97,col 9)-(line 97,col 86)",
        "(line 98,col 9)-(line 98,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundMonth()",
      "begin_line": 109,
      "end_line": 142,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days\n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 65)",
        "(line 112,col 9)-(line 112,col 30)",
        "(line 115,col 9)-(line 115,col 74)",
        "(line 116,col 9)-(line 116,col 79)",
        "(line 117,col 9)-(line 117,col 85)",
        "(line 118,col 9)-(line 118,col 91)",
        "(line 121,col 9)-(line 121,col 74)",
        "(line 122,col 9)-(line 122,col 79)",
        "(line 123,col 9)-(line 123,col 85)",
        "(line 124,col 9)-(line 124,col 91)",
        "(line 127,col 9)-(line 127,col 72)",
        "(line 128,col 9)-(line 128,col 76)",
        "(line 129,col 9)-(line 129,col 82)",
        "(line 130,col 9)-(line 130,col 91)",
        "(line 133,col 9)-(line 133,col 73)",
        "(line 134,col 9)-(line 134,col 74)",
        "(line 135,col 9)-(line 135,col 80)",
        "(line 136,col 9)-(line 136,col 91)",
        "(line 139,col 9)-(line 139,col 73)",
        "(line 140,col 9)-(line 140,col 72)",
        "(line 141,col 9)-(line 141,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundSemiMonth()",
      "begin_line": 152,
      "end_line": 209,
      "comment": "\n     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half \n     * Includes rounding to January 1\n     *      \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 55)",
        "(line 154,col 9)-(line 154,col 65)",
        "(line 155,col 9)-(line 155,col 30)",
        "(line 158,col 9)-(line 158,col 78)",
        "(line 159,col 9)-(line 159,col 79)",
        "(line 160,col 9)-(line 160,col 84)",
        "(line 161,col 9)-(line 161,col 91)",
        "(line 164,col 9)-(line 164,col 74)",
        "(line 165,col 9)-(line 165,col 80)",
        "(line 166,col 9)-(line 166,col 85)",
        "(line 167,col 9)-(line 167,col 91)",
        "(line 170,col 9)-(line 170,col 78)",
        "(line 171,col 9)-(line 171,col 79)",
        "(line 172,col 9)-(line 172,col 84)",
        "(line 173,col 9)-(line 173,col 91)",
        "(line 176,col 9)-(line 176,col 74)",
        "(line 177,col 9)-(line 177,col 80)",
        "(line 178,col 9)-(line 178,col 85)",
        "(line 179,col 9)-(line 179,col 91)",
        "(line 182,col 9)-(line 182,col 75)",
        "(line 183,col 9)-(line 183,col 76)",
        "(line 184,col 9)-(line 184,col 81)",
        "(line 185,col 9)-(line 185,col 91)",
        "(line 188,col 9)-(line 188,col 72)",
        "(line 189,col 9)-(line 189,col 77)",
        "(line 190,col 9)-(line 190,col 82)",
        "(line 191,col 9)-(line 191,col 91)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 195,col 9)-(line 195,col 74)",
        "(line 196,col 9)-(line 196,col 79)",
        "(line 197,col 9)-(line 197,col 91)",
        "(line 200,col 9)-(line 200,col 73)",
        "(line 201,col 9)-(line 201,col 75)",
        "(line 202,col 9)-(line 202,col 80)",
        "(line 203,col 9)-(line 203,col 91)",
        "(line 206,col 9)-(line 206,col 73)",
        "(line 207,col 9)-(line 207,col 71)",
        "(line 208,col 9)-(line 208,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundDate()",
      "begin_line": 219,
      "end_line": 233,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DATE\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 48)",
        "(line 221,col 9)-(line 221,col 65)",
        "(line 222,col 9)-(line 222,col 30)",
        "(line 224,col 9)-(line 224,col 73)",
        "(line 225,col 9)-(line 225,col 41)",
        "(line 226,col 9)-(line 226,col 80)",
        "(line 227,col 9)-(line 227,col 91)",
        "(line 230,col 9)-(line 230,col 73)",
        "(line 231,col 9)-(line 231,col 71)",
        "(line 232,col 9)-(line 232,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundDayOfMonth()",
      "begin_line": 243,
      "end_line": 257,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 56)",
        "(line 245,col 9)-(line 245,col 65)",
        "(line 246,col 9)-(line 246,col 30)",
        "(line 248,col 9)-(line 248,col 73)",
        "(line 249,col 9)-(line 249,col 47)",
        "(line 250,col 9)-(line 250,col 80)",
        "(line 251,col 9)-(line 251,col 91)",
        "(line 254,col 9)-(line 254,col 73)",
        "(line 255,col 9)-(line 255,col 71)",
        "(line 256,col 9)-(line 256,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundAmPm()",
      "begin_line": 267,
      "end_line": 288,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.AM_PM\n     * Includes rounding the extremes of both AM and PM of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @3.0\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 49)",
        "(line 269,col 9)-(line 269,col 65)",
        "(line 270,col 9)-(line 270,col 30)",
        "(line 273,col 9)-(line 273,col 74)",
        "(line 274,col 9)-(line 274,col 39)",
        "(line 275,col 9)-(line 275,col 79)",
        "(line 276,col 9)-(line 276,col 91)",
        "(line 279,col 9)-(line 279,col 73)",
        "(line 280,col 9)-(line 280,col 39)",
        "(line 281,col 9)-(line 281,col 80)",
        "(line 282,col 9)-(line 282,col 91)",
        "(line 285,col 9)-(line 285,col 73)",
        "(line 286,col 9)-(line 286,col 70)",
        "(line 287,col 9)-(line 287,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundHourOfDay()",
      "begin_line": 298,
      "end_line": 312,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 55)",
        "(line 300,col 9)-(line 300,col 65)",
        "(line 301,col 9)-(line 301,col 30)",
        "(line 303,col 9)-(line 303,col 73)",
        "(line 304,col 9)-(line 304,col 46)",
        "(line 305,col 9)-(line 305,col 79)",
        "(line 306,col 9)-(line 306,col 91)",
        "(line 309,col 9)-(line 309,col 73)",
        "(line 310,col 9)-(line 310,col 70)",
        "(line 311,col 9)-(line 311,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundHour()",
      "begin_line": 322,
      "end_line": 336,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 48)",
        "(line 324,col 9)-(line 324,col 65)",
        "(line 325,col 9)-(line 325,col 30)",
        "(line 327,col 9)-(line 327,col 73)",
        "(line 328,col 9)-(line 328,col 41)",
        "(line 329,col 9)-(line 329,col 79)",
        "(line 330,col 9)-(line 330,col 91)",
        "(line 333,col 9)-(line 333,col 73)",
        "(line 334,col 9)-(line 334,col 70)",
        "(line 335,col 9)-(line 335,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundMinute()",
      "begin_line": 346,
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
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundSecond()",
      "begin_line": 370,
      "end_line": 384,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.SECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 50)",
        "(line 372,col 9)-(line 372,col 65)",
        "(line 373,col 9)-(line 373,col 30)",
        "(line 375,col 9)-(line 375,col 73)",
        "(line 376,col 9)-(line 376,col 43)",
        "(line 377,col 9)-(line 377,col 79)",
        "(line 378,col 9)-(line 378,col 91)",
        "(line 381,col 9)-(line 381,col 73)",
        "(line 382,col 9)-(line 382,col 70)",
        "(line 383,col 9)-(line 383,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundMilliSecond()",
      "begin_line": 394,
      "end_line": 406,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MILLISECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 55)",
        "(line 396,col 9)-(line 396,col 65)",
        "(line 397,col 9)-(line 397,col 30)",
        "(line 399,col 9)-(line 399,col 70)",
        "(line 400,col 9)-(line 400,col 73)",
        "(line 401,col 9)-(line 401,col 91)",
        "(line 404,col 9)-(line 404,col 43)",
        "(line 405,col 9)-(line 405,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateYear()",
      "begin_line": 414,
      "end_line": 418,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.YEAR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 48)",
        "(line 416,col 9)-(line 416,col 87)",
        "(line 417,col 9)-(line 417,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateMonth()",
      "begin_line": 426,
      "end_line": 431,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 49)",
        "(line 428,col 9)-(line 428,col 79)",
        "(line 429,col 9)-(line 429,col 84)",
        "(line 430,col 9)-(line 430,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateSemiMonth()",
      "begin_line": 440,
      "end_line": 484,
      "comment": "\n     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH\n     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 55)",
        "(line 442,col 9)-(line 442,col 45)",
        "(line 445,col 9)-(line 445,col 77)",
        "(line 446,col 9)-(line 446,col 82)",
        "(line 447,col 9)-(line 447,col 73)",
        "(line 450,col 9)-(line 450,col 78)",
        "(line 451,col 9)-(line 451,col 82)",
        "(line 452,col 9)-(line 452,col 73)",
        "(line 455,col 9)-(line 455,col 77)",
        "(line 456,col 9)-(line 456,col 82)",
        "(line 457,col 9)-(line 457,col 73)",
        "(line 460,col 9)-(line 460,col 78)",
        "(line 461,col 9)-(line 461,col 82)",
        "(line 462,col 9)-(line 462,col 73)",
        "(line 465,col 9)-(line 465,col 74)",
        "(line 466,col 9)-(line 466,col 79)",
        "(line 467,col 9)-(line 467,col 73)",
        "(line 470,col 9)-(line 470,col 75)",
        "(line 471,col 9)-(line 471,col 79)",
        "(line 472,col 9)-(line 472,col 73)",
        "(line 475,col 9)-(line 475,col 74)",
        "(line 476,col 9)-(line 476,col 79)",
        "(line 477,col 9)-(line 477,col 73)",
        "(line 480,col 9)-(line 480,col 75)",
        "(line 481,col 9)-(line 481,col 79)",
        "(line 482,col 9)-(line 482,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateDate()",
      "begin_line": 492,
      "end_line": 496,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DATE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 48)",
        "(line 494,col 9)-(line 494,col 82)",
        "(line 495,col 9)-(line 495,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateDayOfMonth()",
      "begin_line": 504,
      "end_line": 508,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 56)",
        "(line 506,col 9)-(line 506,col 82)",
        "(line 507,col 9)-(line 507,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateAmPm()",
      "begin_line": 517,
      "end_line": 527,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.AM_PM\n     * Includes truncating the extremes of both AM and PM of one day \n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 49)",
        "(line 521,col 9)-(line 521,col 82)",
        "(line 522,col 9)-(line 522,col 72)",
        "(line 525,col 9)-(line 525,col 77)",
        "(line 526,col 9)-(line 526,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateHour()",
      "begin_line": 535,
      "end_line": 539,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 48)",
        "(line 537,col 9)-(line 537,col 81)",
        "(line 538,col 9)-(line 538,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateHourOfDay()",
      "begin_line": 547,
      "end_line": 551,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 55)",
        "(line 549,col 9)-(line 549,col 81)",
        "(line 550,col 9)-(line 550,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateMinute()",
      "begin_line": 559,
      "end_line": 563,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MINUTE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 50)",
        "(line 561,col 9)-(line 561,col 81)",
        "(line 562,col 9)-(line 562,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateSecond()",
      "begin_line": 571,
      "end_line": 575,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 50)",
        "(line 573,col 9)-(line 573,col 81)",
        "(line 574,col 9)-(line 574,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateMilliSecond()",
      "begin_line": 583,
      "end_line": 586,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 55)",
        "(line 585,col 9)-(line 585,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.baseRoundTest(java.util.Date, java.util.Date, java.util.Date, int)",
      "begin_line": 600,
      "end_line": 635,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastRoundDownDate should round down to roundedDownDate\u003cbr\u003e\n     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate\n     * \n     * @param roundedUpDate the next rounded date after \u003cstrong\u003eroundedDownDate\u003c/strong\u003e when using \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param roundedDownDate the result if \u003cstrong\u003elastRoundDownDate\u003c/strong\u003e was rounded with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastRoundDownDate rounding this value with \u003cstrong\u003ecalendarField\u003c/strong\u003e will result in \u003cstrong\u003eroundedDownDate\u003c/strong\u003e\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 80)",
        "(line 604,col 9)-(line 604,col 87)",
        "(line 605,col 9)-(line 605,col 83)",
        "(line 606,col 9)-(line 606,col 89)",
        "(line 607,col 9)-(line 607,col 86)",
        "(line 610,col 9)-(line 610,col 101)",
        "(line 611,col 9)-(line 611,col 53)",
        "(line 612,col 9)-(line 612,col 51)",
        "(line 613,col 9)-(line 613,col 55)",
        "(line 614,col 9)-(line 614,col 54)",
        "(line 615,col 9)-(line 615,col 53)",
        "(line 616,col 9)-(line 616,col 49)",
        "(line 617,col 9)-(line 617,col 57)",
        "(line 618,col 9)-(line 618,col 55)",
        "(line 621,col 9)-(line 621,col 95)",
        "(line 622,col 9)-(line 622,col 91)",
        "(line 623,col 9)-(line 623,col 97)",
        "(line 624,col 9)-(line 624,col 94)",
        "(line 627,col 9)-(line 627,col 96)",
        "(line 628,col 9)-(line 628,col 92)",
        "(line 629,col 9)-(line 629,col 98)",
        "(line 630,col 9)-(line 630,col 95)",
        "(line 631,col 9)-(line 631,col 100)",
        "(line 632,col 9)-(line 632,col 96)",
        "(line 633,col 9)-(line 633,col 98)",
        "(line 634,col 9)-(line 634,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.baseTruncateTest(java.util.Date, java.util.Date, int)",
      "begin_line": 648,
      "end_line": 677,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastTruncateDate should round down to truncatedDate\u003cbr\u003e\n     * lastTruncateDate + 1 millisecond should never round down to truncatedDate\n     * \n     * @param truncatedDate expected Date when \u003cstrong\u003elastTruncateDate\u003c/strong\u003e is truncated with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastTruncateDate the last possible Date which will truncate to \u003cstrong\u003etruncatedDate\u003c/strong\u003e with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param calendarField a Calendar.field value\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 79)",
        "(line 652,col 9)-(line 652,col 204)",
        "(line 653,col 9)-(line 653,col 89)",
        "(line 654,col 9)-(line 654,col 212)",
        "(line 657,col 9)-(line 657,col 79)",
        "(line 658,col 9)-(line 658,col 51)",
        "(line 659,col 9)-(line 659,col 54)",
        "(line 660,col 9)-(line 660,col 54)",
        "(line 661,col 9)-(line 661,col 49)",
        "(line 662,col 9)-(line 662,col 55)",
        "(line 663,col 9)-(line 663,col 55)",
        "(line 666,col 9)-(line 666,col 220)",
        "(line 667,col 9)-(line 667,col 97)",
        "(line 668,col 9)-(line 668,col 228)",
        "(line 671,col 9)-(line 671,col 236)",
        "(line 672,col 9)-(line 672,col 98)",
        "(line 673,col 9)-(line 673,col 236)",
        "(line 674,col 9)-(line 674,col 248)",
        "(line 675,col 9)-(line 675,col 102)",
        "(line 676,col 9)-(line 676,col 248)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.roundToJanuaryFirst(java.util.Date, java.util.Date, int)",
      "begin_line": 689,
      "end_line": 713,
      "comment": "\n     * \n     * Any January 1 could be considered as the ultimate extreme.\n     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. \n     * \n     * @param minDate\n     * @param maxDate\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 202)",
        "(line 691,col 9)-(line 691,col 78)",
        "(line 692,col 9)-(line 692,col 78)",
        "(line 694,col 9)-(line 694,col 54)",
        "(line 695,col 9)-(line 695,col 37)",
        "(line 696,col 9)-(line 696,col 54)",
        "(line 697,col 9)-(line 697,col 37)",
        "(line 698,col 9)-(line 698,col 214)",
        "(line 699,col 9)-(line 699,col 86)",
        "(line 700,col 9)-(line 700,col 86)",
        "(line 702,col 9)-(line 702,col 70)",
        "(line 703,col 9)-(line 703,col 69)",
        "(line 704,col 9)-(line 704,col 204)",
        "(line 705,col 9)-(line 705,col 204)",
        "(line 707,col 9)-(line 707,col 62)",
        "(line 708,col 9)-(line 708,col 53)",
        "(line 709,col 9)-(line 709,col 62)",
        "(line 710,col 9)-(line 710,col 53)",
        "(line 711,col 9)-(line 711,col 208)",
        "(line 712,col 9)-(line 712,col 208)"
      ]
    }
  ]
}