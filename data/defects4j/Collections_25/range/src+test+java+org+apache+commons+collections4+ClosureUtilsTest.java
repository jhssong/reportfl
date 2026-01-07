{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/ClosureUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 427,
      "comment": "\n * Tests the ClosureUtils class.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "cString"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MockClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cT\u003e"
      ],
      "begin_line": 47,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.MockClosure.execute(T)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 13)-(line 51,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.MockClosure.reset()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MockTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, T\u003e"
      ],
      "begin_line": 59,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.MockTransformer.transform(T)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 63,col 13)-(line 63,col 20)",
        "(line 64,col 13)-(line 64,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testExceptionClosure()",
      "begin_line": 71,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 55)",
        "(line 74,col 9)-(line 74,col 85)",
        "(line 75,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testNopClosure()",
      "begin_line": 90,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 61)",
        "(line 93,col 9)-(line 93,col 48)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 95,col 51)",
        "(line 96,col 9)-(line 96,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testInvokeClosure()",
      "begin_line": 102,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 53)",
        "(line 105,col 9)-(line 105,col 60)",
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 107,col 40)",
        "(line 108,col 9)-(line 108,col 125)",
        "(line 109,col 9)-(line 109,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testForClosure()",
      "begin_line": 115,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 66)",
        "(line 118,col 9)-(line 118,col 54)",
        "(line 119,col 9)-(line 119,col 35)",
        "(line 120,col 9)-(line 120,col 95)",
        "(line 121,col 9)-(line 121,col 96)",
        "(line 122,col 9)-(line 122,col 74)",
        "(line 123,col 9)-(line 123,col 74)",
        "(line 124,col 9)-(line 124,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testWhileClosure()",
      "begin_line": 130,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 60)",
        "(line 133,col 9)-(line 133,col 86)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 136,col 9)-(line 136,col 40)",
        "(line 137,col 9)-(line 137,col 87)",
        "(line 138,col 9)-(line 138,col 35)",
        "(line 140,col 9)-(line 143,col 54)",
        "(line 144,col 9)-(line 147,col 54)",
        "(line 148,col 9)-(line 151,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testDoWhileClosure()",
      "begin_line": 157,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 60)",
        "(line 160,col 9)-(line 160,col 88)",
        "(line 161,col 9)-(line 161,col 35)",
        "(line 163,col 9)-(line 163,col 40)",
        "(line 164,col 9)-(line 164,col 89)",
        "(line 165,col 9)-(line 165,col 35)",
        "(line 167,col 9)-(line 170,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testChainedClosure()",
      "begin_line": 176,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 58)",
        "(line 180,col 9)-(line 180,col 58)",
        "(line 181,col 9)-(line 181,col 56)",
        "(line 182,col 9)-(line 182,col 33)",
        "(line 183,col 9)-(line 183,col 33)",
        "(line 185,col 9)-(line 185,col 38)",
        "(line 186,col 9)-(line 186,col 38)",
        "(line 187,col 9)-(line 187,col 83)",
        "(line 188,col 9)-(line 188,col 33)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 192,col 38)",
        "(line 193,col 9)-(line 193,col 76)",
        "(line 194,col 9)-(line 194,col 20)",
        "(line 195,col 9)-(line 195,col 20)",
        "(line 196,col 9)-(line 196,col 20)",
        "(line 197,col 9)-(line 197,col 64)",
        "(line 198,col 9)-(line 198,col 33)",
        "(line 199,col 9)-(line 199,col 33)",
        "(line 201,col 9)-(line 201,col 93)",
        "(line 202,col 9)-(line 202,col 119)",
        "(line 204,col 9)-(line 207,col 54)",
        "(line 208,col 9)-(line 211,col 54)",
        "(line 212,col 9)-(line 215,col 54)",
        "(line 216,col 9)-(line 219,col 54)",
        "(line 220,col 9)-(line 226,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testIfClosure()",
      "begin_line": 232,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 58)",
        "(line 235,col 9)-(line 235,col 37)",
        "(line 236,col 9)-(line 236,col 79)",
        "(line 237,col 9)-(line 237,col 33)",
        "(line 239,col 9)-(line 239,col 38)",
        "(line 240,col 9)-(line 240,col 89)",
        "(line 241,col 9)-(line 241,col 33)",
        "(line 243,col 9)-(line 243,col 38)",
        "(line 244,col 9)-(line 244,col 38)",
        "(line 245,col 9)-(line 245,col 90)",
        "(line 246,col 9)-(line 246,col 33)",
        "(line 247,col 9)-(line 247,col 33)",
        "(line 249,col 9)-(line 249,col 38)",
        "(line 250,col 9)-(line 250,col 38)",
        "(line 251,col 9)-(line 251,col 92)",
        "(line 252,col 9)-(line 252,col 33)",
        "(line 253,col 9)-(line 253,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSwitchClosure()",
      "begin_line": 259,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 64)",
        "(line 263,col 9)-(line 263,col 64)",
        "(line 264,col 9)-(line 266,col 52)",
        "(line 267,col 9)-(line 267,col 33)",
        "(line 268,col 9)-(line 268,col 33)",
        "(line 270,col 9)-(line 270,col 18)",
        "(line 271,col 9)-(line 271,col 18)",
        "(line 272,col 9)-(line 274,col 53)",
        "(line 275,col 9)-(line 275,col 33)",
        "(line 276,col 9)-(line 276,col 33)",
        "(line 278,col 9)-(line 278,col 18)",
        "(line 279,col 9)-(line 279,col 18)",
        "(line 280,col 9)-(line 280,col 64)",
        "(line 281,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 284,col 33)",
        "(line 285,col 9)-(line 285,col 33)",
        "(line 286,col 9)-(line 286,col 33)",
        "(line 288,col 9)-(line 288,col 18)",
        "(line 289,col 9)-(line 289,col 18)",
        "(line 290,col 9)-(line 290,col 110)",
        "(line 291,col 9)-(line 291,col 59)",
        "(line 292,col 9)-(line 292,col 59)",
        "(line 293,col 9)-(line 293,col 62)",
        "(line 294,col 9)-(line 294,col 33)",
        "(line 295,col 9)-(line 295,col 33)",
        "(line 297,col 9)-(line 297,col 18)",
        "(line 298,col 9)-(line 298,col 18)",
        "(line 299,col 9)-(line 299,col 20)",
        "(line 300,col 9)-(line 300,col 59)",
        "(line 301,col 9)-(line 301,col 59)",
        "(line 302,col 9)-(line 302,col 57)",
        "(line 303,col 9)-(line 303,col 33)",
        "(line 304,col 9)-(line 304,col 33)",
        "(line 306,col 9)-(line 306,col 18)",
        "(line 307,col 9)-(line 307,col 18)",
        "(line 308,col 9)-(line 308,col 18)",
        "(line 309,col 9)-(line 309,col 20)",
        "(line 310,col 9)-(line 310,col 59)",
        "(line 311,col 9)-(line 311,col 59)",
        "(line 312,col 9)-(line 312,col 25)",
        "(line 313,col 9)-(line 313,col 56)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 316,col 9)-(line 316,col 33)",
        "(line 318,col 9)-(line 318,col 112)",
        "(line 319,col 9)-(line 319,col 129)",
        "(line 320,col 9)-(line 320,col 20)",
        "(line 321,col 9)-(line 321,col 28)",
        "(line 322,col 9)-(line 322,col 75)",
        "(line 324,col 9)-(line 327,col 54)",
        "(line 328,col 9)-(line 331,col 54)",
        "(line 332,col 9)-(line 335,col 54)",
        "(line 336,col 9)-(line 339,col 54)",
        "(line 340,col 9)-(line 345,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSwitchMapClosure()",
      "begin_line": 351,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 64)",
        "(line 354,col 9)-(line 354,col 64)",
        "(line 355,col 9)-(line 355,col 88)",
        "(line 356,col 9)-(line 356,col 28)",
        "(line 357,col 9)-(line 357,col 28)",
        "(line 358,col 9)-(line 358,col 57)",
        "(line 359,col 9)-(line 359,col 33)",
        "(line 360,col 9)-(line 360,col 33)",
        "(line 362,col 9)-(line 362,col 18)",
        "(line 363,col 9)-(line 363,col 18)",
        "(line 364,col 9)-(line 364,col 20)",
        "(line 365,col 9)-(line 365,col 28)",
        "(line 366,col 9)-(line 366,col 28)",
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 368,col 33)",
        "(line 369,col 9)-(line 369,col 33)",
        "(line 371,col 9)-(line 371,col 18)",
        "(line 372,col 9)-(line 372,col 18)",
        "(line 373,col 9)-(line 373,col 20)",
        "(line 374,col 9)-(line 374,col 64)",
        "(line 375,col 9)-(line 375,col 28)",
        "(line 376,col 9)-(line 376,col 28)",
        "(line 377,col 9)-(line 377,col 25)",
        "(line 378,col 9)-(line 378,col 59)",
        "(line 379,col 9)-(line 379,col 33)",
        "(line 380,col 9)-(line 380,col 33)",
        "(line 381,col 9)-(line 381,col 33)",
        "(line 383,col 9)-(line 383,col 113)",
        "(line 385,col 9)-(line 388,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testTransformerClosure()",
      "begin_line": 394,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 75)",
        "(line 397,col 9)-(line 397,col 69)",
        "(line 398,col 9)-(line 398,col 30)",
        "(line 399,col 9)-(line 399,col 36)",
        "(line 400,col 9)-(line 400,col 30)",
        "(line 401,col 9)-(line 401,col 36)",
        "(line 403,col 9)-(line 403,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSingletonPatternInSerialization()",
      "begin_line": 413,
      "end_line": 426,
      "comment": "\n     * Test that all Closure singletons hold singleton pattern in\n     * serialization/deserialization process.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 418,col 10)",
        "(line 420,col 9)-(line 425,col 9)"
      ]
    }
  ]
}