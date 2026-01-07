{
  "filepath": "/tmp/Lang-31b/src/test/java/org/apache/commons/lang3/StringUtilsEqualsIndexOfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilsEqualsIndexOfTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 699,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:ridesmet@users.sourceforge.net\"\u003eRingo De Smet\u003c/a\u003e\n * @author Phil Steitz\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "FOO"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
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
        "FOOBAR"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FOOBAR_SUB_ARRAY"
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
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n\t * Supplementary character U+20000\n\t * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n\t "
    },
    {
      "type": "field",
      "varNames": [
        "CharU20001"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n\t * Supplementary character U+20001\n\t * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n\t "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.StringUtilsEqualsIndexOfTest(java.lang.String)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEquals()",
      "begin_line": 55,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 59)",
        "(line 57,col 9)-(line 57,col 57)",
        "(line 58,col 9)-(line 58,col 94)",
        "(line 59,col 9)-(line 59,col 95)",
        "(line 60,col 9)-(line 60,col 58)",
        "(line 61,col 9)-(line 61,col 59)",
        "(line 62,col 9)-(line 62,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsIgnoreCase()",
      "begin_line": 65,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 69)",
        "(line 67,col 9)-(line 67,col 67)",
        "(line 68,col 9)-(line 68,col 104)",
        "(line 69,col 9)-(line 69,col 104)",
        "(line 70,col 9)-(line 70,col 68)",
        "(line 71,col 9)-(line 71,col 69)",
        "(line 72,col 9)-(line 72,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_char()",
      "begin_line": 76,
      "end_line": 81,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 57)",
        "(line 78,col 9)-(line 78,col 55)",
        "(line 79,col 9)-(line 79,col 62)",
        "(line 80,col 9)-(line 80,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_charInt()",
      "begin_line": 83,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 60)",
        "(line 85,col 9)-(line 85,col 61)",
        "(line 86,col 9)-(line 86,col 58)",
        "(line 87,col 9)-(line 87,col 59)",
        "(line 88,col 9)-(line 88,col 65)",
        "(line 89,col 9)-(line 89,col 65)",
        "(line 90,col 9)-(line 90,col 65)",
        "(line 91,col 9)-(line 91,col 66)",
        "(line 92,col 9)-(line 92,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_String()",
      "begin_line": 95,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 58)",
        "(line 97,col 9)-(line 97,col 56)",
        "(line 98,col 9)-(line 98,col 53)",
        "(line 99,col 9)-(line 99,col 62)",
        "(line 100,col 9)-(line 100,col 62)",
        "(line 101,col 9)-(line 101,col 63)",
        "(line 102,col 9)-(line 102,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_String()",
      "begin_line": 105,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 68)",
        "(line 107,col 9)-(line 107,col 66)",
        "(line 108,col 9)-(line 108,col 66)",
        "(line 109,col 9)-(line 109,col 63)",
        "(line 110,col 9)-(line 110,col 72)",
        "(line 111,col 9)-(line 111,col 72)",
        "(line 112,col 9)-(line 112,col 72)",
        "(line 113,col 9)-(line 113,col 72)",
        "(line 114,col 9)-(line 114,col 73)",
        "(line 115,col 9)-(line 115,col 73)",
        "(line 116,col 9)-(line 116,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_StringInt()",
      "begin_line": 119,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 77)",
        "(line 121,col 9)-(line 121,col 76)",
        "(line 122,col 9)-(line 122,col 76)",
        "(line 123,col 9)-(line 123,col 76)",
        "(line 124,col 9)-(line 124,col 76)",
        "(line 125,col 9)-(line 125,col 76)",
        "(line 126,col 9)-(line 126,col 77)",
        "(line 127,col 9)-(line 127,col 77)",
        "(line 128,col 9)-(line 128,col 77)",
        "(line 129,col 9)-(line 129,col 77)",
        "(line 130,col 9)-(line 130,col 71)",
        "(line 131,col 9)-(line 131,col 74)",
        "(line 132,col 9)-(line 132,col 72)",
        "(line 133,col 9)-(line 133,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testOrdinalIndexOf()",
      "begin_line": 136,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 84)",
        "(line 138,col 9)-(line 138,col 82)",
        "(line 139,col 9)-(line 139,col 80)",
        "(line 140,col 9)-(line 140,col 89)",
        "(line 141,col 9)-(line 141,col 89)",
        "(line 142,col 9)-(line 142,col 90)",
        "(line 143,col 9)-(line 143,col 88)",
        "(line 145,col 9)-(line 145,col 69)",
        "(line 146,col 9)-(line 146,col 67)",
        "(line 147,col 9)-(line 147,col 65)",
        "(line 148,col 9)-(line 148,col 74)",
        "(line 149,col 9)-(line 149,col 74)",
        "(line 150,col 9)-(line 150,col 75)",
        "(line 151,col 9)-(line 151,col 73)",
        "(line 153,col 9)-(line 153,col 68)",
        "(line 154,col 9)-(line 154,col 66)",
        "(line 155,col 9)-(line 155,col 64)",
        "(line 156,col 9)-(line 156,col 73)",
        "(line 157,col 9)-(line 157,col 73)",
        "(line 158,col 9)-(line 158,col 74)",
        "(line 159,col 9)-(line 159,col 72)",
        "(line 161,col 9)-(line 161,col 68)",
        "(line 162,col 9)-(line 162,col 66)",
        "(line 163,col 9)-(line 163,col 63)",
        "(line 164,col 9)-(line 164,col 72)",
        "(line 165,col 9)-(line 165,col 72)",
        "(line 166,col 9)-(line 166,col 73)",
        "(line 167,col 9)-(line 167,col 71)",
        "(line 169,col 9)-(line 169,col 68)",
        "(line 170,col 9)-(line 170,col 66)",
        "(line 171,col 9)-(line 171,col 63)",
        "(line 172,col 9)-(line 172,col 72)",
        "(line 173,col 9)-(line 173,col 72)",
        "(line 174,col 9)-(line 174,col 73)",
        "(line 175,col 9)-(line 175,col 71)",
        "(line 177,col 9)-(line 177,col 84)",
        "(line 178,col 9)-(line 178,col 82)",
        "(line 179,col 9)-(line 179,col 79)",
        "(line 180,col 9)-(line 180,col 89)",
        "(line 181,col 9)-(line 181,col 89)",
        "(line 182,col 9)-(line 182,col 90)",
        "(line 183,col 9)-(line 183,col 87)",
        "(line 185,col 9)-(line 185,col 74)",
        "(line 186,col 9)-(line 186,col 73)",
        "(line 187,col 9)-(line 187,col 73)",
        "(line 188,col 9)-(line 188,col 73)",
        "(line 189,col 9)-(line 189,col 73)",
        "(line 190,col 9)-(line 190,col 73)",
        "(line 191,col 9)-(line 191,col 73)",
        "(line 192,col 9)-(line 192,col 73)",
        "(line 193,col 9)-(line 193,col 73)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 195,col 9)-(line 195,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_StringInt()",
      "begin_line": 198,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 61)",
        "(line 200,col 9)-(line 200,col 62)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 60)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 204,col 9)-(line 204,col 60)",
        "(line 205,col 9)-(line 205,col 56)",
        "(line 206,col 9)-(line 206,col 57)",
        "(line 207,col 9)-(line 207,col 56)",
        "(line 208,col 9)-(line 208,col 59)",
        "(line 209,col 9)-(line 209,col 60)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 211,col 59)",
        "(line 212,col 9)-(line 212,col 65)",
        "(line 213,col 9)-(line 213,col 65)",
        "(line 214,col 9)-(line 214,col 66)",
        "(line 215,col 9)-(line 215,col 65)",
        "(line 216,col 9)-(line 216,col 66)",
        "(line 217,col 9)-(line 217,col 66)",
        "(line 218,col 9)-(line 218,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_char()",
      "begin_line": 222,
      "end_line": 227,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 61)",
        "(line 224,col 9)-(line 224,col 59)",
        "(line 225,col 9)-(line 225,col 66)",
        "(line 226,col 9)-(line 226,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_charInt()",
      "begin_line": 229,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 64)",
        "(line 231,col 9)-(line 231,col 65)",
        "(line 232,col 9)-(line 232,col 62)",
        "(line 233,col 9)-(line 233,col 63)",
        "(line 234,col 9)-(line 234,col 69)",
        "(line 235,col 9)-(line 235,col 69)",
        "(line 236,col 9)-(line 236,col 69)",
        "(line 237,col 9)-(line 237,col 69)",
        "(line 238,col 9)-(line 238,col 71)",
        "(line 239,col 9)-(line 239,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_String()",
      "begin_line": 242,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 62)",
        "(line 244,col 9)-(line 244,col 60)",
        "(line 245,col 9)-(line 245,col 59)",
        "(line 246,col 9)-(line 246,col 57)",
        "(line 247,col 9)-(line 247,col 65)",
        "(line 248,col 9)-(line 248,col 66)",
        "(line 249,col 9)-(line 249,col 66)",
        "(line 250,col 9)-(line 250,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastOrdinalIndexOf()",
      "begin_line": 253,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 73)",
        "(line 255,col 9)-(line 255,col 73)",
        "(line 256,col 9)-(line 256,col 69)",
        "(line 257,col 9)-(line 257,col 77)",
        "(line 258,col 9)-(line 258,col 77)",
        "(line 259,col 9)-(line 259,col 77)",
        "(line 260,col 9)-(line 260,col 77)",
        "(line 261,col 9)-(line 261,col 78)",
        "(line 262,col 9)-(line 262,col 78)",
        "(line 263,col 9)-(line 263,col 76)",
        "(line 264,col 9)-(line 264,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_StringInt()",
      "begin_line": 267,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 65)",
        "(line 269,col 9)-(line 269,col 66)",
        "(line 270,col 9)-(line 270,col 63)",
        "(line 271,col 9)-(line 271,col 64)",
        "(line 272,col 9)-(line 272,col 63)",
        "(line 273,col 9)-(line 273,col 64)",
        "(line 274,col 9)-(line 274,col 60)",
        "(line 275,col 9)-(line 275,col 62)",
        "(line 276,col 9)-(line 276,col 60)",
        "(line 277,col 9)-(line 277,col 63)",
        "(line 278,col 9)-(line 278,col 65)",
        "(line 279,col 9)-(line 279,col 63)",
        "(line 280,col 9)-(line 280,col 69)",
        "(line 281,col 9)-(line 281,col 69)",
        "(line 282,col 9)-(line 282,col 70)",
        "(line 283,col 9)-(line 283,col 69)",
        "(line 284,col 9)-(line 284,col 69)",
        "(line 285,col 9)-(line 285,col 71)",
        "(line 286,col 9)-(line 286,col 70)",
        "(line 287,col 9)-(line 287,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_String()",
      "begin_line": 290,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 72)",
        "(line 292,col 9)-(line 292,col 70)",
        "(line 293,col 9)-(line 293,col 70)",
        "(line 294,col 9)-(line 294,col 69)",
        "(line 295,col 9)-(line 295,col 67)",
        "(line 296,col 9)-(line 296,col 75)",
        "(line 297,col 9)-(line 297,col 76)",
        "(line 298,col 9)-(line 298,col 76)",
        "(line 299,col 9)-(line 299,col 76)",
        "(line 300,col 9)-(line 300,col 76)",
        "(line 301,col 9)-(line 301,col 77)",
        "(line 302,col 9)-(line 302,col 77)",
        "(line 303,col 9)-(line 303,col 73)",
        "(line 304,col 9)-(line 304,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_StringInt()",
      "begin_line": 307,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 75)",
        "(line 309,col 9)-(line 309,col 76)",
        "(line 310,col 9)-(line 310,col 73)",
        "(line 311,col 9)-(line 311,col 74)",
        "(line 312,col 9)-(line 312,col 73)",
        "(line 313,col 9)-(line 313,col 74)",
        "(line 314,col 9)-(line 314,col 70)",
        "(line 315,col 9)-(line 315,col 72)",
        "(line 316,col 9)-(line 316,col 70)",
        "(line 317,col 9)-(line 317,col 73)",
        "(line 318,col 9)-(line 318,col 75)",
        "(line 319,col 9)-(line 319,col 73)",
        "(line 320,col 9)-(line 320,col 79)",
        "(line 321,col 9)-(line 321,col 79)",
        "(line 322,col 9)-(line 322,col 80)",
        "(line 323,col 9)-(line 323,col 79)",
        "(line 324,col 9)-(line 324,col 79)",
        "(line 325,col 9)-(line 325,col 81)",
        "(line 326,col 9)-(line 326,col 80)",
        "(line 327,col 9)-(line 327,col 79)",
        "(line 328,col 9)-(line 328,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsChar()",
      "begin_line": 332,
      "end_line": 341,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 61)",
        "(line 334,col 9)-(line 334,col 59)",
        "(line 335,col 9)-(line 335,col 59)",
        "(line 336,col 9)-(line 336,col 61)",
        "(line 337,col 9)-(line 337,col 61)",
        "(line 338,col 9)-(line 338,col 61)",
        "(line 339,col 9)-(line 339,col 61)",
        "(line 340,col 9)-(line 340,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsString()",
      "begin_line": 343,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 62)",
        "(line 345,col 9)-(line 345,col 60)",
        "(line 346,col 9)-(line 346,col 61)",
        "(line 347,col 9)-(line 347,col 60)",
        "(line 348,col 9)-(line 348,col 57)",
        "(line 349,col 9)-(line 349,col 59)",
        "(line 350,col 9)-(line 350,col 61)",
        "(line 351,col 9)-(line 351,col 61)",
        "(line 352,col 9)-(line 352,col 61)",
        "(line 353,col 9)-(line 353,col 63)",
        "(line 354,col 9)-(line 354,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_StringString()",
      "begin_line": 357,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 64)",
        "(line 361,col 9)-(line 361,col 62)",
        "(line 362,col 9)-(line 362,col 63)",
        "(line 363,col 9)-(line 363,col 65)",
        "(line 365,col 9)-(line 365,col 62)",
        "(line 366,col 9)-(line 366,col 63)",
        "(line 367,col 9)-(line 367,col 65)",
        "(line 370,col 9)-(line 370,col 59)",
        "(line 371,col 9)-(line 371,col 60)",
        "(line 372,col 9)-(line 372,col 62)",
        "(line 375,col 9)-(line 375,col 61)",
        "(line 376,col 9)-(line 376,col 61)",
        "(line 377,col 9)-(line 377,col 63)",
        "(line 378,col 9)-(line 378,col 61)",
        "(line 379,col 9)-(line 379,col 61)",
        "(line 380,col 9)-(line 380,col 63)",
        "(line 383,col 9)-(line 383,col 63)",
        "(line 384,col 9)-(line 384,col 64)",
        "(line 385,col 9)-(line 385,col 67)",
        "(line 386,col 9)-(line 386,col 63)",
        "(line 387,col 9)-(line 387,col 64)",
        "(line 388,col 9)-(line 388,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_LocaleIndependence()",
      "begin_line": 391,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 42)",
        "(line 394,col 9)-(line 394,col 85)",
        "(line 396,col 9)-(line 402,col 10)",
        "(line 404,col 9)-(line 406,col 10)",
        "(line 408,col 9)-(line 422,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringarray()",
      "begin_line": 426,
      "end_line": 441,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 72)",
        "(line 428,col 9)-(line 428,col 73)",
        "(line 429,col 9)-(line 429,col 74)",
        "(line 430,col 9)-(line 430,col 74)",
        "(line 431,col 9)-(line 431,col 72)",
        "(line 432,col 9)-(line 432,col 70)",
        "(line 433,col 9)-(line 433,col 68)",
        "(line 434,col 9)-(line 434,col 80)",
        "(line 435,col 9)-(line 435,col 75)",
        "(line 436,col 9)-(line 436,col 71)",
        "(line 437,col 9)-(line 437,col 73)",
        "(line 438,col 9)-(line 438,col 74)",
        "(line 439,col 9)-(line 439,col 78)",
        "(line 440,col 9)-(line 440,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfAny_StringStringarray()",
      "begin_line": 443,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 65)",
        "(line 445,col 9)-(line 445,col 77)",
        "(line 446,col 9)-(line 446,col 67)",
        "(line 447,col 9)-(line 447,col 78)",
        "(line 448,col 9)-(line 448,col 76)",
        "(line 449,col 9)-(line 449,col 74)",
        "(line 450,col 9)-(line 450,col 72)",
        "(line 451,col 9)-(line 451,col 84)",
        "(line 452,col 9)-(line 452,col 79)",
        "(line 453,col 9)-(line 453,col 75)",
        "(line 454,col 9)-(line 454,col 77)",
        "(line 455,col 9)-(line 455,col 78)",
        "(line 456,col 9)-(line 456,col 82)",
        "(line 457,col 9)-(line 457,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringChararray()",
      "begin_line": 461,
      "end_line": 475,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 70)",
        "(line 463,col 9)-(line 463,col 68)",
        "(line 464,col 9)-(line 464,col 77)",
        "(line 466,col 9)-(line 466,col 68)",
        "(line 467,col 9)-(line 467,col 66)",
        "(line 468,col 9)-(line 468,col 75)",
        "(line 470,col 9)-(line 470,col 78)",
        "(line 471,col 9)-(line 471,col 76)",
        "(line 472,col 9)-(line 472,col 84)",
        "(line 473,col 9)-(line 473,col 84)",
        "(line 474,col 9)-(line 474,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringString()",
      "begin_line": 477,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 70)",
        "(line 479,col 9)-(line 479,col 59)",
        "(line 480,col 9)-(line 480,col 61)",
        "(line 482,col 9)-(line 482,col 68)",
        "(line 483,col 9)-(line 483,col 57)",
        "(line 484,col 9)-(line 484,col 59)",
        "(line 486,col 9)-(line 486,col 78)",
        "(line 487,col 9)-(line 487,col 67)",
        "(line 488,col 9)-(line 488,col 68)",
        "(line 489,col 9)-(line 489,col 68)",
        "(line 490,col 9)-(line 490,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringChararray()",
      "begin_line": 494,
      "end_line": 508,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 66)",
        "(line 496,col 9)-(line 496,col 64)",
        "(line 497,col 9)-(line 497,col 73)",
        "(line 499,col 9)-(line 499,col 64)",
        "(line 500,col 9)-(line 500,col 62)",
        "(line 501,col 9)-(line 501,col 71)",
        "(line 503,col 9)-(line 503,col 74)",
        "(line 504,col 9)-(line 504,col 72)",
        "(line 505,col 9)-(line 505,col 80)",
        "(line 506,col 9)-(line 506,col 80)",
        "(line 507,col 9)-(line 507,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringString()",
      "begin_line": 510,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 66)",
        "(line 512,col 9)-(line 512,col 55)",
        "(line 513,col 9)-(line 513,col 57)",
        "(line 515,col 9)-(line 515,col 64)",
        "(line 516,col 9)-(line 516,col 53)",
        "(line 517,col 9)-(line 517,col 55)",
        "(line 519,col 9)-(line 519,col 74)",
        "(line 520,col 9)-(line 520,col 63)",
        "(line 521,col 9)-(line 521,col 64)",
        "(line 522,col 9)-(line 522,col 64)",
        "(line 523,col 9)-(line 523,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringChararray()",
      "begin_line": 527,
      "end_line": 541,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 73)",
        "(line 529,col 9)-(line 529,col 71)",
        "(line 530,col 9)-(line 530,col 80)",
        "(line 532,col 9)-(line 532,col 71)",
        "(line 533,col 9)-(line 533,col 69)",
        "(line 534,col 9)-(line 534,col 78)",
        "(line 536,col 9)-(line 536,col 81)",
        "(line 537,col 9)-(line 537,col 79)",
        "(line 538,col 9)-(line 538,col 87)",
        "(line 539,col 9)-(line 539,col 87)",
        "(line 540,col 9)-(line 540,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringString()",
      "begin_line": 543,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 73)",
        "(line 545,col 9)-(line 545,col 62)",
        "(line 546,col 9)-(line 546,col 64)",
        "(line 548,col 9)-(line 548,col 71)",
        "(line 549,col 9)-(line 549,col 60)",
        "(line 550,col 9)-(line 550,col 62)",
        "(line 552,col 9)-(line 552,col 81)",
        "(line 553,col 9)-(line 553,col 70)",
        "(line 554,col 9)-(line 554,col 71)",
        "(line 555,col 9)-(line 555,col 71)",
        "(line 556,col 9)-(line 556,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_String()",
      "begin_line": 560,
      "end_line": 582,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 26)",
        "(line 562,col 9)-(line 562,col 26)",
        "(line 563,col 9)-(line 563,col 27)",
        "(line 564,col 9)-(line 564,col 27)",
        "(line 565,col 9)-(line 565,col 27)",
        "(line 566,col 9)-(line 566,col 28)",
        "(line 567,col 9)-(line 567,col 75)",
        "(line 568,col 9)-(line 568,col 73)",
        "(line 569,col 9)-(line 569,col 64)",
        "(line 570,col 9)-(line 570,col 64)",
        "(line 571,col 9)-(line 571,col 61)",
        "(line 572,col 9)-(line 572,col 65)",
        "(line 573,col 9)-(line 573,col 68)",
        "(line 574,col 9)-(line 574,col 67)",
        "(line 575,col 9)-(line 575,col 67)",
        "(line 576,col 9)-(line 576,col 67)",
        "(line 577,col 9)-(line 577,col 68)",
        "(line 578,col 9)-(line 578,col 67)",
        "(line 579,col 9)-(line 579,col 68)",
        "(line 580,col 9)-(line 580,col 68)",
        "(line 581,col 9)-(line 581,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_Chararray()",
      "begin_line": 584,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 26)",
        "(line 586,col 9)-(line 586,col 26)",
        "(line 587,col 9)-(line 587,col 27)",
        "(line 588,col 9)-(line 588,col 29)",
        "(line 589,col 9)-(line 589,col 29)",
        "(line 590,col 9)-(line 590,col 34)",
        "(line 591,col 9)-(line 591,col 40)",
        "(line 592,col 9)-(line 592,col 75)",
        "(line 593,col 9)-(line 593,col 73)",
        "(line 594,col 9)-(line 594,col 72)",
        "(line 595,col 9)-(line 595,col 72)",
        "(line 596,col 9)-(line 596,col 69)",
        "(line 597,col 9)-(line 597,col 65)",
        "(line 598,col 9)-(line 598,col 68)",
        "(line 599,col 9)-(line 599,col 67)",
        "(line 600,col 9)-(line 600,col 67)",
        "(line 601,col 9)-(line 601,col 67)",
        "(line 602,col 9)-(line 602,col 68)",
        "(line 603,col 9)-(line 603,col 67)",
        "(line 604,col 9)-(line 604,col 68)",
        "(line 605,col 9)-(line 605,col 68)",
        "(line 606,col 9)-(line 606,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_String()",
      "begin_line": 609,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 26)",
        "(line 611,col 9)-(line 611,col 26)",
        "(line 612,col 9)-(line 612,col 28)",
        "(line 613,col 9)-(line 613,col 27)",
        "(line 614,col 9)-(line 614,col 27)",
        "(line 615,col 9)-(line 615,col 28)",
        "(line 616,col 9)-(line 616,col 74)",
        "(line 617,col 9)-(line 617,col 72)",
        "(line 618,col 9)-(line 618,col 63)",
        "(line 619,col 9)-(line 619,col 63)",
        "(line 620,col 9)-(line 620,col 61)",
        "(line 621,col 9)-(line 621,col 65)",
        "(line 622,col 9)-(line 622,col 67)",
        "(line 623,col 9)-(line 623,col 67)",
        "(line 624,col 9)-(line 624,col 67)",
        "(line 625,col 9)-(line 625,col 68)",
        "(line 626,col 9)-(line 626,col 67)",
        "(line 627,col 9)-(line 627,col 67)",
        "(line 628,col 9)-(line 628,col 68)",
        "(line 629,col 9)-(line 629,col 68)",
        "(line 630,col 9)-(line 630,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_Chararray()",
      "begin_line": 633,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 26)",
        "(line 635,col 9)-(line 635,col 26)",
        "(line 636,col 9)-(line 636,col 28)",
        "(line 637,col 9)-(line 637,col 29)",
        "(line 638,col 9)-(line 638,col 29)",
        "(line 639,col 9)-(line 639,col 34)",
        "(line 640,col 9)-(line 640,col 40)",
        "(line 641,col 9)-(line 641,col 74)",
        "(line 642,col 9)-(line 642,col 72)",
        "(line 643,col 9)-(line 643,col 71)",
        "(line 644,col 9)-(line 644,col 71)",
        "(line 645,col 9)-(line 645,col 69)",
        "(line 646,col 9)-(line 646,col 65)",
        "(line 647,col 9)-(line 647,col 67)",
        "(line 648,col 9)-(line 648,col 67)",
        "(line 649,col 9)-(line 649,col 67)",
        "(line 650,col 9)-(line 650,col 68)",
        "(line 651,col 9)-(line 651,col 67)",
        "(line 652,col 9)-(line 652,col 67)",
        "(line 653,col 9)-(line 653,col 68)",
        "(line 654,col 9)-(line 654,col 68)",
        "(line 655,col 9)-(line 655,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsStringWithSupplementaryChars()",
      "begin_line": 661,
      "end_line": 666,
      "comment": "\n\t * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n\t ",
      "child_ranges": [
        "(line 662,col 3)-(line 662,col 80)",
        "(line 663,col 3)-(line 663,col 80)",
        "(line 664,col 3)-(line 664,col 67)",
        "(line 665,col 3)-(line 665,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAnyStringWithSupplementaryChars()",
      "begin_line": 671,
      "end_line": 682,
      "comment": "\n\t * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n\t ",
      "child_ranges": [
        "(line 672,col 3)-(line 672,col 83)",
        "(line 673,col 3)-(line 673,col 83)",
        "(line 674,col 3)-(line 674,col 70)",
        "(line 676,col 3)-(line 676,col 51)",
        "(line 677,col 3)-(line 677,col 60)",
        "(line 678,col 3)-(line 678,col 61)",
        "(line 680,col 3)-(line 680,col 71)",
        "(line 681,col 3)-(line 681,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAnyCharArrayWithSupplementaryChars()",
      "begin_line": 687,
      "end_line": 698,
      "comment": "\n\t * See http://java.sun.com/developer/technicalArticles/Intl/Supplementary/\n\t ",
      "child_ranges": [
        "(line 688,col 3)-(line 688,col 97)",
        "(line 689,col 3)-(line 689,col 97)",
        "(line 690,col 3)-(line 690,col 84)",
        "(line 692,col 3)-(line 692,col 51)",
        "(line 693,col 3)-(line 693,col 60)",
        "(line 694,col 3)-(line 694,col 61)",
        "(line 696,col 3)-(line 696,col 85)",
        "(line 697,col 3)-(line 697,col 85)"
      ]
    }
  ]
}