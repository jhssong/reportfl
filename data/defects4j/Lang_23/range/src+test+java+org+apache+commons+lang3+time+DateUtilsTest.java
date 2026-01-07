{
  "filepath": "/tmp/Lang-23b/src/test/java/org/apache/commons/lang3/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 43,
      "end_line": 1574,
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testToCalendar()",
      "begin_line": 601,
      "end_line": 609,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 111)",
        "(line 603,col 9)-(line 608,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRound()",
      "begin_line": 615,
      "end_line": 832,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 55)",
        "(line 620,col 9)-(line 622,col 55)",
        "(line 623,col 9)-(line 625,col 56)",
        "(line 626,col 9)-(line 628,col 56)",
        "(line 629,col 9)-(line 631,col 62)",
        "(line 632,col 9)-(line 634,col 62)",
        "(line 635,col 9)-(line 637,col 62)",
        "(line 640,col 9)-(line 642,col 55)",
        "(line 643,col 9)-(line 645,col 55)",
        "(line 646,col 9)-(line 648,col 55)",
        "(line 649,col 9)-(line 651,col 55)",
        "(line 652,col 9)-(line 654,col 57)",
        "(line 655,col 9)-(line 657,col 57)",
        "(line 658,col 9)-(line 660,col 57)",
        "(line 661,col 9)-(line 663,col 57)",
        "(line 664,col 9)-(line 666,col 60)",
        "(line 667,col 9)-(line 669,col 60)",
        "(line 670,col 9)-(line 672,col 60)",
        "(line 673,col 9)-(line 675,col 60)",
        "(line 678,col 9)-(line 680,col 64)",
        "(line 681,col 9)-(line 683,col 64)",
        "(line 684,col 9)-(line 686,col 65)",
        "(line 687,col 9)-(line 689,col 65)",
        "(line 690,col 9)-(line 692,col 71)",
        "(line 693,col 9)-(line 695,col 71)",
        "(line 696,col 9)-(line 698,col 64)",
        "(line 699,col 9)-(line 701,col 64)",
        "(line 702,col 9)-(line 704,col 64)",
        "(line 705,col 9)-(line 707,col 64)",
        "(line 708,col 9)-(line 710,col 66)",
        "(line 711,col 9)-(line 713,col 66)",
        "(line 714,col 9)-(line 716,col 66)",
        "(line 717,col 9)-(line 719,col 66)",
        "(line 720,col 9)-(line 722,col 65)",
        "(line 723,col 9)-(line 725,col 65)",
        "(line 726,col 9)-(line 728,col 69)",
        "(line 729,col 9)-(line 731,col 69)",
        "(line 732,col 9)-(line 734,col 69)",
        "(line 735,col 9)-(line 737,col 69)",
        "(line 739,col 9)-(line 742,col 48)",
        "(line 743,col 9)-(line 746,col 48)",
        "(line 747,col 9)-(line 750,col 48)",
        "(line 751,col 9)-(line 754,col 42)",
        "(line 755,col 9)-(line 758,col 47)",
        "(line 760,col 9)-(line 762,col 68)",
        "(line 763,col 9)-(line 765,col 68)",
        "(line 766,col 9)-(line 768,col 68)",
        "(line 769,col 9)-(line 771,col 68)",
        "(line 775,col 9)-(line 775,col 34)",
        "(line 776,col 9)-(line 776,col 41)",
        "(line 777,col 9)-(line 779,col 55)",
        "(line 780,col 9)-(line 782,col 63)",
        "(line 783,col 9)-(line 785,col 55)",
        "(line 786,col 9)-(line 788,col 63)",
        "(line 789,col 9)-(line 791,col 55)",
        "(line 792,col 9)-(line 794,col 63)",
        "(line 795,col 9)-(line 797,col 55)",
        "(line 798,col 9)-(line 800,col 63)",
        "(line 802,col 9)-(line 804,col 62)",
        "(line 805,col 9)-(line 807,col 70)",
        "(line 808,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 41)",
        "(line 831,col 9)-(line 831,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRoundLang346()",
      "begin_line": 838,
      "end_line": 895,
      "comment": "\n     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked\n     * by DateUtils.round().\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 41)",
        "(line 841,col 9)-(line 841,col 48)",
        "(line 842,col 9)-(line 842,col 55)",
        "(line 843,col 9)-(line 843,col 47)",
        "(line 844,col 9)-(line 844,col 43)",
        "(line 845,col 9)-(line 847,col 61)",
        "(line 849,col 9)-(line 849,col 47)",
        "(line 850,col 9)-(line 850,col 38)",
        "(line 851,col 9)-(line 853,col 61)",
        "(line 855,col 9)-(line 855,col 47)",
        "(line 856,col 9)-(line 856,col 52)",
        "(line 857,col 9)-(line 857,col 38)",
        "(line 859,col 9)-(line 861,col 61)",
        "(line 863,col 9)-(line 863,col 47)",
        "(line 864,col 9)-(line 864,col 52)",
        "(line 865,col 9)-(line 865,col 38)",
        "(line 866,col 9)-(line 868,col 61)",
        "(line 870,col 9)-(line 870,col 47)",
        "(line 871,col 9)-(line 871,col 52)",
        "(line 872,col 9)-(line 872,col 38)",
        "(line 873,col 9)-(line 875,col 61)",
        "(line 877,col 9)-(line 877,col 47)",
        "(line 878,col 9)-(line 878,col 52)",
        "(line 879,col 9)-(line 879,col 38)",
        "(line 880,col 9)-(line 882,col 61)",
        "(line 884,col 9)-(line 884,col 47)",
        "(line 885,col 9)-(line 885,col 38)",
        "(line 886,col 9)-(line 888,col 59)",
        "(line 890,col 9)-(line 890,col 48)",
        "(line 891,col 9)-(line 891,col 38)",
        "(line 892,col 9)-(line 894,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncate()",
      "begin_line": 900,
      "end_line": 1086,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 904,col 58)",
        "(line 905,col 9)-(line 907,col 58)",
        "(line 908,col 9)-(line 910,col 59)",
        "(line 911,col 9)-(line 913,col 59)",
        "(line 914,col 9)-(line 916,col 65)",
        "(line 917,col 9)-(line 919,col 65)",
        "(line 920,col 9)-(line 922,col 58)",
        "(line 923,col 9)-(line 925,col 58)",
        "(line 926,col 9)-(line 928,col 58)",
        "(line 929,col 9)-(line 931,col 58)",
        "(line 932,col 9)-(line 934,col 60)",
        "(line 935,col 9)-(line 937,col 60)",
        "(line 938,col 9)-(line 940,col 60)",
        "(line 941,col 9)-(line 943,col 60)",
        "(line 944,col 9)-(line 946,col 63)",
        "(line 947,col 9)-(line 949,col 63)",
        "(line 950,col 9)-(line 952,col 63)",
        "(line 953,col 9)-(line 955,col 63)",
        "(line 958,col 9)-(line 960,col 67)",
        "(line 961,col 9)-(line 963,col 67)",
        "(line 964,col 9)-(line 966,col 68)",
        "(line 967,col 9)-(line 969,col 68)",
        "(line 970,col 9)-(line 972,col 74)",
        "(line 973,col 9)-(line 975,col 74)",
        "(line 976,col 9)-(line 978,col 67)",
        "(line 979,col 9)-(line 981,col 67)",
        "(line 982,col 9)-(line 984,col 67)",
        "(line 985,col 9)-(line 987,col 67)",
        "(line 988,col 9)-(line 990,col 69)",
        "(line 991,col 9)-(line 993,col 69)",
        "(line 994,col 9)-(line 996,col 69)",
        "(line 997,col 9)-(line 999,col 69)",
        "(line 1000,col 9)-(line 1002,col 72)",
        "(line 1003,col 9)-(line 1005,col 72)",
        "(line 1006,col 9)-(line 1008,col 72)",
        "(line 1009,col 9)-(line 1011,col 72)",
        "(line 1013,col 9)-(line 1015,col 68)",
        "(line 1016,col 9)-(line 1018,col 68)",
        "(line 1020,col 9)-(line 1022,col 71)",
        "(line 1023,col 9)-(line 1025,col 71)",
        "(line 1026,col 9)-(line 1028,col 71)",
        "(line 1029,col 9)-(line 1031,col 71)",
        "(line 1033,col 9)-(line 1036,col 48)",
        "(line 1037,col 9)-(line 1040,col 48)",
        "(line 1041,col 9)-(line 1044,col 48)",
        "(line 1045,col 9)-(line 1048,col 42)",
        "(line 1052,col 9)-(line 1052,col 34)",
        "(line 1053,col 9)-(line 1053,col 41)",
        "(line 1054,col 9)-(line 1056,col 58)",
        "(line 1057,col 9)-(line 1059,col 66)",
        "(line 1061,col 9)-(line 1063,col 58)",
        "(line 1064,col 9)-(line 1066,col 66)",
        "(line 1067,col 9)-(line 1067,col 41)",
        "(line 1068,col 9)-(line 1068,col 48)",
        "(line 1071,col 9)-(line 1071,col 50)",
        "(line 1072,col 9)-(line 1072,col 59)",
        "(line 1073,col 9)-(line 1073,col 34)",
        "(line 1074,col 9)-(line 1077,col 43)",
        "(line 1078,col 9)-(line 1078,col 45)",
        "(line 1079,col 9)-(line 1082,col 43)",
        "(line 1083,col 9)-(line 1083,col 45)",
        "(line 1084,col 9)-(line 1084,col 65)",
        "(line 1085,col 9)-(line 1085,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 1093,
      "end_line": 1165,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1097,col 9)",
        "(line 1100,col 9)-(line 1100,col 59)",
        "(line 1101,col 9)-(line 1101,col 37)",
        "(line 1102,col 9)-(line 1102,col 78)",
        "(line 1103,col 9)-(line 1103,col 36)",
        "(line 1105,col 9)-(line 1105,col 52)",
        "(line 1107,col 9)-(line 1107,col 85)",
        "(line 1108,col 9)-(line 1108,col 84)",
        "(line 1109,col 9)-(line 1109,col 82)",
        "(line 1110,col 9)-(line 1110,col 79)",
        "(line 1112,col 9)-(line 1112,col 99)",
        "(line 1113,col 9)-(line 1113,col 102)",
        "(line 1114,col 9)-(line 1114,col 105)",
        "(line 1115,col 9)-(line 1115,col 108)",
        "(line 1116,col 9)-(line 1116,col 111)",
        "(line 1119,col 9)-(line 1119,col 47)",
        "(line 1120,col 9)-(line 1120,col 54)",
        "(line 1121,col 9)-(line 1121,col 61)",
        "(line 1122,col 9)-(line 1122,col 104)",
        "(line 1125,col 9)-(line 1126,col 102)",
        "(line 1128,col 9)-(line 1129,col 97)",
        "(line 1131,col 9)-(line 1132,col 97)",
        "(line 1134,col 9)-(line 1135,col 102)",
        "(line 1137,col 9)-(line 1138,col 95)",
        "(line 1140,col 9)-(line 1141,col 95)",
        "(line 1145,col 9)-(line 1146,col 99)",
        "(line 1148,col 9)-(line 1149,col 94)",
        "(line 1151,col 9)-(line 1152,col 94)",
        "(line 1154,col 9)-(line 1155,col 99)",
        "(line 1157,col 9)-(line 1158,col 92)",
        "(line 1160,col 9)-(line 1161,col 92)",
        "(line 1164,col 9)-(line 1164,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testLang530()",
      "begin_line": 1168,
      "end_line": 1174,
      "comment": " http://issues.apache.org/jira/browse/LANG-530",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 28)",
        "(line 1170,col 9)-(line 1170,col 84)",
        "(line 1171,col 9)-(line 1171,col 127)",
        "(line 1173,col 9)-(line 1173,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testCeil()",
      "begin_line": 1179,
      "end_line": 1411,
      "comment": "\n     * Tests various values with the ceiling method\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1183,col 57)",
        "(line 1184,col 9)-(line 1186,col 57)",
        "(line 1187,col 9)-(line 1189,col 58)",
        "(line 1190,col 9)-(line 1192,col 58)",
        "(line 1193,col 9)-(line 1195,col 64)",
        "(line 1196,col 9)-(line 1198,col 64)",
        "(line 1199,col 9)-(line 1201,col 57)",
        "(line 1202,col 9)-(line 1204,col 57)",
        "(line 1205,col 9)-(line 1207,col 57)",
        "(line 1208,col 9)-(line 1210,col 57)",
        "(line 1211,col 9)-(line 1213,col 59)",
        "(line 1214,col 9)-(line 1216,col 59)",
        "(line 1217,col 9)-(line 1219,col 59)",
        "(line 1220,col 9)-(line 1222,col 59)",
        "(line 1223,col 9)-(line 1225,col 62)",
        "(line 1226,col 9)-(line 1228,col 62)",
        "(line 1229,col 9)-(line 1231,col 62)",
        "(line 1232,col 9)-(line 1234,col 62)",
        "(line 1237,col 9)-(line 1239,col 66)",
        "(line 1240,col 9)-(line 1242,col 66)",
        "(line 1243,col 9)-(line 1245,col 67)",
        "(line 1246,col 9)-(line 1248,col 67)",
        "(line 1249,col 9)-(line 1251,col 73)",
        "(line 1252,col 9)-(line 1254,col 73)",
        "(line 1255,col 9)-(line 1257,col 66)",
        "(line 1258,col 9)-(line 1260,col 66)",
        "(line 1261,col 9)-(line 1263,col 66)",
        "(line 1264,col 9)-(line 1266,col 66)",
        "(line 1267,col 9)-(line 1269,col 68)",
        "(line 1270,col 9)-(line 1272,col 68)",
        "(line 1273,col 9)-(line 1275,col 68)",
        "(line 1276,col 9)-(line 1278,col 68)",
        "(line 1279,col 9)-(line 1281,col 71)",
        "(line 1282,col 9)-(line 1284,col 71)",
        "(line 1285,col 9)-(line 1287,col 71)",
        "(line 1288,col 9)-(line 1290,col 71)",
        "(line 1292,col 9)-(line 1294,col 67)",
        "(line 1295,col 9)-(line 1297,col 67)",
        "(line 1299,col 9)-(line 1301,col 70)",
        "(line 1302,col 9)-(line 1304,col 70)",
        "(line 1305,col 9)-(line 1307,col 70)",
        "(line 1308,col 9)-(line 1310,col 70)",
        "(line 1312,col 9)-(line 1315,col 48)",
        "(line 1316,col 9)-(line 1319,col 48)",
        "(line 1320,col 9)-(line 1323,col 48)",
        "(line 1324,col 9)-(line 1327,col 42)",
        "(line 1328,col 9)-(line 1331,col 47)",
        "(line 1336,col 9)-(line 1336,col 34)",
        "(line 1337,col 9)-(line 1337,col 41)",
        "(line 1339,col 9)-(line 1341,col 57)",
        "(line 1342,col 9)-(line 1344,col 65)",
        "(line 1345,col 9)-(line 1347,col 57)",
        "(line 1348,col 9)-(line 1350,col 65)",
        "(line 1351,col 9)-(line 1353,col 57)",
        "(line 1354,col 9)-(line 1356,col 65)",
        "(line 1357,col 9)-(line 1359,col 57)",
        "(line 1360,col 9)-(line 1362,col 65)",
        "(line 1364,col 9)-(line 1366,col 64)",
        "(line 1367,col 9)-(line 1369,col 72)",
        "(line 1370,col 9)-(line 1391,col 9)",
        "(line 1392,col 9)-(line 1392,col 41)",
        "(line 1393,col 9)-(line 1393,col 48)",
        "(line 1396,col 9)-(line 1396,col 50)",
        "(line 1397,col 9)-(line 1397,col 59)",
        "(line 1398,col 9)-(line 1398,col 34)",
        "(line 1399,col 9)-(line 1402,col 43)",
        "(line 1403,col 9)-(line 1403,col 45)",
        "(line 1404,col 9)-(line 1407,col 43)",
        "(line 1408,col 9)-(line 1408,col 45)",
        "(line 1409,col 9)-(line 1409,col 64)",
        "(line 1410,col 9)-(line 1410,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 1416,
      "end_line": 1436,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 1417,col 9)-(line 1419,col 48)",
        "(line 1420,col 9)-(line 1423,col 48)",
        "(line 1424,col 9)-(line 1427,col 48)",
        "(line 1428,col 9)-(line 1431,col 48)",
        "(line 1432,col 9)-(line 1435,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 1441,
      "end_line": 1482,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 1442,col 9)-(line 1442,col 46)",
        "(line 1443,col 9)-(line 1481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1487,
      "end_line": 1507,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1488,col 9)-(line 1488,col 81)",
        "(line 1489,col 9)-(line 1491,col 51)",
        "(line 1493,col 9)-(line 1493,col 69)",
        "(line 1494,col 9)-(line 1496,col 51)",
        "(line 1498,col 9)-(line 1498,col 69)",
        "(line 1499,col 9)-(line 1501,col 54)",
        "(line 1503,col 9)-(line 1503,col 69)",
        "(line 1504,col 9)-(line 1506,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar)",
      "begin_line": 1513,
      "end_line": 1518,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1514,col 9)-(line 1514,col 48)",
        "(line 1515,col 9)-(line 1515,col 34)",
        "(line 1517,col 9)-(line 1517,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Date, java.util.Date)",
      "begin_line": 1523,
      "end_line": 1530,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1524,col 9)-(line 1524,col 51)",
        "(line 1525,col 9)-(line 1525,col 32)",
        "(line 1526,col 9)-(line 1526,col 49)",
        "(line 1527,col 9)-(line 1527,col 28)",
        "(line 1529,col 9)-(line 1529,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1537,
      "end_line": 1558,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1538,col 9)-(line 1538,col 44)",
        "(line 1539,col 9)-(line 1539,col 40)",
        "(line 1540,col 9)-(line 1540,col 29)",
        "(line 1541,col 9)-(line 1541,col 22)",
        "(line 1542,col 9)-(line 1553,col 9)",
        "(line 1554,col 9)-(line 1556,col 9)",
        "(line 1557,col 9)-(line 1557,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1564,
      "end_line": 1569,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1565,col 9)-(line 1568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1571,
      "end_line": 1573,
      "comment": "",
      "child_ranges": [
        "(line 1572,col 9)-(line 1572,col 32)"
      ]
    }
  ]
}