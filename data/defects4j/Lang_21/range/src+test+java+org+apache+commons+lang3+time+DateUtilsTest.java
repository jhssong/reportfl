{
  "filepath": "/tmp/Lang-21b/src/test/java/org/apache/commons/lang3/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 44,
      "end_line": 1595,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.DateUtils}.\n *\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steve@mungoknotwise.com\"\u003eSteven Caswell\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_TEST"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateParser"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateTimeParser"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeZoneDateParser"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm1"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm2"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm3"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dateAmPm4"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date0"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date1"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date2"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date3"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date4"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date5"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date6"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date7"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "date8"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm1"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm2"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm3"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calAmPm4"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal1"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal2"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal3"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal4"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal5"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal6"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal7"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cal8"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zone"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultZone"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.DateUtilsTest(java.lang.String)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.setUp()",
      "begin_line": 88,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 22)",
        "(line 92,col 9)-(line 92,col 74)",
        "(line 93,col 9)-(line 93,col 90)",
        "(line 95,col 9)-(line 95,col 74)",
        "(line 96,col 9)-(line 96,col 74)",
        "(line 97,col 9)-(line 97,col 74)",
        "(line 98,col 9)-(line 98,col 74)",
        "(line 99,col 9)-(line 99,col 70)",
        "(line 100,col 9)-(line 100,col 71)",
        "(line 101,col 9)-(line 101,col 70)",
        "(line 102,col 9)-(line 102,col 44)",
        "(line 103,col 9)-(line 103,col 43)",
        "(line 104,col 9)-(line 104,col 34)",
        "(line 105,col 9)-(line 105,col 41)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 107,col 9)-(line 107,col 68)",
        "(line 108,col 9)-(line 108,col 68)",
        "(line 109,col 9)-(line 109,col 68)",
        "(line 110,col 9)-(line 110,col 68)",
        "(line 111,col 9)-(line 111,col 70)",
        "(line 112,col 9)-(line 112,col 48)",
        "(line 113,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 114,col 42)",
        "(line 115,col 9)-(line 115,col 36)",
        "(line 116,col 9)-(line 116,col 42)",
        "(line 117,col 9)-(line 117,col 36)",
        "(line 118,col 9)-(line 118,col 42)",
        "(line 119,col 9)-(line 119,col 36)",
        "(line 120,col 9)-(line 120,col 42)",
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 38)",
        "(line 123,col 9)-(line 123,col 28)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 125,col 28)",
        "(line 126,col 9)-(line 126,col 34)",
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 128,col 28)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 130,col 28)",
        "(line 131,col 9)-(line 131,col 38)",
        "(line 132,col 9)-(line 132,col 28)",
        "(line 133,col 9)-(line 133,col 38)",
        "(line 134,col 9)-(line 134,col 28)",
        "(line 135,col 9)-(line 135,col 38)",
        "(line 136,col 9)-(line 136,col 28)",
        "(line 137,col 9)-(line 137,col 38)",
        "(line 138,col 9)-(line 138,col 28)",
        "(line 139,col 9)-(line 139,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testConstructor()",
      "begin_line": 143,
      "end_line": 150,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 39)",
        "(line 145,col 9)-(line 145,col 74)",
        "(line 146,col 9)-(line 146,col 37)",
        "(line 147,col 9)-(line 147,col 70)",
        "(line 148,col 9)-(line 148,col 78)",
        "(line 149,col 9)-(line 149,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Date()",
      "begin_line": 153,
      "end_line": 167,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 73)",
        "(line 155,col 9)-(line 155,col 73)",
        "(line 156,col 9)-(line 156,col 62)",
        "(line 157,col 9)-(line 157,col 69)",
        "(line 158,col 9)-(line 158,col 63)",
        "(line 159,col 9)-(line 159,col 69)",
        "(line 160,col 9)-(line 160,col 62)",
        "(line 161,col 9)-(line 161,col 69)",
        "(line 162,col 9)-(line 162,col 63)",
        "(line 163,col 9)-(line 166,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Cal()",
      "begin_line": 170,
      "end_line": 184,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 75)",
        "(line 172,col 9)-(line 172,col 75)",
        "(line 173,col 9)-(line 173,col 60)",
        "(line 174,col 9)-(line 174,col 42)",
        "(line 175,col 9)-(line 175,col 61)",
        "(line 176,col 9)-(line 176,col 42)",
        "(line 177,col 9)-(line 177,col 60)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 61)",
        "(line 180,col 9)-(line 183,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Date()",
      "begin_line": 187,
      "end_line": 201,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 73)",
        "(line 189,col 9)-(line 189,col 73)",
        "(line 190,col 9)-(line 190,col 66)",
        "(line 191,col 9)-(line 191,col 69)",
        "(line 192,col 9)-(line 192,col 67)",
        "(line 193,col 9)-(line 193,col 69)",
        "(line 194,col 9)-(line 194,col 66)",
        "(line 195,col 9)-(line 195,col 69)",
        "(line 196,col 9)-(line 196,col 67)",
        "(line 197,col 9)-(line 200,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Cal()",
      "begin_line": 204,
      "end_line": 219,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 86)",
        "(line 206,col 9)-(line 206,col 86)",
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 208,col 42)",
        "(line 209,col 9)-(line 209,col 40)",
        "(line 210,col 9)-(line 210,col 42)",
        "(line 211,col 9)-(line 211,col 65)",
        "(line 213,col 9)-(line 213,col 40)",
        "(line 214,col 9)-(line 214,col 64)",
        "(line 215,col 9)-(line 218,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameLocalTime_Cal()",
      "begin_line": 222,
      "end_line": 245,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 86)",
        "(line 224,col 9)-(line 224,col 86)",
        "(line 225,col 9)-(line 225,col 40)",
        "(line 226,col 9)-(line 226,col 42)",
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 228,col 42)",
        "(line 229,col 9)-(line 229,col 66)",
        "(line 231,col 9)-(line 231,col 47)",
        "(line 232,col 9)-(line 232,col 47)",
        "(line 233,col 9)-(line 233,col 39)",
        "(line 234,col 9)-(line 234,col 39)",
        "(line 235,col 9)-(line 235,col 42)",
        "(line 236,col 9)-(line 236,col 42)",
        "(line 237,col 9)-(line 237,col 71)",
        "(line 239,col 9)-(line 239,col 40)",
        "(line 240,col 9)-(line 240,col 67)",
        "(line 241,col 9)-(line 244,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testParseDate()",
      "begin_line": 248,
      "end_line": 283,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 67)",
        "(line 250,col 9)-(line 250,col 38)",
        "(line 251,col 9)-(line 251,col 85)",
        "(line 252,col 9)-(line 252,col 58)",
        "(line 253,col 9)-(line 253,col 42)",
        "(line 255,col 9)-(line 255,col 29)",
        "(line 256,col 9)-(line 256,col 53)",
        "(line 257,col 9)-(line 257,col 42)",
        "(line 259,col 9)-(line 259,col 29)",
        "(line 260,col 9)-(line 260,col 53)",
        "(line 261,col 9)-(line 261,col 42)",
        "(line 263,col 9)-(line 266,col 38)",
        "(line 267,col 9)-(line 270,col 38)",
        "(line 271,col 9)-(line 274,col 48)",
        "(line 275,col 9)-(line 278,col 48)",
        "(line 279,col 9)-(line 282,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testParseDateWithLeniency()",
      "begin_line": 285,
      "end_line": 297,
      "comment": " LANG-486",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 67)",
        "(line 287,col 9)-(line 287,col 40)",
        "(line 288,col 9)-(line 288,col 57)",
        "(line 290,col 9)-(line 290,col 58)",
        "(line 291,col 9)-(line 291,col 42)",
        "(line 293,col 9)-(line 296,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddYears()",
      "begin_line": 300,
      "end_line": 316,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 42)",
        "(line 302,col 9)-(line 302,col 50)",
        "(line 303,col 9)-(line 303,col 36)",
        "(line 304,col 9)-(line 304,col 49)",
        "(line 305,col 9)-(line 305,col 51)",
        "(line 307,col 9)-(line 307,col 45)",
        "(line 308,col 9)-(line 308,col 36)",
        "(line 309,col 9)-(line 309,col 49)",
        "(line 310,col 9)-(line 310,col 51)",
        "(line 312,col 9)-(line 312,col 46)",
        "(line 313,col 9)-(line 313,col 36)",
        "(line 314,col 9)-(line 314,col 49)",
        "(line 315,col 9)-(line 315,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMonths()",
      "begin_line": 319,
      "end_line": 335,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 42)",
        "(line 321,col 9)-(line 321,col 51)",
        "(line 322,col 9)-(line 322,col 36)",
        "(line 323,col 9)-(line 323,col 49)",
        "(line 324,col 9)-(line 324,col 51)",
        "(line 326,col 9)-(line 326,col 46)",
        "(line 327,col 9)-(line 327,col 36)",
        "(line 328,col 9)-(line 328,col 49)",
        "(line 329,col 9)-(line 329,col 51)",
        "(line 331,col 9)-(line 331,col 47)",
        "(line 332,col 9)-(line 332,col 36)",
        "(line 333,col 9)-(line 333,col 49)",
        "(line 334,col 9)-(line 334,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddWeeks()",
      "begin_line": 338,
      "end_line": 354,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 42)",
        "(line 340,col 9)-(line 340,col 50)",
        "(line 341,col 9)-(line 341,col 36)",
        "(line 342,col 9)-(line 342,col 49)",
        "(line 343,col 9)-(line 343,col 51)",
        "(line 345,col 9)-(line 345,col 45)",
        "(line 346,col 9)-(line 346,col 36)",
        "(line 347,col 9)-(line 347,col 49)",
        "(line 348,col 9)-(line 348,col 52)",
        "(line 350,col 9)-(line 350,col 46)",
        "(line 351,col 9)-(line 351,col 36)",
        "(line 352,col 9)-(line 352,col 49)",
        "(line 353,col 9)-(line 353,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddDays()",
      "begin_line": 357,
      "end_line": 373,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 42)",
        "(line 359,col 9)-(line 359,col 49)",
        "(line 360,col 9)-(line 360,col 36)",
        "(line 361,col 9)-(line 361,col 49)",
        "(line 362,col 9)-(line 362,col 51)",
        "(line 364,col 9)-(line 364,col 44)",
        "(line 365,col 9)-(line 365,col 36)",
        "(line 366,col 9)-(line 366,col 49)",
        "(line 367,col 9)-(line 367,col 51)",
        "(line 369,col 9)-(line 369,col 45)",
        "(line 370,col 9)-(line 370,col 36)",
        "(line 371,col 9)-(line 371,col 49)",
        "(line 372,col 9)-(line 372,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddHours()",
      "begin_line": 376,
      "end_line": 392,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 42)",
        "(line 378,col 9)-(line 378,col 50)",
        "(line 379,col 9)-(line 379,col 36)",
        "(line 380,col 9)-(line 380,col 49)",
        "(line 381,col 9)-(line 381,col 51)",
        "(line 383,col 9)-(line 383,col 45)",
        "(line 384,col 9)-(line 384,col 36)",
        "(line 385,col 9)-(line 385,col 49)",
        "(line 386,col 9)-(line 386,col 51)",
        "(line 388,col 9)-(line 388,col 46)",
        "(line 389,col 9)-(line 389,col 36)",
        "(line 390,col 9)-(line 390,col 49)",
        "(line 391,col 9)-(line 391,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMinutes()",
      "begin_line": 395,
      "end_line": 411,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 42)",
        "(line 397,col 9)-(line 397,col 52)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 399,col 9)-(line 399,col 49)",
        "(line 400,col 9)-(line 400,col 51)",
        "(line 402,col 9)-(line 402,col 47)",
        "(line 403,col 9)-(line 403,col 36)",
        "(line 404,col 9)-(line 404,col 49)",
        "(line 405,col 9)-(line 405,col 51)",
        "(line 407,col 9)-(line 407,col 48)",
        "(line 408,col 9)-(line 408,col 36)",
        "(line 409,col 9)-(line 409,col 49)",
        "(line 410,col 9)-(line 410,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddSeconds()",
      "begin_line": 414,
      "end_line": 430,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 42)",
        "(line 416,col 9)-(line 416,col 52)",
        "(line 417,col 9)-(line 417,col 36)",
        "(line 418,col 9)-(line 418,col 49)",
        "(line 419,col 9)-(line 419,col 51)",
        "(line 421,col 9)-(line 421,col 47)",
        "(line 422,col 9)-(line 422,col 36)",
        "(line 423,col 9)-(line 423,col 49)",
        "(line 424,col 9)-(line 424,col 51)",
        "(line 426,col 9)-(line 426,col 48)",
        "(line 427,col 9)-(line 427,col 36)",
        "(line 428,col 9)-(line 428,col 49)",
        "(line 429,col 9)-(line 429,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMilliseconds()",
      "begin_line": 433,
      "end_line": 449,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 42)",
        "(line 435,col 9)-(line 435,col 57)",
        "(line 436,col 9)-(line 436,col 36)",
        "(line 437,col 9)-(line 437,col 49)",
        "(line 438,col 9)-(line 438,col 51)",
        "(line 440,col 9)-(line 440,col 52)",
        "(line 441,col 9)-(line 441,col 36)",
        "(line 442,col 9)-(line 442,col 49)",
        "(line 443,col 9)-(line 443,col 51)",
        "(line 445,col 9)-(line 445,col 53)",
        "(line 446,col 9)-(line 446,col 36)",
        "(line 447,col 9)-(line 447,col 49)",
        "(line 448,col 9)-(line 448,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetYears()",
      "begin_line": 452,
      "end_line": 468,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 42)",
        "(line 454,col 9)-(line 454,col 53)",
        "(line 455,col 9)-(line 455,col 36)",
        "(line 456,col 9)-(line 456,col 49)",
        "(line 457,col 9)-(line 457,col 51)",
        "(line 459,col 9)-(line 459,col 48)",
        "(line 460,col 9)-(line 460,col 36)",
        "(line 461,col 9)-(line 461,col 49)",
        "(line 462,col 9)-(line 462,col 51)",
        "(line 464,col 9)-(line 464,col 48)",
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 49)",
        "(line 467,col 9)-(line 467,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMonths()",
      "begin_line": 471,
      "end_line": 489,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 42)",
        "(line 473,col 9)-(line 473,col 51)",
        "(line 474,col 9)-(line 474,col 36)",
        "(line 475,col 9)-(line 475,col 49)",
        "(line 476,col 9)-(line 476,col 51)",
        "(line 478,col 9)-(line 478,col 46)",
        "(line 479,col 9)-(line 479,col 36)",
        "(line 480,col 9)-(line 480,col 49)",
        "(line 481,col 9)-(line 481,col 51)",
        "(line 483,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetDays()",
      "begin_line": 492,
      "end_line": 510,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 42)",
        "(line 494,col 9)-(line 494,col 49)",
        "(line 495,col 9)-(line 495,col 36)",
        "(line 496,col 9)-(line 496,col 49)",
        "(line 497,col 9)-(line 497,col 51)",
        "(line 499,col 9)-(line 499,col 45)",
        "(line 500,col 9)-(line 500,col 36)",
        "(line 501,col 9)-(line 501,col 49)",
        "(line 502,col 9)-(line 502,col 52)",
        "(line 504,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetHours()",
      "begin_line": 513,
      "end_line": 531,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 42)",
        "(line 515,col 9)-(line 515,col 50)",
        "(line 516,col 9)-(line 516,col 36)",
        "(line 517,col 9)-(line 517,col 49)",
        "(line 518,col 9)-(line 518,col 51)",
        "(line 520,col 9)-(line 520,col 46)",
        "(line 521,col 9)-(line 521,col 36)",
        "(line 522,col 9)-(line 522,col 49)",
        "(line 523,col 9)-(line 523,col 52)",
        "(line 525,col 9)-(line 530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMinutes()",
      "begin_line": 534,
      "end_line": 552,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 42)",
        "(line 536,col 9)-(line 536,col 52)",
        "(line 537,col 9)-(line 537,col 36)",
        "(line 538,col 9)-(line 538,col 49)",
        "(line 539,col 9)-(line 539,col 51)",
        "(line 541,col 9)-(line 541,col 48)",
        "(line 542,col 9)-(line 542,col 36)",
        "(line 543,col 9)-(line 543,col 49)",
        "(line 544,col 9)-(line 544,col 52)",
        "(line 546,col 9)-(line 551,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetSeconds()",
      "begin_line": 555,
      "end_line": 573,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 42)",
        "(line 557,col 9)-(line 557,col 52)",
        "(line 558,col 9)-(line 558,col 36)",
        "(line 559,col 9)-(line 559,col 49)",
        "(line 560,col 9)-(line 560,col 51)",
        "(line 562,col 9)-(line 562,col 48)",
        "(line 563,col 9)-(line 563,col 36)",
        "(line 564,col 9)-(line 564,col 49)",
        "(line 565,col 9)-(line 565,col 52)",
        "(line 567,col 9)-(line 572,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMilliseconds()",
      "begin_line": 576,
      "end_line": 594,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 42)",
        "(line 578,col 9)-(line 578,col 57)",
        "(line 579,col 9)-(line 579,col 36)",
        "(line 580,col 9)-(line 580,col 49)",
        "(line 581,col 9)-(line 581,col 51)",
        "(line 583,col 9)-(line 583,col 54)",
        "(line 584,col 9)-(line 584,col 36)",
        "(line 585,col 9)-(line 585,col 49)",
        "(line 586,col 9)-(line 586,col 53)",
        "(line 588,col 9)-(line 593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertDate(java.util.Date, int, int, int, int, int, int, int)",
      "begin_line": 597,
      "end_line": 607,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 56)",
        "(line 599,col 9)-(line 599,col 26)",
        "(line 600,col 9)-(line 600,col 51)",
        "(line 601,col 9)-(line 601,col 53)",
        "(line 602,col 9)-(line 602,col 58)",
        "(line 603,col 9)-(line 603,col 58)",
        "(line 604,col 9)-(line 604,col 52)",
        "(line 605,col 9)-(line 605,col 52)",
        "(line 606,col 9)-(line 606,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testToCalendar()",
      "begin_line": 610,
      "end_line": 618,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 111)",
        "(line 612,col 9)-(line 617,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRound()",
      "begin_line": 624,
      "end_line": 841,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 628,col 55)",
        "(line 629,col 9)-(line 631,col 55)",
        "(line 632,col 9)-(line 634,col 56)",
        "(line 635,col 9)-(line 637,col 56)",
        "(line 638,col 9)-(line 640,col 62)",
        "(line 641,col 9)-(line 643,col 62)",
        "(line 644,col 9)-(line 646,col 62)",
        "(line 649,col 9)-(line 651,col 55)",
        "(line 652,col 9)-(line 654,col 55)",
        "(line 655,col 9)-(line 657,col 55)",
        "(line 658,col 9)-(line 660,col 55)",
        "(line 661,col 9)-(line 663,col 57)",
        "(line 664,col 9)-(line 666,col 57)",
        "(line 667,col 9)-(line 669,col 57)",
        "(line 670,col 9)-(line 672,col 57)",
        "(line 673,col 9)-(line 675,col 60)",
        "(line 676,col 9)-(line 678,col 60)",
        "(line 679,col 9)-(line 681,col 60)",
        "(line 682,col 9)-(line 684,col 60)",
        "(line 687,col 9)-(line 689,col 64)",
        "(line 690,col 9)-(line 692,col 64)",
        "(line 693,col 9)-(line 695,col 65)",
        "(line 696,col 9)-(line 698,col 65)",
        "(line 699,col 9)-(line 701,col 71)",
        "(line 702,col 9)-(line 704,col 71)",
        "(line 705,col 9)-(line 707,col 64)",
        "(line 708,col 9)-(line 710,col 64)",
        "(line 711,col 9)-(line 713,col 64)",
        "(line 714,col 9)-(line 716,col 64)",
        "(line 717,col 9)-(line 719,col 66)",
        "(line 720,col 9)-(line 722,col 66)",
        "(line 723,col 9)-(line 725,col 66)",
        "(line 726,col 9)-(line 728,col 66)",
        "(line 729,col 9)-(line 731,col 65)",
        "(line 732,col 9)-(line 734,col 65)",
        "(line 735,col 9)-(line 737,col 69)",
        "(line 738,col 9)-(line 740,col 69)",
        "(line 741,col 9)-(line 743,col 69)",
        "(line 744,col 9)-(line 746,col 69)",
        "(line 748,col 9)-(line 751,col 48)",
        "(line 752,col 9)-(line 755,col 48)",
        "(line 756,col 9)-(line 759,col 48)",
        "(line 760,col 9)-(line 763,col 42)",
        "(line 764,col 9)-(line 767,col 47)",
        "(line 769,col 9)-(line 771,col 68)",
        "(line 772,col 9)-(line 774,col 68)",
        "(line 775,col 9)-(line 777,col 68)",
        "(line 778,col 9)-(line 780,col 68)",
        "(line 784,col 9)-(line 784,col 34)",
        "(line 785,col 9)-(line 785,col 41)",
        "(line 786,col 9)-(line 788,col 55)",
        "(line 789,col 9)-(line 791,col 63)",
        "(line 792,col 9)-(line 794,col 55)",
        "(line 795,col 9)-(line 797,col 63)",
        "(line 798,col 9)-(line 800,col 55)",
        "(line 801,col 9)-(line 803,col 63)",
        "(line 804,col 9)-(line 806,col 55)",
        "(line 807,col 9)-(line 809,col 63)",
        "(line 811,col 9)-(line 813,col 62)",
        "(line 814,col 9)-(line 816,col 70)",
        "(line 817,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 41)",
        "(line 840,col 9)-(line 840,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRoundLang346()",
      "begin_line": 847,
      "end_line": 904,
      "comment": "\n     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked\n     * by DateUtils.round().\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 41)",
        "(line 850,col 9)-(line 850,col 48)",
        "(line 851,col 9)-(line 851,col 55)",
        "(line 852,col 9)-(line 852,col 47)",
        "(line 853,col 9)-(line 853,col 43)",
        "(line 854,col 9)-(line 856,col 61)",
        "(line 858,col 9)-(line 858,col 47)",
        "(line 859,col 9)-(line 859,col 38)",
        "(line 860,col 9)-(line 862,col 61)",
        "(line 864,col 9)-(line 864,col 47)",
        "(line 865,col 9)-(line 865,col 52)",
        "(line 866,col 9)-(line 866,col 38)",
        "(line 868,col 9)-(line 870,col 61)",
        "(line 872,col 9)-(line 872,col 47)",
        "(line 873,col 9)-(line 873,col 52)",
        "(line 874,col 9)-(line 874,col 38)",
        "(line 875,col 9)-(line 877,col 61)",
        "(line 879,col 9)-(line 879,col 47)",
        "(line 880,col 9)-(line 880,col 52)",
        "(line 881,col 9)-(line 881,col 38)",
        "(line 882,col 9)-(line 884,col 61)",
        "(line 886,col 9)-(line 886,col 47)",
        "(line 887,col 9)-(line 887,col 52)",
        "(line 888,col 9)-(line 888,col 38)",
        "(line 889,col 9)-(line 891,col 61)",
        "(line 893,col 9)-(line 893,col 47)",
        "(line 894,col 9)-(line 894,col 38)",
        "(line 895,col 9)-(line 897,col 59)",
        "(line 899,col 9)-(line 899,col 48)",
        "(line 900,col 9)-(line 900,col 38)",
        "(line 901,col 9)-(line 903,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncate()",
      "begin_line": 909,
      "end_line": 1095,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 913,col 58)",
        "(line 914,col 9)-(line 916,col 58)",
        "(line 917,col 9)-(line 919,col 59)",
        "(line 920,col 9)-(line 922,col 59)",
        "(line 923,col 9)-(line 925,col 65)",
        "(line 926,col 9)-(line 928,col 65)",
        "(line 929,col 9)-(line 931,col 58)",
        "(line 932,col 9)-(line 934,col 58)",
        "(line 935,col 9)-(line 937,col 58)",
        "(line 938,col 9)-(line 940,col 58)",
        "(line 941,col 9)-(line 943,col 60)",
        "(line 944,col 9)-(line 946,col 60)",
        "(line 947,col 9)-(line 949,col 60)",
        "(line 950,col 9)-(line 952,col 60)",
        "(line 953,col 9)-(line 955,col 63)",
        "(line 956,col 9)-(line 958,col 63)",
        "(line 959,col 9)-(line 961,col 63)",
        "(line 962,col 9)-(line 964,col 63)",
        "(line 967,col 9)-(line 969,col 67)",
        "(line 970,col 9)-(line 972,col 67)",
        "(line 973,col 9)-(line 975,col 68)",
        "(line 976,col 9)-(line 978,col 68)",
        "(line 979,col 9)-(line 981,col 74)",
        "(line 982,col 9)-(line 984,col 74)",
        "(line 985,col 9)-(line 987,col 67)",
        "(line 988,col 9)-(line 990,col 67)",
        "(line 991,col 9)-(line 993,col 67)",
        "(line 994,col 9)-(line 996,col 67)",
        "(line 997,col 9)-(line 999,col 69)",
        "(line 1000,col 9)-(line 1002,col 69)",
        "(line 1003,col 9)-(line 1005,col 69)",
        "(line 1006,col 9)-(line 1008,col 69)",
        "(line 1009,col 9)-(line 1011,col 72)",
        "(line 1012,col 9)-(line 1014,col 72)",
        "(line 1015,col 9)-(line 1017,col 72)",
        "(line 1018,col 9)-(line 1020,col 72)",
        "(line 1022,col 9)-(line 1024,col 68)",
        "(line 1025,col 9)-(line 1027,col 68)",
        "(line 1029,col 9)-(line 1031,col 71)",
        "(line 1032,col 9)-(line 1034,col 71)",
        "(line 1035,col 9)-(line 1037,col 71)",
        "(line 1038,col 9)-(line 1040,col 71)",
        "(line 1042,col 9)-(line 1045,col 48)",
        "(line 1046,col 9)-(line 1049,col 48)",
        "(line 1050,col 9)-(line 1053,col 48)",
        "(line 1054,col 9)-(line 1057,col 42)",
        "(line 1061,col 9)-(line 1061,col 34)",
        "(line 1062,col 9)-(line 1062,col 41)",
        "(line 1063,col 9)-(line 1065,col 58)",
        "(line 1066,col 9)-(line 1068,col 66)",
        "(line 1070,col 9)-(line 1072,col 58)",
        "(line 1073,col 9)-(line 1075,col 66)",
        "(line 1076,col 9)-(line 1076,col 41)",
        "(line 1077,col 9)-(line 1077,col 48)",
        "(line 1080,col 9)-(line 1080,col 50)",
        "(line 1081,col 9)-(line 1081,col 59)",
        "(line 1082,col 9)-(line 1082,col 34)",
        "(line 1083,col 9)-(line 1086,col 43)",
        "(line 1087,col 9)-(line 1087,col 45)",
        "(line 1088,col 9)-(line 1091,col 43)",
        "(line 1092,col 9)-(line 1092,col 45)",
        "(line 1093,col 9)-(line 1093,col 65)",
        "(line 1094,col 9)-(line 1094,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 1102,
      "end_line": 1174,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 1103,col 9)-(line 1106,col 9)",
        "(line 1109,col 9)-(line 1109,col 59)",
        "(line 1110,col 9)-(line 1110,col 37)",
        "(line 1111,col 9)-(line 1111,col 78)",
        "(line 1112,col 9)-(line 1112,col 36)",
        "(line 1114,col 9)-(line 1114,col 52)",
        "(line 1116,col 9)-(line 1116,col 85)",
        "(line 1117,col 9)-(line 1117,col 84)",
        "(line 1118,col 9)-(line 1118,col 82)",
        "(line 1119,col 9)-(line 1119,col 79)",
        "(line 1121,col 9)-(line 1121,col 99)",
        "(line 1122,col 9)-(line 1122,col 102)",
        "(line 1123,col 9)-(line 1123,col 105)",
        "(line 1124,col 9)-(line 1124,col 108)",
        "(line 1125,col 9)-(line 1125,col 111)",
        "(line 1128,col 9)-(line 1128,col 47)",
        "(line 1129,col 9)-(line 1129,col 54)",
        "(line 1130,col 9)-(line 1130,col 61)",
        "(line 1131,col 9)-(line 1131,col 104)",
        "(line 1134,col 9)-(line 1135,col 102)",
        "(line 1137,col 9)-(line 1138,col 97)",
        "(line 1140,col 9)-(line 1141,col 97)",
        "(line 1143,col 9)-(line 1144,col 102)",
        "(line 1146,col 9)-(line 1147,col 95)",
        "(line 1149,col 9)-(line 1150,col 95)",
        "(line 1154,col 9)-(line 1155,col 99)",
        "(line 1157,col 9)-(line 1158,col 94)",
        "(line 1160,col 9)-(line 1161,col 94)",
        "(line 1163,col 9)-(line 1164,col 99)",
        "(line 1166,col 9)-(line 1167,col 92)",
        "(line 1169,col 9)-(line 1170,col 92)",
        "(line 1173,col 9)-(line 1173,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testLang530()",
      "begin_line": 1177,
      "end_line": 1183,
      "comment": " http://issues.apache.org/jira/browse/LANG-530",
      "child_ranges": [
        "(line 1178,col 9)-(line 1178,col 28)",
        "(line 1179,col 9)-(line 1179,col 84)",
        "(line 1180,col 9)-(line 1180,col 127)",
        "(line 1182,col 9)-(line 1182,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testCeil()",
      "begin_line": 1188,
      "end_line": 1432,
      "comment": "\n     * Tests various values with the ceiling method\n     ",
      "child_ranges": [
        "(line 1190,col 9)-(line 1194,col 32)",
        "(line 1195,col 9)-(line 1199,col 33)",
        "(line 1202,col 9)-(line 1204,col 57)",
        "(line 1205,col 9)-(line 1207,col 57)",
        "(line 1208,col 9)-(line 1210,col 58)",
        "(line 1211,col 9)-(line 1213,col 58)",
        "(line 1214,col 9)-(line 1216,col 64)",
        "(line 1217,col 9)-(line 1219,col 64)",
        "(line 1220,col 9)-(line 1222,col 57)",
        "(line 1223,col 9)-(line 1225,col 57)",
        "(line 1226,col 9)-(line 1228,col 57)",
        "(line 1229,col 9)-(line 1231,col 57)",
        "(line 1232,col 9)-(line 1234,col 59)",
        "(line 1235,col 9)-(line 1237,col 59)",
        "(line 1238,col 9)-(line 1240,col 59)",
        "(line 1241,col 9)-(line 1243,col 59)",
        "(line 1244,col 9)-(line 1246,col 62)",
        "(line 1247,col 9)-(line 1249,col 62)",
        "(line 1250,col 9)-(line 1252,col 62)",
        "(line 1253,col 9)-(line 1255,col 62)",
        "(line 1258,col 9)-(line 1260,col 66)",
        "(line 1261,col 9)-(line 1263,col 66)",
        "(line 1264,col 9)-(line 1266,col 67)",
        "(line 1267,col 9)-(line 1269,col 67)",
        "(line 1270,col 9)-(line 1272,col 73)",
        "(line 1273,col 9)-(line 1275,col 73)",
        "(line 1276,col 9)-(line 1278,col 66)",
        "(line 1279,col 9)-(line 1281,col 66)",
        "(line 1282,col 9)-(line 1284,col 66)",
        "(line 1285,col 9)-(line 1287,col 66)",
        "(line 1288,col 9)-(line 1290,col 68)",
        "(line 1291,col 9)-(line 1293,col 68)",
        "(line 1294,col 9)-(line 1296,col 68)",
        "(line 1297,col 9)-(line 1299,col 68)",
        "(line 1300,col 9)-(line 1302,col 71)",
        "(line 1303,col 9)-(line 1305,col 71)",
        "(line 1306,col 9)-(line 1308,col 71)",
        "(line 1309,col 9)-(line 1311,col 71)",
        "(line 1313,col 9)-(line 1315,col 67)",
        "(line 1316,col 9)-(line 1318,col 67)",
        "(line 1320,col 9)-(line 1322,col 70)",
        "(line 1323,col 9)-(line 1325,col 70)",
        "(line 1326,col 9)-(line 1328,col 70)",
        "(line 1329,col 9)-(line 1331,col 70)",
        "(line 1333,col 9)-(line 1336,col 48)",
        "(line 1337,col 9)-(line 1340,col 48)",
        "(line 1341,col 9)-(line 1344,col 48)",
        "(line 1345,col 9)-(line 1348,col 42)",
        "(line 1349,col 9)-(line 1352,col 47)",
        "(line 1357,col 9)-(line 1357,col 34)",
        "(line 1358,col 9)-(line 1358,col 41)",
        "(line 1360,col 9)-(line 1362,col 57)",
        "(line 1363,col 9)-(line 1365,col 65)",
        "(line 1366,col 9)-(line 1368,col 57)",
        "(line 1369,col 9)-(line 1371,col 65)",
        "(line 1372,col 9)-(line 1374,col 57)",
        "(line 1375,col 9)-(line 1377,col 65)",
        "(line 1378,col 9)-(line 1380,col 57)",
        "(line 1381,col 9)-(line 1383,col 65)",
        "(line 1385,col 9)-(line 1387,col 64)",
        "(line 1388,col 9)-(line 1390,col 72)",
        "(line 1391,col 9)-(line 1412,col 9)",
        "(line 1413,col 9)-(line 1413,col 41)",
        "(line 1414,col 9)-(line 1414,col 48)",
        "(line 1417,col 9)-(line 1417,col 50)",
        "(line 1418,col 9)-(line 1418,col 59)",
        "(line 1419,col 9)-(line 1419,col 34)",
        "(line 1420,col 9)-(line 1423,col 43)",
        "(line 1424,col 9)-(line 1424,col 45)",
        "(line 1425,col 9)-(line 1428,col 43)",
        "(line 1429,col 9)-(line 1429,col 45)",
        "(line 1430,col 9)-(line 1430,col 64)",
        "(line 1431,col 9)-(line 1431,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 1437,
      "end_line": 1457,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1440,col 48)",
        "(line 1441,col 9)-(line 1444,col 48)",
        "(line 1445,col 9)-(line 1448,col 48)",
        "(line 1449,col 9)-(line 1452,col 48)",
        "(line 1453,col 9)-(line 1456,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 1462,
      "end_line": 1503,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 1463,col 9)-(line 1463,col 46)",
        "(line 1464,col 9)-(line 1502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1508,
      "end_line": 1528,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1509,col 9)-(line 1509,col 81)",
        "(line 1510,col 9)-(line 1512,col 51)",
        "(line 1514,col 9)-(line 1514,col 69)",
        "(line 1515,col 9)-(line 1517,col 51)",
        "(line 1519,col 9)-(line 1519,col 69)",
        "(line 1520,col 9)-(line 1522,col 54)",
        "(line 1524,col 9)-(line 1524,col 69)",
        "(line 1525,col 9)-(line 1527,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar)",
      "begin_line": 1534,
      "end_line": 1539,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1535,col 48)",
        "(line 1536,col 9)-(line 1536,col 34)",
        "(line 1538,col 9)-(line 1538,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Date, java.util.Date)",
      "begin_line": 1544,
      "end_line": 1551,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1545,col 9)-(line 1545,col 51)",
        "(line 1546,col 9)-(line 1546,col 32)",
        "(line 1547,col 9)-(line 1547,col 49)",
        "(line 1548,col 9)-(line 1548,col 28)",
        "(line 1550,col 9)-(line 1550,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1558,
      "end_line": 1579,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1559,col 9)-(line 1559,col 44)",
        "(line 1560,col 9)-(line 1560,col 40)",
        "(line 1561,col 9)-(line 1561,col 29)",
        "(line 1562,col 9)-(line 1562,col 22)",
        "(line 1563,col 9)-(line 1574,col 9)",
        "(line 1575,col 9)-(line 1577,col 9)",
        "(line 1578,col 9)-(line 1578,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1585,
      "end_line": 1590,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1586,col 9)-(line 1589,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1592,
      "end_line": 1594,
      "comment": "",
      "child_ranges": [
        "(line 1593,col 9)-(line 1593,col 32)"
      ]
    }
  ]
}