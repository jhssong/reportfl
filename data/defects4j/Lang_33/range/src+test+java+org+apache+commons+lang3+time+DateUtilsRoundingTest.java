{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/time/DateUtilsRoundingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsRoundingTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 705,
      "comment": " TODO: Add DateUtils.ceil()-tests if method is available"
    },
    {
      "type": "field",
      "varNames": [
        "dateTimeParser"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneDate"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetYearDate"
      ],
      "begin_line": 47,
      "end_line": 47,
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
      "begin_line": 49,
      "end_line": 49,
      "comment": "No targetMonths, these must be tested for every type of month(28-31 days)"
    },
    {
      "type": "field",
      "varNames": [
        "targetHourOfDayDate",
        "targetHourDate"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMinuteDate"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetSecondDate"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMilliSecondDate"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneCalendar"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fdf"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.setUp()",
      "begin_line": 58,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
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
      "end_line": 90,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.Year\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 48)",
        "(line 86,col 9)-(line 86,col 81)",
        "(line 87,col 9)-(line 87,col 46)",
        "(line 88,col 9)-(line 88,col 86)",
        "(line 89,col 9)-(line 89,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMonth()",
      "begin_line": 100,
      "end_line": 133,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days\n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 49)",
        "(line 102,col 9)-(line 102,col 65)",
        "(line 103,col 9)-(line 103,col 30)",
        "(line 106,col 9)-(line 106,col 74)",
        "(line 107,col 9)-(line 107,col 79)",
        "(line 108,col 9)-(line 108,col 85)",
        "(line 109,col 9)-(line 109,col 91)",
        "(line 112,col 9)-(line 112,col 74)",
        "(line 113,col 9)-(line 113,col 79)",
        "(line 114,col 9)-(line 114,col 85)",
        "(line 115,col 9)-(line 115,col 91)",
        "(line 118,col 9)-(line 118,col 72)",
        "(line 119,col 9)-(line 119,col 76)",
        "(line 120,col 9)-(line 120,col 82)",
        "(line 121,col 9)-(line 121,col 91)",
        "(line 124,col 9)-(line 124,col 73)",
        "(line 125,col 9)-(line 125,col 74)",
        "(line 126,col 9)-(line 126,col 80)",
        "(line 127,col 9)-(line 127,col 91)",
        "(line 130,col 9)-(line 130,col 73)",
        "(line 131,col 9)-(line 131,col 72)",
        "(line 132,col 9)-(line 132,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSemiMonth()",
      "begin_line": 143,
      "end_line": 200,
      "comment": "\n     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half \n     * Includes rounding to January 1\n     *      \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 55)",
        "(line 145,col 9)-(line 145,col 65)",
        "(line 146,col 9)-(line 146,col 30)",
        "(line 149,col 9)-(line 149,col 78)",
        "(line 150,col 9)-(line 150,col 79)",
        "(line 151,col 9)-(line 151,col 84)",
        "(line 152,col 9)-(line 152,col 91)",
        "(line 155,col 9)-(line 155,col 74)",
        "(line 156,col 9)-(line 156,col 80)",
        "(line 157,col 9)-(line 157,col 85)",
        "(line 158,col 9)-(line 158,col 91)",
        "(line 161,col 9)-(line 161,col 78)",
        "(line 162,col 9)-(line 162,col 79)",
        "(line 163,col 9)-(line 163,col 84)",
        "(line 164,col 9)-(line 164,col 91)",
        "(line 167,col 9)-(line 167,col 74)",
        "(line 168,col 9)-(line 168,col 80)",
        "(line 169,col 9)-(line 169,col 85)",
        "(line 170,col 9)-(line 170,col 91)",
        "(line 173,col 9)-(line 173,col 75)",
        "(line 174,col 9)-(line 174,col 76)",
        "(line 175,col 9)-(line 175,col 81)",
        "(line 176,col 9)-(line 176,col 91)",
        "(line 179,col 9)-(line 179,col 72)",
        "(line 180,col 9)-(line 180,col 77)",
        "(line 181,col 9)-(line 181,col 82)",
        "(line 182,col 9)-(line 182,col 91)",
        "(line 185,col 9)-(line 185,col 73)",
        "(line 186,col 9)-(line 186,col 74)",
        "(line 187,col 9)-(line 187,col 79)",
        "(line 188,col 9)-(line 188,col 91)",
        "(line 191,col 9)-(line 191,col 73)",
        "(line 192,col 9)-(line 192,col 75)",
        "(line 193,col 9)-(line 193,col 80)",
        "(line 194,col 9)-(line 194,col 91)",
        "(line 197,col 9)-(line 197,col 73)",
        "(line 198,col 9)-(line 198,col 71)",
        "(line 199,col 9)-(line 199,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDate()",
      "begin_line": 210,
      "end_line": 224,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DATE\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 212,col 65)",
        "(line 213,col 9)-(line 213,col 30)",
        "(line 215,col 9)-(line 215,col 73)",
        "(line 216,col 9)-(line 216,col 41)",
        "(line 217,col 9)-(line 217,col 80)",
        "(line 218,col 9)-(line 218,col 91)",
        "(line 221,col 9)-(line 221,col 73)",
        "(line 222,col 9)-(line 222,col 71)",
        "(line 223,col 9)-(line 223,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDayOfMonth()",
      "begin_line": 234,
      "end_line": 248,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 56)",
        "(line 236,col 9)-(line 236,col 65)",
        "(line 237,col 9)-(line 237,col 30)",
        "(line 239,col 9)-(line 239,col 73)",
        "(line 240,col 9)-(line 240,col 47)",
        "(line 241,col 9)-(line 241,col 80)",
        "(line 242,col 9)-(line 242,col 91)",
        "(line 245,col 9)-(line 245,col 73)",
        "(line 246,col 9)-(line 246,col 71)",
        "(line 247,col 9)-(line 247,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundAmPm()",
      "begin_line": 258,
      "end_line": 279,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.AM_PM\n     * Includes rounding the extremes of both AM and PM of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 49)",
        "(line 260,col 9)-(line 260,col 65)",
        "(line 261,col 9)-(line 261,col 30)",
        "(line 264,col 9)-(line 264,col 74)",
        "(line 265,col 9)-(line 265,col 39)",
        "(line 266,col 9)-(line 266,col 79)",
        "(line 267,col 9)-(line 267,col 91)",
        "(line 270,col 9)-(line 270,col 73)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 80)",
        "(line 273,col 9)-(line 273,col 91)",
        "(line 276,col 9)-(line 276,col 73)",
        "(line 277,col 9)-(line 277,col 70)",
        "(line 278,col 9)-(line 278,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHourOfDay()",
      "begin_line": 289,
      "end_line": 303,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 55)",
        "(line 291,col 9)-(line 291,col 65)",
        "(line 292,col 9)-(line 292,col 30)",
        "(line 294,col 9)-(line 294,col 73)",
        "(line 295,col 9)-(line 295,col 46)",
        "(line 296,col 9)-(line 296,col 79)",
        "(line 297,col 9)-(line 297,col 91)",
        "(line 300,col 9)-(line 300,col 73)",
        "(line 301,col 9)-(line 301,col 70)",
        "(line 302,col 9)-(line 302,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHour()",
      "begin_line": 313,
      "end_line": 327,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 48)",
        "(line 315,col 9)-(line 315,col 65)",
        "(line 316,col 9)-(line 316,col 30)",
        "(line 318,col 9)-(line 318,col 73)",
        "(line 319,col 9)-(line 319,col 41)",
        "(line 320,col 9)-(line 320,col 79)",
        "(line 321,col 9)-(line 321,col 91)",
        "(line 324,col 9)-(line 324,col 73)",
        "(line 325,col 9)-(line 325,col 70)",
        "(line 326,col 9)-(line 326,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMinute()",
      "begin_line": 337,
      "end_line": 351,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MINUTE\n     * Includes rounding the extremes of one minute \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 50)",
        "(line 339,col 9)-(line 339,col 65)",
        "(line 340,col 9)-(line 340,col 30)",
        "(line 342,col 9)-(line 342,col 73)",
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 344,col 79)",
        "(line 345,col 9)-(line 345,col 91)",
        "(line 348,col 9)-(line 348,col 73)",
        "(line 349,col 9)-(line 349,col 70)",
        "(line 350,col 9)-(line 350,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSecond()",
      "begin_line": 361,
      "end_line": 375,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.SECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 50)",
        "(line 363,col 9)-(line 363,col 65)",
        "(line 364,col 9)-(line 364,col 30)",
        "(line 366,col 9)-(line 366,col 73)",
        "(line 367,col 9)-(line 367,col 43)",
        "(line 368,col 9)-(line 368,col 79)",
        "(line 369,col 9)-(line 369,col 91)",
        "(line 372,col 9)-(line 372,col 73)",
        "(line 373,col 9)-(line 373,col 70)",
        "(line 374,col 9)-(line 374,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMilliSecond()",
      "begin_line": 385,
      "end_line": 397,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MILLISECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 55)",
        "(line 387,col 9)-(line 387,col 65)",
        "(line 388,col 9)-(line 388,col 30)",
        "(line 390,col 9)-(line 390,col 70)",
        "(line 391,col 9)-(line 391,col 73)",
        "(line 392,col 9)-(line 392,col 91)",
        "(line 395,col 9)-(line 395,col 43)",
        "(line 396,col 9)-(line 396,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateYear()",
      "begin_line": 405,
      "end_line": 409,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.YEAR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 48)",
        "(line 407,col 9)-(line 407,col 87)",
        "(line 408,col 9)-(line 408,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMonth()",
      "begin_line": 417,
      "end_line": 422,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 49)",
        "(line 419,col 9)-(line 419,col 79)",
        "(line 420,col 9)-(line 420,col 84)",
        "(line 421,col 9)-(line 421,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSemiMonth()",
      "begin_line": 431,
      "end_line": 475,
      "comment": "\n     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH\n     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 55)",
        "(line 433,col 9)-(line 433,col 45)",
        "(line 436,col 9)-(line 436,col 77)",
        "(line 437,col 9)-(line 437,col 82)",
        "(line 438,col 9)-(line 438,col 73)",
        "(line 441,col 9)-(line 441,col 78)",
        "(line 442,col 9)-(line 442,col 82)",
        "(line 443,col 9)-(line 443,col 73)",
        "(line 446,col 9)-(line 446,col 77)",
        "(line 447,col 9)-(line 447,col 82)",
        "(line 448,col 9)-(line 448,col 73)",
        "(line 451,col 9)-(line 451,col 78)",
        "(line 452,col 9)-(line 452,col 82)",
        "(line 453,col 9)-(line 453,col 73)",
        "(line 456,col 9)-(line 456,col 74)",
        "(line 457,col 9)-(line 457,col 79)",
        "(line 458,col 9)-(line 458,col 73)",
        "(line 461,col 9)-(line 461,col 75)",
        "(line 462,col 9)-(line 462,col 79)",
        "(line 463,col 9)-(line 463,col 73)",
        "(line 466,col 9)-(line 466,col 74)",
        "(line 467,col 9)-(line 467,col 79)",
        "(line 468,col 9)-(line 468,col 73)",
        "(line 471,col 9)-(line 471,col 75)",
        "(line 472,col 9)-(line 472,col 79)",
        "(line 473,col 9)-(line 473,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDate()",
      "begin_line": 483,
      "end_line": 487,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DATE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 48)",
        "(line 485,col 9)-(line 485,col 82)",
        "(line 486,col 9)-(line 486,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDayOfMonth()",
      "begin_line": 495,
      "end_line": 499,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 56)",
        "(line 497,col 9)-(line 497,col 82)",
        "(line 498,col 9)-(line 498,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateAmPm()",
      "begin_line": 508,
      "end_line": 518,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.AM_PM\n     * Includes truncating the extremes of both AM and PM of one day \n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 49)",
        "(line 512,col 9)-(line 512,col 82)",
        "(line 513,col 9)-(line 513,col 72)",
        "(line 516,col 9)-(line 516,col 77)",
        "(line 517,col 9)-(line 517,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHour()",
      "begin_line": 526,
      "end_line": 530,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 48)",
        "(line 528,col 9)-(line 528,col 81)",
        "(line 529,col 9)-(line 529,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHourOfDay()",
      "begin_line": 538,
      "end_line": 542,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 55)",
        "(line 540,col 9)-(line 540,col 81)",
        "(line 541,col 9)-(line 541,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMinute()",
      "begin_line": 550,
      "end_line": 554,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MINUTE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 50)",
        "(line 552,col 9)-(line 552,col 81)",
        "(line 553,col 9)-(line 553,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSecond()",
      "begin_line": 562,
      "end_line": 566,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 50)",
        "(line 564,col 9)-(line 564,col 81)",
        "(line 565,col 9)-(line 565,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMilliSecond()",
      "begin_line": 574,
      "end_line": 577,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 55)",
        "(line 576,col 9)-(line 576,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseRoundTest(java.util.Date, java.util.Date, java.util.Date, int)",
      "begin_line": 591,
      "end_line": 626,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastRoundDownDate should round down to roundedDownDate\u003cbr\u003e\n     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate\n     * \n     * @param roundedUpDate the next rounded date after \u003cstrong\u003eroundedDownDate\u003c/strong\u003e when using \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param roundedDownDate the result if \u003cstrong\u003elastRoundDownDate\u003c/strong\u003e was rounded with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastRoundDownDate rounding this value with \u003cstrong\u003ecalendarField\u003c/strong\u003e will result in \u003cstrong\u003eroundedDownDate\u003c/strong\u003e\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 80)",
        "(line 595,col 9)-(line 595,col 87)",
        "(line 596,col 9)-(line 596,col 83)",
        "(line 597,col 9)-(line 597,col 89)",
        "(line 598,col 9)-(line 598,col 86)",
        "(line 601,col 9)-(line 601,col 101)",
        "(line 602,col 9)-(line 602,col 53)",
        "(line 603,col 9)-(line 603,col 51)",
        "(line 604,col 9)-(line 604,col 55)",
        "(line 605,col 9)-(line 605,col 54)",
        "(line 606,col 9)-(line 606,col 53)",
        "(line 607,col 9)-(line 607,col 49)",
        "(line 608,col 9)-(line 608,col 57)",
        "(line 609,col 9)-(line 609,col 55)",
        "(line 612,col 9)-(line 612,col 95)",
        "(line 613,col 9)-(line 613,col 91)",
        "(line 614,col 9)-(line 614,col 97)",
        "(line 615,col 9)-(line 615,col 94)",
        "(line 618,col 9)-(line 618,col 96)",
        "(line 619,col 9)-(line 619,col 92)",
        "(line 620,col 9)-(line 620,col 98)",
        "(line 621,col 9)-(line 621,col 95)",
        "(line 622,col 9)-(line 622,col 100)",
        "(line 623,col 9)-(line 623,col 96)",
        "(line 624,col 9)-(line 624,col 98)",
        "(line 625,col 9)-(line 625,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseTruncateTest(java.util.Date, java.util.Date, int)",
      "begin_line": 639,
      "end_line": 668,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastTruncateDate should round down to truncatedDate\u003cbr\u003e\n     * lastTruncateDate + 1 millisecond should never round down to truncatedDate\n     * \n     * @param truncatedDate expected Date when \u003cstrong\u003elastTruncateDate\u003c/strong\u003e is truncated with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastTruncateDate the last possible Date which will truncate to \u003cstrong\u003etruncatedDate\u003c/strong\u003e with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param calendarField a Calendar.field value\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 79)",
        "(line 643,col 9)-(line 643,col 204)",
        "(line 644,col 9)-(line 644,col 89)",
        "(line 645,col 9)-(line 645,col 212)",
        "(line 648,col 9)-(line 648,col 79)",
        "(line 649,col 9)-(line 649,col 51)",
        "(line 650,col 9)-(line 650,col 54)",
        "(line 651,col 9)-(line 651,col 54)",
        "(line 652,col 9)-(line 652,col 49)",
        "(line 653,col 9)-(line 653,col 55)",
        "(line 654,col 9)-(line 654,col 55)",
        "(line 657,col 9)-(line 657,col 220)",
        "(line 658,col 9)-(line 658,col 97)",
        "(line 659,col 9)-(line 659,col 228)",
        "(line 662,col 9)-(line 662,col 236)",
        "(line 663,col 9)-(line 663,col 98)",
        "(line 664,col 9)-(line 664,col 236)",
        "(line 665,col 9)-(line 665,col 248)",
        "(line 666,col 9)-(line 666,col 102)",
        "(line 667,col 9)-(line 667,col 248)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.roundToJanuaryFirst(java.util.Date, java.util.Date, int)",
      "begin_line": 680,
      "end_line": 704,
      "comment": "\n     * \n     * Any January 1 could be considered as the ultimate extreme.\n     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. \n     * \n     * @param minDate\n     * @param maxDate\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 202)",
        "(line 682,col 9)-(line 682,col 78)",
        "(line 683,col 9)-(line 683,col 78)",
        "(line 685,col 9)-(line 685,col 54)",
        "(line 686,col 9)-(line 686,col 37)",
        "(line 687,col 9)-(line 687,col 54)",
        "(line 688,col 9)-(line 688,col 37)",
        "(line 689,col 9)-(line 689,col 214)",
        "(line 690,col 9)-(line 690,col 86)",
        "(line 691,col 9)-(line 691,col 86)",
        "(line 693,col 9)-(line 693,col 70)",
        "(line 694,col 9)-(line 694,col 69)",
        "(line 695,col 9)-(line 695,col 204)",
        "(line 696,col 9)-(line 696,col 204)",
        "(line 698,col 9)-(line 698,col 62)",
        "(line 699,col 9)-(line 699,col 53)",
        "(line 700,col 9)-(line 700,col 62)",
        "(line 701,col 9)-(line 701,col 53)",
        "(line 702,col 9)-(line 702,col 208)",
        "(line 703,col 9)-(line 703,col 208)"
      ]
    }
  ]
}