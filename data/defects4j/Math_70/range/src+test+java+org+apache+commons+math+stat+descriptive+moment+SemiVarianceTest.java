{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/stat/descriptive/moment/SemiVarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemiVarianceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 25,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testInsufficientData()",
      "begin_line": 27,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 32)",
        "(line 29,col 9)-(line 29,col 45)",
        "(line 30,col 9)-(line 34,col 9)",
        "(line 36,col 9)-(line 41,col 9)",
        "(line 42,col 9)-(line 42,col 34)",
        "(line 43,col 9)-(line 43,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testSingleDown()",
      "begin_line": 46,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 45)",
        "(line 48,col 9)-(line 48,col 36)",
        "(line 49,col 9)-(line 49,col 48)",
        "(line 50,col 9)-(line 50,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testSingleUp()",
      "begin_line": 53,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 73)",
        "(line 55,col 9)-(line 55,col 36)",
        "(line 56,col 9)-(line 56,col 48)",
        "(line 57,col 9)-(line 57,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testSample()",
      "begin_line": 60,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 94)",
        "(line 62,col 9)-(line 62,col 41)",
        "(line 63,col 9)-(line 63,col 51)",
        "(line 64,col 9)-(line 64,col 51)",
        "(line 65,col 9)-(line 65,col 64)",
        "(line 66,col 9)-(line 67,col 45)",
        "(line 69,col 9)-(line 69,col 62)",
        "(line 70,col 9)-(line 70,col 62)",
        "(line 71,col 9)-(line 72,col 43)",
        "(line 75,col 9)-(line 75,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testPopulation()",
      "begin_line": 78,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 88)",
        "(line 80,col 9)-(line 80,col 50)",
        "(line 82,col 9)-(line 82,col 48)",
        "(line 83,col 9)-(line 83,col 49)",
        "(line 85,col 9)-(line 85,col 62)",
        "(line 86,col 9)-(line 86,col 41)",
        "(line 87,col 9)-(line 87,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testNonMeanCutoffs()",
      "begin_line": 90,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 88)",
        "(line 92,col 9)-(line 92,col 50)",
        "(line 94,col 9)-(line 94,col 111)",
        "(line 95,col 9)-(line 96,col 35)",
        "(line 98,col 9)-(line 98,col 102)",
        "(line 99,col 9)-(line 100,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testVarianceDecompMeanCutoff()",
      "begin_line": 107,
      "end_line": 116,
      "comment": "\n     * Check that the lower + upper semivariance against the mean sum to the\n     * variance.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 88)",
        "(line 109,col 9)-(line 109,col 53)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 64)",
        "(line 112,col 9)-(line 112,col 49)",
        "(line 113,col 9)-(line 113,col 62)",
        "(line 114,col 9)-(line 114,col 49)",
        "(line 115,col 9)-(line 115,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testVarianceDecompNonMeanCutoff()",
      "begin_line": 123,
      "end_line": 133,
      "comment": "\n     * Check that upper and lower semivariances against a cutoff sum to the sum\n     * of squared deviations of the full set of values against the cutoff\n     * divided by df \u003d length - 1 (assuming bias-corrected).\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 88)",
        "(line 125,col 9)-(line 125,col 26)",
        "(line 126,col 9)-(line 126,col 74)",
        "(line 127,col 9)-(line 127,col 49)",
        "(line 128,col 9)-(line 128,col 64)",
        "(line 129,col 9)-(line 129,col 51)",
        "(line 130,col 9)-(line 130,col 62)",
        "(line 131,col 9)-(line 131,col 51)",
        "(line 132,col 9)-(line 132,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVarianceTest.testNoVariance()",
      "begin_line": 135,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 57)",
        "(line 137,col 9)-(line 137,col 45)",
        "(line 138,col 9)-(line 138,col 53)",
        "(line 139,col 9)-(line 139,col 59)",
        "(line 140,col 9)-(line 140,col 114)"
      ]
    }
  ]
}