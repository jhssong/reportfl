{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/ClosureUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 426,
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
      "end_line": 55,
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
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 13)-(line 49,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.MockClosure.reset()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MockTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Transformer\u003cT, T\u003e"
      ],
      "begin_line": 57,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.MockTransformer.transform(T)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 20)",
        "(line 63,col 13)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testExceptionClosure()",
      "begin_line": 70,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 55)",
        "(line 73,col 9)-(line 73,col 85)",
        "(line 74,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testNopClosure()",
      "begin_line": 89,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 61)",
        "(line 92,col 9)-(line 92,col 48)",
        "(line 93,col 9)-(line 93,col 46)",
        "(line 94,col 9)-(line 94,col 51)",
        "(line 95,col 9)-(line 95,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testInvokeClosure()",
      "begin_line": 101,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 53)",
        "(line 104,col 9)-(line 104,col 60)",
        "(line 105,col 9)-(line 105,col 46)",
        "(line 106,col 9)-(line 106,col 40)",
        "(line 107,col 9)-(line 107,col 125)",
        "(line 108,col 9)-(line 108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testForClosure()",
      "begin_line": 114,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 66)",
        "(line 117,col 9)-(line 117,col 54)",
        "(line 118,col 9)-(line 118,col 35)",
        "(line 119,col 9)-(line 119,col 95)",
        "(line 120,col 9)-(line 120,col 96)",
        "(line 121,col 9)-(line 121,col 74)",
        "(line 122,col 9)-(line 122,col 74)",
        "(line 123,col 9)-(line 123,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testWhileClosure()",
      "begin_line": 129,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 60)",
        "(line 132,col 9)-(line 132,col 86)",
        "(line 133,col 9)-(line 133,col 35)",
        "(line 135,col 9)-(line 135,col 40)",
        "(line 136,col 9)-(line 136,col 87)",
        "(line 137,col 9)-(line 137,col 35)",
        "(line 139,col 9)-(line 142,col 50)",
        "(line 143,col 9)-(line 146,col 50)",
        "(line 147,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testDoWhileClosure()",
      "begin_line": 156,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 60)",
        "(line 159,col 9)-(line 159,col 88)",
        "(line 160,col 9)-(line 160,col 35)",
        "(line 162,col 9)-(line 162,col 40)",
        "(line 163,col 9)-(line 163,col 89)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 166,col 9)-(line 169,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testChainedClosure()",
      "begin_line": 175,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 58)",
        "(line 179,col 9)-(line 179,col 58)",
        "(line 180,col 9)-(line 180,col 56)",
        "(line 181,col 9)-(line 181,col 33)",
        "(line 182,col 9)-(line 182,col 33)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 185,col 38)",
        "(line 186,col 9)-(line 186,col 83)",
        "(line 187,col 9)-(line 187,col 33)",
        "(line 188,col 9)-(line 188,col 33)",
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 191,col 38)",
        "(line 192,col 9)-(line 192,col 76)",
        "(line 193,col 9)-(line 193,col 20)",
        "(line 194,col 9)-(line 194,col 20)",
        "(line 195,col 9)-(line 195,col 20)",
        "(line 196,col 9)-(line 196,col 64)",
        "(line 197,col 9)-(line 197,col 33)",
        "(line 198,col 9)-(line 198,col 33)",
        "(line 200,col 9)-(line 200,col 93)",
        "(line 201,col 9)-(line 201,col 119)",
        "(line 203,col 9)-(line 206,col 50)",
        "(line 207,col 9)-(line 210,col 50)",
        "(line 211,col 9)-(line 214,col 50)",
        "(line 215,col 9)-(line 218,col 50)",
        "(line 219,col 9)-(line 225,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testIfClosure()",
      "begin_line": 231,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 58)",
        "(line 234,col 9)-(line 234,col 37)",
        "(line 235,col 9)-(line 235,col 79)",
        "(line 236,col 9)-(line 236,col 33)",
        "(line 238,col 9)-(line 238,col 38)",
        "(line 239,col 9)-(line 239,col 89)",
        "(line 240,col 9)-(line 240,col 33)",
        "(line 242,col 9)-(line 242,col 38)",
        "(line 243,col 9)-(line 243,col 38)",
        "(line 244,col 9)-(line 244,col 90)",
        "(line 245,col 9)-(line 245,col 33)",
        "(line 246,col 9)-(line 246,col 33)",
        "(line 248,col 9)-(line 248,col 38)",
        "(line 249,col 9)-(line 249,col 38)",
        "(line 250,col 9)-(line 250,col 92)",
        "(line 251,col 9)-(line 251,col 33)",
        "(line 252,col 9)-(line 252,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSwitchClosure()",
      "begin_line": 258,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 64)",
        "(line 262,col 9)-(line 262,col 64)",
        "(line 263,col 9)-(line 265,col 52)",
        "(line 266,col 9)-(line 266,col 33)",
        "(line 267,col 9)-(line 267,col 33)",
        "(line 269,col 9)-(line 269,col 18)",
        "(line 270,col 9)-(line 270,col 18)",
        "(line 271,col 9)-(line 273,col 53)",
        "(line 274,col 9)-(line 274,col 33)",
        "(line 275,col 9)-(line 275,col 33)",
        "(line 277,col 9)-(line 277,col 18)",
        "(line 278,col 9)-(line 278,col 18)",
        "(line 279,col 9)-(line 279,col 64)",
        "(line 280,col 9)-(line 282,col 55)",
        "(line 283,col 9)-(line 283,col 33)",
        "(line 284,col 9)-(line 284,col 33)",
        "(line 285,col 9)-(line 285,col 33)",
        "(line 287,col 9)-(line 287,col 18)",
        "(line 288,col 9)-(line 288,col 18)",
        "(line 289,col 9)-(line 289,col 110)",
        "(line 290,col 9)-(line 290,col 59)",
        "(line 291,col 9)-(line 291,col 59)",
        "(line 292,col 9)-(line 292,col 62)",
        "(line 293,col 9)-(line 293,col 33)",
        "(line 294,col 9)-(line 294,col 33)",
        "(line 296,col 9)-(line 296,col 18)",
        "(line 297,col 9)-(line 297,col 18)",
        "(line 298,col 9)-(line 298,col 20)",
        "(line 299,col 9)-(line 299,col 59)",
        "(line 300,col 9)-(line 300,col 59)",
        "(line 301,col 9)-(line 301,col 57)",
        "(line 302,col 9)-(line 302,col 33)",
        "(line 303,col 9)-(line 303,col 33)",
        "(line 305,col 9)-(line 305,col 18)",
        "(line 306,col 9)-(line 306,col 18)",
        "(line 307,col 9)-(line 307,col 18)",
        "(line 308,col 9)-(line 308,col 20)",
        "(line 309,col 9)-(line 309,col 59)",
        "(line 310,col 9)-(line 310,col 59)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 312,col 9)-(line 312,col 56)",
        "(line 313,col 9)-(line 313,col 33)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 317,col 9)-(line 317,col 112)",
        "(line 318,col 9)-(line 318,col 129)",
        "(line 319,col 9)-(line 319,col 20)",
        "(line 320,col 9)-(line 320,col 28)",
        "(line 321,col 9)-(line 321,col 75)",
        "(line 323,col 9)-(line 326,col 50)",
        "(line 327,col 9)-(line 330,col 50)",
        "(line 331,col 9)-(line 334,col 50)",
        "(line 335,col 9)-(line 338,col 50)",
        "(line 339,col 9)-(line 344,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSwitchMapClosure()",
      "begin_line": 350,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 64)",
        "(line 353,col 9)-(line 353,col 64)",
        "(line 354,col 9)-(line 354,col 88)",
        "(line 355,col 9)-(line 355,col 28)",
        "(line 356,col 9)-(line 356,col 28)",
        "(line 357,col 9)-(line 357,col 57)",
        "(line 358,col 9)-(line 358,col 33)",
        "(line 359,col 9)-(line 359,col 33)",
        "(line 361,col 9)-(line 361,col 18)",
        "(line 362,col 9)-(line 362,col 18)",
        "(line 363,col 9)-(line 363,col 20)",
        "(line 364,col 9)-(line 364,col 28)",
        "(line 365,col 9)-(line 365,col 28)",
        "(line 366,col 9)-(line 366,col 60)",
        "(line 367,col 9)-(line 367,col 33)",
        "(line 368,col 9)-(line 368,col 33)",
        "(line 370,col 9)-(line 370,col 18)",
        "(line 371,col 9)-(line 371,col 18)",
        "(line 372,col 9)-(line 372,col 20)",
        "(line 373,col 9)-(line 373,col 64)",
        "(line 374,col 9)-(line 374,col 28)",
        "(line 375,col 9)-(line 375,col 28)",
        "(line 376,col 9)-(line 376,col 25)",
        "(line 377,col 9)-(line 377,col 59)",
        "(line 378,col 9)-(line 378,col 33)",
        "(line 379,col 9)-(line 379,col 33)",
        "(line 380,col 9)-(line 380,col 33)",
        "(line 382,col 9)-(line 382,col 113)",
        "(line 384,col 9)-(line 387,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testTransformerClosure()",
      "begin_line": 393,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 75)",
        "(line 396,col 9)-(line 396,col 69)",
        "(line 397,col 9)-(line 397,col 30)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 399,col 9)-(line 399,col 30)",
        "(line 400,col 9)-(line 400,col 36)",
        "(line 402,col 9)-(line 402,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ClosureUtilsTest.testSingletonPatternInSerialization()",
      "begin_line": 412,
      "end_line": 425,
      "comment": "\n     * Test that all Closure singletons hold singleton pattern in\n     * serialization/deserialization process.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 417,col 10)",
        "(line 419,col 9)-(line 424,col 9)"
      ]
    }
  ]
}