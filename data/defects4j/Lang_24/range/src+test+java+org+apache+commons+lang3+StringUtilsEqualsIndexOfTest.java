{
  "filepath": "/tmp/Lang-24b/src/test/java/org/apache/commons/lang3/StringUtilsEqualsIndexOfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilsEqualsIndexOfTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 853,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:ridesmet@users.sourceforge.net\"\u003eRingo De Smet\u003c/a\u003e\n * @author Phil Steitz\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BAR"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CharU20000"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Supplementary character U+20000\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharU20001"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Supplementary character U+20001\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharHigh"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Incomplete supplementary character U+20000, high surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharLow"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Incomplete supplementary character U+20000, low surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOO"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR_SUB_ARRAY"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.StringUtilsEqualsIndexOfTest(java.lang.String)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_Char()",
      "begin_line": 65,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 61)",
        "(line 67,col 9)-(line 67,col 59)",
        "(line 68,col 9)-(line 68,col 60)",
        "(line 69,col 9)-(line 69,col 62)",
        "(line 70,col 9)-(line 70,col 61)",
        "(line 71,col 9)-(line 71,col 61)",
        "(line 72,col 9)-(line 72,col 61)",
        "(line 73,col 9)-(line 73,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_String()",
      "begin_line": 76,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 62)",
        "(line 78,col 9)-(line 78,col 60)",
        "(line 79,col 9)-(line 79,col 61)",
        "(line 80,col 9)-(line 80,col 60)",
        "(line 81,col 9)-(line 81,col 57)",
        "(line 82,col 9)-(line 82,col 59)",
        "(line 83,col 9)-(line 83,col 61)",
        "(line 84,col 9)-(line 84,col 61)",
        "(line 85,col 9)-(line 85,col 61)",
        "(line 86,col 9)-(line 86,col 63)",
        "(line 87,col 9)-(line 87,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithBadSupplementaryChars()",
      "begin_line": 93,
      "end_line": 102,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 81)",
        "(line 96,col 9)-(line 96,col 80)",
        "(line 97,col 9)-(line 97,col 81)",
        "(line 98,col 9)-(line 98,col 62)",
        "(line 99,col 9)-(line 99,col 79)",
        "(line 100,col 9)-(line 100,col 91)",
        "(line 101,col 9)-(line 101,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithSupplementaryChars()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 86)",
        "(line 109,col 9)-(line 109,col 86)",
        "(line 110,col 9)-(line 110,col 73)",
        "(line 111,col 9)-(line 111,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArray()",
      "begin_line": 114,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 66)",
        "(line 116,col 9)-(line 116,col 64)",
        "(line 117,col 9)-(line 117,col 76)",
        "(line 119,col 9)-(line 119,col 64)",
        "(line 120,col 9)-(line 120,col 62)",
        "(line 121,col 9)-(line 121,col 74)",
        "(line 123,col 9)-(line 123,col 74)",
        "(line 124,col 9)-(line 124,col 72)",
        "(line 125,col 9)-(line 125,col 83)",
        "(line 126,col 9)-(line 126,col 83)",
        "(line 127,col 9)-(line 127,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithBadSupplementaryChars()",
      "begin_line": 133,
      "end_line": 142,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 98)",
        "(line 136,col 9)-(line 136,col 114)",
        "(line 137,col 9)-(line 137,col 63)",
        "(line 138,col 9)-(line 138,col 97)",
        "(line 139,col 9)-(line 139,col 98)",
        "(line 140,col 9)-(line 140,col 62)",
        "(line 141,col 9)-(line 141,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 147,
      "end_line": 161,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 103)",
        "(line 149,col 9)-(line 149,col 102)",
        "(line 150,col 9)-(line 150,col 102)",
        "(line 151,col 9)-(line 151,col 102)",
        "(line 152,col 9)-(line 152,col 103)",
        "(line 153,col 9)-(line 153,col 90)",
        "(line 155,col 9)-(line 155,col 57)",
        "(line 156,col 9)-(line 156,col 66)",
        "(line 157,col 9)-(line 157,col 67)",
        "(line 159,col 9)-(line 159,col 91)",
        "(line 160,col 9)-(line 160,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringString()",
      "begin_line": 163,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 66)",
        "(line 165,col 9)-(line 165,col 55)",
        "(line 166,col 9)-(line 166,col 57)",
        "(line 168,col 9)-(line 168,col 64)",
        "(line 169,col 9)-(line 169,col 53)",
        "(line 170,col 9)-(line 170,col 55)",
        "(line 172,col 9)-(line 172,col 74)",
        "(line 173,col 9)-(line 173,col 63)",
        "(line 174,col 9)-(line 174,col 64)",
        "(line 175,col 9)-(line 175,col 64)",
        "(line 176,col 9)-(line 176,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithBadSupplementaryChars()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 84)",
        "(line 185,col 9)-(line 185,col 63)",
        "(line 186,col 9)-(line 186,col 83)",
        "(line 187,col 9)-(line 187,col 84)",
        "(line 188,col 9)-(line 188,col 62)",
        "(line 189,col 9)-(line 189,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithSupplementaryChars()",
      "begin_line": 195,
      "end_line": 206,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 89)",
        "(line 197,col 9)-(line 197,col 89)",
        "(line 198,col 9)-(line 198,col 76)",
        "(line 200,col 9)-(line 200,col 57)",
        "(line 201,col 9)-(line 201,col 66)",
        "(line 202,col 9)-(line 202,col 67)",
        "(line 204,col 9)-(line 204,col 77)",
        "(line 205,col 9)-(line 205,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_LocaleIndependence()",
      "begin_line": 208,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 42)",
        "(line 211,col 9)-(line 211,col 85)",
        "(line 213,col 9)-(line 219,col 10)",
        "(line 221,col 9)-(line 223,col 10)",
        "(line 225,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_StringString()",
      "begin_line": 242,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 64)",
        "(line 246,col 9)-(line 246,col 62)",
        "(line 247,col 9)-(line 247,col 63)",
        "(line 248,col 9)-(line 248,col 65)",
        "(line 250,col 9)-(line 250,col 62)",
        "(line 251,col 9)-(line 251,col 63)",
        "(line 252,col 9)-(line 252,col 65)",
        "(line 255,col 9)-(line 255,col 59)",
        "(line 256,col 9)-(line 256,col 60)",
        "(line 257,col 9)-(line 257,col 62)",
        "(line 260,col 9)-(line 260,col 61)",
        "(line 261,col 9)-(line 261,col 61)",
        "(line 262,col 9)-(line 262,col 63)",
        "(line 263,col 9)-(line 263,col 61)",
        "(line 264,col 9)-(line 264,col 61)",
        "(line 265,col 9)-(line 265,col 63)",
        "(line 268,col 9)-(line 268,col 63)",
        "(line 269,col 9)-(line 269,col 64)",
        "(line 270,col 9)-(line 270,col 67)",
        "(line 271,col 9)-(line 271,col 63)",
        "(line 272,col 9)-(line 272,col 64)",
        "(line 273,col 9)-(line 273,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArray()",
      "begin_line": 276,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 26)",
        "(line 278,col 9)-(line 278,col 26)",
        "(line 279,col 9)-(line 279,col 28)",
        "(line 280,col 9)-(line 280,col 29)",
        "(line 281,col 9)-(line 281,col 29)",
        "(line 282,col 9)-(line 282,col 34)",
        "(line 283,col 9)-(line 283,col 40)",
        "(line 284,col 9)-(line 284,col 74)",
        "(line 285,col 9)-(line 285,col 72)",
        "(line 286,col 9)-(line 286,col 71)",
        "(line 287,col 9)-(line 287,col 71)",
        "(line 288,col 9)-(line 288,col 69)",
        "(line 289,col 9)-(line 289,col 65)",
        "(line 290,col 9)-(line 290,col 67)",
        "(line 291,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 292,col 67)",
        "(line 293,col 9)-(line 293,col 68)",
        "(line 294,col 9)-(line 294,col 67)",
        "(line 295,col 9)-(line 295,col 67)",
        "(line 296,col 9)-(line 296,col 68)",
        "(line 297,col 9)-(line 297,col 68)",
        "(line 298,col 9)-(line 298,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithBadSupplementaryChars()",
      "begin_line": 304,
      "end_line": 313,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 98)",
        "(line 307,col 9)-(line 307,col 63)",
        "(line 308,col 9)-(line 308,col 97)",
        "(line 309,col 9)-(line 309,col 64)",
        "(line 310,col 9)-(line 310,col 98)",
        "(line 311,col 9)-(line 311,col 62)",
        "(line 312,col 9)-(line 312,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithSupplementaryChars()",
      "begin_line": 318,
      "end_line": 329,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 105)",
        "(line 320,col 9)-(line 320,col 105)",
        "(line 321,col 9)-(line 321,col 92)",
        "(line 323,col 9)-(line 323,col 57)",
        "(line 324,col 9)-(line 324,col 66)",
        "(line 325,col 9)-(line 325,col 67)",
        "(line 327,col 9)-(line 327,col 91)",
        "(line 328,col 9)-(line 328,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_String()",
      "begin_line": 331,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 26)",
        "(line 333,col 9)-(line 333,col 26)",
        "(line 334,col 9)-(line 334,col 28)",
        "(line 335,col 9)-(line 335,col 27)",
        "(line 336,col 9)-(line 336,col 27)",
        "(line 337,col 9)-(line 337,col 28)",
        "(line 338,col 9)-(line 338,col 74)",
        "(line 339,col 9)-(line 339,col 72)",
        "(line 340,col 9)-(line 340,col 63)",
        "(line 341,col 9)-(line 341,col 63)",
        "(line 342,col 9)-(line 342,col 61)",
        "(line 343,col 9)-(line 343,col 65)",
        "(line 344,col 9)-(line 344,col 67)",
        "(line 345,col 9)-(line 345,col 67)",
        "(line 346,col 9)-(line 346,col 67)",
        "(line 347,col 9)-(line 347,col 68)",
        "(line 348,col 9)-(line 348,col 67)",
        "(line 349,col 9)-(line 349,col 67)",
        "(line 350,col 9)-(line 350,col 68)",
        "(line 351,col 9)-(line 351,col 68)",
        "(line 352,col 9)-(line 352,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithBadSupplementaryChars()",
      "begin_line": 358,
      "end_line": 367,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 84)",
        "(line 361,col 9)-(line 361,col 63)",
        "(line 362,col 9)-(line 362,col 83)",
        "(line 363,col 9)-(line 363,col 64)",
        "(line 364,col 9)-(line 364,col 84)",
        "(line 365,col 9)-(line 365,col 62)",
        "(line 366,col 9)-(line 366,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithSupplementaryChars()",
      "begin_line": 372,
      "end_line": 383,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 91)",
        "(line 374,col 9)-(line 374,col 91)",
        "(line 375,col 9)-(line 375,col 78)",
        "(line 377,col 9)-(line 377,col 57)",
        "(line 378,col 9)-(line 378,col 66)",
        "(line 379,col 9)-(line 379,col 67)",
        "(line 381,col 9)-(line 381,col 77)",
        "(line 382,col 9)-(line 382,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_CharArray()",
      "begin_line": 385,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 26)",
        "(line 387,col 9)-(line 387,col 26)",
        "(line 388,col 9)-(line 388,col 27)",
        "(line 389,col 9)-(line 389,col 29)",
        "(line 390,col 9)-(line 390,col 29)",
        "(line 391,col 9)-(line 391,col 34)",
        "(line 392,col 9)-(line 392,col 40)",
        "(line 393,col 9)-(line 393,col 75)",
        "(line 394,col 9)-(line 394,col 73)",
        "(line 395,col 9)-(line 395,col 72)",
        "(line 396,col 9)-(line 396,col 72)",
        "(line 397,col 9)-(line 397,col 69)",
        "(line 398,col 9)-(line 398,col 65)",
        "(line 399,col 9)-(line 399,col 68)",
        "(line 400,col 9)-(line 400,col 67)",
        "(line 401,col 9)-(line 401,col 67)",
        "(line 402,col 9)-(line 402,col 67)",
        "(line 403,col 9)-(line 403,col 68)",
        "(line 404,col 9)-(line 404,col 67)",
        "(line 405,col 9)-(line 405,col 68)",
        "(line 406,col 9)-(line 406,col 68)",
        "(line 407,col 9)-(line 407,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_String()",
      "begin_line": 410,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 26)",
        "(line 412,col 9)-(line 412,col 26)",
        "(line 413,col 9)-(line 413,col 27)",
        "(line 414,col 9)-(line 414,col 27)",
        "(line 415,col 9)-(line 415,col 27)",
        "(line 416,col 9)-(line 416,col 28)",
        "(line 417,col 9)-(line 417,col 75)",
        "(line 418,col 9)-(line 418,col 73)",
        "(line 419,col 9)-(line 419,col 64)",
        "(line 420,col 9)-(line 420,col 64)",
        "(line 421,col 9)-(line 421,col 61)",
        "(line 422,col 9)-(line 422,col 65)",
        "(line 423,col 9)-(line 423,col 68)",
        "(line 424,col 9)-(line 424,col 67)",
        "(line 425,col 9)-(line 425,col 67)",
        "(line 426,col 9)-(line 426,col 67)",
        "(line 427,col 9)-(line 427,col 68)",
        "(line 428,col 9)-(line 428,col 67)",
        "(line 429,col 9)-(line 429,col 68)",
        "(line 430,col 9)-(line 430,col 68)",
        "(line 431,col 9)-(line 431,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsWhitespace()",
      "begin_line": 434,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 58)",
        "(line 436,col 9)-(line 436,col 58)",
        "(line 437,col 9)-(line 437,col 59)",
        "(line 438,col 9)-(line 438,col 59)",
        "(line 439,col 9)-(line 439,col 59)",
        "(line 440,col 9)-(line 440,col 60)",
        "(line 441,col 9)-(line 441,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEquals()",
      "begin_line": 444,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 59)",
        "(line 446,col 9)-(line 446,col 57)",
        "(line 447,col 9)-(line 447,col 94)",
        "(line 448,col 9)-(line 448,col 95)",
        "(line 449,col 9)-(line 449,col 58)",
        "(line 450,col 9)-(line 450,col 59)",
        "(line 451,col 9)-(line 451,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsIgnoreCase()",
      "begin_line": 454,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 69)",
        "(line 456,col 9)-(line 456,col 67)",
        "(line 457,col 9)-(line 457,col 104)",
        "(line 458,col 9)-(line 458,col 104)",
        "(line 459,col 9)-(line 459,col 68)",
        "(line 460,col 9)-(line 460,col 69)",
        "(line 461,col 9)-(line 461,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_char()",
      "begin_line": 465,
      "end_line": 470,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 57)",
        "(line 467,col 9)-(line 467,col 55)",
        "(line 468,col 9)-(line 468,col 62)",
        "(line 469,col 9)-(line 469,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_charInt()",
      "begin_line": 472,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 60)",
        "(line 474,col 9)-(line 474,col 61)",
        "(line 475,col 9)-(line 475,col 58)",
        "(line 476,col 9)-(line 476,col 59)",
        "(line 477,col 9)-(line 477,col 65)",
        "(line 478,col 9)-(line 478,col 65)",
        "(line 479,col 9)-(line 479,col 65)",
        "(line 480,col 9)-(line 480,col 66)",
        "(line 481,col 9)-(line 481,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_String()",
      "begin_line": 484,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 58)",
        "(line 486,col 9)-(line 486,col 56)",
        "(line 487,col 9)-(line 487,col 53)",
        "(line 488,col 9)-(line 488,col 62)",
        "(line 489,col 9)-(line 489,col 62)",
        "(line 490,col 9)-(line 490,col 63)",
        "(line 491,col 9)-(line 491,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_StringInt()",
      "begin_line": 494,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 61)",
        "(line 496,col 9)-(line 496,col 62)",
        "(line 497,col 9)-(line 497,col 59)",
        "(line 498,col 9)-(line 498,col 60)",
        "(line 499,col 9)-(line 499,col 59)",
        "(line 500,col 9)-(line 500,col 60)",
        "(line 501,col 9)-(line 501,col 56)",
        "(line 502,col 9)-(line 502,col 57)",
        "(line 503,col 9)-(line 503,col 56)",
        "(line 504,col 9)-(line 504,col 59)",
        "(line 505,col 9)-(line 505,col 60)",
        "(line 506,col 9)-(line 506,col 59)",
        "(line 507,col 9)-(line 507,col 59)",
        "(line 508,col 9)-(line 508,col 65)",
        "(line 509,col 9)-(line 509,col 65)",
        "(line 510,col 9)-(line 510,col 66)",
        "(line 511,col 9)-(line 511,col 65)",
        "(line 512,col 9)-(line 512,col 66)",
        "(line 513,col 9)-(line 513,col 66)",
        "(line 514,col 9)-(line 514,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArray()",
      "begin_line": 517,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 70)",
        "(line 519,col 9)-(line 519,col 68)",
        "(line 520,col 9)-(line 520,col 77)",
        "(line 522,col 9)-(line 522,col 68)",
        "(line 523,col 9)-(line 523,col 66)",
        "(line 524,col 9)-(line 524,col 75)",
        "(line 526,col 9)-(line 526,col 78)",
        "(line 527,col 9)-(line 527,col 76)",
        "(line 528,col 9)-(line 528,col 84)",
        "(line 529,col 9)-(line 529,col 84)",
        "(line 530,col 9)-(line 530,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 536,
      "end_line": 541,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 99)",
        "(line 538,col 9)-(line 538,col 99)",
        "(line 539,col 9)-(line 539,col 86)",
        "(line 540,col 9)-(line 540,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringString()",
      "begin_line": 543,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 70)",
        "(line 545,col 9)-(line 545,col 59)",
        "(line 546,col 9)-(line 546,col 61)",
        "(line 548,col 9)-(line 548,col 68)",
        "(line 549,col 9)-(line 549,col 57)",
        "(line 550,col 9)-(line 550,col 59)",
        "(line 552,col 9)-(line 552,col 78)",
        "(line 553,col 9)-(line 553,col 67)",
        "(line 554,col 9)-(line 554,col 68)",
        "(line 555,col 9)-(line 555,col 68)",
        "(line 556,col 9)-(line 556,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringArray()",
      "begin_line": 559,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 72)",
        "(line 561,col 9)-(line 561,col 73)",
        "(line 562,col 9)-(line 562,col 74)",
        "(line 563,col 9)-(line 563,col 74)",
        "(line 564,col 9)-(line 564,col 72)",
        "(line 565,col 9)-(line 565,col 70)",
        "(line 566,col 9)-(line 566,col 68)",
        "(line 567,col 9)-(line 567,col 80)",
        "(line 568,col 9)-(line 568,col 75)",
        "(line 569,col 9)-(line 569,col 71)",
        "(line 570,col 9)-(line 570,col 73)",
        "(line 571,col 9)-(line 571,col 74)",
        "(line 572,col 9)-(line 572,col 78)",
        "(line 573,col 9)-(line 573,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringWithSupplementaryChars()",
      "begin_line": 579,
      "end_line": 584,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 85)",
        "(line 581,col 9)-(line 581,col 85)",
        "(line 582,col 9)-(line 582,col 72)",
        "(line 583,col 9)-(line 583,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArray()",
      "begin_line": 586,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 73)",
        "(line 588,col 9)-(line 588,col 71)",
        "(line 589,col 9)-(line 589,col 80)",
        "(line 591,col 9)-(line 591,col 71)",
        "(line 592,col 9)-(line 592,col 69)",
        "(line 593,col 9)-(line 593,col 78)",
        "(line 595,col 9)-(line 595,col 81)",
        "(line 596,col 9)-(line 596,col 79)",
        "(line 597,col 9)-(line 597,col 87)",
        "(line 598,col 9)-(line 598,col 87)",
        "(line 599,col 9)-(line 599,col 82)",
        "(line 600,col 9)-(line 600,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArrayWithSupplementaryChars()",
      "begin_line": 604,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 102)",
        "(line 606,col 9)-(line 606,col 102)",
        "(line 607,col 9)-(line 607,col 90)",
        "(line 608,col 9)-(line 608,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringString()",
      "begin_line": 611,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 73)",
        "(line 613,col 9)-(line 613,col 62)",
        "(line 614,col 9)-(line 614,col 64)",
        "(line 616,col 9)-(line 616,col 71)",
        "(line 617,col 9)-(line 617,col 60)",
        "(line 618,col 9)-(line 618,col 62)",
        "(line 620,col 9)-(line 620,col 81)",
        "(line 621,col 9)-(line 621,col 70)",
        "(line 622,col 9)-(line 622,col 71)",
        "(line 623,col 9)-(line 623,col 71)",
        "(line 624,col 9)-(line 624,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringStringWithSupplementaryChars()",
      "begin_line": 627,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 88)",
        "(line 629,col 9)-(line 629,col 88)",
        "(line 630,col 9)-(line 630,col 76)",
        "(line 631,col 9)-(line 631,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_String()",
      "begin_line": 634,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 68)",
        "(line 636,col 9)-(line 636,col 66)",
        "(line 637,col 9)-(line 637,col 66)",
        "(line 638,col 9)-(line 638,col 63)",
        "(line 639,col 9)-(line 639,col 72)",
        "(line 640,col 9)-(line 640,col 72)",
        "(line 641,col 9)-(line 641,col 72)",
        "(line 642,col 9)-(line 642,col 72)",
        "(line 643,col 9)-(line 643,col 73)",
        "(line 644,col 9)-(line 644,col 73)",
        "(line 645,col 9)-(line 645,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_StringInt()",
      "begin_line": 648,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 77)",
        "(line 650,col 9)-(line 650,col 76)",
        "(line 651,col 9)-(line 651,col 76)",
        "(line 652,col 9)-(line 652,col 76)",
        "(line 653,col 9)-(line 653,col 76)",
        "(line 654,col 9)-(line 654,col 76)",
        "(line 655,col 9)-(line 655,col 77)",
        "(line 656,col 9)-(line 656,col 77)",
        "(line 657,col 9)-(line 657,col 77)",
        "(line 658,col 9)-(line 658,col 77)",
        "(line 659,col 9)-(line 659,col 71)",
        "(line 660,col 9)-(line 660,col 74)",
        "(line 661,col 9)-(line 661,col 72)",
        "(line 662,col 9)-(line 662,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_char()",
      "begin_line": 665,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 61)",
        "(line 667,col 9)-(line 667,col 59)",
        "(line 668,col 9)-(line 668,col 66)",
        "(line 669,col 9)-(line 669,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_charInt()",
      "begin_line": 672,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 64)",
        "(line 674,col 9)-(line 674,col 65)",
        "(line 675,col 9)-(line 675,col 62)",
        "(line 676,col 9)-(line 676,col 63)",
        "(line 677,col 9)-(line 677,col 69)",
        "(line 678,col 9)-(line 678,col 69)",
        "(line 679,col 9)-(line 679,col 69)",
        "(line 680,col 9)-(line 680,col 69)",
        "(line 681,col 9)-(line 681,col 71)",
        "(line 682,col 9)-(line 682,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_String()",
      "begin_line": 685,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 62)",
        "(line 687,col 9)-(line 687,col 60)",
        "(line 688,col 9)-(line 688,col 59)",
        "(line 689,col 9)-(line 689,col 57)",
        "(line 690,col 9)-(line 690,col 65)",
        "(line 691,col 9)-(line 691,col 66)",
        "(line 692,col 9)-(line 692,col 66)",
        "(line 693,col 9)-(line 693,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_StringInt()",
      "begin_line": 696,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 65)",
        "(line 698,col 9)-(line 698,col 66)",
        "(line 699,col 9)-(line 699,col 63)",
        "(line 700,col 9)-(line 700,col 64)",
        "(line 701,col 9)-(line 701,col 63)",
        "(line 702,col 9)-(line 702,col 64)",
        "(line 703,col 9)-(line 703,col 60)",
        "(line 704,col 9)-(line 704,col 62)",
        "(line 705,col 9)-(line 705,col 60)",
        "(line 706,col 9)-(line 706,col 63)",
        "(line 707,col 9)-(line 707,col 65)",
        "(line 708,col 9)-(line 708,col 63)",
        "(line 709,col 9)-(line 709,col 69)",
        "(line 710,col 9)-(line 710,col 69)",
        "(line 711,col 9)-(line 711,col 70)",
        "(line 712,col 9)-(line 712,col 69)",
        "(line 713,col 9)-(line 713,col 69)",
        "(line 714,col 9)-(line 714,col 71)",
        "(line 715,col 9)-(line 715,col 70)",
        "(line 716,col 9)-(line 716,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfAny_StringStringArray()",
      "begin_line": 719,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 65)",
        "(line 721,col 9)-(line 721,col 77)",
        "(line 722,col 9)-(line 722,col 67)",
        "(line 723,col 9)-(line 723,col 78)",
        "(line 724,col 9)-(line 724,col 76)",
        "(line 725,col 9)-(line 725,col 74)",
        "(line 726,col 9)-(line 726,col 72)",
        "(line 727,col 9)-(line 727,col 84)",
        "(line 728,col 9)-(line 728,col 79)",
        "(line 729,col 9)-(line 729,col 75)",
        "(line 730,col 9)-(line 730,col 77)",
        "(line 731,col 9)-(line 731,col 78)",
        "(line 732,col 9)-(line 732,col 82)",
        "(line 733,col 9)-(line 733,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_String()",
      "begin_line": 736,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 72)",
        "(line 738,col 9)-(line 738,col 70)",
        "(line 739,col 9)-(line 739,col 70)",
        "(line 740,col 9)-(line 740,col 69)",
        "(line 741,col 9)-(line 741,col 67)",
        "(line 742,col 9)-(line 742,col 75)",
        "(line 743,col 9)-(line 743,col 76)",
        "(line 744,col 9)-(line 744,col 76)",
        "(line 745,col 9)-(line 745,col 76)",
        "(line 746,col 9)-(line 746,col 76)",
        "(line 747,col 9)-(line 747,col 77)",
        "(line 748,col 9)-(line 748,col 77)",
        "(line 749,col 9)-(line 749,col 73)",
        "(line 750,col 9)-(line 750,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_StringInt()",
      "begin_line": 753,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 75)",
        "(line 755,col 9)-(line 755,col 76)",
        "(line 756,col 9)-(line 756,col 73)",
        "(line 757,col 9)-(line 757,col 74)",
        "(line 758,col 9)-(line 758,col 73)",
        "(line 759,col 9)-(line 759,col 74)",
        "(line 760,col 9)-(line 760,col 70)",
        "(line 761,col 9)-(line 761,col 72)",
        "(line 762,col 9)-(line 762,col 70)",
        "(line 763,col 9)-(line 763,col 73)",
        "(line 764,col 9)-(line 764,col 75)",
        "(line 765,col 9)-(line 765,col 73)",
        "(line 766,col 9)-(line 766,col 79)",
        "(line 767,col 9)-(line 767,col 79)",
        "(line 768,col 9)-(line 768,col 80)",
        "(line 769,col 9)-(line 769,col 79)",
        "(line 770,col 9)-(line 770,col 79)",
        "(line 771,col 9)-(line 771,col 81)",
        "(line 772,col 9)-(line 772,col 80)",
        "(line 773,col 9)-(line 773,col 79)",
        "(line 774,col 9)-(line 774,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastOrdinalIndexOf()",
      "begin_line": 777,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 73)",
        "(line 779,col 9)-(line 779,col 73)",
        "(line 780,col 9)-(line 780,col 69)",
        "(line 781,col 9)-(line 781,col 77)",
        "(line 782,col 9)-(line 782,col 77)",
        "(line 783,col 9)-(line 783,col 77)",
        "(line 784,col 9)-(line 784,col 77)",
        "(line 785,col 9)-(line 785,col 78)",
        "(line 786,col 9)-(line 786,col 78)",
        "(line 787,col 9)-(line 787,col 76)",
        "(line 788,col 9)-(line 788,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testOrdinalIndexOf()",
      "begin_line": 791,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 84)",
        "(line 793,col 9)-(line 793,col 82)",
        "(line 794,col 9)-(line 794,col 80)",
        "(line 795,col 9)-(line 795,col 89)",
        "(line 796,col 9)-(line 796,col 89)",
        "(line 797,col 9)-(line 797,col 90)",
        "(line 798,col 9)-(line 798,col 88)",
        "(line 800,col 9)-(line 800,col 69)",
        "(line 801,col 9)-(line 801,col 67)",
        "(line 802,col 9)-(line 802,col 65)",
        "(line 803,col 9)-(line 803,col 74)",
        "(line 804,col 9)-(line 804,col 74)",
        "(line 805,col 9)-(line 805,col 75)",
        "(line 806,col 9)-(line 806,col 73)",
        "(line 808,col 9)-(line 808,col 68)",
        "(line 809,col 9)-(line 809,col 66)",
        "(line 810,col 9)-(line 810,col 64)",
        "(line 811,col 9)-(line 811,col 73)",
        "(line 812,col 9)-(line 812,col 73)",
        "(line 813,col 9)-(line 813,col 74)",
        "(line 814,col 9)-(line 814,col 72)",
        "(line 816,col 9)-(line 816,col 68)",
        "(line 817,col 9)-(line 817,col 66)",
        "(line 818,col 9)-(line 818,col 63)",
        "(line 819,col 9)-(line 819,col 72)",
        "(line 820,col 9)-(line 820,col 72)",
        "(line 821,col 9)-(line 821,col 73)",
        "(line 822,col 9)-(line 822,col 71)",
        "(line 824,col 9)-(line 824,col 68)",
        "(line 825,col 9)-(line 825,col 66)",
        "(line 826,col 9)-(line 826,col 63)",
        "(line 827,col 9)-(line 827,col 72)",
        "(line 828,col 9)-(line 828,col 72)",
        "(line 829,col 9)-(line 829,col 73)",
        "(line 830,col 9)-(line 830,col 71)",
        "(line 832,col 9)-(line 832,col 84)",
        "(line 833,col 9)-(line 833,col 82)",
        "(line 834,col 9)-(line 834,col 79)",
        "(line 835,col 9)-(line 835,col 89)",
        "(line 836,col 9)-(line 836,col 89)",
        "(line 837,col 9)-(line 837,col 90)",
        "(line 838,col 9)-(line 838,col 87)",
        "(line 840,col 9)-(line 840,col 74)",
        "(line 841,col 9)-(line 841,col 73)",
        "(line 842,col 9)-(line 842,col 73)",
        "(line 843,col 9)-(line 843,col 73)",
        "(line 844,col 9)-(line 844,col 73)",
        "(line 845,col 9)-(line 845,col 73)",
        "(line 846,col 9)-(line 846,col 73)",
        "(line 847,col 9)-(line 847,col 73)",
        "(line 848,col 9)-(line 848,col 73)",
        "(line 849,col 9)-(line 849,col 73)",
        "(line 850,col 9)-(line 850,col 75)"
      ]
    }
  ]
}