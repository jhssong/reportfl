{
  "filepath": "/tmp/Lang-27b/src/test/java/org/apache/commons/lang3/reflect/TypeUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "//raw types, where used, are used purposely\nTypeUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 667,
      "comment": "\n * Test TypeUtils\n * @author David M. Sledge\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "This",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "That",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.This\u003cK, V\u003e"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "And",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.This\u003cjava.lang.Number, java.lang.Number\u003e"
      ],
      "begin_line": 58,
      "end_line": 59,
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
      "begin_line": 61,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Other",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.This\u003cjava.lang.String, T\u003e"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Thing",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.Other\u003cB\u003e"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Tester",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.TypeUtilsTest.This\u003cjava.lang.String, B\u003e"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dis"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dat"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "da"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uhder"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ding"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tester"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tester2"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dat2"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dat3"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "intWildcardComparable"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringComparable"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uriComparable"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "intComparable"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longComparable"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uri"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.dummyMethod(java.util.List, java.util.List\u003cjava.lang.Object\u003e, java.util.List\u003c?\u003e, java.util.List\u003c? super java.lang.Object\u003e, java.util.List\u003cjava.lang.String\u003e, java.util.List\u003c? extends java.lang.String\u003e, java.util.List\u003c? super java.lang.String\u003e, java.util.List[], java.util.List\u003cjava.lang.Object\u003e[], java.util.List\u003c?\u003e[], java.util.List\u003c? super java.lang.Object\u003e[], java.util.List\u003cjava.lang.String\u003e[], java.util.List\u003c? extends java.lang.String\u003e[], java.util.List\u003c? super java.lang.String\u003e[])",
      "begin_line": 103,
      "end_line": 108,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsAssignable()",
      "begin_line": 110,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 26)",
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 29)",
        "(line 116,col 9)-(line 116,col 42)",
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 42)",
        "(line 120,col 9)-(line 120,col 28)",
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 31)",
        "(line 123,col 9)-(line 123,col 45)",
        "(line 124,col 9)-(line 124,col 37)",
        "(line 125,col 9)-(line 125,col 47)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 130,col 86)",
        "(line 131,col 9)-(line 131,col 57)",
        "(line 132,col 9)-(line 132,col 22)",
        "(line 133,col 9)-(line 133,col 52)",
        "(line 134,col 9)-(line 134,col 22)",
        "(line 135,col 9)-(line 135,col 52)",
        "(line 136,col 9)-(line 136,col 22)",
        "(line 137,col 9)-(line 137,col 52)",
        "(line 138,col 9)-(line 138,col 22)",
        "(line 139,col 9)-(line 139,col 52)",
        "(line 140,col 9)-(line 140,col 22)",
        "(line 141,col 9)-(line 141,col 52)",
        "(line 142,col 9)-(line 142,col 22)",
        "(line 143,col 9)-(line 143,col 52)",
        "(line 144,col 9)-(line 144,col 22)",
        "(line 145,col 9)-(line 145,col 52)",
        "(line 146,col 9)-(line 146,col 22)",
        "(line 147,col 9)-(line 147,col 52)",
        "(line 148,col 9)-(line 148,col 22)",
        "(line 149,col 9)-(line 149,col 52)",
        "(line 150,col 9)-(line 150,col 22)",
        "(line 151,col 9)-(line 151,col 52)",
        "(line 152,col 9)-(line 152,col 22)",
        "(line 153,col 9)-(line 153,col 52)",
        "(line 154,col 9)-(line 154,col 22)",
        "(line 155,col 9)-(line 155,col 52)",
        "(line 156,col 9)-(line 156,col 22)",
        "(line 157,col 9)-(line 157,col 52)",
        "(line 158,col 9)-(line 158,col 22)",
        "(line 159,col 9)-(line 159,col 52)",
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 161,col 52)",
        "(line 162,col 9)-(line 162,col 37)",
        "(line 163,col 9)-(line 163,col 53)",
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 165,col 52)",
        "(line 166,col 9)-(line 166,col 37)",
        "(line 167,col 9)-(line 167,col 53)",
        "(line 169,col 9)-(line 169,col 53)",
        "(line 171,col 9)-(line 171,col 53)",
        "(line 173,col 9)-(line 173,col 53)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 22)",
        "(line 177,col 9)-(line 177,col 52)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 22)",
        "(line 181,col 9)-(line 181,col 52)",
        "(line 182,col 9)-(line 182,col 22)",
        "(line 183,col 9)-(line 183,col 53)",
        "(line 184,col 9)-(line 184,col 22)",
        "(line 185,col 9)-(line 185,col 52)",
        "(line 186,col 9)-(line 186,col 45)",
        "(line 187,col 9)-(line 187,col 53)",
        "(line 188,col 9)-(line 188,col 22)",
        "(line 189,col 9)-(line 189,col 52)",
        "(line 190,col 9)-(line 190,col 37)",
        "(line 191,col 9)-(line 191,col 53)",
        "(line 192,col 9)-(line 192,col 22)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 194,col 9)-(line 194,col 47)",
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 196,col 22)",
        "(line 197,col 9)-(line 197,col 52)",
        "(line 198,col 9)-(line 198,col 45)",
        "(line 199,col 9)-(line 199,col 52)",
        "(line 201,col 9)-(line 201,col 53)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 205,col 9)-(line 205,col 53)",
        "(line 207,col 9)-(line 207,col 53)",
        "(line 208,col 9)-(line 208,col 22)",
        "(line 209,col 9)-(line 209,col 52)",
        "(line 210,col 9)-(line 210,col 45)",
        "(line 211,col 9)-(line 211,col 53)",
        "(line 212,col 9)-(line 212,col 22)",
        "(line 213,col 9)-(line 213,col 52)",
        "(line 214,col 9)-(line 214,col 22)",
        "(line 215,col 9)-(line 215,col 52)",
        "(line 216,col 9)-(line 216,col 37)",
        "(line 217,col 9)-(line 217,col 53)",
        "(line 218,col 9)-(line 218,col 22)",
        "(line 219,col 9)-(line 219,col 52)",
        "(line 220,col 9)-(line 220,col 37)",
        "(line 221,col 9)-(line 221,col 53)",
        "(line 222,col 9)-(line 222,col 22)",
        "(line 223,col 9)-(line 223,col 52)",
        "(line 224,col 9)-(line 224,col 45)",
        "(line 225,col 9)-(line 225,col 53)",
        "(line 226,col 9)-(line 226,col 47)",
        "(line 227,col 9)-(line 227,col 53)",
        "(line 228,col 9)-(line 228,col 22)",
        "(line 229,col 9)-(line 229,col 52)",
        "(line 231,col 9)-(line 231,col 22)",
        "(line 232,col 9)-(line 232,col 52)",
        "(line 233,col 9)-(line 233,col 22)",
        "(line 234,col 9)-(line 234,col 52)",
        "(line 235,col 9)-(line 235,col 22)",
        "(line 236,col 9)-(line 236,col 52)",
        "(line 237,col 9)-(line 237,col 22)",
        "(line 238,col 9)-(line 238,col 52)",
        "(line 239,col 9)-(line 239,col 22)",
        "(line 240,col 9)-(line 240,col 52)",
        "(line 241,col 9)-(line 241,col 23)",
        "(line 242,col 9)-(line 242,col 53)",
        "(line 243,col 9)-(line 243,col 23)",
        "(line 244,col 9)-(line 244,col 53)",
        "(line 245,col 9)-(line 245,col 23)",
        "(line 246,col 9)-(line 246,col 53)",
        "(line 247,col 9)-(line 247,col 23)",
        "(line 248,col 9)-(line 248,col 53)",
        "(line 249,col 9)-(line 249,col 23)",
        "(line 250,col 9)-(line 250,col 53)",
        "(line 251,col 9)-(line 251,col 23)",
        "(line 252,col 9)-(line 252,col 53)",
        "(line 253,col 9)-(line 253,col 23)",
        "(line 254,col 9)-(line 254,col 53)",
        "(line 255,col 9)-(line 255,col 23)",
        "(line 256,col 9)-(line 256,col 53)",
        "(line 257,col 9)-(line 257,col 22)",
        "(line 258,col 9)-(line 258,col 52)",
        "(line 259,col 9)-(line 259,col 22)",
        "(line 260,col 9)-(line 260,col 52)",
        "(line 261,col 9)-(line 261,col 39)",
        "(line 262,col 9)-(line 262,col 53)",
        "(line 263,col 9)-(line 263,col 23)",
        "(line 264,col 9)-(line 264,col 53)",
        "(line 265,col 9)-(line 265,col 40)",
        "(line 266,col 9)-(line 266,col 54)",
        "(line 268,col 9)-(line 268,col 54)",
        "(line 270,col 9)-(line 270,col 54)",
        "(line 272,col 9)-(line 272,col 54)",
        "(line 274,col 9)-(line 274,col 54)",
        "(line 275,col 9)-(line 275,col 23)",
        "(line 276,col 9)-(line 276,col 53)",
        "(line 277,col 9)-(line 277,col 40)",
        "(line 278,col 9)-(line 278,col 54)",
        "(line 279,col 9)-(line 279,col 22)",
        "(line 280,col 9)-(line 280,col 52)",
        "(line 281,col 9)-(line 281,col 48)",
        "(line 282,col 9)-(line 282,col 54)",
        "(line 283,col 9)-(line 283,col 23)",
        "(line 284,col 9)-(line 284,col 53)",
        "(line 285,col 9)-(line 285,col 40)",
        "(line 286,col 9)-(line 286,col 54)",
        "(line 287,col 9)-(line 287,col 23)",
        "(line 288,col 9)-(line 288,col 53)",
        "(line 289,col 9)-(line 289,col 50)",
        "(line 290,col 9)-(line 290,col 54)",
        "(line 291,col 9)-(line 291,col 23)",
        "(line 292,col 9)-(line 292,col 53)",
        "(line 293,col 9)-(line 293,col 48)",
        "(line 294,col 9)-(line 294,col 54)",
        "(line 295,col 9)-(line 295,col 23)",
        "(line 296,col 9)-(line 296,col 53)",
        "(line 297,col 9)-(line 297,col 24)",
        "(line 298,col 9)-(line 298,col 54)",
        "(line 300,col 9)-(line 300,col 55)",
        "(line 302,col 9)-(line 302,col 55)",
        "(line 304,col 9)-(line 304,col 55)",
        "(line 306,col 9)-(line 306,col 55)",
        "(line 307,col 9)-(line 307,col 24)",
        "(line 308,col 9)-(line 308,col 54)",
        "(line 309,col 9)-(line 309,col 49)",
        "(line 310,col 9)-(line 310,col 55)",
        "(line 311,col 9)-(line 311,col 24)",
        "(line 312,col 9)-(line 312,col 54)",
        "(line 313,col 9)-(line 313,col 24)",
        "(line 314,col 9)-(line 314,col 54)",
        "(line 315,col 9)-(line 315,col 41)",
        "(line 316,col 9)-(line 316,col 55)",
        "(line 317,col 9)-(line 317,col 24)",
        "(line 318,col 9)-(line 318,col 54)",
        "(line 319,col 9)-(line 319,col 41)",
        "(line 320,col 9)-(line 320,col 55)",
        "(line 321,col 9)-(line 321,col 24)",
        "(line 322,col 9)-(line 322,col 54)",
        "(line 323,col 9)-(line 323,col 49)",
        "(line 324,col 9)-(line 324,col 55)",
        "(line 325,col 9)-(line 325,col 51)",
        "(line 326,col 9)-(line 326,col 55)",
        "(line 327,col 9)-(line 327,col 24)",
        "(line 328,col 9)-(line 328,col 54)",
        "(line 329,col 9)-(line 329,col 67)",
        "(line 332,col 9)-(line 332,col 67)",
        "(line 333,col 9)-(line 333,col 65)",
        "(line 334,col 9)-(line 334,col 71)",
        "(line 335,col 9)-(line 335,col 69)",
        "(line 336,col 9)-(line 336,col 73)",
        "(line 337,col 9)-(line 337,col 75)",
        "(line 338,col 9)-(line 338,col 69)",
        "(line 339,col 9)-(line 339,col 69)",
        "(line 340,col 9)-(line 340,col 18)",
        "(line 341,col 9)-(line 341,col 68)",
        "(line 343,col 9)-(line 343,col 68)",
        "(line 344,col 9)-(line 344,col 20)",
        "(line 345,col 9)-(line 345,col 70)",
        "(line 346,col 9)-(line 346,col 19)",
        "(line 347,col 9)-(line 347,col 79)",
        "(line 348,col 9)-(line 348,col 21)",
        "(line 349,col 9)-(line 349,col 71)",
        "(line 351,col 9)-(line 351,col 73)",
        "(line 353,col 9)-(line 353,col 70)",
        "(line 355,col 9)-(line 355,col 70)",
        "(line 357,col 9)-(line 357,col 70)",
        "(line 358,col 9)-(line 358,col 20)",
        "(line 359,col 9)-(line 359,col 27)",
        "(line 360,col 9)-(line 360,col 20)",
        "(line 361,col 9)-(line 361,col 21)",
        "(line 362,col 9)-(line 362,col 19)",
        "(line 363,col 9)-(line 363,col 20)",
        "(line 364,col 9)-(line 364,col 21)",
        "(line 365,col 9)-(line 365,col 22)",
        "(line 366,col 9)-(line 366,col 16)",
        "(line 367,col 9)-(line 367,col 76)",
        "(line 368,col 9)-(line 368,col 16)",
        "(line 369,col 9)-(line 369,col 76)",
        "(line 370,col 9)-(line 370,col 16)",
        "(line 371,col 9)-(line 371,col 77)",
        "(line 372,col 9)-(line 372,col 16)",
        "(line 373,col 9)-(line 373,col 75)",
        "(line 374,col 9)-(line 374,col 16)",
        "(line 375,col 9)-(line 375,col 76)",
        "(line 376,col 9)-(line 376,col 16)",
        "(line 377,col 9)-(line 377,col 77)",
        "(line 379,col 9)-(line 379,col 73)",
        "(line 380,col 9)-(line 380,col 28)",
        "(line 381,col 9)-(line 381,col 77)",
        "(line 383,col 9)-(line 383,col 74)",
        "(line 385,col 9)-(line 385,col 78)",
        "(line 386,col 9)-(line 386,col 28)",
        "(line 387,col 9)-(line 387,col 76)",
        "(line 388,col 9)-(line 388,col 26)",
        "(line 389,col 9)-(line 389,col 76)",
        "(line 390,col 9)-(line 390,col 75)",
        "(line 391,col 9)-(line 391,col 75)",
        "(line 392,col 9)-(line 392,col 87)",
        "(line 393,col 9)-(line 393,col 26)",
        "(line 394,col 9)-(line 394,col 80)",
        "(line 395,col 9)-(line 395,col 79)",
        "(line 396,col 9)-(line 396,col 29)",
        "(line 397,col 9)-(line 397,col 81)",
        "(line 398,col 9)-(line 398,col 89)",
        "(line 400,col 9)-(line 400,col 82)",
        "(line 402,col 9)-(line 402,col 86)",
        "(line 405,col 9)-(line 405,col 78)",
        "(line 406,col 9)-(line 406,col 28)",
        "(line 407,col 9)-(line 407,col 84)",
        "(line 408,col 9)-(line 408,col 35)",
        "(line 409,col 9)-(line 409,col 75)",
        "(line 411,col 9)-(line 411,col 81)",
        "(line 412,col 9)-(line 412,col 25)",
        "(line 413,col 9)-(line 413,col 20)",
        "(line 415,col 9)-(line 415,col 80)",
        "(line 416,col 9)-(line 416,col 28)",
        "(line 417,col 9)-(line 417,col 83)",
        "(line 418,col 9)-(line 418,col 75)",
        "(line 419,col 9)-(line 419,col 75)",
        "(line 420,col 9)-(line 420,col 75)",
        "(line 421,col 9)-(line 421,col 75)",
        "(line 422,col 9)-(line 422,col 75)",
        "(line 423,col 9)-(line 423,col 58)",
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
        "(line 441,col 9)-(line 441,col 74)",
        "(line 442,col 9)-(line 442,col 38)",
        "(line 443,col 9)-(line 443,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.delegateBooleanAssertion(java.lang.reflect.Type[], int, int, boolean)",
      "begin_line": 446,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 31)",
        "(line 448,col 9)-(line 448,col 31)",
        "(line 449,col 9)-(line 449,col 68)",
        "(line 451,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsInstance()",
      "begin_line": 462,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 87)",
        "(line 465,col 9)-(line 465,col 87)",
        "(line 466,col 9)-(line 466,col 26)",
        "(line 467,col 9)-(line 467,col 70)",
        "(line 469,col 9)-(line 469,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetTypeArguments()",
      "begin_line": 472,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 50)",
        "(line 475,col 9)-(line 475,col 39)",
        "(line 476,col 9)-(line 476,col 21)",
        "(line 478,col 9)-(line 478,col 85)",
        "(line 479,col 9)-(line 479,col 65)",
        "(line 480,col 9)-(line 481,col 60)",
        "(line 482,col 9)-(line 482,col 53)",
        "(line 483,col 9)-(line 484,col 52)",
        "(line 486,col 9)-(line 486,col 81)",
        "(line 487,col 9)-(line 487,col 65)",
        "(line 488,col 9)-(line 489,col 60)",
        "(line 490,col 9)-(line 490,col 53)",
        "(line 491,col 9)-(line 492,col 52)",
        "(line 494,col 9)-(line 494,col 64)",
        "(line 495,col 9)-(line 495,col 82)",
        "(line 496,col 9)-(line 496,col 65)",
        "(line 497,col 9)-(line 498,col 60)",
        "(line 500,col 9)-(line 500,col 100)",
        "(line 501,col 9)-(line 501,col 54)",
        "(line 502,col 9)-(line 502,col 100)",
        "(line 503,col 9)-(line 503,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testTypesSatisfyVariables()",
      "begin_line": 506,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 89)",
        "(line 510,col 9)-(line 510,col 43)",
        "(line 511,col 9)-(line 511,col 95)",
        "(line 512,col 9)-(line 512,col 75)",
        "(line 513,col 9)-(line 513,col 31)",
        "(line 514,col 9)-(line 514,col 96)",
        "(line 515,col 9)-(line 515,col 75)",
        "(line 516,col 9)-(line 516,col 31)",
        "(line 517,col 9)-(line 517,col 96)",
        "(line 518,col 9)-(line 518,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testDetermineTypeVariableAssignments()",
      "begin_line": 521,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 524,col 9)-(line 525,col 34)",
        "(line 526,col 9)-(line 527,col 30)",
        "(line 528,col 9)-(line 528,col 78)",
        "(line 529,col 9)-(line 529,col 70)",
        "(line 530,col 9)-(line 531,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetRawType()",
      "begin_line": 534,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 537,col 34)",
        "(line 538,col 9)-(line 539,col 34)",
        "(line 540,col 9)-(line 540,col 95)",
        "(line 541,col 9)-(line 541,col 73)",
        "(line 542,col 9)-(line 542,col 100)",
        "(line 543,col 9)-(line 545,col 31)",
        "(line 546,col 9)-(line 546,col 83)",
        "(line 547,col 9)-(line 548,col 49)",
        "(line 549,col 9)-(line 550,col 40)",
        "(line 551,col 9)-(line 552,col 32)",
        "(line 553,col 9)-(line 554,col 32)",
        "(line 555,col 9)-(line 555,col 85)",
        "(line 556,col 9)-(line 557,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayTypeClasses()",
      "begin_line": 560,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 66)",
        "(line 563,col 9)-(line 563,col 63)",
        "(line 564,col 9)-(line 564,col 64)",
        "(line 565,col 9)-(line 565,col 62)",
        "(line 566,col 9)-(line 566,col 63)",
        "(line 567,col 9)-(line 567,col 63)",
        "(line 568,col 9)-(line 568,col 64)",
        "(line 569,col 9)-(line 569,col 65)",
        "(line 570,col 9)-(line 570,col 65)",
        "(line 571,col 9)-(line 571,col 65)",
        "(line 573,col 9)-(line 573,col 65)",
        "(line 574,col 9)-(line 574,col 62)",
        "(line 575,col 9)-(line 575,col 63)",
        "(line 576,col 9)-(line 576,col 61)",
        "(line 577,col 9)-(line 577,col 62)",
        "(line 578,col 9)-(line 578,col 62)",
        "(line 579,col 9)-(line 579,col 63)",
        "(line 580,col 9)-(line 580,col 64)",
        "(line 581,col 9)-(line 581,col 64)",
        "(line 582,col 9)-(line 582,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayGenericTypes()",
      "begin_line": 585,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 589,col 86)",
        "(line 591,col 9)-(line 591,col 57)",
        "(line 593,col 9)-(line 593,col 60)",
        "(line 594,col 9)-(line 594,col 60)",
        "(line 595,col 9)-(line 595,col 60)",
        "(line 596,col 9)-(line 596,col 60)",
        "(line 597,col 9)-(line 597,col 60)",
        "(line 598,col 9)-(line 598,col 60)",
        "(line 599,col 9)-(line 599,col 60)",
        "(line 600,col 9)-(line 600,col 59)",
        "(line 601,col 9)-(line 601,col 59)",
        "(line 602,col 9)-(line 602,col 59)",
        "(line 603,col 9)-(line 603,col 60)",
        "(line 604,col 9)-(line 604,col 60)",
        "(line 605,col 9)-(line 605,col 60)",
        "(line 606,col 9)-(line 606,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetPrimitiveArrayComponentType()",
      "begin_line": 609,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 93)",
        "(line 612,col 9)-(line 612,col 87)",
        "(line 613,col 9)-(line 613,col 89)",
        "(line 614,col 9)-(line 614,col 85)",
        "(line 615,col 9)-(line 615,col 87)",
        "(line 616,col 9)-(line 616,col 87)",
        "(line 617,col 9)-(line 617,col 89)",
        "(line 618,col 9)-(line 618,col 91)",
        "(line 620,col 9)-(line 620,col 74)",
        "(line 621,col 9)-(line 621,col 71)",
        "(line 622,col 9)-(line 622,col 72)",
        "(line 623,col 9)-(line 623,col 70)",
        "(line 624,col 9)-(line 624,col 71)",
        "(line 625,col 9)-(line 625,col 71)",
        "(line 626,col 9)-(line 626,col 72)",
        "(line 627,col 9)-(line 627,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.testGetArrayComponentType()",
      "begin_line": 630,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 632,col 9)-(line 634,col 86)",
        "(line 636,col 9)-(line 636,col 57)",
        "(line 638,col 9)-(line 638,col 69)",
        "(line 639,col 9)-(line 639,col 69)",
        "(line 640,col 9)-(line 640,col 69)",
        "(line 641,col 9)-(line 641,col 69)",
        "(line 642,col 9)-(line 642,col 69)",
        "(line 643,col 9)-(line 643,col 69)",
        "(line 644,col 9)-(line 644,col 69)",
        "(line 645,col 9)-(line 645,col 81)",
        "(line 646,col 9)-(line 646,col 81)",
        "(line 647,col 9)-(line 647,col 81)",
        "(line 648,col 9)-(line 648,col 82)",
        "(line 649,col 9)-(line 649,col 82)",
        "(line 650,col 9)-(line 650,col 82)",
        "(line 651,col 9)-(line 651,col 82)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iterable"
      ],
      "begin_line": 654,
      "end_line": 654,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub()",
      "begin_line": 656,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub2()",
      "begin_line": 660,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtilsTest.stub3()",
      "begin_line": 664,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AAClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 669,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BBClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 671,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AAAClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 675,
      "end_line": 678,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BBBClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass.BBClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 676,
      "end_line": 677,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "//raw types, where used, are used purposely\nAClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AAClass.BBClass\u003cjava.lang.Number\u003e"
      ],
      "begin_line": 680,
      "end_line": 720,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.AClass.AClass(org.apache.commons.lang3.reflect.AAClass\u003cjava.lang.String\u003e)",
      "begin_line": 684,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 688,
      "end_line": 689,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.BClass"
      ],
      "begin_line": 691,
      "end_line": 692,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.CClass\u003cT\u003e"
      ],
      "begin_line": 694,
      "end_line": 695,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.DClass"
      ],
      "begin_line": 697,
      "end_line": 698,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FClass",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.reflect.AClass.EClass\u003cjava.lang.String\u003e"
      ],
      "begin_line": 700,
      "end_line": 701,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "GClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 703,
      "end_line": 704,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bClass"
      ],
      "begin_line": 706,
      "end_line": 706,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cClass"
      ],
      "begin_line": 708,
      "end_line": 708,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dClass"
      ],
      "begin_line": 710,
      "end_line": 710,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eClass"
      ],
      "begin_line": 712,
      "end_line": 712,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fClass"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gClass"
      ],
      "begin_line": 716,
      "end_line": 716,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AInterface",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 718,
      "end_line": 719,
      "comment": ""
    }
  ]
}