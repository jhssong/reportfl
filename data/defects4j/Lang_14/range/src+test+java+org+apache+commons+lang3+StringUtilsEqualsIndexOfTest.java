{
  "filepath": "/tmp/Lang-14b/src/test/java/org/apache/commons/lang3/StringUtilsEqualsIndexOfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilsEqualsIndexOfTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 933,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BAR"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CharU20000"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Supplementary character U+20000\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharU20001"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Supplementary character U+20001\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharHigh"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Incomplete supplementary character U+20000, high surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharLow"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Incomplete supplementary character U+20000, low surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOO"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR_SUB_ARRAY"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.StringUtilsEqualsIndexOfTest(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_Char()",
      "begin_line": 64,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 61)",
        "(line 66,col 9)-(line 66,col 59)",
        "(line 67,col 9)-(line 67,col 60)",
        "(line 68,col 9)-(line 68,col 62)",
        "(line 69,col 9)-(line 69,col 61)",
        "(line 70,col 9)-(line 70,col 61)",
        "(line 71,col 9)-(line 71,col 61)",
        "(line 72,col 9)-(line 72,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_String()",
      "begin_line": 75,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 62)",
        "(line 77,col 9)-(line 77,col 60)",
        "(line 78,col 9)-(line 78,col 61)",
        "(line 79,col 9)-(line 79,col 60)",
        "(line 80,col 9)-(line 80,col 57)",
        "(line 81,col 9)-(line 81,col 59)",
        "(line 82,col 9)-(line 82,col 61)",
        "(line 83,col 9)-(line 83,col 61)",
        "(line 84,col 9)-(line 84,col 61)",
        "(line 85,col 9)-(line 85,col 63)",
        "(line 86,col 9)-(line 86,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithBadSupplementaryChars()",
      "begin_line": 92,
      "end_line": 101,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 81)",
        "(line 95,col 9)-(line 95,col 80)",
        "(line 96,col 9)-(line 96,col 81)",
        "(line 97,col 9)-(line 97,col 62)",
        "(line 98,col 9)-(line 98,col 79)",
        "(line 99,col 9)-(line 99,col 91)",
        "(line 100,col 9)-(line 100,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithSupplementaryChars()",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 86)",
        "(line 108,col 9)-(line 108,col 86)",
        "(line 109,col 9)-(line 109,col 73)",
        "(line 110,col 9)-(line 110,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArray()",
      "begin_line": 113,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 66)",
        "(line 115,col 9)-(line 115,col 64)",
        "(line 116,col 9)-(line 116,col 76)",
        "(line 118,col 9)-(line 118,col 64)",
        "(line 119,col 9)-(line 119,col 62)",
        "(line 120,col 9)-(line 120,col 74)",
        "(line 122,col 9)-(line 122,col 74)",
        "(line 123,col 9)-(line 123,col 72)",
        "(line 124,col 9)-(line 124,col 83)",
        "(line 125,col 9)-(line 125,col 83)",
        "(line 126,col 9)-(line 126,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithBadSupplementaryChars()",
      "begin_line": 132,
      "end_line": 141,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 98)",
        "(line 135,col 9)-(line 135,col 114)",
        "(line 136,col 9)-(line 136,col 63)",
        "(line 137,col 9)-(line 137,col 97)",
        "(line 138,col 9)-(line 138,col 98)",
        "(line 139,col 9)-(line 139,col 62)",
        "(line 140,col 9)-(line 140,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 146,
      "end_line": 160,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 103)",
        "(line 148,col 9)-(line 148,col 102)",
        "(line 149,col 9)-(line 149,col 102)",
        "(line 150,col 9)-(line 150,col 102)",
        "(line 151,col 9)-(line 151,col 103)",
        "(line 152,col 9)-(line 152,col 90)",
        "(line 154,col 9)-(line 154,col 57)",
        "(line 155,col 9)-(line 155,col 66)",
        "(line 156,col 9)-(line 156,col 67)",
        "(line 158,col 9)-(line 158,col 91)",
        "(line 159,col 9)-(line 159,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringString()",
      "begin_line": 162,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 66)",
        "(line 164,col 9)-(line 164,col 55)",
        "(line 165,col 9)-(line 165,col 57)",
        "(line 167,col 9)-(line 167,col 64)",
        "(line 168,col 9)-(line 168,col 53)",
        "(line 169,col 9)-(line 169,col 55)",
        "(line 171,col 9)-(line 171,col 74)",
        "(line 172,col 9)-(line 172,col 63)",
        "(line 173,col 9)-(line 173,col 64)",
        "(line 174,col 9)-(line 174,col 64)",
        "(line 175,col 9)-(line 175,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithBadSupplementaryChars()",
      "begin_line": 181,
      "end_line": 189,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 84)",
        "(line 184,col 9)-(line 184,col 63)",
        "(line 185,col 9)-(line 185,col 83)",
        "(line 186,col 9)-(line 186,col 84)",
        "(line 187,col 9)-(line 187,col 62)",
        "(line 188,col 9)-(line 188,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithSupplementaryChars()",
      "begin_line": 194,
      "end_line": 205,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 89)",
        "(line 196,col 9)-(line 196,col 89)",
        "(line 197,col 9)-(line 197,col 76)",
        "(line 199,col 9)-(line 199,col 57)",
        "(line 200,col 9)-(line 200,col 66)",
        "(line 201,col 9)-(line 201,col 67)",
        "(line 203,col 9)-(line 203,col 77)",
        "(line 204,col 9)-(line 204,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_LocaleIndependence()",
      "begin_line": 207,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 42)",
        "(line 210,col 9)-(line 210,col 85)",
        "(line 212,col 9)-(line 218,col 10)",
        "(line 220,col 9)-(line 222,col 10)",
        "(line 224,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_StringString()",
      "begin_line": 241,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 64)",
        "(line 245,col 9)-(line 245,col 62)",
        "(line 246,col 9)-(line 246,col 63)",
        "(line 247,col 9)-(line 247,col 65)",
        "(line 249,col 9)-(line 249,col 62)",
        "(line 250,col 9)-(line 250,col 63)",
        "(line 251,col 9)-(line 251,col 65)",
        "(line 254,col 9)-(line 254,col 59)",
        "(line 255,col 9)-(line 255,col 60)",
        "(line 256,col 9)-(line 256,col 62)",
        "(line 259,col 9)-(line 259,col 61)",
        "(line 260,col 9)-(line 260,col 61)",
        "(line 261,col 9)-(line 261,col 63)",
        "(line 262,col 9)-(line 262,col 61)",
        "(line 263,col 9)-(line 263,col 61)",
        "(line 264,col 9)-(line 264,col 63)",
        "(line 267,col 9)-(line 267,col 63)",
        "(line 268,col 9)-(line 268,col 64)",
        "(line 269,col 9)-(line 269,col 67)",
        "(line 270,col 9)-(line 270,col 63)",
        "(line 271,col 9)-(line 271,col 64)",
        "(line 272,col 9)-(line 272,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArray()",
      "begin_line": 275,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 26)",
        "(line 277,col 9)-(line 277,col 26)",
        "(line 278,col 9)-(line 278,col 28)",
        "(line 279,col 9)-(line 279,col 29)",
        "(line 280,col 9)-(line 280,col 29)",
        "(line 281,col 9)-(line 281,col 34)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 74)",
        "(line 284,col 9)-(line 284,col 72)",
        "(line 285,col 9)-(line 285,col 71)",
        "(line 286,col 9)-(line 286,col 71)",
        "(line 287,col 9)-(line 287,col 69)",
        "(line 288,col 9)-(line 288,col 65)",
        "(line 289,col 9)-(line 289,col 67)",
        "(line 290,col 9)-(line 290,col 67)",
        "(line 291,col 9)-(line 291,col 67)",
        "(line 292,col 9)-(line 292,col 68)",
        "(line 293,col 9)-(line 293,col 67)",
        "(line 294,col 9)-(line 294,col 67)",
        "(line 295,col 9)-(line 295,col 68)",
        "(line 296,col 9)-(line 296,col 68)",
        "(line 297,col 9)-(line 297,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithBadSupplementaryChars()",
      "begin_line": 303,
      "end_line": 312,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 98)",
        "(line 306,col 9)-(line 306,col 63)",
        "(line 307,col 9)-(line 307,col 97)",
        "(line 308,col 9)-(line 308,col 64)",
        "(line 309,col 9)-(line 309,col 98)",
        "(line 310,col 9)-(line 310,col 62)",
        "(line 311,col 9)-(line 311,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithSupplementaryChars()",
      "begin_line": 317,
      "end_line": 328,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 105)",
        "(line 319,col 9)-(line 319,col 105)",
        "(line 320,col 9)-(line 320,col 92)",
        "(line 322,col 9)-(line 322,col 57)",
        "(line 323,col 9)-(line 323,col 66)",
        "(line 324,col 9)-(line 324,col 67)",
        "(line 326,col 9)-(line 326,col 91)",
        "(line 327,col 9)-(line 327,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_String()",
      "begin_line": 330,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 26)",
        "(line 332,col 9)-(line 332,col 26)",
        "(line 333,col 9)-(line 333,col 28)",
        "(line 334,col 9)-(line 334,col 27)",
        "(line 335,col 9)-(line 335,col 27)",
        "(line 336,col 9)-(line 336,col 28)",
        "(line 337,col 9)-(line 337,col 74)",
        "(line 338,col 9)-(line 338,col 72)",
        "(line 339,col 9)-(line 339,col 63)",
        "(line 340,col 9)-(line 340,col 63)",
        "(line 341,col 9)-(line 341,col 61)",
        "(line 342,col 9)-(line 342,col 65)",
        "(line 343,col 9)-(line 343,col 67)",
        "(line 344,col 9)-(line 344,col 67)",
        "(line 345,col 9)-(line 345,col 67)",
        "(line 346,col 9)-(line 346,col 68)",
        "(line 347,col 9)-(line 347,col 67)",
        "(line 348,col 9)-(line 348,col 67)",
        "(line 349,col 9)-(line 349,col 68)",
        "(line 350,col 9)-(line 350,col 68)",
        "(line 351,col 9)-(line 351,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithBadSupplementaryChars()",
      "begin_line": 357,
      "end_line": 366,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 84)",
        "(line 360,col 9)-(line 360,col 63)",
        "(line 361,col 9)-(line 361,col 83)",
        "(line 362,col 9)-(line 362,col 64)",
        "(line 363,col 9)-(line 363,col 84)",
        "(line 364,col 9)-(line 364,col 62)",
        "(line 365,col 9)-(line 365,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithSupplementaryChars()",
      "begin_line": 371,
      "end_line": 382,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 91)",
        "(line 373,col 9)-(line 373,col 91)",
        "(line 374,col 9)-(line 374,col 78)",
        "(line 376,col 9)-(line 376,col 57)",
        "(line 377,col 9)-(line 377,col 66)",
        "(line 378,col 9)-(line 378,col 67)",
        "(line 380,col 9)-(line 380,col 77)",
        "(line 381,col 9)-(line 381,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_CharArray()",
      "begin_line": 384,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 26)",
        "(line 386,col 9)-(line 386,col 26)",
        "(line 387,col 9)-(line 387,col 27)",
        "(line 388,col 9)-(line 388,col 29)",
        "(line 389,col 9)-(line 389,col 29)",
        "(line 390,col 9)-(line 390,col 34)",
        "(line 391,col 9)-(line 391,col 40)",
        "(line 392,col 9)-(line 392,col 75)",
        "(line 393,col 9)-(line 393,col 73)",
        "(line 394,col 9)-(line 394,col 72)",
        "(line 395,col 9)-(line 395,col 72)",
        "(line 396,col 9)-(line 396,col 69)",
        "(line 397,col 9)-(line 397,col 65)",
        "(line 398,col 9)-(line 398,col 68)",
        "(line 399,col 9)-(line 399,col 67)",
        "(line 400,col 9)-(line 400,col 67)",
        "(line 401,col 9)-(line 401,col 67)",
        "(line 402,col 9)-(line 402,col 68)",
        "(line 403,col 9)-(line 403,col 67)",
        "(line 404,col 9)-(line 404,col 68)",
        "(line 405,col 9)-(line 405,col 68)",
        "(line 406,col 9)-(line 406,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_String()",
      "begin_line": 409,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 26)",
        "(line 411,col 9)-(line 411,col 26)",
        "(line 412,col 9)-(line 412,col 27)",
        "(line 413,col 9)-(line 413,col 27)",
        "(line 414,col 9)-(line 414,col 27)",
        "(line 415,col 9)-(line 415,col 28)",
        "(line 416,col 9)-(line 416,col 75)",
        "(line 417,col 9)-(line 417,col 73)",
        "(line 418,col 9)-(line 418,col 64)",
        "(line 419,col 9)-(line 419,col 64)",
        "(line 420,col 9)-(line 420,col 61)",
        "(line 421,col 9)-(line 421,col 65)",
        "(line 422,col 9)-(line 422,col 68)",
        "(line 423,col 9)-(line 423,col 67)",
        "(line 424,col 9)-(line 424,col 67)",
        "(line 425,col 9)-(line 425,col 67)",
        "(line 426,col 9)-(line 426,col 68)",
        "(line 427,col 9)-(line 427,col 67)",
        "(line 428,col 9)-(line 428,col 68)",
        "(line 429,col 9)-(line 429,col 68)",
        "(line 430,col 9)-(line 430,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsWhitespace()",
      "begin_line": 433,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 58)",
        "(line 435,col 9)-(line 435,col 58)",
        "(line 436,col 9)-(line 436,col 59)",
        "(line 437,col 9)-(line 437,col 59)",
        "(line 438,col 9)-(line 438,col 59)",
        "(line 439,col 9)-(line 439,col 60)",
        "(line 440,col 9)-(line 440,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CustomCharSequence",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence"
      ],
      "begin_line": 447,
      "end_line": 478,
      "comment": " `seq` may equal the other object."
    },
    {
      "type": "field",
      "varNames": [
        "seq"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.CustomCharSequence(java.lang.CharSequence)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 13)-(line 451,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.charAt(int)",
      "begin_line": 454,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 455,col 13)-(line 455,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.length()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.subSequence(int, int)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.equals(java.lang.Object)",
      "begin_line": 466,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 468,col 13)-(line 470,col 13)",
        "(line 471,col 13)-(line 471,col 64)",
        "(line 472,col 13)-(line 472,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.toString()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 13)-(line 476,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCustomCharSequence()",
      "begin_line": 480,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 93)",
        "(line 482,col 9)-(line 482,col 93)",
        "(line 483,col 9)-(line 483,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEquals()",
      "begin_line": 486,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 71)",
        "(line 488,col 9)-(line 488,col 51)",
        "(line 489,col 9)-(line 489,col 53)",
        "(line 490,col 9)-(line 490,col 85)",
        "(line 491,col 9)-(line 491,col 103)",
        "(line 492,col 9)-(line 492,col 90)",
        "(line 493,col 9)-(line 493,col 90)",
        "(line 494,col 9)-(line 494,col 104)",
        "(line 495,col 9)-(line 495,col 54)",
        "(line 496,col 9)-(line 496,col 53)",
        "(line 497,col 9)-(line 497,col 53)",
        "(line 498,col 9)-(line 498,col 57)",
        "(line 499,col 9)-(line 499,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsOnStrings()",
      "begin_line": 502,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 51)",
        "(line 504,col 9)-(line 504,col 49)",
        "(line 505,col 9)-(line 505,col 86)",
        "(line 506,col 9)-(line 506,col 87)",
        "(line 507,col 9)-(line 507,col 50)",
        "(line 508,col 9)-(line 508,col 51)",
        "(line 509,col 9)-(line 509,col 51)",
        "(line 510,col 9)-(line 510,col 53)",
        "(line 511,col 9)-(line 511,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsIgnoreCase()",
      "begin_line": 514,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 69)",
        "(line 516,col 9)-(line 516,col 67)",
        "(line 517,col 9)-(line 517,col 104)",
        "(line 518,col 9)-(line 518,col 104)",
        "(line 519,col 9)-(line 519,col 68)",
        "(line 520,col 9)-(line 520,col 69)",
        "(line 521,col 9)-(line 521,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_char()",
      "begin_line": 525,
      "end_line": 532,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 57)",
        "(line 527,col 9)-(line 527,col 55)",
        "(line 528,col 9)-(line 528,col 62)",
        "(line 529,col 9)-(line 529,col 62)",
        "(line 531,col 9)-(line 531,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_charInt()",
      "begin_line": 534,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 60)",
        "(line 536,col 9)-(line 536,col 61)",
        "(line 537,col 9)-(line 537,col 58)",
        "(line 538,col 9)-(line 538,col 59)",
        "(line 539,col 9)-(line 539,col 65)",
        "(line 540,col 9)-(line 540,col 65)",
        "(line 541,col 9)-(line 541,col 65)",
        "(line 542,col 9)-(line 542,col 66)",
        "(line 543,col 9)-(line 543,col 66)",
        "(line 545,col 9)-(line 545,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_String()",
      "begin_line": 548,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 58)",
        "(line 550,col 9)-(line 550,col 56)",
        "(line 551,col 9)-(line 551,col 53)",
        "(line 552,col 9)-(line 552,col 62)",
        "(line 553,col 9)-(line 553,col 62)",
        "(line 554,col 9)-(line 554,col 63)",
        "(line 555,col 9)-(line 555,col 61)",
        "(line 557,col 9)-(line 557,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_StringInt()",
      "begin_line": 560,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 61)",
        "(line 562,col 9)-(line 562,col 62)",
        "(line 563,col 9)-(line 563,col 59)",
        "(line 564,col 9)-(line 564,col 60)",
        "(line 565,col 9)-(line 565,col 59)",
        "(line 566,col 9)-(line 566,col 60)",
        "(line 567,col 9)-(line 567,col 56)",
        "(line 568,col 9)-(line 568,col 57)",
        "(line 569,col 9)-(line 569,col 56)",
        "(line 570,col 9)-(line 570,col 59)",
        "(line 571,col 9)-(line 571,col 60)",
        "(line 572,col 9)-(line 572,col 59)",
        "(line 573,col 9)-(line 573,col 59)",
        "(line 574,col 9)-(line 574,col 65)",
        "(line 575,col 9)-(line 575,col 65)",
        "(line 576,col 9)-(line 576,col 66)",
        "(line 577,col 9)-(line 577,col 65)",
        "(line 578,col 9)-(line 578,col 66)",
        "(line 579,col 9)-(line 579,col 66)",
        "(line 580,col 9)-(line 580,col 63)",
        "(line 582,col 9)-(line 582,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArray()",
      "begin_line": 585,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 70)",
        "(line 587,col 9)-(line 587,col 68)",
        "(line 588,col 9)-(line 588,col 77)",
        "(line 590,col 9)-(line 590,col 68)",
        "(line 591,col 9)-(line 591,col 66)",
        "(line 592,col 9)-(line 592,col 75)",
        "(line 594,col 9)-(line 594,col 78)",
        "(line 595,col 9)-(line 595,col 76)",
        "(line 596,col 9)-(line 596,col 84)",
        "(line 597,col 9)-(line 597,col 84)",
        "(line 598,col 9)-(line 598,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 604,
      "end_line": 609,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 99)",
        "(line 606,col 9)-(line 606,col 99)",
        "(line 607,col 9)-(line 607,col 86)",
        "(line 608,col 9)-(line 608,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringString()",
      "begin_line": 611,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 70)",
        "(line 613,col 9)-(line 613,col 59)",
        "(line 614,col 9)-(line 614,col 61)",
        "(line 616,col 9)-(line 616,col 68)",
        "(line 617,col 9)-(line 617,col 57)",
        "(line 618,col 9)-(line 618,col 59)",
        "(line 620,col 9)-(line 620,col 78)",
        "(line 621,col 9)-(line 621,col 67)",
        "(line 622,col 9)-(line 622,col 68)",
        "(line 623,col 9)-(line 623,col 68)",
        "(line 624,col 9)-(line 624,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringArray()",
      "begin_line": 627,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 72)",
        "(line 629,col 9)-(line 629,col 73)",
        "(line 630,col 9)-(line 630,col 74)",
        "(line 631,col 9)-(line 631,col 74)",
        "(line 632,col 9)-(line 632,col 72)",
        "(line 633,col 9)-(line 633,col 70)",
        "(line 634,col 9)-(line 634,col 68)",
        "(line 635,col 9)-(line 635,col 80)",
        "(line 636,col 9)-(line 636,col 75)",
        "(line 637,col 9)-(line 637,col 71)",
        "(line 638,col 9)-(line 638,col 73)",
        "(line 639,col 9)-(line 639,col 74)",
        "(line 640,col 9)-(line 640,col 78)",
        "(line 641,col 9)-(line 641,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringWithSupplementaryChars()",
      "begin_line": 647,
      "end_line": 652,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 85)",
        "(line 649,col 9)-(line 649,col 85)",
        "(line 650,col 9)-(line 650,col 72)",
        "(line 651,col 9)-(line 651,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArray()",
      "begin_line": 654,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 73)",
        "(line 656,col 9)-(line 656,col 71)",
        "(line 657,col 9)-(line 657,col 80)",
        "(line 659,col 9)-(line 659,col 71)",
        "(line 660,col 9)-(line 660,col 69)",
        "(line 661,col 9)-(line 661,col 78)",
        "(line 663,col 9)-(line 663,col 81)",
        "(line 664,col 9)-(line 664,col 79)",
        "(line 665,col 9)-(line 665,col 87)",
        "(line 666,col 9)-(line 666,col 87)",
        "(line 667,col 9)-(line 667,col 82)",
        "(line 668,col 9)-(line 668,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArrayWithSupplementaryChars()",
      "begin_line": 672,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 102)",
        "(line 674,col 9)-(line 674,col 102)",
        "(line 675,col 9)-(line 675,col 90)",
        "(line 676,col 9)-(line 676,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringString()",
      "begin_line": 679,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 73)",
        "(line 681,col 9)-(line 681,col 62)",
        "(line 682,col 9)-(line 682,col 64)",
        "(line 684,col 9)-(line 684,col 71)",
        "(line 685,col 9)-(line 685,col 60)",
        "(line 686,col 9)-(line 686,col 62)",
        "(line 688,col 9)-(line 688,col 81)",
        "(line 689,col 9)-(line 689,col 70)",
        "(line 690,col 9)-(line 690,col 71)",
        "(line 691,col 9)-(line 691,col 71)",
        "(line 692,col 9)-(line 692,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringStringWithSupplementaryChars()",
      "begin_line": 695,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 88)",
        "(line 697,col 9)-(line 697,col 88)",
        "(line 698,col 9)-(line 698,col 76)",
        "(line 699,col 9)-(line 699,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_String()",
      "begin_line": 702,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 68)",
        "(line 704,col 9)-(line 704,col 66)",
        "(line 705,col 9)-(line 705,col 66)",
        "(line 706,col 9)-(line 706,col 63)",
        "(line 707,col 9)-(line 707,col 72)",
        "(line 708,col 9)-(line 708,col 72)",
        "(line 709,col 9)-(line 709,col 72)",
        "(line 710,col 9)-(line 710,col 72)",
        "(line 711,col 9)-(line 711,col 73)",
        "(line 712,col 9)-(line 712,col 73)",
        "(line 713,col 9)-(line 713,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_StringInt()",
      "begin_line": 716,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 77)",
        "(line 718,col 9)-(line 718,col 76)",
        "(line 719,col 9)-(line 719,col 76)",
        "(line 720,col 9)-(line 720,col 76)",
        "(line 721,col 9)-(line 721,col 76)",
        "(line 722,col 9)-(line 722,col 76)",
        "(line 723,col 9)-(line 723,col 77)",
        "(line 724,col 9)-(line 724,col 77)",
        "(line 725,col 9)-(line 725,col 77)",
        "(line 726,col 9)-(line 726,col 77)",
        "(line 727,col 9)-(line 727,col 71)",
        "(line 728,col 9)-(line 728,col 74)",
        "(line 729,col 9)-(line 729,col 72)",
        "(line 730,col 9)-(line 730,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_char()",
      "begin_line": 733,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 61)",
        "(line 735,col 9)-(line 735,col 59)",
        "(line 736,col 9)-(line 736,col 66)",
        "(line 737,col 9)-(line 737,col 66)",
        "(line 739,col 9)-(line 739,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_charInt()",
      "begin_line": 742,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 64)",
        "(line 744,col 9)-(line 744,col 65)",
        "(line 745,col 9)-(line 745,col 62)",
        "(line 746,col 9)-(line 746,col 63)",
        "(line 747,col 9)-(line 747,col 69)",
        "(line 748,col 9)-(line 748,col 69)",
        "(line 749,col 9)-(line 749,col 69)",
        "(line 750,col 9)-(line 750,col 69)",
        "(line 751,col 9)-(line 751,col 71)",
        "(line 752,col 9)-(line 752,col 69)",
        "(line 754,col 9)-(line 754,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_String()",
      "begin_line": 757,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 62)",
        "(line 759,col 9)-(line 759,col 60)",
        "(line 760,col 9)-(line 760,col 59)",
        "(line 761,col 9)-(line 761,col 57)",
        "(line 762,col 9)-(line 762,col 65)",
        "(line 763,col 9)-(line 763,col 66)",
        "(line 764,col 9)-(line 764,col 66)",
        "(line 765,col 9)-(line 765,col 67)",
        "(line 767,col 9)-(line 767,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_StringInt()",
      "begin_line": 770,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 65)",
        "(line 772,col 9)-(line 772,col 66)",
        "(line 773,col 9)-(line 773,col 63)",
        "(line 774,col 9)-(line 774,col 64)",
        "(line 775,col 9)-(line 775,col 63)",
        "(line 776,col 9)-(line 776,col 64)",
        "(line 777,col 9)-(line 777,col 60)",
        "(line 778,col 9)-(line 778,col 62)",
        "(line 779,col 9)-(line 779,col 60)",
        "(line 780,col 9)-(line 780,col 63)",
        "(line 781,col 9)-(line 781,col 65)",
        "(line 782,col 9)-(line 782,col 63)",
        "(line 783,col 9)-(line 783,col 69)",
        "(line 784,col 9)-(line 784,col 69)",
        "(line 785,col 9)-(line 785,col 70)",
        "(line 786,col 9)-(line 786,col 69)",
        "(line 787,col 9)-(line 787,col 69)",
        "(line 788,col 9)-(line 788,col 71)",
        "(line 789,col 9)-(line 789,col 70)",
        "(line 790,col 9)-(line 790,col 69)",
        "(line 792,col 9)-(line 792,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfAny_StringStringArray()",
      "begin_line": 795,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 80)",
        "(line 797,col 9)-(line 797,col 82)",
        "(line 798,col 9)-(line 798,col 59)",
        "(line 799,col 9)-(line 799,col 77)",
        "(line 800,col 9)-(line 800,col 82)",
        "(line 801,col 9)-(line 801,col 84)",
        "(line 802,col 9)-(line 802,col 61)",
        "(line 803,col 9)-(line 803,col 78)",
        "(line 804,col 9)-(line 804,col 76)",
        "(line 805,col 9)-(line 805,col 74)",
        "(line 806,col 9)-(line 806,col 72)",
        "(line 807,col 9)-(line 807,col 84)",
        "(line 808,col 9)-(line 808,col 79)",
        "(line 809,col 9)-(line 809,col 75)",
        "(line 810,col 9)-(line 810,col 77)",
        "(line 811,col 9)-(line 811,col 78)",
        "(line 812,col 9)-(line 812,col 82)",
        "(line 813,col 9)-(line 813,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_String()",
      "begin_line": 816,
      "end_line": 831,
      "comment": "",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 72)",
        "(line 818,col 9)-(line 818,col 70)",
        "(line 819,col 9)-(line 819,col 70)",
        "(line 820,col 9)-(line 820,col 69)",
        "(line 821,col 9)-(line 821,col 67)",
        "(line 822,col 9)-(line 822,col 75)",
        "(line 823,col 9)-(line 823,col 76)",
        "(line 824,col 9)-(line 824,col 76)",
        "(line 825,col 9)-(line 825,col 76)",
        "(line 826,col 9)-(line 826,col 76)",
        "(line 827,col 9)-(line 827,col 77)",
        "(line 828,col 9)-(line 828,col 77)",
        "(line 829,col 9)-(line 829,col 73)",
        "(line 830,col 9)-(line 830,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_StringInt()",
      "begin_line": 833,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 75)",
        "(line 835,col 9)-(line 835,col 76)",
        "(line 836,col 9)-(line 836,col 73)",
        "(line 837,col 9)-(line 837,col 74)",
        "(line 838,col 9)-(line 838,col 73)",
        "(line 839,col 9)-(line 839,col 74)",
        "(line 840,col 9)-(line 840,col 70)",
        "(line 841,col 9)-(line 841,col 72)",
        "(line 842,col 9)-(line 842,col 70)",
        "(line 843,col 9)-(line 843,col 73)",
        "(line 844,col 9)-(line 844,col 75)",
        "(line 845,col 9)-(line 845,col 73)",
        "(line 846,col 9)-(line 846,col 79)",
        "(line 847,col 9)-(line 847,col 79)",
        "(line 848,col 9)-(line 848,col 80)",
        "(line 849,col 9)-(line 849,col 79)",
        "(line 850,col 9)-(line 850,col 79)",
        "(line 851,col 9)-(line 851,col 81)",
        "(line 852,col 9)-(line 852,col 80)",
        "(line 853,col 9)-(line 853,col 79)",
        "(line 854,col 9)-(line 854,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastOrdinalIndexOf()",
      "begin_line": 857,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 858,col 9)-(line 858,col 73)",
        "(line 859,col 9)-(line 859,col 73)",
        "(line 860,col 9)-(line 860,col 69)",
        "(line 861,col 9)-(line 861,col 77)",
        "(line 862,col 9)-(line 862,col 77)",
        "(line 863,col 9)-(line 863,col 77)",
        "(line 864,col 9)-(line 864,col 77)",
        "(line 865,col 9)-(line 865,col 78)",
        "(line 866,col 9)-(line 866,col 78)",
        "(line 867,col 9)-(line 867,col 76)",
        "(line 868,col 9)-(line 868,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testOrdinalIndexOf()",
      "begin_line": 871,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 84)",
        "(line 873,col 9)-(line 873,col 82)",
        "(line 874,col 9)-(line 874,col 80)",
        "(line 875,col 9)-(line 875,col 89)",
        "(line 876,col 9)-(line 876,col 89)",
        "(line 877,col 9)-(line 877,col 90)",
        "(line 878,col 9)-(line 878,col 88)",
        "(line 880,col 9)-(line 880,col 69)",
        "(line 881,col 9)-(line 881,col 67)",
        "(line 882,col 9)-(line 882,col 65)",
        "(line 883,col 9)-(line 883,col 74)",
        "(line 884,col 9)-(line 884,col 74)",
        "(line 885,col 9)-(line 885,col 75)",
        "(line 886,col 9)-(line 886,col 73)",
        "(line 888,col 9)-(line 888,col 68)",
        "(line 889,col 9)-(line 889,col 66)",
        "(line 890,col 9)-(line 890,col 64)",
        "(line 891,col 9)-(line 891,col 73)",
        "(line 892,col 9)-(line 892,col 73)",
        "(line 893,col 9)-(line 893,col 74)",
        "(line 894,col 9)-(line 894,col 72)",
        "(line 896,col 9)-(line 896,col 68)",
        "(line 897,col 9)-(line 897,col 66)",
        "(line 898,col 9)-(line 898,col 63)",
        "(line 899,col 9)-(line 899,col 72)",
        "(line 900,col 9)-(line 900,col 72)",
        "(line 901,col 9)-(line 901,col 73)",
        "(line 902,col 9)-(line 902,col 71)",
        "(line 904,col 9)-(line 904,col 68)",
        "(line 905,col 9)-(line 905,col 66)",
        "(line 906,col 9)-(line 906,col 63)",
        "(line 907,col 9)-(line 907,col 72)",
        "(line 908,col 9)-(line 908,col 72)",
        "(line 909,col 9)-(line 909,col 73)",
        "(line 910,col 9)-(line 910,col 71)",
        "(line 912,col 9)-(line 912,col 84)",
        "(line 913,col 9)-(line 913,col 82)",
        "(line 914,col 9)-(line 914,col 79)",
        "(line 915,col 9)-(line 915,col 89)",
        "(line 916,col 9)-(line 916,col 89)",
        "(line 917,col 9)-(line 917,col 90)",
        "(line 918,col 9)-(line 918,col 87)",
        "(line 920,col 9)-(line 920,col 74)",
        "(line 921,col 9)-(line 921,col 73)",
        "(line 922,col 9)-(line 922,col 73)",
        "(line 923,col 9)-(line 923,col 73)",
        "(line 924,col 9)-(line 924,col 73)",
        "(line 925,col 9)-(line 925,col 73)",
        "(line 926,col 9)-(line 926,col 73)",
        "(line 927,col 9)-(line 927,col 73)",
        "(line 928,col 9)-(line 928,col 73)",
        "(line 929,col 9)-(line 929,col 73)",
        "(line 930,col 9)-(line 930,col 75)"
      ]
    }
  ]
}