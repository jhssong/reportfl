{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 45,
      "end_line": 1127,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.time.DateUtils}.\n *\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steve@mungoknotwise.com\"\u003eSteven Caswell\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_TEST"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateParser"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateTimeParser"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeZoneDateParser"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm1"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm2"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm3"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm4"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date0"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date1"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date2"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date3"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date4"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date5"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date6"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date7"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date8"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm1"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm2"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm3"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm4"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal1"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal2"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal3"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal4"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal5"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal6"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal7"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal8"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zone"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultZone"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.DateUtilsTest(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.main(java.lang.String[])",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.suite()",
      "begin_line": 93,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 61)",
        "(line 95,col 9)-(line 95,col 41)",
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.setUp()",
      "begin_line": 99,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 22)",
        "(line 102,col 9)-(line 102,col 74)",
        "(line 103,col 9)-(line 103,col 90)",
        "(line 105,col 9)-(line 105,col 74)",
        "(line 106,col 9)-(line 106,col 74)",
        "(line 107,col 9)-(line 107,col 74)",
        "(line 108,col 9)-(line 108,col 74)",
        "(line 109,col 9)-(line 109,col 70)",
        "(line 110,col 9)-(line 110,col 71)",
        "(line 111,col 9)-(line 111,col 70)",
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 116,col 68)",
        "(line 117,col 9)-(line 117,col 68)",
        "(line 118,col 9)-(line 118,col 68)",
        "(line 119,col 9)-(line 119,col 68)",
        "(line 120,col 9)-(line 120,col 68)",
        "(line 121,col 9)-(line 121,col 70)",
        "(line 122,col 9)-(line 122,col 48)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 124,col 42)",
        "(line 125,col 9)-(line 125,col 36)",
        "(line 126,col 9)-(line 126,col 42)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 130,col 42)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 133,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 135,col 28)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 38)",
        "(line 138,col 9)-(line 138,col 28)",
        "(line 139,col 9)-(line 139,col 38)",
        "(line 140,col 9)-(line 140,col 28)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 142,col 28)",
        "(line 143,col 9)-(line 143,col 38)",
        "(line 144,col 9)-(line 144,col 28)",
        "(line 145,col 9)-(line 145,col 38)",
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 147,col 38)",
        "(line 148,col 9)-(line 148,col 28)",
        "(line 149,col 9)-(line 149,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.tearDown()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testConstructor()",
      "begin_line": 157,
      "end_line": 164,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 39)",
        "(line 159,col 9)-(line 159,col 71)",
        "(line 160,col 9)-(line 160,col 37)",
        "(line 161,col 9)-(line 161,col 70)",
        "(line 162,col 9)-(line 162,col 78)",
        "(line 163,col 9)-(line 163,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameDay_Date()",
      "begin_line": 167,
      "end_line": 181,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 73)",
        "(line 169,col 9)-(line 169,col 73)",
        "(line 170,col 9)-(line 170,col 62)",
        "(line 171,col 9)-(line 171,col 69)",
        "(line 172,col 9)-(line 172,col 63)",
        "(line 173,col 9)-(line 173,col 69)",
        "(line 174,col 9)-(line 174,col 62)",
        "(line 175,col 9)-(line 175,col 69)",
        "(line 176,col 9)-(line 176,col 63)",
        "(line 177,col 9)-(line 180,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameDay_Cal()",
      "begin_line": 184,
      "end_line": 198,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 75)",
        "(line 186,col 9)-(line 186,col 75)",
        "(line 187,col 9)-(line 187,col 60)",
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 61)",
        "(line 190,col 9)-(line 190,col 42)",
        "(line 191,col 9)-(line 191,col 60)",
        "(line 192,col 9)-(line 192,col 35)",
        "(line 193,col 9)-(line 193,col 61)",
        "(line 194,col 9)-(line 197,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameInstant_Date()",
      "begin_line": 201,
      "end_line": 215,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 73)",
        "(line 203,col 9)-(line 203,col 73)",
        "(line 204,col 9)-(line 204,col 66)",
        "(line 205,col 9)-(line 205,col 69)",
        "(line 206,col 9)-(line 206,col 67)",
        "(line 207,col 9)-(line 207,col 69)",
        "(line 208,col 9)-(line 208,col 66)",
        "(line 209,col 9)-(line 209,col 69)",
        "(line 210,col 9)-(line 210,col 67)",
        "(line 211,col 9)-(line 214,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameInstant_Cal()",
      "begin_line": 218,
      "end_line": 233,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 86)",
        "(line 220,col 9)-(line 220,col 86)",
        "(line 221,col 9)-(line 221,col 40)",
        "(line 222,col 9)-(line 222,col 42)",
        "(line 223,col 9)-(line 223,col 40)",
        "(line 224,col 9)-(line 224,col 42)",
        "(line 225,col 9)-(line 225,col 65)",
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 228,col 64)",
        "(line 229,col 9)-(line 232,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameLocalTime_Cal()",
      "begin_line": 236,
      "end_line": 251,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 86)",
        "(line 238,col 9)-(line 238,col 86)",
        "(line 239,col 9)-(line 239,col 40)",
        "(line 240,col 9)-(line 240,col 42)",
        "(line 241,col 9)-(line 241,col 40)",
        "(line 242,col 9)-(line 242,col 42)",
        "(line 243,col 9)-(line 243,col 66)",
        "(line 245,col 9)-(line 245,col 40)",
        "(line 246,col 9)-(line 246,col 67)",
        "(line 247,col 9)-(line 250,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testParseDate()",
      "begin_line": 254,
      "end_line": 285,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 67)",
        "(line 256,col 9)-(line 256,col 38)",
        "(line 257,col 9)-(line 257,col 85)",
        "(line 258,col 9)-(line 258,col 58)",
        "(line 259,col 9)-(line 259,col 42)",
        "(line 261,col 9)-(line 261,col 29)",
        "(line 262,col 9)-(line 262,col 53)",
        "(line 263,col 9)-(line 263,col 42)",
        "(line 265,col 9)-(line 265,col 29)",
        "(line 266,col 9)-(line 266,col 53)",
        "(line 267,col 9)-(line 267,col 42)",
        "(line 269,col 9)-(line 272,col 38)",
        "(line 273,col 9)-(line 276,col 38)",
        "(line 277,col 9)-(line 280,col 48)",
        "(line 281,col 9)-(line 284,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddYears()",
      "begin_line": 288,
      "end_line": 304,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 42)",
        "(line 290,col 9)-(line 290,col 50)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 292,col 49)",
        "(line 293,col 9)-(line 293,col 51)",
        "(line 295,col 9)-(line 295,col 45)",
        "(line 296,col 9)-(line 296,col 36)",
        "(line 297,col 9)-(line 297,col 49)",
        "(line 298,col 9)-(line 298,col 51)",
        "(line 300,col 9)-(line 300,col 46)",
        "(line 301,col 9)-(line 301,col 36)",
        "(line 302,col 9)-(line 302,col 49)",
        "(line 303,col 9)-(line 303,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMonths()",
      "begin_line": 307,
      "end_line": 307,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddWeeks()",
      "begin_line": 328,
      "end_line": 344,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 42)",
        "(line 330,col 9)-(line 330,col 50)",
        "(line 331,col 9)-(line 331,col 36)",
        "(line 332,col 9)-(line 332,col 49)",
        "(line 333,col 9)-(line 333,col 51)",
        "(line 335,col 9)-(line 335,col 45)",
        "(line 336,col 9)-(line 336,col 36)",
        "(line 337,col 9)-(line 337,col 49)",
        "(line 338,col 9)-(line 338,col 52)",
        "(line 340,col 9)-(line 340,col 46)",
        "(line 341,col 9)-(line 341,col 36)",
        "(line 342,col 9)-(line 342,col 49)",
        "(line 343,col 9)-(line 343,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddDays()",
      "begin_line": 347,
      "end_line": 363,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 42)",
        "(line 349,col 9)-(line 349,col 49)",
        "(line 350,col 9)-(line 350,col 36)",
        "(line 351,col 9)-(line 351,col 49)",
        "(line 352,col 9)-(line 352,col 51)",
        "(line 354,col 9)-(line 354,col 44)",
        "(line 355,col 9)-(line 355,col 36)",
        "(line 356,col 9)-(line 356,col 49)",
        "(line 357,col 9)-(line 357,col 51)",
        "(line 359,col 9)-(line 359,col 45)",
        "(line 360,col 9)-(line 360,col 36)",
        "(line 361,col 9)-(line 361,col 49)",
        "(line 362,col 9)-(line 362,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddHours()",
      "begin_line": 366,
      "end_line": 382,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 42)",
        "(line 368,col 9)-(line 368,col 50)",
        "(line 369,col 9)-(line 369,col 36)",
        "(line 370,col 9)-(line 370,col 49)",
        "(line 371,col 9)-(line 371,col 51)",
        "(line 373,col 9)-(line 373,col 45)",
        "(line 374,col 9)-(line 374,col 36)",
        "(line 375,col 9)-(line 375,col 49)",
        "(line 376,col 9)-(line 376,col 51)",
        "(line 378,col 9)-(line 378,col 46)",
        "(line 379,col 9)-(line 379,col 36)",
        "(line 380,col 9)-(line 380,col 49)",
        "(line 381,col 9)-(line 381,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMinutes()",
      "begin_line": 385,
      "end_line": 401,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 42)",
        "(line 387,col 9)-(line 387,col 52)",
        "(line 388,col 9)-(line 388,col 36)",
        "(line 389,col 9)-(line 389,col 49)",
        "(line 390,col 9)-(line 390,col 51)",
        "(line 392,col 9)-(line 392,col 47)",
        "(line 393,col 9)-(line 393,col 36)",
        "(line 394,col 9)-(line 394,col 49)",
        "(line 395,col 9)-(line 395,col 51)",
        "(line 397,col 9)-(line 397,col 48)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 399,col 9)-(line 399,col 49)",
        "(line 400,col 9)-(line 400,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddSeconds()",
      "begin_line": 404,
      "end_line": 420,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 42)",
        "(line 406,col 9)-(line 406,col 52)",
        "(line 407,col 9)-(line 407,col 36)",
        "(line 408,col 9)-(line 408,col 49)",
        "(line 409,col 9)-(line 409,col 51)",
        "(line 411,col 9)-(line 411,col 47)",
        "(line 412,col 9)-(line 412,col 36)",
        "(line 413,col 9)-(line 413,col 49)",
        "(line 414,col 9)-(line 414,col 51)",
        "(line 416,col 9)-(line 416,col 48)",
        "(line 417,col 9)-(line 417,col 36)",
        "(line 418,col 9)-(line 418,col 49)",
        "(line 419,col 9)-(line 419,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMilliseconds()",
      "begin_line": 423,
      "end_line": 423,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddByField()",
      "begin_line": 444,
      "end_line": 444,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertDate(java.util.Date, int, int, int, int, int, int, int)",
      "begin_line": 465,
      "end_line": 475,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 56)",
        "(line 467,col 9)-(line 467,col 26)",
        "(line 468,col 9)-(line 468,col 51)",
        "(line 469,col 9)-(line 469,col 53)",
        "(line 470,col 9)-(line 470,col 58)",
        "(line 471,col 9)-(line 471,col 58)",
        "(line 472,col 9)-(line 472,col 52)",
        "(line 473,col 9)-(line 473,col 52)",
        "(line 474,col 9)-(line 474,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testRound()",
      "begin_line": 481,
      "end_line": 698,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 485,col 55)",
        "(line 486,col 9)-(line 488,col 55)",
        "(line 489,col 9)-(line 491,col 56)",
        "(line 492,col 9)-(line 494,col 56)",
        "(line 495,col 9)-(line 497,col 62)",
        "(line 498,col 9)-(line 500,col 62)",
        "(line 501,col 9)-(line 503,col 62)",
        "(line 506,col 9)-(line 508,col 55)",
        "(line 509,col 9)-(line 511,col 55)",
        "(line 512,col 9)-(line 514,col 55)",
        "(line 515,col 9)-(line 517,col 55)",
        "(line 518,col 9)-(line 520,col 57)",
        "(line 521,col 9)-(line 523,col 57)",
        "(line 524,col 9)-(line 526,col 57)",
        "(line 527,col 9)-(line 529,col 57)",
        "(line 530,col 9)-(line 532,col 60)",
        "(line 533,col 9)-(line 535,col 60)",
        "(line 536,col 9)-(line 538,col 60)",
        "(line 539,col 9)-(line 541,col 60)",
        "(line 544,col 9)-(line 546,col 64)",
        "(line 547,col 9)-(line 549,col 64)",
        "(line 550,col 9)-(line 552,col 65)",
        "(line 553,col 9)-(line 555,col 65)",
        "(line 556,col 9)-(line 558,col 71)",
        "(line 559,col 9)-(line 561,col 71)",
        "(line 562,col 9)-(line 564,col 64)",
        "(line 565,col 9)-(line 567,col 64)",
        "(line 568,col 9)-(line 570,col 64)",
        "(line 571,col 9)-(line 573,col 64)",
        "(line 574,col 9)-(line 576,col 66)",
        "(line 577,col 9)-(line 579,col 66)",
        "(line 580,col 9)-(line 582,col 66)",
        "(line 583,col 9)-(line 585,col 66)",
        "(line 586,col 9)-(line 588,col 65)",
        "(line 589,col 9)-(line 591,col 65)",
        "(line 592,col 9)-(line 594,col 69)",
        "(line 595,col 9)-(line 597,col 69)",
        "(line 598,col 9)-(line 600,col 69)",
        "(line 601,col 9)-(line 603,col 69)",
        "(line 605,col 9)-(line 608,col 48)",
        "(line 609,col 9)-(line 612,col 48)",
        "(line 613,col 9)-(line 616,col 48)",
        "(line 617,col 9)-(line 620,col 42)",
        "(line 621,col 9)-(line 624,col 47)",
        "(line 626,col 9)-(line 628,col 68)",
        "(line 629,col 9)-(line 631,col 68)",
        "(line 632,col 9)-(line 634,col 68)",
        "(line 635,col 9)-(line 637,col 68)",
        "(line 641,col 9)-(line 641,col 34)",
        "(line 642,col 9)-(line 642,col 41)",
        "(line 643,col 9)-(line 645,col 55)",
        "(line 646,col 9)-(line 648,col 63)",
        "(line 649,col 9)-(line 651,col 55)",
        "(line 652,col 9)-(line 654,col 63)",
        "(line 655,col 9)-(line 657,col 55)",
        "(line 658,col 9)-(line 660,col 63)",
        "(line 661,col 9)-(line 663,col 55)",
        "(line 664,col 9)-(line 666,col 63)",
        "(line 668,col 9)-(line 670,col 62)",
        "(line 671,col 9)-(line 673,col 70)",
        "(line 674,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 41)",
        "(line 697,col 9)-(line 697,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testTruncate()",
      "begin_line": 703,
      "end_line": 889,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 707,col 58)",
        "(line 708,col 9)-(line 710,col 58)",
        "(line 711,col 9)-(line 713,col 59)",
        "(line 714,col 9)-(line 716,col 59)",
        "(line 717,col 9)-(line 719,col 65)",
        "(line 720,col 9)-(line 722,col 65)",
        "(line 723,col 9)-(line 725,col 58)",
        "(line 726,col 9)-(line 728,col 58)",
        "(line 729,col 9)-(line 731,col 58)",
        "(line 732,col 9)-(line 734,col 58)",
        "(line 735,col 9)-(line 737,col 60)",
        "(line 738,col 9)-(line 740,col 60)",
        "(line 741,col 9)-(line 743,col 60)",
        "(line 744,col 9)-(line 746,col 60)",
        "(line 747,col 9)-(line 749,col 63)",
        "(line 750,col 9)-(line 752,col 63)",
        "(line 753,col 9)-(line 755,col 63)",
        "(line 756,col 9)-(line 758,col 63)",
        "(line 761,col 9)-(line 763,col 67)",
        "(line 764,col 9)-(line 766,col 67)",
        "(line 767,col 9)-(line 769,col 68)",
        "(line 770,col 9)-(line 772,col 68)",
        "(line 773,col 9)-(line 775,col 74)",
        "(line 776,col 9)-(line 778,col 74)",
        "(line 779,col 9)-(line 781,col 67)",
        "(line 782,col 9)-(line 784,col 67)",
        "(line 785,col 9)-(line 787,col 67)",
        "(line 788,col 9)-(line 790,col 67)",
        "(line 791,col 9)-(line 793,col 69)",
        "(line 794,col 9)-(line 796,col 69)",
        "(line 797,col 9)-(line 799,col 69)",
        "(line 800,col 9)-(line 802,col 69)",
        "(line 803,col 9)-(line 805,col 72)",
        "(line 806,col 9)-(line 808,col 72)",
        "(line 809,col 9)-(line 811,col 72)",
        "(line 812,col 9)-(line 814,col 72)",
        "(line 816,col 9)-(line 818,col 68)",
        "(line 819,col 9)-(line 821,col 68)",
        "(line 823,col 9)-(line 825,col 71)",
        "(line 826,col 9)-(line 828,col 71)",
        "(line 829,col 9)-(line 831,col 71)",
        "(line 832,col 9)-(line 834,col 71)",
        "(line 836,col 9)-(line 839,col 48)",
        "(line 840,col 9)-(line 843,col 48)",
        "(line 844,col 9)-(line 847,col 48)",
        "(line 848,col 9)-(line 851,col 42)",
        "(line 855,col 9)-(line 855,col 34)",
        "(line 856,col 9)-(line 856,col 41)",
        "(line 857,col 9)-(line 859,col 58)",
        "(line 860,col 9)-(line 862,col 66)",
        "(line 864,col 9)-(line 866,col 58)",
        "(line 867,col 9)-(line 869,col 66)",
        "(line 870,col 9)-(line 870,col 41)",
        "(line 871,col 9)-(line 871,col 48)",
        "(line 874,col 9)-(line 874,col 50)",
        "(line 875,col 9)-(line 875,col 59)",
        "(line 876,col 9)-(line 876,col 34)",
        "(line 877,col 9)-(line 880,col 43)",
        "(line 881,col 9)-(line 881,col 45)",
        "(line 882,col 9)-(line 885,col 43)",
        "(line 886,col 9)-(line 886,col 45)",
        "(line 887,col 9)-(line 887,col 65)",
        "(line 888,col 9)-(line 888,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 896,
      "end_line": 964,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 59)",
        "(line 900,col 9)-(line 900,col 37)",
        "(line 901,col 9)-(line 901,col 78)",
        "(line 902,col 9)-(line 902,col 36)",
        "(line 904,col 9)-(line 904,col 52)",
        "(line 906,col 9)-(line 906,col 85)",
        "(line 907,col 9)-(line 907,col 84)",
        "(line 908,col 9)-(line 908,col 82)",
        "(line 909,col 9)-(line 909,col 79)",
        "(line 911,col 9)-(line 911,col 99)",
        "(line 912,col 9)-(line 912,col 102)",
        "(line 913,col 9)-(line 913,col 105)",
        "(line 914,col 9)-(line 914,col 108)",
        "(line 915,col 9)-(line 915,col 111)",
        "(line 918,col 9)-(line 918,col 47)",
        "(line 919,col 9)-(line 919,col 54)",
        "(line 920,col 9)-(line 920,col 61)",
        "(line 921,col 9)-(line 921,col 104)",
        "(line 924,col 9)-(line 925,col 102)",
        "(line 927,col 9)-(line 928,col 97)",
        "(line 930,col 9)-(line 931,col 97)",
        "(line 933,col 9)-(line 934,col 102)",
        "(line 936,col 9)-(line 937,col 95)",
        "(line 939,col 9)-(line 940,col 95)",
        "(line 944,col 9)-(line 945,col 99)",
        "(line 947,col 9)-(line 948,col 94)",
        "(line 950,col 9)-(line 951,col 94)",
        "(line 953,col 9)-(line 954,col 99)",
        "(line 956,col 9)-(line 957,col 92)",
        "(line 959,col 9)-(line 960,col 92)",
        "(line 963,col 9)-(line 963,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 969,
      "end_line": 989,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 972,col 48)",
        "(line 973,col 9)-(line 976,col 48)",
        "(line 977,col 9)-(line 980,col 48)",
        "(line 981,col 9)-(line 984,col 48)",
        "(line 985,col 9)-(line 988,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 994,
      "end_line": 1035,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 46)",
        "(line 996,col 9)-(line 1034,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1040,
      "end_line": 1060,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 78)",
        "(line 1042,col 9)-(line 1044,col 51)",
        "(line 1046,col 9)-(line 1046,col 69)",
        "(line 1047,col 9)-(line 1049,col 51)",
        "(line 1051,col 9)-(line 1051,col 69)",
        "(line 1052,col 9)-(line 1054,col 54)",
        "(line 1056,col 9)-(line 1056,col 69)",
        "(line 1057,col 9)-(line 1059,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Calendar)",
      "begin_line": 1066,
      "end_line": 1071,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 48)",
        "(line 1068,col 9)-(line 1068,col 34)",
        "(line 1070,col 9)-(line 1070,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Date, java.util.Date)",
      "begin_line": 1076,
      "end_line": 1083,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 51)",
        "(line 1078,col 9)-(line 1078,col 32)",
        "(line 1079,col 9)-(line 1079,col 49)",
        "(line 1080,col 9)-(line 1080,col 28)",
        "(line 1082,col 9)-(line 1082,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1090,
      "end_line": 1111,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 44)",
        "(line 1092,col 9)-(line 1092,col 40)",
        "(line 1093,col 9)-(line 1093,col 29)",
        "(line 1094,col 9)-(line 1094,col 22)",
        "(line 1095,col 9)-(line 1106,col 9)",
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1110,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1117,
      "end_line": 1122,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1124,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 32)"
      ]
    }
  ]
}