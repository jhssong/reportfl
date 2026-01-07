{
  "filepath": "/tmp/Math-105b/src/test/org/apache/commons/math/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 31,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vs"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServerTest.ValueServerTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.setUp()",
      "begin_line": 39,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 44)",
        "(line 41,col 9)-(line 46,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.suite()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 63)",
        "(line 51,col 9)-(line 51,col 43)",
        "(line 52,col 9)-(line 52,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigest()",
      "begin_line": 61,
      "end_line": 88,
      "comment": " \n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 26)",
        "(line 63,col 9)-(line 63,col 31)",
        "(line 64,col 9)-(line 64,col 33)",
        "(line 65,col 9)-(line 66,col 51)",
        "(line 67,col 9)-(line 67,col 66)",
        "(line 68,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 76)",
        "(line 73,col 9)-(line 75,col 23)",
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 48)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 76)",
        "(line 84,col 9)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 94,
      "end_line": 99,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 95,col 9)-(line 98,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testReplay()",
      "begin_line": 106,
      "end_line": 127,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e \n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 50)",
        "(line 108,col 9)-(line 108,col 52)",
        "(line 109,col 9)-(line 109,col 34)",
        "(line 110,col 9)-(line 110,col 35)",
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 29)",
        "(line 113,col 9)-(line 113,col 36)",
        "(line 114,col 9)-(line 114,col 60)",
        "(line 115,col 9)-(line 115,col 36)",
        "(line 116,col 9)-(line 116,col 61)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 36)",
        "(line 121,col 9)-(line 121,col 60)",
        "(line 122,col 9)-(line 122,col 36)",
        "(line 123,col 9)-(line 123,col 61)",
        "(line 124,col 9)-(line 124,col 29)",
        "(line 126,col 9)-(line 126,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testModes()",
      "begin_line": 132,
      "end_line": 155,
      "comment": " \n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 46)",
        "(line 134,col 9)-(line 134,col 20)",
        "(line 135,col 9)-(line 135,col 84)",
        "(line 136,col 9)-(line 136,col 45)",
        "(line 137,col 9)-(line 137,col 20)",
        "(line 138,col 9)-(line 138,col 34)",
        "(line 139,col 9)-(line 139,col 39)",
        "(line 140,col 9)-(line 140,col 23)",
        "(line 141,col 9)-(line 141,col 46)",
        "(line 142,col 9)-(line 142,col 27)",
        "(line 143,col 9)-(line 144,col 50)",
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 146,col 27)",
        "(line 147,col 9)-(line 147,col 28)",
        "(line 148,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFill()",
      "begin_line": 160,
      "end_line": 172,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 46)",
        "(line 162,col 9)-(line 162,col 20)",
        "(line 163,col 9)-(line 163,col 37)",
        "(line 164,col 9)-(line 164,col 21)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 33)",
        "(line 169,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testProperties()",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 46)",
        "(line 179,col 9)-(line 179,col 73)",
        "(line 180,col 9)-(line 180,col 53)",
        "(line 181,col 9)-(line 181,col 40)",
        "(line 182,col 9)-(line 182,col 82)"
      ]
    }
  ]
}