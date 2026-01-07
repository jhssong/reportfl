{
  "filepath": "/tmp/Lang-43b/src/test/org/apache/commons/lang/time/DateUtilsRoundingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsRoundingTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 45,
      "end_line": 713,
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
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 68,col 3)-(line 68,col 16)",
        "(line 69,col 3)-(line 69,col 84)",
        "(line 71,col 3)-(line 71,col 71)",
        "(line 72,col 3)-(line 72,col 91)",
        "(line 73,col 3)-(line 73,col 67)",
        "(line 74,col 3)-(line 74,col 67)",
        "(line 75,col 3)-(line 75,col 68)",
        "(line 76,col 3)-(line 76,col 73)",
        "(line 77,col 3)-(line 77,col 71)",
        "(line 78,col 3)-(line 78,col 71)",
        "(line 79,col 3)-(line 79,col 76)",
        "(line 81,col 3)-(line 81,col 71)",
        "(line 82,col 3)-(line 82,col 46)",
        "(line 83,col 3)-(line 83,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundYear()",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.Year\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 93,col 3)-(line 93,col 42)",
        "(line 94,col 3)-(line 94,col 75)",
        "(line 95,col 3)-(line 95,col 40)",
        "(line 96,col 3)-(line 96,col 80)",
        "(line 97,col 3)-(line 97,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundMonth()",
      "begin_line": 108,
      "end_line": 141,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.MONTH\n\t * Includes rounding months with 28, 29, 30 and 31 days\n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 109,col 3)-(line 109,col 43)",
        "(line 110,col 3)-(line 110,col 59)",
        "(line 111,col 3)-(line 111,col 24)",
        "(line 114,col 3)-(line 114,col 68)",
        "(line 115,col 3)-(line 115,col 73)",
        "(line 116,col 3)-(line 116,col 79)",
        "(line 117,col 3)-(line 117,col 85)",
        "(line 120,col 3)-(line 120,col 68)",
        "(line 121,col 3)-(line 121,col 73)",
        "(line 122,col 3)-(line 122,col 79)",
        "(line 123,col 3)-(line 123,col 85)",
        "(line 126,col 3)-(line 126,col 66)",
        "(line 127,col 3)-(line 127,col 70)",
        "(line 128,col 3)-(line 128,col 76)",
        "(line 129,col 3)-(line 129,col 85)",
        "(line 132,col 3)-(line 132,col 67)",
        "(line 133,col 3)-(line 133,col 68)",
        "(line 134,col 3)-(line 134,col 74)",
        "(line 135,col 3)-(line 135,col 85)",
        "(line 138,col 3)-(line 138,col 67)",
        "(line 139,col 3)-(line 139,col 66)",
        "(line 140,col 3)-(line 140,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundSemiMonth()",
      "begin_line": 151,
      "end_line": 208,
      "comment": "\n\t * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH\n\t * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half \n\t * Includes rounding to January 1\n\t * \t \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 152,col 3)-(line 152,col 49)",
        "(line 153,col 3)-(line 153,col 59)",
        "(line 154,col 3)-(line 154,col 24)",
        "(line 157,col 3)-(line 157,col 72)",
        "(line 158,col 3)-(line 158,col 73)",
        "(line 159,col 3)-(line 159,col 78)",
        "(line 160,col 3)-(line 160,col 85)",
        "(line 163,col 3)-(line 163,col 68)",
        "(line 164,col 3)-(line 164,col 74)",
        "(line 165,col 3)-(line 165,col 79)",
        "(line 166,col 3)-(line 166,col 85)",
        "(line 169,col 3)-(line 169,col 72)",
        "(line 170,col 3)-(line 170,col 73)",
        "(line 171,col 3)-(line 171,col 78)",
        "(line 172,col 3)-(line 172,col 85)",
        "(line 175,col 3)-(line 175,col 68)",
        "(line 176,col 3)-(line 176,col 74)",
        "(line 177,col 3)-(line 177,col 79)",
        "(line 178,col 3)-(line 178,col 85)",
        "(line 181,col 3)-(line 181,col 69)",
        "(line 182,col 3)-(line 182,col 70)",
        "(line 183,col 3)-(line 183,col 75)",
        "(line 184,col 3)-(line 184,col 85)",
        "(line 187,col 3)-(line 187,col 66)",
        "(line 188,col 3)-(line 188,col 71)",
        "(line 189,col 3)-(line 189,col 76)",
        "(line 190,col 3)-(line 190,col 85)",
        "(line 193,col 3)-(line 193,col 67)",
        "(line 194,col 3)-(line 194,col 68)",
        "(line 195,col 3)-(line 195,col 73)",
        "(line 196,col 3)-(line 196,col 85)",
        "(line 199,col 3)-(line 199,col 67)",
        "(line 200,col 3)-(line 200,col 69)",
        "(line 201,col 3)-(line 201,col 74)",
        "(line 202,col 3)-(line 202,col 85)",
        "(line 205,col 3)-(line 205,col 67)",
        "(line 206,col 3)-(line 206,col 65)",
        "(line 207,col 3)-(line 207,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundDate()",
      "begin_line": 218,
      "end_line": 232,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.DATE\n\t * Includes rounding the extremes of one day \n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 219,col 3)-(line 219,col 42)",
        "(line 220,col 3)-(line 220,col 59)",
        "(line 221,col 3)-(line 221,col 24)",
        "(line 223,col 3)-(line 223,col 67)",
        "(line 224,col 3)-(line 224,col 35)",
        "(line 225,col 3)-(line 225,col 74)",
        "(line 226,col 3)-(line 226,col 85)",
        "(line 229,col 3)-(line 229,col 67)",
        "(line 230,col 3)-(line 230,col 65)",
        "(line 231,col 3)-(line 231,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundDayOfMonth()",
      "begin_line": 242,
      "end_line": 256,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH\n\t * Includes rounding the extremes of one day \n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 243,col 3)-(line 243,col 50)",
        "(line 244,col 3)-(line 244,col 59)",
        "(line 245,col 3)-(line 245,col 24)",
        "(line 247,col 3)-(line 247,col 67)",
        "(line 248,col 3)-(line 248,col 41)",
        "(line 249,col 3)-(line 249,col 74)",
        "(line 250,col 3)-(line 250,col 85)",
        "(line 253,col 3)-(line 253,col 67)",
        "(line 254,col 3)-(line 254,col 65)",
        "(line 255,col 3)-(line 255,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundAmPm()",
      "begin_line": 266,
      "end_line": 287,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.AM_PM\n\t * Includes rounding the extremes of both AM and PM of one day \n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @3.0\n\t ",
      "child_ranges": [
        "(line 267,col 3)-(line 267,col 43)",
        "(line 268,col 3)-(line 268,col 59)",
        "(line 269,col 3)-(line 269,col 24)",
        "(line 272,col 3)-(line 272,col 68)",
        "(line 273,col 3)-(line 273,col 33)",
        "(line 274,col 3)-(line 274,col 73)",
        "(line 275,col 3)-(line 275,col 85)",
        "(line 278,col 3)-(line 278,col 67)",
        "(line 279,col 3)-(line 279,col 33)",
        "(line 280,col 3)-(line 280,col 74)",
        "(line 281,col 3)-(line 281,col 85)",
        "(line 284,col 3)-(line 284,col 67)",
        "(line 285,col 3)-(line 285,col 64)",
        "(line 286,col 3)-(line 286,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundHourOfDay()",
      "begin_line": 297,
      "end_line": 311,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY\n\t * Includes rounding the extremes of one hour \n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 298,col 3)-(line 298,col 49)",
        "(line 299,col 3)-(line 299,col 59)",
        "(line 300,col 3)-(line 300,col 24)",
        "(line 302,col 3)-(line 302,col 67)",
        "(line 303,col 3)-(line 303,col 40)",
        "(line 304,col 3)-(line 304,col 73)",
        "(line 305,col 3)-(line 305,col 85)",
        "(line 308,col 3)-(line 308,col 67)",
        "(line 309,col 3)-(line 309,col 64)",
        "(line 310,col 3)-(line 310,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundHour()",
      "begin_line": 321,
      "end_line": 335,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.HOUR\n\t * Includes rounding the extremes of one hour \n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 322,col 3)-(line 322,col 42)",
        "(line 323,col 3)-(line 323,col 59)",
        "(line 324,col 3)-(line 324,col 24)",
        "(line 326,col 3)-(line 326,col 67)",
        "(line 327,col 3)-(line 327,col 35)",
        "(line 328,col 3)-(line 328,col 73)",
        "(line 329,col 3)-(line 329,col 85)",
        "(line 332,col 3)-(line 332,col 67)",
        "(line 333,col 3)-(line 333,col 64)",
        "(line 334,col 3)-(line 334,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundMinute()",
      "begin_line": 345,
      "end_line": 359,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.MINUTE\n\t * Includes rounding the extremes of one minute \n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 346,col 3)-(line 346,col 44)",
        "(line 347,col 3)-(line 347,col 59)",
        "(line 348,col 3)-(line 348,col 24)",
        "(line 350,col 3)-(line 350,col 67)",
        "(line 351,col 3)-(line 351,col 37)",
        "(line 352,col 3)-(line 352,col 73)",
        "(line 353,col 3)-(line 353,col 85)",
        "(line 356,col 3)-(line 356,col 67)",
        "(line 357,col 3)-(line 357,col 64)",
        "(line 358,col 3)-(line 358,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundSecond()",
      "begin_line": 369,
      "end_line": 383,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.SECOND\n\t * Includes rounding the extremes of one second \n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 370,col 3)-(line 370,col 44)",
        "(line 371,col 3)-(line 371,col 59)",
        "(line 372,col 3)-(line 372,col 24)",
        "(line 374,col 3)-(line 374,col 67)",
        "(line 375,col 3)-(line 375,col 37)",
        "(line 376,col 3)-(line 376,col 73)",
        "(line 377,col 3)-(line 377,col 85)",
        "(line 380,col 3)-(line 380,col 67)",
        "(line 381,col 3)-(line 381,col 64)",
        "(line 382,col 3)-(line 382,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testRoundMilliSecond()",
      "begin_line": 393,
      "end_line": 405,
      "comment": "\n\t * Tests DateUtils.round()-method with Calendar.MILLISECOND\n\t * Includes rounding the extremes of one second \n\t * Includes rounding to January 1\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 394,col 3)-(line 394,col 49)",
        "(line 395,col 3)-(line 395,col 59)",
        "(line 396,col 3)-(line 396,col 24)",
        "(line 398,col 3)-(line 398,col 64)",
        "(line 399,col 3)-(line 399,col 67)",
        "(line 400,col 3)-(line 400,col 85)",
        "(line 403,col 3)-(line 403,col 37)",
        "(line 404,col 3)-(line 404,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateYear()",
      "begin_line": 413,
      "end_line": 417,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.YEAR\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 414,col 3)-(line 414,col 42)",
        "(line 415,col 3)-(line 415,col 81)",
        "(line 416,col 3)-(line 416,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateMonth()",
      "begin_line": 425,
      "end_line": 430,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.MONTH\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 426,col 3)-(line 426,col 43)",
        "(line 427,col 3)-(line 427,col 73)",
        "(line 428,col 3)-(line 428,col 78)",
        "(line 429,col 3)-(line 429,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateSemiMonth()",
      "begin_line": 439,
      "end_line": 483,
      "comment": "\n\t * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH\n\t * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 440,col 3)-(line 440,col 49)",
        "(line 441,col 3)-(line 441,col 39)",
        "(line 444,col 3)-(line 444,col 71)",
        "(line 445,col 3)-(line 445,col 76)",
        "(line 446,col 3)-(line 446,col 67)",
        "(line 449,col 3)-(line 449,col 72)",
        "(line 450,col 3)-(line 450,col 76)",
        "(line 451,col 3)-(line 451,col 67)",
        "(line 454,col 3)-(line 454,col 71)",
        "(line 455,col 3)-(line 455,col 76)",
        "(line 456,col 3)-(line 456,col 67)",
        "(line 459,col 3)-(line 459,col 72)",
        "(line 460,col 3)-(line 460,col 76)",
        "(line 461,col 3)-(line 461,col 67)",
        "(line 464,col 3)-(line 464,col 68)",
        "(line 465,col 3)-(line 465,col 73)",
        "(line 466,col 3)-(line 466,col 67)",
        "(line 469,col 3)-(line 469,col 69)",
        "(line 470,col 3)-(line 470,col 73)",
        "(line 471,col 3)-(line 471,col 67)",
        "(line 474,col 3)-(line 474,col 68)",
        "(line 475,col 3)-(line 475,col 73)",
        "(line 476,col 3)-(line 476,col 67)",
        "(line 479,col 3)-(line 479,col 69)",
        "(line 480,col 3)-(line 480,col 73)",
        "(line 481,col 3)-(line 481,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateDate()",
      "begin_line": 491,
      "end_line": 495,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.DATE\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 492,col 3)-(line 492,col 42)",
        "(line 493,col 3)-(line 493,col 76)",
        "(line 494,col 3)-(line 494,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateDayOfMonth()",
      "begin_line": 503,
      "end_line": 507,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 504,col 3)-(line 504,col 50)",
        "(line 505,col 3)-(line 505,col 76)",
        "(line 506,col 3)-(line 506,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateAmPm()",
      "begin_line": 516,
      "end_line": 526,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.AM_PM\n\t * Includes truncating the extremes of both AM and PM of one day \n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 517,col 3)-(line 517,col 43)",
        "(line 520,col 3)-(line 520,col 76)",
        "(line 521,col 3)-(line 521,col 66)",
        "(line 524,col 3)-(line 524,col 71)",
        "(line 525,col 3)-(line 525,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateHour()",
      "begin_line": 534,
      "end_line": 538,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.HOUR\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 535,col 3)-(line 535,col 42)",
        "(line 536,col 3)-(line 536,col 75)",
        "(line 537,col 3)-(line 537,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateHourOfDay()",
      "begin_line": 546,
      "end_line": 550,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 547,col 3)-(line 547,col 49)",
        "(line 548,col 3)-(line 548,col 75)",
        "(line 549,col 3)-(line 549,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateMinute()",
      "begin_line": 558,
      "end_line": 562,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.MINUTE\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 559,col 3)-(line 559,col 44)",
        "(line 560,col 3)-(line 560,col 75)",
        "(line 561,col 3)-(line 561,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateSecond()",
      "begin_line": 570,
      "end_line": 574,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.SECOND\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 571,col 3)-(line 571,col 44)",
        "(line 572,col 3)-(line 572,col 75)",
        "(line 573,col 3)-(line 573,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.testTruncateMilliSecond()",
      "begin_line": 582,
      "end_line": 585,
      "comment": "\n\t * Test DateUtils.truncate()-method with Calendar.SECOND\n\t * \n\t * @throws Exception\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 583,col 3)-(line 583,col 49)",
        "(line 584,col 3)-(line 584,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.baseRoundTest(java.util.Date, java.util.Date, java.util.Date, int)",
      "begin_line": 599,
      "end_line": 634,
      "comment": "\n\t * When using this basetest all extremes are tested.\u003cbr\u003e \n\t * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n\t * lastRoundDownDate should round down to roundedDownDate\u003cbr\u003e\n\t * lastRoundDownDate + 1 millisecond should round up to roundedUpDate\n\t * \n\t * @param roundedUpDate the next rounded date after \u003cstrong\u003eroundedDownDate\u003c/strong\u003e when using \u003cstrong\u003ecalendarField\u003c/strong\u003e\n\t * @param roundedDownDate the result if \u003cstrong\u003elastRoundDownDate\u003c/strong\u003e was rounded with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n\t * @param lastRoundDownDate rounding this value with \u003cstrong\u003ecalendarField\u003c/strong\u003e will result in \u003cstrong\u003eroundedDownDate\u003c/strong\u003e\n\t * @param calendarField\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 600,col 3)-(line 600,col 74)",
        "(line 603,col 3)-(line 603,col 81)",
        "(line 604,col 3)-(line 604,col 77)",
        "(line 605,col 3)-(line 605,col 83)",
        "(line 606,col 3)-(line 606,col 80)",
        "(line 609,col 3)-(line 609,col 95)",
        "(line 610,col 3)-(line 610,col 47)",
        "(line 611,col 3)-(line 611,col 45)",
        "(line 612,col 3)-(line 612,col 49)",
        "(line 613,col 3)-(line 613,col 48)",
        "(line 614,col 3)-(line 614,col 47)",
        "(line 615,col 3)-(line 615,col 43)",
        "(line 616,col 3)-(line 616,col 51)",
        "(line 617,col 3)-(line 617,col 49)",
        "(line 620,col 3)-(line 620,col 89)",
        "(line 621,col 3)-(line 621,col 85)",
        "(line 622,col 3)-(line 622,col 91)",
        "(line 623,col 3)-(line 623,col 88)",
        "(line 626,col 3)-(line 626,col 90)",
        "(line 627,col 3)-(line 627,col 86)",
        "(line 628,col 3)-(line 628,col 92)",
        "(line 629,col 3)-(line 629,col 89)",
        "(line 630,col 3)-(line 630,col 94)",
        "(line 631,col 3)-(line 631,col 90)",
        "(line 632,col 3)-(line 632,col 92)",
        "(line 633,col 3)-(line 633,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.baseTruncateTest(java.util.Date, java.util.Date, int)",
      "begin_line": 647,
      "end_line": 676,
      "comment": "\n\t * When using this basetest all extremes are tested.\u003cbr\u003e \n\t * It will test the Date, Calendar and Object-implementation\u003cbr\u003e\n\t * lastTruncateDate should round down to truncatedDate\u003cbr\u003e\n\t * lastTruncateDate + 1 millisecond should never round down to truncatedDate\n\t * \n\t * @param truncatedDate expected Date when \u003cstrong\u003elastTruncateDate\u003c/strong\u003e is truncated with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n\t * @param lastTruncateDate the last possible Date which will truncate to \u003cstrong\u003etruncatedDate\u003c/strong\u003e with \u003cstrong\u003ecalendarField\u003c/strong\u003e\n\t * @param calendarField a Calendar.field value\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 648,col 3)-(line 648,col 73)",
        "(line 651,col 3)-(line 651,col 198)",
        "(line 652,col 3)-(line 652,col 83)",
        "(line 653,col 3)-(line 653,col 206)",
        "(line 656,col 3)-(line 656,col 73)",
        "(line 657,col 3)-(line 657,col 45)",
        "(line 658,col 3)-(line 658,col 48)",
        "(line 659,col 3)-(line 659,col 48)",
        "(line 660,col 3)-(line 660,col 43)",
        "(line 661,col 3)-(line 661,col 49)",
        "(line 662,col 3)-(line 662,col 49)",
        "(line 665,col 3)-(line 665,col 214)",
        "(line 666,col 3)-(line 666,col 91)",
        "(line 667,col 3)-(line 667,col 222)",
        "(line 670,col 3)-(line 670,col 230)",
        "(line 671,col 3)-(line 671,col 92)",
        "(line 672,col 3)-(line 672,col 230)",
        "(line 673,col 3)-(line 673,col 242)",
        "(line 674,col 3)-(line 674,col 96)",
        "(line 675,col 3)-(line 675,col 242)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsRoundingTest.roundToJanuaryFirst(java.util.Date, java.util.Date, int)",
      "begin_line": 688,
      "end_line": 712,
      "comment": "\n\t * \n\t * Any January 1 could be considered as the ultimate extreme.\n\t * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. \n\t * \n\t * @param minDate\n\t * @param maxDate\n\t * @param calendarField\n\t * @since 3.0\n\t ",
      "child_ranges": [
        "(line 689,col 3)-(line 689,col 196)",
        "(line 690,col 3)-(line 690,col 72)",
        "(line 691,col 3)-(line 691,col 72)",
        "(line 693,col 3)-(line 693,col 48)",
        "(line 694,col 3)-(line 694,col 31)",
        "(line 695,col 3)-(line 695,col 48)",
        "(line 696,col 3)-(line 696,col 31)",
        "(line 697,col 3)-(line 697,col 208)",
        "(line 698,col 3)-(line 698,col 80)",
        "(line 699,col 3)-(line 699,col 80)",
        "(line 701,col 3)-(line 701,col 64)",
        "(line 702,col 3)-(line 702,col 63)",
        "(line 703,col 3)-(line 703,col 198)",
        "(line 704,col 3)-(line 704,col 198)",
        "(line 706,col 3)-(line 706,col 56)",
        "(line 707,col 3)-(line 707,col 47)",
        "(line 708,col 3)-(line 708,col 56)",
        "(line 709,col 3)-(line 709,col 47)",
        "(line 710,col 3)-(line 710,col 202)",
        "(line 711,col 3)-(line 711,col 202)"
      ]
    }
  ]
}