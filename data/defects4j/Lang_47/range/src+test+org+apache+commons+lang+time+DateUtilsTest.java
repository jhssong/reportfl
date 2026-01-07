{
  "filepath": "/tmp/Lang-47b/src/test/org/apache/commons/lang/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 1340,
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetYears()",
      "begin_line": 466,
      "end_line": 482,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 467,col 3)-(line 467,col 36)",
        "(line 468,col 3)-(line 468,col 47)",
        "(line 469,col 3)-(line 469,col 30)",
        "(line 470,col 3)-(line 470,col 43)",
        "(line 471,col 3)-(line 471,col 45)",
        "(line 473,col 3)-(line 473,col 42)",
        "(line 474,col 3)-(line 474,col 30)",
        "(line 475,col 3)-(line 475,col 43)",
        "(line 476,col 3)-(line 476,col 45)",
        "(line 478,col 3)-(line 478,col 42)",
        "(line 479,col 3)-(line 479,col 30)",
        "(line 480,col 3)-(line 480,col 43)",
        "(line 481,col 3)-(line 481,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetMonths()",
      "begin_line": 485,
      "end_line": 503,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 486,col 3)-(line 486,col 36)",
        "(line 487,col 3)-(line 487,col 45)",
        "(line 488,col 3)-(line 488,col 30)",
        "(line 489,col 3)-(line 489,col 43)",
        "(line 490,col 3)-(line 490,col 45)",
        "(line 492,col 3)-(line 492,col 40)",
        "(line 493,col 3)-(line 493,col 30)",
        "(line 494,col 3)-(line 494,col 43)",
        "(line 495,col 3)-(line 495,col 45)",
        "(line 497,col 3)-(line 502,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetDays()",
      "begin_line": 506,
      "end_line": 524,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 507,col 3)-(line 507,col 36)",
        "(line 508,col 3)-(line 508,col 43)",
        "(line 509,col 3)-(line 509,col 30)",
        "(line 510,col 3)-(line 510,col 43)",
        "(line 511,col 3)-(line 511,col 45)",
        "(line 513,col 3)-(line 513,col 39)",
        "(line 514,col 3)-(line 514,col 30)",
        "(line 515,col 3)-(line 515,col 43)",
        "(line 516,col 3)-(line 516,col 46)",
        "(line 518,col 3)-(line 523,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetHours()",
      "begin_line": 527,
      "end_line": 545,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 528,col 3)-(line 528,col 36)",
        "(line 529,col 3)-(line 529,col 44)",
        "(line 530,col 3)-(line 530,col 30)",
        "(line 531,col 3)-(line 531,col 43)",
        "(line 532,col 3)-(line 532,col 45)",
        "(line 534,col 3)-(line 534,col 40)",
        "(line 535,col 3)-(line 535,col 30)",
        "(line 536,col 3)-(line 536,col 43)",
        "(line 537,col 3)-(line 537,col 46)",
        "(line 539,col 3)-(line 544,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetMinutes()",
      "begin_line": 548,
      "end_line": 566,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 549,col 3)-(line 549,col 36)",
        "(line 550,col 3)-(line 550,col 46)",
        "(line 551,col 3)-(line 551,col 30)",
        "(line 552,col 3)-(line 552,col 43)",
        "(line 553,col 3)-(line 553,col 45)",
        "(line 555,col 3)-(line 555,col 42)",
        "(line 556,col 3)-(line 556,col 30)",
        "(line 557,col 3)-(line 557,col 43)",
        "(line 558,col 3)-(line 558,col 46)",
        "(line 560,col 3)-(line 565,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetSeconds()",
      "begin_line": 569,
      "end_line": 587,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 570,col 3)-(line 570,col 36)",
        "(line 571,col 3)-(line 571,col 46)",
        "(line 572,col 3)-(line 572,col 30)",
        "(line 573,col 3)-(line 573,col 43)",
        "(line 574,col 3)-(line 574,col 45)",
        "(line 576,col 3)-(line 576,col 42)",
        "(line 577,col 3)-(line 577,col 30)",
        "(line 578,col 3)-(line 578,col 43)",
        "(line 579,col 3)-(line 579,col 46)",
        "(line 581,col 3)-(line 586,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetMilliseconds()",
      "begin_line": 590,
      "end_line": 608,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 591,col 3)-(line 591,col 36)",
        "(line 592,col 3)-(line 592,col 51)",
        "(line 593,col 3)-(line 593,col 30)",
        "(line 594,col 3)-(line 594,col 43)",
        "(line 595,col 3)-(line 595,col 45)",
        "(line 597,col 3)-(line 597,col 48)",
        "(line 598,col 3)-(line 598,col 30)",
        "(line 599,col 3)-(line 599,col 43)",
        "(line 600,col 3)-(line 600,col 47)",
        "(line 602,col 3)-(line 607,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertDate(java.util.Date, int, int, int, int, int, int, int)",
      "begin_line": 611,
      "end_line": 621,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 56)",
        "(line 613,col 9)-(line 613,col 26)",
        "(line 614,col 9)-(line 614,col 51)",
        "(line 615,col 9)-(line 615,col 53)",
        "(line 616,col 9)-(line 616,col 58)",
        "(line 617,col 9)-(line 617,col 58)",
        "(line 618,col 9)-(line 618,col 52)",
        "(line 619,col 9)-(line 619,col 52)",
        "(line 620,col 9)-(line 620,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testRound()",
      "begin_line": 627,
      "end_line": 844,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 631,col 55)",
        "(line 632,col 9)-(line 634,col 55)",
        "(line 635,col 9)-(line 637,col 56)",
        "(line 638,col 9)-(line 640,col 56)",
        "(line 641,col 9)-(line 643,col 62)",
        "(line 644,col 9)-(line 646,col 62)",
        "(line 647,col 9)-(line 649,col 62)",
        "(line 652,col 9)-(line 654,col 55)",
        "(line 655,col 9)-(line 657,col 55)",
        "(line 658,col 9)-(line 660,col 55)",
        "(line 661,col 9)-(line 663,col 55)",
        "(line 664,col 9)-(line 666,col 57)",
        "(line 667,col 9)-(line 669,col 57)",
        "(line 670,col 9)-(line 672,col 57)",
        "(line 673,col 9)-(line 675,col 57)",
        "(line 676,col 9)-(line 678,col 60)",
        "(line 679,col 9)-(line 681,col 60)",
        "(line 682,col 9)-(line 684,col 60)",
        "(line 685,col 9)-(line 687,col 60)",
        "(line 690,col 9)-(line 692,col 64)",
        "(line 693,col 9)-(line 695,col 64)",
        "(line 696,col 9)-(line 698,col 65)",
        "(line 699,col 9)-(line 701,col 65)",
        "(line 702,col 9)-(line 704,col 71)",
        "(line 705,col 9)-(line 707,col 71)",
        "(line 708,col 9)-(line 710,col 64)",
        "(line 711,col 9)-(line 713,col 64)",
        "(line 714,col 9)-(line 716,col 64)",
        "(line 717,col 9)-(line 719,col 64)",
        "(line 720,col 9)-(line 722,col 66)",
        "(line 723,col 9)-(line 725,col 66)",
        "(line 726,col 9)-(line 728,col 66)",
        "(line 729,col 9)-(line 731,col 66)",
        "(line 732,col 9)-(line 734,col 65)",
        "(line 735,col 9)-(line 737,col 65)",
        "(line 738,col 9)-(line 740,col 69)",
        "(line 741,col 9)-(line 743,col 69)",
        "(line 744,col 9)-(line 746,col 69)",
        "(line 747,col 9)-(line 749,col 69)",
        "(line 751,col 9)-(line 754,col 48)",
        "(line 755,col 9)-(line 758,col 48)",
        "(line 759,col 9)-(line 762,col 48)",
        "(line 763,col 9)-(line 766,col 42)",
        "(line 767,col 9)-(line 770,col 47)",
        "(line 772,col 9)-(line 774,col 68)",
        "(line 775,col 9)-(line 777,col 68)",
        "(line 778,col 9)-(line 780,col 68)",
        "(line 781,col 9)-(line 783,col 68)",
        "(line 787,col 9)-(line 787,col 34)",
        "(line 788,col 9)-(line 788,col 41)",
        "(line 789,col 9)-(line 791,col 55)",
        "(line 792,col 9)-(line 794,col 63)",
        "(line 795,col 9)-(line 797,col 55)",
        "(line 798,col 9)-(line 800,col 63)",
        "(line 801,col 9)-(line 803,col 55)",
        "(line 804,col 9)-(line 806,col 63)",
        "(line 807,col 9)-(line 809,col 55)",
        "(line 810,col 9)-(line 812,col 63)",
        "(line 814,col 9)-(line 816,col 62)",
        "(line 817,col 9)-(line 819,col 70)",
        "(line 820,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 41)",
        "(line 843,col 9)-(line 843,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testRoundLang346()",
      "begin_line": 850,
      "end_line": 907,
      "comment": "\n     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked\n     * by DateUtils.round().\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 41)",
        "(line 853,col 9)-(line 853,col 48)",
        "(line 854,col 9)-(line 854,col 55)",
        "(line 855,col 9)-(line 855,col 47)",
        "(line 856,col 9)-(line 856,col 43)",
        "(line 857,col 9)-(line 859,col 61)",
        "(line 861,col 9)-(line 861,col 47)",
        "(line 862,col 9)-(line 862,col 38)",
        "(line 863,col 9)-(line 865,col 61)",
        "(line 867,col 9)-(line 867,col 47)",
        "(line 868,col 9)-(line 868,col 52)",
        "(line 869,col 9)-(line 869,col 38)",
        "(line 871,col 9)-(line 873,col 61)",
        "(line 875,col 9)-(line 875,col 47)",
        "(line 876,col 9)-(line 876,col 52)",
        "(line 877,col 9)-(line 877,col 38)",
        "(line 878,col 9)-(line 880,col 61)",
        "(line 882,col 9)-(line 882,col 47)",
        "(line 883,col 9)-(line 883,col 52)",
        "(line 884,col 9)-(line 884,col 38)",
        "(line 885,col 9)-(line 887,col 61)",
        "(line 889,col 9)-(line 889,col 47)",
        "(line 890,col 9)-(line 890,col 52)",
        "(line 891,col 9)-(line 891,col 38)",
        "(line 892,col 9)-(line 894,col 61)",
        "(line 896,col 9)-(line 896,col 47)",
        "(line 897,col 9)-(line 897,col 38)",
        "(line 898,col 9)-(line 900,col 59)",
        "(line 902,col 9)-(line 902,col 48)",
        "(line 903,col 9)-(line 903,col 38)",
        "(line 904,col 9)-(line 906,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testTruncate()",
      "begin_line": 912,
      "end_line": 1098,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 916,col 58)",
        "(line 917,col 9)-(line 919,col 58)",
        "(line 920,col 9)-(line 922,col 59)",
        "(line 923,col 9)-(line 925,col 59)",
        "(line 926,col 9)-(line 928,col 65)",
        "(line 929,col 9)-(line 931,col 65)",
        "(line 932,col 9)-(line 934,col 58)",
        "(line 935,col 9)-(line 937,col 58)",
        "(line 938,col 9)-(line 940,col 58)",
        "(line 941,col 9)-(line 943,col 58)",
        "(line 944,col 9)-(line 946,col 60)",
        "(line 947,col 9)-(line 949,col 60)",
        "(line 950,col 9)-(line 952,col 60)",
        "(line 953,col 9)-(line 955,col 60)",
        "(line 956,col 9)-(line 958,col 63)",
        "(line 959,col 9)-(line 961,col 63)",
        "(line 962,col 9)-(line 964,col 63)",
        "(line 965,col 9)-(line 967,col 63)",
        "(line 970,col 9)-(line 972,col 67)",
        "(line 973,col 9)-(line 975,col 67)",
        "(line 976,col 9)-(line 978,col 68)",
        "(line 979,col 9)-(line 981,col 68)",
        "(line 982,col 9)-(line 984,col 74)",
        "(line 985,col 9)-(line 987,col 74)",
        "(line 988,col 9)-(line 990,col 67)",
        "(line 991,col 9)-(line 993,col 67)",
        "(line 994,col 9)-(line 996,col 67)",
        "(line 997,col 9)-(line 999,col 67)",
        "(line 1000,col 9)-(line 1002,col 69)",
        "(line 1003,col 9)-(line 1005,col 69)",
        "(line 1006,col 9)-(line 1008,col 69)",
        "(line 1009,col 9)-(line 1011,col 69)",
        "(line 1012,col 9)-(line 1014,col 72)",
        "(line 1015,col 9)-(line 1017,col 72)",
        "(line 1018,col 9)-(line 1020,col 72)",
        "(line 1021,col 9)-(line 1023,col 72)",
        "(line 1025,col 9)-(line 1027,col 68)",
        "(line 1028,col 9)-(line 1030,col 68)",
        "(line 1032,col 9)-(line 1034,col 71)",
        "(line 1035,col 9)-(line 1037,col 71)",
        "(line 1038,col 9)-(line 1040,col 71)",
        "(line 1041,col 9)-(line 1043,col 71)",
        "(line 1045,col 9)-(line 1048,col 48)",
        "(line 1049,col 9)-(line 1052,col 48)",
        "(line 1053,col 9)-(line 1056,col 48)",
        "(line 1057,col 9)-(line 1060,col 42)",
        "(line 1064,col 9)-(line 1064,col 34)",
        "(line 1065,col 9)-(line 1065,col 41)",
        "(line 1066,col 9)-(line 1068,col 58)",
        "(line 1069,col 9)-(line 1071,col 66)",
        "(line 1073,col 9)-(line 1075,col 58)",
        "(line 1076,col 9)-(line 1078,col 66)",
        "(line 1079,col 9)-(line 1079,col 41)",
        "(line 1080,col 9)-(line 1080,col 48)",
        "(line 1083,col 9)-(line 1083,col 50)",
        "(line 1084,col 9)-(line 1084,col 59)",
        "(line 1085,col 9)-(line 1085,col 34)",
        "(line 1086,col 9)-(line 1089,col 43)",
        "(line 1090,col 9)-(line 1090,col 45)",
        "(line 1091,col 9)-(line 1094,col 43)",
        "(line 1095,col 9)-(line 1095,col 45)",
        "(line 1096,col 9)-(line 1096,col 65)",
        "(line 1097,col 9)-(line 1097,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 1105,
      "end_line": 1177,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1109,col 9)",
        "(line 1112,col 9)-(line 1112,col 59)",
        "(line 1113,col 9)-(line 1113,col 37)",
        "(line 1114,col 9)-(line 1114,col 78)",
        "(line 1115,col 9)-(line 1115,col 36)",
        "(line 1117,col 9)-(line 1117,col 52)",
        "(line 1119,col 9)-(line 1119,col 85)",
        "(line 1120,col 9)-(line 1120,col 84)",
        "(line 1121,col 9)-(line 1121,col 82)",
        "(line 1122,col 9)-(line 1122,col 79)",
        "(line 1124,col 9)-(line 1124,col 99)",
        "(line 1125,col 9)-(line 1125,col 102)",
        "(line 1126,col 9)-(line 1126,col 105)",
        "(line 1127,col 9)-(line 1127,col 108)",
        "(line 1128,col 9)-(line 1128,col 111)",
        "(line 1131,col 9)-(line 1131,col 47)",
        "(line 1132,col 9)-(line 1132,col 54)",
        "(line 1133,col 9)-(line 1133,col 61)",
        "(line 1134,col 9)-(line 1134,col 104)",
        "(line 1137,col 9)-(line 1138,col 102)",
        "(line 1140,col 9)-(line 1141,col 97)",
        "(line 1143,col 9)-(line 1144,col 97)",
        "(line 1146,col 9)-(line 1147,col 102)",
        "(line 1149,col 9)-(line 1150,col 95)",
        "(line 1152,col 9)-(line 1153,col 95)",
        "(line 1157,col 9)-(line 1158,col 99)",
        "(line 1160,col 9)-(line 1161,col 94)",
        "(line 1163,col 9)-(line 1164,col 94)",
        "(line 1166,col 9)-(line 1167,col 99)",
        "(line 1169,col 9)-(line 1170,col 92)",
        "(line 1172,col 9)-(line 1173,col 92)",
        "(line 1176,col 9)-(line 1176,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 1182,
      "end_line": 1202,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1185,col 48)",
        "(line 1186,col 9)-(line 1189,col 48)",
        "(line 1190,col 9)-(line 1193,col 48)",
        "(line 1194,col 9)-(line 1197,col 48)",
        "(line 1198,col 9)-(line 1201,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 1207,
      "end_line": 1248,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 1208,col 9)-(line 1208,col 46)",
        "(line 1209,col 9)-(line 1247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1253,
      "end_line": 1273,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1254,col 78)",
        "(line 1255,col 9)-(line 1257,col 51)",
        "(line 1259,col 9)-(line 1259,col 69)",
        "(line 1260,col 9)-(line 1262,col 51)",
        "(line 1264,col 9)-(line 1264,col 69)",
        "(line 1265,col 9)-(line 1267,col 54)",
        "(line 1269,col 9)-(line 1269,col 69)",
        "(line 1270,col 9)-(line 1272,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Calendar)",
      "begin_line": 1279,
      "end_line": 1284,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1280,col 9)-(line 1280,col 48)",
        "(line 1281,col 9)-(line 1281,col 34)",
        "(line 1283,col 9)-(line 1283,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Date, java.util.Date)",
      "begin_line": 1289,
      "end_line": 1296,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1290,col 51)",
        "(line 1291,col 9)-(line 1291,col 32)",
        "(line 1292,col 9)-(line 1292,col 49)",
        "(line 1293,col 9)-(line 1293,col 28)",
        "(line 1295,col 9)-(line 1295,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1303,
      "end_line": 1324,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1304,col 9)-(line 1304,col 44)",
        "(line 1305,col 9)-(line 1305,col 40)",
        "(line 1306,col 9)-(line 1306,col 29)",
        "(line 1307,col 9)-(line 1307,col 22)",
        "(line 1308,col 9)-(line 1319,col 9)",
        "(line 1320,col 9)-(line 1322,col 9)",
        "(line 1323,col 9)-(line 1323,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1330,
      "end_line": 1335,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1337,
      "end_line": 1339,
      "comment": "",
      "child_ranges": [
        "(line 1338,col 9)-(line 1338,col 32)"
      ]
    }
  ]
}