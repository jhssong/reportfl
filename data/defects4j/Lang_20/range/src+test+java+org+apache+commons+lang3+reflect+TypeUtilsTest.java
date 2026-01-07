{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/reflect/TypeUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "//raw types, where used, are used purposely\nTypeUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 665,
      "comment": "\n * Test TypeUtils\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "This",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "That",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.This\u003cK, V\u003e"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "And",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.This\u003cjava.lang.Number, java.lang.Number\u003e"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "The",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.That\u003cjava.lang.Number, java.lang.Number\u003e",
        "org.apache.commons.lang3.reflect.TypeUtilsTest.And\u003cjava.lang.String, java.lang.String\u003e"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Other",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.This\u003cjava.lang.String, T\u003e"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Thing",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.Other\u003cB\u003e"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Tester",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.This\u003cjava.lang.String, B\u003e"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dis"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dat"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "da"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uhder"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ding"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tester"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tester2"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dat2"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dat3"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "intWildcardComparable"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringComparable"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uriComparable"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "intComparable"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longComparable"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uri"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.dummyMethod(java.util.List, java.util.List\u003cjava.lang.Object\u003e, java.util.List\u003c?\u003e, java.util.List\u003c? super java.lang.Object\u003e, java.util.List\u003cjava.lang.String\u003e, java.util.List\u003c? extends java.lang.String\u003e, java.util.List\u003c? super java.lang.String\u003e, java.util.List[], java.util.List\u003cjava.lang.Object\u003e[], java.util.List\u003c?\u003e[], java.util.List\u003c? super java.lang.Object\u003e[], java.util.List\u003cjava.lang.String\u003e[], java.util.List\u003c? extends java.lang.String\u003e[], java.util.List\u003c? super java.lang.String\u003e[])",
      "begin_line": 99,
      "end_line": 104,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsAssignable()",
      "begin_line": 106,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 26)",
        "(line 111,col 9)-(line 111,col 34)",
        "(line 112,col 9)-(line 112,col 29)",
        "(line 113,col 9)-(line 113,col 42)",
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 44)",
        "(line 116,col 9)-(line 116,col 42)",
        "(line 117,col 9)-(line 117,col 28)",
        "(line 118,col 9)-(line 118,col 36)",
        "(line 119,col 9)-(line 119,col 31)",
        "(line 120,col 9)-(line 120,col 45)",
        "(line 121,col 9)-(line 121,col 37)",
        "(line 122,col 9)-(line 122,col 47)",
        "(line 123,col 9)-(line 123,col 38)",
        "(line 124,col 9)-(line 124,col 36)",
        "(line 125,col 9)-(line 127,col 86)",
        "(line 128,col 9)-(line 128,col 57)",
        "(line 130,col 9)-(line 130,col 52)",
        "(line 131,col 9)-(line 131,col 22)",
        "(line 132,col 9)-(line 132,col 52)",
        "(line 133,col 9)-(line 133,col 22)",
        "(line 134,col 9)-(line 134,col 52)",
        "(line 135,col 9)-(line 135,col 22)",
        "(line 136,col 9)-(line 136,col 52)",
        "(line 137,col 9)-(line 137,col 22)",
        "(line 138,col 9)-(line 138,col 52)",
        "(line 139,col 9)-(line 139,col 22)",
        "(line 140,col 9)-(line 140,col 52)",
        "(line 141,col 9)-(line 141,col 22)",
        "(line 142,col 9)-(line 142,col 52)",
        "(line 143,col 9)-(line 143,col 22)",
        "(line 144,col 9)-(line 144,col 52)",
        "(line 145,col 9)-(line 145,col 22)",
        "(line 146,col 9)-(line 146,col 52)",
        "(line 147,col 9)-(line 147,col 22)",
        "(line 148,col 9)-(line 148,col 52)",
        "(line 149,col 9)-(line 149,col 22)",
        "(line 150,col 9)-(line 150,col 52)",
        "(line 151,col 9)-(line 151,col 22)",
        "(line 152,col 9)-(line 152,col 52)",
        "(line 153,col 9)-(line 153,col 22)",
        "(line 154,col 9)-(line 154,col 52)",
        "(line 156,col 9)-(line 156,col 52)",
        "(line 157,col 9)-(line 157,col 22)",
        "(line 158,col 9)-(line 158,col 52)",
        "(line 159,col 9)-(line 159,col 37)",
        "(line 160,col 9)-(line 160,col 53)",
        "(line 161,col 9)-(line 161,col 22)",
        "(line 162,col 9)-(line 162,col 52)",
        "(line 163,col 9)-(line 163,col 37)",
        "(line 164,col 9)-(line 164,col 53)",
        "(line 166,col 9)-(line 166,col 53)",
        "(line 168,col 9)-(line 168,col 53)",
        "(line 170,col 9)-(line 170,col 53)",
        "(line 172,col 9)-(line 172,col 53)",
        "(line 173,col 9)-(line 173,col 22)",
        "(line 174,col 9)-(line 174,col 52)",
        "(line 175,col 9)-(line 175,col 37)",
        "(line 176,col 9)-(line 176,col 53)",
        "(line 178,col 9)-(line 178,col 52)",
        "(line 179,col 9)-(line 179,col 22)",
        "(line 180,col 9)-(line 180,col 53)",
        "(line 181,col 9)-(line 181,col 22)",
        "(line 182,col 9)-(line 182,col 52)",
        "(line 183,col 9)-(line 183,col 45)",
        "(line 184,col 9)-(line 184,col 53)",
        "(line 185,col 9)-(line 185,col 22)",
        "(line 186,col 9)-(line 186,col 52)",
        "(line 187,col 9)-(line 187,col 37)",
        "(line 188,col 9)-(line 188,col 53)",
        "(line 189,col 9)-(line 189,col 22)",
        "(line 190,col 9)-(line 190,col 52)",
        "(line 191,col 9)-(line 191,col 47)",
        "(line 192,col 9)-(line 192,col 53)",
        "(line 194,col 9)-(line 194,col 52)",
        "(line 195,col 9)-(line 195,col 45)",
        "(line 196,col 9)-(line 196,col 52)",
        "(line 198,col 9)-(line 198,col 53)",
        "(line 200,col 9)-(line 200,col 53)",
        "(line 202,col 9)-(line 202,col 53)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 205,col 9)-(line 205,col 22)",
        "(line 206,col 9)-(line 206,col 52)",
        "(line 207,col 9)-(line 207,col 45)",
        "(line 208,col 9)-(line 208,col 53)",
        "(line 210,col 9)-(line 210,col 52)",
        "(line 211,col 9)-(line 211,col 22)",
        "(line 212,col 9)-(line 212,col 52)",
        "(line 213,col 9)-(line 213,col 37)",
        "(line 214,col 9)-(line 214,col 53)",
        "(line 215,col 9)-(line 215,col 22)",
        "(line 216,col 9)-(line 216,col 52)",
        "(line 217,col 9)-(line 217,col 37)",
        "(line 218,col 9)-(line 218,col 53)",
        "(line 220,col 9)-(line 220,col 52)",
        "(line 221,col 9)-(line 221,col 45)",
        "(line 222,col 9)-(line 222,col 53)",
        "(line 223,col 9)-(line 223,col 47)",
        "(line 224,col 9)-(line 224,col 53)",
        "(line 226,col 9)-(line 226,col 52)",
        "(line 229,col 9)-(line 229,col 52)",
        "(line 230,col 9)-(line 230,col 22)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 232,col 9)-(line 232,col 22)",
        "(line 233,col 9)-(line 233,col 52)",
        "(line 234,col 9)-(line 234,col 22)",
        "(line 235,col 9)-(line 235,col 52)",
        "(line 236,col 9)-(line 236,col 22)",
        "(line 237,col 9)-(line 237,col 52)",
        "(line 238,col 9)-(line 238,col 23)",
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 240,col 23)",
        "(line 241,col 9)-(line 241,col 53)",
        "(line 242,col 9)-(line 242,col 23)",
        "(line 243,col 9)-(line 243,col 53)",
        "(line 244,col 9)-(line 244,col 23)",
        "(line 245,col 9)-(line 245,col 53)",
        "(line 246,col 9)-(line 246,col 23)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 248,col 23)",
        "(line 249,col 9)-(line 249,col 53)",
        "(line 250,col 9)-(line 250,col 23)",
        "(line 251,col 9)-(line 251,col 53)",
        "(line 252,col 9)-(line 252,col 23)",
        "(line 253,col 9)-(line 253,col 53)",
        "(line 255,col 9)-(line 255,col 52)",
        "(line 256,col 9)-(line 256,col 22)",
        "(line 257,col 9)-(line 257,col 52)",
        "(line 258,col 9)-(line 258,col 39)",
        "(line 259,col 9)-(line 259,col 53)",
        "(line 260,col 9)-(line 260,col 23)",
        "(line 261,col 9)-(line 261,col 53)",
        "(line 262,col 9)-(line 262,col 40)",
        "(line 263,col 9)-(line 263,col 54)",
        "(line 265,col 9)-(line 265,col 54)",
        "(line 267,col 9)-(line 267,col 54)",
        "(line 269,col 9)-(line 269,col 54)",
        "(line 271,col 9)-(line 271,col 54)",
        "(line 272,col 9)-(line 272,col 23)",
        "(line 273,col 9)-(line 273,col 53)",
        "(line 274,col 9)-(line 274,col 40)",
        "(line 275,col 9)-(line 275,col 54)",
        "(line 277,col 9)-(line 277,col 52)",
        "(line 278,col 9)-(line 278,col 48)",
        "(line 279,col 9)-(line 279,col 54)",
        "(line 280,col 9)-(line 280,col 23)",
        "(line 281,col 9)-(line 281,col 53)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 54)",
        "(line 284,col 9)-(line 284,col 23)",
        "(line 285,col 9)-(line 285,col 53)",
        "(line 286,col 9)-(line 286,col 50)",
        "(line 287,col 9)-(line 287,col 54)",
        "(line 288,col 9)-(line 288,col 23)",
        "(line 289,col 9)-(line 289,col 53)",
        "(line 290,col 9)-(line 290,col 48)",
        "(line 291,col 9)-(line 291,col 54)",
        "(line 292,col 9)-(line 292,col 23)",
        "(line 293,col 9)-(line 293,col 53)",
        "(line 295,col 9)-(line 295,col 54)",
        "(line 297,col 9)-(line 297,col 55)",
        "(line 299,col 9)-(line 299,col 55)",
        "(line 301,col 9)-(line 301,col 55)",
        "(line 303,col 9)-(line 303,col 55)",
        "(line 304,col 9)-(line 304,col 24)",
        "(line 305,col 9)-(line 305,col 54)",
        "(line 306,col 9)-(line 306,col 49)",
        "(line 307,col 9)-(line 307,col 55)",
        "(line 309,col 9)-(line 309,col 54)",
        "(line 310,col 9)-(line 310,col 24)",
        "(line 311,col 9)-(line 311,col 54)",
        "(line 312,col 9)-(line 312,col 41)",
        "(line 313,col 9)-(line 313,col 55)",
        "(line 314,col 9)-(line 314,col 24)",
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 316,col 41)",
        "(line 317,col 9)-(line 317,col 55)",
        "(line 319,col 9)-(line 319,col 54)",
        "(line 320,col 9)-(line 320,col 49)",
        "(line 321,col 9)-(line 321,col 55)",
        "(line 322,col 9)-(line 322,col 51)",
        "(line 323,col 9)-(line 323,col 55)",
        "(line 325,col 9)-(line 325,col 54)",
        "(line 326,col 9)-(line 326,col 67)",
        "(line 329,col 9)-(line 329,col 67)",
        "(line 330,col 9)-(line 330,col 65)",
        "(line 331,col 9)-(line 331,col 71)",
        "(line 332,col 9)-(line 332,col 69)",
        "(line 333,col 9)-(line 333,col 73)",
        "(line 334,col 9)-(line 334,col 75)",
        "(line 335,col 9)-(line 335,col 69)",
        "(line 336,col 9)-(line 336,col 69)",
        "(line 337,col 9)-(line 337,col 18)",
        "(line 338,col 9)-(line 338,col 68)",
        "(line 340,col 9)-(line 340,col 68)",
        "(line 341,col 9)-(line 341,col 20)",
        "(line 342,col 9)-(line 342,col 70)",
        "(line 343,col 9)-(line 343,col 19)",
        "(line 344,col 9)-(line 344,col 79)",
        "(line 345,col 9)-(line 345,col 21)",
        "(line 346,col 9)-(line 346,col 71)",
        "(line 348,col 9)-(line 348,col 73)",
        "(line 350,col 9)-(line 350,col 70)",
        "(line 352,col 9)-(line 352,col 70)",
        "(line 354,col 9)-(line 354,col 70)",
        "(line 355,col 9)-(line 355,col 20)",
        "(line 356,col 9)-(line 356,col 27)",
        "(line 357,col 9)-(line 357,col 20)",
        "(line 358,col 9)-(line 358,col 21)",
        "(line 359,col 9)-(line 359,col 19)",
        "(line 360,col 9)-(line 360,col 20)",
        "(line 361,col 9)-(line 361,col 21)",
        "(line 362,col 9)-(line 362,col 22)",
        "(line 363,col 9)-(line 363,col 16)",
        "(line 364,col 9)-(line 364,col 76)",
        "(line 365,col 9)-(line 365,col 16)",
        "(line 366,col 9)-(line 366,col 76)",
        "(line 367,col 9)-(line 367,col 16)",
        "(line 368,col 9)-(line 368,col 77)",
        "(line 369,col 9)-(line 369,col 16)",
        "(line 370,col 9)-(line 370,col 75)",
        "(line 371,col 9)-(line 371,col 16)",
        "(line 372,col 9)-(line 372,col 76)",
        "(line 373,col 9)-(line 373,col 16)",
        "(line 374,col 9)-(line 374,col 77)",
        "(line 375,col 9)-(line 375,col 16)",
        "(line 376,col 9)-(line 376,col 73)",
        "(line 377,col 9)-(line 377,col 28)",
        "(line 378,col 9)-(line 378,col 77)",
        "(line 380,col 9)-(line 380,col 74)",
        "(line 382,col 9)-(line 382,col 78)",
        "(line 383,col 9)-(line 383,col 28)",
        "(line 384,col 9)-(line 384,col 76)",
        "(line 385,col 9)-(line 385,col 26)",
        "(line 386,col 9)-(line 386,col 76)",
        "(line 387,col 9)-(line 387,col 75)",
        "(line 388,col 9)-(line 388,col 75)",
        "(line 389,col 9)-(line 389,col 87)",
        "(line 390,col 9)-(line 390,col 26)",
        "(line 391,col 9)-(line 391,col 80)",
        "(line 392,col 9)-(line 392,col 79)",
        "(line 393,col 9)-(line 393,col 29)",
        "(line 394,col 9)-(line 394,col 81)",
        "(line 395,col 9)-(line 395,col 89)",
        "(line 397,col 9)-(line 397,col 82)",
        "(line 399,col 9)-(line 399,col 86)",
        "(line 402,col 9)-(line 402,col 78)",
        "(line 403,col 9)-(line 403,col 28)",
        "(line 404,col 9)-(line 404,col 84)",
        "(line 405,col 9)-(line 405,col 35)",
        "(line 406,col 9)-(line 406,col 75)",
        "(line 408,col 9)-(line 408,col 81)",
        "(line 409,col 9)-(line 409,col 25)",
        "(line 410,col 9)-(line 410,col 20)",
        "(line 412,col 9)-(line 412,col 80)",
        "(line 413,col 9)-(line 413,col 28)",
        "(line 414,col 9)-(line 414,col 83)",
        "(line 415,col 9)-(line 415,col 75)",
        "(line 416,col 9)-(line 416,col 75)",
        "(line 417,col 9)-(line 417,col 75)",
        "(line 418,col 9)-(line 418,col 75)",
        "(line 419,col 9)-(line 419,col 75)",
        "(line 420,col 9)-(line 420,col 58)",
        "(line 421,col 9)-(line 421,col 38)",
        "(line 422,col 9)-(line 422,col 74)",
        "(line 423,col 9)-(line 423,col 38)",
        "(line 424,col 9)-(line 424,col 74)",
        "(line 425,col 9)-(line 425,col 38)",
        "(line 426,col 9)-(line 426,col 74)",
        "(line 427,col 9)-(line 427,col 38)",
        "(line 428,col 9)-(line 428,col 74)",
        "(line 429,col 9)-(line 429,col 38)",
        "(line 430,col 9)-(line 430,col 74)",
        "(line 431,col 9)-(line 431,col 38)",
        "(line 432,col 9)-(line 432,col 74)",
        "(line 433,col 9)-(line 433,col 38)",
        "(line 434,col 9)-(line 434,col 74)",
        "(line 435,col 9)-(line 435,col 38)",
        "(line 436,col 9)-(line 436,col 74)",
        "(line 437,col 9)-(line 437,col 38)",
        "(line 438,col 9)-(line 438,col 74)",
        "(line 439,col 9)-(line 439,col 38)",
        "(line 440,col 9)-(line 440,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.delegateBooleanAssertion(java.lang.reflect.Type[], int, int, boolean)",
      "begin_line": 443,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 31)",
        "(line 445,col 9)-(line 445,col 31)",
        "(line 446,col 9)-(line 446,col 68)",
        "(line 448,col 9)-(line 456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsInstance()",
      "begin_line": 459,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 87)",
        "(line 463,col 9)-(line 463,col 87)",
        "(line 464,col 9)-(line 464,col 26)",
        "(line 465,col 9)-(line 465,col 70)",
        "(line 467,col 9)-(line 467,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetTypeArguments()",
      "begin_line": 470,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 50)",
        "(line 473,col 9)-(line 473,col 39)",
        "(line 474,col 9)-(line 474,col 21)",
        "(line 476,col 9)-(line 476,col 85)",
        "(line 477,col 9)-(line 477,col 65)",
        "(line 478,col 9)-(line 479,col 60)",
        "(line 480,col 9)-(line 480,col 53)",
        "(line 481,col 9)-(line 482,col 52)",
        "(line 484,col 9)-(line 484,col 81)",
        "(line 485,col 9)-(line 485,col 65)",
        "(line 486,col 9)-(line 487,col 60)",
        "(line 488,col 9)-(line 488,col 53)",
        "(line 489,col 9)-(line 490,col 52)",
        "(line 492,col 9)-(line 492,col 64)",
        "(line 493,col 9)-(line 493,col 82)",
        "(line 494,col 9)-(line 494,col 65)",
        "(line 495,col 9)-(line 496,col 60)",
        "(line 498,col 9)-(line 498,col 100)",
        "(line 499,col 9)-(line 499,col 54)",
        "(line 500,col 9)-(line 500,col 100)",
        "(line 501,col 9)-(line 501,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testTypesSatisfyVariables()",
      "begin_line": 504,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 89)",
        "(line 508,col 9)-(line 508,col 43)",
        "(line 509,col 9)-(line 509,col 95)",
        "(line 510,col 9)-(line 510,col 75)",
        "(line 511,col 9)-(line 511,col 31)",
        "(line 512,col 9)-(line 512,col 96)",
        "(line 513,col 9)-(line 513,col 75)",
        "(line 514,col 9)-(line 514,col 31)",
        "(line 515,col 9)-(line 515,col 96)",
        "(line 516,col 9)-(line 516,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testDetermineTypeVariableAssignments()",
      "begin_line": 519,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 523,col 34)",
        "(line 524,col 9)-(line 525,col 30)",
        "(line 526,col 9)-(line 526,col 78)",
        "(line 527,col 9)-(line 527,col 70)",
        "(line 528,col 9)-(line 529,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetRawType()",
      "begin_line": 532,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 535,col 34)",
        "(line 536,col 9)-(line 537,col 34)",
        "(line 538,col 9)-(line 538,col 95)",
        "(line 539,col 9)-(line 539,col 73)",
        "(line 540,col 9)-(line 540,col 100)",
        "(line 541,col 9)-(line 543,col 31)",
        "(line 544,col 9)-(line 544,col 83)",
        "(line 545,col 9)-(line 546,col 49)",
        "(line 547,col 9)-(line 548,col 40)",
        "(line 549,col 9)-(line 550,col 32)",
        "(line 551,col 9)-(line 552,col 32)",
        "(line 553,col 9)-(line 553,col 85)",
        "(line 554,col 9)-(line 555,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayTypeClasses()",
      "begin_line": 558,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 66)",
        "(line 561,col 9)-(line 561,col 63)",
        "(line 562,col 9)-(line 562,col 64)",
        "(line 563,col 9)-(line 563,col 62)",
        "(line 564,col 9)-(line 564,col 63)",
        "(line 565,col 9)-(line 565,col 63)",
        "(line 566,col 9)-(line 566,col 64)",
        "(line 567,col 9)-(line 567,col 65)",
        "(line 568,col 9)-(line 568,col 65)",
        "(line 569,col 9)-(line 569,col 65)",
        "(line 571,col 9)-(line 571,col 65)",
        "(line 572,col 9)-(line 572,col 62)",
        "(line 573,col 9)-(line 573,col 63)",
        "(line 574,col 9)-(line 574,col 61)",
        "(line 575,col 9)-(line 575,col 62)",
        "(line 576,col 9)-(line 576,col 62)",
        "(line 577,col 9)-(line 577,col 63)",
        "(line 578,col 9)-(line 578,col 64)",
        "(line 579,col 9)-(line 579,col 64)",
        "(line 580,col 9)-(line 580,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayGenericTypes()",
      "begin_line": 583,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 86)",
        "(line 589,col 9)-(line 589,col 57)",
        "(line 591,col 9)-(line 591,col 60)",
        "(line 592,col 9)-(line 592,col 60)",
        "(line 593,col 9)-(line 593,col 60)",
        "(line 594,col 9)-(line 594,col 60)",
        "(line 595,col 9)-(line 595,col 60)",
        "(line 596,col 9)-(line 596,col 60)",
        "(line 597,col 9)-(line 597,col 60)",
        "(line 598,col 9)-(line 598,col 59)",
        "(line 599,col 9)-(line 599,col 59)",
        "(line 600,col 9)-(line 600,col 59)",
        "(line 601,col 9)-(line 601,col 60)",
        "(line 602,col 9)-(line 602,col 60)",
        "(line 603,col 9)-(line 603,col 60)",
        "(line 604,col 9)-(line 604,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetPrimitiveArrayComponentType()",
      "begin_line": 607,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 93)",
        "(line 610,col 9)-(line 610,col 87)",
        "(line 611,col 9)-(line 611,col 89)",
        "(line 612,col 9)-(line 612,col 85)",
        "(line 613,col 9)-(line 613,col 87)",
        "(line 614,col 9)-(line 614,col 87)",
        "(line 615,col 9)-(line 615,col 89)",
        "(line 616,col 9)-(line 616,col 91)",
        "(line 618,col 9)-(line 618,col 74)",
        "(line 619,col 9)-(line 619,col 71)",
        "(line 620,col 9)-(line 620,col 72)",
        "(line 621,col 9)-(line 621,col 70)",
        "(line 622,col 9)-(line 622,col 71)",
        "(line 623,col 9)-(line 623,col 71)",
        "(line 624,col 9)-(line 624,col 72)",
        "(line 625,col 9)-(line 625,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetArrayComponentType()",
      "begin_line": 628,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 630,col 9)-(line 632,col 86)",
        "(line 634,col 9)-(line 634,col 57)",
        "(line 636,col 9)-(line 636,col 69)",
        "(line 637,col 9)-(line 637,col 69)",
        "(line 638,col 9)-(line 638,col 69)",
        "(line 639,col 9)-(line 639,col 69)",
        "(line 640,col 9)-(line 640,col 69)",
        "(line 641,col 9)-(line 641,col 69)",
        "(line 642,col 9)-(line 642,col 69)",
        "(line 643,col 9)-(line 643,col 81)",
        "(line 644,col 9)-(line 644,col 81)",
        "(line 645,col 9)-(line 645,col 81)",
        "(line 646,col 9)-(line 646,col 82)",
        "(line 647,col 9)-(line 647,col 82)",
        "(line 648,col 9)-(line 648,col 82)",
        "(line 649,col 9)-(line 649,col 82)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iterable"
      ],
      "begin_line": 652,
      "end_line": 652,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub2()",
      "begin_line": 658,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub3()",
      "begin_line": 662,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AAClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 667,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BBClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 669,
      "end_line": 670,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AAAClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 673,
      "end_line": 676,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BBBClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass.BBClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 674,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "//raw types, where used, are used purposely\nAClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass.BBClass\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 678,
      "end_line": 718,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.AClass.AClass(org.apache.commons.lang3.reflect.AAClass\u003cjava.lang.String\u003e)",
      "begin_line": 682,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 686,
      "end_line": 687,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.BClass"
      ],
      "begin_line": 689,
      "end_line": 690,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.CClass\u003cT\u003e"
      ],
      "begin_line": 692,
      "end_line": 693,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.DClass"
      ],
      "begin_line": 695,
      "end_line": 696,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.EClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 698,
      "end_line": 699,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "GClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 701,
      "end_line": 702,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bClass"
      ],
      "begin_line": 704,
      "end_line": 704,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cClass"
      ],
      "begin_line": 706,
      "end_line": 706,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dClass"
      ],
      "begin_line": 708,
      "end_line": 708,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eClass"
      ],
      "begin_line": 710,
      "end_line": 710,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fClass"
      ],
      "begin_line": 712,
      "end_line": 712,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gClass"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 716,
      "end_line": 717,
      "comment": ""
    }
  ]
}