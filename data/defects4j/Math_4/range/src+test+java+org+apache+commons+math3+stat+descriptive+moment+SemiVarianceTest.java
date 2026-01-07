{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/descriptive/moment/SemiVarianceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemiVarianceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testInsufficientData()",
      "begin_line": 29,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 32)",
        "(line 32,col 9)-(line 32,col 45)",
        "(line 33,col 9)-(line 37,col 9)",
        "(line 39,col 9)-(line 44,col 9)",
        "(line 45,col 9)-(line 45,col 34)",
        "(line 46,col 9)-(line 46,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testSingleDown()",
      "begin_line": 49,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 45)",
        "(line 52,col 9)-(line 52,col 36)",
        "(line 53,col 9)-(line 53,col 48)",
        "(line 54,col 9)-(line 54,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testSingleUp()",
      "begin_line": 57,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 73)",
        "(line 60,col 9)-(line 60,col 36)",
        "(line 61,col 9)-(line 61,col 48)",
        "(line 62,col 9)-(line 62,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testSample()",
      "begin_line": 65,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 94)",
        "(line 68,col 9)-(line 68,col 41)",
        "(line 69,col 9)-(line 69,col 51)",
        "(line 70,col 9)-(line 70,col 51)",
        "(line 71,col 9)-(line 71,col 64)",
        "(line 72,col 9)-(line 73,col 45)",
        "(line 75,col 9)-(line 75,col 62)",
        "(line 76,col 9)-(line 76,col 62)",
        "(line 77,col 9)-(line 78,col 43)",
        "(line 81,col 9)-(line 81,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testPopulation()",
      "begin_line": 84,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 88)",
        "(line 87,col 9)-(line 87,col 50)",
        "(line 89,col 9)-(line 89,col 48)",
        "(line 90,col 9)-(line 90,col 56)",
        "(line 92,col 9)-(line 92,col 62)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testNonMeanCutoffs()",
      "begin_line": 97,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 88)",
        "(line 100,col 9)-(line 100,col 50)",
        "(line 102,col 9)-(line 102,col 111)",
        "(line 103,col 9)-(line 104,col 35)",
        "(line 106,col 9)-(line 106,col 102)",
        "(line 107,col 9)-(line 108,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testVarianceDecompMeanCutoff()",
      "begin_line": 115,
      "end_line": 125,
      "comment": "\n     * Check that the lower + upper semivariance against the mean sum to the\n     * variance.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 88)",
        "(line 118,col 9)-(line 118,col 53)",
        "(line 119,col 9)-(line 119,col 49)",
        "(line 120,col 9)-(line 120,col 64)",
        "(line 121,col 9)-(line 121,col 49)",
        "(line 122,col 9)-(line 122,col 62)",
        "(line 123,col 9)-(line 123,col 49)",
        "(line 124,col 9)-(line 124,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testVarianceDecompNonMeanCutoff()",
      "begin_line": 132,
      "end_line": 143,
      "comment": "\n     * Check that upper and lower semivariances against a cutoff sum to the sum\n     * of squared deviations of the full set of values against the cutoff\n     * divided by df \u003d length - 1 (assuming bias-corrected).\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 88)",
        "(line 135,col 9)-(line 135,col 26)",
        "(line 136,col 9)-(line 136,col 74)",
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 138,col 64)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 140,col 62)",
        "(line 141,col 9)-(line 141,col 51)",
        "(line 142,col 9)-(line 142,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVarianceTest.testNoVariance()",
      "begin_line": 145,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 57)",
        "(line 148,col 9)-(line 148,col 45)",
        "(line 149,col 9)-(line 149,col 60)",
        "(line 150,col 9)-(line 150,col 66)",
        "(line 151,col 9)-(line 151,col 121)"
      ]
    }
  ]
}