{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/ClosureUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 424,
      "comment": "\n * Tests the ClosureUtils class.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "cString"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MockClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cT\u003e"
      ],
      "begin_line": 44,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.MockClosure.execute(T)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 13)-(line 48,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.MockClosure.reset()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MockTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, T\u003e"
      ],
      "begin_line": 56,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.MockTransformer.transform(T)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 20)",
        "(line 61,col 13)-(line 61,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testExceptionClosure()",
      "begin_line": 68,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 55)",
        "(line 71,col 9)-(line 71,col 85)",
        "(line 72,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testNopClosure()",
      "begin_line": 87,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 61)",
        "(line 90,col 9)-(line 90,col 48)",
        "(line 91,col 9)-(line 91,col 46)",
        "(line 92,col 9)-(line 92,col 51)",
        "(line 93,col 9)-(line 93,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testInvokeClosure()",
      "begin_line": 99,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 53)",
        "(line 102,col 9)-(line 102,col 60)",
        "(line 103,col 9)-(line 103,col 46)",
        "(line 104,col 9)-(line 104,col 40)",
        "(line 105,col 9)-(line 105,col 125)",
        "(line 106,col 9)-(line 106,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testForClosure()",
      "begin_line": 112,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 66)",
        "(line 115,col 9)-(line 115,col 54)",
        "(line 116,col 9)-(line 116,col 35)",
        "(line 117,col 9)-(line 117,col 95)",
        "(line 118,col 9)-(line 118,col 96)",
        "(line 119,col 9)-(line 119,col 74)",
        "(line 120,col 9)-(line 120,col 74)",
        "(line 121,col 9)-(line 121,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testWhileClosure()",
      "begin_line": 127,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 60)",
        "(line 130,col 9)-(line 130,col 86)",
        "(line 131,col 9)-(line 131,col 35)",
        "(line 133,col 9)-(line 133,col 40)",
        "(line 134,col 9)-(line 134,col 87)",
        "(line 135,col 9)-(line 135,col 35)",
        "(line 137,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 144,col 50)",
        "(line 145,col 9)-(line 148,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testDoWhileClosure()",
      "begin_line": 154,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 60)",
        "(line 157,col 9)-(line 157,col 88)",
        "(line 158,col 9)-(line 158,col 35)",
        "(line 160,col 9)-(line 160,col 40)",
        "(line 161,col 9)-(line 161,col 89)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 164,col 9)-(line 167,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testChainedClosure()",
      "begin_line": 173,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 177,col 58)",
        "(line 178,col 9)-(line 178,col 56)",
        "(line 179,col 9)-(line 179,col 33)",
        "(line 180,col 9)-(line 180,col 33)",
        "(line 182,col 9)-(line 182,col 38)",
        "(line 183,col 9)-(line 183,col 38)",
        "(line 184,col 9)-(line 184,col 83)",
        "(line 185,col 9)-(line 185,col 33)",
        "(line 186,col 9)-(line 186,col 33)",
        "(line 188,col 9)-(line 188,col 38)",
        "(line 189,col 9)-(line 189,col 38)",
        "(line 190,col 9)-(line 190,col 76)",
        "(line 191,col 9)-(line 191,col 20)",
        "(line 192,col 9)-(line 192,col 20)",
        "(line 193,col 9)-(line 193,col 20)",
        "(line 194,col 9)-(line 194,col 64)",
        "(line 195,col 9)-(line 195,col 33)",
        "(line 196,col 9)-(line 196,col 33)",
        "(line 198,col 9)-(line 198,col 93)",
        "(line 199,col 9)-(line 199,col 119)",
        "(line 201,col 9)-(line 204,col 50)",
        "(line 205,col 9)-(line 208,col 50)",
        "(line 209,col 9)-(line 212,col 50)",
        "(line 213,col 9)-(line 216,col 50)",
        "(line 217,col 9)-(line 223,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testIfClosure()",
      "begin_line": 229,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 58)",
        "(line 232,col 9)-(line 232,col 37)",
        "(line 233,col 9)-(line 233,col 79)",
        "(line 234,col 9)-(line 234,col 33)",
        "(line 236,col 9)-(line 236,col 38)",
        "(line 237,col 9)-(line 237,col 89)",
        "(line 238,col 9)-(line 238,col 33)",
        "(line 240,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 90)",
        "(line 243,col 9)-(line 243,col 33)",
        "(line 244,col 9)-(line 244,col 33)",
        "(line 246,col 9)-(line 246,col 38)",
        "(line 247,col 9)-(line 247,col 38)",
        "(line 248,col 9)-(line 248,col 92)",
        "(line 249,col 9)-(line 249,col 33)",
        "(line 250,col 9)-(line 250,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSwitchClosure()",
      "begin_line": 256,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 64)",
        "(line 260,col 9)-(line 260,col 64)",
        "(line 261,col 9)-(line 263,col 52)",
        "(line 264,col 9)-(line 264,col 33)",
        "(line 265,col 9)-(line 265,col 33)",
        "(line 267,col 9)-(line 267,col 18)",
        "(line 268,col 9)-(line 268,col 18)",
        "(line 269,col 9)-(line 271,col 53)",
        "(line 272,col 9)-(line 272,col 33)",
        "(line 273,col 9)-(line 273,col 33)",
        "(line 275,col 9)-(line 275,col 18)",
        "(line 276,col 9)-(line 276,col 18)",
        "(line 277,col 9)-(line 277,col 64)",
        "(line 278,col 9)-(line 280,col 55)",
        "(line 281,col 9)-(line 281,col 33)",
        "(line 282,col 9)-(line 282,col 33)",
        "(line 283,col 9)-(line 283,col 33)",
        "(line 285,col 9)-(line 285,col 18)",
        "(line 286,col 9)-(line 286,col 18)",
        "(line 287,col 9)-(line 287,col 110)",
        "(line 288,col 9)-(line 288,col 59)",
        "(line 289,col 9)-(line 289,col 59)",
        "(line 290,col 9)-(line 290,col 62)",
        "(line 291,col 9)-(line 291,col 33)",
        "(line 292,col 9)-(line 292,col 33)",
        "(line 294,col 9)-(line 294,col 18)",
        "(line 295,col 9)-(line 295,col 18)",
        "(line 296,col 9)-(line 296,col 20)",
        "(line 297,col 9)-(line 297,col 59)",
        "(line 298,col 9)-(line 298,col 59)",
        "(line 299,col 9)-(line 299,col 57)",
        "(line 300,col 9)-(line 300,col 33)",
        "(line 301,col 9)-(line 301,col 33)",
        "(line 303,col 9)-(line 303,col 18)",
        "(line 304,col 9)-(line 304,col 18)",
        "(line 305,col 9)-(line 305,col 18)",
        "(line 306,col 9)-(line 306,col 20)",
        "(line 307,col 9)-(line 307,col 59)",
        "(line 308,col 9)-(line 308,col 59)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 310,col 9)-(line 310,col 56)",
        "(line 311,col 9)-(line 311,col 33)",
        "(line 312,col 9)-(line 312,col 33)",
        "(line 313,col 9)-(line 313,col 33)",
        "(line 315,col 9)-(line 315,col 112)",
        "(line 316,col 9)-(line 316,col 129)",
        "(line 317,col 9)-(line 317,col 20)",
        "(line 318,col 9)-(line 318,col 28)",
        "(line 319,col 9)-(line 319,col 75)",
        "(line 321,col 9)-(line 324,col 50)",
        "(line 325,col 9)-(line 328,col 50)",
        "(line 329,col 9)-(line 332,col 50)",
        "(line 333,col 9)-(line 336,col 50)",
        "(line 337,col 9)-(line 342,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSwitchMapClosure()",
      "begin_line": 348,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 64)",
        "(line 351,col 9)-(line 351,col 64)",
        "(line 352,col 9)-(line 352,col 88)",
        "(line 353,col 9)-(line 353,col 28)",
        "(line 354,col 9)-(line 354,col 28)",
        "(line 355,col 9)-(line 355,col 57)",
        "(line 356,col 9)-(line 356,col 33)",
        "(line 357,col 9)-(line 357,col 33)",
        "(line 359,col 9)-(line 359,col 18)",
        "(line 360,col 9)-(line 360,col 18)",
        "(line 361,col 9)-(line 361,col 20)",
        "(line 362,col 9)-(line 362,col 28)",
        "(line 363,col 9)-(line 363,col 28)",
        "(line 364,col 9)-(line 364,col 60)",
        "(line 365,col 9)-(line 365,col 33)",
        "(line 366,col 9)-(line 366,col 33)",
        "(line 368,col 9)-(line 368,col 18)",
        "(line 369,col 9)-(line 369,col 18)",
        "(line 370,col 9)-(line 370,col 20)",
        "(line 371,col 9)-(line 371,col 64)",
        "(line 372,col 9)-(line 372,col 28)",
        "(line 373,col 9)-(line 373,col 28)",
        "(line 374,col 9)-(line 374,col 25)",
        "(line 375,col 9)-(line 375,col 59)",
        "(line 376,col 9)-(line 376,col 33)",
        "(line 377,col 9)-(line 377,col 33)",
        "(line 378,col 9)-(line 378,col 33)",
        "(line 380,col 9)-(line 380,col 113)",
        "(line 382,col 9)-(line 385,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testTransformerClosure()",
      "begin_line": 391,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 75)",
        "(line 394,col 9)-(line 394,col 69)",
        "(line 395,col 9)-(line 395,col 30)",
        "(line 396,col 9)-(line 396,col 36)",
        "(line 397,col 9)-(line 397,col 30)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 400,col 9)-(line 400,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSingletonPatternInSerialization()",
      "begin_line": 410,
      "end_line": 423,
      "comment": "\n     * Test that all Closure singletons hold singleton pattern in\n     * serialization/deserialization process.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 415,col 10)",
        "(line 417,col 9)-(line 422,col 9)"
      ]
    }
  ]
}