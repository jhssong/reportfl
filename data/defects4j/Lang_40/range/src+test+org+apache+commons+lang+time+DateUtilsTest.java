{
  "filepath": "/tmp/Lang-40b/src/test/org/apache/commons/lang/time/DateUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 1564,
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.tearDown()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testConstructor()",
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameDay_Date()",
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameDay_Cal()",
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameInstant_Date()",
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameInstant_Cal()",
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIsSameLocalTime_Cal()",
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testParseDate()",
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddYears()",
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
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMonths()",
      "begin_line": 314,
      "end_line": 314,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddWeeks()",
      "begin_line": 335,
      "end_line": 351,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 42)",
        "(line 337,col 9)-(line 337,col 50)",
        "(line 338,col 9)-(line 338,col 36)",
        "(line 339,col 9)-(line 339,col 49)",
        "(line 340,col 9)-(line 340,col 51)",
        "(line 342,col 9)-(line 342,col 45)",
        "(line 343,col 9)-(line 343,col 36)",
        "(line 344,col 9)-(line 344,col 49)",
        "(line 345,col 9)-(line 345,col 52)",
        "(line 347,col 9)-(line 347,col 46)",
        "(line 348,col 9)-(line 348,col 36)",
        "(line 349,col 9)-(line 349,col 49)",
        "(line 350,col 9)-(line 350,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddDays()",
      "begin_line": 354,
      "end_line": 370,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 42)",
        "(line 356,col 9)-(line 356,col 49)",
        "(line 357,col 9)-(line 357,col 36)",
        "(line 358,col 9)-(line 358,col 49)",
        "(line 359,col 9)-(line 359,col 51)",
        "(line 361,col 9)-(line 361,col 44)",
        "(line 362,col 9)-(line 362,col 36)",
        "(line 363,col 9)-(line 363,col 49)",
        "(line 364,col 9)-(line 364,col 51)",
        "(line 366,col 9)-(line 366,col 45)",
        "(line 367,col 9)-(line 367,col 36)",
        "(line 368,col 9)-(line 368,col 49)",
        "(line 369,col 9)-(line 369,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddHours()",
      "begin_line": 373,
      "end_line": 389,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 42)",
        "(line 375,col 9)-(line 375,col 50)",
        "(line 376,col 9)-(line 376,col 36)",
        "(line 377,col 9)-(line 377,col 49)",
        "(line 378,col 9)-(line 378,col 51)",
        "(line 380,col 9)-(line 380,col 45)",
        "(line 381,col 9)-(line 381,col 36)",
        "(line 382,col 9)-(line 382,col 49)",
        "(line 383,col 9)-(line 383,col 51)",
        "(line 385,col 9)-(line 385,col 46)",
        "(line 386,col 9)-(line 386,col 36)",
        "(line 387,col 9)-(line 387,col 49)",
        "(line 388,col 9)-(line 388,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMinutes()",
      "begin_line": 392,
      "end_line": 408,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 42)",
        "(line 394,col 9)-(line 394,col 52)",
        "(line 395,col 9)-(line 395,col 36)",
        "(line 396,col 9)-(line 396,col 49)",
        "(line 397,col 9)-(line 397,col 51)",
        "(line 399,col 9)-(line 399,col 47)",
        "(line 400,col 9)-(line 400,col 36)",
        "(line 401,col 9)-(line 401,col 49)",
        "(line 402,col 9)-(line 402,col 51)",
        "(line 404,col 9)-(line 404,col 48)",
        "(line 405,col 9)-(line 405,col 36)",
        "(line 406,col 9)-(line 406,col 49)",
        "(line 407,col 9)-(line 407,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddSeconds()",
      "begin_line": 411,
      "end_line": 427,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 42)",
        "(line 413,col 9)-(line 413,col 52)",
        "(line 414,col 9)-(line 414,col 36)",
        "(line 415,col 9)-(line 415,col 49)",
        "(line 416,col 9)-(line 416,col 51)",
        "(line 418,col 9)-(line 418,col 47)",
        "(line 419,col 9)-(line 419,col 36)",
        "(line 420,col 9)-(line 420,col 49)",
        "(line 421,col 9)-(line 421,col 51)",
        "(line 423,col 9)-(line 423,col 48)",
        "(line 424,col 9)-(line 424,col 36)",
        "(line 425,col 9)-(line 425,col 49)",
        "(line 426,col 9)-(line 426,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddMilliseconds()",
      "begin_line": 430,
      "end_line": 430,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetYears()",
      "begin_line": 451,
      "end_line": 467,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 42)",
        "(line 453,col 9)-(line 453,col 53)",
        "(line 454,col 9)-(line 454,col 36)",
        "(line 455,col 9)-(line 455,col 49)",
        "(line 456,col 9)-(line 456,col 51)",
        "(line 458,col 9)-(line 458,col 48)",
        "(line 459,col 9)-(line 459,col 36)",
        "(line 460,col 9)-(line 460,col 49)",
        "(line 461,col 9)-(line 461,col 51)",
        "(line 463,col 9)-(line 463,col 48)",
        "(line 464,col 9)-(line 464,col 36)",
        "(line 465,col 9)-(line 465,col 49)",
        "(line 466,col 9)-(line 466,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetMonths()",
      "begin_line": 470,
      "end_line": 488,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 42)",
        "(line 472,col 9)-(line 472,col 51)",
        "(line 473,col 9)-(line 473,col 36)",
        "(line 474,col 9)-(line 474,col 49)",
        "(line 475,col 9)-(line 475,col 51)",
        "(line 477,col 9)-(line 477,col 46)",
        "(line 478,col 9)-(line 478,col 36)",
        "(line 479,col 9)-(line 479,col 49)",
        "(line 480,col 9)-(line 480,col 51)",
        "(line 482,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetDays()",
      "begin_line": 491,
      "end_line": 509,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 42)",
        "(line 493,col 9)-(line 493,col 49)",
        "(line 494,col 9)-(line 494,col 36)",
        "(line 495,col 9)-(line 495,col 49)",
        "(line 496,col 9)-(line 496,col 51)",
        "(line 498,col 9)-(line 498,col 45)",
        "(line 499,col 9)-(line 499,col 36)",
        "(line 500,col 9)-(line 500,col 49)",
        "(line 501,col 9)-(line 501,col 52)",
        "(line 503,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetHours()",
      "begin_line": 512,
      "end_line": 530,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 42)",
        "(line 514,col 9)-(line 514,col 50)",
        "(line 515,col 9)-(line 515,col 36)",
        "(line 516,col 9)-(line 516,col 49)",
        "(line 517,col 9)-(line 517,col 51)",
        "(line 519,col 9)-(line 519,col 46)",
        "(line 520,col 9)-(line 520,col 36)",
        "(line 521,col 9)-(line 521,col 49)",
        "(line 522,col 9)-(line 522,col 52)",
        "(line 524,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetMinutes()",
      "begin_line": 533,
      "end_line": 551,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 42)",
        "(line 535,col 9)-(line 535,col 52)",
        "(line 536,col 9)-(line 536,col 36)",
        "(line 537,col 9)-(line 537,col 49)",
        "(line 538,col 9)-(line 538,col 51)",
        "(line 540,col 9)-(line 540,col 48)",
        "(line 541,col 9)-(line 541,col 36)",
        "(line 542,col 9)-(line 542,col 49)",
        "(line 543,col 9)-(line 543,col 52)",
        "(line 545,col 9)-(line 550,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetSeconds()",
      "begin_line": 554,
      "end_line": 572,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 42)",
        "(line 556,col 9)-(line 556,col 52)",
        "(line 557,col 9)-(line 557,col 36)",
        "(line 558,col 9)-(line 558,col 49)",
        "(line 559,col 9)-(line 559,col 51)",
        "(line 561,col 9)-(line 561,col 48)",
        "(line 562,col 9)-(line 562,col 36)",
        "(line 563,col 9)-(line 563,col 49)",
        "(line 564,col 9)-(line 564,col 52)",
        "(line 566,col 9)-(line 571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testSetMilliseconds()",
      "begin_line": 575,
      "end_line": 593,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 42)",
        "(line 577,col 9)-(line 577,col 57)",
        "(line 578,col 9)-(line 578,col 36)",
        "(line 579,col 9)-(line 579,col 49)",
        "(line 580,col 9)-(line 580,col 51)",
        "(line 582,col 9)-(line 582,col 54)",
        "(line 583,col 9)-(line 583,col 36)",
        "(line 584,col 9)-(line 584,col 49)",
        "(line 585,col 9)-(line 585,col 53)",
        "(line 587,col 9)-(line 592,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertDate(java.util.Date, int, int, int, int, int, int, int)",
      "begin_line": 596,
      "end_line": 606,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 56)",
        "(line 598,col 9)-(line 598,col 26)",
        "(line 599,col 9)-(line 599,col 51)",
        "(line 600,col 9)-(line 600,col 53)",
        "(line 601,col 9)-(line 601,col 58)",
        "(line 602,col 9)-(line 602,col 58)",
        "(line 603,col 9)-(line 603,col 52)",
        "(line 604,col 9)-(line 604,col 52)",
        "(line 605,col 9)-(line 605,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testRound()",
      "begin_line": 612,
      "end_line": 829,
      "comment": "\n     * Tests various values with the round method\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 55)",
        "(line 617,col 9)-(line 619,col 55)",
        "(line 620,col 9)-(line 622,col 56)",
        "(line 623,col 9)-(line 625,col 56)",
        "(line 626,col 9)-(line 628,col 62)",
        "(line 629,col 9)-(line 631,col 62)",
        "(line 632,col 9)-(line 634,col 62)",
        "(line 637,col 9)-(line 639,col 55)",
        "(line 640,col 9)-(line 642,col 55)",
        "(line 643,col 9)-(line 645,col 55)",
        "(line 646,col 9)-(line 648,col 55)",
        "(line 649,col 9)-(line 651,col 57)",
        "(line 652,col 9)-(line 654,col 57)",
        "(line 655,col 9)-(line 657,col 57)",
        "(line 658,col 9)-(line 660,col 57)",
        "(line 661,col 9)-(line 663,col 60)",
        "(line 664,col 9)-(line 666,col 60)",
        "(line 667,col 9)-(line 669,col 60)",
        "(line 670,col 9)-(line 672,col 60)",
        "(line 675,col 9)-(line 677,col 64)",
        "(line 678,col 9)-(line 680,col 64)",
        "(line 681,col 9)-(line 683,col 65)",
        "(line 684,col 9)-(line 686,col 65)",
        "(line 687,col 9)-(line 689,col 71)",
        "(line 690,col 9)-(line 692,col 71)",
        "(line 693,col 9)-(line 695,col 64)",
        "(line 696,col 9)-(line 698,col 64)",
        "(line 699,col 9)-(line 701,col 64)",
        "(line 702,col 9)-(line 704,col 64)",
        "(line 705,col 9)-(line 707,col 66)",
        "(line 708,col 9)-(line 710,col 66)",
        "(line 711,col 9)-(line 713,col 66)",
        "(line 714,col 9)-(line 716,col 66)",
        "(line 717,col 9)-(line 719,col 65)",
        "(line 720,col 9)-(line 722,col 65)",
        "(line 723,col 9)-(line 725,col 69)",
        "(line 726,col 9)-(line 728,col 69)",
        "(line 729,col 9)-(line 731,col 69)",
        "(line 732,col 9)-(line 734,col 69)",
        "(line 736,col 9)-(line 739,col 48)",
        "(line 740,col 9)-(line 743,col 48)",
        "(line 744,col 9)-(line 747,col 48)",
        "(line 748,col 9)-(line 751,col 42)",
        "(line 752,col 9)-(line 755,col 47)",
        "(line 757,col 9)-(line 759,col 68)",
        "(line 760,col 9)-(line 762,col 68)",
        "(line 763,col 9)-(line 765,col 68)",
        "(line 766,col 9)-(line 768,col 68)",
        "(line 772,col 9)-(line 772,col 34)",
        "(line 773,col 9)-(line 773,col 41)",
        "(line 774,col 9)-(line 776,col 55)",
        "(line 777,col 9)-(line 779,col 63)",
        "(line 780,col 9)-(line 782,col 55)",
        "(line 783,col 9)-(line 785,col 63)",
        "(line 786,col 9)-(line 788,col 55)",
        "(line 789,col 9)-(line 791,col 63)",
        "(line 792,col 9)-(line 794,col 55)",
        "(line 795,col 9)-(line 797,col 63)",
        "(line 799,col 9)-(line 801,col 62)",
        "(line 802,col 9)-(line 804,col 70)",
        "(line 805,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 41)",
        "(line 828,col 9)-(line 828,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testRoundLang346()",
      "begin_line": 835,
      "end_line": 892,
      "comment": "\n     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked\n     * by DateUtils.round().\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 41)",
        "(line 838,col 9)-(line 838,col 48)",
        "(line 839,col 9)-(line 839,col 55)",
        "(line 840,col 9)-(line 840,col 47)",
        "(line 841,col 9)-(line 841,col 43)",
        "(line 842,col 9)-(line 844,col 61)",
        "(line 846,col 9)-(line 846,col 47)",
        "(line 847,col 9)-(line 847,col 38)",
        "(line 848,col 9)-(line 850,col 61)",
        "(line 852,col 9)-(line 852,col 47)",
        "(line 853,col 9)-(line 853,col 52)",
        "(line 854,col 9)-(line 854,col 38)",
        "(line 856,col 9)-(line 858,col 61)",
        "(line 860,col 9)-(line 860,col 47)",
        "(line 861,col 9)-(line 861,col 52)",
        "(line 862,col 9)-(line 862,col 38)",
        "(line 863,col 9)-(line 865,col 61)",
        "(line 867,col 9)-(line 867,col 47)",
        "(line 868,col 9)-(line 868,col 52)",
        "(line 869,col 9)-(line 869,col 38)",
        "(line 870,col 9)-(line 872,col 61)",
        "(line 874,col 9)-(line 874,col 47)",
        "(line 875,col 9)-(line 875,col 52)",
        "(line 876,col 9)-(line 876,col 38)",
        "(line 877,col 9)-(line 879,col 61)",
        "(line 881,col 9)-(line 881,col 47)",
        "(line 882,col 9)-(line 882,col 38)",
        "(line 883,col 9)-(line 885,col 59)",
        "(line 887,col 9)-(line 887,col 48)",
        "(line 888,col 9)-(line 888,col 38)",
        "(line 889,col 9)-(line 891,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testTruncate()",
      "begin_line": 897,
      "end_line": 1083,
      "comment": "\n     * Tests various values with the trunc method\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 901,col 58)",
        "(line 902,col 9)-(line 904,col 58)",
        "(line 905,col 9)-(line 907,col 59)",
        "(line 908,col 9)-(line 910,col 59)",
        "(line 911,col 9)-(line 913,col 65)",
        "(line 914,col 9)-(line 916,col 65)",
        "(line 917,col 9)-(line 919,col 58)",
        "(line 920,col 9)-(line 922,col 58)",
        "(line 923,col 9)-(line 925,col 58)",
        "(line 926,col 9)-(line 928,col 58)",
        "(line 929,col 9)-(line 931,col 60)",
        "(line 932,col 9)-(line 934,col 60)",
        "(line 935,col 9)-(line 937,col 60)",
        "(line 938,col 9)-(line 940,col 60)",
        "(line 941,col 9)-(line 943,col 63)",
        "(line 944,col 9)-(line 946,col 63)",
        "(line 947,col 9)-(line 949,col 63)",
        "(line 950,col 9)-(line 952,col 63)",
        "(line 955,col 9)-(line 957,col 67)",
        "(line 958,col 9)-(line 960,col 67)",
        "(line 961,col 9)-(line 963,col 68)",
        "(line 964,col 9)-(line 966,col 68)",
        "(line 967,col 9)-(line 969,col 74)",
        "(line 970,col 9)-(line 972,col 74)",
        "(line 973,col 9)-(line 975,col 67)",
        "(line 976,col 9)-(line 978,col 67)",
        "(line 979,col 9)-(line 981,col 67)",
        "(line 982,col 9)-(line 984,col 67)",
        "(line 985,col 9)-(line 987,col 69)",
        "(line 988,col 9)-(line 990,col 69)",
        "(line 991,col 9)-(line 993,col 69)",
        "(line 994,col 9)-(line 996,col 69)",
        "(line 997,col 9)-(line 999,col 72)",
        "(line 1000,col 9)-(line 1002,col 72)",
        "(line 1003,col 9)-(line 1005,col 72)",
        "(line 1006,col 9)-(line 1008,col 72)",
        "(line 1010,col 9)-(line 1012,col 68)",
        "(line 1013,col 9)-(line 1015,col 68)",
        "(line 1017,col 9)-(line 1019,col 71)",
        "(line 1020,col 9)-(line 1022,col 71)",
        "(line 1023,col 9)-(line 1025,col 71)",
        "(line 1026,col 9)-(line 1028,col 71)",
        "(line 1030,col 9)-(line 1033,col 48)",
        "(line 1034,col 9)-(line 1037,col 48)",
        "(line 1038,col 9)-(line 1041,col 48)",
        "(line 1042,col 9)-(line 1045,col 42)",
        "(line 1049,col 9)-(line 1049,col 34)",
        "(line 1050,col 9)-(line 1050,col 41)",
        "(line 1051,col 9)-(line 1053,col 58)",
        "(line 1054,col 9)-(line 1056,col 66)",
        "(line 1058,col 9)-(line 1060,col 58)",
        "(line 1061,col 9)-(line 1063,col 66)",
        "(line 1064,col 9)-(line 1064,col 41)",
        "(line 1065,col 9)-(line 1065,col 48)",
        "(line 1068,col 9)-(line 1068,col 50)",
        "(line 1069,col 9)-(line 1069,col 59)",
        "(line 1070,col 9)-(line 1070,col 34)",
        "(line 1071,col 9)-(line 1074,col 43)",
        "(line 1075,col 9)-(line 1075,col 45)",
        "(line 1076,col 9)-(line 1079,col 43)",
        "(line 1080,col 9)-(line 1080,col 45)",
        "(line 1081,col 9)-(line 1081,col 65)",
        "(line 1082,col 9)-(line 1082,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testTruncateLang59()",
      "begin_line": 1090,
      "end_line": 1162,
      "comment": "\n     * Tests for LANG-59\n     *\n     * see http://issues.apache.org/jira/browse/LANG-59\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1094,col 9)",
        "(line 1097,col 9)-(line 1097,col 59)",
        "(line 1098,col 9)-(line 1098,col 37)",
        "(line 1099,col 9)-(line 1099,col 78)",
        "(line 1100,col 9)-(line 1100,col 36)",
        "(line 1102,col 9)-(line 1102,col 52)",
        "(line 1104,col 9)-(line 1104,col 85)",
        "(line 1105,col 9)-(line 1105,col 84)",
        "(line 1106,col 9)-(line 1106,col 82)",
        "(line 1107,col 9)-(line 1107,col 79)",
        "(line 1109,col 9)-(line 1109,col 99)",
        "(line 1110,col 9)-(line 1110,col 102)",
        "(line 1111,col 9)-(line 1111,col 105)",
        "(line 1112,col 9)-(line 1112,col 108)",
        "(line 1113,col 9)-(line 1113,col 111)",
        "(line 1116,col 9)-(line 1116,col 47)",
        "(line 1117,col 9)-(line 1117,col 54)",
        "(line 1118,col 9)-(line 1118,col 61)",
        "(line 1119,col 9)-(line 1119,col 104)",
        "(line 1122,col 9)-(line 1123,col 102)",
        "(line 1125,col 9)-(line 1126,col 97)",
        "(line 1128,col 9)-(line 1129,col 97)",
        "(line 1131,col 9)-(line 1132,col 102)",
        "(line 1134,col 9)-(line 1135,col 95)",
        "(line 1137,col 9)-(line 1138,col 95)",
        "(line 1142,col 9)-(line 1143,col 99)",
        "(line 1145,col 9)-(line 1146,col 94)",
        "(line 1148,col 9)-(line 1149,col 94)",
        "(line 1151,col 9)-(line 1152,col 99)",
        "(line 1154,col 9)-(line 1155,col 92)",
        "(line 1157,col 9)-(line 1158,col 92)",
        "(line 1161,col 9)-(line 1161,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testCeil()",
      "begin_line": 1167,
      "end_line": 1399,
      "comment": "\n     * Tests various values with the ceiling method\n     ",
      "child_ranges": [
        "(line 1169,col 9)-(line 1171,col 57)",
        "(line 1172,col 9)-(line 1174,col 57)",
        "(line 1175,col 9)-(line 1177,col 58)",
        "(line 1178,col 9)-(line 1180,col 58)",
        "(line 1181,col 9)-(line 1183,col 64)",
        "(line 1184,col 9)-(line 1186,col 64)",
        "(line 1187,col 9)-(line 1189,col 57)",
        "(line 1190,col 9)-(line 1192,col 57)",
        "(line 1193,col 9)-(line 1195,col 57)",
        "(line 1196,col 9)-(line 1198,col 57)",
        "(line 1199,col 9)-(line 1201,col 59)",
        "(line 1202,col 9)-(line 1204,col 59)",
        "(line 1205,col 9)-(line 1207,col 59)",
        "(line 1208,col 9)-(line 1210,col 59)",
        "(line 1211,col 9)-(line 1213,col 62)",
        "(line 1214,col 9)-(line 1216,col 62)",
        "(line 1217,col 9)-(line 1219,col 62)",
        "(line 1220,col 9)-(line 1222,col 62)",
        "(line 1225,col 9)-(line 1227,col 66)",
        "(line 1228,col 9)-(line 1230,col 66)",
        "(line 1231,col 9)-(line 1233,col 67)",
        "(line 1234,col 9)-(line 1236,col 67)",
        "(line 1237,col 9)-(line 1239,col 73)",
        "(line 1240,col 9)-(line 1242,col 73)",
        "(line 1243,col 9)-(line 1245,col 66)",
        "(line 1246,col 9)-(line 1248,col 66)",
        "(line 1249,col 9)-(line 1251,col 66)",
        "(line 1252,col 9)-(line 1254,col 66)",
        "(line 1255,col 9)-(line 1257,col 68)",
        "(line 1258,col 9)-(line 1260,col 68)",
        "(line 1261,col 9)-(line 1263,col 68)",
        "(line 1264,col 9)-(line 1266,col 68)",
        "(line 1267,col 9)-(line 1269,col 71)",
        "(line 1270,col 9)-(line 1272,col 71)",
        "(line 1273,col 9)-(line 1275,col 71)",
        "(line 1276,col 9)-(line 1278,col 71)",
        "(line 1280,col 9)-(line 1282,col 67)",
        "(line 1283,col 9)-(line 1285,col 67)",
        "(line 1287,col 9)-(line 1289,col 70)",
        "(line 1290,col 9)-(line 1292,col 70)",
        "(line 1293,col 9)-(line 1295,col 70)",
        "(line 1296,col 9)-(line 1298,col 70)",
        "(line 1300,col 9)-(line 1303,col 48)",
        "(line 1304,col 9)-(line 1307,col 48)",
        "(line 1308,col 9)-(line 1311,col 48)",
        "(line 1312,col 9)-(line 1315,col 42)",
        "(line 1316,col 9)-(line 1319,col 47)",
        "(line 1324,col 9)-(line 1324,col 34)",
        "(line 1325,col 9)-(line 1325,col 41)",
        "(line 1327,col 9)-(line 1329,col 57)",
        "(line 1330,col 9)-(line 1332,col 65)",
        "(line 1333,col 9)-(line 1335,col 57)",
        "(line 1336,col 9)-(line 1338,col 65)",
        "(line 1339,col 9)-(line 1341,col 57)",
        "(line 1342,col 9)-(line 1344,col 65)",
        "(line 1345,col 9)-(line 1347,col 57)",
        "(line 1348,col 9)-(line 1350,col 65)",
        "(line 1352,col 9)-(line 1354,col 64)",
        "(line 1355,col 9)-(line 1357,col 72)",
        "(line 1358,col 9)-(line 1379,col 9)",
        "(line 1380,col 9)-(line 1380,col 41)",
        "(line 1381,col 9)-(line 1381,col 48)",
        "(line 1384,col 9)-(line 1384,col 50)",
        "(line 1385,col 9)-(line 1385,col 59)",
        "(line 1386,col 9)-(line 1386,col 34)",
        "(line 1387,col 9)-(line 1390,col 43)",
        "(line 1391,col 9)-(line 1391,col 45)",
        "(line 1392,col 9)-(line 1395,col 43)",
        "(line 1396,col 9)-(line 1396,col 45)",
        "(line 1397,col 9)-(line 1397,col 64)",
        "(line 1398,col 9)-(line 1398,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testIteratorEx()",
      "begin_line": 1404,
      "end_line": 1424,
      "comment": "\n     * Tests the iterator exceptions\n     ",
      "child_ranges": [
        "(line 1405,col 9)-(line 1407,col 48)",
        "(line 1408,col 9)-(line 1411,col 48)",
        "(line 1412,col 9)-(line 1415,col 48)",
        "(line 1416,col 9)-(line 1419,col 48)",
        "(line 1420,col 9)-(line 1423,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testWeekIterator()",
      "begin_line": 1429,
      "end_line": 1470,
      "comment": "\n     * Tests the calendar iterator for week ranges\n     ",
      "child_ranges": [
        "(line 1430,col 9)-(line 1430,col 46)",
        "(line 1431,col 9)-(line 1469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testMonthIterator()",
      "begin_line": 1475,
      "end_line": 1495,
      "comment": "\n     * Tests the calendar iterator for month-based ranges\n     ",
      "child_ranges": [
        "(line 1476,col 9)-(line 1476,col 81)",
        "(line 1477,col 9)-(line 1479,col 51)",
        "(line 1481,col 9)-(line 1481,col 69)",
        "(line 1482,col 9)-(line 1484,col 51)",
        "(line 1486,col 9)-(line 1486,col 69)",
        "(line 1487,col 9)-(line 1489,col 54)",
        "(line 1491,col 9)-(line 1491,col 69)",
        "(line 1492,col 9)-(line 1494,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar)",
      "begin_line": 1501,
      "end_line": 1506,
      "comment": "\n     * This checks that this is a 7 element iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other.\n     ",
      "child_ranges": [
        "(line 1502,col 9)-(line 1502,col 48)",
        "(line 1503,col 9)-(line 1503,col 34)",
        "(line 1505,col 9)-(line 1505,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Date, java.util.Date)",
      "begin_line": 1511,
      "end_line": 1518,
      "comment": "\n     * Convenience method for when working with Date objects\n     ",
      "child_ranges": [
        "(line 1512,col 9)-(line 1512,col 51)",
        "(line 1513,col 9)-(line 1513,col 32)",
        "(line 1514,col 9)-(line 1514,col 49)",
        "(line 1515,col 9)-(line 1515,col 28)",
        "(line 1517,col 9)-(line 1517,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertWeekIterator(java.util.Iterator\u003c?\u003e, java.util.Calendar, java.util.Calendar)",
      "begin_line": 1525,
      "end_line": 1546,
      "comment": "\n     * This checks that this is a 7 divisble iterator of Calendar objects\n     * that are dates (no time), and exactly 1 day spaced after each other\n     * (in addition to the proper start and stop dates)\n     ",
      "child_ranges": [
        "(line 1526,col 9)-(line 1526,col 44)",
        "(line 1527,col 9)-(line 1527,col 40)",
        "(line 1528,col 9)-(line 1528,col 29)",
        "(line 1529,col 9)-(line 1529,col 22)",
        "(line 1530,col 9)-(line 1541,col 9)",
        "(line 1542,col 9)-(line 1544,col 9)",
        "(line 1545,col 9)-(line 1545,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.assertEquals(java.lang.String, java.util.Calendar, java.util.Calendar, long)",
      "begin_line": 1552,
      "end_line": 1557,
      "comment": "\n     * Used to check that Calendar objects are close enough\n     * delta is in milliseconds\n     ",
      "child_ranges": [
        "(line 1553,col 9)-(line 1556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.warn(java.lang.String)",
      "begin_line": 1559,
      "end_line": 1561,
      "comment": "",
      "child_ranges": [
        "(line 1560,col 9)-(line 1560,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DateUtilsTest.testAddByField()",
      "begin_line": 1563,
      "end_line": 1563,
      "comment": " Fails in super class",
      "child_ranges": []
    }
  ]
}