{
  "filepath": "/tmp/Lang-47b/src/test/org/apache/commons/lang/math/RandomUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.RandomUtilsTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.setUp()",
      "begin_line": 38,
      "end_line": 39,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.suite()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 63)",
        "(line 43,col 9)-(line 43,col 43)",
        "(line 44,col 9)-(line 44,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextInt()",
      "begin_line": 48,
      "end_line": 52,
      "comment": " test distribution of nextInt() ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 25)",
        "(line 51,col 9)-(line 51,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextInt2()",
      "begin_line": 55,
      "end_line": 59,
      "comment": " test distribution of nextInt(Random) ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 34)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testJvmRandomNextInt()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " test distribution of JVMRandom.nextInt() ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextInt(java.util.Random)",
      "begin_line": 73,
      "end_line": 106,
      "comment": " \n     * Generate 1000 values for nextInt(bound) and compare\n     * the observed frequency counts to expected counts using\n     * a chi-square test.\n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 22)",
        "(line 75,col 9)-(line 75,col 23)",
        "(line 77,col 9)-(line 77,col 34)",
        "(line 78,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 60)",
        "(line 84,col 9)-(line 84,col 54)",
        "(line 87,col 9)-(line 87,col 18)",
        "(line 88,col 9)-(line 88,col 53)",
        "(line 89,col 9)-(line 89,col 45)",
        "(line 90,col 9)-(line 99,col 9)",
        "(line 103,col 9)-(line 105,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextLong()",
      "begin_line": 109,
      "end_line": 111,
      "comment": " test distribution of nextLong() ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextLong2()",
      "begin_line": 116,
      "end_line": 120,
      "comment": " test distribution of nextLong(Random) BROKEN\n     *  contract of nextLong(Random) is different from\n     * nextLong() ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 118,col 48)",
        "(line 119,col 9)-(line 119,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextLong(java.util.Random)",
      "begin_line": 128,
      "end_line": 151,
      "comment": " \n     * Generate 1000 values for nextLong and check that\n     * p(value \u003c long.MAXVALUE/2) ~ 0.5. Use chi-square test\n     * with df \u003d 2-1 \u003d 1  \n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 45)",
        "(line 130,col 9)-(line 130,col 41)",
        "(line 131,col 9)-(line 131,col 24)",
        "(line 132,col 9)-(line 132,col 41)",
        "(line 133,col 9)-(line 144,col 9)",
        "(line 148,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextBoolean()",
      "begin_line": 155,
      "end_line": 157,
      "comment": " test distribution of nextBoolean() ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextBoolean2()",
      "begin_line": 160,
      "end_line": 164,
      "comment": " test distribution of nextBoolean(Random) ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 48)",
        "(line 163,col 9)-(line 163,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextBoolean(java.util.Random)",
      "begin_line": 172,
      "end_line": 194,
      "comment": " \n     * Generate 1000 values for nextBoolean and check that\n     * p(value \u003d false) ~ 0.5. Use chi-square test\n     * with df \u003d 2-1 \u003d 1  \n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 45)",
        "(line 174,col 9)-(line 174,col 41)",
        "(line 175,col 9)-(line 175,col 31)",
        "(line 176,col 9)-(line 187,col 9)",
        "(line 191,col 9)-(line 193,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextFloat()",
      "begin_line": 197,
      "end_line": 199,
      "comment": " test distribution of nextFloat() ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextFloat2()",
      "begin_line": 202,
      "end_line": 206,
      "comment": " test distribution of nextFloat(Random) ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 34)",
        "(line 204,col 9)-(line 204,col 48)",
        "(line 205,col 9)-(line 205,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextFloat(java.util.Random)",
      "begin_line": 214,
      "end_line": 236,
      "comment": " \n     * Generate 1000 values for nextFloat and check that\n     * p(value \u003c 0.5) ~ 0.5. Use chi-square test\n     * with df \u003d 2-1 \u003d 1  \n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 45)",
        "(line 216,col 9)-(line 216,col 41)",
        "(line 217,col 9)-(line 217,col 25)",
        "(line 218,col 9)-(line 229,col 9)",
        "(line 233,col 9)-(line 235,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextDouble()",
      "begin_line": 239,
      "end_line": 241,
      "comment": " test distribution of nextDouble() ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testNextDouble2()",
      "begin_line": 244,
      "end_line": 248,
      "comment": " test distribution of nextDouble(Random) ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 34)",
        "(line 246,col 9)-(line 246,col 48)",
        "(line 247,col 9)-(line 247,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.tstNextDouble(java.util.Random)",
      "begin_line": 256,
      "end_line": 278,
      "comment": " \n     * Generate 1000 values for nextFloat and check that\n     * p(value \u003c 0.5) ~ 0.5. Use chi-square test\n     * with df \u003d 2-1 \u003d 1  \n     * @param rnd Random to use if not null\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 45)",
        "(line 258,col 9)-(line 258,col 41)",
        "(line 259,col 9)-(line 259,col 26)",
        "(line 260,col 9)-(line 271,col 9)",
        "(line 275,col 9)-(line 277,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testUnimplementedMethods()",
      "begin_line": 281,
      "end_line": 304,
      "comment": " make sure that unimplemented methods fail ",
      "child_ranges": [
        "(line 283,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.testIllegalArguments()",
      "begin_line": 307,
      "end_line": 323,
      "comment": " make sure that illegal arguments fail ",
      "child_ranges": [
        "(line 309,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.RandomUtilsTest.chiSquare(int[], int[])",
      "begin_line": 330,
      "end_line": 338,
      "comment": "\n     * Computes Chi-Square statistic given observed and expected counts\n     * @param observed array of observed frequency counts\n     * @param expected array of expected frequency counts\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 28)",
        "(line 332,col 9)-(line 332,col 26)",
        "(line 333,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 21)"
      ]
    }
  ]
}