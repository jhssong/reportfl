{
  "filepath": "/tmp/Math-58b/src/test/java/org/apache/commons/math/stat/descriptive/moment/SemiVarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemiVarianceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 26,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testInsufficientData()",
      "begin_line": 28,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 32)",
        "(line 30,col 9)-(line 30,col 45)",
        "(line 31,col 9)-(line 35,col 9)",
        "(line 37,col 9)-(line 42,col 9)",
        "(line 43,col 9)-(line 43,col 34)",
        "(line 44,col 9)-(line 44,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testSingleDown()",
      "begin_line": 47,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 45)",
        "(line 49,col 9)-(line 49,col 36)",
        "(line 50,col 9)-(line 50,col 48)",
        "(line 51,col 9)-(line 51,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testSingleUp()",
      "begin_line": 54,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 73)",
        "(line 56,col 9)-(line 56,col 36)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testSample()",
      "begin_line": 61,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 94)",
        "(line 63,col 9)-(line 63,col 41)",
        "(line 64,col 9)-(line 64,col 51)",
        "(line 65,col 9)-(line 65,col 51)",
        "(line 66,col 9)-(line 66,col 64)",
        "(line 67,col 9)-(line 68,col 45)",
        "(line 70,col 9)-(line 70,col 62)",
        "(line 71,col 9)-(line 71,col 62)",
        "(line 72,col 9)-(line 73,col 43)",
        "(line 76,col 9)-(line 76,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testPopulation()",
      "begin_line": 79,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 88)",
        "(line 81,col 9)-(line 81,col 50)",
        "(line 83,col 9)-(line 83,col 48)",
        "(line 84,col 9)-(line 84,col 49)",
        "(line 86,col 9)-(line 86,col 62)",
        "(line 87,col 9)-(line 87,col 41)",
        "(line 88,col 9)-(line 88,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testNonMeanCutoffs()",
      "begin_line": 91,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 88)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 95,col 9)-(line 95,col 111)",
        "(line 96,col 9)-(line 97,col 35)",
        "(line 99,col 9)-(line 99,col 102)",
        "(line 100,col 9)-(line 101,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testVarianceDecompMeanCutoff()",
      "begin_line": 108,
      "end_line": 117,
      "comment": "\n     * Check that the lower + upper semivariance against the mean sum to the\n     * variance.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 88)",
        "(line 110,col 9)-(line 110,col 53)",
        "(line 111,col 9)-(line 111,col 49)",
        "(line 112,col 9)-(line 112,col 64)",
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 62)",
        "(line 115,col 9)-(line 115,col 49)",
        "(line 116,col 9)-(line 116,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testVarianceDecompNonMeanCutoff()",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\n     * Check that upper and lower semivariances against a cutoff sum to the sum\n     * of squared deviations of the full set of values against the cutoff\n     * divided by df \u003d length - 1 (assuming bias-corrected).\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 88)",
        "(line 126,col 9)-(line 126,col 26)",
        "(line 127,col 9)-(line 127,col 74)",
        "(line 128,col 9)-(line 128,col 49)",
        "(line 129,col 9)-(line 129,col 64)",
        "(line 130,col 9)-(line 130,col 51)",
        "(line 131,col 9)-(line 131,col 62)",
        "(line 132,col 9)-(line 132,col 51)",
        "(line 133,col 9)-(line 133,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testNoVariance()",
      "begin_line": 136,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 57)",
        "(line 138,col 9)-(line 138,col 45)",
        "(line 139,col 9)-(line 139,col 53)",
        "(line 140,col 9)-(line 140,col 59)",
        "(line 141,col 9)-(line 141,col 114)"
      ]
    }
  ]
}