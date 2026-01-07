{
  "filepath": "/tmp/Lang-1b/src/test/java/org/apache/commons/lang3/reflect/TypeUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "//raw types, where used, are used purposely\nTypeUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 688,
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
      "end_line": 442,
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
        "(line 124,col 9)-(line 124,col 42)",
        "(line 125,col 9)-(line 127,col 86)",
        "(line 128,col 9)-(line 128,col 63)",
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
        "(line 326,col 9)-(line 326,col 73)",
        "(line 329,col 9)-(line 329,col 73)",
        "(line 330,col 9)-(line 330,col 71)",
        "(line 331,col 9)-(line 331,col 77)",
        "(line 332,col 9)-(line 332,col 75)",
        "(line 333,col 9)-(line 333,col 79)",
        "(line 334,col 9)-(line 334,col 81)",
        "(line 335,col 9)-(line 335,col 75)",
        "(line 336,col 9)-(line 336,col 75)",
        "(line 337,col 9)-(line 337,col 18)",
        "(line 338,col 9)-(line 338,col 68)",
        "(line 340,col 9)-(line 340,col 68)",
        "(line 341,col 9)-(line 341,col 20)",
        "(line 342,col 9)-(line 342,col 70)",
        "(line 343,col 9)-(line 343,col 19)",
        "(line 344,col 9)-(line 345,col 59)",
        "(line 346,col 9)-(line 346,col 21)",
        "(line 347,col 9)-(line 347,col 71)",
        "(line 349,col 9)-(line 349,col 73)",
        "(line 351,col 9)-(line 351,col 70)",
        "(line 353,col 9)-(line 353,col 70)",
        "(line 355,col 9)-(line 355,col 70)",
        "(line 356,col 9)-(line 356,col 26)",
        "(line 357,col 9)-(line 357,col 33)",
        "(line 358,col 9)-(line 358,col 26)",
        "(line 359,col 9)-(line 359,col 27)",
        "(line 360,col 9)-(line 360,col 19)",
        "(line 361,col 9)-(line 361,col 20)",
        "(line 362,col 9)-(line 362,col 27)",
        "(line 363,col 9)-(line 363,col 22)",
        "(line 364,col 9)-(line 364,col 16)",
        "(line 365,col 9)-(line 365,col 76)",
        "(line 366,col 9)-(line 366,col 16)",
        "(line 367,col 9)-(line 367,col 76)",
        "(line 368,col 9)-(line 368,col 16)",
        "(line 369,col 9)-(line 369,col 77)",
        "(line 370,col 9)-(line 370,col 16)",
        "(line 371,col 9)-(line 371,col 75)",
        "(line 372,col 9)-(line 372,col 16)",
        "(line 373,col 9)-(line 373,col 76)",
        "(line 374,col 9)-(line 374,col 16)",
        "(line 375,col 9)-(line 375,col 77)",
        "(line 376,col 9)-(line 376,col 16)",
        "(line 377,col 9)-(line 377,col 73)",
        "(line 378,col 9)-(line 378,col 32)",
        "(line 379,col 9)-(line 379,col 77)",
        "(line 381,col 9)-(line 381,col 74)",
        "(line 383,col 9)-(line 383,col 78)",
        "(line 384,col 9)-(line 384,col 32)",
        "(line 385,col 9)-(line 385,col 76)",
        "(line 386,col 9)-(line 386,col 32)",
        "(line 387,col 9)-(line 387,col 76)",
        "(line 388,col 9)-(line 388,col 75)",
        "(line 389,col 9)-(line 389,col 75)",
        "(line 390,col 9)-(line 390,col 93)",
        "(line 391,col 9)-(line 391,col 26)",
        "(line 392,col 9)-(line 392,col 80)",
        "(line 393,col 9)-(line 393,col 79)",
        "(line 394,col 9)-(line 394,col 35)",
        "(line 395,col 9)-(line 395,col 81)",
        "(line 396,col 9)-(line 396,col 95)",
        "(line 398,col 9)-(line 398,col 82)",
        "(line 400,col 9)-(line 400,col 86)",
        "(line 403,col 9)-(line 403,col 78)",
        "(line 404,col 9)-(line 404,col 34)",
        "(line 405,col 9)-(line 405,col 90)",
        "(line 406,col 9)-(line 406,col 35)",
        "(line 407,col 9)-(line 407,col 75)",
        "(line 409,col 9)-(line 409,col 81)",
        "(line 410,col 9)-(line 410,col 31)",
        "(line 411,col 9)-(line 411,col 20)",
        "(line 413,col 9)-(line 413,col 80)",
        "(line 414,col 9)-(line 414,col 28)",
        "(line 415,col 9)-(line 415,col 83)",
        "(line 416,col 9)-(line 416,col 81)",
        "(line 417,col 9)-(line 417,col 81)",
        "(line 418,col 9)-(line 418,col 81)",
        "(line 419,col 9)-(line 419,col 81)",
        "(line 420,col 9)-(line 420,col 81)",
        "(line 421,col 9)-(line 421,col 64)",
        "(line 422,col 9)-(line 422,col 38)",
        "(line 423,col 9)-(line 423,col 74)",
        "(line 424,col 9)-(line 424,col 38)",
        "(line 425,col 9)-(line 425,col 74)",
        "(line 426,col 9)-(line 426,col 38)",
        "(line 427,col 9)-(line 427,col 74)",
        "(line 428,col 9)-(line 428,col 38)",
        "(line 429,col 9)-(line 429,col 74)",
        "(line 430,col 9)-(line 430,col 38)",
        "(line 431,col 9)-(line 431,col 74)",
        "(line 432,col 9)-(line 432,col 38)",
        "(line 433,col 9)-(line 433,col 74)",
        "(line 434,col 9)-(line 434,col 38)",
        "(line 435,col 9)-(line 435,col 74)",
        "(line 436,col 9)-(line 436,col 38)",
        "(line 437,col 9)-(line 437,col 74)",
        "(line 438,col 9)-(line 438,col 38)",
        "(line 439,col 9)-(line 439,col 74)",
        "(line 440,col 9)-(line 440,col 38)",
        "(line 441,col 9)-(line 441,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.delegateBooleanAssertion(java.lang.reflect.Type[], int, int, boolean)",
      "begin_line": 444,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 37)",
        "(line 446,col 9)-(line 446,col 37)",
        "(line 447,col 9)-(line 447,col 74)",
        "(line 449,col 9)-(line 457,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsInstance()",
      "begin_line": 460,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 93)",
        "(line 464,col 9)-(line 464,col 93)",
        "(line 465,col 9)-(line 465,col 26)",
        "(line 466,col 9)-(line 466,col 70)",
        "(line 468,col 9)-(line 468,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetTypeArguments()",
      "begin_line": 471,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 50)",
        "(line 474,col 9)-(line 474,col 39)",
        "(line 475,col 9)-(line 475,col 21)",
        "(line 477,col 9)-(line 477,col 85)",
        "(line 478,col 9)-(line 478,col 65)",
        "(line 479,col 9)-(line 480,col 60)",
        "(line 481,col 9)-(line 481,col 53)",
        "(line 482,col 9)-(line 483,col 52)",
        "(line 485,col 9)-(line 485,col 81)",
        "(line 486,col 9)-(line 486,col 65)",
        "(line 487,col 9)-(line 488,col 60)",
        "(line 489,col 9)-(line 489,col 53)",
        "(line 490,col 9)-(line 491,col 52)",
        "(line 493,col 9)-(line 493,col 70)",
        "(line 494,col 9)-(line 494,col 82)",
        "(line 495,col 9)-(line 495,col 65)",
        "(line 496,col 9)-(line 497,col 60)",
        "(line 499,col 9)-(line 499,col 100)",
        "(line 500,col 9)-(line 500,col 54)",
        "(line 501,col 9)-(line 501,col 100)",
        "(line 502,col 9)-(line 502,col 108)",
        "(line 504,col 9)-(line 504,col 77)",
        "(line 505,col 9)-(line 505,col 54)",
        "(line 506,col 9)-(line 506,col 97)",
        "(line 507,col 9)-(line 507,col 119)",
        "(line 509,col 9)-(line 509,col 75)",
        "(line 510,col 9)-(line 510,col 54)",
        "(line 511,col 9)-(line 511,col 97)",
        "(line 512,col 9)-(line 512,col 97)",
        "(line 514,col 9)-(line 514,col 78)",
        "(line 515,col 9)-(line 515,col 54)",
        "(line 516,col 9)-(line 516,col 118)",
        "(line 517,col 9)-(line 517,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testTypesSatisfyVariables()",
      "begin_line": 520,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 95)",
        "(line 524,col 9)-(line 524,col 49)",
        "(line 525,col 9)-(line 525,col 95)",
        "(line 526,col 9)-(line 526,col 75)",
        "(line 527,col 9)-(line 527,col 31)",
        "(line 528,col 9)-(line 528,col 96)",
        "(line 529,col 9)-(line 529,col 75)",
        "(line 530,col 9)-(line 530,col 31)",
        "(line 531,col 9)-(line 531,col 96)",
        "(line 532,col 9)-(line 532,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testDetermineTypeVariableAssignments()",
      "begin_line": 535,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 539,col 34)",
        "(line 540,col 9)-(line 541,col 30)",
        "(line 542,col 9)-(line 542,col 84)",
        "(line 543,col 9)-(line 543,col 70)",
        "(line 544,col 9)-(line 545,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetRawType()",
      "begin_line": 548,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 551,col 34)",
        "(line 552,col 9)-(line 553,col 34)",
        "(line 554,col 9)-(line 554,col 101)",
        "(line 555,col 9)-(line 555,col 79)",
        "(line 556,col 9)-(line 556,col 100)",
        "(line 557,col 9)-(line 559,col 31)",
        "(line 560,col 9)-(line 560,col 83)",
        "(line 561,col 9)-(line 562,col 49)",
        "(line 563,col 9)-(line 564,col 40)",
        "(line 565,col 9)-(line 566,col 32)",
        "(line 567,col 9)-(line 568,col 32)",
        "(line 569,col 9)-(line 569,col 85)",
        "(line 570,col 9)-(line 571,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayTypeClasses()",
      "begin_line": 574,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 66)",
        "(line 577,col 9)-(line 577,col 63)",
        "(line 578,col 9)-(line 578,col 64)",
        "(line 579,col 9)-(line 579,col 62)",
        "(line 580,col 9)-(line 580,col 63)",
        "(line 581,col 9)-(line 581,col 63)",
        "(line 582,col 9)-(line 582,col 64)",
        "(line 583,col 9)-(line 583,col 65)",
        "(line 584,col 9)-(line 584,col 65)",
        "(line 585,col 9)-(line 585,col 65)",
        "(line 587,col 9)-(line 587,col 65)",
        "(line 588,col 9)-(line 588,col 62)",
        "(line 589,col 9)-(line 589,col 63)",
        "(line 590,col 9)-(line 590,col 61)",
        "(line 591,col 9)-(line 591,col 62)",
        "(line 592,col 9)-(line 592,col 62)",
        "(line 593,col 9)-(line 593,col 63)",
        "(line 594,col 9)-(line 594,col 64)",
        "(line 595,col 9)-(line 595,col 64)",
        "(line 596,col 9)-(line 596,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayGenericTypes()",
      "begin_line": 599,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 601,col 9)-(line 603,col 86)",
        "(line 605,col 9)-(line 605,col 63)",
        "(line 607,col 9)-(line 607,col 60)",
        "(line 608,col 9)-(line 608,col 60)",
        "(line 609,col 9)-(line 609,col 60)",
        "(line 610,col 9)-(line 610,col 60)",
        "(line 611,col 9)-(line 611,col 60)",
        "(line 612,col 9)-(line 612,col 60)",
        "(line 613,col 9)-(line 613,col 60)",
        "(line 614,col 9)-(line 614,col 59)",
        "(line 615,col 9)-(line 615,col 59)",
        "(line 616,col 9)-(line 616,col 59)",
        "(line 617,col 9)-(line 617,col 60)",
        "(line 618,col 9)-(line 618,col 60)",
        "(line 619,col 9)-(line 619,col 60)",
        "(line 620,col 9)-(line 620,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetPrimitiveArrayComponentType()",
      "begin_line": 623,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 93)",
        "(line 626,col 9)-(line 626,col 87)",
        "(line 627,col 9)-(line 627,col 89)",
        "(line 628,col 9)-(line 628,col 85)",
        "(line 629,col 9)-(line 629,col 87)",
        "(line 630,col 9)-(line 630,col 87)",
        "(line 631,col 9)-(line 631,col 89)",
        "(line 632,col 9)-(line 632,col 91)",
        "(line 634,col 9)-(line 634,col 74)",
        "(line 635,col 9)-(line 635,col 71)",
        "(line 636,col 9)-(line 636,col 72)",
        "(line 637,col 9)-(line 637,col 70)",
        "(line 638,col 9)-(line 638,col 71)",
        "(line 639,col 9)-(line 639,col 71)",
        "(line 640,col 9)-(line 640,col 72)",
        "(line 641,col 9)-(line 641,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetArrayComponentType()",
      "begin_line": 644,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 86)",
        "(line 650,col 9)-(line 650,col 63)",
        "(line 652,col 9)-(line 652,col 69)",
        "(line 653,col 9)-(line 653,col 69)",
        "(line 654,col 9)-(line 654,col 69)",
        "(line 655,col 9)-(line 655,col 69)",
        "(line 656,col 9)-(line 656,col 69)",
        "(line 657,col 9)-(line 657,col 69)",
        "(line 658,col 9)-(line 658,col 69)",
        "(line 659,col 9)-(line 659,col 81)",
        "(line 660,col 9)-(line 660,col 81)",
        "(line 661,col 9)-(line 661,col 81)",
        "(line 662,col 9)-(line 662,col 82)",
        "(line 663,col 9)-(line 663,col 82)",
        "(line 664,col 9)-(line 664,col 82)",
        "(line 665,col 9)-(line 665,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testLang820()",
      "begin_line": 668,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 62)",
        "(line 671,col 9)-(line 671,col 52)",
        "(line 672,col 9)-(line 672,col 91)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iterable"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub()",
      "begin_line": 677,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub2()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub3()",
      "begin_line": 685,
      "end_line": 687,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AAClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 690,
      "end_line": 694,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BBClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 692,
      "end_line": 693,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AAAClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 696,
      "end_line": 699,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BBBClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass.BBClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 697,
      "end_line": 698,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "//raw types, where used, are used purposely\nAClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass.BBClass\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 701,
      "end_line": 741,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.AClass.AClass(org.apache.commons.lang3.reflect.AAClass\u003cjava.lang.String\u003e)",
      "begin_line": 705,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 709,
      "end_line": 710,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.BClass"
      ],
      "begin_line": 712,
      "end_line": 713,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.CClass\u003cT\u003e"
      ],
      "begin_line": 715,
      "end_line": 716,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.DClass"
      ],
      "begin_line": 718,
      "end_line": 719,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.EClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 721,
      "end_line": 722,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "GClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 724,
      "end_line": 725,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bClass"
      ],
      "begin_line": 727,
      "end_line": 727,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cClass"
      ],
      "begin_line": 729,
      "end_line": 729,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dClass"
      ],
      "begin_line": 731,
      "end_line": 731,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eClass"
      ],
      "begin_line": 733,
      "end_line": 733,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fClass"
      ],
      "begin_line": 735,
      "end_line": 735,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gClass"
      ],
      "begin_line": 737,
      "end_line": 737,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 739,
      "end_line": 740,
      "comment": ""
    }
  ]
}