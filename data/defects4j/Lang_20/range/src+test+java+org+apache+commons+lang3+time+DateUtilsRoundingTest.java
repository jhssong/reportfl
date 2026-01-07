{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/time/DateUtilsRoundingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsRoundingTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 703,
      "comment": "\n * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.\n * The extremes are tested at the switch-point in milliseconds\n * \n * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th\n * When rounding Calendar.MONTH it depends on the number of days within that month.\n * A month with 28 days will be rounded up from the 15th\n * A month with 29 or 30 days will be rounded up from the 16th\n * A month with 31 days will be rounded up from the 17th\n * \n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "dateTimeParser"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneDate"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetYearDate"
      ],
      "begin_line": 45,
      "end_line": 45,
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
      "begin_line": 47,
      "end_line": 47,
      "comment": "No targetMonths, these must be tested for every type of month(28-31 days)"
    },
    {
      "type": "field",
      "varNames": [
        "targetHourOfDayDate",
        "targetHourDate"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMinuteDate"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetSecondDate"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMilliSecondDate"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneCalendar"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fdf"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.setUp()",
      "begin_line": 56,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 22)",
        "(line 59,col 9)-(line 59,col 90)",
        "(line 61,col 9)-(line 61,col 77)",
        "(line 62,col 9)-(line 62,col 97)",
        "(line 63,col 9)-(line 63,col 73)",
        "(line 64,col 9)-(line 64,col 73)",
        "(line 65,col 9)-(line 65,col 74)",
        "(line 66,col 9)-(line 66,col 79)",
        "(line 67,col 9)-(line 67,col 77)",
        "(line 68,col 9)-(line 68,col 77)",
        "(line 69,col 9)-(line 69,col 82)",
        "(line 71,col 9)-(line 71,col 77)",
        "(line 72,col 9)-(line 72,col 52)",
        "(line 73,col 9)-(line 73,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundYear()",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.Year\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 48)",
        "(line 84,col 9)-(line 84,col 81)",
        "(line 85,col 9)-(line 85,col 46)",
        "(line 86,col 9)-(line 86,col 86)",
        "(line 87,col 9)-(line 87,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMonth()",
      "begin_line": 98,
      "end_line": 131,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days\n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 49)",
        "(line 100,col 9)-(line 100,col 65)",
        "(line 101,col 9)-(line 101,col 30)",
        "(line 104,col 9)-(line 104,col 74)",
        "(line 105,col 9)-(line 105,col 79)",
        "(line 106,col 9)-(line 106,col 85)",
        "(line 107,col 9)-(line 107,col 91)",
        "(line 110,col 9)-(line 110,col 74)",
        "(line 111,col 9)-(line 111,col 79)",
        "(line 112,col 9)-(line 112,col 85)",
        "(line 113,col 9)-(line 113,col 91)",
        "(line 116,col 9)-(line 116,col 72)",
        "(line 117,col 9)-(line 117,col 76)",
        "(line 118,col 9)-(line 118,col 82)",
        "(line 119,col 9)-(line 119,col 91)",
        "(line 122,col 9)-(line 122,col 73)",
        "(line 123,col 9)-(line 123,col 74)",
        "(line 124,col 9)-(line 124,col 80)",
        "(line 125,col 9)-(line 125,col 91)",
        "(line 128,col 9)-(line 128,col 73)",
        "(line 129,col 9)-(line 129,col 72)",
        "(line 130,col 9)-(line 130,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSemiMonth()",
      "begin_line": 141,
      "end_line": 198,
      "comment": "\n     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half \n     * Includes rounding to January 1\n     *      \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 55)",
        "(line 143,col 9)-(line 143,col 65)",
        "(line 144,col 9)-(line 144,col 30)",
        "(line 147,col 9)-(line 147,col 78)",
        "(line 148,col 9)-(line 148,col 79)",
        "(line 149,col 9)-(line 149,col 84)",
        "(line 150,col 9)-(line 150,col 91)",
        "(line 153,col 9)-(line 153,col 74)",
        "(line 154,col 9)-(line 154,col 80)",
        "(line 155,col 9)-(line 155,col 85)",
        "(line 156,col 9)-(line 156,col 91)",
        "(line 159,col 9)-(line 159,col 78)",
        "(line 160,col 9)-(line 160,col 79)",
        "(line 161,col 9)-(line 161,col 84)",
        "(line 162,col 9)-(line 162,col 91)",
        "(line 165,col 9)-(line 165,col 74)",
        "(line 166,col 9)-(line 166,col 80)",
        "(line 167,col 9)-(line 167,col 85)",
        "(line 168,col 9)-(line 168,col 91)",
        "(line 171,col 9)-(line 171,col 75)",
        "(line 172,col 9)-(line 172,col 76)",
        "(line 173,col 9)-(line 173,col 81)",
        "(line 174,col 9)-(line 174,col 91)",
        "(line 177,col 9)-(line 177,col 72)",
        "(line 178,col 9)-(line 178,col 77)",
        "(line 179,col 9)-(line 179,col 82)",
        "(line 180,col 9)-(line 180,col 91)",
        "(line 183,col 9)-(line 183,col 73)",
        "(line 184,col 9)-(line 184,col 74)",
        "(line 185,col 9)-(line 185,col 79)",
        "(line 186,col 9)-(line 186,col 91)",
        "(line 189,col 9)-(line 189,col 73)",
        "(line 190,col 9)-(line 190,col 75)",
        "(line 191,col 9)-(line 191,col 80)",
        "(line 192,col 9)-(line 192,col 91)",
        "(line 195,col 9)-(line 195,col 73)",
        "(line 196,col 9)-(line 196,col 71)",
        "(line 197,col 9)-(line 197,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDate()",
      "begin_line": 208,
      "end_line": 222,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DATE\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 48)",
        "(line 210,col 9)-(line 210,col 65)",
        "(line 211,col 9)-(line 211,col 30)",
        "(line 213,col 9)-(line 213,col 73)",
        "(line 214,col 9)-(line 214,col 41)",
        "(line 215,col 9)-(line 215,col 80)",
        "(line 216,col 9)-(line 216,col 91)",
        "(line 219,col 9)-(line 219,col 73)",
        "(line 220,col 9)-(line 220,col 71)",
        "(line 221,col 9)-(line 221,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDayOfMonth()",
      "begin_line": 232,
      "end_line": 246,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 56)",
        "(line 234,col 9)-(line 234,col 65)",
        "(line 235,col 9)-(line 235,col 30)",
        "(line 237,col 9)-(line 237,col 73)",
        "(line 238,col 9)-(line 238,col 47)",
        "(line 239,col 9)-(line 239,col 80)",
        "(line 240,col 9)-(line 240,col 91)",
        "(line 243,col 9)-(line 243,col 73)",
        "(line 244,col 9)-(line 244,col 71)",
        "(line 245,col 9)-(line 245,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundAmPm()",
      "begin_line": 256,
      "end_line": 277,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.AM_PM\n     * Includes rounding the extremes of both AM and PM of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 49)",
        "(line 258,col 9)-(line 258,col 65)",
        "(line 259,col 9)-(line 259,col 30)",
        "(line 262,col 9)-(line 262,col 74)",
        "(line 263,col 9)-(line 263,col 39)",
        "(line 264,col 9)-(line 264,col 79)",
        "(line 265,col 9)-(line 265,col 91)",
        "(line 268,col 9)-(line 268,col 73)",
        "(line 269,col 9)-(line 269,col 39)",
        "(line 270,col 9)-(line 270,col 80)",
        "(line 271,col 9)-(line 271,col 91)",
        "(line 274,col 9)-(line 274,col 73)",
        "(line 275,col 9)-(line 275,col 70)",
        "(line 276,col 9)-(line 276,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHourOfDay()",
      "begin_line": 287,
      "end_line": 301,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 55)",
        "(line 289,col 9)-(line 289,col 65)",
        "(line 290,col 9)-(line 290,col 30)",
        "(line 292,col 9)-(line 292,col 73)",
        "(line 293,col 9)-(line 293,col 46)",
        "(line 294,col 9)-(line 294,col 79)",
        "(line 295,col 9)-(line 295,col 91)",
        "(line 298,col 9)-(line 298,col 73)",
        "(line 299,col 9)-(line 299,col 70)",
        "(line 300,col 9)-(line 300,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHour()",
      "begin_line": 311,
      "end_line": 325,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 48)",
        "(line 313,col 9)-(line 313,col 65)",
        "(line 314,col 9)-(line 314,col 30)",
        "(line 316,col 9)-(line 316,col 73)",
        "(line 317,col 9)-(line 317,col 41)",
        "(line 318,col 9)-(line 318,col 79)",
        "(line 319,col 9)-(line 319,col 91)",
        "(line 322,col 9)-(line 322,col 73)",
        "(line 323,col 9)-(line 323,col 70)",
        "(line 324,col 9)-(line 324,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMinute()",
      "begin_line": 335,
      "end_line": 349,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MINUTE\n     * Includes rounding the extremes of one minute \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 50)",
        "(line 337,col 9)-(line 337,col 65)",
        "(line 338,col 9)-(line 338,col 30)",
        "(line 340,col 9)-(line 340,col 73)",
        "(line 341,col 9)-(line 341,col 43)",
        "(line 342,col 9)-(line 342,col 79)",
        "(line 343,col 9)-(line 343,col 91)",
        "(line 346,col 9)-(line 346,col 73)",
        "(line 347,col 9)-(line 347,col 70)",
        "(line 348,col 9)-(line 348,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSecond()",
      "begin_line": 359,
      "end_line": 373,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.SECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 50)",
        "(line 361,col 9)-(line 361,col 65)",
        "(line 362,col 9)-(line 362,col 30)",
        "(line 364,col 9)-(line 364,col 73)",
        "(line 365,col 9)-(line 365,col 43)",
        "(line 366,col 9)-(line 366,col 79)",
        "(line 367,col 9)-(line 367,col 91)",
        "(line 370,col 9)-(line 370,col 73)",
        "(line 371,col 9)-(line 371,col 70)",
        "(line 372,col 9)-(line 372,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMilliSecond()",
      "begin_line": 383,
      "end_line": 395,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MILLISECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 55)",
        "(line 385,col 9)-(line 385,col 65)",
        "(line 386,col 9)-(line 386,col 30)",
        "(line 388,col 9)-(line 388,col 70)",
        "(line 389,col 9)-(line 389,col 73)",
        "(line 390,col 9)-(line 390,col 91)",
        "(line 393,col 9)-(line 393,col 43)",
        "(line 394,col 9)-(line 394,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateYear()",
      "begin_line": 403,
      "end_line": 407,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.YEAR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 48)",
        "(line 405,col 9)-(line 405,col 87)",
        "(line 406,col 9)-(line 406,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMonth()",
      "begin_line": 415,
      "end_line": 420,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 49)",
        "(line 417,col 9)-(line 417,col 79)",
        "(line 418,col 9)-(line 418,col 84)",
        "(line 419,col 9)-(line 419,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSemiMonth()",
      "begin_line": 429,
      "end_line": 473,
      "comment": "\n     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH\n     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 55)",
        "(line 431,col 9)-(line 431,col 45)",
        "(line 434,col 9)-(line 434,col 77)",
        "(line 435,col 9)-(line 435,col 82)",
        "(line 436,col 9)-(line 436,col 73)",
        "(line 439,col 9)-(line 439,col 78)",
        "(line 440,col 9)-(line 440,col 82)",
        "(line 441,col 9)-(line 441,col 73)",
        "(line 444,col 9)-(line 444,col 77)",
        "(line 445,col 9)-(line 445,col 82)",
        "(line 446,col 9)-(line 446,col 73)",
        "(line 449,col 9)-(line 449,col 78)",
        "(line 450,col 9)-(line 450,col 82)",
        "(line 451,col 9)-(line 451,col 73)",
        "(line 454,col 9)-(line 454,col 74)",
        "(line 455,col 9)-(line 455,col 79)",
        "(line 456,col 9)-(line 456,col 73)",
        "(line 459,col 9)-(line 459,col 75)",
        "(line 460,col 9)-(line 460,col 79)",
        "(line 461,col 9)-(line 461,col 73)",
        "(line 464,col 9)-(line 464,col 74)",
        "(line 465,col 9)-(line 465,col 79)",
        "(line 466,col 9)-(line 466,col 73)",
        "(line 469,col 9)-(line 469,col 75)",
        "(line 470,col 9)-(line 470,col 79)",
        "(line 471,col 9)-(line 471,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDate()",
      "begin_line": 481,
      "end_line": 485,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DATE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 48)",
        "(line 483,col 9)-(line 483,col 82)",
        "(line 484,col 9)-(line 484,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDayOfMonth()",
      "begin_line": 493,
      "end_line": 497,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 56)",
        "(line 495,col 9)-(line 495,col 82)",
        "(line 496,col 9)-(line 496,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateAmPm()",
      "begin_line": 506,
      "end_line": 516,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.AM_PM\n     * Includes truncating the extremes of both AM and PM of one day \n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 49)",
        "(line 510,col 9)-(line 510,col 82)",
        "(line 511,col 9)-(line 511,col 72)",
        "(line 514,col 9)-(line 514,col 77)",
        "(line 515,col 9)-(line 515,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHour()",
      "begin_line": 524,
      "end_line": 528,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 48)",
        "(line 526,col 9)-(line 526,col 81)",
        "(line 527,col 9)-(line 527,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHourOfDay()",
      "begin_line": 536,
      "end_line": 540,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 55)",
        "(line 538,col 9)-(line 538,col 81)",
        "(line 539,col 9)-(line 539,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMinute()",
      "begin_line": 548,
      "end_line": 552,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MINUTE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 50)",
        "(line 550,col 9)-(line 550,col 81)",
        "(line 551,col 9)-(line 551,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSecond()",
      "begin_line": 560,
      "end_line": 564,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 50)",
        "(line 562,col 9)-(line 562,col 81)",
        "(line 563,col 9)-(line 563,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMilliSecond()",
      "begin_line": 572,
      "end_line": 575,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 55)",
        "(line 574,col 9)-(line 574,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseRoundTest(java.util.Date, java.util.Date, java.util.Date, int)",
      "begin_line": 589,
      "end_line": 624,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastRoundDownDate should round down to roundedDownDate\u003cbr\u003e\n     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate\n     * \n     * @param roundedUpDate the next rounded date after \u003cstrong\u003eroundedDownDate\u003c/strong\u003e when using \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param roundedDownDate the result if \u003cstrong\u003elastRoundDownDate\u003c/strong\u003e was rounded with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastRoundDownDate rounding this value with \u003cstrong\u003ecalendarField\u003c/strong\u003e will result in \u003cstrong\u003eroundedDownDate\u003c/strong\u003e\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 80)",
        "(line 593,col 9)-(line 593,col 87)",
        "(line 594,col 9)-(line 594,col 83)",
        "(line 595,col 9)-(line 595,col 89)",
        "(line 596,col 9)-(line 596,col 86)",
        "(line 599,col 9)-(line 599,col 101)",
        "(line 600,col 9)-(line 600,col 53)",
        "(line 601,col 9)-(line 601,col 51)",
        "(line 602,col 9)-(line 602,col 55)",
        "(line 603,col 9)-(line 603,col 54)",
        "(line 604,col 9)-(line 604,col 53)",
        "(line 605,col 9)-(line 605,col 49)",
        "(line 606,col 9)-(line 606,col 57)",
        "(line 607,col 9)-(line 607,col 55)",
        "(line 610,col 9)-(line 610,col 95)",
        "(line 611,col 9)-(line 611,col 91)",
        "(line 612,col 9)-(line 612,col 97)",
        "(line 613,col 9)-(line 613,col 94)",
        "(line 616,col 9)-(line 616,col 96)",
        "(line 617,col 9)-(line 617,col 92)",
        "(line 618,col 9)-(line 618,col 98)",
        "(line 619,col 9)-(line 619,col 95)",
        "(line 620,col 9)-(line 620,col 100)",
        "(line 621,col 9)-(line 621,col 96)",
        "(line 622,col 9)-(line 622,col 98)",
        "(line 623,col 9)-(line 623,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseTruncateTest(java.util.Date, java.util.Date, int)",
      "begin_line": 637,
      "end_line": 666,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastTruncateDate should round down to truncatedDate\u003cbr\u003e\n     * lastTruncateDate + 1 millisecond should never round down to truncatedDate\n     * \n     * @param truncatedDate expected Date when \u003cstrong\u003elastTruncateDate\u003c/strong\u003e is truncated with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastTruncateDate the last possible Date which will truncate to \u003cstrong\u003etruncatedDate\u003c/strong\u003e with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param calendarField a Calendar.field value\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 79)",
        "(line 641,col 9)-(line 641,col 204)",
        "(line 642,col 9)-(line 642,col 89)",
        "(line 643,col 9)-(line 643,col 212)",
        "(line 646,col 9)-(line 646,col 79)",
        "(line 647,col 9)-(line 647,col 51)",
        "(line 648,col 9)-(line 648,col 54)",
        "(line 649,col 9)-(line 649,col 54)",
        "(line 650,col 9)-(line 650,col 49)",
        "(line 651,col 9)-(line 651,col 55)",
        "(line 652,col 9)-(line 652,col 55)",
        "(line 655,col 9)-(line 655,col 220)",
        "(line 656,col 9)-(line 656,col 97)",
        "(line 657,col 9)-(line 657,col 228)",
        "(line 660,col 9)-(line 660,col 236)",
        "(line 661,col 9)-(line 661,col 98)",
        "(line 662,col 9)-(line 662,col 236)",
        "(line 663,col 9)-(line 663,col 248)",
        "(line 664,col 9)-(line 664,col 102)",
        "(line 665,col 9)-(line 665,col 248)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.roundToJanuaryFirst(java.util.Date, java.util.Date, int)",
      "begin_line": 678,
      "end_line": 702,
      "comment": "\n     * \n     * Any January 1 could be considered as the ultimate extreme.\n     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. \n     * \n     * @param minDate\n     * @param maxDate\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 202)",
        "(line 680,col 9)-(line 680,col 78)",
        "(line 681,col 9)-(line 681,col 78)",
        "(line 683,col 9)-(line 683,col 54)",
        "(line 684,col 9)-(line 684,col 37)",
        "(line 685,col 9)-(line 685,col 54)",
        "(line 686,col 9)-(line 686,col 37)",
        "(line 687,col 9)-(line 687,col 214)",
        "(line 688,col 9)-(line 688,col 86)",
        "(line 689,col 9)-(line 689,col 86)",
        "(line 691,col 9)-(line 691,col 70)",
        "(line 692,col 9)-(line 692,col 69)",
        "(line 693,col 9)-(line 693,col 204)",
        "(line 694,col 9)-(line 694,col 204)",
        "(line 696,col 9)-(line 696,col 62)",
        "(line 697,col 9)-(line 697,col 53)",
        "(line 698,col 9)-(line 698,col 62)",
        "(line 699,col 9)-(line 699,col 53)",
        "(line 700,col 9)-(line 700,col 208)",
        "(line 701,col 9)-(line 701,col 208)"
      ]
    }
  ]
}