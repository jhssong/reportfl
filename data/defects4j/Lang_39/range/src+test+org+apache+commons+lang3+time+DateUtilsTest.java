{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 1558,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.time.DateUtils}.\n *\n * @author \u003ca href\u003d\"mailto:sergek@lokitech.com\"\u003eSerge Knystautas\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:steve@mungoknotwise.com\"\u003eSteven Caswell\u003c/a\u003e\n "
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.DateUtilsTest(java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.main(java.lang.String[])",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.suite()",
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
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.setUp()",
      "begin_line": 100,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 22)",
        "(line 104,col 9)-(line 104,col 74)",
        "(line 105,col 9)-(line 105,col 90)",
        "(line 107,col 9)-(line 107,col 74)",
        "(line 108,col 9)-(line 108,col 74)",
        "(line 109,col 9)-(line 109,col 74)",
        "(line 110,col 9)-(line 110,col 74)",
        "(line 111,col 9)-(line 111,col 70)",
        "(line 112,col 9)-(line 112,col 71)",
        "(line 113,col 9)-(line 113,col 70)",
        "(line 114,col 9)-(line 114,col 44)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 41)",
        "(line 118,col 9)-(line 118,col 68)",
        "(line 119,col 9)-(line 119,col 68)",
        "(line 120,col 9)-(line 120,col 68)",
        "(line 121,col 9)-(line 121,col 68)",
        "(line 122,col 9)-(line 122,col 68)",
        "(line 123,col 9)-(line 123,col 70)",
        "(line 124,col 9)-(line 124,col 48)",
        "(line 125,col 9)-(line 125,col 41)",
        "(line 126,col 9)-(line 126,col 42)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 130,col 42)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 135,col 28)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 137,col 9)-(line 137,col 28)",
        "(line 138,col 9)-(line 138,col 34)",
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
        "(line 149,col 9)-(line 149,col 38)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 151,col 9)-(line 151,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.tearDown()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testConstructor()",
      "begin_line": 160,
      "end_line": 167,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 39)",
        "(line 162,col 9)-(line 162,col 74)",
        "(line 163,col 9)-(line 163,col 37)",
        "(line 164,col 9)-(line 164,col 70)",
        "(line 165,col 9)-(line 165,col 78)",
        "(line 166,col 9)-(line 166,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Date()",
      "begin_line": 170,
      "end_line": 184,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 73)",
        "(line 172,col 9)-(line 172,col 73)",
        "(line 173,col 9)-(line 173,col 62)",
        "(line 174,col 9)-(line 174,col 69)",
        "(line 175,col 9)-(line 175,col 63)",
        "(line 176,col 9)-(line 176,col 69)",
        "(line 177,col 9)-(line 177,col 62)",
        "(line 178,col 9)-(line 178,col 69)",
        "(line 179,col 9)-(line 179,col 63)",
        "(line 180,col 9)-(line 183,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Cal()",
      "begin_line": 187,
      "end_line": 201,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 75)",
        "(line 189,col 9)-(line 189,col 75)",
        "(line 190,col 9)-(line 190,col 60)",
        "(line 191,col 9)-(line 191,col 42)",
        "(line 192,col 9)-(line 192,col 61)",
        "(line 193,col 9)-(line 193,col 42)",
        "(line 194,col 9)-(line 194,col 60)",
        "(line 195,col 9)-(line 195,col 35)",
        "(line 196,col 9)-(line 196,col 61)",
        "(line 197,col 9)-(line 200,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Date()",
      "begin_line": 204,
      "end_line": 218,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 73)",
        "(line 206,col 9)-(line 206,col 73)",
        "(line 207,col 9)-(line 207,col 66)",
        "(line 208,col 9)-(line 208,col 69)",
        "(line 209,col 9)-(line 209,col 67)",
        "(line 210,col 9)-(line 210,col 69)",
        "(line 211,col 9)-(line 211,col 66)",
        "(line 212,col 9)-(line 212,col 69)",
        "(line 213,col 9)-(line 213,col 67)",
        "(line 214,col 9)-(line 217,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Cal()",
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
        "(line 228,col 9)-(line 228,col 65)",
        "(line 230,col 9)-(line 230,col 40)",
        "(line 231,col 9)-(line 231,col 64)",
        "(line 232,col 9)-(line 235,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIsSameLocalTime_Cal()",
      "begin_line": 239,
      "end_line": 254,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 86)",
        "(line 241,col 9)-(line 241,col 86)",
        "(line 242,col 9)-(line 242,col 40)",
        "(line 243,col 9)-(line 243,col 42)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 42)",
        "(line 246,col 9)-(line 246,col 66)",
        "(line 248,col 9)-(line 248,col 40)",
        "(line 249,col 9)-(line 249,col 67)",
        "(line 250,col 9)-(line 253,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testParseDate()",
      "begin_line": 257,
      "end_line": 292,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 67)",
        "(line 259,col 9)-(line 259,col 38)",
        "(line 260,col 9)-(line 260,col 85)",
        "(line 261,col 9)-(line 261,col 58)",
        "(line 262,col 9)-(line 262,col 42)",
        "(line 264,col 9)-(line 264,col 29)",
        "(line 265,col 9)-(line 265,col 53)",
        "(line 266,col 9)-(line 266,col 42)",
        "(line 268,col 9)-(line 268,col 29)",
        "(line 269,col 9)-(line 269,col 53)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 272,col 9)-(line 275,col 38)",
        "(line 276,col 9)-(line 279,col 38)",
        "(line 280,col 9)-(line 283,col 48)",
        "(line 284,col 9)-(line 287,col 48)",
        "(line 288,col 9)-(line 291,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddYears()",
      "begin_line": 295,
      "end_line": 311,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 50)",
        "(line 298,col 9)-(line 298,col 36)",
        "(line 299,col 9)-(line 299,col 49)",
        "(line 300,col 9)-(line 300,col 51)",
        "(line 302,col 9)-(line 302,col 45)",
        "(line 303,col 9)-(line 303,col 36)",
        "(line 304,col 9)-(line 304,col 49)",
        "(line 305,col 9)-(line 305,col 51)",
        "(line 307,col 9)-(line 307,col 46)",
        "(line 308,col 9)-(line 308,col 36)",
        "(line 309,col 9)-(line 309,col 49)",
        "(line 310,col 9)-(line 310,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMonths()",
      "begin_line": 314,
      "end_line": 330,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 42)",
        "(line 316,col 9)-(line 316,col 51)",
        "(line 317,col 9)-(line 317,col 36)",
        "(line 318,col 9)-(line 318,col 49)",
        "(line 319,col 9)-(line 319,col 51)",
        "(line 321,col 9)-(line 321,col 46)",
        "(line 322,col 9)-(line 322,col 36)",
        "(line 323,col 9)-(line 323,col 49)",
        "(line 324,col 9)-(line 324,col 51)",
        "(line 326,col 9)-(line 326,col 47)",
        "(line 327,col 9)-(line 327,col 36)",
        "(line 328,col 9)-(line 328,col 49)",
        "(line 329,col 9)-(line 329,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddWeeks()",
      "begin_line": 333,
      "end_line": 349,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 42)",
        "(line 335,col 9)-(line 335,col 50)",
        "(line 336,col 9)-(line 336,col 36)",
        "(line 337,col 9)-(line 337,col 49)",
        "(line 338,col 9)-(line 338,col 51)",
        "(line 340,col 9)-(line 340,col 45)",
        "(line 341,col 9)-(line 341,col 36)",
        "(line 342,col 9)-(line 342,col 49)",
        "(line 343,col 9)-(line 343,col 52)",
        "(line 345,col 9)-(line 345,col 46)",
        "(line 346,col 9)-(line 346,col 36)",
        "(line 347,col 9)-(line 347,col 49)",
        "(line 348,col 9)-(line 348,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddDays()",
      "begin_line": 352,
      "end_line": 368,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 42)",
        "(line 354,col 9)-(line 354,col 49)",
        "(line 355,col 9)-(line 355,col 36)",
        "(line 356,col 9)-(line 356,col 49)",
        "(line 357,col 9)-(line 357,col 51)",
        "(line 359,col 9)-(line 359,col 44)",
        "(line 360,col 9)-(line 360,col 36)",
        "(line 361,col 9)-(line 361,col 49)",
        "(line 362,col 9)-(line 362,col 51)",
        "(line 364,col 9)-(line 364,col 45)",
        "(line 365,col 9)-(line 365,col 36)",
        "(line 366,col 9)-(line 366,col 49)",
        "(line 367,col 9)-(line 367,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddHours()",
      "begin_line": 371,
      "end_line": 387,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 42)",
        "(line 373,col 9)-(line 373,col 50)",
        "(line 374,col 9)-(line 374,col 36)",
        "(line 375,col 9)-(line 375,col 49)",
        "(line 376,col 9)-(line 376,col 51)",
        "(line 378,col 9)-(line 378,col 45)",
        "(line 379,col 9)-(line 379,col 36)",
        "(line 380,col 9)-(line 380,col 49)",
        "(line 381,col 9)-(line 381,col 51)",
        "(line 383,col 9)-(line 383,col 46)",
        "(line 384,col 9)-(line 384,col 36)",
        "(line 385,col 9)-(line 385,col 49)",
        "(line 386,col 9)-(line 386,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMinutes()",
      "begin_line": 390,
      "end_line": 406,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 42)",
        "(line 392,col 9)-(line 392,col 52)",
        "(line 393,col 9)-(line 393,col 36)",
        "(line 394,col 9)-(line 394,col 49)",
        "(line 395,col 9)-(line 395,col 51)",
        "(line 397,col 9)-(line 397,col 47)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 399,col 9)-(line 399,col 49)",
        "(line 400,col 9)-(line 400,col 51)",
        "(line 402,col 9)-(line 402,col 48)",
        "(line 403,col 9)-(line 403,col 36)",
        "(line 404,col 9)-(line 404,col 49)",
        "(line 405,col 9)-(line 405,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddSeconds()",
      "begin_line": 409,
      "end_line": 425,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 42)",
        "(line 411,col 9)-(line 411,col 52)",
        "(line 412,col 9)-(line 412,col 36)",
        "(line 413,col 9)-(line 413,col 49)",
        "(line 414,col 9)-(line 414,col 51)",
        "(line 416,col 9)-(line 416,col 47)",
        "(line 417,col 9)-(line 417,col 36)",
        "(line 418,col 9)-(line 418,col 49)",
        "(line 419,col 9)-(line 419,col 51)",
        "(line 421,col 9)-(line 421,col 48)",
        "(line 422,col 9)-(line 422,col 36)",
        "(line 423,col 9)-(line 423,col 49)",
        "(line 424,col 9)-(line 424,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testAddMilliseconds()",
      "begin_line": 428,
      "end_line": 444,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 42)",
        "(line 430,col 9)-(line 430,col 57)",
        "(line 431,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 432,col 49)",
        "(line 433,col 9)-(line 433,col 51)",
        "(line 435,col 9)-(line 435,col 52)",
        "(line 436,col 9)-(line 436,col 36)",
        "(line 437,col 9)-(line 437,col 49)",
        "(line 438,col 9)-(line 438,col 51)",
        "(line 440,col 9)-(line 440,col 53)",
        "(line 441,col 9)-(line 441,col 36)",
        "(line 442,col 9)-(line 442,col 49)",
        "(line 443,col 9)-(line 443,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetYears()",
      "begin_line": 447,
      "end_line": 463,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 42)",
        "(line 449,col 9)-(line 449,col 53)",
        "(line 450,col 9)-(line 450,col 36)",
        "(line 451,col 9)-(line 451,col 49)",
        "(line 452,col 9)-(line 452,col 51)",
        "(line 454,col 9)-(line 454,col 48)",
        "(line 455,col 9)-(line 455,col 36)",
        "(line 456,col 9)-(line 456,col 49)",
        "(line 457,col 9)-(line 457,col 51)",
        "(line 459,col 9)-(line 459,col 48)",
        "(line 460,col 9)-(line 460,col 36)",
        "(line 461,col 9)-(line 461,col 49)",
        "(line 462,col 9)-(line 462,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMonths()",
      "begin_line": 466,
      "end_line": 484,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 42)",
        "(line 468,col 9)-(line 468,col 51)",
        "(line 469,col 9)-(line 469,col 36)",
        "(line 470,col 9)-(line 470,col 49)",
        "(line 471,col 9)-(line 471,col 51)",
        "(line 473,col 9)-(line 473,col 46)",
        "(line 474,col 9)-(line 474,col 36)",
        "(line 475,col 9)-(line 475,col 49)",
        "(line 476,col 9)-(line 476,col 51)",
        "(line 478,col 9)-(line 483,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetDays()",
      "begin_line": 487,
      "end_line": 505,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 42)",
        "(line 489,col 9)-(line 489,col 49)",
        "(line 490,col 9)-(line 490,col 36)",
        "(line 491,col 9)-(line 491,col 49)",
        "(line 492,col 9)-(line 492,col 51)",
        "(line 494,col 9)-(line 494,col 45)",
        "(line 495,col 9)-(line 495,col 36)",
        "(line 496,col 9)-(line 496,col 49)",
        "(line 497,col 9)-(line 497,col 52)",
        "(line 499,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetHours()",
      "begin_line": 508,
      "end_line": 526,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 42)",
        "(line 510,col 9)-(line 510,col 50)",
        "(line 511,col 9)-(line 511,col 36)",
        "(line 512,col 9)-(line 512,col 49)",
        "(line 513,col 9)-(line 513,col 51)",
        "(line 515,col 9)-(line 515,col 46)",
        "(line 516,col 9)-(line 516,col 36)",
        "(line 517,col 9)-(line 517,col 49)",
        "(line 518,col 9)-(line 518,col 52)",
        "(line 520,col 9)-(line 525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMinutes()",
      "begin_line": 529,
      "end_line": 547,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 42)",
        "(line 531,col 9)-(line 531,col 52)",
        "(line 532,col 9)-(line 532,col 36)",
        "(line 533,col 9)-(line 533,col 49)",
        "(line 534,col 9)-(line 534,col 51)",
        "(line 536,col 9)-(line 536,col 48)",
        "(line 537,col 9)-(line 537,col 36)",
        "(line 538,col 9)-(line 538,col 49)",
        "(line 539,col 9)-(line 539,col 52)",
        "(line 541,col 9)-(line 546,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetSeconds()",
      "begin_line": 550,
      "end_line": 568,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 42)",
        "(line 552,col 9)-(line 552,col 52)",
        "(line 553,col 9)-(line 553,col 36)",
        "(line 554,col 9)-(line 554,col 49)",
        "(line 555,col 9)-(line 555,col 51)",
        "(line 557,col 9)-(line 557,col 48)",
        "(line 558,col 9)-(line 558,col 36)",
        "(line 559,col 9)-(line 559,col 49)",
        "(line 560,col 9)-(line 560,col 52)",
        "(line 562,col 9)-(line 567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testSetMilliseconds()",
      "begin_line": 571,
      "end_line": 589,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 42)",
        "(line 573,col 9)-(line 573,col 57)",
        "(line 574,col 9)-(line 574,col 36)",
        "(line 575,col 9)-(line 575,col 49)",
        "(line 576,col 9)-(line 576,col 51)",
        "(line 578,col 9)-(line 578,col 54)",
        "(line 579,col 9)-(line 579,col 36)",
        "(line 580,col 9)-(line 580,col 49)",
        "(line 581,col 9)-(line 581,col 53)",
        "(line 583,col 9)-(line 588,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertDate(java.util.Date, int, int, int, int, int, int, int)",
      "begin_line": 592,
      "end_line": 602,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 56)",
        "(line 594,col 9)-(line 594,col 26)",
        "(line 595,col 9)-(line 595,col 51)",
        "(line 596,col 9)-(line 596,col 53)",
        "(line 597,col 9)-(line 597,col 58)",
        "(line 598,col 9)-(line 598,col 58)",
        "(line 599,col 9)-(line 599,col 52)",
        "(line 600,col 9)-(line 600,col 52)",
        "(line 601,col 9)-(line 601,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRound()",
      "begin_line": 608,
      "end_line": 825,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 55)",
        "(line 613,col 9)-(line 615,col 55)",
        "(line 616,col 9)-(line 618,col 56)",
        "(line 619,col 9)-(line 621,col 56)",
        "(line 622,col 9)-(line 624,col 62)",
        "(line 625,col 9)-(line 627,col 62)",
        "(line 628,col 9)-(line 630,col 62)",
        "(line 633,col 9)-(line 635,col 55)",
        "(line 636,col 9)-(line 638,col 55)",
        "(line 639,col 9)-(line 641,col 55)",
        "(line 642,col 9)-(line 644,col 55)",
        "(line 645,col 9)-(line 647,col 57)",
        "(line 648,col 9)-(line 650,col 57)",
        "(line 651,col 9)-(line 653,col 57)",
        "(line 654,col 9)-(line 656,col 57)",
        "(line 657,col 9)-(line 659,col 60)",
        "(line 660,col 9)-(line 662,col 60)",
        "(line 663,col 9)-(line 665,col 60)",
        "(line 666,col 9)-(line 668,col 60)",
        "(line 671,col 9)-(line 673,col 64)",
        "(line 674,col 9)-(line 676,col 64)",
        "(line 677,col 9)-(line 679,col 65)",
        "(line 680,col 9)-(line 682,col 65)",
        "(line 683,col 9)-(line 685,col 71)",
        "(line 686,col 9)-(line 688,col 71)",
        "(line 689,col 9)-(line 691,col 64)",
        "(line 692,col 9)-(line 694,col 64)",
        "(line 695,col 9)-(line 697,col 64)",
        "(line 698,col 9)-(line 700,col 64)",
        "(line 701,col 9)-(line 703,col 66)",
        "(line 704,col 9)-(line 706,col 66)",
        "(line 707,col 9)-(line 709,col 66)",
        "(line 710,col 9)-(line 712,col 66)",
        "(line 713,col 9)-(line 715,col 65)",
        "(line 716,col 9)-(line 718,col 65)",
        "(line 719,col 9)-(line 721,col 69)",
        "(line 722,col 9)-(line 724,col 69)",
        "(line 725,col 9)-(line 727,col 69)",
        "(line 728,col 9)-(line 730,col 69)",
        "(line 732,col 9)-(line 735,col 48)",
        "(line 736,col 9)-(line 739,col 48)",
        "(line 740,col 9)-(line 743,col 48)",
        "(line 744,col 9)-(line 747,col 42)",
        "(line 748,col 9)-(line 751,col 47)",
        "(line 753,col 9)-(line 755,col 68)",
        "(line 756,col 9)-(line 758,col 68)",
        "(line 759,col 9)-(line 761,col 68)",
        "(line 762,col 9)-(line 764,col 68)",
        "(line 768,col 9)-(line 768,col 34)",
        "(line 769,col 9)-(line 769,col 41)",
        "(line 770,col 9)-(line 772,col 55)",
        "(line 773,col 9)-(line 775,col 63)",
        "(line 776,col 9)-(line 778,col 55)",
        "(line 779,col 9)-(line 781,col 63)",
        "(line 782,col 9)-(line 784,col 55)",
        "(line 785,col 9)-(line 787,col 63)",
        "(line 788,col 9)-(line 790,col 55)",
        "(line 791,col 9)-(line 793,col 63)",
        "(line 795,col 9)-(line 797,col 62)",
        "(line 798,col 9)-(line 800,col 70)",
        "(line 801,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 41)",
        "(line 824,col 9)-(line 824,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testRoundLang346()",
      "begin_line": 831,
      "end_line": 888,
      "comment": "\n     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked\n     * by DateUtils.round().\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 41)",
        "(line 834,col 9)-(line 834,col 48)",
        "(line 835,col 9)-(line 835,col 55)",
        "(line 836,col 9)-(line 836,col 47)",
        "(line 837,col 9)-(line 837,col 43)",
        "(line 838,col 9)-(line 840,col 61)",
        "(line 842,col 9)-(line 842,col 47)",
        "(line 843,col 9)-(line 843,col 38)",
        "(line 844,col 9)-(line 846,col 61)",
        "(line 848,col 9)-(line 848,col 47)",
        "(line 849,col 9)-(line 849,col 52)",
        "(line 850,col 9)-(line 850,col 38)",
        "(line 852,col 9)-(line 854,col 61)",
        "(line 856,col 9)-(line 856,col 47)",
        "(line 857,col 9)-(line 857,col 52)",
        "(line 858,col 9)-(line 858,col 38)",
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
        "(line 878,col 9)-(line 878,col 38)",
        "(line 879,col 9)-(line 881,col 59)",
        "(line 883,col 9)-(line 883,col 48)",
        "(line 884,col 9)-(line 884,col 38)",
        "(line 885,col 9)-(line 887,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncate()",
      "begin_line": 893,
      "end_line": 1079,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 897,col 58)",
        "(line 898,col 9)-(line 900,col 58)",
        "(line 901,col 9)-(line 903,col 59)",
        "(line 904,col 9)-(line 906,col 59)",
        "(line 907,col 9)-(line 909,col 65)",
        "(line 910,col 9)-(line 912,col 65)",
        "(line 913,col 9)-(line 915,col 58)",
        "(line 916,col 9)-(line 918,col 58)",
        "(line 919,col 9)-(line 921,col 58)",
        "(line 922,col 9)-(line 924,col 58)",
        "(line 925,col 9)-(line 927,col 60)",
        "(line 928,col 9)-(line 930,col 60)",
        "(line 931,col 9)-(line 933,col 60)",
        "(line 934,col 9)-(line 936,col 60)",
        "(line 937,col 9)-(line 939,col 63)",
        "(line 940,col 9)-(line 942,col 63)",
        "(line 943,col 9)-(line 945,col 63)",
        "(line 946,col 9)-(line 948,col 63)",
        "(line 951,col 9)-(line 953,col 67)",
        "(line 954,col 9)-(line 956,col 67)",
        "(line 957,col 9)-(line 959,col 68)",
        "(line 960,col 9)-(line 962,col 68)",
        "(line 963,col 9)-(line 965,col 74)",
        "(line 966,col 9)-(line 968,col 74)",
        "(line 969,col 9)-(line 971,col 67)",
        "(line 972,col 9)-(line 974,col 67)",
        "(line 975,col 9)-(line 977,col 67)",
        "(line 978,col 9)-(line 980,col 67)",
        "(line 981,col 9)-(line 983,col 69)",
        "(line 984,col 9)-(line 986,col 69)",
        "(line 987,col 9)-(line 989,col 69)",
        "(line 990,col 9)-(line 992,col 69)",
        "(line 993,col 9)-(line 995,col 72)",
        "(line 996,col 9)-(line 998,col 72)",
        "(line 999,col 9)-(line 1001,col 72)",
        "(line 1002,col 9)-(line 1004,col 72)",
        "(line 1006,col 9)-(line 1008,col 68)",
        "(line 1009,col 9)-(line 1011,col 68)",
        "(line 1013,col 9)-(line 1015,col 71)",
        "(line 1016,col 9)-(line 1018,col 71)",
        "(line 1019,col 9)-(line 1021,col 71)",
        "(line 1022,col 9)-(line 1024,col 71)",
        "(line 1026,col 9)-(line 1029,col 48)",
        "(line 1030,col 9)-(line 1033,col 48)",
        "(line 1034,col 9)-(line 1037,col 48)",
        "(line 1038,col 9)-(line 1041,col 42)",
        "(line 1045,col 9)-(line 1045,col 34)",
        "(line 1046,col 9)-(line 1046,col 41)",
        "(line 1047,col 9)-(line 1049,col 58)",
        "(line 1050,col 9)-(line 1052,col 66)",
        "(line 1054,col 9)-(line 1056,col 58)",
        "(line 1057,col 9)-(line 1059,col 66)",
        "(line 1060,col 9)-(line 1060,col 41)",
        "(line 1061,col 9)-(line 1061,col 48)",
        "(line 1064,col 9)-(line 1064,col 50)",
        "(line 1065,col 9)-(line 1065,col 59)",
        "(line 1066,col 9)-(line 1066,col 34)",
        "(line 1067,col 9)-(line 1070,col 43)",
        "(line 1071,col 9)-(line 1071,col 45)",
        "(line 1072,col 9)-(line 1075,col 43)",
        "(line 1076,col 9)-(line 1076,col 45)",
        "(line 1077,col 9)-(line 1077,col 65)",
        "(line 1078,col 9)-(line 1078,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 1086,
      "end_line": 1158,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1090,col 9)",
        "(line 1093,col 9)-(line 1093,col 59)",
        "(line 1094,col 9)-(line 1094,col 37)",
        "(line 1095,col 9)-(line 1095,col 78)",
        "(line 1096,col 9)-(line 1096,col 36)",
        "(line 1098,col 9)-(line 1098,col 52)",
        "(line 1100,col 9)-(line 1100,col 85)",
        "(line 1101,col 9)-(line 1101,col 84)",
        "(line 1102,col 9)-(line 1102,col 82)",
        "(line 1103,col 9)-(line 1103,col 79)",
        "(line 1105,col 9)-(line 1105,col 99)",
        "(line 1106,col 9)-(line 1106,col 102)",
        "(line 1107,col 9)-(line 1107,col 105)",
        "(line 1108,col 9)-(line 1108,col 108)",
        "(line 1109,col 9)-(line 1109,col 111)",
        "(line 1112,col 9)-(line 1112,col 47)",
        "(line 1113,col 9)-(line 1113,col 54)",
        "(line 1114,col 9)-(line 1114,col 61)",
        "(line 1115,col 9)-(line 1115,col 104)",
        "(line 1118,col 9)-(line 1119,col 102)",
        "(line 1121,col 9)-(line 1122,col 97)",
        "(line 1124,col 9)-(line 1125,col 97)",
        "(line 1127,col 9)-(line 1128,col 102)",
        "(line 1130,col 9)-(line 1131,col 95)",
        "(line 1133,col 9)-(line 1134,col 95)",
        "(line 1138,col 9)-(line 1139,col 99)",
        "(line 1141,col 9)-(line 1142,col 94)",
        "(line 1144,col 9)-(line 1145,col 94)",
        "(line 1147,col 9)-(line 1148,col 99)",
        "(line 1150,col 9)-(line 1151,col 92)",
        "(line 1153,col 9)-(line 1154,col 92)",
        "(line 1157,col 9)-(line 1157,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testCeil()",
      "begin_line": 1163,
      "end_line": 1395,
      "comment": "\n     * Tests various values with the ceiling method\n     ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1167,col 57)",
        "(line 1168,col 9)-(line 1170,col 57)",
        "(line 1171,col 9)-(line 1173,col 58)",
        "(line 1174,col 9)-(line 1176,col 58)",
        "(line 1177,col 9)-(line 1179,col 64)",
        "(line 1180,col 9)-(line 1182,col 64)",
        "(line 1183,col 9)-(line 1185,col 57)",
        "(line 1186,col 9)-(line 1188,col 57)",
        "(line 1189,col 9)-(line 1191,col 57)",
        "(line 1192,col 9)-(line 1194,col 57)",
        "(line 1195,col 9)-(line 1197,col 59)",
        "(line 1198,col 9)-(line 1200,col 59)",
        "(line 1201,col 9)-(line 1203,col 59)",
        "(line 1204,col 9)-(line 1206,col 59)",
        "(line 1207,col 9)-(line 1209,col 62)",
        "(line 1210,col 9)-(line 1212,col 62)",
        "(line 1213,col 9)-(line 1215,col 62)",
        "(line 1216,col 9)-(line 1218,col 62)",
        "(line 1221,col 9)-(line 1223,col 66)",
        "(line 1224,col 9)-(line 1226,col 66)",
        "(line 1227,col 9)-(line 1229,col 67)",
        "(line 1230,col 9)-(line 1232,col 67)",
        "(line 1233,col 9)-(line 1235,col 73)",
        "(line 1236,col 9)-(line 1238,col 73)",
        "(line 1239,col 9)-(line 1241,col 66)",
        "(line 1242,col 9)-(line 1244,col 66)",
        "(line 1245,col 9)-(line 1247,col 66)",
        "(line 1248,col 9)-(line 1250,col 66)",
        "(line 1251,col 9)-(line 1253,col 68)",
        "(line 1254,col 9)-(line 1256,col 68)",
        "(line 1257,col 9)-(line 1259,col 68)",
        "(line 1260,col 9)-(line 1262,col 68)",
        "(line 1263,col 9)-(line 1265,col 71)",
        "(line 1266,col 9)-(line 1268,col 71)",
        "(line 1269,col 9)-(line 1271,col 71)",
        "(line 1272,col 9)-(line 1274,col 71)",
        "(line 1276,col 9)-(line 1278,col 67)",
        "(line 1279,col 9)-(line 1281,col 67)",
        "(line 1283,col 9)-(line 1285,col 70)",
        "(line 1286,col 9)-(line 1288,col 70)",
        "(line 1289,col 9)-(line 1291,col 70)",
        "(line 1292,col 9)-(line 1294,col 70)",
        "(line 1296,col 9)-(line 1299,col 48)",
        "(line 1300,col 9)-(line 1303,col 48)",
        "(line 1304,col 9)-(line 1307,col 48)",
        "(line 1308,col 9)-(line 1311,col 42)",
        "(line 1312,col 9)-(line 1315,col 47)",
        "(line 1320,col 9)-(line 1320,col 34)",
        "(line 1321,col 9)-(line 1321,col 41)",
        "(line 1323,col 9)-(line 1325,col 57)",
        "(line 1326,col 9)-(line 1328,col 65)",
        "(line 1329,col 9)-(line 1331,col 57)",
        "(line 1332,col 9)-(line 1334,col 65)",
        "(line 1335,col 9)-(line 1337,col 57)",
        "(line 1338,col 9)-(line 1340,col 65)",
        "(line 1341,col 9)-(line 1343,col 57)",
        "(line 1344,col 9)-(line 1346,col 65)",
        "(line 1348,col 9)-(line 1350,col 64)",
        "(line 1351,col 9)-(line 1353,col 72)",
        "(line 1354,col 9)-(line 1375,col 9)",
        "(line 1376,col 9)-(line 1376,col 41)",
        "(line 1377,col 9)-(line 1377,col 48)",
        "(line 1380,col 9)-(line 1380,col 50)",
        "(line 1381,col 9)-(line 1381,col 59)",
        "(line 1382,col 9)-(line 1382,col 34)",
        "(line 1383,col 9)-(line 1386,col 43)",
        "(line 1387,col 9)-(line 1387,col 45)",
        "(line 1388,col 9)-(line 1391,col 43)",
        "(line 1392,col 9)-(line 1392,col 45)",
        "(line 1393,col 9)-(line 1393,col 64)",
        "(line 1394,col 9)-(line 1394,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 1400,
      "end_line": 1420,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 1401,col 9)-(line 1403,col 48)",
        "(line 1404,col 9)-(line 1407,col 48)",
        "(line 1408,col 9)-(line 1411,col 48)",
        "(line 1412,col 9)-(line 1415,col 48)",
        "(line 1416,col 9)-(line 1419,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 1425,
      "end_line": 1466,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 1426,col 9)-(line 1426,col 46)",
        "(line 1427,col 9)-(line 1465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1471,
      "end_line": 1491,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1472,col 9)-(line 1472,col 81)",
        "(line 1473,col 9)-(line 1475,col 51)",
        "(line 1477,col 9)-(line 1477,col 69)",
        "(line 1478,col 9)-(line 1480,col 51)",
        "(line 1482,col 9)-(line 1482,col 69)",
        "(line 1483,col 9)-(line 1485,col 54)",
        "(line 1487,col 9)-(line 1487,col 69)",
        "(line 1488,col 9)-(line 1490,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar)",
      "begin_line": 1497,
      "end_line": 1502,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1498,col 9)-(line 1498,col 48)",
        "(line 1499,col 9)-(line 1499,col 34)",
        "(line 1501,col 9)-(line 1501,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Date, java.util.Date)",
      "begin_line": 1507,
      "end_line": 1514,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1508,col 9)-(line 1508,col 51)",
        "(line 1509,col 9)-(line 1509,col 32)",
        "(line 1510,col 9)-(line 1510,col 49)",
        "(line 1511,col 9)-(line 1511,col 28)",
        "(line 1513,col 9)-(line 1513,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1521,
      "end_line": 1542,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1522,col 9)-(line 1522,col 44)",
        "(line 1523,col 9)-(line 1523,col 40)",
        "(line 1524,col 9)-(line 1524,col 29)",
        "(line 1525,col 9)-(line 1525,col 22)",
        "(line 1526,col 9)-(line 1537,col 9)",
        "(line 1538,col 9)-(line 1540,col 9)",
        "(line 1541,col 9)-(line 1541,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1548,
      "end_line": 1553,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1549,col 9)-(line 1552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1555,
      "end_line": 1557,
      "comment": "",
      "child_ranges": [
        "(line 1556,col 9)-(line 1556,col 32)"
      ]
    }
  ]
}