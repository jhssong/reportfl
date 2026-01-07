{
  "filepath": "/tmp/Lang-57b/src/test/org/apache/commons/lang/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 1132,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.time.DateUtils}.\n *\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steve@mungoknotwise.com\"\u003eSteven Caswell\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_TEST"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateParser"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateTimeParser"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeZoneDateParser"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm1"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm2"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm3"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm4"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date0"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date1"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date2"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date3"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date4"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date5"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date6"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date7"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date8"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm1"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm2"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm3"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm4"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal1"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal2"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal3"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal4"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal5"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal6"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal7"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal8"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zone"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultZone"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.DateUtilsTest(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.main(java.lang.String[])",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.suite()",
      "begin_line": 94,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 61)",
        "(line 96,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.setUp()",
      "begin_line": 100,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 22)",
        "(line 103,col 9)-(line 103,col 74)",
        "(line 104,col 9)-(line 104,col 90)",
        "(line 106,col 9)-(line 106,col 74)",
        "(line 107,col 9)-(line 107,col 74)",
        "(line 108,col 9)-(line 108,col 74)",
        "(line 109,col 9)-(line 109,col 74)",
        "(line 110,col 9)-(line 110,col 70)",
        "(line 111,col 9)-(line 111,col 71)",
        "(line 112,col 9)-(line 112,col 70)",
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 41)",
        "(line 117,col 9)-(line 117,col 68)",
        "(line 118,col 9)-(line 118,col 68)",
        "(line 119,col 9)-(line 119,col 68)",
        "(line 120,col 9)-(line 120,col 68)",
        "(line 121,col 9)-(line 121,col 68)",
        "(line 122,col 9)-(line 122,col 70)",
        "(line 123,col 9)-(line 123,col 48)",
        "(line 124,col 9)-(line 124,col 41)",
        "(line 125,col 9)-(line 125,col 42)",
        "(line 126,col 9)-(line 126,col 36)",
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 42)",
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 132,col 36)",
        "(line 133,col 9)-(line 133,col 38)",
        "(line 134,col 9)-(line 134,col 28)",
        "(line 135,col 9)-(line 135,col 38)",
        "(line 136,col 9)-(line 136,col 28)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 138,col 9)-(line 138,col 38)",
        "(line 139,col 9)-(line 139,col 28)",
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 142,col 38)",
        "(line 143,col 9)-(line 143,col 28)",
        "(line 144,col 9)-(line 144,col 38)",
        "(line 145,col 9)-(line 145,col 28)",
        "(line 146,col 9)-(line 146,col 38)",
        "(line 147,col 9)-(line 147,col 28)",
        "(line 148,col 9)-(line 148,col 38)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 150,col 9)-(line 150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.tearDown()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testConstructor()",
      "begin_line": 158,
      "end_line": 165,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 39)",
        "(line 160,col 9)-(line 160,col 71)",
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 162,col 70)",
        "(line 163,col 9)-(line 163,col 78)",
        "(line 164,col 9)-(line 164,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameDay_Date()",
      "begin_line": 168,
      "end_line": 182,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 73)",
        "(line 170,col 9)-(line 170,col 73)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 172,col 69)",
        "(line 173,col 9)-(line 173,col 63)",
        "(line 174,col 9)-(line 174,col 69)",
        "(line 175,col 9)-(line 175,col 62)",
        "(line 176,col 9)-(line 176,col 69)",
        "(line 177,col 9)-(line 177,col 63)",
        "(line 178,col 9)-(line 181,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameDay_Cal()",
      "begin_line": 185,
      "end_line": 199,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 75)",
        "(line 187,col 9)-(line 187,col 75)",
        "(line 188,col 9)-(line 188,col 60)",
        "(line 189,col 9)-(line 189,col 42)",
        "(line 190,col 9)-(line 190,col 61)",
        "(line 191,col 9)-(line 191,col 42)",
        "(line 192,col 9)-(line 192,col 60)",
        "(line 193,col 9)-(line 193,col 35)",
        "(line 194,col 9)-(line 194,col 61)",
        "(line 195,col 9)-(line 198,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameInstant_Date()",
      "begin_line": 202,
      "end_line": 216,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 73)",
        "(line 204,col 9)-(line 204,col 73)",
        "(line 205,col 9)-(line 205,col 66)",
        "(line 206,col 9)-(line 206,col 69)",
        "(line 207,col 9)-(line 207,col 67)",
        "(line 208,col 9)-(line 208,col 69)",
        "(line 209,col 9)-(line 209,col 66)",
        "(line 210,col 9)-(line 210,col 69)",
        "(line 211,col 9)-(line 211,col 67)",
        "(line 212,col 9)-(line 215,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameInstant_Cal()",
      "begin_line": 219,
      "end_line": 234,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 86)",
        "(line 221,col 9)-(line 221,col 86)",
        "(line 222,col 9)-(line 222,col 40)",
        "(line 223,col 9)-(line 223,col 42)",
        "(line 224,col 9)-(line 224,col 40)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 226,col 9)-(line 226,col 65)",
        "(line 228,col 9)-(line 228,col 40)",
        "(line 229,col 9)-(line 229,col 64)",
        "(line 230,col 9)-(line 233,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameLocalTime_Cal()",
      "begin_line": 237,
      "end_line": 252,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 86)",
        "(line 239,col 9)-(line 239,col 86)",
        "(line 240,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 241,col 42)",
        "(line 242,col 9)-(line 242,col 40)",
        "(line 243,col 9)-(line 243,col 42)",
        "(line 244,col 9)-(line 244,col 66)",
        "(line 246,col 9)-(line 246,col 40)",
        "(line 247,col 9)-(line 247,col 67)",
        "(line 248,col 9)-(line 251,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testParseDate()",
      "begin_line": 255,
      "end_line": 286,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 67)",
        "(line 257,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 258,col 85)",
        "(line 259,col 9)-(line 259,col 58)",
        "(line 260,col 9)-(line 260,col 42)",
        "(line 262,col 9)-(line 262,col 29)",
        "(line 263,col 9)-(line 263,col 53)",
        "(line 264,col 9)-(line 264,col 42)",
        "(line 266,col 9)-(line 266,col 29)",
        "(line 267,col 9)-(line 267,col 53)",
        "(line 268,col 9)-(line 268,col 42)",
        "(line 270,col 9)-(line 273,col 38)",
        "(line 274,col 9)-(line 277,col 38)",
        "(line 278,col 9)-(line 281,col 48)",
        "(line 282,col 9)-(line 285,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddYears()",
      "begin_line": 289,
      "end_line": 305,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 42)",
        "(line 291,col 9)-(line 291,col 50)",
        "(line 292,col 9)-(line 292,col 36)",
        "(line 293,col 9)-(line 293,col 49)",
        "(line 294,col 9)-(line 294,col 51)",
        "(line 296,col 9)-(line 296,col 45)",
        "(line 297,col 9)-(line 297,col 36)",
        "(line 298,col 9)-(line 298,col 49)",
        "(line 299,col 9)-(line 299,col 51)",
        "(line 301,col 9)-(line 301,col 46)",
        "(line 302,col 9)-(line 302,col 36)",
        "(line 303,col 9)-(line 303,col 49)",
        "(line 304,col 9)-(line 304,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMonths()",
      "begin_line": 308,
      "end_line": 308,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddWeeks()",
      "begin_line": 329,
      "end_line": 345,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 42)",
        "(line 331,col 9)-(line 331,col 50)",
        "(line 332,col 9)-(line 332,col 36)",
        "(line 333,col 9)-(line 333,col 49)",
        "(line 334,col 9)-(line 334,col 51)",
        "(line 336,col 9)-(line 336,col 45)",
        "(line 337,col 9)-(line 337,col 36)",
        "(line 338,col 9)-(line 338,col 49)",
        "(line 339,col 9)-(line 339,col 52)",
        "(line 341,col 9)-(line 341,col 46)",
        "(line 342,col 9)-(line 342,col 36)",
        "(line 343,col 9)-(line 343,col 49)",
        "(line 344,col 9)-(line 344,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddDays()",
      "begin_line": 348,
      "end_line": 364,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 42)",
        "(line 350,col 9)-(line 350,col 49)",
        "(line 351,col 9)-(line 351,col 36)",
        "(line 352,col 9)-(line 352,col 49)",
        "(line 353,col 9)-(line 353,col 51)",
        "(line 355,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 356,col 36)",
        "(line 357,col 9)-(line 357,col 49)",
        "(line 358,col 9)-(line 358,col 51)",
        "(line 360,col 9)-(line 360,col 45)",
        "(line 361,col 9)-(line 361,col 36)",
        "(line 362,col 9)-(line 362,col 49)",
        "(line 363,col 9)-(line 363,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddHours()",
      "begin_line": 367,
      "end_line": 383,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 42)",
        "(line 369,col 9)-(line 369,col 50)",
        "(line 370,col 9)-(line 370,col 36)",
        "(line 371,col 9)-(line 371,col 49)",
        "(line 372,col 9)-(line 372,col 51)",
        "(line 374,col 9)-(line 374,col 45)",
        "(line 375,col 9)-(line 375,col 36)",
        "(line 376,col 9)-(line 376,col 49)",
        "(line 377,col 9)-(line 377,col 51)",
        "(line 379,col 9)-(line 379,col 46)",
        "(line 380,col 9)-(line 380,col 36)",
        "(line 381,col 9)-(line 381,col 49)",
        "(line 382,col 9)-(line 382,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMinutes()",
      "begin_line": 386,
      "end_line": 402,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 42)",
        "(line 388,col 9)-(line 388,col 52)",
        "(line 389,col 9)-(line 389,col 36)",
        "(line 390,col 9)-(line 390,col 49)",
        "(line 391,col 9)-(line 391,col 51)",
        "(line 393,col 9)-(line 393,col 47)",
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 395,col 49)",
        "(line 396,col 9)-(line 396,col 51)",
        "(line 398,col 9)-(line 398,col 48)",
        "(line 399,col 9)-(line 399,col 36)",
        "(line 400,col 9)-(line 400,col 49)",
        "(line 401,col 9)-(line 401,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddSeconds()",
      "begin_line": 405,
      "end_line": 421,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 42)",
        "(line 407,col 9)-(line 407,col 52)",
        "(line 408,col 9)-(line 408,col 36)",
        "(line 409,col 9)-(line 409,col 49)",
        "(line 410,col 9)-(line 410,col 51)",
        "(line 412,col 9)-(line 412,col 47)",
        "(line 413,col 9)-(line 413,col 36)",
        "(line 414,col 9)-(line 414,col 49)",
        "(line 415,col 9)-(line 415,col 51)",
        "(line 417,col 9)-(line 417,col 48)",
        "(line 418,col 9)-(line 418,col 36)",
        "(line 419,col 9)-(line 419,col 49)",
        "(line 420,col 9)-(line 420,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMilliseconds()",
      "begin_line": 424,
      "end_line": 424,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddByField()",
      "begin_line": 445,
      "end_line": 445,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertDate(java.util.Date, int, int, int, int, int, int, int)",
      "begin_line": 466,
      "end_line": 476,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 56)",
        "(line 468,col 9)-(line 468,col 26)",
        "(line 469,col 9)-(line 469,col 51)",
        "(line 470,col 9)-(line 470,col 53)",
        "(line 471,col 9)-(line 471,col 58)",
        "(line 472,col 9)-(line 472,col 58)",
        "(line 473,col 9)-(line 473,col 52)",
        "(line 474,col 9)-(line 474,col 52)",
        "(line 475,col 9)-(line 475,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testRound()",
      "begin_line": 482,
      "end_line": 699,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 486,col 55)",
        "(line 487,col 9)-(line 489,col 55)",
        "(line 490,col 9)-(line 492,col 56)",
        "(line 493,col 9)-(line 495,col 56)",
        "(line 496,col 9)-(line 498,col 62)",
        "(line 499,col 9)-(line 501,col 62)",
        "(line 502,col 9)-(line 504,col 62)",
        "(line 507,col 9)-(line 509,col 55)",
        "(line 510,col 9)-(line 512,col 55)",
        "(line 513,col 9)-(line 515,col 55)",
        "(line 516,col 9)-(line 518,col 55)",
        "(line 519,col 9)-(line 521,col 57)",
        "(line 522,col 9)-(line 524,col 57)",
        "(line 525,col 9)-(line 527,col 57)",
        "(line 528,col 9)-(line 530,col 57)",
        "(line 531,col 9)-(line 533,col 60)",
        "(line 534,col 9)-(line 536,col 60)",
        "(line 537,col 9)-(line 539,col 60)",
        "(line 540,col 9)-(line 542,col 60)",
        "(line 545,col 9)-(line 547,col 64)",
        "(line 548,col 9)-(line 550,col 64)",
        "(line 551,col 9)-(line 553,col 65)",
        "(line 554,col 9)-(line 556,col 65)",
        "(line 557,col 9)-(line 559,col 71)",
        "(line 560,col 9)-(line 562,col 71)",
        "(line 563,col 9)-(line 565,col 64)",
        "(line 566,col 9)-(line 568,col 64)",
        "(line 569,col 9)-(line 571,col 64)",
        "(line 572,col 9)-(line 574,col 64)",
        "(line 575,col 9)-(line 577,col 66)",
        "(line 578,col 9)-(line 580,col 66)",
        "(line 581,col 9)-(line 583,col 66)",
        "(line 584,col 9)-(line 586,col 66)",
        "(line 587,col 9)-(line 589,col 65)",
        "(line 590,col 9)-(line 592,col 65)",
        "(line 593,col 9)-(line 595,col 69)",
        "(line 596,col 9)-(line 598,col 69)",
        "(line 599,col 9)-(line 601,col 69)",
        "(line 602,col 9)-(line 604,col 69)",
        "(line 606,col 9)-(line 609,col 48)",
        "(line 610,col 9)-(line 613,col 48)",
        "(line 614,col 9)-(line 617,col 48)",
        "(line 618,col 9)-(line 621,col 42)",
        "(line 622,col 9)-(line 625,col 47)",
        "(line 627,col 9)-(line 629,col 68)",
        "(line 630,col 9)-(line 632,col 68)",
        "(line 633,col 9)-(line 635,col 68)",
        "(line 636,col 9)-(line 638,col 68)",
        "(line 642,col 9)-(line 642,col 34)",
        "(line 643,col 9)-(line 643,col 41)",
        "(line 644,col 9)-(line 646,col 55)",
        "(line 647,col 9)-(line 649,col 63)",
        "(line 650,col 9)-(line 652,col 55)",
        "(line 653,col 9)-(line 655,col 63)",
        "(line 656,col 9)-(line 658,col 55)",
        "(line 659,col 9)-(line 661,col 63)",
        "(line 662,col 9)-(line 664,col 55)",
        "(line 665,col 9)-(line 667,col 63)",
        "(line 669,col 9)-(line 671,col 62)",
        "(line 672,col 9)-(line 674,col 70)",
        "(line 675,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 41)",
        "(line 698,col 9)-(line 698,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testTruncate()",
      "begin_line": 704,
      "end_line": 890,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 58)",
        "(line 709,col 9)-(line 711,col 58)",
        "(line 712,col 9)-(line 714,col 59)",
        "(line 715,col 9)-(line 717,col 59)",
        "(line 718,col 9)-(line 720,col 65)",
        "(line 721,col 9)-(line 723,col 65)",
        "(line 724,col 9)-(line 726,col 58)",
        "(line 727,col 9)-(line 729,col 58)",
        "(line 730,col 9)-(line 732,col 58)",
        "(line 733,col 9)-(line 735,col 58)",
        "(line 736,col 9)-(line 738,col 60)",
        "(line 739,col 9)-(line 741,col 60)",
        "(line 742,col 9)-(line 744,col 60)",
        "(line 745,col 9)-(line 747,col 60)",
        "(line 748,col 9)-(line 750,col 63)",
        "(line 751,col 9)-(line 753,col 63)",
        "(line 754,col 9)-(line 756,col 63)",
        "(line 757,col 9)-(line 759,col 63)",
        "(line 762,col 9)-(line 764,col 67)",
        "(line 765,col 9)-(line 767,col 67)",
        "(line 768,col 9)-(line 770,col 68)",
        "(line 771,col 9)-(line 773,col 68)",
        "(line 774,col 9)-(line 776,col 74)",
        "(line 777,col 9)-(line 779,col 74)",
        "(line 780,col 9)-(line 782,col 67)",
        "(line 783,col 9)-(line 785,col 67)",
        "(line 786,col 9)-(line 788,col 67)",
        "(line 789,col 9)-(line 791,col 67)",
        "(line 792,col 9)-(line 794,col 69)",
        "(line 795,col 9)-(line 797,col 69)",
        "(line 798,col 9)-(line 800,col 69)",
        "(line 801,col 9)-(line 803,col 69)",
        "(line 804,col 9)-(line 806,col 72)",
        "(line 807,col 9)-(line 809,col 72)",
        "(line 810,col 9)-(line 812,col 72)",
        "(line 813,col 9)-(line 815,col 72)",
        "(line 817,col 9)-(line 819,col 68)",
        "(line 820,col 9)-(line 822,col 68)",
        "(line 824,col 9)-(line 826,col 71)",
        "(line 827,col 9)-(line 829,col 71)",
        "(line 830,col 9)-(line 832,col 71)",
        "(line 833,col 9)-(line 835,col 71)",
        "(line 837,col 9)-(line 840,col 48)",
        "(line 841,col 9)-(line 844,col 48)",
        "(line 845,col 9)-(line 848,col 48)",
        "(line 849,col 9)-(line 852,col 42)",
        "(line 856,col 9)-(line 856,col 34)",
        "(line 857,col 9)-(line 857,col 41)",
        "(line 858,col 9)-(line 860,col 58)",
        "(line 861,col 9)-(line 863,col 66)",
        "(line 865,col 9)-(line 867,col 58)",
        "(line 868,col 9)-(line 870,col 66)",
        "(line 871,col 9)-(line 871,col 41)",
        "(line 872,col 9)-(line 872,col 48)",
        "(line 875,col 9)-(line 875,col 50)",
        "(line 876,col 9)-(line 876,col 59)",
        "(line 877,col 9)-(line 877,col 34)",
        "(line 878,col 9)-(line 881,col 43)",
        "(line 882,col 9)-(line 882,col 45)",
        "(line 883,col 9)-(line 886,col 43)",
        "(line 887,col 9)-(line 887,col 45)",
        "(line 888,col 9)-(line 888,col 65)",
        "(line 889,col 9)-(line 889,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 897,
      "end_line": 969,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 901,col 9)",
        "(line 904,col 9)-(line 904,col 59)",
        "(line 905,col 9)-(line 905,col 37)",
        "(line 906,col 9)-(line 906,col 78)",
        "(line 907,col 9)-(line 907,col 36)",
        "(line 909,col 9)-(line 909,col 52)",
        "(line 911,col 9)-(line 911,col 85)",
        "(line 912,col 9)-(line 912,col 84)",
        "(line 913,col 9)-(line 913,col 82)",
        "(line 914,col 9)-(line 914,col 79)",
        "(line 916,col 9)-(line 916,col 99)",
        "(line 917,col 9)-(line 917,col 102)",
        "(line 918,col 9)-(line 918,col 105)",
        "(line 919,col 9)-(line 919,col 108)",
        "(line 920,col 9)-(line 920,col 111)",
        "(line 923,col 9)-(line 923,col 47)",
        "(line 924,col 9)-(line 924,col 54)",
        "(line 925,col 9)-(line 925,col 61)",
        "(line 926,col 9)-(line 926,col 104)",
        "(line 929,col 9)-(line 930,col 102)",
        "(line 932,col 9)-(line 933,col 97)",
        "(line 935,col 9)-(line 936,col 97)",
        "(line 938,col 9)-(line 939,col 102)",
        "(line 941,col 9)-(line 942,col 95)",
        "(line 944,col 9)-(line 945,col 95)",
        "(line 949,col 9)-(line 950,col 99)",
        "(line 952,col 9)-(line 953,col 94)",
        "(line 955,col 9)-(line 956,col 94)",
        "(line 958,col 9)-(line 959,col 99)",
        "(line 961,col 9)-(line 962,col 92)",
        "(line 964,col 9)-(line 965,col 92)",
        "(line 968,col 9)-(line 968,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 974,
      "end_line": 994,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 977,col 48)",
        "(line 978,col 9)-(line 981,col 48)",
        "(line 982,col 9)-(line 985,col 48)",
        "(line 986,col 9)-(line 989,col 48)",
        "(line 990,col 9)-(line 993,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 999,
      "end_line": 1040,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 46)",
        "(line 1001,col 9)-(line 1039,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1045,
      "end_line": 1065,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 78)",
        "(line 1047,col 9)-(line 1049,col 51)",
        "(line 1051,col 9)-(line 1051,col 69)",
        "(line 1052,col 9)-(line 1054,col 51)",
        "(line 1056,col 9)-(line 1056,col 69)",
        "(line 1057,col 9)-(line 1059,col 54)",
        "(line 1061,col 9)-(line 1061,col 69)",
        "(line 1062,col 9)-(line 1064,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Calendar)",
      "begin_line": 1071,
      "end_line": 1076,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 48)",
        "(line 1073,col 9)-(line 1073,col 34)",
        "(line 1075,col 9)-(line 1075,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Date, java.util.Date)",
      "begin_line": 1081,
      "end_line": 1088,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 51)",
        "(line 1083,col 9)-(line 1083,col 32)",
        "(line 1084,col 9)-(line 1084,col 49)",
        "(line 1085,col 9)-(line 1085,col 28)",
        "(line 1087,col 9)-(line 1087,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1095,
      "end_line": 1116,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 44)",
        "(line 1097,col 9)-(line 1097,col 40)",
        "(line 1098,col 9)-(line 1098,col 29)",
        "(line 1099,col 9)-(line 1099,col 22)",
        "(line 1100,col 9)-(line 1111,col 9)",
        "(line 1112,col 9)-(line 1114,col 9)",
        "(line 1115,col 9)-(line 1115,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1122,
      "end_line": 1127,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1129,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 32)"
      ]
    }
  ]
}