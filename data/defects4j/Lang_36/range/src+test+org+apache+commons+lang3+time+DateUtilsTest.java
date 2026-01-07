{
  "filepath": "/tmp/Lang-36b/src/test/org/apache/commons/lang3/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 43,
      "end_line": 1549,
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddYears()",
      "begin_line": 277,
      "end_line": 293,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 42)",
        "(line 279,col 9)-(line 279,col 50)",
        "(line 280,col 9)-(line 280,col 36)",
        "(line 281,col 9)-(line 281,col 49)",
        "(line 282,col 9)-(line 282,col 51)",
        "(line 284,col 9)-(line 284,col 45)",
        "(line 285,col 9)-(line 285,col 36)",
        "(line 286,col 9)-(line 286,col 49)",
        "(line 287,col 9)-(line 287,col 51)",
        "(line 289,col 9)-(line 289,col 46)",
        "(line 290,col 9)-(line 290,col 36)",
        "(line 291,col 9)-(line 291,col 49)",
        "(line 292,col 9)-(line 292,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMonths()",
      "begin_line": 296,
      "end_line": 312,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 42)",
        "(line 298,col 9)-(line 298,col 51)",
        "(line 299,col 9)-(line 299,col 36)",
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 301,col 51)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 304,col 9)-(line 304,col 36)",
        "(line 305,col 9)-(line 305,col 49)",
        "(line 306,col 9)-(line 306,col 51)",
        "(line 308,col 9)-(line 308,col 47)",
        "(line 309,col 9)-(line 309,col 36)",
        "(line 310,col 9)-(line 310,col 49)",
        "(line 311,col 9)-(line 311,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddWeeks()",
      "begin_line": 315,
      "end_line": 331,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 42)",
        "(line 317,col 9)-(line 317,col 50)",
        "(line 318,col 9)-(line 318,col 36)",
        "(line 319,col 9)-(line 319,col 49)",
        "(line 320,col 9)-(line 320,col 51)",
        "(line 322,col 9)-(line 322,col 45)",
        "(line 323,col 9)-(line 323,col 36)",
        "(line 324,col 9)-(line 324,col 49)",
        "(line 325,col 9)-(line 325,col 52)",
        "(line 327,col 9)-(line 327,col 46)",
        "(line 328,col 9)-(line 328,col 36)",
        "(line 329,col 9)-(line 329,col 49)",
        "(line 330,col 9)-(line 330,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddDays()",
      "begin_line": 334,
      "end_line": 350,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 42)",
        "(line 336,col 9)-(line 336,col 49)",
        "(line 337,col 9)-(line 337,col 36)",
        "(line 338,col 9)-(line 338,col 49)",
        "(line 339,col 9)-(line 339,col 51)",
        "(line 341,col 9)-(line 341,col 44)",
        "(line 342,col 9)-(line 342,col 36)",
        "(line 343,col 9)-(line 343,col 49)",
        "(line 344,col 9)-(line 344,col 51)",
        "(line 346,col 9)-(line 346,col 45)",
        "(line 347,col 9)-(line 347,col 36)",
        "(line 348,col 9)-(line 348,col 49)",
        "(line 349,col 9)-(line 349,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddHours()",
      "begin_line": 353,
      "end_line": 369,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 42)",
        "(line 355,col 9)-(line 355,col 50)",
        "(line 356,col 9)-(line 356,col 36)",
        "(line 357,col 9)-(line 357,col 49)",
        "(line 358,col 9)-(line 358,col 51)",
        "(line 360,col 9)-(line 360,col 45)",
        "(line 361,col 9)-(line 361,col 36)",
        "(line 362,col 9)-(line 362,col 49)",
        "(line 363,col 9)-(line 363,col 51)",
        "(line 365,col 9)-(line 365,col 46)",
        "(line 366,col 9)-(line 366,col 36)",
        "(line 367,col 9)-(line 367,col 49)",
        "(line 368,col 9)-(line 368,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMinutes()",
      "begin_line": 372,
      "end_line": 388,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 42)",
        "(line 374,col 9)-(line 374,col 52)",
        "(line 375,col 9)-(line 375,col 36)",
        "(line 376,col 9)-(line 376,col 49)",
        "(line 377,col 9)-(line 377,col 51)",
        "(line 379,col 9)-(line 379,col 47)",
        "(line 380,col 9)-(line 380,col 36)",
        "(line 381,col 9)-(line 381,col 49)",
        "(line 382,col 9)-(line 382,col 51)",
        "(line 384,col 9)-(line 384,col 48)",
        "(line 385,col 9)-(line 385,col 36)",
        "(line 386,col 9)-(line 386,col 49)",
        "(line 387,col 9)-(line 387,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddSeconds()",
      "begin_line": 391,
      "end_line": 407,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 42)",
        "(line 393,col 9)-(line 393,col 52)",
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 395,col 49)",
        "(line 396,col 9)-(line 396,col 51)",
        "(line 398,col 9)-(line 398,col 47)",
        "(line 399,col 9)-(line 399,col 36)",
        "(line 400,col 9)-(line 400,col 49)",
        "(line 401,col 9)-(line 401,col 51)",
        "(line 403,col 9)-(line 403,col 48)",
        "(line 404,col 9)-(line 404,col 36)",
        "(line 405,col 9)-(line 405,col 49)",
        "(line 406,col 9)-(line 406,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMilliseconds()",
      "begin_line": 410,
      "end_line": 426,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 42)",
        "(line 412,col 9)-(line 412,col 57)",
        "(line 413,col 9)-(line 413,col 36)",
        "(line 414,col 9)-(line 414,col 49)",
        "(line 415,col 9)-(line 415,col 51)",
        "(line 417,col 9)-(line 417,col 52)",
        "(line 418,col 9)-(line 418,col 36)",
        "(line 419,col 9)-(line 419,col 49)",
        "(line 420,col 9)-(line 420,col 51)",
        "(line 422,col 9)-(line 422,col 53)",
        "(line 423,col 9)-(line 423,col 36)",
        "(line 424,col 9)-(line 424,col 49)",
        "(line 425,col 9)-(line 425,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetYears()",
      "begin_line": 429,
      "end_line": 445,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 42)",
        "(line 431,col 9)-(line 431,col 53)",
        "(line 432,col 9)-(line 432,col 36)",
        "(line 433,col 9)-(line 433,col 49)",
        "(line 434,col 9)-(line 434,col 51)",
        "(line 436,col 9)-(line 436,col 48)",
        "(line 437,col 9)-(line 437,col 36)",
        "(line 438,col 9)-(line 438,col 49)",
        "(line 439,col 9)-(line 439,col 51)",
        "(line 441,col 9)-(line 441,col 48)",
        "(line 442,col 9)-(line 442,col 36)",
        "(line 443,col 9)-(line 443,col 49)",
        "(line 444,col 9)-(line 444,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMonths()",
      "begin_line": 448,
      "end_line": 466,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 42)",
        "(line 450,col 9)-(line 450,col 51)",
        "(line 451,col 9)-(line 451,col 36)",
        "(line 452,col 9)-(line 452,col 49)",
        "(line 453,col 9)-(line 453,col 51)",
        "(line 455,col 9)-(line 455,col 46)",
        "(line 456,col 9)-(line 456,col 36)",
        "(line 457,col 9)-(line 457,col 49)",
        "(line 458,col 9)-(line 458,col 51)",
        "(line 460,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetDays()",
      "begin_line": 469,
      "end_line": 487,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 42)",
        "(line 471,col 9)-(line 471,col 49)",
        "(line 472,col 9)-(line 472,col 36)",
        "(line 473,col 9)-(line 473,col 49)",
        "(line 474,col 9)-(line 474,col 51)",
        "(line 476,col 9)-(line 476,col 45)",
        "(line 477,col 9)-(line 477,col 36)",
        "(line 478,col 9)-(line 478,col 49)",
        "(line 479,col 9)-(line 479,col 52)",
        "(line 481,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetHours()",
      "begin_line": 490,
      "end_line": 508,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 42)",
        "(line 492,col 9)-(line 492,col 50)",
        "(line 493,col 9)-(line 493,col 36)",
        "(line 494,col 9)-(line 494,col 49)",
        "(line 495,col 9)-(line 495,col 51)",
        "(line 497,col 9)-(line 497,col 46)",
        "(line 498,col 9)-(line 498,col 36)",
        "(line 499,col 9)-(line 499,col 49)",
        "(line 500,col 9)-(line 500,col 52)",
        "(line 502,col 9)-(line 507,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMinutes()",
      "begin_line": 511,
      "end_line": 529,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 42)",
        "(line 513,col 9)-(line 513,col 52)",
        "(line 514,col 9)-(line 514,col 36)",
        "(line 515,col 9)-(line 515,col 49)",
        "(line 516,col 9)-(line 516,col 51)",
        "(line 518,col 9)-(line 518,col 48)",
        "(line 519,col 9)-(line 519,col 36)",
        "(line 520,col 9)-(line 520,col 49)",
        "(line 521,col 9)-(line 521,col 52)",
        "(line 523,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetSeconds()",
      "begin_line": 532,
      "end_line": 550,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 42)",
        "(line 534,col 9)-(line 534,col 52)",
        "(line 535,col 9)-(line 535,col 36)",
        "(line 536,col 9)-(line 536,col 49)",
        "(line 537,col 9)-(line 537,col 51)",
        "(line 539,col 9)-(line 539,col 48)",
        "(line 540,col 9)-(line 540,col 36)",
        "(line 541,col 9)-(line 541,col 49)",
        "(line 542,col 9)-(line 542,col 52)",
        "(line 544,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMilliseconds()",
      "begin_line": 553,
      "end_line": 571,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 42)",
        "(line 555,col 9)-(line 555,col 57)",
        "(line 556,col 9)-(line 556,col 36)",
        "(line 557,col 9)-(line 557,col 49)",
        "(line 558,col 9)-(line 558,col 51)",
        "(line 560,col 9)-(line 560,col 54)",
        "(line 561,col 9)-(line 561,col 36)",
        "(line 562,col 9)-(line 562,col 49)",
        "(line 563,col 9)-(line 563,col 53)",
        "(line 565,col 9)-(line 570,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertDate(java.util.Date, int, int, int, int, int, int, int)",
      "begin_line": 574,
      "end_line": 584,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 56)",
        "(line 576,col 9)-(line 576,col 26)",
        "(line 577,col 9)-(line 577,col 51)",
        "(line 578,col 9)-(line 578,col 53)",
        "(line 579,col 9)-(line 579,col 58)",
        "(line 580,col 9)-(line 580,col 58)",
        "(line 581,col 9)-(line 581,col 52)",
        "(line 582,col 9)-(line 582,col 52)",
        "(line 583,col 9)-(line 583,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRound()",
      "begin_line": 590,
      "end_line": 807,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 594,col 55)",
        "(line 595,col 9)-(line 597,col 55)",
        "(line 598,col 9)-(line 600,col 56)",
        "(line 601,col 9)-(line 603,col 56)",
        "(line 604,col 9)-(line 606,col 62)",
        "(line 607,col 9)-(line 609,col 62)",
        "(line 610,col 9)-(line 612,col 62)",
        "(line 615,col 9)-(line 617,col 55)",
        "(line 618,col 9)-(line 620,col 55)",
        "(line 621,col 9)-(line 623,col 55)",
        "(line 624,col 9)-(line 626,col 55)",
        "(line 627,col 9)-(line 629,col 57)",
        "(line 630,col 9)-(line 632,col 57)",
        "(line 633,col 9)-(line 635,col 57)",
        "(line 636,col 9)-(line 638,col 57)",
        "(line 639,col 9)-(line 641,col 60)",
        "(line 642,col 9)-(line 644,col 60)",
        "(line 645,col 9)-(line 647,col 60)",
        "(line 648,col 9)-(line 650,col 60)",
        "(line 653,col 9)-(line 655,col 64)",
        "(line 656,col 9)-(line 658,col 64)",
        "(line 659,col 9)-(line 661,col 65)",
        "(line 662,col 9)-(line 664,col 65)",
        "(line 665,col 9)-(line 667,col 71)",
        "(line 668,col 9)-(line 670,col 71)",
        "(line 671,col 9)-(line 673,col 64)",
        "(line 674,col 9)-(line 676,col 64)",
        "(line 677,col 9)-(line 679,col 64)",
        "(line 680,col 9)-(line 682,col 64)",
        "(line 683,col 9)-(line 685,col 66)",
        "(line 686,col 9)-(line 688,col 66)",
        "(line 689,col 9)-(line 691,col 66)",
        "(line 692,col 9)-(line 694,col 66)",
        "(line 695,col 9)-(line 697,col 65)",
        "(line 698,col 9)-(line 700,col 65)",
        "(line 701,col 9)-(line 703,col 69)",
        "(line 704,col 9)-(line 706,col 69)",
        "(line 707,col 9)-(line 709,col 69)",
        "(line 710,col 9)-(line 712,col 69)",
        "(line 714,col 9)-(line 717,col 48)",
        "(line 718,col 9)-(line 721,col 48)",
        "(line 722,col 9)-(line 725,col 48)",
        "(line 726,col 9)-(line 729,col 42)",
        "(line 730,col 9)-(line 733,col 47)",
        "(line 735,col 9)-(line 737,col 68)",
        "(line 738,col 9)-(line 740,col 68)",
        "(line 741,col 9)-(line 743,col 68)",
        "(line 744,col 9)-(line 746,col 68)",
        "(line 750,col 9)-(line 750,col 34)",
        "(line 751,col 9)-(line 751,col 41)",
        "(line 752,col 9)-(line 754,col 55)",
        "(line 755,col 9)-(line 757,col 63)",
        "(line 758,col 9)-(line 760,col 55)",
        "(line 761,col 9)-(line 763,col 63)",
        "(line 764,col 9)-(line 766,col 55)",
        "(line 767,col 9)-(line 769,col 63)",
        "(line 770,col 9)-(line 772,col 55)",
        "(line 773,col 9)-(line 775,col 63)",
        "(line 777,col 9)-(line 779,col 62)",
        "(line 780,col 9)-(line 782,col 70)",
        "(line 783,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 41)",
        "(line 806,col 9)-(line 806,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRoundLang346()",
      "begin_line": 813,
      "end_line": 870,
      "comment": "\n     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked\n     * by DateUtils.round().\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 41)",
        "(line 816,col 9)-(line 816,col 48)",
        "(line 817,col 9)-(line 817,col 55)",
        "(line 818,col 9)-(line 818,col 47)",
        "(line 819,col 9)-(line 819,col 43)",
        "(line 820,col 9)-(line 822,col 61)",
        "(line 824,col 9)-(line 824,col 47)",
        "(line 825,col 9)-(line 825,col 38)",
        "(line 826,col 9)-(line 828,col 61)",
        "(line 830,col 9)-(line 830,col 47)",
        "(line 831,col 9)-(line 831,col 52)",
        "(line 832,col 9)-(line 832,col 38)",
        "(line 834,col 9)-(line 836,col 61)",
        "(line 838,col 9)-(line 838,col 47)",
        "(line 839,col 9)-(line 839,col 52)",
        "(line 840,col 9)-(line 840,col 38)",
        "(line 841,col 9)-(line 843,col 61)",
        "(line 845,col 9)-(line 845,col 47)",
        "(line 846,col 9)-(line 846,col 52)",
        "(line 847,col 9)-(line 847,col 38)",
        "(line 848,col 9)-(line 850,col 61)",
        "(line 852,col 9)-(line 852,col 47)",
        "(line 853,col 9)-(line 853,col 52)",
        "(line 854,col 9)-(line 854,col 38)",
        "(line 855,col 9)-(line 857,col 61)",
        "(line 859,col 9)-(line 859,col 47)",
        "(line 860,col 9)-(line 860,col 38)",
        "(line 861,col 9)-(line 863,col 59)",
        "(line 865,col 9)-(line 865,col 48)",
        "(line 866,col 9)-(line 866,col 38)",
        "(line 867,col 9)-(line 869,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncate()",
      "begin_line": 875,
      "end_line": 1061,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 879,col 58)",
        "(line 880,col 9)-(line 882,col 58)",
        "(line 883,col 9)-(line 885,col 59)",
        "(line 886,col 9)-(line 888,col 59)",
        "(line 889,col 9)-(line 891,col 65)",
        "(line 892,col 9)-(line 894,col 65)",
        "(line 895,col 9)-(line 897,col 58)",
        "(line 898,col 9)-(line 900,col 58)",
        "(line 901,col 9)-(line 903,col 58)",
        "(line 904,col 9)-(line 906,col 58)",
        "(line 907,col 9)-(line 909,col 60)",
        "(line 910,col 9)-(line 912,col 60)",
        "(line 913,col 9)-(line 915,col 60)",
        "(line 916,col 9)-(line 918,col 60)",
        "(line 919,col 9)-(line 921,col 63)",
        "(line 922,col 9)-(line 924,col 63)",
        "(line 925,col 9)-(line 927,col 63)",
        "(line 928,col 9)-(line 930,col 63)",
        "(line 933,col 9)-(line 935,col 67)",
        "(line 936,col 9)-(line 938,col 67)",
        "(line 939,col 9)-(line 941,col 68)",
        "(line 942,col 9)-(line 944,col 68)",
        "(line 945,col 9)-(line 947,col 74)",
        "(line 948,col 9)-(line 950,col 74)",
        "(line 951,col 9)-(line 953,col 67)",
        "(line 954,col 9)-(line 956,col 67)",
        "(line 957,col 9)-(line 959,col 67)",
        "(line 960,col 9)-(line 962,col 67)",
        "(line 963,col 9)-(line 965,col 69)",
        "(line 966,col 9)-(line 968,col 69)",
        "(line 969,col 9)-(line 971,col 69)",
        "(line 972,col 9)-(line 974,col 69)",
        "(line 975,col 9)-(line 977,col 72)",
        "(line 978,col 9)-(line 980,col 72)",
        "(line 981,col 9)-(line 983,col 72)",
        "(line 984,col 9)-(line 986,col 72)",
        "(line 988,col 9)-(line 990,col 68)",
        "(line 991,col 9)-(line 993,col 68)",
        "(line 995,col 9)-(line 997,col 71)",
        "(line 998,col 9)-(line 1000,col 71)",
        "(line 1001,col 9)-(line 1003,col 71)",
        "(line 1004,col 9)-(line 1006,col 71)",
        "(line 1008,col 9)-(line 1011,col 48)",
        "(line 1012,col 9)-(line 1015,col 48)",
        "(line 1016,col 9)-(line 1019,col 48)",
        "(line 1020,col 9)-(line 1023,col 42)",
        "(line 1027,col 9)-(line 1027,col 34)",
        "(line 1028,col 9)-(line 1028,col 41)",
        "(line 1029,col 9)-(line 1031,col 58)",
        "(line 1032,col 9)-(line 1034,col 66)",
        "(line 1036,col 9)-(line 1038,col 58)",
        "(line 1039,col 9)-(line 1041,col 66)",
        "(line 1042,col 9)-(line 1042,col 41)",
        "(line 1043,col 9)-(line 1043,col 48)",
        "(line 1046,col 9)-(line 1046,col 50)",
        "(line 1047,col 9)-(line 1047,col 59)",
        "(line 1048,col 9)-(line 1048,col 34)",
        "(line 1049,col 9)-(line 1052,col 43)",
        "(line 1053,col 9)-(line 1053,col 45)",
        "(line 1054,col 9)-(line 1057,col 43)",
        "(line 1058,col 9)-(line 1058,col 45)",
        "(line 1059,col 9)-(line 1059,col 65)",
        "(line 1060,col 9)-(line 1060,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 1068,
      "end_line": 1140,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 1069,col 9)-(line 1072,col 9)",
        "(line 1075,col 9)-(line 1075,col 59)",
        "(line 1076,col 9)-(line 1076,col 37)",
        "(line 1077,col 9)-(line 1077,col 78)",
        "(line 1078,col 9)-(line 1078,col 36)",
        "(line 1080,col 9)-(line 1080,col 52)",
        "(line 1082,col 9)-(line 1082,col 85)",
        "(line 1083,col 9)-(line 1083,col 84)",
        "(line 1084,col 9)-(line 1084,col 82)",
        "(line 1085,col 9)-(line 1085,col 79)",
        "(line 1087,col 9)-(line 1087,col 99)",
        "(line 1088,col 9)-(line 1088,col 102)",
        "(line 1089,col 9)-(line 1089,col 105)",
        "(line 1090,col 9)-(line 1090,col 108)",
        "(line 1091,col 9)-(line 1091,col 111)",
        "(line 1094,col 9)-(line 1094,col 47)",
        "(line 1095,col 9)-(line 1095,col 54)",
        "(line 1096,col 9)-(line 1096,col 61)",
        "(line 1097,col 9)-(line 1097,col 104)",
        "(line 1100,col 9)-(line 1101,col 102)",
        "(line 1103,col 9)-(line 1104,col 97)",
        "(line 1106,col 9)-(line 1107,col 97)",
        "(line 1109,col 9)-(line 1110,col 102)",
        "(line 1112,col 9)-(line 1113,col 95)",
        "(line 1115,col 9)-(line 1116,col 95)",
        "(line 1120,col 9)-(line 1121,col 99)",
        "(line 1123,col 9)-(line 1124,col 94)",
        "(line 1126,col 9)-(line 1127,col 94)",
        "(line 1129,col 9)-(line 1130,col 99)",
        "(line 1132,col 9)-(line 1133,col 92)",
        "(line 1135,col 9)-(line 1136,col 92)",
        "(line 1139,col 9)-(line 1139,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testLang520()",
      "begin_line": 1143,
      "end_line": 1149,
      "comment": " http://issues.apache.org/jira/browse/LANG-520",
      "child_ranges": [
        "(line 1144,col 9)-(line 1144,col 28)",
        "(line 1145,col 9)-(line 1145,col 84)",
        "(line 1146,col 9)-(line 1146,col 127)",
        "(line 1148,col 9)-(line 1148,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testCeil()",
      "begin_line": 1154,
      "end_line": 1386,
      "comment": "\n     * Tests various values with the ceiling method\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1158,col 57)",
        "(line 1159,col 9)-(line 1161,col 57)",
        "(line 1162,col 9)-(line 1164,col 58)",
        "(line 1165,col 9)-(line 1167,col 58)",
        "(line 1168,col 9)-(line 1170,col 64)",
        "(line 1171,col 9)-(line 1173,col 64)",
        "(line 1174,col 9)-(line 1176,col 57)",
        "(line 1177,col 9)-(line 1179,col 57)",
        "(line 1180,col 9)-(line 1182,col 57)",
        "(line 1183,col 9)-(line 1185,col 57)",
        "(line 1186,col 9)-(line 1188,col 59)",
        "(line 1189,col 9)-(line 1191,col 59)",
        "(line 1192,col 9)-(line 1194,col 59)",
        "(line 1195,col 9)-(line 1197,col 59)",
        "(line 1198,col 9)-(line 1200,col 62)",
        "(line 1201,col 9)-(line 1203,col 62)",
        "(line 1204,col 9)-(line 1206,col 62)",
        "(line 1207,col 9)-(line 1209,col 62)",
        "(line 1212,col 9)-(line 1214,col 66)",
        "(line 1215,col 9)-(line 1217,col 66)",
        "(line 1218,col 9)-(line 1220,col 67)",
        "(line 1221,col 9)-(line 1223,col 67)",
        "(line 1224,col 9)-(line 1226,col 73)",
        "(line 1227,col 9)-(line 1229,col 73)",
        "(line 1230,col 9)-(line 1232,col 66)",
        "(line 1233,col 9)-(line 1235,col 66)",
        "(line 1236,col 9)-(line 1238,col 66)",
        "(line 1239,col 9)-(line 1241,col 66)",
        "(line 1242,col 9)-(line 1244,col 68)",
        "(line 1245,col 9)-(line 1247,col 68)",
        "(line 1248,col 9)-(line 1250,col 68)",
        "(line 1251,col 9)-(line 1253,col 68)",
        "(line 1254,col 9)-(line 1256,col 71)",
        "(line 1257,col 9)-(line 1259,col 71)",
        "(line 1260,col 9)-(line 1262,col 71)",
        "(line 1263,col 9)-(line 1265,col 71)",
        "(line 1267,col 9)-(line 1269,col 67)",
        "(line 1270,col 9)-(line 1272,col 67)",
        "(line 1274,col 9)-(line 1276,col 70)",
        "(line 1277,col 9)-(line 1279,col 70)",
        "(line 1280,col 9)-(line 1282,col 70)",
        "(line 1283,col 9)-(line 1285,col 70)",
        "(line 1287,col 9)-(line 1290,col 48)",
        "(line 1291,col 9)-(line 1294,col 48)",
        "(line 1295,col 9)-(line 1298,col 48)",
        "(line 1299,col 9)-(line 1302,col 42)",
        "(line 1303,col 9)-(line 1306,col 47)",
        "(line 1311,col 9)-(line 1311,col 34)",
        "(line 1312,col 9)-(line 1312,col 41)",
        "(line 1314,col 9)-(line 1316,col 57)",
        "(line 1317,col 9)-(line 1319,col 65)",
        "(line 1320,col 9)-(line 1322,col 57)",
        "(line 1323,col 9)-(line 1325,col 65)",
        "(line 1326,col 9)-(line 1328,col 57)",
        "(line 1329,col 9)-(line 1331,col 65)",
        "(line 1332,col 9)-(line 1334,col 57)",
        "(line 1335,col 9)-(line 1337,col 65)",
        "(line 1339,col 9)-(line 1341,col 64)",
        "(line 1342,col 9)-(line 1344,col 72)",
        "(line 1345,col 9)-(line 1366,col 9)",
        "(line 1367,col 9)-(line 1367,col 41)",
        "(line 1368,col 9)-(line 1368,col 48)",
        "(line 1371,col 9)-(line 1371,col 50)",
        "(line 1372,col 9)-(line 1372,col 59)",
        "(line 1373,col 9)-(line 1373,col 34)",
        "(line 1374,col 9)-(line 1377,col 43)",
        "(line 1378,col 9)-(line 1378,col 45)",
        "(line 1379,col 9)-(line 1382,col 43)",
        "(line 1383,col 9)-(line 1383,col 45)",
        "(line 1384,col 9)-(line 1384,col 64)",
        "(line 1385,col 9)-(line 1385,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 1391,
      "end_line": 1411,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 1392,col 9)-(line 1394,col 48)",
        "(line 1395,col 9)-(line 1398,col 48)",
        "(line 1399,col 9)-(line 1402,col 48)",
        "(line 1403,col 9)-(line 1406,col 48)",
        "(line 1407,col 9)-(line 1410,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 1416,
      "end_line": 1457,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 1417,col 9)-(line 1417,col 46)",
        "(line 1418,col 9)-(line 1456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1462,
      "end_line": 1482,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1463,col 9)-(line 1463,col 81)",
        "(line 1464,col 9)-(line 1466,col 51)",
        "(line 1468,col 9)-(line 1468,col 69)",
        "(line 1469,col 9)-(line 1471,col 51)",
        "(line 1473,col 9)-(line 1473,col 69)",
        "(line 1474,col 9)-(line 1476,col 54)",
        "(line 1478,col 9)-(line 1478,col 69)",
        "(line 1479,col 9)-(line 1481,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar)",
      "begin_line": 1488,
      "end_line": 1493,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1489,col 9)-(line 1489,col 48)",
        "(line 1490,col 9)-(line 1490,col 34)",
        "(line 1492,col 9)-(line 1492,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Date, java.util.Date)",
      "begin_line": 1498,
      "end_line": 1505,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1499,col 9)-(line 1499,col 51)",
        "(line 1500,col 9)-(line 1500,col 32)",
        "(line 1501,col 9)-(line 1501,col 49)",
        "(line 1502,col 9)-(line 1502,col 28)",
        "(line 1504,col 9)-(line 1504,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1512,
      "end_line": 1533,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1513,col 9)-(line 1513,col 44)",
        "(line 1514,col 9)-(line 1514,col 40)",
        "(line 1515,col 9)-(line 1515,col 29)",
        "(line 1516,col 9)-(line 1516,col 22)",
        "(line 1517,col 9)-(line 1528,col 9)",
        "(line 1529,col 9)-(line 1531,col 9)",
        "(line 1532,col 9)-(line 1532,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1539,
      "end_line": 1544,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1540,col 9)-(line 1543,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1546,
      "end_line": 1548,
      "comment": "",
      "child_ranges": [
        "(line 1547,col 9)-(line 1547,col 32)"
      ]
    }
  ]
}