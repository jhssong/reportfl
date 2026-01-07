{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/StringUtilsEqualsIndexOfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilsEqualsIndexOfTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 870,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BAR"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CharU20000"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Supplementary character U+20000\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharU20001"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Supplementary character U+20001\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharHigh"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Incomplete supplementary character U+20000, high surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharLow"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Incomplete supplementary character U+20000, low surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOO"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR_SUB_ARRAY"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.StringUtilsEqualsIndexOfTest(java.lang.String)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_Char()",
      "begin_line": 62,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 61)",
        "(line 64,col 9)-(line 64,col 59)",
        "(line 65,col 9)-(line 65,col 60)",
        "(line 66,col 9)-(line 66,col 62)",
        "(line 67,col 9)-(line 67,col 61)",
        "(line 68,col 9)-(line 68,col 61)",
        "(line 69,col 9)-(line 69,col 61)",
        "(line 70,col 9)-(line 70,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_String()",
      "begin_line": 73,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 62)",
        "(line 75,col 9)-(line 75,col 60)",
        "(line 76,col 9)-(line 76,col 61)",
        "(line 77,col 9)-(line 77,col 60)",
        "(line 78,col 9)-(line 78,col 57)",
        "(line 79,col 9)-(line 79,col 59)",
        "(line 80,col 9)-(line 80,col 61)",
        "(line 81,col 9)-(line 81,col 61)",
        "(line 82,col 9)-(line 82,col 61)",
        "(line 83,col 9)-(line 83,col 63)",
        "(line 84,col 9)-(line 84,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithBadSupplementaryChars()",
      "begin_line": 90,
      "end_line": 99,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 81)",
        "(line 93,col 9)-(line 93,col 80)",
        "(line 94,col 9)-(line 94,col 81)",
        "(line 95,col 9)-(line 95,col 62)",
        "(line 96,col 9)-(line 96,col 79)",
        "(line 97,col 9)-(line 97,col 91)",
        "(line 98,col 9)-(line 98,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithSupplementaryChars()",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 86)",
        "(line 106,col 9)-(line 106,col 86)",
        "(line 107,col 9)-(line 107,col 73)",
        "(line 108,col 9)-(line 108,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArray()",
      "begin_line": 111,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 66)",
        "(line 113,col 9)-(line 113,col 64)",
        "(line 114,col 9)-(line 114,col 76)",
        "(line 116,col 9)-(line 116,col 64)",
        "(line 117,col 9)-(line 117,col 62)",
        "(line 118,col 9)-(line 118,col 74)",
        "(line 120,col 9)-(line 120,col 74)",
        "(line 121,col 9)-(line 121,col 72)",
        "(line 122,col 9)-(line 122,col 83)",
        "(line 123,col 9)-(line 123,col 83)",
        "(line 124,col 9)-(line 124,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithBadSupplementaryChars()",
      "begin_line": 130,
      "end_line": 139,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 98)",
        "(line 133,col 9)-(line 133,col 114)",
        "(line 134,col 9)-(line 134,col 63)",
        "(line 135,col 9)-(line 135,col 97)",
        "(line 136,col 9)-(line 136,col 98)",
        "(line 137,col 9)-(line 137,col 62)",
        "(line 138,col 9)-(line 138,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 144,
      "end_line": 158,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 103)",
        "(line 146,col 9)-(line 146,col 102)",
        "(line 147,col 9)-(line 147,col 102)",
        "(line 148,col 9)-(line 148,col 102)",
        "(line 149,col 9)-(line 149,col 103)",
        "(line 150,col 9)-(line 150,col 90)",
        "(line 152,col 9)-(line 152,col 57)",
        "(line 153,col 9)-(line 153,col 66)",
        "(line 154,col 9)-(line 154,col 67)",
        "(line 156,col 9)-(line 156,col 91)",
        "(line 157,col 9)-(line 157,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringString()",
      "begin_line": 160,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 66)",
        "(line 162,col 9)-(line 162,col 55)",
        "(line 163,col 9)-(line 163,col 57)",
        "(line 165,col 9)-(line 165,col 64)",
        "(line 166,col 9)-(line 166,col 53)",
        "(line 167,col 9)-(line 167,col 55)",
        "(line 169,col 9)-(line 169,col 74)",
        "(line 170,col 9)-(line 170,col 63)",
        "(line 171,col 9)-(line 171,col 64)",
        "(line 172,col 9)-(line 172,col 64)",
        "(line 173,col 9)-(line 173,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithBadSupplementaryChars()",
      "begin_line": 179,
      "end_line": 187,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 84)",
        "(line 182,col 9)-(line 182,col 63)",
        "(line 183,col 9)-(line 183,col 83)",
        "(line 184,col 9)-(line 184,col 84)",
        "(line 185,col 9)-(line 185,col 62)",
        "(line 186,col 9)-(line 186,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithSupplementaryChars()",
      "begin_line": 192,
      "end_line": 203,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 89)",
        "(line 194,col 9)-(line 194,col 89)",
        "(line 195,col 9)-(line 195,col 76)",
        "(line 197,col 9)-(line 197,col 57)",
        "(line 198,col 9)-(line 198,col 66)",
        "(line 199,col 9)-(line 199,col 67)",
        "(line 201,col 9)-(line 201,col 77)",
        "(line 202,col 9)-(line 202,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_LocaleIndependence()",
      "begin_line": 205,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 42)",
        "(line 208,col 9)-(line 208,col 85)",
        "(line 210,col 9)-(line 216,col 10)",
        "(line 218,col 9)-(line 220,col 10)",
        "(line 222,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_StringString()",
      "begin_line": 239,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 64)",
        "(line 243,col 9)-(line 243,col 62)",
        "(line 244,col 9)-(line 244,col 63)",
        "(line 245,col 9)-(line 245,col 65)",
        "(line 247,col 9)-(line 247,col 62)",
        "(line 248,col 9)-(line 248,col 63)",
        "(line 249,col 9)-(line 249,col 65)",
        "(line 252,col 9)-(line 252,col 59)",
        "(line 253,col 9)-(line 253,col 60)",
        "(line 254,col 9)-(line 254,col 62)",
        "(line 257,col 9)-(line 257,col 61)",
        "(line 258,col 9)-(line 258,col 61)",
        "(line 259,col 9)-(line 259,col 63)",
        "(line 260,col 9)-(line 260,col 61)",
        "(line 261,col 9)-(line 261,col 61)",
        "(line 262,col 9)-(line 262,col 63)",
        "(line 265,col 9)-(line 265,col 63)",
        "(line 266,col 9)-(line 266,col 64)",
        "(line 267,col 9)-(line 267,col 67)",
        "(line 268,col 9)-(line 268,col 63)",
        "(line 269,col 9)-(line 269,col 64)",
        "(line 270,col 9)-(line 270,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArray()",
      "begin_line": 273,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 26)",
        "(line 275,col 9)-(line 275,col 26)",
        "(line 276,col 9)-(line 276,col 28)",
        "(line 277,col 9)-(line 277,col 29)",
        "(line 278,col 9)-(line 278,col 29)",
        "(line 279,col 9)-(line 279,col 34)",
        "(line 280,col 9)-(line 280,col 40)",
        "(line 281,col 9)-(line 281,col 74)",
        "(line 282,col 9)-(line 282,col 72)",
        "(line 283,col 9)-(line 283,col 71)",
        "(line 284,col 9)-(line 284,col 71)",
        "(line 285,col 9)-(line 285,col 69)",
        "(line 286,col 9)-(line 286,col 65)",
        "(line 287,col 9)-(line 287,col 67)",
        "(line 288,col 9)-(line 288,col 67)",
        "(line 289,col 9)-(line 289,col 67)",
        "(line 290,col 9)-(line 290,col 68)",
        "(line 291,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 292,col 67)",
        "(line 293,col 9)-(line 293,col 68)",
        "(line 294,col 9)-(line 294,col 68)",
        "(line 295,col 9)-(line 295,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithBadSupplementaryChars()",
      "begin_line": 301,
      "end_line": 310,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 98)",
        "(line 304,col 9)-(line 304,col 63)",
        "(line 305,col 9)-(line 305,col 97)",
        "(line 306,col 9)-(line 306,col 64)",
        "(line 307,col 9)-(line 307,col 98)",
        "(line 308,col 9)-(line 308,col 62)",
        "(line 309,col 9)-(line 309,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithSupplementaryChars()",
      "begin_line": 315,
      "end_line": 326,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 105)",
        "(line 317,col 9)-(line 317,col 105)",
        "(line 318,col 9)-(line 318,col 92)",
        "(line 320,col 9)-(line 320,col 57)",
        "(line 321,col 9)-(line 321,col 66)",
        "(line 322,col 9)-(line 322,col 67)",
        "(line 324,col 9)-(line 324,col 91)",
        "(line 325,col 9)-(line 325,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_String()",
      "begin_line": 328,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 26)",
        "(line 330,col 9)-(line 330,col 26)",
        "(line 331,col 9)-(line 331,col 28)",
        "(line 332,col 9)-(line 332,col 27)",
        "(line 333,col 9)-(line 333,col 27)",
        "(line 334,col 9)-(line 334,col 28)",
        "(line 335,col 9)-(line 335,col 74)",
        "(line 336,col 9)-(line 336,col 72)",
        "(line 337,col 9)-(line 337,col 63)",
        "(line 338,col 9)-(line 338,col 63)",
        "(line 339,col 9)-(line 339,col 61)",
        "(line 340,col 9)-(line 340,col 65)",
        "(line 341,col 9)-(line 341,col 67)",
        "(line 342,col 9)-(line 342,col 67)",
        "(line 343,col 9)-(line 343,col 67)",
        "(line 344,col 9)-(line 344,col 68)",
        "(line 345,col 9)-(line 345,col 67)",
        "(line 346,col 9)-(line 346,col 67)",
        "(line 347,col 9)-(line 347,col 68)",
        "(line 348,col 9)-(line 348,col 68)",
        "(line 349,col 9)-(line 349,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithBadSupplementaryChars()",
      "begin_line": 355,
      "end_line": 364,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 84)",
        "(line 358,col 9)-(line 358,col 63)",
        "(line 359,col 9)-(line 359,col 83)",
        "(line 360,col 9)-(line 360,col 64)",
        "(line 361,col 9)-(line 361,col 84)",
        "(line 362,col 9)-(line 362,col 62)",
        "(line 363,col 9)-(line 363,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithSupplementaryChars()",
      "begin_line": 369,
      "end_line": 380,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 91)",
        "(line 371,col 9)-(line 371,col 91)",
        "(line 372,col 9)-(line 372,col 78)",
        "(line 374,col 9)-(line 374,col 57)",
        "(line 375,col 9)-(line 375,col 66)",
        "(line 376,col 9)-(line 376,col 67)",
        "(line 378,col 9)-(line 378,col 77)",
        "(line 379,col 9)-(line 379,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_CharArray()",
      "begin_line": 382,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 26)",
        "(line 384,col 9)-(line 384,col 26)",
        "(line 385,col 9)-(line 385,col 27)",
        "(line 386,col 9)-(line 386,col 29)",
        "(line 387,col 9)-(line 387,col 29)",
        "(line 388,col 9)-(line 388,col 34)",
        "(line 389,col 9)-(line 389,col 40)",
        "(line 390,col 9)-(line 390,col 75)",
        "(line 391,col 9)-(line 391,col 73)",
        "(line 392,col 9)-(line 392,col 72)",
        "(line 393,col 9)-(line 393,col 72)",
        "(line 394,col 9)-(line 394,col 69)",
        "(line 395,col 9)-(line 395,col 65)",
        "(line 396,col 9)-(line 396,col 68)",
        "(line 397,col 9)-(line 397,col 67)",
        "(line 398,col 9)-(line 398,col 67)",
        "(line 399,col 9)-(line 399,col 67)",
        "(line 400,col 9)-(line 400,col 68)",
        "(line 401,col 9)-(line 401,col 67)",
        "(line 402,col 9)-(line 402,col 68)",
        "(line 403,col 9)-(line 403,col 68)",
        "(line 404,col 9)-(line 404,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_String()",
      "begin_line": 407,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 26)",
        "(line 409,col 9)-(line 409,col 26)",
        "(line 410,col 9)-(line 410,col 27)",
        "(line 411,col 9)-(line 411,col 27)",
        "(line 412,col 9)-(line 412,col 27)",
        "(line 413,col 9)-(line 413,col 28)",
        "(line 414,col 9)-(line 414,col 75)",
        "(line 415,col 9)-(line 415,col 73)",
        "(line 416,col 9)-(line 416,col 64)",
        "(line 417,col 9)-(line 417,col 64)",
        "(line 418,col 9)-(line 418,col 61)",
        "(line 419,col 9)-(line 419,col 65)",
        "(line 420,col 9)-(line 420,col 68)",
        "(line 421,col 9)-(line 421,col 67)",
        "(line 422,col 9)-(line 422,col 67)",
        "(line 423,col 9)-(line 423,col 67)",
        "(line 424,col 9)-(line 424,col 68)",
        "(line 425,col 9)-(line 425,col 67)",
        "(line 426,col 9)-(line 426,col 68)",
        "(line 427,col 9)-(line 427,col 68)",
        "(line 428,col 9)-(line 428,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsWhitespace()",
      "begin_line": 431,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 58)",
        "(line 433,col 9)-(line 433,col 58)",
        "(line 434,col 9)-(line 434,col 59)",
        "(line 435,col 9)-(line 435,col 59)",
        "(line 436,col 9)-(line 436,col 59)",
        "(line 437,col 9)-(line 437,col 60)",
        "(line 438,col 9)-(line 438,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEquals()",
      "begin_line": 441,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 59)",
        "(line 443,col 9)-(line 443,col 57)",
        "(line 444,col 9)-(line 444,col 94)",
        "(line 445,col 9)-(line 445,col 95)",
        "(line 446,col 9)-(line 446,col 58)",
        "(line 447,col 9)-(line 447,col 59)",
        "(line 448,col 9)-(line 448,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsIgnoreCase()",
      "begin_line": 451,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 69)",
        "(line 453,col 9)-(line 453,col 67)",
        "(line 454,col 9)-(line 454,col 104)",
        "(line 455,col 9)-(line 455,col 104)",
        "(line 456,col 9)-(line 456,col 68)",
        "(line 457,col 9)-(line 457,col 69)",
        "(line 458,col 9)-(line 458,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_char()",
      "begin_line": 462,
      "end_line": 469,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 57)",
        "(line 464,col 9)-(line 464,col 55)",
        "(line 465,col 9)-(line 465,col 62)",
        "(line 466,col 9)-(line 466,col 62)",
        "(line 468,col 9)-(line 468,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_charInt()",
      "begin_line": 471,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 60)",
        "(line 473,col 9)-(line 473,col 61)",
        "(line 474,col 9)-(line 474,col 58)",
        "(line 475,col 9)-(line 475,col 59)",
        "(line 476,col 9)-(line 476,col 65)",
        "(line 477,col 9)-(line 477,col 65)",
        "(line 478,col 9)-(line 478,col 65)",
        "(line 479,col 9)-(line 479,col 66)",
        "(line 480,col 9)-(line 480,col 66)",
        "(line 482,col 9)-(line 482,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_String()",
      "begin_line": 485,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 58)",
        "(line 487,col 9)-(line 487,col 56)",
        "(line 488,col 9)-(line 488,col 53)",
        "(line 489,col 9)-(line 489,col 62)",
        "(line 490,col 9)-(line 490,col 62)",
        "(line 491,col 9)-(line 491,col 63)",
        "(line 492,col 9)-(line 492,col 61)",
        "(line 494,col 9)-(line 494,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_StringInt()",
      "begin_line": 497,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 61)",
        "(line 499,col 9)-(line 499,col 62)",
        "(line 500,col 9)-(line 500,col 59)",
        "(line 501,col 9)-(line 501,col 60)",
        "(line 502,col 9)-(line 502,col 59)",
        "(line 503,col 9)-(line 503,col 60)",
        "(line 504,col 9)-(line 504,col 56)",
        "(line 505,col 9)-(line 505,col 57)",
        "(line 506,col 9)-(line 506,col 56)",
        "(line 507,col 9)-(line 507,col 59)",
        "(line 508,col 9)-(line 508,col 60)",
        "(line 509,col 9)-(line 509,col 59)",
        "(line 510,col 9)-(line 510,col 59)",
        "(line 511,col 9)-(line 511,col 65)",
        "(line 512,col 9)-(line 512,col 65)",
        "(line 513,col 9)-(line 513,col 66)",
        "(line 514,col 9)-(line 514,col 65)",
        "(line 515,col 9)-(line 515,col 66)",
        "(line 516,col 9)-(line 516,col 66)",
        "(line 517,col 9)-(line 517,col 63)",
        "(line 519,col 9)-(line 519,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArray()",
      "begin_line": 522,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 70)",
        "(line 524,col 9)-(line 524,col 68)",
        "(line 525,col 9)-(line 525,col 77)",
        "(line 527,col 9)-(line 527,col 68)",
        "(line 528,col 9)-(line 528,col 66)",
        "(line 529,col 9)-(line 529,col 75)",
        "(line 531,col 9)-(line 531,col 78)",
        "(line 532,col 9)-(line 532,col 76)",
        "(line 533,col 9)-(line 533,col 84)",
        "(line 534,col 9)-(line 534,col 84)",
        "(line 535,col 9)-(line 535,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 541,
      "end_line": 546,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 99)",
        "(line 543,col 9)-(line 543,col 99)",
        "(line 544,col 9)-(line 544,col 86)",
        "(line 545,col 9)-(line 545,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringString()",
      "begin_line": 548,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 70)",
        "(line 550,col 9)-(line 550,col 59)",
        "(line 551,col 9)-(line 551,col 61)",
        "(line 553,col 9)-(line 553,col 68)",
        "(line 554,col 9)-(line 554,col 57)",
        "(line 555,col 9)-(line 555,col 59)",
        "(line 557,col 9)-(line 557,col 78)",
        "(line 558,col 9)-(line 558,col 67)",
        "(line 559,col 9)-(line 559,col 68)",
        "(line 560,col 9)-(line 560,col 68)",
        "(line 561,col 9)-(line 561,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringArray()",
      "begin_line": 564,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 72)",
        "(line 566,col 9)-(line 566,col 73)",
        "(line 567,col 9)-(line 567,col 74)",
        "(line 568,col 9)-(line 568,col 74)",
        "(line 569,col 9)-(line 569,col 72)",
        "(line 570,col 9)-(line 570,col 70)",
        "(line 571,col 9)-(line 571,col 68)",
        "(line 572,col 9)-(line 572,col 80)",
        "(line 573,col 9)-(line 573,col 75)",
        "(line 574,col 9)-(line 574,col 71)",
        "(line 575,col 9)-(line 575,col 73)",
        "(line 576,col 9)-(line 576,col 74)",
        "(line 577,col 9)-(line 577,col 78)",
        "(line 578,col 9)-(line 578,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringWithSupplementaryChars()",
      "begin_line": 584,
      "end_line": 589,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 85)",
        "(line 586,col 9)-(line 586,col 85)",
        "(line 587,col 9)-(line 587,col 72)",
        "(line 588,col 9)-(line 588,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArray()",
      "begin_line": 591,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 73)",
        "(line 593,col 9)-(line 593,col 71)",
        "(line 594,col 9)-(line 594,col 80)",
        "(line 596,col 9)-(line 596,col 71)",
        "(line 597,col 9)-(line 597,col 69)",
        "(line 598,col 9)-(line 598,col 78)",
        "(line 600,col 9)-(line 600,col 81)",
        "(line 601,col 9)-(line 601,col 79)",
        "(line 602,col 9)-(line 602,col 87)",
        "(line 603,col 9)-(line 603,col 87)",
        "(line 604,col 9)-(line 604,col 82)",
        "(line 605,col 9)-(line 605,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArrayWithSupplementaryChars()",
      "begin_line": 609,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 102)",
        "(line 611,col 9)-(line 611,col 102)",
        "(line 612,col 9)-(line 612,col 90)",
        "(line 613,col 9)-(line 613,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringString()",
      "begin_line": 616,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 73)",
        "(line 618,col 9)-(line 618,col 62)",
        "(line 619,col 9)-(line 619,col 64)",
        "(line 621,col 9)-(line 621,col 71)",
        "(line 622,col 9)-(line 622,col 60)",
        "(line 623,col 9)-(line 623,col 62)",
        "(line 625,col 9)-(line 625,col 81)",
        "(line 626,col 9)-(line 626,col 70)",
        "(line 627,col 9)-(line 627,col 71)",
        "(line 628,col 9)-(line 628,col 71)",
        "(line 629,col 9)-(line 629,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringStringWithSupplementaryChars()",
      "begin_line": 632,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 88)",
        "(line 634,col 9)-(line 634,col 88)",
        "(line 635,col 9)-(line 635,col 76)",
        "(line 636,col 9)-(line 636,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_String()",
      "begin_line": 639,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 68)",
        "(line 641,col 9)-(line 641,col 66)",
        "(line 642,col 9)-(line 642,col 66)",
        "(line 643,col 9)-(line 643,col 63)",
        "(line 644,col 9)-(line 644,col 72)",
        "(line 645,col 9)-(line 645,col 72)",
        "(line 646,col 9)-(line 646,col 72)",
        "(line 647,col 9)-(line 647,col 72)",
        "(line 648,col 9)-(line 648,col 73)",
        "(line 649,col 9)-(line 649,col 73)",
        "(line 650,col 9)-(line 650,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_StringInt()",
      "begin_line": 653,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 77)",
        "(line 655,col 9)-(line 655,col 76)",
        "(line 656,col 9)-(line 656,col 76)",
        "(line 657,col 9)-(line 657,col 76)",
        "(line 658,col 9)-(line 658,col 76)",
        "(line 659,col 9)-(line 659,col 76)",
        "(line 660,col 9)-(line 660,col 77)",
        "(line 661,col 9)-(line 661,col 77)",
        "(line 662,col 9)-(line 662,col 77)",
        "(line 663,col 9)-(line 663,col 77)",
        "(line 664,col 9)-(line 664,col 71)",
        "(line 665,col 9)-(line 665,col 74)",
        "(line 666,col 9)-(line 666,col 72)",
        "(line 667,col 9)-(line 667,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_char()",
      "begin_line": 670,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 61)",
        "(line 672,col 9)-(line 672,col 59)",
        "(line 673,col 9)-(line 673,col 66)",
        "(line 674,col 9)-(line 674,col 66)",
        "(line 676,col 9)-(line 676,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_charInt()",
      "begin_line": 679,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 64)",
        "(line 681,col 9)-(line 681,col 65)",
        "(line 682,col 9)-(line 682,col 62)",
        "(line 683,col 9)-(line 683,col 63)",
        "(line 684,col 9)-(line 684,col 69)",
        "(line 685,col 9)-(line 685,col 69)",
        "(line 686,col 9)-(line 686,col 69)",
        "(line 687,col 9)-(line 687,col 69)",
        "(line 688,col 9)-(line 688,col 71)",
        "(line 689,col 9)-(line 689,col 69)",
        "(line 691,col 9)-(line 691,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_String()",
      "begin_line": 694,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 62)",
        "(line 696,col 9)-(line 696,col 60)",
        "(line 697,col 9)-(line 697,col 59)",
        "(line 698,col 9)-(line 698,col 57)",
        "(line 699,col 9)-(line 699,col 65)",
        "(line 700,col 9)-(line 700,col 66)",
        "(line 701,col 9)-(line 701,col 66)",
        "(line 702,col 9)-(line 702,col 67)",
        "(line 704,col 9)-(line 704,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_StringInt()",
      "begin_line": 707,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 65)",
        "(line 709,col 9)-(line 709,col 66)",
        "(line 710,col 9)-(line 710,col 63)",
        "(line 711,col 9)-(line 711,col 64)",
        "(line 712,col 9)-(line 712,col 63)",
        "(line 713,col 9)-(line 713,col 64)",
        "(line 714,col 9)-(line 714,col 60)",
        "(line 715,col 9)-(line 715,col 62)",
        "(line 716,col 9)-(line 716,col 60)",
        "(line 717,col 9)-(line 717,col 63)",
        "(line 718,col 9)-(line 718,col 65)",
        "(line 719,col 9)-(line 719,col 63)",
        "(line 720,col 9)-(line 720,col 69)",
        "(line 721,col 9)-(line 721,col 69)",
        "(line 722,col 9)-(line 722,col 70)",
        "(line 723,col 9)-(line 723,col 69)",
        "(line 724,col 9)-(line 724,col 69)",
        "(line 725,col 9)-(line 725,col 71)",
        "(line 726,col 9)-(line 726,col 70)",
        "(line 727,col 9)-(line 727,col 69)",
        "(line 729,col 9)-(line 729,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfAny_StringStringArray()",
      "begin_line": 732,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 80)",
        "(line 734,col 9)-(line 734,col 82)",
        "(line 735,col 9)-(line 735,col 59)",
        "(line 736,col 9)-(line 736,col 77)",
        "(line 737,col 9)-(line 737,col 82)",
        "(line 738,col 9)-(line 738,col 84)",
        "(line 739,col 9)-(line 739,col 61)",
        "(line 740,col 9)-(line 740,col 78)",
        "(line 741,col 9)-(line 741,col 76)",
        "(line 742,col 9)-(line 742,col 74)",
        "(line 743,col 9)-(line 743,col 72)",
        "(line 744,col 9)-(line 744,col 84)",
        "(line 745,col 9)-(line 745,col 79)",
        "(line 746,col 9)-(line 746,col 75)",
        "(line 747,col 9)-(line 747,col 77)",
        "(line 748,col 9)-(line 748,col 78)",
        "(line 749,col 9)-(line 749,col 82)",
        "(line 750,col 9)-(line 750,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_String()",
      "begin_line": 753,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 72)",
        "(line 755,col 9)-(line 755,col 70)",
        "(line 756,col 9)-(line 756,col 70)",
        "(line 757,col 9)-(line 757,col 69)",
        "(line 758,col 9)-(line 758,col 67)",
        "(line 759,col 9)-(line 759,col 75)",
        "(line 760,col 9)-(line 760,col 76)",
        "(line 761,col 9)-(line 761,col 76)",
        "(line 762,col 9)-(line 762,col 76)",
        "(line 763,col 9)-(line 763,col 76)",
        "(line 764,col 9)-(line 764,col 77)",
        "(line 765,col 9)-(line 765,col 77)",
        "(line 766,col 9)-(line 766,col 73)",
        "(line 767,col 9)-(line 767,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_StringInt()",
      "begin_line": 770,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 75)",
        "(line 772,col 9)-(line 772,col 76)",
        "(line 773,col 9)-(line 773,col 73)",
        "(line 774,col 9)-(line 774,col 74)",
        "(line 775,col 9)-(line 775,col 73)",
        "(line 776,col 9)-(line 776,col 74)",
        "(line 777,col 9)-(line 777,col 70)",
        "(line 778,col 9)-(line 778,col 72)",
        "(line 779,col 9)-(line 779,col 70)",
        "(line 780,col 9)-(line 780,col 73)",
        "(line 781,col 9)-(line 781,col 75)",
        "(line 782,col 9)-(line 782,col 73)",
        "(line 783,col 9)-(line 783,col 79)",
        "(line 784,col 9)-(line 784,col 79)",
        "(line 785,col 9)-(line 785,col 80)",
        "(line 786,col 9)-(line 786,col 79)",
        "(line 787,col 9)-(line 787,col 79)",
        "(line 788,col 9)-(line 788,col 81)",
        "(line 789,col 9)-(line 789,col 80)",
        "(line 790,col 9)-(line 790,col 79)",
        "(line 791,col 9)-(line 791,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastOrdinalIndexOf()",
      "begin_line": 794,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 73)",
        "(line 796,col 9)-(line 796,col 73)",
        "(line 797,col 9)-(line 797,col 69)",
        "(line 798,col 9)-(line 798,col 77)",
        "(line 799,col 9)-(line 799,col 77)",
        "(line 800,col 9)-(line 800,col 77)",
        "(line 801,col 9)-(line 801,col 77)",
        "(line 802,col 9)-(line 802,col 78)",
        "(line 803,col 9)-(line 803,col 78)",
        "(line 804,col 9)-(line 804,col 76)",
        "(line 805,col 9)-(line 805,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testOrdinalIndexOf()",
      "begin_line": 808,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 84)",
        "(line 810,col 9)-(line 810,col 82)",
        "(line 811,col 9)-(line 811,col 80)",
        "(line 812,col 9)-(line 812,col 89)",
        "(line 813,col 9)-(line 813,col 89)",
        "(line 814,col 9)-(line 814,col 90)",
        "(line 815,col 9)-(line 815,col 88)",
        "(line 817,col 9)-(line 817,col 69)",
        "(line 818,col 9)-(line 818,col 67)",
        "(line 819,col 9)-(line 819,col 65)",
        "(line 820,col 9)-(line 820,col 74)",
        "(line 821,col 9)-(line 821,col 74)",
        "(line 822,col 9)-(line 822,col 75)",
        "(line 823,col 9)-(line 823,col 73)",
        "(line 825,col 9)-(line 825,col 68)",
        "(line 826,col 9)-(line 826,col 66)",
        "(line 827,col 9)-(line 827,col 64)",
        "(line 828,col 9)-(line 828,col 73)",
        "(line 829,col 9)-(line 829,col 73)",
        "(line 830,col 9)-(line 830,col 74)",
        "(line 831,col 9)-(line 831,col 72)",
        "(line 833,col 9)-(line 833,col 68)",
        "(line 834,col 9)-(line 834,col 66)",
        "(line 835,col 9)-(line 835,col 63)",
        "(line 836,col 9)-(line 836,col 72)",
        "(line 837,col 9)-(line 837,col 72)",
        "(line 838,col 9)-(line 838,col 73)",
        "(line 839,col 9)-(line 839,col 71)",
        "(line 841,col 9)-(line 841,col 68)",
        "(line 842,col 9)-(line 842,col 66)",
        "(line 843,col 9)-(line 843,col 63)",
        "(line 844,col 9)-(line 844,col 72)",
        "(line 845,col 9)-(line 845,col 72)",
        "(line 846,col 9)-(line 846,col 73)",
        "(line 847,col 9)-(line 847,col 71)",
        "(line 849,col 9)-(line 849,col 84)",
        "(line 850,col 9)-(line 850,col 82)",
        "(line 851,col 9)-(line 851,col 79)",
        "(line 852,col 9)-(line 852,col 89)",
        "(line 853,col 9)-(line 853,col 89)",
        "(line 854,col 9)-(line 854,col 90)",
        "(line 855,col 9)-(line 855,col 87)",
        "(line 857,col 9)-(line 857,col 74)",
        "(line 858,col 9)-(line 858,col 73)",
        "(line 859,col 9)-(line 859,col 73)",
        "(line 860,col 9)-(line 860,col 73)",
        "(line 861,col 9)-(line 861,col 73)",
        "(line 862,col 9)-(line 862,col 73)",
        "(line 863,col 9)-(line 863,col 73)",
        "(line 864,col 9)-(line 864,col 73)",
        "(line 865,col 9)-(line 865,col 73)",
        "(line 866,col 9)-(line 866,col 73)",
        "(line 867,col 9)-(line 867,col 75)"
      ]
    }
  ]
}