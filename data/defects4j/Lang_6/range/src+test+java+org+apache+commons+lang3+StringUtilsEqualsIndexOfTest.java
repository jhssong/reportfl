{
  "filepath": "/tmp/Lang-6b/src/test/java/org/apache/commons/lang3/StringUtilsEqualsIndexOfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilsEqualsIndexOfTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 993,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BAR"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CharU20000"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Supplementary character U+20000\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharU20001"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Supplementary character U+20001\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharHigh"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Incomplete supplementary character U+20000, high surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CharUSuppCharLow"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Incomplete supplementary character U+20000, low surrogate only.\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOO"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR_SUB_ARRAY"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_Char()",
      "begin_line": 64,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 53)",
        "(line 67,col 9)-(line 67,col 51)",
        "(line 68,col 9)-(line 68,col 52)",
        "(line 69,col 9)-(line 69,col 54)",
        "(line 70,col 9)-(line 70,col 53)",
        "(line 71,col 9)-(line 71,col 53)",
        "(line 72,col 9)-(line 72,col 53)",
        "(line 73,col 9)-(line 73,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_String()",
      "begin_line": 76,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 54)",
        "(line 79,col 9)-(line 79,col 52)",
        "(line 80,col 9)-(line 80,col 53)",
        "(line 81,col 9)-(line 81,col 52)",
        "(line 82,col 9)-(line 82,col 49)",
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 84,col 53)",
        "(line 85,col 9)-(line 85,col 53)",
        "(line 86,col 9)-(line 86,col 53)",
        "(line 87,col 9)-(line 87,col 55)",
        "(line 88,col 9)-(line 88,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithBadSupplementaryChars()",
      "begin_line": 94,
      "end_line": 104,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 73)",
        "(line 98,col 9)-(line 98,col 72)",
        "(line 99,col 9)-(line 99,col 73)",
        "(line 100,col 9)-(line 100,col 62)",
        "(line 101,col 9)-(line 101,col 71)",
        "(line 102,col 9)-(line 102,col 83)",
        "(line 103,col 9)-(line 103,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithSupplementaryChars()",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 78)",
        "(line 112,col 9)-(line 112,col 78)",
        "(line 113,col 9)-(line 113,col 65)",
        "(line 114,col 9)-(line 114,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArray()",
      "begin_line": 117,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 66)",
        "(line 120,col 9)-(line 120,col 64)",
        "(line 121,col 9)-(line 121,col 76)",
        "(line 123,col 9)-(line 123,col 64)",
        "(line 124,col 9)-(line 124,col 62)",
        "(line 125,col 9)-(line 125,col 74)",
        "(line 127,col 9)-(line 127,col 74)",
        "(line 128,col 9)-(line 128,col 72)",
        "(line 129,col 9)-(line 129,col 83)",
        "(line 130,col 9)-(line 130,col 83)",
        "(line 131,col 9)-(line 131,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithBadSupplementaryChars()",
      "begin_line": 137,
      "end_line": 147,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 90)",
        "(line 141,col 9)-(line 141,col 106)",
        "(line 142,col 9)-(line 142,col 63)",
        "(line 143,col 9)-(line 143,col 89)",
        "(line 144,col 9)-(line 144,col 90)",
        "(line 145,col 9)-(line 145,col 62)",
        "(line 146,col 9)-(line 146,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 152,
      "end_line": 167,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 95)",
        "(line 155,col 9)-(line 155,col 94)",
        "(line 156,col 9)-(line 156,col 94)",
        "(line 157,col 9)-(line 157,col 94)",
        "(line 158,col 9)-(line 158,col 95)",
        "(line 159,col 9)-(line 159,col 82)",
        "(line 161,col 9)-(line 161,col 57)",
        "(line 162,col 9)-(line 162,col 66)",
        "(line 163,col 9)-(line 163,col 67)",
        "(line 165,col 9)-(line 165,col 83)",
        "(line 166,col 9)-(line 166,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringString()",
      "begin_line": 169,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 66)",
        "(line 172,col 9)-(line 172,col 55)",
        "(line 173,col 9)-(line 173,col 57)",
        "(line 175,col 9)-(line 175,col 64)",
        "(line 176,col 9)-(line 176,col 53)",
        "(line 177,col 9)-(line 177,col 55)",
        "(line 179,col 9)-(line 179,col 74)",
        "(line 180,col 9)-(line 180,col 63)",
        "(line 181,col 9)-(line 181,col 64)",
        "(line 182,col 9)-(line 182,col 64)",
        "(line 183,col 9)-(line 183,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithBadSupplementaryChars()",
      "begin_line": 189,
      "end_line": 198,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 76)",
        "(line 193,col 9)-(line 193,col 63)",
        "(line 194,col 9)-(line 194,col 75)",
        "(line 195,col 9)-(line 195,col 76)",
        "(line 196,col 9)-(line 196,col 62)",
        "(line 197,col 9)-(line 197,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithSupplementaryChars()",
      "begin_line": 203,
      "end_line": 215,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 81)",
        "(line 206,col 9)-(line 206,col 81)",
        "(line 207,col 9)-(line 207,col 68)",
        "(line 209,col 9)-(line 209,col 57)",
        "(line 210,col 9)-(line 210,col 66)",
        "(line 211,col 9)-(line 211,col 67)",
        "(line 213,col 9)-(line 213,col 69)",
        "(line 214,col 9)-(line 214,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_LocaleIndependence()",
      "begin_line": 217,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 42)",
        "(line 221,col 9)-(line 221,col 85)",
        "(line 223,col 9)-(line 229,col 10)",
        "(line 231,col 9)-(line 233,col 10)",
        "(line 235,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_StringString()",
      "begin_line": 252,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 64)",
        "(line 257,col 9)-(line 257,col 62)",
        "(line 258,col 9)-(line 258,col 63)",
        "(line 259,col 9)-(line 259,col 65)",
        "(line 261,col 9)-(line 261,col 62)",
        "(line 262,col 9)-(line 262,col 63)",
        "(line 263,col 9)-(line 263,col 65)",
        "(line 266,col 9)-(line 266,col 59)",
        "(line 267,col 9)-(line 267,col 60)",
        "(line 268,col 9)-(line 268,col 62)",
        "(line 271,col 9)-(line 271,col 61)",
        "(line 272,col 9)-(line 272,col 61)",
        "(line 273,col 9)-(line 273,col 63)",
        "(line 274,col 9)-(line 274,col 61)",
        "(line 275,col 9)-(line 275,col 61)",
        "(line 276,col 9)-(line 276,col 63)",
        "(line 279,col 9)-(line 279,col 63)",
        "(line 280,col 9)-(line 280,col 64)",
        "(line 281,col 9)-(line 281,col 67)",
        "(line 282,col 9)-(line 282,col 63)",
        "(line 283,col 9)-(line 283,col 64)",
        "(line 284,col 9)-(line 284,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArray()",
      "begin_line": 287,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 26)",
        "(line 290,col 9)-(line 290,col 26)",
        "(line 291,col 9)-(line 291,col 28)",
        "(line 292,col 9)-(line 292,col 29)",
        "(line 293,col 9)-(line 293,col 29)",
        "(line 294,col 9)-(line 294,col 34)",
        "(line 295,col 9)-(line 295,col 40)",
        "(line 296,col 9)-(line 296,col 66)",
        "(line 297,col 9)-(line 297,col 64)",
        "(line 298,col 9)-(line 298,col 63)",
        "(line 299,col 9)-(line 299,col 63)",
        "(line 300,col 9)-(line 300,col 61)",
        "(line 301,col 9)-(line 301,col 57)",
        "(line 302,col 9)-(line 302,col 59)",
        "(line 303,col 9)-(line 303,col 59)",
        "(line 304,col 9)-(line 304,col 59)",
        "(line 305,col 9)-(line 305,col 60)",
        "(line 306,col 9)-(line 306,col 59)",
        "(line 307,col 9)-(line 307,col 59)",
        "(line 308,col 9)-(line 308,col 60)",
        "(line 309,col 9)-(line 309,col 60)",
        "(line 310,col 9)-(line 310,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithBadSupplementaryChars()",
      "begin_line": 316,
      "end_line": 326,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 90)",
        "(line 320,col 9)-(line 320,col 63)",
        "(line 321,col 9)-(line 321,col 89)",
        "(line 322,col 9)-(line 322,col 64)",
        "(line 323,col 9)-(line 323,col 90)",
        "(line 324,col 9)-(line 324,col 62)",
        "(line 325,col 9)-(line 325,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithSupplementaryChars()",
      "begin_line": 331,
      "end_line": 343,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 97)",
        "(line 334,col 9)-(line 334,col 97)",
        "(line 335,col 9)-(line 335,col 84)",
        "(line 337,col 9)-(line 337,col 57)",
        "(line 338,col 9)-(line 338,col 66)",
        "(line 339,col 9)-(line 339,col 67)",
        "(line 341,col 9)-(line 341,col 83)",
        "(line 342,col 9)-(line 342,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_String()",
      "begin_line": 345,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 26)",
        "(line 348,col 9)-(line 348,col 26)",
        "(line 349,col 9)-(line 349,col 28)",
        "(line 350,col 9)-(line 350,col 27)",
        "(line 351,col 9)-(line 351,col 27)",
        "(line 352,col 9)-(line 352,col 28)",
        "(line 353,col 9)-(line 353,col 66)",
        "(line 354,col 9)-(line 354,col 64)",
        "(line 355,col 9)-(line 355,col 55)",
        "(line 356,col 9)-(line 356,col 55)",
        "(line 357,col 9)-(line 357,col 53)",
        "(line 358,col 9)-(line 358,col 57)",
        "(line 359,col 9)-(line 359,col 59)",
        "(line 360,col 9)-(line 360,col 59)",
        "(line 361,col 9)-(line 361,col 59)",
        "(line 362,col 9)-(line 362,col 60)",
        "(line 363,col 9)-(line 363,col 59)",
        "(line 364,col 9)-(line 364,col 59)",
        "(line 365,col 9)-(line 365,col 60)",
        "(line 366,col 9)-(line 366,col 60)",
        "(line 367,col 9)-(line 367,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithBadSupplementaryChars()",
      "begin_line": 373,
      "end_line": 383,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 76)",
        "(line 377,col 9)-(line 377,col 63)",
        "(line 378,col 9)-(line 378,col 75)",
        "(line 379,col 9)-(line 379,col 64)",
        "(line 380,col 9)-(line 380,col 76)",
        "(line 381,col 9)-(line 381,col 62)",
        "(line 382,col 9)-(line 382,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithSupplementaryChars()",
      "begin_line": 388,
      "end_line": 400,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 83)",
        "(line 391,col 9)-(line 391,col 83)",
        "(line 392,col 9)-(line 392,col 70)",
        "(line 394,col 9)-(line 394,col 57)",
        "(line 395,col 9)-(line 395,col 66)",
        "(line 396,col 9)-(line 396,col 67)",
        "(line 398,col 9)-(line 398,col 69)",
        "(line 399,col 9)-(line 399,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_CharArray()",
      "begin_line": 402,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 26)",
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 406,col 27)",
        "(line 407,col 9)-(line 407,col 29)",
        "(line 408,col 9)-(line 408,col 29)",
        "(line 409,col 9)-(line 409,col 34)",
        "(line 410,col 9)-(line 410,col 40)",
        "(line 411,col 9)-(line 411,col 67)",
        "(line 412,col 9)-(line 412,col 65)",
        "(line 413,col 9)-(line 413,col 64)",
        "(line 414,col 9)-(line 414,col 64)",
        "(line 415,col 9)-(line 415,col 61)",
        "(line 416,col 9)-(line 416,col 57)",
        "(line 417,col 9)-(line 417,col 60)",
        "(line 418,col 9)-(line 418,col 59)",
        "(line 419,col 9)-(line 419,col 59)",
        "(line 420,col 9)-(line 420,col 59)",
        "(line 421,col 9)-(line 421,col 60)",
        "(line 422,col 9)-(line 422,col 59)",
        "(line 423,col 9)-(line 423,col 60)",
        "(line 424,col 9)-(line 424,col 60)",
        "(line 425,col 9)-(line 425,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_String()",
      "begin_line": 428,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 26)",
        "(line 431,col 9)-(line 431,col 26)",
        "(line 432,col 9)-(line 432,col 27)",
        "(line 433,col 9)-(line 433,col 27)",
        "(line 434,col 9)-(line 434,col 27)",
        "(line 435,col 9)-(line 435,col 28)",
        "(line 436,col 9)-(line 436,col 67)",
        "(line 437,col 9)-(line 437,col 65)",
        "(line 438,col 9)-(line 438,col 56)",
        "(line 439,col 9)-(line 439,col 56)",
        "(line 440,col 9)-(line 440,col 53)",
        "(line 441,col 9)-(line 441,col 57)",
        "(line 442,col 9)-(line 442,col 60)",
        "(line 443,col 9)-(line 443,col 59)",
        "(line 444,col 9)-(line 444,col 59)",
        "(line 445,col 9)-(line 445,col 59)",
        "(line 446,col 9)-(line 446,col 60)",
        "(line 447,col 9)-(line 447,col 59)",
        "(line 448,col 9)-(line 448,col 60)",
        "(line 449,col 9)-(line 449,col 60)",
        "(line 450,col 9)-(line 450,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsWhitespace()",
      "begin_line": 453,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 58)",
        "(line 456,col 9)-(line 456,col 58)",
        "(line 457,col 9)-(line 457,col 59)",
        "(line 458,col 9)-(line 458,col 59)",
        "(line 459,col 9)-(line 459,col 59)",
        "(line 460,col 9)-(line 460,col 60)",
        "(line 461,col 9)-(line 461,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CustomCharSequence",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence"
      ],
      "begin_line": 468,
      "end_line": 508,
      "comment": " `seq` may equal the other object."
    },
    {
      "type": "field",
      "varNames": [
        "seq"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.CustomCharSequence(java.lang.CharSequence)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.charAt(int)",
      "begin_line": 475,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 477,col 13)-(line 477,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.length()",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 482,col 13)-(line 482,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.subSequence(int, int)",
      "begin_line": 485,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 13)-(line 487,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.equals(java.lang.Object)",
      "begin_line": 490,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 492,col 13)-(line 494,col 13)",
        "(line 495,col 13)-(line 495,col 64)",
        "(line 496,col 13)-(line 496,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.hashCode()",
      "begin_line": 499,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 501,col 13)-(line 501,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.CustomCharSequence.toString()",
      "begin_line": 504,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 506,col 13)-(line 506,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCustomCharSequence()",
      "begin_line": 510,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 78)",
        "(line 513,col 9)-(line 513,col 78)",
        "(line 514,col 9)-(line 514,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEquals()",
      "begin_line": 517,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 71)",
        "(line 520,col 9)-(line 520,col 51)",
        "(line 521,col 9)-(line 521,col 53)",
        "(line 522,col 9)-(line 522,col 70)",
        "(line 523,col 9)-(line 523,col 88)",
        "(line 524,col 9)-(line 524,col 75)",
        "(line 525,col 9)-(line 525,col 75)",
        "(line 526,col 9)-(line 526,col 89)",
        "(line 527,col 9)-(line 527,col 54)",
        "(line 528,col 9)-(line 528,col 53)",
        "(line 529,col 9)-(line 529,col 53)",
        "(line 530,col 9)-(line 530,col 57)",
        "(line 531,col 9)-(line 531,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsOnStrings()",
      "begin_line": 534,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 51)",
        "(line 537,col 9)-(line 537,col 49)",
        "(line 538,col 9)-(line 538,col 86)",
        "(line 539,col 9)-(line 539,col 87)",
        "(line 540,col 9)-(line 540,col 50)",
        "(line 541,col 9)-(line 541,col 51)",
        "(line 542,col 9)-(line 542,col 51)",
        "(line 543,col 9)-(line 543,col 53)",
        "(line 544,col 9)-(line 544,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsIgnoreCase()",
      "begin_line": 547,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 61)",
        "(line 550,col 9)-(line 550,col 59)",
        "(line 551,col 9)-(line 551,col 96)",
        "(line 552,col 9)-(line 552,col 96)",
        "(line 553,col 9)-(line 553,col 60)",
        "(line 554,col 9)-(line 554,col 61)",
        "(line 555,col 9)-(line 555,col 61)",
        "(line 556,col 9)-(line 556,col 56)",
        "(line 557,col 9)-(line 557,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_char()",
      "begin_line": 561,
      "end_line": 569,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 57)",
        "(line 564,col 9)-(line 564,col 55)",
        "(line 565,col 9)-(line 565,col 62)",
        "(line 566,col 9)-(line 566,col 62)",
        "(line 568,col 9)-(line 568,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_charInt()",
      "begin_line": 571,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 60)",
        "(line 574,col 9)-(line 574,col 61)",
        "(line 575,col 9)-(line 575,col 58)",
        "(line 576,col 9)-(line 576,col 59)",
        "(line 577,col 9)-(line 577,col 65)",
        "(line 578,col 9)-(line 578,col 65)",
        "(line 579,col 9)-(line 579,col 65)",
        "(line 580,col 9)-(line 580,col 66)",
        "(line 581,col 9)-(line 581,col 66)",
        "(line 583,col 9)-(line 583,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_String()",
      "begin_line": 586,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 58)",
        "(line 589,col 9)-(line 589,col 56)",
        "(line 590,col 9)-(line 590,col 53)",
        "(line 591,col 9)-(line 591,col 62)",
        "(line 592,col 9)-(line 592,col 62)",
        "(line 593,col 9)-(line 593,col 63)",
        "(line 594,col 9)-(line 594,col 61)",
        "(line 596,col 9)-(line 596,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_StringInt()",
      "begin_line": 599,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 61)",
        "(line 602,col 9)-(line 602,col 62)",
        "(line 603,col 9)-(line 603,col 59)",
        "(line 604,col 9)-(line 604,col 60)",
        "(line 605,col 9)-(line 605,col 59)",
        "(line 606,col 9)-(line 606,col 60)",
        "(line 607,col 9)-(line 607,col 56)",
        "(line 608,col 9)-(line 608,col 57)",
        "(line 609,col 9)-(line 609,col 56)",
        "(line 610,col 9)-(line 610,col 59)",
        "(line 611,col 9)-(line 611,col 60)",
        "(line 612,col 9)-(line 612,col 59)",
        "(line 613,col 9)-(line 613,col 59)",
        "(line 614,col 9)-(line 614,col 65)",
        "(line 615,col 9)-(line 615,col 65)",
        "(line 616,col 9)-(line 616,col 66)",
        "(line 617,col 9)-(line 617,col 65)",
        "(line 618,col 9)-(line 618,col 66)",
        "(line 619,col 9)-(line 619,col 66)",
        "(line 620,col 9)-(line 620,col 63)",
        "(line 622,col 9)-(line 622,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArray()",
      "begin_line": 625,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 70)",
        "(line 628,col 9)-(line 628,col 68)",
        "(line 629,col 9)-(line 629,col 77)",
        "(line 631,col 9)-(line 631,col 68)",
        "(line 632,col 9)-(line 632,col 66)",
        "(line 633,col 9)-(line 633,col 75)",
        "(line 635,col 9)-(line 635,col 78)",
        "(line 636,col 9)-(line 636,col 76)",
        "(line 637,col 9)-(line 637,col 84)",
        "(line 638,col 9)-(line 638,col 84)",
        "(line 639,col 9)-(line 639,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArrayWithSupplementaryChars()",
      "begin_line": 645,
      "end_line": 651,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 99)",
        "(line 648,col 9)-(line 648,col 99)",
        "(line 649,col 9)-(line 649,col 86)",
        "(line 650,col 9)-(line 650,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringString()",
      "begin_line": 653,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 70)",
        "(line 656,col 9)-(line 656,col 59)",
        "(line 657,col 9)-(line 657,col 61)",
        "(line 659,col 9)-(line 659,col 68)",
        "(line 660,col 9)-(line 660,col 57)",
        "(line 661,col 9)-(line 661,col 59)",
        "(line 663,col 9)-(line 663,col 78)",
        "(line 664,col 9)-(line 664,col 67)",
        "(line 665,col 9)-(line 665,col 68)",
        "(line 666,col 9)-(line 666,col 68)",
        "(line 667,col 9)-(line 667,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringArray()",
      "begin_line": 670,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 72)",
        "(line 673,col 9)-(line 673,col 73)",
        "(line 674,col 9)-(line 674,col 74)",
        "(line 675,col 9)-(line 675,col 74)",
        "(line 676,col 9)-(line 676,col 72)",
        "(line 677,col 9)-(line 677,col 70)",
        "(line 678,col 9)-(line 678,col 68)",
        "(line 679,col 9)-(line 679,col 80)",
        "(line 680,col 9)-(line 680,col 75)",
        "(line 681,col 9)-(line 681,col 71)",
        "(line 682,col 9)-(line 682,col 73)",
        "(line 683,col 9)-(line 683,col 74)",
        "(line 684,col 9)-(line 684,col 78)",
        "(line 685,col 9)-(line 685,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringWithSupplementaryChars()",
      "begin_line": 691,
      "end_line": 697,
      "comment": "\n     * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 85)",
        "(line 694,col 9)-(line 694,col 85)",
        "(line 695,col 9)-(line 695,col 72)",
        "(line 696,col 9)-(line 696,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArray()",
      "begin_line": 699,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 73)",
        "(line 702,col 9)-(line 702,col 71)",
        "(line 703,col 9)-(line 703,col 80)",
        "(line 705,col 9)-(line 705,col 71)",
        "(line 706,col 9)-(line 706,col 69)",
        "(line 707,col 9)-(line 707,col 78)",
        "(line 709,col 9)-(line 709,col 81)",
        "(line 710,col 9)-(line 710,col 79)",
        "(line 711,col 9)-(line 711,col 87)",
        "(line 712,col 9)-(line 712,col 87)",
        "(line 713,col 9)-(line 713,col 82)",
        "(line 714,col 9)-(line 714,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArrayWithSupplementaryChars()",
      "begin_line": 718,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 102)",
        "(line 721,col 9)-(line 721,col 102)",
        "(line 722,col 9)-(line 722,col 90)",
        "(line 723,col 9)-(line 723,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringString()",
      "begin_line": 726,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 73)",
        "(line 729,col 9)-(line 729,col 62)",
        "(line 730,col 9)-(line 730,col 64)",
        "(line 732,col 9)-(line 732,col 71)",
        "(line 733,col 9)-(line 733,col 60)",
        "(line 734,col 9)-(line 734,col 62)",
        "(line 736,col 9)-(line 736,col 81)",
        "(line 737,col 9)-(line 737,col 70)",
        "(line 738,col 9)-(line 738,col 71)",
        "(line 739,col 9)-(line 739,col 71)",
        "(line 740,col 9)-(line 740,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringStringWithSupplementaryChars()",
      "begin_line": 743,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 88)",
        "(line 746,col 9)-(line 746,col 88)",
        "(line 747,col 9)-(line 747,col 76)",
        "(line 748,col 9)-(line 748,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_String()",
      "begin_line": 751,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 68)",
        "(line 754,col 9)-(line 754,col 66)",
        "(line 755,col 9)-(line 755,col 66)",
        "(line 756,col 9)-(line 756,col 63)",
        "(line 757,col 9)-(line 757,col 72)",
        "(line 758,col 9)-(line 758,col 72)",
        "(line 759,col 9)-(line 759,col 72)",
        "(line 760,col 9)-(line 760,col 72)",
        "(line 761,col 9)-(line 761,col 73)",
        "(line 762,col 9)-(line 762,col 73)",
        "(line 763,col 9)-(line 763,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_StringInt()",
      "begin_line": 766,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 77)",
        "(line 769,col 9)-(line 769,col 76)",
        "(line 770,col 9)-(line 770,col 76)",
        "(line 771,col 9)-(line 771,col 76)",
        "(line 772,col 9)-(line 772,col 76)",
        "(line 773,col 9)-(line 773,col 76)",
        "(line 774,col 9)-(line 774,col 77)",
        "(line 775,col 9)-(line 775,col 77)",
        "(line 776,col 9)-(line 776,col 77)",
        "(line 777,col 9)-(line 777,col 77)",
        "(line 778,col 9)-(line 778,col 71)",
        "(line 779,col 9)-(line 779,col 74)",
        "(line 780,col 9)-(line 780,col 72)",
        "(line 781,col 9)-(line 781,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_char()",
      "begin_line": 784,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 61)",
        "(line 787,col 9)-(line 787,col 59)",
        "(line 788,col 9)-(line 788,col 66)",
        "(line 789,col 9)-(line 789,col 66)",
        "(line 791,col 9)-(line 791,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_charInt()",
      "begin_line": 794,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 64)",
        "(line 797,col 9)-(line 797,col 65)",
        "(line 798,col 9)-(line 798,col 62)",
        "(line 799,col 9)-(line 799,col 63)",
        "(line 800,col 9)-(line 800,col 69)",
        "(line 801,col 9)-(line 801,col 69)",
        "(line 802,col 9)-(line 802,col 69)",
        "(line 803,col 9)-(line 803,col 69)",
        "(line 804,col 9)-(line 804,col 71)",
        "(line 805,col 9)-(line 805,col 69)",
        "(line 807,col 9)-(line 807,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_String()",
      "begin_line": 810,
      "end_line": 822,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 62)",
        "(line 813,col 9)-(line 813,col 60)",
        "(line 814,col 9)-(line 814,col 59)",
        "(line 815,col 9)-(line 815,col 57)",
        "(line 816,col 9)-(line 816,col 65)",
        "(line 817,col 9)-(line 817,col 66)",
        "(line 818,col 9)-(line 818,col 66)",
        "(line 819,col 9)-(line 819,col 67)",
        "(line 821,col 9)-(line 821,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_StringInt()",
      "begin_line": 824,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 65)",
        "(line 827,col 9)-(line 827,col 66)",
        "(line 828,col 9)-(line 828,col 63)",
        "(line 829,col 9)-(line 829,col 64)",
        "(line 830,col 9)-(line 830,col 63)",
        "(line 831,col 9)-(line 831,col 64)",
        "(line 832,col 9)-(line 832,col 60)",
        "(line 833,col 9)-(line 833,col 62)",
        "(line 834,col 9)-(line 834,col 60)",
        "(line 835,col 9)-(line 835,col 63)",
        "(line 836,col 9)-(line 836,col 65)",
        "(line 837,col 9)-(line 837,col 63)",
        "(line 838,col 9)-(line 838,col 69)",
        "(line 839,col 9)-(line 839,col 69)",
        "(line 840,col 9)-(line 840,col 70)",
        "(line 841,col 9)-(line 841,col 69)",
        "(line 842,col 9)-(line 842,col 69)",
        "(line 843,col 9)-(line 843,col 71)",
        "(line 844,col 9)-(line 844,col 70)",
        "(line 845,col 9)-(line 845,col 69)",
        "(line 847,col 9)-(line 847,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfAny_StringStringArray()",
      "begin_line": 850,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 80)",
        "(line 853,col 9)-(line 853,col 82)",
        "(line 854,col 9)-(line 854,col 59)",
        "(line 855,col 9)-(line 855,col 77)",
        "(line 856,col 9)-(line 856,col 82)",
        "(line 857,col 9)-(line 857,col 84)",
        "(line 858,col 9)-(line 858,col 61)",
        "(line 859,col 9)-(line 859,col 78)",
        "(line 860,col 9)-(line 860,col 76)",
        "(line 861,col 9)-(line 861,col 74)",
        "(line 862,col 9)-(line 862,col 72)",
        "(line 863,col 9)-(line 863,col 84)",
        "(line 864,col 9)-(line 864,col 79)",
        "(line 865,col 9)-(line 865,col 75)",
        "(line 866,col 9)-(line 866,col 77)",
        "(line 867,col 9)-(line 867,col 78)",
        "(line 868,col 9)-(line 868,col 82)",
        "(line 869,col 9)-(line 869,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_String()",
      "begin_line": 872,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 72)",
        "(line 875,col 9)-(line 875,col 70)",
        "(line 876,col 9)-(line 876,col 70)",
        "(line 877,col 9)-(line 877,col 69)",
        "(line 878,col 9)-(line 878,col 67)",
        "(line 879,col 9)-(line 879,col 75)",
        "(line 880,col 9)-(line 880,col 76)",
        "(line 881,col 9)-(line 881,col 76)",
        "(line 882,col 9)-(line 882,col 76)",
        "(line 883,col 9)-(line 883,col 76)",
        "(line 884,col 9)-(line 884,col 77)",
        "(line 885,col 9)-(line 885,col 77)",
        "(line 886,col 9)-(line 886,col 73)",
        "(line 887,col 9)-(line 887,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_StringInt()",
      "begin_line": 890,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 75)",
        "(line 893,col 9)-(line 893,col 76)",
        "(line 894,col 9)-(line 894,col 73)",
        "(line 895,col 9)-(line 895,col 74)",
        "(line 896,col 9)-(line 896,col 73)",
        "(line 897,col 9)-(line 897,col 74)",
        "(line 898,col 9)-(line 898,col 70)",
        "(line 899,col 9)-(line 899,col 72)",
        "(line 900,col 9)-(line 900,col 70)",
        "(line 901,col 9)-(line 901,col 73)",
        "(line 902,col 9)-(line 902,col 75)",
        "(line 903,col 9)-(line 903,col 73)",
        "(line 904,col 9)-(line 904,col 79)",
        "(line 905,col 9)-(line 905,col 79)",
        "(line 906,col 9)-(line 906,col 80)",
        "(line 907,col 9)-(line 907,col 79)",
        "(line 908,col 9)-(line 908,col 79)",
        "(line 909,col 9)-(line 909,col 81)",
        "(line 910,col 9)-(line 910,col 80)",
        "(line 911,col 9)-(line 911,col 79)",
        "(line 912,col 9)-(line 912,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastOrdinalIndexOf()",
      "begin_line": 915,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 73)",
        "(line 918,col 9)-(line 918,col 73)",
        "(line 919,col 9)-(line 919,col 69)",
        "(line 920,col 9)-(line 920,col 77)",
        "(line 921,col 9)-(line 921,col 77)",
        "(line 922,col 9)-(line 922,col 77)",
        "(line 923,col 9)-(line 923,col 77)",
        "(line 924,col 9)-(line 924,col 78)",
        "(line 925,col 9)-(line 925,col 78)",
        "(line 926,col 9)-(line 926,col 76)",
        "(line 927,col 9)-(line 927,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testOrdinalIndexOf()",
      "begin_line": 930,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 84)",
        "(line 933,col 9)-(line 933,col 82)",
        "(line 934,col 9)-(line 934,col 80)",
        "(line 935,col 9)-(line 935,col 89)",
        "(line 936,col 9)-(line 936,col 89)",
        "(line 937,col 9)-(line 937,col 90)",
        "(line 938,col 9)-(line 938,col 88)",
        "(line 940,col 9)-(line 940,col 69)",
        "(line 941,col 9)-(line 941,col 67)",
        "(line 942,col 9)-(line 942,col 65)",
        "(line 943,col 9)-(line 943,col 74)",
        "(line 944,col 9)-(line 944,col 74)",
        "(line 945,col 9)-(line 945,col 75)",
        "(line 946,col 9)-(line 946,col 73)",
        "(line 948,col 9)-(line 948,col 68)",
        "(line 949,col 9)-(line 949,col 66)",
        "(line 950,col 9)-(line 950,col 64)",
        "(line 951,col 9)-(line 951,col 73)",
        "(line 952,col 9)-(line 952,col 73)",
        "(line 953,col 9)-(line 953,col 74)",
        "(line 954,col 9)-(line 954,col 72)",
        "(line 956,col 9)-(line 956,col 68)",
        "(line 957,col 9)-(line 957,col 66)",
        "(line 958,col 9)-(line 958,col 63)",
        "(line 959,col 9)-(line 959,col 72)",
        "(line 960,col 9)-(line 960,col 72)",
        "(line 961,col 9)-(line 961,col 73)",
        "(line 962,col 9)-(line 962,col 71)",
        "(line 964,col 9)-(line 964,col 68)",
        "(line 965,col 9)-(line 965,col 66)",
        "(line 966,col 9)-(line 966,col 63)",
        "(line 967,col 9)-(line 967,col 72)",
        "(line 968,col 9)-(line 968,col 72)",
        "(line 969,col 9)-(line 969,col 73)",
        "(line 970,col 9)-(line 970,col 71)",
        "(line 972,col 9)-(line 972,col 84)",
        "(line 973,col 9)-(line 973,col 82)",
        "(line 974,col 9)-(line 974,col 79)",
        "(line 975,col 9)-(line 975,col 89)",
        "(line 976,col 9)-(line 976,col 89)",
        "(line 977,col 9)-(line 977,col 90)",
        "(line 978,col 9)-(line 978,col 87)",
        "(line 980,col 9)-(line 980,col 74)",
        "(line 981,col 9)-(line 981,col 73)",
        "(line 982,col 9)-(line 982,col 73)",
        "(line 983,col 9)-(line 983,col 73)",
        "(line 984,col 9)-(line 984,col 73)",
        "(line 985,col 9)-(line 985,col 73)",
        "(line 986,col 9)-(line 986,col 73)",
        "(line 987,col 9)-(line 987,col 73)",
        "(line 988,col 9)-(line 988,col 73)",
        "(line 989,col 9)-(line 989,col 73)",
        "(line 990,col 9)-(line 990,col 75)"
      ]
    }
  ]
}