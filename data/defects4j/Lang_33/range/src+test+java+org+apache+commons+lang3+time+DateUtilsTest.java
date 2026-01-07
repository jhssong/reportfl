{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 43,
      "end_line": 1563,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.DateUtils}.\n *\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steve@mungoknotwise.com\"\u003eSteven Caswell\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_TEST"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateParser"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
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
        "timeZoneDateParser"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm1"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm2"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm3"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm4"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date0"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date1"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date2"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date3"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date4"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date5"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date6"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date7"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date8"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm1"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm2"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm3"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm4"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal1"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal2"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal3"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal4"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal5"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal6"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal7"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal8"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zone"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultZone"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.DateUtilsTest(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.setUp()",
      "begin_line": 87,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 22)",
        "(line 91,col 9)-(line 91,col 74)",
        "(line 92,col 9)-(line 92,col 90)",
        "(line 94,col 9)-(line 94,col 74)",
        "(line 95,col 9)-(line 95,col 74)",
        "(line 96,col 9)-(line 96,col 74)",
        "(line 97,col 9)-(line 97,col 74)",
        "(line 98,col 9)-(line 98,col 70)",
        "(line 99,col 9)-(line 99,col 71)",
        "(line 100,col 9)-(line 100,col 70)",
        "(line 101,col 9)-(line 101,col 44)",
        "(line 102,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 103,col 34)",
        "(line 104,col 9)-(line 104,col 41)",
        "(line 105,col 9)-(line 105,col 68)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 107,col 9)-(line 107,col 68)",
        "(line 108,col 9)-(line 108,col 68)",
        "(line 109,col 9)-(line 109,col 68)",
        "(line 110,col 9)-(line 110,col 70)",
        "(line 111,col 9)-(line 111,col 48)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 42)",
        "(line 114,col 9)-(line 114,col 36)",
        "(line 115,col 9)-(line 115,col 42)",
        "(line 116,col 9)-(line 116,col 36)",
        "(line 117,col 9)-(line 117,col 42)",
        "(line 118,col 9)-(line 118,col 36)",
        "(line 119,col 9)-(line 119,col 42)",
        "(line 120,col 9)-(line 120,col 36)",
        "(line 121,col 9)-(line 121,col 38)",
        "(line 122,col 9)-(line 122,col 28)",
        "(line 123,col 9)-(line 123,col 38)",
        "(line 124,col 9)-(line 124,col 28)",
        "(line 125,col 9)-(line 125,col 34)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 28)",
        "(line 128,col 9)-(line 128,col 38)",
        "(line 129,col 9)-(line 129,col 28)",
        "(line 130,col 9)-(line 130,col 38)",
        "(line 131,col 9)-(line 131,col 28)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 133,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 135,col 28)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 137,col 9)-(line 137,col 28)",
        "(line 138,col 9)-(line 138,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testConstructor()",
      "begin_line": 142,
      "end_line": 149,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 39)",
        "(line 144,col 9)-(line 144,col 74)",
        "(line 145,col 9)-(line 145,col 37)",
        "(line 146,col 9)-(line 146,col 70)",
        "(line 147,col 9)-(line 147,col 78)",
        "(line 148,col 9)-(line 148,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Date()",
      "begin_line": 152,
      "end_line": 166,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 73)",
        "(line 154,col 9)-(line 154,col 73)",
        "(line 155,col 9)-(line 155,col 62)",
        "(line 156,col 9)-(line 156,col 69)",
        "(line 157,col 9)-(line 157,col 63)",
        "(line 158,col 9)-(line 158,col 69)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 160,col 9)-(line 160,col 69)",
        "(line 161,col 9)-(line 161,col 63)",
        "(line 162,col 9)-(line 165,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Cal()",
      "begin_line": 169,
      "end_line": 183,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 75)",
        "(line 171,col 9)-(line 171,col 75)",
        "(line 172,col 9)-(line 172,col 60)",
        "(line 173,col 9)-(line 173,col 42)",
        "(line 174,col 9)-(line 174,col 61)",
        "(line 175,col 9)-(line 175,col 42)",
        "(line 176,col 9)-(line 176,col 60)",
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 178,col 61)",
        "(line 179,col 9)-(line 182,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Date()",
      "begin_line": 186,
      "end_line": 200,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 73)",
        "(line 188,col 9)-(line 188,col 73)",
        "(line 189,col 9)-(line 189,col 66)",
        "(line 190,col 9)-(line 190,col 69)",
        "(line 191,col 9)-(line 191,col 67)",
        "(line 192,col 9)-(line 192,col 69)",
        "(line 193,col 9)-(line 193,col 66)",
        "(line 194,col 9)-(line 194,col 69)",
        "(line 195,col 9)-(line 195,col 67)",
        "(line 196,col 9)-(line 199,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Cal()",
      "begin_line": 203,
      "end_line": 218,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 86)",
        "(line 205,col 9)-(line 205,col 86)",
        "(line 206,col 9)-(line 206,col 40)",
        "(line 207,col 9)-(line 207,col 42)",
        "(line 208,col 9)-(line 208,col 40)",
        "(line 209,col 9)-(line 209,col 42)",
        "(line 210,col 9)-(line 210,col 65)",
        "(line 212,col 9)-(line 212,col 40)",
        "(line 213,col 9)-(line 213,col 64)",
        "(line 214,col 9)-(line 217,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameLocalTime_Cal()",
      "begin_line": 221,
      "end_line": 236,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 86)",
        "(line 223,col 9)-(line 223,col 86)",
        "(line 224,col 9)-(line 224,col 40)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 226,col 9)-(line 226,col 40)",
        "(line 227,col 9)-(line 227,col 42)",
        "(line 228,col 9)-(line 228,col 66)",
        "(line 230,col 9)-(line 230,col 40)",
        "(line 231,col 9)-(line 231,col 67)",
        "(line 232,col 9)-(line 235,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testParseDate()",
      "begin_line": 239,
      "end_line": 274,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 67)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 85)",
        "(line 243,col 9)-(line 243,col 58)",
        "(line 244,col 9)-(line 244,col 42)",
        "(line 246,col 9)-(line 246,col 29)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 248,col 42)",
        "(line 250,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 251,col 53)",
        "(line 252,col 9)-(line 252,col 42)",
        "(line 254,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 261,col 38)",
        "(line 262,col 9)-(line 265,col 48)",
        "(line 266,col 9)-(line 269,col 48)",
        "(line 270,col 9)-(line 273,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testParseDateWithLeniency()",
      "begin_line": 276,
      "end_line": 288,
      "comment": " LANG-486",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 67)",
        "(line 278,col 9)-(line 278,col 40)",
        "(line 279,col 9)-(line 279,col 57)",
        "(line 281,col 9)-(line 281,col 58)",
        "(line 282,col 9)-(line 282,col 42)",
        "(line 284,col 9)-(line 287,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddYears()",
      "begin_line": 291,
      "end_line": 307,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 42)",
        "(line 293,col 9)-(line 293,col 50)",
        "(line 294,col 9)-(line 294,col 36)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 296,col 9)-(line 296,col 51)",
        "(line 298,col 9)-(line 298,col 45)",
        "(line 299,col 9)-(line 299,col 36)",
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 301,col 51)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 304,col 9)-(line 304,col 36)",
        "(line 305,col 9)-(line 305,col 49)",
        "(line 306,col 9)-(line 306,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMonths()",
      "begin_line": 310,
      "end_line": 326,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 42)",
        "(line 312,col 9)-(line 312,col 51)",
        "(line 313,col 9)-(line 313,col 36)",
        "(line 314,col 9)-(line 314,col 49)",
        "(line 315,col 9)-(line 315,col 51)",
        "(line 317,col 9)-(line 317,col 46)",
        "(line 318,col 9)-(line 318,col 36)",
        "(line 319,col 9)-(line 319,col 49)",
        "(line 320,col 9)-(line 320,col 51)",
        "(line 322,col 9)-(line 322,col 47)",
        "(line 323,col 9)-(line 323,col 36)",
        "(line 324,col 9)-(line 324,col 49)",
        "(line 325,col 9)-(line 325,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddWeeks()",
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddDays()",
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddHours()",
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMinutes()",
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddSeconds()",
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMilliseconds()",
      "begin_line": 424,
      "end_line": 440,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 42)",
        "(line 426,col 9)-(line 426,col 57)",
        "(line 427,col 9)-(line 427,col 36)",
        "(line 428,col 9)-(line 428,col 49)",
        "(line 429,col 9)-(line 429,col 51)",
        "(line 431,col 9)-(line 431,col 52)",
        "(line 432,col 9)-(line 432,col 36)",
        "(line 433,col 9)-(line 433,col 49)",
        "(line 434,col 9)-(line 434,col 51)",
        "(line 436,col 9)-(line 436,col 53)",
        "(line 437,col 9)-(line 437,col 36)",
        "(line 438,col 9)-(line 438,col 49)",
        "(line 439,col 9)-(line 439,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetYears()",
      "begin_line": 443,
      "end_line": 459,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 42)",
        "(line 445,col 9)-(line 445,col 53)",
        "(line 446,col 9)-(line 446,col 36)",
        "(line 447,col 9)-(line 447,col 49)",
        "(line 448,col 9)-(line 448,col 51)",
        "(line 450,col 9)-(line 450,col 48)",
        "(line 451,col 9)-(line 451,col 36)",
        "(line 452,col 9)-(line 452,col 49)",
        "(line 453,col 9)-(line 453,col 51)",
        "(line 455,col 9)-(line 455,col 48)",
        "(line 456,col 9)-(line 456,col 36)",
        "(line 457,col 9)-(line 457,col 49)",
        "(line 458,col 9)-(line 458,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMonths()",
      "begin_line": 462,
      "end_line": 480,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 42)",
        "(line 464,col 9)-(line 464,col 51)",
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 49)",
        "(line 467,col 9)-(line 467,col 51)",
        "(line 469,col 9)-(line 469,col 46)",
        "(line 470,col 9)-(line 470,col 36)",
        "(line 471,col 9)-(line 471,col 49)",
        "(line 472,col 9)-(line 472,col 51)",
        "(line 474,col 9)-(line 479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetDays()",
      "begin_line": 483,
      "end_line": 501,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 42)",
        "(line 485,col 9)-(line 485,col 49)",
        "(line 486,col 9)-(line 486,col 36)",
        "(line 487,col 9)-(line 487,col 49)",
        "(line 488,col 9)-(line 488,col 51)",
        "(line 490,col 9)-(line 490,col 45)",
        "(line 491,col 9)-(line 491,col 36)",
        "(line 492,col 9)-(line 492,col 49)",
        "(line 493,col 9)-(line 493,col 52)",
        "(line 495,col 9)-(line 500,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetHours()",
      "begin_line": 504,
      "end_line": 522,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 42)",
        "(line 506,col 9)-(line 506,col 50)",
        "(line 507,col 9)-(line 507,col 36)",
        "(line 508,col 9)-(line 508,col 49)",
        "(line 509,col 9)-(line 509,col 51)",
        "(line 511,col 9)-(line 511,col 46)",
        "(line 512,col 9)-(line 512,col 36)",
        "(line 513,col 9)-(line 513,col 49)",
        "(line 514,col 9)-(line 514,col 52)",
        "(line 516,col 9)-(line 521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMinutes()",
      "begin_line": 525,
      "end_line": 543,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 42)",
        "(line 527,col 9)-(line 527,col 52)",
        "(line 528,col 9)-(line 528,col 36)",
        "(line 529,col 9)-(line 529,col 49)",
        "(line 530,col 9)-(line 530,col 51)",
        "(line 532,col 9)-(line 532,col 48)",
        "(line 533,col 9)-(line 533,col 36)",
        "(line 534,col 9)-(line 534,col 49)",
        "(line 535,col 9)-(line 535,col 52)",
        "(line 537,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetSeconds()",
      "begin_line": 546,
      "end_line": 564,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 42)",
        "(line 548,col 9)-(line 548,col 52)",
        "(line 549,col 9)-(line 549,col 36)",
        "(line 550,col 9)-(line 550,col 49)",
        "(line 551,col 9)-(line 551,col 51)",
        "(line 553,col 9)-(line 553,col 48)",
        "(line 554,col 9)-(line 554,col 36)",
        "(line 555,col 9)-(line 555,col 49)",
        "(line 556,col 9)-(line 556,col 52)",
        "(line 558,col 9)-(line 563,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMilliseconds()",
      "begin_line": 567,
      "end_line": 585,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 42)",
        "(line 569,col 9)-(line 569,col 57)",
        "(line 570,col 9)-(line 570,col 36)",
        "(line 571,col 9)-(line 571,col 49)",
        "(line 572,col 9)-(line 572,col 51)",
        "(line 574,col 9)-(line 574,col 54)",
        "(line 575,col 9)-(line 575,col 36)",
        "(line 576,col 9)-(line 576,col 49)",
        "(line 577,col 9)-(line 577,col 53)",
        "(line 579,col 9)-(line 584,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertDate(java.util.Date, int, int, int, int, int, int, int)",
      "begin_line": 588,
      "end_line": 598,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 56)",
        "(line 590,col 9)-(line 590,col 26)",
        "(line 591,col 9)-(line 591,col 51)",
        "(line 592,col 9)-(line 592,col 53)",
        "(line 593,col 9)-(line 593,col 58)",
        "(line 594,col 9)-(line 594,col 58)",
        "(line 595,col 9)-(line 595,col 52)",
        "(line 596,col 9)-(line 596,col 52)",
        "(line 597,col 9)-(line 597,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRound()",
      "begin_line": 604,
      "end_line": 821,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 608,col 55)",
        "(line 609,col 9)-(line 611,col 55)",
        "(line 612,col 9)-(line 614,col 56)",
        "(line 615,col 9)-(line 617,col 56)",
        "(line 618,col 9)-(line 620,col 62)",
        "(line 621,col 9)-(line 623,col 62)",
        "(line 624,col 9)-(line 626,col 62)",
        "(line 629,col 9)-(line 631,col 55)",
        "(line 632,col 9)-(line 634,col 55)",
        "(line 635,col 9)-(line 637,col 55)",
        "(line 638,col 9)-(line 640,col 55)",
        "(line 641,col 9)-(line 643,col 57)",
        "(line 644,col 9)-(line 646,col 57)",
        "(line 647,col 9)-(line 649,col 57)",
        "(line 650,col 9)-(line 652,col 57)",
        "(line 653,col 9)-(line 655,col 60)",
        "(line 656,col 9)-(line 658,col 60)",
        "(line 659,col 9)-(line 661,col 60)",
        "(line 662,col 9)-(line 664,col 60)",
        "(line 667,col 9)-(line 669,col 64)",
        "(line 670,col 9)-(line 672,col 64)",
        "(line 673,col 9)-(line 675,col 65)",
        "(line 676,col 9)-(line 678,col 65)",
        "(line 679,col 9)-(line 681,col 71)",
        "(line 682,col 9)-(line 684,col 71)",
        "(line 685,col 9)-(line 687,col 64)",
        "(line 688,col 9)-(line 690,col 64)",
        "(line 691,col 9)-(line 693,col 64)",
        "(line 694,col 9)-(line 696,col 64)",
        "(line 697,col 9)-(line 699,col 66)",
        "(line 700,col 9)-(line 702,col 66)",
        "(line 703,col 9)-(line 705,col 66)",
        "(line 706,col 9)-(line 708,col 66)",
        "(line 709,col 9)-(line 711,col 65)",
        "(line 712,col 9)-(line 714,col 65)",
        "(line 715,col 9)-(line 717,col 69)",
        "(line 718,col 9)-(line 720,col 69)",
        "(line 721,col 9)-(line 723,col 69)",
        "(line 724,col 9)-(line 726,col 69)",
        "(line 728,col 9)-(line 731,col 48)",
        "(line 732,col 9)-(line 735,col 48)",
        "(line 736,col 9)-(line 739,col 48)",
        "(line 740,col 9)-(line 743,col 42)",
        "(line 744,col 9)-(line 747,col 47)",
        "(line 749,col 9)-(line 751,col 68)",
        "(line 752,col 9)-(line 754,col 68)",
        "(line 755,col 9)-(line 757,col 68)",
        "(line 758,col 9)-(line 760,col 68)",
        "(line 764,col 9)-(line 764,col 34)",
        "(line 765,col 9)-(line 765,col 41)",
        "(line 766,col 9)-(line 768,col 55)",
        "(line 769,col 9)-(line 771,col 63)",
        "(line 772,col 9)-(line 774,col 55)",
        "(line 775,col 9)-(line 777,col 63)",
        "(line 778,col 9)-(line 780,col 55)",
        "(line 781,col 9)-(line 783,col 63)",
        "(line 784,col 9)-(line 786,col 55)",
        "(line 787,col 9)-(line 789,col 63)",
        "(line 791,col 9)-(line 793,col 62)",
        "(line 794,col 9)-(line 796,col 70)",
        "(line 797,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 819,col 41)",
        "(line 820,col 9)-(line 820,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRoundLang346()",
      "begin_line": 827,
      "end_line": 884,
      "comment": "\n     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked\n     * by DateUtils.round().\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 41)",
        "(line 830,col 9)-(line 830,col 48)",
        "(line 831,col 9)-(line 831,col 55)",
        "(line 832,col 9)-(line 832,col 47)",
        "(line 833,col 9)-(line 833,col 43)",
        "(line 834,col 9)-(line 836,col 61)",
        "(line 838,col 9)-(line 838,col 47)",
        "(line 839,col 9)-(line 839,col 38)",
        "(line 840,col 9)-(line 842,col 61)",
        "(line 844,col 9)-(line 844,col 47)",
        "(line 845,col 9)-(line 845,col 52)",
        "(line 846,col 9)-(line 846,col 38)",
        "(line 848,col 9)-(line 850,col 61)",
        "(line 852,col 9)-(line 852,col 47)",
        "(line 853,col 9)-(line 853,col 52)",
        "(line 854,col 9)-(line 854,col 38)",
        "(line 855,col 9)-(line 857,col 61)",
        "(line 859,col 9)-(line 859,col 47)",
        "(line 860,col 9)-(line 860,col 52)",
        "(line 861,col 9)-(line 861,col 38)",
        "(line 862,col 9)-(line 864,col 61)",
        "(line 866,col 9)-(line 866,col 47)",
        "(line 867,col 9)-(line 867,col 52)",
        "(line 868,col 9)-(line 868,col 38)",
        "(line 869,col 9)-(line 871,col 61)",
        "(line 873,col 9)-(line 873,col 47)",
        "(line 874,col 9)-(line 874,col 38)",
        "(line 875,col 9)-(line 877,col 59)",
        "(line 879,col 9)-(line 879,col 48)",
        "(line 880,col 9)-(line 880,col 38)",
        "(line 881,col 9)-(line 883,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncate()",
      "begin_line": 889,
      "end_line": 1075,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 893,col 58)",
        "(line 894,col 9)-(line 896,col 58)",
        "(line 897,col 9)-(line 899,col 59)",
        "(line 900,col 9)-(line 902,col 59)",
        "(line 903,col 9)-(line 905,col 65)",
        "(line 906,col 9)-(line 908,col 65)",
        "(line 909,col 9)-(line 911,col 58)",
        "(line 912,col 9)-(line 914,col 58)",
        "(line 915,col 9)-(line 917,col 58)",
        "(line 918,col 9)-(line 920,col 58)",
        "(line 921,col 9)-(line 923,col 60)",
        "(line 924,col 9)-(line 926,col 60)",
        "(line 927,col 9)-(line 929,col 60)",
        "(line 930,col 9)-(line 932,col 60)",
        "(line 933,col 9)-(line 935,col 63)",
        "(line 936,col 9)-(line 938,col 63)",
        "(line 939,col 9)-(line 941,col 63)",
        "(line 942,col 9)-(line 944,col 63)",
        "(line 947,col 9)-(line 949,col 67)",
        "(line 950,col 9)-(line 952,col 67)",
        "(line 953,col 9)-(line 955,col 68)",
        "(line 956,col 9)-(line 958,col 68)",
        "(line 959,col 9)-(line 961,col 74)",
        "(line 962,col 9)-(line 964,col 74)",
        "(line 965,col 9)-(line 967,col 67)",
        "(line 968,col 9)-(line 970,col 67)",
        "(line 971,col 9)-(line 973,col 67)",
        "(line 974,col 9)-(line 976,col 67)",
        "(line 977,col 9)-(line 979,col 69)",
        "(line 980,col 9)-(line 982,col 69)",
        "(line 983,col 9)-(line 985,col 69)",
        "(line 986,col 9)-(line 988,col 69)",
        "(line 989,col 9)-(line 991,col 72)",
        "(line 992,col 9)-(line 994,col 72)",
        "(line 995,col 9)-(line 997,col 72)",
        "(line 998,col 9)-(line 1000,col 72)",
        "(line 1002,col 9)-(line 1004,col 68)",
        "(line 1005,col 9)-(line 1007,col 68)",
        "(line 1009,col 9)-(line 1011,col 71)",
        "(line 1012,col 9)-(line 1014,col 71)",
        "(line 1015,col 9)-(line 1017,col 71)",
        "(line 1018,col 9)-(line 1020,col 71)",
        "(line 1022,col 9)-(line 1025,col 48)",
        "(line 1026,col 9)-(line 1029,col 48)",
        "(line 1030,col 9)-(line 1033,col 48)",
        "(line 1034,col 9)-(line 1037,col 42)",
        "(line 1041,col 9)-(line 1041,col 34)",
        "(line 1042,col 9)-(line 1042,col 41)",
        "(line 1043,col 9)-(line 1045,col 58)",
        "(line 1046,col 9)-(line 1048,col 66)",
        "(line 1050,col 9)-(line 1052,col 58)",
        "(line 1053,col 9)-(line 1055,col 66)",
        "(line 1056,col 9)-(line 1056,col 41)",
        "(line 1057,col 9)-(line 1057,col 48)",
        "(line 1060,col 9)-(line 1060,col 50)",
        "(line 1061,col 9)-(line 1061,col 59)",
        "(line 1062,col 9)-(line 1062,col 34)",
        "(line 1063,col 9)-(line 1066,col 43)",
        "(line 1067,col 9)-(line 1067,col 45)",
        "(line 1068,col 9)-(line 1071,col 43)",
        "(line 1072,col 9)-(line 1072,col 45)",
        "(line 1073,col 9)-(line 1073,col 65)",
        "(line 1074,col 9)-(line 1074,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 1082,
      "end_line": 1154,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 1083,col 9)-(line 1086,col 9)",
        "(line 1089,col 9)-(line 1089,col 59)",
        "(line 1090,col 9)-(line 1090,col 37)",
        "(line 1091,col 9)-(line 1091,col 78)",
        "(line 1092,col 9)-(line 1092,col 36)",
        "(line 1094,col 9)-(line 1094,col 52)",
        "(line 1096,col 9)-(line 1096,col 85)",
        "(line 1097,col 9)-(line 1097,col 84)",
        "(line 1098,col 9)-(line 1098,col 82)",
        "(line 1099,col 9)-(line 1099,col 79)",
        "(line 1101,col 9)-(line 1101,col 99)",
        "(line 1102,col 9)-(line 1102,col 102)",
        "(line 1103,col 9)-(line 1103,col 105)",
        "(line 1104,col 9)-(line 1104,col 108)",
        "(line 1105,col 9)-(line 1105,col 111)",
        "(line 1108,col 9)-(line 1108,col 47)",
        "(line 1109,col 9)-(line 1109,col 54)",
        "(line 1110,col 9)-(line 1110,col 61)",
        "(line 1111,col 9)-(line 1111,col 104)",
        "(line 1114,col 9)-(line 1115,col 102)",
        "(line 1117,col 9)-(line 1118,col 97)",
        "(line 1120,col 9)-(line 1121,col 97)",
        "(line 1123,col 9)-(line 1124,col 102)",
        "(line 1126,col 9)-(line 1127,col 95)",
        "(line 1129,col 9)-(line 1130,col 95)",
        "(line 1134,col 9)-(line 1135,col 99)",
        "(line 1137,col 9)-(line 1138,col 94)",
        "(line 1140,col 9)-(line 1141,col 94)",
        "(line 1143,col 9)-(line 1144,col 99)",
        "(line 1146,col 9)-(line 1147,col 92)",
        "(line 1149,col 9)-(line 1150,col 92)",
        "(line 1153,col 9)-(line 1153,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testLang530()",
      "begin_line": 1157,
      "end_line": 1163,
      "comment": " http://issues.apache.org/jira/browse/LANG-530",
      "child_ranges": [
        "(line 1158,col 9)-(line 1158,col 28)",
        "(line 1159,col 9)-(line 1159,col 84)",
        "(line 1160,col 9)-(line 1160,col 127)",
        "(line 1162,col 9)-(line 1162,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testCeil()",
      "begin_line": 1168,
      "end_line": 1400,
      "comment": "\n     * Tests various values with the ceiling method\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1172,col 57)",
        "(line 1173,col 9)-(line 1175,col 57)",
        "(line 1176,col 9)-(line 1178,col 58)",
        "(line 1179,col 9)-(line 1181,col 58)",
        "(line 1182,col 9)-(line 1184,col 64)",
        "(line 1185,col 9)-(line 1187,col 64)",
        "(line 1188,col 9)-(line 1190,col 57)",
        "(line 1191,col 9)-(line 1193,col 57)",
        "(line 1194,col 9)-(line 1196,col 57)",
        "(line 1197,col 9)-(line 1199,col 57)",
        "(line 1200,col 9)-(line 1202,col 59)",
        "(line 1203,col 9)-(line 1205,col 59)",
        "(line 1206,col 9)-(line 1208,col 59)",
        "(line 1209,col 9)-(line 1211,col 59)",
        "(line 1212,col 9)-(line 1214,col 62)",
        "(line 1215,col 9)-(line 1217,col 62)",
        "(line 1218,col 9)-(line 1220,col 62)",
        "(line 1221,col 9)-(line 1223,col 62)",
        "(line 1226,col 9)-(line 1228,col 66)",
        "(line 1229,col 9)-(line 1231,col 66)",
        "(line 1232,col 9)-(line 1234,col 67)",
        "(line 1235,col 9)-(line 1237,col 67)",
        "(line 1238,col 9)-(line 1240,col 73)",
        "(line 1241,col 9)-(line 1243,col 73)",
        "(line 1244,col 9)-(line 1246,col 66)",
        "(line 1247,col 9)-(line 1249,col 66)",
        "(line 1250,col 9)-(line 1252,col 66)",
        "(line 1253,col 9)-(line 1255,col 66)",
        "(line 1256,col 9)-(line 1258,col 68)",
        "(line 1259,col 9)-(line 1261,col 68)",
        "(line 1262,col 9)-(line 1264,col 68)",
        "(line 1265,col 9)-(line 1267,col 68)",
        "(line 1268,col 9)-(line 1270,col 71)",
        "(line 1271,col 9)-(line 1273,col 71)",
        "(line 1274,col 9)-(line 1276,col 71)",
        "(line 1277,col 9)-(line 1279,col 71)",
        "(line 1281,col 9)-(line 1283,col 67)",
        "(line 1284,col 9)-(line 1286,col 67)",
        "(line 1288,col 9)-(line 1290,col 70)",
        "(line 1291,col 9)-(line 1293,col 70)",
        "(line 1294,col 9)-(line 1296,col 70)",
        "(line 1297,col 9)-(line 1299,col 70)",
        "(line 1301,col 9)-(line 1304,col 48)",
        "(line 1305,col 9)-(line 1308,col 48)",
        "(line 1309,col 9)-(line 1312,col 48)",
        "(line 1313,col 9)-(line 1316,col 42)",
        "(line 1317,col 9)-(line 1320,col 47)",
        "(line 1325,col 9)-(line 1325,col 34)",
        "(line 1326,col 9)-(line 1326,col 41)",
        "(line 1328,col 9)-(line 1330,col 57)",
        "(line 1331,col 9)-(line 1333,col 65)",
        "(line 1334,col 9)-(line 1336,col 57)",
        "(line 1337,col 9)-(line 1339,col 65)",
        "(line 1340,col 9)-(line 1342,col 57)",
        "(line 1343,col 9)-(line 1345,col 65)",
        "(line 1346,col 9)-(line 1348,col 57)",
        "(line 1349,col 9)-(line 1351,col 65)",
        "(line 1353,col 9)-(line 1355,col 64)",
        "(line 1356,col 9)-(line 1358,col 72)",
        "(line 1359,col 9)-(line 1380,col 9)",
        "(line 1381,col 9)-(line 1381,col 41)",
        "(line 1382,col 9)-(line 1382,col 48)",
        "(line 1385,col 9)-(line 1385,col 50)",
        "(line 1386,col 9)-(line 1386,col 59)",
        "(line 1387,col 9)-(line 1387,col 34)",
        "(line 1388,col 9)-(line 1391,col 43)",
        "(line 1392,col 9)-(line 1392,col 45)",
        "(line 1393,col 9)-(line 1396,col 43)",
        "(line 1397,col 9)-(line 1397,col 45)",
        "(line 1398,col 9)-(line 1398,col 64)",
        "(line 1399,col 9)-(line 1399,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 1405,
      "end_line": 1425,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 1406,col 9)-(line 1408,col 48)",
        "(line 1409,col 9)-(line 1412,col 48)",
        "(line 1413,col 9)-(line 1416,col 48)",
        "(line 1417,col 9)-(line 1420,col 48)",
        "(line 1421,col 9)-(line 1424,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 1430,
      "end_line": 1471,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 46)",
        "(line 1432,col 9)-(line 1470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1476,
      "end_line": 1496,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1477,col 9)-(line 1477,col 81)",
        "(line 1478,col 9)-(line 1480,col 51)",
        "(line 1482,col 9)-(line 1482,col 69)",
        "(line 1483,col 9)-(line 1485,col 51)",
        "(line 1487,col 9)-(line 1487,col 69)",
        "(line 1488,col 9)-(line 1490,col 54)",
        "(line 1492,col 9)-(line 1492,col 69)",
        "(line 1493,col 9)-(line 1495,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar)",
      "begin_line": 1502,
      "end_line": 1507,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1503,col 9)-(line 1503,col 48)",
        "(line 1504,col 9)-(line 1504,col 34)",
        "(line 1506,col 9)-(line 1506,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Date, java.util.Date)",
      "begin_line": 1512,
      "end_line": 1519,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1513,col 9)-(line 1513,col 51)",
        "(line 1514,col 9)-(line 1514,col 32)",
        "(line 1515,col 9)-(line 1515,col 49)",
        "(line 1516,col 9)-(line 1516,col 28)",
        "(line 1518,col 9)-(line 1518,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1526,
      "end_line": 1547,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1527,col 9)-(line 1527,col 44)",
        "(line 1528,col 9)-(line 1528,col 40)",
        "(line 1529,col 9)-(line 1529,col 29)",
        "(line 1530,col 9)-(line 1530,col 22)",
        "(line 1531,col 9)-(line 1542,col 9)",
        "(line 1543,col 9)-(line 1545,col 9)",
        "(line 1546,col 9)-(line 1546,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1553,
      "end_line": 1558,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1554,col 9)-(line 1557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1560,
      "end_line": 1562,
      "comment": "",
      "child_ranges": [
        "(line 1561,col 9)-(line 1561,col 32)"
      ]
    }
  ]
}