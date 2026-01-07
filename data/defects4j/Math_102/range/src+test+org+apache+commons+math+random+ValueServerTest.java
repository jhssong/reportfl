{
  "filepath": "/tmp/Math-102b/src/test/org/apache/commons/math/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 32,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vs"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.ValueServerTest.ValueServerTest(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.setUp()",
      "begin_line": 40,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 44)",
        "(line 42,col 9)-(line 47,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.suite()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 63)",
        "(line 52,col 9)-(line 52,col 43)",
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigest()",
      "begin_line": 62,
      "end_line": 89,
      "comment": " \n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 26)",
        "(line 64,col 9)-(line 64,col 31)",
        "(line 65,col 9)-(line 65,col 33)",
        "(line 66,col 9)-(line 67,col 51)",
        "(line 68,col 9)-(line 68,col 66)",
        "(line 69,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 76)",
        "(line 74,col 9)-(line 76,col 23)",
        "(line 78,col 9)-(line 78,col 36)",
        "(line 79,col 9)-(line 79,col 48)",
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 76)",
        "(line 85,col 9)-(line 87,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 96,col 9)-(line 99,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testReplay()",
      "begin_line": 107,
      "end_line": 128,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e \n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)",
        "(line 109,col 9)-(line 109,col 52)",
        "(line 110,col 9)-(line 110,col 34)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 29)",
        "(line 114,col 9)-(line 114,col 36)",
        "(line 115,col 9)-(line 115,col 60)",
        "(line 116,col 9)-(line 116,col 36)",
        "(line 117,col 9)-(line 117,col 61)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 60)",
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 124,col 61)",
        "(line 125,col 9)-(line 125,col 29)",
        "(line 127,col 9)-(line 127,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testModes()",
      "begin_line": 133,
      "end_line": 156,
      "comment": " \n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 46)",
        "(line 135,col 9)-(line 135,col 20)",
        "(line 136,col 9)-(line 136,col 84)",
        "(line 137,col 9)-(line 137,col 45)",
        "(line 138,col 9)-(line 138,col 20)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 140,col 39)",
        "(line 141,col 9)-(line 141,col 23)",
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 143,col 27)",
        "(line 144,col 9)-(line 145,col 50)",
        "(line 146,col 9)-(line 146,col 49)",
        "(line 147,col 9)-(line 147,col 27)",
        "(line 148,col 9)-(line 148,col 28)",
        "(line 149,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFill()",
      "begin_line": 161,
      "end_line": 173,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 46)",
        "(line 163,col 9)-(line 163,col 20)",
        "(line 164,col 9)-(line 164,col 37)",
        "(line 165,col 9)-(line 165,col 21)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 33)",
        "(line 170,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testProperties()",
      "begin_line": 178,
      "end_line": 184,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 180,col 73)",
        "(line 181,col 9)-(line 181,col 53)",
        "(line 182,col 9)-(line 182,col 40)",
        "(line 183,col 9)-(line 183,col 82)"
      ]
    }
  ]
}