{
  "filepath": "/tmp/Math-48b/src/test/java/org/apache/commons/math/random/ValueServerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueServerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 240,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vs"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.setUp()",
      "begin_line": 41,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 44)",
        "(line 44,col 9)-(line 44,col 57)",
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigest()",
      "begin_line": 53,
      "end_line": 78,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 26)",
        "(line 56,col 9)-(line 56,col 31)",
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 59,col 51)",
        "(line 60,col 9)-(line 60,col 58)",
        "(line 61,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 83)",
        "(line 66,col 9)-(line 67,col 23)",
        "(line 69,col 9)-(line 69,col 36)",
        "(line 70,col 9)-(line 70,col 40)",
        "(line 71,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 83)",
        "(line 76,col 9)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFixedSeed()",
      "begin_line": 84,
      "end_line": 94,
      "comment": "\n     * Verify that when provided with fixed seeds, stochastic modes\n     * generate fixed sequences.  Verifies the fix for MATH-654.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 57)",
        "(line 88,col 9)-(line 88,col 42)",
        "(line 89,col 9)-(line 89,col 42)",
        "(line 90,col 9)-(line 90,col 61)",
        "(line 91,col 9)-(line 91,col 66)",
        "(line 92,col 9)-(line 92,col 63)",
        "(line 93,col 9)-(line 93,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.checkFixedSeed(org.apache.commons.math.random.ValueServer, int)",
      "begin_line": 100,
      "end_line": 112,
      "comment": "\n     * Do the check for {@link #testFixedSeed()}\n     * @param mode ValueServer mode\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 33)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 103,col 9)-(line 103,col 47)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testNextDigestFail()",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n      ",
      "child_ranges": [
        "(line 120,col 9)-(line 123,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyReplayFile()",
      "begin_line": 126,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testEmptyDigestFile()",
      "begin_line": 139,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testReplay()",
      "begin_line": 157,
      "end_line": 179,
      "comment": "\n     * Test ValueServer REPLAY_MODE using values in testData file.\u003cbr\u003e\n     * Check that the values 1,2,1001,1002 match data file values 1 and 2.\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 50)",
        "(line 160,col 9)-(line 160,col 52)",
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 163,col 44)",
        "(line 164,col 9)-(line 164,col 29)",
        "(line 165,col 9)-(line 165,col 36)",
        "(line 166,col 9)-(line 166,col 67)",
        "(line 167,col 9)-(line 167,col 36)",
        "(line 168,col 9)-(line 168,col 68)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 36)",
        "(line 173,col 9)-(line 173,col 67)",
        "(line 174,col 9)-(line 174,col 36)",
        "(line 175,col 9)-(line 175,col 68)",
        "(line 176,col 9)-(line 176,col 29)",
        "(line 178,col 9)-(line 178,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testModes()",
      "begin_line": 184,
      "end_line": 208,
      "comment": "\n     * Test other ValueServer modes\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 46)",
        "(line 187,col 9)-(line 187,col 20)",
        "(line 188,col 9)-(line 188,col 91)",
        "(line 189,col 9)-(line 189,col 45)",
        "(line 190,col 9)-(line 190,col 20)",
        "(line 191,col 9)-(line 191,col 34)",
        "(line 192,col 9)-(line 192,col 46)",
        "(line 193,col 9)-(line 193,col 23)",
        "(line 194,col 9)-(line 194,col 46)",
        "(line 195,col 9)-(line 195,col 27)",
        "(line 196,col 9)-(line 197,col 50)",
        "(line 198,col 9)-(line 198,col 49)",
        "(line 199,col 9)-(line 199,col 27)",
        "(line 200,col 9)-(line 200,col 35)",
        "(line 201,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testFill()",
      "begin_line": 213,
      "end_line": 226,
      "comment": "\n     * Test fill\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 46)",
        "(line 216,col 9)-(line 216,col 20)",
        "(line 217,col 9)-(line 217,col 37)",
        "(line 218,col 9)-(line 218,col 21)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 33)",
        "(line 223,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.ValueServerTest.testProperties()",
      "begin_line": 231,
      "end_line": 238,
      "comment": "\n     * Test getters to make Clover happy\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 46)",
        "(line 234,col 9)-(line 234,col 80)",
        "(line 235,col 9)-(line 235,col 53)",
        "(line 236,col 9)-(line 236,col 40)",
        "(line 237,col 9)-(line 237,col 89)"
      ]
    }
  ]
}