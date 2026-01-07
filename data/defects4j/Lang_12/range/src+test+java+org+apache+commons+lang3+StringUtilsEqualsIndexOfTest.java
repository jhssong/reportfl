{
  "filepath": "/tmp/Lang-12b/src/test/java/org/apache/commons/lang3/StringUtilsEqualsIndexOfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilsEqualsIndexOfTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 939,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BAR"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CharU20000"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Supplementary character U+20000\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharU20001"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Supplementary character U+20001\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharHigh"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Incomplete supplementary character U+20000, high surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharLow"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Incomplete supplementary character U+20000, low surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOO"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR_SUB_ARRAY"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.StringUtilsEqualsIndexOfTest(java.lang.String)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_Char()",
      "begin_line": 66,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 61)",
        "(line 68,col 9)-(line 68,col 59)",
        "(line 69,col 9)-(line 69,col 60)",
        "(line 70,col 9)-(line 70,col 62)",
        "(line 71,col 9)-(line 71,col 61)",
        "(line 72,col 9)-(line 72,col 61)",
        "(line 73,col 9)-(line 73,col 61)",
        "(line 74,col 9)-(line 74,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_String()",
      "begin_line": 77,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 62)",
        "(line 79,col 9)-(line 79,col 60)",
        "(line 80,col 9)-(line 80,col 61)",
        "(line 81,col 9)-(line 81,col 60)",
        "(line 82,col 9)-(line 82,col 57)",
        "(line 83,col 9)-(line 83,col 59)",
        "(line 84,col 9)-(line 84,col 61)",
        "(line 85,col 9)-(line 85,col 61)",
        "(line 86,col 9)-(line 86,col 61)",
        "(line 87,col 9)-(line 87,col 63)",
        "(line 88,col 9)-(line 88,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithBadSupplementaryChars()",
      "begin_line": 94,
      "end_line": 103,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 81)",
        "(line 97,col 9)-(line 97,col 80)",
        "(line 98,col 9)-(line 98,col 81)",
        "(line 99,col 9)-(line 99,col 62)",
        "(line 100,col 9)-(line 100,col 79)",
        "(line 101,col 9)-(line 101,col 91)",
        "(line 102,col 9)-(line 102,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithSupplementaryChars()",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 86)",
        "(line 110,col 9)-(line 110,col 86)",
        "(line 111,col 9)-(line 111,col 73)",
        "(line 112,col 9)-(line 112,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArray()",
      "begin_line": 115,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 66)",
        "(line 117,col 9)-(line 117,col 64)",
        "(line 118,col 9)-(line 118,col 76)",
        "(line 120,col 9)-(line 120,col 64)",
        "(line 121,col 9)-(line 121,col 62)",
        "(line 122,col 9)-(line 122,col 74)",
        "(line 124,col 9)-(line 124,col 74)",
        "(line 125,col 9)-(line 125,col 72)",
        "(line 126,col 9)-(line 126,col 83)",
        "(line 127,col 9)-(line 127,col 83)",
        "(line 128,col 9)-(line 128,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithBadSupplementaryChars()",
      "begin_line": 134,
      "end_line": 143,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 98)",
        "(line 137,col 9)-(line 137,col 114)",
        "(line 138,col 9)-(line 138,col 63)",
        "(line 139,col 9)-(line 139,col 97)",
        "(line 140,col 9)-(line 140,col 98)",
        "(line 141,col 9)-(line 141,col 62)",
        "(line 142,col 9)-(line 142,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 103)",
        "(line 150,col 9)-(line 150,col 102)",
        "(line 151,col 9)-(line 151,col 102)",
        "(line 152,col 9)-(line 152,col 102)",
        "(line 153,col 9)-(line 153,col 103)",
        "(line 154,col 9)-(line 154,col 90)",
        "(line 156,col 9)-(line 156,col 57)",
        "(line 157,col 9)-(line 157,col 66)",
        "(line 158,col 9)-(line 158,col 67)",
        "(line 160,col 9)-(line 160,col 91)",
        "(line 161,col 9)-(line 161,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringString()",
      "begin_line": 164,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 66)",
        "(line 166,col 9)-(line 166,col 55)",
        "(line 167,col 9)-(line 167,col 57)",
        "(line 169,col 9)-(line 169,col 64)",
        "(line 170,col 9)-(line 170,col 53)",
        "(line 171,col 9)-(line 171,col 55)",
        "(line 173,col 9)-(line 173,col 74)",
        "(line 174,col 9)-(line 174,col 63)",
        "(line 175,col 9)-(line 175,col 64)",
        "(line 176,col 9)-(line 176,col 64)",
        "(line 177,col 9)-(line 177,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithBadSupplementaryChars()",
      "begin_line": 183,
      "end_line": 191,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 84)",
        "(line 186,col 9)-(line 186,col 63)",
        "(line 187,col 9)-(line 187,col 83)",
        "(line 188,col 9)-(line 188,col 84)",
        "(line 189,col 9)-(line 189,col 62)",
        "(line 190,col 9)-(line 190,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithSupplementaryChars()",
      "begin_line": 196,
      "end_line": 207,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 89)",
        "(line 198,col 9)-(line 198,col 89)",
        "(line 199,col 9)-(line 199,col 76)",
        "(line 201,col 9)-(line 201,col 57)",
        "(line 202,col 9)-(line 202,col 66)",
        "(line 203,col 9)-(line 203,col 67)",
        "(line 205,col 9)-(line 205,col 77)",
        "(line 206,col 9)-(line 206,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_LocaleIndependence()",
      "begin_line": 209,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 42)",
        "(line 212,col 9)-(line 212,col 85)",
        "(line 214,col 9)-(line 220,col 10)",
        "(line 222,col 9)-(line 224,col 10)",
        "(line 226,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_StringString()",
      "begin_line": 243,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 64)",
        "(line 247,col 9)-(line 247,col 62)",
        "(line 248,col 9)-(line 248,col 63)",
        "(line 249,col 9)-(line 249,col 65)",
        "(line 251,col 9)-(line 251,col 62)",
        "(line 252,col 9)-(line 252,col 63)",
        "(line 253,col 9)-(line 253,col 65)",
        "(line 256,col 9)-(line 256,col 59)",
        "(line 257,col 9)-(line 257,col 60)",
        "(line 258,col 9)-(line 258,col 62)",
        "(line 261,col 9)-(line 261,col 61)",
        "(line 262,col 9)-(line 262,col 61)",
        "(line 263,col 9)-(line 263,col 63)",
        "(line 264,col 9)-(line 264,col 61)",
        "(line 265,col 9)-(line 265,col 61)",
        "(line 266,col 9)-(line 266,col 63)",
        "(line 269,col 9)-(line 269,col 63)",
        "(line 270,col 9)-(line 270,col 64)",
        "(line 271,col 9)-(line 271,col 67)",
        "(line 272,col 9)-(line 272,col 63)",
        "(line 273,col 9)-(line 273,col 64)",
        "(line 274,col 9)-(line 274,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArray()",
      "begin_line": 277,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 26)",
        "(line 279,col 9)-(line 279,col 26)",
        "(line 280,col 9)-(line 280,col 28)",
        "(line 281,col 9)-(line 281,col 29)",
        "(line 282,col 9)-(line 282,col 29)",
        "(line 283,col 9)-(line 283,col 34)",
        "(line 284,col 9)-(line 284,col 40)",
        "(line 285,col 9)-(line 285,col 74)",
        "(line 286,col 9)-(line 286,col 72)",
        "(line 287,col 9)-(line 287,col 71)",
        "(line 288,col 9)-(line 288,col 71)",
        "(line 289,col 9)-(line 289,col 69)",
        "(line 290,col 9)-(line 290,col 65)",
        "(line 291,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 292,col 67)",
        "(line 293,col 9)-(line 293,col 67)",
        "(line 294,col 9)-(line 294,col 68)",
        "(line 295,col 9)-(line 295,col 67)",
        "(line 296,col 9)-(line 296,col 67)",
        "(line 297,col 9)-(line 297,col 68)",
        "(line 298,col 9)-(line 298,col 68)",
        "(line 299,col 9)-(line 299,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithBadSupplementaryChars()",
      "begin_line": 305,
      "end_line": 314,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 98)",
        "(line 308,col 9)-(line 308,col 63)",
        "(line 309,col 9)-(line 309,col 97)",
        "(line 310,col 9)-(line 310,col 64)",
        "(line 311,col 9)-(line 311,col 98)",
        "(line 312,col 9)-(line 312,col 62)",
        "(line 313,col 9)-(line 313,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithSupplementaryChars()",
      "begin_line": 319,
      "end_line": 330,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 105)",
        "(line 321,col 9)-(line 321,col 105)",
        "(line 322,col 9)-(line 322,col 92)",
        "(line 324,col 9)-(line 324,col 57)",
        "(line 325,col 9)-(line 325,col 66)",
        "(line 326,col 9)-(line 326,col 67)",
        "(line 328,col 9)-(line 328,col 91)",
        "(line 329,col 9)-(line 329,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_String()",
      "begin_line": 332,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 26)",
        "(line 334,col 9)-(line 334,col 26)",
        "(line 335,col 9)-(line 335,col 28)",
        "(line 336,col 9)-(line 336,col 27)",
        "(line 337,col 9)-(line 337,col 27)",
        "(line 338,col 9)-(line 338,col 28)",
        "(line 339,col 9)-(line 339,col 74)",
        "(line 340,col 9)-(line 340,col 72)",
        "(line 341,col 9)-(line 341,col 63)",
        "(line 342,col 9)-(line 342,col 63)",
        "(line 343,col 9)-(line 343,col 61)",
        "(line 344,col 9)-(line 344,col 65)",
        "(line 345,col 9)-(line 345,col 67)",
        "(line 346,col 9)-(line 346,col 67)",
        "(line 347,col 9)-(line 347,col 67)",
        "(line 348,col 9)-(line 348,col 68)",
        "(line 349,col 9)-(line 349,col 67)",
        "(line 350,col 9)-(line 350,col 67)",
        "(line 351,col 9)-(line 351,col 68)",
        "(line 352,col 9)-(line 352,col 68)",
        "(line 353,col 9)-(line 353,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithBadSupplementaryChars()",
      "begin_line": 359,
      "end_line": 368,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 84)",
        "(line 362,col 9)-(line 362,col 63)",
        "(line 363,col 9)-(line 363,col 83)",
        "(line 364,col 9)-(line 364,col 64)",
        "(line 365,col 9)-(line 365,col 84)",
        "(line 366,col 9)-(line 366,col 62)",
        "(line 367,col 9)-(line 367,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithSupplementaryChars()",
      "begin_line": 373,
      "end_line": 384,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 91)",
        "(line 375,col 9)-(line 375,col 91)",
        "(line 376,col 9)-(line 376,col 78)",
        "(line 378,col 9)-(line 378,col 57)",
        "(line 379,col 9)-(line 379,col 66)",
        "(line 380,col 9)-(line 380,col 67)",
        "(line 382,col 9)-(line 382,col 77)",
        "(line 383,col 9)-(line 383,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_CharArray()",
      "begin_line": 386,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 26)",
        "(line 388,col 9)-(line 388,col 26)",
        "(line 389,col 9)-(line 389,col 27)",
        "(line 390,col 9)-(line 390,col 29)",
        "(line 391,col 9)-(line 391,col 29)",
        "(line 392,col 9)-(line 392,col 34)",
        "(line 393,col 9)-(line 393,col 40)",
        "(line 394,col 9)-(line 394,col 75)",
        "(line 395,col 9)-(line 395,col 73)",
        "(line 396,col 9)-(line 396,col 72)",
        "(line 397,col 9)-(line 397,col 72)",
        "(line 398,col 9)-(line 398,col 69)",
        "(line 399,col 9)-(line 399,col 65)",
        "(line 400,col 9)-(line 400,col 68)",
        "(line 401,col 9)-(line 401,col 67)",
        "(line 402,col 9)-(line 402,col 67)",
        "(line 403,col 9)-(line 403,col 67)",
        "(line 404,col 9)-(line 404,col 68)",
        "(line 405,col 9)-(line 405,col 67)",
        "(line 406,col 9)-(line 406,col 68)",
        "(line 407,col 9)-(line 407,col 68)",
        "(line 408,col 9)-(line 408,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_String()",
      "begin_line": 411,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 26)",
        "(line 413,col 9)-(line 413,col 26)",
        "(line 414,col 9)-(line 414,col 27)",
        "(line 415,col 9)-(line 415,col 27)",
        "(line 416,col 9)-(line 416,col 27)",
        "(line 417,col 9)-(line 417,col 28)",
        "(line 418,col 9)-(line 418,col 75)",
        "(line 419,col 9)-(line 419,col 73)",
        "(line 420,col 9)-(line 420,col 64)",
        "(line 421,col 9)-(line 421,col 64)",
        "(line 422,col 9)-(line 422,col 61)",
        "(line 423,col 9)-(line 423,col 65)",
        "(line 424,col 9)-(line 424,col 68)",
        "(line 425,col 9)-(line 425,col 67)",
        "(line 426,col 9)-(line 426,col 67)",
        "(line 427,col 9)-(line 427,col 67)",
        "(line 428,col 9)-(line 428,col 68)",
        "(line 429,col 9)-(line 429,col 67)",
        "(line 430,col 9)-(line 430,col 68)",
        "(line 431,col 9)-(line 431,col 68)",
        "(line 432,col 9)-(line 432,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsWhitespace()",
      "begin_line": 435,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 58)",
        "(line 437,col 9)-(line 437,col 58)",
        "(line 438,col 9)-(line 438,col 59)",
        "(line 439,col 9)-(line 439,col 59)",
        "(line 440,col 9)-(line 440,col 59)",
        "(line 441,col 9)-(line 441,col 60)",
        "(line 442,col 9)-(line 442,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CustomCharSequence",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence"
      ],
      "begin_line": 449,
      "end_line": 484,
      "comment": " `seq` may equal the other object."
    },
    {
      "type": "field",
      "varNames": [
        "seq"
      ],
      "begin_line": 450,
      "end_line": 450,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.CustomCharSequence(java.lang.CharSequence)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 453,col 13)-(line 453,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.charAt(int)",
      "begin_line": 456,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 458,col 13)-(line 458,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.length()",
      "begin_line": 461,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.subSequence(int, int)",
      "begin_line": 466,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 13)-(line 468,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.equals(java.lang.Object)",
      "begin_line": 471,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 473,col 13)-(line 475,col 13)",
        "(line 476,col 13)-(line 476,col 64)",
        "(line 477,col 13)-(line 477,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.toString()",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCustomCharSequence()",
      "begin_line": 486,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 93)",
        "(line 488,col 9)-(line 488,col 93)",
        "(line 489,col 9)-(line 489,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEquals()",
      "begin_line": 492,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 71)",
        "(line 494,col 9)-(line 494,col 51)",
        "(line 495,col 9)-(line 495,col 53)",
        "(line 496,col 9)-(line 496,col 85)",
        "(line 497,col 9)-(line 497,col 103)",
        "(line 498,col 9)-(line 498,col 90)",
        "(line 499,col 9)-(line 499,col 90)",
        "(line 500,col 9)-(line 500,col 104)",
        "(line 501,col 9)-(line 501,col 54)",
        "(line 502,col 9)-(line 502,col 53)",
        "(line 503,col 9)-(line 503,col 53)",
        "(line 504,col 9)-(line 504,col 57)",
        "(line 505,col 9)-(line 505,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsOnStrings()",
      "begin_line": 508,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 51)",
        "(line 510,col 9)-(line 510,col 49)",
        "(line 511,col 9)-(line 511,col 86)",
        "(line 512,col 9)-(line 512,col 87)",
        "(line 513,col 9)-(line 513,col 50)",
        "(line 514,col 9)-(line 514,col 51)",
        "(line 515,col 9)-(line 515,col 51)",
        "(line 516,col 9)-(line 516,col 53)",
        "(line 517,col 9)-(line 517,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsIgnoreCase()",
      "begin_line": 520,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 69)",
        "(line 522,col 9)-(line 522,col 67)",
        "(line 523,col 9)-(line 523,col 104)",
        "(line 524,col 9)-(line 524,col 104)",
        "(line 525,col 9)-(line 525,col 68)",
        "(line 526,col 9)-(line 526,col 69)",
        "(line 527,col 9)-(line 527,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_char()",
      "begin_line": 531,
      "end_line": 538,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 57)",
        "(line 533,col 9)-(line 533,col 55)",
        "(line 534,col 9)-(line 534,col 62)",
        "(line 535,col 9)-(line 535,col 62)",
        "(line 537,col 9)-(line 537,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_charInt()",
      "begin_line": 540,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 60)",
        "(line 542,col 9)-(line 542,col 61)",
        "(line 543,col 9)-(line 543,col 58)",
        "(line 544,col 9)-(line 544,col 59)",
        "(line 545,col 9)-(line 545,col 65)",
        "(line 546,col 9)-(line 546,col 65)",
        "(line 547,col 9)-(line 547,col 65)",
        "(line 548,col 9)-(line 548,col 66)",
        "(line 549,col 9)-(line 549,col 66)",
        "(line 551,col 9)-(line 551,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_String()",
      "begin_line": 554,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 58)",
        "(line 556,col 9)-(line 556,col 56)",
        "(line 557,col 9)-(line 557,col 53)",
        "(line 558,col 9)-(line 558,col 62)",
        "(line 559,col 9)-(line 559,col 62)",
        "(line 560,col 9)-(line 560,col 63)",
        "(line 561,col 9)-(line 561,col 61)",
        "(line 563,col 9)-(line 563,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_StringInt()",
      "begin_line": 566,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 61)",
        "(line 568,col 9)-(line 568,col 62)",
        "(line 569,col 9)-(line 569,col 59)",
        "(line 570,col 9)-(line 570,col 60)",
        "(line 571,col 9)-(line 571,col 59)",
        "(line 572,col 9)-(line 572,col 60)",
        "(line 573,col 9)-(line 573,col 56)",
        "(line 574,col 9)-(line 574,col 57)",
        "(line 575,col 9)-(line 575,col 56)",
        "(line 576,col 9)-(line 576,col 59)",
        "(line 577,col 9)-(line 577,col 60)",
        "(line 578,col 9)-(line 578,col 59)",
        "(line 579,col 9)-(line 579,col 59)",
        "(line 580,col 9)-(line 580,col 65)",
        "(line 581,col 9)-(line 581,col 65)",
        "(line 582,col 9)-(line 582,col 66)",
        "(line 583,col 9)-(line 583,col 65)",
        "(line 584,col 9)-(line 584,col 66)",
        "(line 585,col 9)-(line 585,col 66)",
        "(line 586,col 9)-(line 586,col 63)",
        "(line 588,col 9)-(line 588,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArray()",
      "begin_line": 591,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 70)",
        "(line 593,col 9)-(line 593,col 68)",
        "(line 594,col 9)-(line 594,col 77)",
        "(line 596,col 9)-(line 596,col 68)",
        "(line 597,col 9)-(line 597,col 66)",
        "(line 598,col 9)-(line 598,col 75)",
        "(line 600,col 9)-(line 600,col 78)",
        "(line 601,col 9)-(line 601,col 76)",
        "(line 602,col 9)-(line 602,col 84)",
        "(line 603,col 9)-(line 603,col 84)",
        "(line 604,col 9)-(line 604,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 610,
      "end_line": 615,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 99)",
        "(line 612,col 9)-(line 612,col 99)",
        "(line 613,col 9)-(line 613,col 86)",
        "(line 614,col 9)-(line 614,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringString()",
      "begin_line": 617,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 70)",
        "(line 619,col 9)-(line 619,col 59)",
        "(line 620,col 9)-(line 620,col 61)",
        "(line 622,col 9)-(line 622,col 68)",
        "(line 623,col 9)-(line 623,col 57)",
        "(line 624,col 9)-(line 624,col 59)",
        "(line 626,col 9)-(line 626,col 78)",
        "(line 627,col 9)-(line 627,col 67)",
        "(line 628,col 9)-(line 628,col 68)",
        "(line 629,col 9)-(line 629,col 68)",
        "(line 630,col 9)-(line 630,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringArray()",
      "begin_line": 633,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 72)",
        "(line 635,col 9)-(line 635,col 73)",
        "(line 636,col 9)-(line 636,col 74)",
        "(line 637,col 9)-(line 637,col 74)",
        "(line 638,col 9)-(line 638,col 72)",
        "(line 639,col 9)-(line 639,col 70)",
        "(line 640,col 9)-(line 640,col 68)",
        "(line 641,col 9)-(line 641,col 80)",
        "(line 642,col 9)-(line 642,col 75)",
        "(line 643,col 9)-(line 643,col 71)",
        "(line 644,col 9)-(line 644,col 73)",
        "(line 645,col 9)-(line 645,col 74)",
        "(line 646,col 9)-(line 646,col 78)",
        "(line 647,col 9)-(line 647,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringWithSupplementaryChars()",
      "begin_line": 653,
      "end_line": 658,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 85)",
        "(line 655,col 9)-(line 655,col 85)",
        "(line 656,col 9)-(line 656,col 72)",
        "(line 657,col 9)-(line 657,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArray()",
      "begin_line": 660,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 73)",
        "(line 662,col 9)-(line 662,col 71)",
        "(line 663,col 9)-(line 663,col 80)",
        "(line 665,col 9)-(line 665,col 71)",
        "(line 666,col 9)-(line 666,col 69)",
        "(line 667,col 9)-(line 667,col 78)",
        "(line 669,col 9)-(line 669,col 81)",
        "(line 670,col 9)-(line 670,col 79)",
        "(line 671,col 9)-(line 671,col 87)",
        "(line 672,col 9)-(line 672,col 87)",
        "(line 673,col 9)-(line 673,col 82)",
        "(line 674,col 9)-(line 674,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArrayWithSupplementaryChars()",
      "begin_line": 678,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 102)",
        "(line 680,col 9)-(line 680,col 102)",
        "(line 681,col 9)-(line 681,col 90)",
        "(line 682,col 9)-(line 682,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringString()",
      "begin_line": 685,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 73)",
        "(line 687,col 9)-(line 687,col 62)",
        "(line 688,col 9)-(line 688,col 64)",
        "(line 690,col 9)-(line 690,col 71)",
        "(line 691,col 9)-(line 691,col 60)",
        "(line 692,col 9)-(line 692,col 62)",
        "(line 694,col 9)-(line 694,col 81)",
        "(line 695,col 9)-(line 695,col 70)",
        "(line 696,col 9)-(line 696,col 71)",
        "(line 697,col 9)-(line 697,col 71)",
        "(line 698,col 9)-(line 698,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringStringWithSupplementaryChars()",
      "begin_line": 701,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 88)",
        "(line 703,col 9)-(line 703,col 88)",
        "(line 704,col 9)-(line 704,col 76)",
        "(line 705,col 9)-(line 705,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_String()",
      "begin_line": 708,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 68)",
        "(line 710,col 9)-(line 710,col 66)",
        "(line 711,col 9)-(line 711,col 66)",
        "(line 712,col 9)-(line 712,col 63)",
        "(line 713,col 9)-(line 713,col 72)",
        "(line 714,col 9)-(line 714,col 72)",
        "(line 715,col 9)-(line 715,col 72)",
        "(line 716,col 9)-(line 716,col 72)",
        "(line 717,col 9)-(line 717,col 73)",
        "(line 718,col 9)-(line 718,col 73)",
        "(line 719,col 9)-(line 719,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_StringInt()",
      "begin_line": 722,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 77)",
        "(line 724,col 9)-(line 724,col 76)",
        "(line 725,col 9)-(line 725,col 76)",
        "(line 726,col 9)-(line 726,col 76)",
        "(line 727,col 9)-(line 727,col 76)",
        "(line 728,col 9)-(line 728,col 76)",
        "(line 729,col 9)-(line 729,col 77)",
        "(line 730,col 9)-(line 730,col 77)",
        "(line 731,col 9)-(line 731,col 77)",
        "(line 732,col 9)-(line 732,col 77)",
        "(line 733,col 9)-(line 733,col 71)",
        "(line 734,col 9)-(line 734,col 74)",
        "(line 735,col 9)-(line 735,col 72)",
        "(line 736,col 9)-(line 736,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_char()",
      "begin_line": 739,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 61)",
        "(line 741,col 9)-(line 741,col 59)",
        "(line 742,col 9)-(line 742,col 66)",
        "(line 743,col 9)-(line 743,col 66)",
        "(line 745,col 9)-(line 745,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_charInt()",
      "begin_line": 748,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 64)",
        "(line 750,col 9)-(line 750,col 65)",
        "(line 751,col 9)-(line 751,col 62)",
        "(line 752,col 9)-(line 752,col 63)",
        "(line 753,col 9)-(line 753,col 69)",
        "(line 754,col 9)-(line 754,col 69)",
        "(line 755,col 9)-(line 755,col 69)",
        "(line 756,col 9)-(line 756,col 69)",
        "(line 757,col 9)-(line 757,col 71)",
        "(line 758,col 9)-(line 758,col 69)",
        "(line 760,col 9)-(line 760,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_String()",
      "begin_line": 763,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 62)",
        "(line 765,col 9)-(line 765,col 60)",
        "(line 766,col 9)-(line 766,col 59)",
        "(line 767,col 9)-(line 767,col 57)",
        "(line 768,col 9)-(line 768,col 65)",
        "(line 769,col 9)-(line 769,col 66)",
        "(line 770,col 9)-(line 770,col 66)",
        "(line 771,col 9)-(line 771,col 67)",
        "(line 773,col 9)-(line 773,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_StringInt()",
      "begin_line": 776,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 65)",
        "(line 778,col 9)-(line 778,col 66)",
        "(line 779,col 9)-(line 779,col 63)",
        "(line 780,col 9)-(line 780,col 64)",
        "(line 781,col 9)-(line 781,col 63)",
        "(line 782,col 9)-(line 782,col 64)",
        "(line 783,col 9)-(line 783,col 60)",
        "(line 784,col 9)-(line 784,col 62)",
        "(line 785,col 9)-(line 785,col 60)",
        "(line 786,col 9)-(line 786,col 63)",
        "(line 787,col 9)-(line 787,col 65)",
        "(line 788,col 9)-(line 788,col 63)",
        "(line 789,col 9)-(line 789,col 69)",
        "(line 790,col 9)-(line 790,col 69)",
        "(line 791,col 9)-(line 791,col 70)",
        "(line 792,col 9)-(line 792,col 69)",
        "(line 793,col 9)-(line 793,col 69)",
        "(line 794,col 9)-(line 794,col 71)",
        "(line 795,col 9)-(line 795,col 70)",
        "(line 796,col 9)-(line 796,col 69)",
        "(line 798,col 9)-(line 798,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfAny_StringStringArray()",
      "begin_line": 801,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 80)",
        "(line 803,col 9)-(line 803,col 82)",
        "(line 804,col 9)-(line 804,col 59)",
        "(line 805,col 9)-(line 805,col 77)",
        "(line 806,col 9)-(line 806,col 82)",
        "(line 807,col 9)-(line 807,col 84)",
        "(line 808,col 9)-(line 808,col 61)",
        "(line 809,col 9)-(line 809,col 78)",
        "(line 810,col 9)-(line 810,col 76)",
        "(line 811,col 9)-(line 811,col 74)",
        "(line 812,col 9)-(line 812,col 72)",
        "(line 813,col 9)-(line 813,col 84)",
        "(line 814,col 9)-(line 814,col 79)",
        "(line 815,col 9)-(line 815,col 75)",
        "(line 816,col 9)-(line 816,col 77)",
        "(line 817,col 9)-(line 817,col 78)",
        "(line 818,col 9)-(line 818,col 82)",
        "(line 819,col 9)-(line 819,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_String()",
      "begin_line": 822,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 72)",
        "(line 824,col 9)-(line 824,col 70)",
        "(line 825,col 9)-(line 825,col 70)",
        "(line 826,col 9)-(line 826,col 69)",
        "(line 827,col 9)-(line 827,col 67)",
        "(line 828,col 9)-(line 828,col 75)",
        "(line 829,col 9)-(line 829,col 76)",
        "(line 830,col 9)-(line 830,col 76)",
        "(line 831,col 9)-(line 831,col 76)",
        "(line 832,col 9)-(line 832,col 76)",
        "(line 833,col 9)-(line 833,col 77)",
        "(line 834,col 9)-(line 834,col 77)",
        "(line 835,col 9)-(line 835,col 73)",
        "(line 836,col 9)-(line 836,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_StringInt()",
      "begin_line": 839,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 75)",
        "(line 841,col 9)-(line 841,col 76)",
        "(line 842,col 9)-(line 842,col 73)",
        "(line 843,col 9)-(line 843,col 74)",
        "(line 844,col 9)-(line 844,col 73)",
        "(line 845,col 9)-(line 845,col 74)",
        "(line 846,col 9)-(line 846,col 70)",
        "(line 847,col 9)-(line 847,col 72)",
        "(line 848,col 9)-(line 848,col 70)",
        "(line 849,col 9)-(line 849,col 73)",
        "(line 850,col 9)-(line 850,col 75)",
        "(line 851,col 9)-(line 851,col 73)",
        "(line 852,col 9)-(line 852,col 79)",
        "(line 853,col 9)-(line 853,col 79)",
        "(line 854,col 9)-(line 854,col 80)",
        "(line 855,col 9)-(line 855,col 79)",
        "(line 856,col 9)-(line 856,col 79)",
        "(line 857,col 9)-(line 857,col 81)",
        "(line 858,col 9)-(line 858,col 80)",
        "(line 859,col 9)-(line 859,col 79)",
        "(line 860,col 9)-(line 860,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastOrdinalIndexOf()",
      "begin_line": 863,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 73)",
        "(line 865,col 9)-(line 865,col 73)",
        "(line 866,col 9)-(line 866,col 69)",
        "(line 867,col 9)-(line 867,col 77)",
        "(line 868,col 9)-(line 868,col 77)",
        "(line 869,col 9)-(line 869,col 77)",
        "(line 870,col 9)-(line 870,col 77)",
        "(line 871,col 9)-(line 871,col 78)",
        "(line 872,col 9)-(line 872,col 78)",
        "(line 873,col 9)-(line 873,col 76)",
        "(line 874,col 9)-(line 874,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testOrdinalIndexOf()",
      "begin_line": 877,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 84)",
        "(line 879,col 9)-(line 879,col 82)",
        "(line 880,col 9)-(line 880,col 80)",
        "(line 881,col 9)-(line 881,col 89)",
        "(line 882,col 9)-(line 882,col 89)",
        "(line 883,col 9)-(line 883,col 90)",
        "(line 884,col 9)-(line 884,col 88)",
        "(line 886,col 9)-(line 886,col 69)",
        "(line 887,col 9)-(line 887,col 67)",
        "(line 888,col 9)-(line 888,col 65)",
        "(line 889,col 9)-(line 889,col 74)",
        "(line 890,col 9)-(line 890,col 74)",
        "(line 891,col 9)-(line 891,col 75)",
        "(line 892,col 9)-(line 892,col 73)",
        "(line 894,col 9)-(line 894,col 68)",
        "(line 895,col 9)-(line 895,col 66)",
        "(line 896,col 9)-(line 896,col 64)",
        "(line 897,col 9)-(line 897,col 73)",
        "(line 898,col 9)-(line 898,col 73)",
        "(line 899,col 9)-(line 899,col 74)",
        "(line 900,col 9)-(line 900,col 72)",
        "(line 902,col 9)-(line 902,col 68)",
        "(line 903,col 9)-(line 903,col 66)",
        "(line 904,col 9)-(line 904,col 63)",
        "(line 905,col 9)-(line 905,col 72)",
        "(line 906,col 9)-(line 906,col 72)",
        "(line 907,col 9)-(line 907,col 73)",
        "(line 908,col 9)-(line 908,col 71)",
        "(line 910,col 9)-(line 910,col 68)",
        "(line 911,col 9)-(line 911,col 66)",
        "(line 912,col 9)-(line 912,col 63)",
        "(line 913,col 9)-(line 913,col 72)",
        "(line 914,col 9)-(line 914,col 72)",
        "(line 915,col 9)-(line 915,col 73)",
        "(line 916,col 9)-(line 916,col 71)",
        "(line 918,col 9)-(line 918,col 84)",
        "(line 919,col 9)-(line 919,col 82)",
        "(line 920,col 9)-(line 920,col 79)",
        "(line 921,col 9)-(line 921,col 89)",
        "(line 922,col 9)-(line 922,col 89)",
        "(line 923,col 9)-(line 923,col 90)",
        "(line 924,col 9)-(line 924,col 87)",
        "(line 926,col 9)-(line 926,col 74)",
        "(line 927,col 9)-(line 927,col 73)",
        "(line 928,col 9)-(line 928,col 73)",
        "(line 929,col 9)-(line 929,col 73)",
        "(line 930,col 9)-(line 930,col 73)",
        "(line 931,col 9)-(line 931,col 73)",
        "(line 932,col 9)-(line 932,col 73)",
        "(line 933,col 9)-(line 933,col 73)",
        "(line 934,col 9)-(line 934,col 73)",
        "(line 935,col 9)-(line 935,col 73)",
        "(line 936,col 9)-(line 936,col 75)"
      ]
    }
  ]
}