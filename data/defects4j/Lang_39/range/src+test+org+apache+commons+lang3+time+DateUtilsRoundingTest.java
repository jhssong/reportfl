{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/time/DateUtilsRoundingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsRoundingTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 44,
      "end_line": 713,
      "comment": " TODO: Add DateUtils.ceil()-tests if method is available"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.suite()",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 69)",
        "(line 48,col 9)-(line 48,col 50)",
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "dateTimeParser"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneDate"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetYearDate"
      ],
      "begin_line": 55,
      "end_line": 55,
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
      "begin_line": 57,
      "end_line": 57,
      "comment": "No targetMonths, these must be tested for every type of month(28-31 days)"
    },
    {
      "type": "field",
      "varNames": [
        "targetHourOfDayDate",
        "targetHourDate"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMinuteDate"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetSecondDate"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targetMilliSecondDate"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "januaryOneCalendar"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fdf"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.setUp()",
      "begin_line": 66,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 22)",
        "(line 69,col 9)-(line 69,col 90)",
        "(line 71,col 9)-(line 71,col 77)",
        "(line 72,col 9)-(line 72,col 97)",
        "(line 73,col 9)-(line 73,col 73)",
        "(line 74,col 9)-(line 74,col 73)",
        "(line 75,col 9)-(line 75,col 74)",
        "(line 76,col 9)-(line 76,col 79)",
        "(line 77,col 9)-(line 77,col 77)",
        "(line 78,col 9)-(line 78,col 77)",
        "(line 79,col 9)-(line 79,col 82)",
        "(line 81,col 9)-(line 81,col 77)",
        "(line 82,col 9)-(line 82,col 52)",
        "(line 83,col 9)-(line 83,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundYear()",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.Year\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 48)",
        "(line 94,col 9)-(line 94,col 81)",
        "(line 95,col 9)-(line 95,col 46)",
        "(line 96,col 9)-(line 96,col 86)",
        "(line 97,col 9)-(line 97,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMonth()",
      "begin_line": 108,
      "end_line": 141,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days\n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 110,col 65)",
        "(line 111,col 9)-(line 111,col 30)",
        "(line 114,col 9)-(line 114,col 74)",
        "(line 115,col 9)-(line 115,col 79)",
        "(line 116,col 9)-(line 116,col 85)",
        "(line 117,col 9)-(line 117,col 91)",
        "(line 120,col 9)-(line 120,col 74)",
        "(line 121,col 9)-(line 121,col 79)",
        "(line 122,col 9)-(line 122,col 85)",
        "(line 123,col 9)-(line 123,col 91)",
        "(line 126,col 9)-(line 126,col 72)",
        "(line 127,col 9)-(line 127,col 76)",
        "(line 128,col 9)-(line 128,col 82)",
        "(line 129,col 9)-(line 129,col 91)",
        "(line 132,col 9)-(line 132,col 73)",
        "(line 133,col 9)-(line 133,col 74)",
        "(line 134,col 9)-(line 134,col 80)",
        "(line 135,col 9)-(line 135,col 91)",
        "(line 138,col 9)-(line 138,col 73)",
        "(line 139,col 9)-(line 139,col 72)",
        "(line 140,col 9)-(line 140,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSemiMonth()",
      "begin_line": 151,
      "end_line": 208,
      "comment": "\n     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH\n     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half \n     * Includes rounding to January 1\n     *      \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 55)",
        "(line 153,col 9)-(line 153,col 65)",
        "(line 154,col 9)-(line 154,col 30)",
        "(line 157,col 9)-(line 157,col 78)",
        "(line 158,col 9)-(line 158,col 79)",
        "(line 159,col 9)-(line 159,col 84)",
        "(line 160,col 9)-(line 160,col 91)",
        "(line 163,col 9)-(line 163,col 74)",
        "(line 164,col 9)-(line 164,col 80)",
        "(line 165,col 9)-(line 165,col 85)",
        "(line 166,col 9)-(line 166,col 91)",
        "(line 169,col 9)-(line 169,col 78)",
        "(line 170,col 9)-(line 170,col 79)",
        "(line 171,col 9)-(line 171,col 84)",
        "(line 172,col 9)-(line 172,col 91)",
        "(line 175,col 9)-(line 175,col 74)",
        "(line 176,col 9)-(line 176,col 80)",
        "(line 177,col 9)-(line 177,col 85)",
        "(line 178,col 9)-(line 178,col 91)",
        "(line 181,col 9)-(line 181,col 75)",
        "(line 182,col 9)-(line 182,col 76)",
        "(line 183,col 9)-(line 183,col 81)",
        "(line 184,col 9)-(line 184,col 91)",
        "(line 187,col 9)-(line 187,col 72)",
        "(line 188,col 9)-(line 188,col 77)",
        "(line 189,col 9)-(line 189,col 82)",
        "(line 190,col 9)-(line 190,col 91)",
        "(line 193,col 9)-(line 193,col 73)",
        "(line 194,col 9)-(line 194,col 74)",
        "(line 195,col 9)-(line 195,col 79)",
        "(line 196,col 9)-(line 196,col 91)",
        "(line 199,col 9)-(line 199,col 73)",
        "(line 200,col 9)-(line 200,col 75)",
        "(line 201,col 9)-(line 201,col 80)",
        "(line 202,col 9)-(line 202,col 91)",
        "(line 205,col 9)-(line 205,col 73)",
        "(line 206,col 9)-(line 206,col 71)",
        "(line 207,col 9)-(line 207,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDate()",
      "begin_line": 218,
      "end_line": 232,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DATE\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 48)",
        "(line 220,col 9)-(line 220,col 65)",
        "(line 221,col 9)-(line 221,col 30)",
        "(line 223,col 9)-(line 223,col 73)",
        "(line 224,col 9)-(line 224,col 41)",
        "(line 225,col 9)-(line 225,col 80)",
        "(line 226,col 9)-(line 226,col 91)",
        "(line 229,col 9)-(line 229,col 73)",
        "(line 230,col 9)-(line 230,col 71)",
        "(line 231,col 9)-(line 231,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDayOfMonth()",
      "begin_line": 242,
      "end_line": 256,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH\n     * Includes rounding the extremes of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 56)",
        "(line 244,col 9)-(line 244,col 65)",
        "(line 245,col 9)-(line 245,col 30)",
        "(line 247,col 9)-(line 247,col 73)",
        "(line 248,col 9)-(line 248,col 47)",
        "(line 249,col 9)-(line 249,col 80)",
        "(line 250,col 9)-(line 250,col 91)",
        "(line 253,col 9)-(line 253,col 73)",
        "(line 254,col 9)-(line 254,col 71)",
        "(line 255,col 9)-(line 255,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundAmPm()",
      "begin_line": 266,
      "end_line": 287,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.AM_PM\n     * Includes rounding the extremes of both AM and PM of one day \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 49)",
        "(line 268,col 9)-(line 268,col 65)",
        "(line 269,col 9)-(line 269,col 30)",
        "(line 272,col 9)-(line 272,col 74)",
        "(line 273,col 9)-(line 273,col 39)",
        "(line 274,col 9)-(line 274,col 79)",
        "(line 275,col 9)-(line 275,col 91)",
        "(line 278,col 9)-(line 278,col 73)",
        "(line 279,col 9)-(line 279,col 39)",
        "(line 280,col 9)-(line 280,col 80)",
        "(line 281,col 9)-(line 281,col 91)",
        "(line 284,col 9)-(line 284,col 73)",
        "(line 285,col 9)-(line 285,col 70)",
        "(line 286,col 9)-(line 286,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHourOfDay()",
      "begin_line": 297,
      "end_line": 311,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY\n     * Includes rounding the extremes of one hour \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 55)",
        "(line 299,col 9)-(line 299,col 65)",
        "(line 300,col 9)-(line 300,col 30)",
        "(line 302,col 9)-(line 302,col 73)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 304,col 9)-(line 304,col 79)",
        "(line 305,col 9)-(line 305,col 91)",
        "(line 308,col 9)-(line 308,col 73)",
        "(line 309,col 9)-(line 309,col 70)",
        "(line 310,col 9)-(line 310,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHour()",
      "begin_line": 321,
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
      "end_line": 359,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MINUTE\n     * Includes rounding the extremes of one minute \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 50)",
        "(line 347,col 9)-(line 347,col 65)",
        "(line 348,col 9)-(line 348,col 30)",
        "(line 350,col 9)-(line 350,col 73)",
        "(line 351,col 9)-(line 351,col 43)",
        "(line 352,col 9)-(line 352,col 79)",
        "(line 353,col 9)-(line 353,col 91)",
        "(line 356,col 9)-(line 356,col 73)",
        "(line 357,col 9)-(line 357,col 70)",
        "(line 358,col 9)-(line 358,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSecond()",
      "begin_line": 369,
      "end_line": 383,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.SECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 50)",
        "(line 371,col 9)-(line 371,col 65)",
        "(line 372,col 9)-(line 372,col 30)",
        "(line 374,col 9)-(line 374,col 73)",
        "(line 375,col 9)-(line 375,col 43)",
        "(line 376,col 9)-(line 376,col 79)",
        "(line 377,col 9)-(line 377,col 91)",
        "(line 380,col 9)-(line 380,col 73)",
        "(line 381,col 9)-(line 381,col 70)",
        "(line 382,col 9)-(line 382,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMilliSecond()",
      "begin_line": 393,
      "end_line": 405,
      "comment": "\n     * Tests DateUtils.round()-method with Calendar.MILLISECOND\n     * Includes rounding the extremes of one second \n     * Includes rounding to January 1\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 55)",
        "(line 395,col 9)-(line 395,col 65)",
        "(line 396,col 9)-(line 396,col 30)",
        "(line 398,col 9)-(line 398,col 70)",
        "(line 399,col 9)-(line 399,col 73)",
        "(line 400,col 9)-(line 400,col 91)",
        "(line 403,col 9)-(line 403,col 43)",
        "(line 404,col 9)-(line 404,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateYear()",
      "begin_line": 413,
      "end_line": 417,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.YEAR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 48)",
        "(line 415,col 9)-(line 415,col 87)",
        "(line 416,col 9)-(line 416,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMonth()",
      "begin_line": 425,
      "end_line": 430,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 49)",
        "(line 427,col 9)-(line 427,col 79)",
        "(line 428,col 9)-(line 428,col 84)",
        "(line 429,col 9)-(line 429,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSemiMonth()",
      "begin_line": 439,
      "end_line": 483,
      "comment": "\n     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH\n     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 55)",
        "(line 441,col 9)-(line 441,col 45)",
        "(line 444,col 9)-(line 444,col 77)",
        "(line 445,col 9)-(line 445,col 82)",
        "(line 446,col 9)-(line 446,col 73)",
        "(line 449,col 9)-(line 449,col 78)",
        "(line 450,col 9)-(line 450,col 82)",
        "(line 451,col 9)-(line 451,col 73)",
        "(line 454,col 9)-(line 454,col 77)",
        "(line 455,col 9)-(line 455,col 82)",
        "(line 456,col 9)-(line 456,col 73)",
        "(line 459,col 9)-(line 459,col 78)",
        "(line 460,col 9)-(line 460,col 82)",
        "(line 461,col 9)-(line 461,col 73)",
        "(line 464,col 9)-(line 464,col 74)",
        "(line 465,col 9)-(line 465,col 79)",
        "(line 466,col 9)-(line 466,col 73)",
        "(line 469,col 9)-(line 469,col 75)",
        "(line 470,col 9)-(line 470,col 79)",
        "(line 471,col 9)-(line 471,col 73)",
        "(line 474,col 9)-(line 474,col 74)",
        "(line 475,col 9)-(line 475,col 79)",
        "(line 476,col 9)-(line 476,col 73)",
        "(line 479,col 9)-(line 479,col 75)",
        "(line 480,col 9)-(line 480,col 79)",
        "(line 481,col 9)-(line 481,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDate()",
      "begin_line": 491,
      "end_line": 495,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DATE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 48)",
        "(line 493,col 9)-(line 493,col 82)",
        "(line 494,col 9)-(line 494,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDayOfMonth()",
      "begin_line": 503,
      "end_line": 507,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 56)",
        "(line 505,col 9)-(line 505,col 82)",
        "(line 506,col 9)-(line 506,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateAmPm()",
      "begin_line": 516,
      "end_line": 526,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.AM_PM\n     * Includes truncating the extremes of both AM and PM of one day \n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 49)",
        "(line 520,col 9)-(line 520,col 82)",
        "(line 521,col 9)-(line 521,col 72)",
        "(line 524,col 9)-(line 524,col 77)",
        "(line 525,col 9)-(line 525,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHour()",
      "begin_line": 534,
      "end_line": 538,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 48)",
        "(line 536,col 9)-(line 536,col 81)",
        "(line 537,col 9)-(line 537,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHourOfDay()",
      "begin_line": 546,
      "end_line": 550,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 55)",
        "(line 548,col 9)-(line 548,col 81)",
        "(line 549,col 9)-(line 549,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMinute()",
      "begin_line": 558,
      "end_line": 562,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.MINUTE\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 50)",
        "(line 560,col 9)-(line 560,col 81)",
        "(line 561,col 9)-(line 561,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSecond()",
      "begin_line": 570,
      "end_line": 574,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 50)",
        "(line 572,col 9)-(line 572,col 81)",
        "(line 573,col 9)-(line 573,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMilliSecond()",
      "begin_line": 582,
      "end_line": 585,
      "comment": "\n     * Test DateUtils.truncate()-method with Calendar.SECOND\n     * \n     * @throws Exception\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 55)",
        "(line 584,col 9)-(line 584,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseRoundTest(java.util.Date, java.util.Date, java.util.Date, int)",
      "begin_line": 599,
      "end_line": 634,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastRoundDownDate should round down to roundedDownDate\u003cbr\u003e\n     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate\n     * \n     * @param roundedUpDate the next rounded date after \u003cstrong\u003eroundedDownDate\u003c/strong\u003e when using \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param roundedDownDate the result if \u003cstrong\u003elastRoundDownDate\u003c/strong\u003e was rounded with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastRoundDownDate rounding this value with \u003cstrong\u003ecalendarField\u003c/strong\u003e will result in \u003cstrong\u003eroundedDownDate\u003c/strong\u003e\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 80)",
        "(line 603,col 9)-(line 603,col 87)",
        "(line 604,col 9)-(line 604,col 83)",
        "(line 605,col 9)-(line 605,col 89)",
        "(line 606,col 9)-(line 606,col 86)",
        "(line 609,col 9)-(line 609,col 101)",
        "(line 610,col 9)-(line 610,col 53)",
        "(line 611,col 9)-(line 611,col 51)",
        "(line 612,col 9)-(line 612,col 55)",
        "(line 613,col 9)-(line 613,col 54)",
        "(line 614,col 9)-(line 614,col 53)",
        "(line 615,col 9)-(line 615,col 49)",
        "(line 616,col 9)-(line 616,col 57)",
        "(line 617,col 9)-(line 617,col 55)",
        "(line 620,col 9)-(line 620,col 95)",
        "(line 621,col 9)-(line 621,col 91)",
        "(line 622,col 9)-(line 622,col 97)",
        "(line 623,col 9)-(line 623,col 94)",
        "(line 626,col 9)-(line 626,col 96)",
        "(line 627,col 9)-(line 627,col 92)",
        "(line 628,col 9)-(line 628,col 98)",
        "(line 629,col 9)-(line 629,col 95)",
        "(line 630,col 9)-(line 630,col 100)",
        "(line 631,col 9)-(line 631,col 96)",
        "(line 632,col 9)-(line 632,col 98)",
        "(line 633,col 9)-(line 633,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.baseTruncateTest(java.util.Date, java.util.Date, int)",
      "begin_line": 647,
      "end_line": 676,
      "comment": "\n     * When using this basetest all extremes are tested.\u003cbr\u003e \n     * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n     * lastTruncateDate should round down to truncatedDate\u003cbr\u003e\n     * lastTruncateDate + 1 millisecond should never round down to truncatedDate\n     * \n     * @param truncatedDate expected Date when \u003cstrong\u003elastTruncateDate\u003c/strong\u003e is truncated with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param lastTruncateDate the last possible Date which will truncate to \u003cstrong\u003etruncatedDate\u003c/strong\u003e with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n     * @param calendarField a Calendar.field value\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 79)",
        "(line 651,col 9)-(line 651,col 204)",
        "(line 652,col 9)-(line 652,col 89)",
        "(line 653,col 9)-(line 653,col 212)",
        "(line 656,col 9)-(line 656,col 79)",
        "(line 657,col 9)-(line 657,col 51)",
        "(line 658,col 9)-(line 658,col 54)",
        "(line 659,col 9)-(line 659,col 54)",
        "(line 660,col 9)-(line 660,col 49)",
        "(line 661,col 9)-(line 661,col 55)",
        "(line 662,col 9)-(line 662,col 55)",
        "(line 665,col 9)-(line 665,col 220)",
        "(line 666,col 9)-(line 666,col 97)",
        "(line 667,col 9)-(line 667,col 228)",
        "(line 670,col 9)-(line 670,col 236)",
        "(line 671,col 9)-(line 671,col 98)",
        "(line 672,col 9)-(line 672,col 236)",
        "(line 673,col 9)-(line 673,col 248)",
        "(line 674,col 9)-(line 674,col 102)",
        "(line 675,col 9)-(line 675,col 248)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsRoundingTest.roundToJanuaryFirst(java.util.Date, java.util.Date, int)",
      "begin_line": 688,
      "end_line": 712,
      "comment": "\n     * \n     * Any January 1 could be considered as the ultimate extreme.\n     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. \n     * \n     * @param minDate\n     * @param maxDate\n     * @param calendarField\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 202)",
        "(line 690,col 9)-(line 690,col 78)",
        "(line 691,col 9)-(line 691,col 78)",
        "(line 693,col 9)-(line 693,col 54)",
        "(line 694,col 9)-(line 694,col 37)",
        "(line 695,col 9)-(line 695,col 54)",
        "(line 696,col 9)-(line 696,col 37)",
        "(line 697,col 9)-(line 697,col 214)",
        "(line 698,col 9)-(line 698,col 86)",
        "(line 699,col 9)-(line 699,col 86)",
        "(line 701,col 9)-(line 701,col 70)",
        "(line 702,col 9)-(line 702,col 69)",
        "(line 703,col 9)-(line 703,col 204)",
        "(line 704,col 9)-(line 704,col 204)",
        "(line 706,col 9)-(line 706,col 62)",
        "(line 707,col 9)-(line 707,col 53)",
        "(line 708,col 9)-(line 708,col 62)",
        "(line 709,col 9)-(line 709,col 53)",
        "(line 710,col 9)-(line 710,col 208)",
        "(line 711,col 9)-(line 711,col 208)"
      ]
    }
  ]
}