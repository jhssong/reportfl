{
  "filepath": "/tmp/Lang-21b/src/test/java/org/apache/commons/lang3/time/DateUtilsRoundingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsRoundingTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 704,
      "comment": "\n * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.\n * The extremes are tested at the switch-point in milliseconds\n * \n * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th\n * When rounding Calendar.MONTH it depends on the number of days within that month.\n * A month with 28 days will be rounded up from the 15th\n * A month with 29 or 30 days will be rounded up from the 16th\n * A month with 31 days will be rounded up from the 17th\n * \n * @author Robert Scholte\n * @since 3.0\n * @version $Id$\n "
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
      "begin_line": 57,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 22)",
        "(line 60,col 9)-(line 60,col 90)",
        "(line 62,col 9)-(line 62,col 77)",
        "(line 63,col 9)-(line 63,col 97)",
        "(line 64,col 9)-(line 64,col 73)",
        "(line 65,col 9)-(line 65,col 73)",
        "(line 66,col 9)-(line 66,col 74)",
        "(line 67,col 9)-(line 67,col 79)",
        "(line 68,col 9)-(line 68,col 77)",
        "(line 69,col 9)-(line 69,col 77)",
        "(line 70,col 9)-(line 70,col 82)",
        "(line 72,col 9)-(line 72,col 77)",
        "(line 73,col 9)-(line 73,col 52)",
        "(line 74,col 9)-(line 74,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundYear()",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.Year\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 48)",
        "(line 85,col 9)-(line 85,col 81)",
        "(line 86,col 9)-(line 86,col 46)",
        "(line 87,col 9)-(line 87,col 86)",
        "(line 88,col 9)-(line 88,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMonth()",
      "begin_line": 99,
      "end_line": 132,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days\n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 49)",
        "(line 101,col 9)-(line 101,col 65)",
        "(line 102,col 9)-(line 102,col 30)",
        "(line 105,col 9)-(line 105,col 74)",
        "(line 106,col 9)-(line 106,col 79)",
        "(line 107,col 9)-(line 107,col 85)",
        "(line 108,col 9)-(line 108,col 91)",
        "(line 111,col 9)-(line 111,col 74)",
        "(line 112,col 9)-(line 112,col 79)",
        "(line 113,col 9)-(line 113,col 85)",
        "(line 114,col 9)-(line 114,col 91)",
        "(line 117,col 9)-(line 117,col 72)",
        "(line 118,col 9)-(line 118,col 76)",
        "(line 119,col 9)-(line 119,col 82)",
        "(line 120,col 9)-(line 120,col 91)",
        "(line 123,col 9)-(line 123,col 73)",
        "(line 124,col 9)-(line 124,col 74)",
        "(line 125,col 9)-(line 125,col 80)",
        "(line 126,col 9)-(line 126,col 91)",
        "(line 129,col 9)-(line 129,col 73)",
        "(line 130,col 9)-(line 130,col 72)",
        "(line 131,col 9)-(line 131,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSemiMonth()",
      "begin_line": 142,
      "end_line": 199,
      "comment": "\n     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half \n     * Includes rounding to January 1\n     *      \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 55)",
        "(line 144,col 9)-(line 144,col 65)",
        "(line 145,col 9)-(line 145,col 30)",
        "(line 148,col 9)-(line 148,col 78)",
        "(line 149,col 9)-(line 149,col 79)",
        "(line 150,col 9)-(line 150,col 84)",
        "(line 151,col 9)-(line 151,col 91)",
        "(line 154,col 9)-(line 154,col 74)",
        "(line 155,col 9)-(line 155,col 80)",
        "(line 156,col 9)-(line 156,col 85)",
        "(line 157,col 9)-(line 157,col 91)",
        "(line 160,col 9)-(line 160,col 78)",
        "(line 161,col 9)-(line 161,col 79)",
        "(line 162,col 9)-(line 162,col 84)",
        "(line 163,col 9)-(line 163,col 91)",
        "(line 166,col 9)-(line 166,col 74)",
        "(line 167,col 9)-(line 167,col 80)",
        "(line 168,col 9)-(line 168,col 85)",
        "(line 169,col 9)-(line 169,col 91)",
        "(line 172,col 9)-(line 172,col 75)",
        "(line 173,col 9)-(line 173,col 76)",
        "(line 174,col 9)-(line 174,col 81)",
        "(line 175,col 9)-(line 175,col 91)",
        "(line 178,col 9)-(line 178,col 72)",
        "(line 179,col 9)-(line 179,col 77)",
        "(line 180,col 9)-(line 180,col 82)",
        "(line 181,col 9)-(line 181,col 91)",
        "(line 184,col 9)-(line 184,col 73)",
        "(line 185,col 9)-(line 185,col 74)",
        "(line 186,col 9)-(line 186,col 79)",
        "(line 187,col 9)-(line 187,col 91)",
        "(line 190,col 9)-(line 190,col 73)",
        "(line 191,col 9)-(line 191,col 75)",
        "(line 192,col 9)-(line 192,col 80)",
        "(line 193,col 9)-(line 193,col 91)",
        "(line 196,col 9)-(line 196,col 73)",
        "(line 197,col 9)-(line 197,col 71)",
        "(line 198,col 9)-(line 198,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDate()",
      "begin_line": 209,
      "end_line": 223,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DATE\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 48)",
        "(line 211,col 9)-(line 211,col 65)",
        "(line 212,col 9)-(line 212,col 30)",
        "(line 214,col 9)-(line 214,col 73)",
        "(line 215,col 9)-(line 215,col 41)",
        "(line 216,col 9)-(line 216,col 80)",
        "(line 217,col 9)-(line 217,col 91)",
        "(line 220,col 9)-(line 220,col 73)",
        "(line 221,col 9)-(line 221,col 71)",
        "(line 222,col 9)-(line 222,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDayOfMonth()",
      "begin_line": 233,
      "end_line": 247,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 56)",
        "(line 235,col 9)-(line 235,col 65)",
        "(line 236,col 9)-(line 236,col 30)",
        "(line 238,col 9)-(line 238,col 73)",
        "(line 239,col 9)-(line 239,col 47)",
        "(line 240,col 9)-(line 240,col 80)",
        "(line 241,col 9)-(line 241,col 91)",
        "(line 244,col 9)-(line 244,col 73)",
        "(line 245,col 9)-(line 245,col 71)",
        "(line 246,col 9)-(line 246,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundAmPm()",
      "begin_line": 257,
      "end_line": 278,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.AM_PM\n     * Includes rounding the extremes of both AM and PM of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 49)",
        "(line 259,col 9)-(line 259,col 65)",
        "(line 260,col 9)-(line 260,col 30)",
        "(line 263,col 9)-(line 263,col 74)",
        "(line 264,col 9)-(line 264,col 39)",
        "(line 265,col 9)-(line 265,col 79)",
        "(line 266,col 9)-(line 266,col 91)",
        "(line 269,col 9)-(line 269,col 73)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 271,col 80)",
        "(line 272,col 9)-(line 272,col 91)",
        "(line 275,col 9)-(line 275,col 73)",
        "(line 276,col 9)-(line 276,col 70)",
        "(line 277,col 9)-(line 277,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHourOfDay()",
      "begin_line": 288,
      "end_line": 302,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 55)",
        "(line 290,col 9)-(line 290,col 65)",
        "(line 291,col 9)-(line 291,col 30)",
        "(line 293,col 9)-(line 293,col 73)",
        "(line 294,col 9)-(line 294,col 46)",
        "(line 295,col 9)-(line 295,col 79)",
        "(line 296,col 9)-(line 296,col 91)",
        "(line 299,col 9)-(line 299,col 73)",
        "(line 300,col 9)-(line 300,col 70)",
        "(line 301,col 9)-(line 301,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHour()",
      "begin_line": 312,
      "end_line": 326,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 48)",
        "(line 314,col 9)-(line 314,col 65)",
        "(line 315,col 9)-(line 315,col 30)",
        "(line 317,col 9)-(line 317,col 73)",
        "(line 318,col 9)-(line 318,col 41)",
        "(line 319,col 9)-(line 319,col 79)",
        "(line 320,col 9)-(line 320,col 91)",
        "(line 323,col 9)-(line 323,col 73)",
        "(line 324,col 9)-(line 324,col 70)",
        "(line 325,col 9)-(line 325,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMinute()",
      "begin_line": 336,
      "end_line": 350,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MINUTE\n     * Includes rounding the extremes of one minute \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 50)",
        "(line 338,col 9)-(line 338,col 65)",
        "(line 339,col 9)-(line 339,col 30)",
        "(line 341,col 9)-(line 341,col 73)",
        "(line 342,col 9)-(line 342,col 43)",
        "(line 343,col 9)-(line 343,col 79)",
        "(line 344,col 9)-(line 344,col 91)",
        "(line 347,col 9)-(line 347,col 73)",
        "(line 348,col 9)-(line 348,col 70)",
        "(line 349,col 9)-(line 349,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSecond()",
      "begin_line": 360,
      "end_line": 374,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.SECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 50)",
        "(line 362,col 9)-(line 362,col 65)",
        "(line 363,col 9)-(line 363,col 30)",
        "(line 365,col 9)-(line 365,col 73)",
        "(line 366,col 9)-(line 366,col 43)",
        "(line 367,col 9)-(line 367,col 79)",
        "(line 368,col 9)-(line 368,col 91)",
        "(line 371,col 9)-(line 371,col 73)",
        "(line 372,col 9)-(line 372,col 70)",
        "(line 373,col 9)-(line 373,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMilliSecond()",
      "begin_line": 384,
      "end_line": 396,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MILLISECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 55)",
        "(line 386,col 9)-(line 386,col 65)",
        "(line 387,col 9)-(line 387,col 30)",
        "(line 389,col 9)-(line 389,col 70)",
        "(line 390,col 9)-(line 390,col 73)",
        "(line 391,col 9)-(line 391,col 91)",
        "(line 394,col 9)-(line 394,col 43)",
        "(line 395,col 9)-(line 395,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateYear()",
      "begin_line": 404,
      "end_line": 408,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.YEAR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 48)",
        "(line 406,col 9)-(line 406,col 87)",
        "(line 407,col 9)-(line 407,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMonth()",
      "begin_line": 416,
      "end_line": 421,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 49)",
        "(line 418,col 9)-(line 418,col 79)",
        "(line 419,col 9)-(line 419,col 84)",
        "(line 420,col 9)-(line 420,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSemiMonth()",
      "begin_line": 430,
      "end_line": 474,
      "comment": "\n     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH\n     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 55)",
        "(line 432,col 9)-(line 432,col 45)",
        "(line 435,col 9)-(line 435,col 77)",
        "(line 436,col 9)-(line 436,col 82)",
        "(line 437,col 9)-(line 437,col 73)",
        "(line 440,col 9)-(line 440,col 78)",
        "(line 441,col 9)-(line 441,col 82)",
        "(line 442,col 9)-(line 442,col 73)",
        "(line 445,col 9)-(line 445,col 77)",
        "(line 446,col 9)-(line 446,col 82)",
        "(line 447,col 9)-(line 447,col 73)",
        "(line 450,col 9)-(line 450,col 78)",
        "(line 451,col 9)-(line 451,col 82)",
        "(line 452,col 9)-(line 452,col 73)",
        "(line 455,col 9)-(line 455,col 74)",
        "(line 456,col 9)-(line 456,col 79)",
        "(line 457,col 9)-(line 457,col 73)",
        "(line 460,col 9)-(line 460,col 75)",
        "(line 461,col 9)-(line 461,col 79)",
        "(line 462,col 9)-(line 462,col 73)",
        "(line 465,col 9)-(line 465,col 74)",
        "(line 466,col 9)-(line 466,col 79)",
        "(line 467,col 9)-(line 467,col 73)",
        "(line 470,col 9)-(line 470,col 75)",
        "(line 471,col 9)-(line 471,col 79)",
        "(line 472,col 9)-(line 472,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDate()",
      "begin_line": 482,
      "end_line": 486,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DATE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 48)",
        "(line 484,col 9)-(line 484,col 82)",
        "(line 485,col 9)-(line 485,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDayOfMonth()",
      "begin_line": 494,
      "end_line": 498,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 56)",
        "(line 496,col 9)-(line 496,col 82)",
        "(line 497,col 9)-(line 497,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateAmPm()",
      "begin_line": 507,
      "end_line": 517,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.AM_PM\n     * Includes truncating the extremes of both AM and PM of one day \n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 49)",
        "(line 511,col 9)-(line 511,col 82)",
        "(line 512,col 9)-(line 512,col 72)",
        "(line 515,col 9)-(line 515,col 77)",
        "(line 516,col 9)-(line 516,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHour()",
      "begin_line": 525,
      "end_line": 529,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 48)",
        "(line 527,col 9)-(line 527,col 81)",
        "(line 528,col 9)-(line 528,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHourOfDay()",
      "begin_line": 537,
      "end_line": 541,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 55)",
        "(line 539,col 9)-(line 539,col 81)",
        "(line 540,col 9)-(line 540,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMinute()",
      "begin_line": 549,
      "end_line": 553,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MINUTE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 50)",
        "(line 551,col 9)-(line 551,col 81)",
        "(line 552,col 9)-(line 552,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSecond()",
      "begin_line": 561,
      "end_line": 565,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 50)",
        "(line 563,col 9)-(line 563,col 81)",
        "(line 564,col 9)-(line 564,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMilliSecond()",
      "begin_line": 573,
      "end_line": 576,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 55)",
        "(line 575,col 9)-(line 575,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseRoundTest(java.util.Date, java.util.Date, java.util.Date, int)",
      "begin_line": 590,
      "end_line": 625,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastRoundDownDate should round down to roundedDownDate\u003cbr\u003e\n     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate\n     * \n     * @param roundedUpDate the next rounded date after \u003cstrong\u003eroundedDownDate\u003c/strong\u003e when using \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param roundedDownDate the result if \u003cstrong\u003elastRoundDownDate\u003c/strong\u003e was rounded with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastRoundDownDate rounding this value with \u003cstrong\u003ecalendarField\u003c/strong\u003e will result in \u003cstrong\u003eroundedDownDate\u003c/strong\u003e\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 80)",
        "(line 594,col 9)-(line 594,col 87)",
        "(line 595,col 9)-(line 595,col 83)",
        "(line 596,col 9)-(line 596,col 89)",
        "(line 597,col 9)-(line 597,col 86)",
        "(line 600,col 9)-(line 600,col 101)",
        "(line 601,col 9)-(line 601,col 53)",
        "(line 602,col 9)-(line 602,col 51)",
        "(line 603,col 9)-(line 603,col 55)",
        "(line 604,col 9)-(line 604,col 54)",
        "(line 605,col 9)-(line 605,col 53)",
        "(line 606,col 9)-(line 606,col 49)",
        "(line 607,col 9)-(line 607,col 57)",
        "(line 608,col 9)-(line 608,col 55)",
        "(line 611,col 9)-(line 611,col 95)",
        "(line 612,col 9)-(line 612,col 91)",
        "(line 613,col 9)-(line 613,col 97)",
        "(line 614,col 9)-(line 614,col 94)",
        "(line 617,col 9)-(line 617,col 96)",
        "(line 618,col 9)-(line 618,col 92)",
        "(line 619,col 9)-(line 619,col 98)",
        "(line 620,col 9)-(line 620,col 95)",
        "(line 621,col 9)-(line 621,col 100)",
        "(line 622,col 9)-(line 622,col 96)",
        "(line 623,col 9)-(line 623,col 98)",
        "(line 624,col 9)-(line 624,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseTruncateTest(java.util.Date, java.util.Date, int)",
      "begin_line": 638,
      "end_line": 667,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastTruncateDate should round down to truncatedDate\u003cbr\u003e\n     * lastTruncateDate + 1 millisecond should never round down to truncatedDate\n     * \n     * @param truncatedDate expected Date when \u003cstrong\u003elastTruncateDate\u003c/strong\u003e is truncated with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastTruncateDate the last possible Date which will truncate to \u003cstrong\u003etruncatedDate\u003c/strong\u003e with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param calendarField a Calendar.field value\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 79)",
        "(line 642,col 9)-(line 642,col 204)",
        "(line 643,col 9)-(line 643,col 89)",
        "(line 644,col 9)-(line 644,col 212)",
        "(line 647,col 9)-(line 647,col 79)",
        "(line 648,col 9)-(line 648,col 51)",
        "(line 649,col 9)-(line 649,col 54)",
        "(line 650,col 9)-(line 650,col 54)",
        "(line 651,col 9)-(line 651,col 49)",
        "(line 652,col 9)-(line 652,col 55)",
        "(line 653,col 9)-(line 653,col 55)",
        "(line 656,col 9)-(line 656,col 220)",
        "(line 657,col 9)-(line 657,col 97)",
        "(line 658,col 9)-(line 658,col 228)",
        "(line 661,col 9)-(line 661,col 236)",
        "(line 662,col 9)-(line 662,col 98)",
        "(line 663,col 9)-(line 663,col 236)",
        "(line 664,col 9)-(line 664,col 248)",
        "(line 665,col 9)-(line 665,col 102)",
        "(line 666,col 9)-(line 666,col 248)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.roundToJanuaryFirst(java.util.Date, java.util.Date, int)",
      "begin_line": 679,
      "end_line": 703,
      "comment": "\n     * \n     * Any January 1 could be considered as the ultimate extreme.\n     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. \n     * \n     * @param minDate\n     * @param maxDate\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 202)",
        "(line 681,col 9)-(line 681,col 78)",
        "(line 682,col 9)-(line 682,col 78)",
        "(line 684,col 9)-(line 684,col 54)",
        "(line 685,col 9)-(line 685,col 37)",
        "(line 686,col 9)-(line 686,col 54)",
        "(line 687,col 9)-(line 687,col 37)",
        "(line 688,col 9)-(line 688,col 214)",
        "(line 689,col 9)-(line 689,col 86)",
        "(line 690,col 9)-(line 690,col 86)",
        "(line 692,col 9)-(line 692,col 70)",
        "(line 693,col 9)-(line 693,col 69)",
        "(line 694,col 9)-(line 694,col 204)",
        "(line 695,col 9)-(line 695,col 204)",
        "(line 697,col 9)-(line 697,col 62)",
        "(line 698,col 9)-(line 698,col 53)",
        "(line 699,col 9)-(line 699,col 62)",
        "(line 700,col 9)-(line 700,col 53)",
        "(line 701,col 9)-(line 701,col 208)",
        "(line 702,col 9)-(line 702,col 208)"
      ]
    }
  ]
}